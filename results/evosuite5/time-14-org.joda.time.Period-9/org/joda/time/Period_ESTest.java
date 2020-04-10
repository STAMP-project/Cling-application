/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:52:58 GMT 2019
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
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withYears(2212);
      // Undeclared exception!
      try { 
        period1.toStandardWeeks();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Weeks as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.months(1310);
      // Undeclared exception!
      try { 
        period0.toStandardDays();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Days as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.negated();
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.minus((ReadablePeriod) null);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.plusMinutes(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.weeks((-89));
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.minusWeeks(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths(1000);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.weeks(552);
      Period period1 = period0.plusYears(552);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.months(1302);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.months(1310);
      Period period1 = period0.plus(period0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.ZERO;
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 60);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period((-2595L), (-2595L));
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 1861);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      Period period1 = period0.withField(durationFieldType0, 3130);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.withFields((ReadablePeriod) null);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.TWO;
      Period period0 = days0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = new Partial(strictChronology0, dateTimeFieldTypeArray0, intArray0);
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
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localTime0);
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
      LocalDateTime localDateTime0 = new LocalDateTime();
      YearMonth yearMonth0 = new YearMonth(localDateTime0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, (ReadablePartial) null);
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
  public void test24()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      Period period0 = new Period(dateMidnight0, dateMidnight0, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusSeconds(1000);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.minusWeeks(42);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Duration duration0 = Duration.millis(229L);
      DateTime dateTime0 = DateTime.now();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0);
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays(3421);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = new Period((-232), (-232), (-232), (-232));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.years(6);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-1231L));
      DateMidnight dateMidnight0 = DateMidnight.now();
      PeriodType periodType0 = PeriodType.yearDay();
      Period period0 = duration0.toPeriodFrom((ReadableInstant) dateMidnight0, periodType0);
      Period period1 = period0.withPeriodType(periodType0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Interval interval0 = new Interval(1, 1);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = interval0.toPeriod(periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period((-42521587200000L));
      Duration duration0 = period0.toStandardDuration();
      assertEquals((-42521587200000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period(0L, 0L, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.months((-4));
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Duration duration0 = new Duration((-2159L));
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = duration0.toPeriodTo((ReadableInstant) null, periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Period period0 = new Period((long) 6, (Chronology) iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = null;
      try {
        period0 = new Period("", (PeriodType) null, iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-1016L));
      DateMidnight dateMidnight0 = DateMidnight.now();
      Period period0 = duration0.toPeriodFrom((ReadableInstant) dateMidnight0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.plusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(localDateTime0, localDateTime0, periodType0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = new Period((Object) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      Period period0 = new Period(dateMidnight0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.minusMinutes(4);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = Period.seconds(552);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.hours(2144);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Hours hours0 = period0.ZERO.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Duration duration0 = Duration.millis(229L);
      DateTime dateTime0 = DateTime.now();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0);
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = Period.weeks(562);
      Period period1 = period0.minusHours(562);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Period period0 = Period.millis(1032);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Period period0 = Period.minutes((-1187));
      Period period1 = period0.ZERO.minusDays(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.toPeriod();
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Period period0 = new Period((-411), 3706L, julianChronology0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withMillis(6);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.minusMonths(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period((-1231L), periodType0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Period period0 = new Period((-1), (-1), (-1), (-1), (-1), (-2), (-1), (-1), (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Period period0 = new Period((Object) null, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period(localDateTime0, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
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
  public void test63()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.withSeconds(12);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withWeeks(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withHours(2212);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis(3421);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Period period0 = new Period(82, 82, 82, 82, 82, 82, 82, 82);
      Period period1 = period0.withMinutes(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withDays(42);
      assertFalse(period1.equals((Object)period0));
  }
}
