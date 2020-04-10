/*

 * Tue Mar 03 17:21:24 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Seconds seconds0 = Seconds.ONE;
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(5, 2);
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      LocalDate localDate0 = monthDay0.toLocalDate(5);
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
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMonths(7);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Period period0 = Period.minutes(0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.plusMinutes(0);
      assertSame(period2, period0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.ZERO;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((long) 0, (Chronology) gregorianChronology0);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.plusMinutes(259);
      assertNotSame(period2, period0);
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
  @Ignore
  public void test10()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Period period0 = new Period(dateTime0, dateTime0);
      assertEquals(1583256063215L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.weeks((-121));
      Period period1 = period0.minusYears((-121));
      Period period2 = period1.normalizedStandard();
      assertNotSame(period1, period0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.ZERO;
      Months months0 = Months.FOUR;
      PeriodType periodType0 = months0.getPeriodType();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.ZERO;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((long) 0, (Chronology) gregorianChronology0);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.negated();
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Partial partial0 = new Partial();
      Period period0 = new Period(partial0, partial0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.ZERO;
      Seconds seconds0 = period0.toStandardSeconds();
      seconds0.toMutablePeriod();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.minutes((-3285));
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      Period period1 = period0.withField(durationFieldType0, (-3285));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      LocalDate localDate0 = new LocalDate((-2359), 1, 1, iSOChronology0);
      PeriodType periodType0 = PeriodType.years();
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, localDate0, periodType0);
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
      Period period0 = Period.millis((-1181));
      Period period1 = period0.minusHours((-1181));
      YearMonth yearMonth0 = new YearMonth();
      Period period2 = new Period(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusSeconds(7);
      MonthDay monthDay0 = MonthDay.now();
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Period period0 = Period.minutes(0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
      
      Period period2 = new Period(yearMonth0, yearMonth0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Period period0 = Period.minutes(0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.ZERO.plusMillis(1);
      assertTrue(period0.equals((Object)period1));
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight(0L, (DateTimeZone) fixedDateTimeZone0);
      Hours hours0 = Hours.EIGHT;
      Duration duration0 = hours0.toStandardDuration();
      PeriodType periodType0 = hours0.getPeriodType();
      Period period0 = new Period(duration0, dateMidnight0, periodType0);
      YearMonth yearMonth0 = YearMonth.now();
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period1.minus(period0);
      assertFalse(period2.equals((Object)period1));
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = new Period(3391L, 376L);
      Period period2 = period1.negated();
      assertNotSame(period2, period1);
      assertFalse(period2.equals((Object)period1));
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.minutes((-3285));
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-3285));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
