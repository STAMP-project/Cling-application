/*

 * Tue Mar 03 17:21:13 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, (-2759));
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
      PeriodType periodType0 = PeriodType.days();
      MonthDay monthDay0 = new MonthDay((DateTimeZone) null);
      LocalDate localDate0 = monthDay0.toLocalDate(7678125);
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
  public void test03()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMonths(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = days0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0, (PeriodType) null);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.minutes((-3509));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(373L, 373L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.plusMinutes((-3509));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Period period0 = new Period(mutableDateTime0, mutableDateTime0);
      assertEquals(1583256055229L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears((-15));
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.ZERO;
      PeriodType periodType0 = PeriodType.dayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.minutes((-3509));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(373L, 373L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Period period1 = period0.minusSeconds(0);
      PeriodType periodType0 = PeriodType.millis();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.ZERO;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.minusSeconds(1440);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.minutes((-3509));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(373L, 373L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.multipliedBy((-3509));
      assertFalse(period2.equals((Object)period0));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.ZERO;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Period period1 = period0.negated();
      PeriodType periodType0 = PeriodType.millis();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusHours(0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.millis();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1440), (-1440), (-1440), (-1440));
      mutablePeriod0.add((long) (-1440));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      Period period1 = period0.withField(durationFieldType0, 1440);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) gregorianChronology0);
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = null;
      try {
        period0 = new Period(localTime0, localDateTime0, periodType0);
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
      Period period0 = Period.minutes((-3509));
      Period period1 = period0.minusHours((-3509));
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      PeriodType periodType0 = PeriodType.millis();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.minutes((-3509));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(373L, 373L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.plusMillis(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.minutes((-3509));
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Period period1 = period0.plusMillis((-3509));
      PeriodType periodType0 = PeriodType.millis();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period1.minus(period0);
      assertNotSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.hours(2929);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 12825000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
