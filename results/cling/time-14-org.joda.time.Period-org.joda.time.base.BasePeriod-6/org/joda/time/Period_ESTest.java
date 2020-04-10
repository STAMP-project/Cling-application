/*

 * Tue Mar 03 17:21:32 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, (-3698));
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
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-2044), 8, (-3811), 5337, (-2767));
      MonthDay monthDay0 = MonthDay.fromCalendarFields(gregorianCalendar0);
      LocalDate localDate0 = monthDay0.toLocalDate((-2767));
      Period period0 = null;
      try {
        period0 = new Period(localDate0, monthDay0);
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
      Period period1 = period0.plusMonths(93);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period();
      Days days0 = Days.ZERO;
      Period period1 = period0.withFields(days0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      MonthDay monthDay0 = MonthDay.now((Chronology) strictChronology0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
      
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      Period period1 = period0.minusMinutes((-257));
      PeriodType periodType0 = PeriodType.standard();
      Period period2 = new Period(monthDay0, monthDay0, periodType0);
      assertFalse(period2.equals((Object)period1));
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
      DateTime dateTime0 = new DateTime((-409L));
      PeriodType periodType0 = PeriodType.months();
      Period period0 = new Period(dateTime0, dateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(2447);
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      YearMonth yearMonth0 = new YearMonth(0L);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.plusSeconds(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.days((-386));
      Period period1 = period0.multipliedBy((-386));
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
      
      Date date0 = new Date(1);
      YearMonth yearMonth0 = YearMonth.fromDateFields(date0);
      Period period2 = new Period(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      YearMonth yearMonth0 = new YearMonth(chronology0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      period0.multipliedBy(9);
      assertEquals(1583256065913L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Period period0 = Period.weeks((-386));
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      YearMonth yearMonth0 = new YearMonth(chronology0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      assertEquals(1583256065391L, instant0.getMillis());
      
      Period period2 = period0.plusHours(0);
      assertSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.days((-386));
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.plusHours(1);
      assertNotSame(period2, period0);
      assertFalse(period2.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.ZERO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      Period period1 = period0.withField(durationFieldType0, (-2367));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) ethiopicChronology0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Hours hours0 = Hours.MIN_VALUE;
      PeriodType periodType0 = hours0.getPeriodType();
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
  public void test20()  throws Throwable  {
      Period period0 = Period.days((-386));
      Period period1 = period0.plusSeconds((-1362));
      assertNotSame(period1, period0);
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period2 = new Period(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Period period0 = Period.weeks((-386));
      period0.plusMillis(1566);
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      YearMonth yearMonth0 = new YearMonth(chronology0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      assertEquals(1583256062792L, instant0.getMillis());
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.days((-386));
      period0.minus((ReadablePeriod) null);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.days((-386));
      Period period1 = period0.minus(period0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period2 = new Period(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period0));
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      Period period1 = period0.withField(durationFieldType0, (-1167));
      assertNotSame(period1, period0);
  }
}
