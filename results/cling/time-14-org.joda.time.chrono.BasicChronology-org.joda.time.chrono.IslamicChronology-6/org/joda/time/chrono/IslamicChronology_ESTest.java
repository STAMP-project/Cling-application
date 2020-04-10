/*

 * Tue Mar 03 16:55:30 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      String string0 = copticChronology0.toString();
      assertEquals("CopticChronology[Europe/Amsterdam,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      String string0 = copticChronology0.toString();
      assertEquals("CopticChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getDaysInYear((-2139948616));
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInYear(10);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.setYear(1, 1134);
      assertEquals((-7807449599999L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekOfWeekyear((-1966L), 2247);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekOfWeekyear(1, (-292269337));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, "Pacific/Honolulu", 1);
      int int0 = julianChronology0.getWeekyear((-7825680000000L));
      assertEquals(1721, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekyear(30);
      assertEquals(1389, int0);
  }
}
