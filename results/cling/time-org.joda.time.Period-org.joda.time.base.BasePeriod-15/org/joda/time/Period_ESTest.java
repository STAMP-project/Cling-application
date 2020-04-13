/*

 * Tue Mar 03 17:23:21 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 8);
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
      Months months0 = Months.MIN_VALUE;
      PeriodType periodType0 = months0.getPeriodType();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      LocalDate localDate0 = LocalDate.now();
      Partial partial0 = new Partial();
      Period period0 = null;
      try {
        period0 = new Period(localDate0, partial0, periodType0);
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
      Period period0 = Period.ZERO;
      Minutes minutes0 = Minutes.minutes(0);
      Weeks weeks0 = minutes0.toStandardWeeks();
      PeriodType periodType0 = weeks0.getPeriodType();
      period0.minusMonths(0);
      LocalDate localDate0 = new LocalDate();
      Date date0 = localDate0.toDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localDate0, periodType0);
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
      Minutes minutes0 = Minutes.minutes(0);
      Weeks weeks0 = minutes0.toStandardWeeks();
      PeriodType periodType0 = weeks0.getPeriodType();
      period0.minusMonths((-583));
      LocalDate localDate0 = LocalDate.now();
      Date date0 = localDate0.toDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localDate0, periodType0);
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
      Minutes minutes0 = Minutes.THREE;
      Weeks weeks0 = minutes0.toStandardWeeks();
      MutablePeriod mutablePeriod0 = weeks0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Instant instant0 = new Instant(975L);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period0 = new Period(instant0, instant0, periodType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
      PeriodType periodType0 = PeriodType.weeks();
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Period period1 = null;
      try {
        period1 = new Period(localDate0, localDateTime0, periodType0);
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
      Period period0 = Period.ZERO;
      Period period1 = period0.minusYears(317351877);
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.minutes(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.plusSeconds((-1879));
      assertTrue(period0.equals((Object)period1));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.millis((-13));
      MonthDay monthDay0 = MonthDay.now();
      Period period1 = new Period(monthDay0, monthDay0, (PeriodType) null);
      Period period2 = period0.negated();
      assertFalse(period2.equals((Object)period1));
      assertNotSame(period2, period0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.plusYears(0);
      Minutes minutes0 = Minutes.minutes(0);
      Weeks weeks0 = minutes0.toStandardWeeks();
      PeriodType periodType0 = weeks0.getPeriodType();
      LocalDate localDate0 = LocalDate.now();
      Date date0 = localDate0.toDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period1 = null;
      try {
        period1 = new Period(localDateTime0, localDate0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.plusYears(31);
      PeriodType periodType0 = PeriodType.standard();
      LocalDate localDate0 = LocalDate.now();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 3, 0);
      Date date0 = gregorianCalendar0.getTime();
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
      Period period1 = null;
      try {
        period1 = new Period(localDate0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
      
      MonthDay monthDay0 = new MonthDay();
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.minutes((-410));
      Period period1 = period0.minusHours((-1262));
      assertNotSame(period1, period0);
      
      MonthDay monthDay0 = MonthDay.now();
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Months months0 = Months.MIN_VALUE;
      MutablePeriod mutablePeriod0 = months0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      Period period1 = period0.withField(durationFieldType0, 614);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.minutes((-410));
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
      
      MonthDay monthDay0 = MonthDay.now();
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusMillis(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.minutes((-1262));
      period0.minus((ReadablePeriod) null);
      MonthDay monthDay0 = MonthDay.now();
      Period period1 = new Period(monthDay0, monthDay0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay();
      Period period1 = period0.minus(period0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.ZERO;
      Minutes minutes0 = Minutes.minutes(0);
      Weeks weeks0 = minutes0.toStandardWeeks();
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.minusMinutes(1038);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
      assertTrue(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 1189);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
