/*

 * Tue Mar 03 17:22:30 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(2127);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.days(3214);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 2735);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(325L);
      LocalDate localDate0 = monthDay0.toLocalDate((-553));
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
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths(2127);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.ONE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(141L);
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay();
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.plusMinutes(1);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      DateTime dateTime0 = new DateTime((DateTimeZone) null);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period0 = new Period(dateTime0, dateTime0, periodType0);
      assertEquals(1583256130147L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.years((-3229));
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay();
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.plusSeconds(1558);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay();
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.minusHours(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      Seconds seconds0 = period0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      days0.toMutablePeriod();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      Period period1 = period0.withField(durationFieldType0, (-2867));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
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
      MonthDay monthDay0 = new MonthDay();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusHours(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.minutes((-2900));
      Period period1 = period0.plusMillis(0);
      assertSame(period1, period0);
      
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) gregorianChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.plusMillis(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.days(4767);
      Period period1 = period0.minus((ReadablePeriod) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.minutes(115);
      YearMonth yearMonth0 = new YearMonth((-580L));
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.minus(period0);
      assertFalse(period2.equals((Object)period0));
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(141L);
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.minutes(115);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Period period1 = new Period(period0, periodType0, ethiopicChronology0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.days(4767);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 868);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
