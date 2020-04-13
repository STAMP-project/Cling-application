/*

 * Tue Mar 03 17:21:22 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      Period period1 = period0.withFieldAdded(durationFieldType0, (-222));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((-2216L), (Chronology) ethiopicChronology0);
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      Period period0 = null;
      try {
        period0 = new Period(localTime0, yearMonth0);
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
      period0.plusMonths((-690));
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
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
      Period period0 = Period.hours((-1021));
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.ZERO;
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) copticChronology0);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.plusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Period period0 = new Period(mutableDateTime0, mutableDateTime0, periodType0);
      assertEquals(1583256065203L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.days((-17));
      Period period1 = period0.plusYears((-17));
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.hours(37);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.hours((-2208));
      Period period1 = period0.ZERO.minusSeconds(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.hours((-1021));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Period period1 = period0.negated();
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
      
      MonthDay monthDay0 = MonthDay.now((Chronology) ethiopicChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      MonthDay monthDay0 = MonthDay.now((Chronology) copticChronology0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.hours((-2208));
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      Period period1 = period0.ZERO.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusHours(9);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      PeriodType periodType0 = PeriodType.years();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      // Undeclared exception!
      try { 
        period0.minusSeconds(8);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) copticChronology0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      MonthDay monthDay0 = MonthDay.now((Chronology) copticChronology0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusMillis(1235);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.hours((-1021));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) ethiopicChronology0);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.minus((ReadablePeriod) null);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      MonthDay monthDay0 = MonthDay.now((Chronology) copticChronology0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withField(durationFieldType0, 1970);
      assertNotSame(period0, period1);
  }
}
