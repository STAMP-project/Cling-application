/*

 * Tue Mar 03 17:21:26 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
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
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.months(24);
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(2052);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      YearMonth yearMonth0 = new YearMonth(4, 4);
      Seconds seconds0 = Seconds.ZERO;
      PeriodType periodType0 = seconds0.getPeriodType();
      Period period0 = null;
      try {
        period0 = new Period(localTime0, yearMonth0, periodType0);
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
      Period period1 = period0.minusMonths(2058);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.SIX;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = days0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.plusMinutes(0);
      assertSame(period2, period0);
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
      Instant instant0 = Instant.now();
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(instant0, instant0, periodType0);
      assertEquals(1583256067609L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withYears(632);
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      period0.plusSeconds(0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.minutes();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.minusSeconds(1184);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.negated();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.minutes();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period((-2051L), (-2051L));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      PeriodType periodType0 = PeriodType.hours();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.minusHours(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.minutes();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.minusHours(75);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.ZERO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period((-2051L), (-2051L));
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1963, (-2674), (-2674), 8, 120, 120);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
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
  public void test19()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = new Period(days0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[6];
      Period period0 = new Period((Object) null, (PeriodType) null);
      period0.ZERO.plusMillis(0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      MonthDay monthDay0 = new MonthDay(62035200000L, chronology0);
      Period period1 = null;
      try {
        period1 = new Period(monthDay0, monthDay0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[6];
      Period period0 = Period.years((-214));
      period0.ZERO.plusMillis((-214));
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      MonthDay monthDay0 = new MonthDay(62035200000L, chronology0);
      Period period1 = null;
      try {
        period1 = new Period(monthDay0, monthDay0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minus((ReadablePeriod) null);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.minutes();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period((-2051L), (-2051L));
      period0.minus(period0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      PeriodType periodType0 = PeriodType.hours();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) iSOChronology0);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Period period1 = period0.plusMinutes((-4365));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Period period1 = period0.withField(durationFieldType0, 496);
      assertNotSame(period1, period0);
  }
}
