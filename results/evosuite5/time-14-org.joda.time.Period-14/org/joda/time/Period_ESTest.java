/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:33:32 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.months(5);
      PeriodType periodType0 = PeriodType.yearWeekDay();
      // Undeclared exception!
      try { 
        period0.normalizedStandard(periodType0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.years(652);
      // Undeclared exception!
      try { 
        period0.toStandardSeconds();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Seconds as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(652, 652, 652, 652, 652, 652, 652, 652);
      Period period0 = mutablePeriod0.toPeriod();
      // Undeclared exception!
      try { 
        period0.toStandardSeconds();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Seconds as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.months(0);
      Period period1 = period0.multipliedBy(0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period((-14), (-14), (-14), (-14));
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0, 0, 0, 0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.months(0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period((long) 0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.plusWeeks(1);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period(4895L);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 20587500);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      Period period1 = period0.ZERO.withField(durationFieldType0, 0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Period period0 = days0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withPeriodType((PeriodType) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(lenientChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not have overlapping fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      Months months0 = Months.SIX;
      PeriodType periodType0 = months0.getPeriodType();
      Period period0 = new Period(dateMidnight0, dateMidnight0, periodType0);
      // Undeclared exception!
      try { 
        period0.plusSeconds(7);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.withYears(1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.minusWeeks(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.hours(1);
      Period period1 = period0.minusDays(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period((long) 0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = new Period(0, 1, 1, 1);
      Period period1 = period0.minusYears(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((-269L), (Chronology) buddhistChronology0);
      Duration duration0 = Duration.standardDays(21600000L);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period(dateMidnight0, duration0, periodType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.ONE;
      Hours hours0 = days0.toStandardHours();
      PeriodType periodType0 = hours0.getPeriodType();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Period period0 = new Period((-879L), (-879L), periodType0, julianChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period((-4319L), (-42521587199976L), periodType0);
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(708L);
      Period period0 = new Period(duration0, (ReadableInstant) null, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period((-5612L), (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      PeriodType periodType0 = PeriodType.yearDayTime();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Period period0 = null;
      try {
        period0 = new Period(uTCProvider0, periodType0, iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No period converter found for type: org.joda.time.tz.UTCProvider
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-842L));
      Period period0 = duration0.toPeriodFrom((ReadableInstant) null);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(localTime0, localTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period(1000L, 2826L);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      DateTime dateTime0 = dateMidnight0.toDateTime();
      Period period0 = new Period(dateTime0, dateTime0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusMinutes((-1160));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = Period.seconds(0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Hours hours0 = period0.toStandardHours();
      Period period1 = period0.minus(hours0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0);
      Period period0 = new Period(duration0, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.days(4);
      Period period1 = period0.minusHours(4);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = new Period(0, 0, 1, 1, 1, 0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = Period.millis(1);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = Period.minutes(1);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.toPeriod();
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Period period0 = Period.weeks(1);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Period period0 = new Period(31449600000L, 31449600000L, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withMillis(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMonths(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period((-1525L), periodType0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Period period0 = Period.years(0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Period period0 = new Period(1, 1, 17, 17, 2, 1, 3, 2, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      Period period0 = new Period((Object) null, copticChronology0);
      Period period1 = period0.plusMillis(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        Period.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Period period0 = Period.hours(1);
      Period period1 = period0.negated();
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Period period0 = Period.hours(1);
      Period period1 = period0.withSeconds(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withWeeks(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withHours(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Period period0 = Period.months(0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.withMinutes(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withDays(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }
}
