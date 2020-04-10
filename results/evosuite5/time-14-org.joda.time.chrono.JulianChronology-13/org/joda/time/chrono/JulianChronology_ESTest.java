/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:40:33 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class JulianChronology_ESTest extends JulianChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = julianChronology0.withZone(fixedDateTimeZone0);
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet((-2106));
      assertEquals((-2105), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      try { 
        julianChronology0.getDateMidnightMillis(0, 12, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getMonthOfYear(1114L);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.getDateMidnightMillis(3, 3, 3);
      assertEquals((-62067427200000L), long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      long long0 = julianChronology0.getAverageMillisPerYear();
      assertEquals(31557600000L, long0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = julianChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, julianChronology0);
  }
}
