/*

 * Tue Mar 03 17:22:46 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
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
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears((-1487));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.minutes((-2319));
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, (-2319));
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
      Days days0 = Days.MAX_VALUE;
      PeriodType periodType0 = days0.getPeriodType();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(2522L);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) iSOChronology0);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = null;
      try {
        period0 = new Period(localTime0, monthDay0, periodType0);
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
      Period period1 = period0.minusMonths((-1019));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period();
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.THREE;
      Period period0 = days0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
      
      MonthDay monthDay0 = MonthDay.now();
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = Period.hours(1);
      Period period1 = period0.minusMinutes(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
      
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
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
  public void test11()  throws Throwable  {
      Period period0 = Period.years(22);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = Period.hours(1);
      Period period1 = period0.minusSeconds((-2333));
      assertNotSame(period1, period0);
      
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
      
      MonthDay monthDay0 = MonthDay.now();
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = Period.hours(1);
      Period period1 = period0.minusHours(1);
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.FIVE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 1925);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(292272992, 3, 292272992, 1162, (-5136), 3);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = Period.hours(1);
      Period period1 = period0.minusMillis(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
      
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = MonthDay.now();
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.minus(period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.hours(1);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(mutableDateTime0, mutableDateTime0, periodType0);
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
