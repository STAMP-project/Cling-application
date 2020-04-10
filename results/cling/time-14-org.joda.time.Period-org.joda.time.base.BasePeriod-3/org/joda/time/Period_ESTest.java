/*

 * Tue Mar 03 17:23:09 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.weeks(0);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.plusYears(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.seconds(8);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.plusMonths(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-2192), 0, (-2192), (-3862), (-2192));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null, (PeriodType) null);
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
  public void test08()  throws Throwable  {
      Instant instant0 = new Instant();
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period(instant0, instant0, periodType0);
      assertEquals(1583256121135L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.years(2741);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.dayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((-2418L), (Chronology) islamicChronology0);
      Partial partial0 = new Partial(monthDay0);
      Period period2 = new Period(monthDay0, partial0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, gJChronology0);
      Weeks weeks0 = Weeks.MIN_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period0 = new Period(partial0, partial0, periodType0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.weeks(0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((-2418L), (Chronology) islamicChronology0);
      Partial partial0 = new Partial(monthDay0);
      Period period1 = new Period(monthDay0, partial0);
      Period period2 = period0.negated();
      assertNotSame(period2, period0);
      assertTrue(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-2192), 0, (-2192), (-3862), (-2192));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.ZERO;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, gJChronology0);
      Weeks weeks0 = Weeks.MIN_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period1 = new Period(partial0, partial0, periodType0);
      Period period2 = period0.minusHours((-1594));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.weeks(0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, localDateTime0);
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
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.plusSeconds(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-2192), 0, (-2192), (-3862), (-2192));
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.weeks(0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((-2418L), (Chronology) islamicChronology0);
      Partial partial0 = new Partial(monthDay0);
      Period period1 = new Period(monthDay0, partial0);
      Period period2 = period0.minusMillis((-1264));
      assertTrue(period0.equals((Object)period1));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.minus((ReadablePeriod) null);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((-2418L), (Chronology) islamicChronology0);
      Partial partial0 = new Partial(monthDay0);
      Period period2 = new Period(monthDay0, partial0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Days days0 = Days.SIX;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(1020);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period((long) 2331);
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 2331);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
