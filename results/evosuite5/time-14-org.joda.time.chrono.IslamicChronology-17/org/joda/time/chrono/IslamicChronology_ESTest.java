/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:45:02 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.setYear(9223372036854775807L, (-4252));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getMonthOfYear(138L, 317351877);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 317351877 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMax(1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(12);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMax(4);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYearMonth(1, 1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMaxForSet(5097600000L, 22);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMaxForSet(7813152000000L, 1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYear(29);
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYear(1);
      assertEquals(354, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDayOfMonth(7813152000000L);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDayOfMonth(7843737600000L);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getYearMonthMillis(56, 56);
      assertEquals((-40697424000000L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getYearDifference(1, 30L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getYearDifference(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.setYear(7813152000000L, 51);
      assertEquals((-40960166400000L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.setYear(29, 355);
      assertEquals((-31658255999971L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      IslamicChronology islamicChronology1 = (IslamicChronology)islamicChronology0.withZone((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(7, 7);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      IslamicChronology islamicChronology1 = new IslamicChronology(islamicChronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology1.getMonthOfYear(2382L);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(gregorianChronology0, fixedDateTimeZone0, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology0.getDaysInYearMax();
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getMinYear();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(21260793600000L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15308640144L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, (Object) null, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      islamicChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.setYear(7813152000000L, 1645);
      assertEquals(7843737600000L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMax();
      assertEquals(30, int0);
  }
}
