/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 01:54:05 GMT 2019
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
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(21);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      IslamicChronology islamicChronology1 = new IslamicChronology(islamicChronology0, "*-pg", islamicChronology0.LEAP_YEAR_15_BASED);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getMonthOfYear((-8L), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147483648 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getMonthOfYear(1, Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 2147483647 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getMonthOfYear(14977612800000L);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMax(1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(21);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      int int0 = islamicChronology0.getDaysInMonthMax(12);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(250);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYearMonth(27, 1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMax(5097600000L);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMax((-1310860800000L));
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYear(10000);
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYear(1);
      assertEquals(354, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDayOfMonth(14977612800000L);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDayOfMonth(1);
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getYearMonthMillis(468, 468);
      assertEquals((-27033004800000L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getYearDifference(1, (-1310860800000L));
      assertEquals(42L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getYearDifference(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.setYear(14977612800000L, 1);
      assertEquals((-42491088000000L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.setYear(14977612800000L, 3125);
      assertEquals(53157340800000L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInYearMax();
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getMinYear();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(21260793600000L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15308640144L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(555, 555);
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, object0, islamicChronology_LeapYearPatternType0);
      long long0 = islamicChronology0.setYear(555, 555);
      assertEquals((-25534915199445L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Chronology chronology0 = islamicChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      islamicChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax();
      assertEquals(30, int0);
  }
}
