/*

 * Tue Mar 03 17:22:24 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ONE;
      Period period0 = days0.toPeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 2981);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period(localDateTime0, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      LocalDate localDate0 = monthDay0.toLocalDate((-543));
      Period period0 = null;
      try {
        period0 = new Period(localDate0, monthDay0, (PeriodType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths(1127);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period1 = period0.ZERO.plusMinutes(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = new Period(dateTime0, dateTime0, periodType0);
      assertEquals(1583256124535L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusYears((-1452));
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
      Period period1 = period0.minusSeconds(0);
      MonthDay monthDay0 = new MonthDay();
      Period period2 = new Period(monthDay0, monthDay0, (PeriodType) null);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.seconds(16);
      MonthDay monthDay0 = MonthDay.now();
      Period period1 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period2 = period0.negated();
      assertFalse(period2.equals((Object)period0));
      assertNotSame(period2, period0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period1 = period0.multipliedBy(0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.months(0);
      MonthDay monthDay0 = MonthDay.now();
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
      
      Period period2 = new Period(monthDay0, monthDay0, (PeriodType) null);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withField(durationFieldType0, (-887));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.minusHours((-1985));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period1 = period0.ZERO.minusSeconds(1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period1 = period0.plusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.hours((-5));
      MonthDay monthDay0 = new MonthDay();
      Period period1 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period2 = period0.minusMillis((-5));
      assertFalse(period0.equals((Object)period1));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.months(0);
      MonthDay monthDay0 = MonthDay.now();
      Period period1 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period2 = period0.minus(period0);
      assertTrue(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.ZERO;
      PeriodType periodType0 = PeriodType.time();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period1 = period0.plusMinutes(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 12740625);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
