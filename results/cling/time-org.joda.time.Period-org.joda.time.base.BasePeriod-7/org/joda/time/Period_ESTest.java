/*

 * Tue Mar 03 17:21:26 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = weeks0.toStandardSeconds();
      PeriodType periodType0 = seconds0.getPeriodType();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
      LocalDate localDate0 = monthDay0.toLocalDate((-1813));
      PeriodType periodType0 = PeriodType.days();
      Period period0 = null;
      try {
        period0 = new Period(localDate0, monthDay0, periodType0);
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
      Period period0 = new Period();
      Period period1 = period0.minusMonths(4);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ZERO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Period period0 = days0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) (-2228));
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
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
  public void test09()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      Period period0 = new Period(dateMidnight0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusYears(796);
      PeriodType periodType0 = PeriodType.years();
      Period period2 = period1.normalizedStandard(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = weeks0.toStandardSeconds();
      PeriodType periodType0 = seconds0.getPeriodType();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period1 = period0.multipliedBy(0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(60L, (Chronology) null);
      Period period0 = new Period(yearMonth0, yearMonth0, (PeriodType) null);
      Period period1 = period0.ZERO.multipliedBy(256);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.SEVEN;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      Period period1 = period0.withField(durationFieldType0, 1740);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-591L), (Chronology) null);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Minutes minutes0 = Minutes.ONE;
      Days days0 = minutes0.toStandardDays();
      PeriodType periodType0 = days0.getPeriodType();
      Period period0 = null;
      try {
        period0 = new Period(localDate0, localDateTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(60L, (Chronology) null);
      Period period0 = new Period(yearMonth0, yearMonth0, (PeriodType) null);
      Period period1 = period0.minusHours(116);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0, (PeriodType) null);
      Period period1 = period0.plusSeconds(2517);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) (-2228));
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      // Undeclared exception!
      try { 
        period0.minusMillis((-2228));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minus((ReadablePeriod) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LimitChronology limitChronology0 = LimitChronology.getInstance(copticChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      MonthDay monthDay0 = MonthDay.now((Chronology) limitChronology0);
      PeriodType periodType0 = PeriodType.minutes();
      Period period1 = new Period(monthDay0, monthDay0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) (-2228));
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(60L, (Chronology) null);
      Period period0 = new Period(yearMonth0, yearMonth0, (PeriodType) null);
      Period period1 = period0.minusMinutes(9);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 583);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
