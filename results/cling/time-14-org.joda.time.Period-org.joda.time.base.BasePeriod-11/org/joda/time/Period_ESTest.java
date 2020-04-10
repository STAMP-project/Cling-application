/*

 * Tue Mar 03 17:22:03 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.years(0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 793);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period();
      period0.plusMonths(0);
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period();
      period0.minusMonths(29);
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      period0.plusMinutes(0);
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, yearMonth0, periodType0);
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
  public void test07()  throws Throwable  {
      Instant instant0 = Instant.now();
      Period period0 = new Period(instant0, instant0);
      assertEquals(1583256102247L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
      
      MonthDay monthDay0 = new MonthDay();
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      period0.plusYears(0);
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      period0.plusYears(2257);
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period();
      period0.minusHours(0);
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.days(1196);
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = mutablePeriod0.toPeriod();
      Period period1 = period0.withYears(1196);
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 1844);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      period0.minusHours(2257);
      LocalDate localDate0 = new LocalDate(2880L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1000L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.plusSeconds(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.days(64);
      Period period1 = period0.plusMillis(0);
      assertSame(period1, period0);
      
      MonthDay monthDay0 = MonthDay.now();
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusMillis(2396);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.days(64);
      period0.minus((ReadablePeriod) null);
      MonthDay monthDay0 = MonthDay.now();
      Period period1 = new Period(monthDay0, monthDay0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      Period period0 = new Period();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0);
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
        period0.withField(durationFieldType0, 531);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
