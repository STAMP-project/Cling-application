/*

 * Tue Mar 03 16:56:37 GMT 2020
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      String string0 = copticChronology0.toString();
      assertEquals("CopticChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getDaysInYear(1342312);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekOfWeekyear(1, 28265625);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      long long0 = islamicChronology0.getYearDifference(0L, 30);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.setYear((-4294967296L), 15271875);
      assertEquals(467540741285832704L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekOfWeekyear(26, 26);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekyear(4636L);
      assertEquals(1389, int0);
  }
}
