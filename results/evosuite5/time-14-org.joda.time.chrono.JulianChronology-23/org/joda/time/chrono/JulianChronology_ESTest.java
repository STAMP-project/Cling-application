/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 00:52:02 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class JulianChronology_ESTest extends JulianChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getDaysInYear((-2128));
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getDaysInYear((-1434));
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(569);
      Chronology chronology0 = julianChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      try { 
        julianChronology0.getDateMidnightMillis(0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = JulianChronology.adjustYearForSet(4);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15778800000L, long0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      try { 
        julianChronology0.getDateMidnightMillis((-796), (-796), (-796));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -796 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(31083663600000L, long0);
  }
}
