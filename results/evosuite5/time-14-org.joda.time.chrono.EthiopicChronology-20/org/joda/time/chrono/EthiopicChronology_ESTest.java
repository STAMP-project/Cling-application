/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:41:39 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EthiopicChronology_ESTest extends EthiopicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-61894108800000L), long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Chronology chronology0 = ethiopicChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, ethiopicChronology0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Chronology chronology0 = ethiopicChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, ethiopicChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getDayOfMonth(1);
      assertEquals(23, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      long long0 = ethiopicChronology0.getDateMidnightMillis(1, 1, 1);
      assertEquals((-61894108800000L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, EthiopicChronology.EE);
  }
}
