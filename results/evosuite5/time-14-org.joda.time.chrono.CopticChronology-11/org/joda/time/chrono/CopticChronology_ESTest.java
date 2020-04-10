/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:58:34 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null, 1);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      CopticChronology copticChronology1 = (CopticChronology)copticChronology0.withUTC();
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.getYearDifference(1, 1);
      assertEquals(0L, long0);
  }
}
