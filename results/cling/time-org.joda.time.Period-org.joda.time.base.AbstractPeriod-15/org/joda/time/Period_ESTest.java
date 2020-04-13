/*

 * Tue Mar 03 17:20:51 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.weeks((-1000));
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.standard();
      period0.ZERO.toString(periodFormatter0);
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.standard();
      String string0 = period0.ZERO.toString(periodFormatter0);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.hours(729);
      period0.toString((PeriodFormatter) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period(693, 693, 693, 693, 693, 693, 693, 693);
      period0.toString((PeriodFormatter) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusDays(2651);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      period0.ZERO.get(durationFieldType0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.ZERO.plus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.seconds(8);
      Period period1 = period0.plusWeeks(8);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.years((-207));
      period0.normalizedStandard();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.years(14);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period();
      period0.minusSeconds((-10));
      YearMonth yearMonth0 = YearMonth.now();
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
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusSeconds((-10));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.hours((-852));
      YearMonth yearMonth0 = YearMonth.now();
      period0.ZERO.negated();
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
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay();
      Period period1 = period0.multipliedBy(1);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths((-10));
      period1.normalizedStandard();
      YearMonth yearMonth0 = YearMonth.now();
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
  public void test18()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths((-10));
      period1.normalizedStandard();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.seconds(8);
      Period period1 = period0.plusYears(8);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.millis((-11));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      period0.toStandardWeeks();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.weeks((-1000));
      period0.equals("oRKF~FHgJ=g.");
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, (ReadablePartial) null);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.weeks((-1000));
      Period.fieldDifference(localTime0, localTime0);
      boolean boolean0 = period0.equals("oRKF~FHgJ=g.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.seconds(8);
      Period period1 = Period.minutes(8);
      YearMonth yearMonth0 = YearMonth.now();
      period1.equals(period0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Period period0 = Period.seconds((-50));
      period0.minusMillis((-50));
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.years(14);
      period0.minusMillis(14);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period(2551440384L);
      period0.plusMinutes(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.minusMinutes((-488));
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.weeks((-1000));
      Months months0 = Months.months(0);
      PeriodType periodType0 = months0.getPeriodType();
      period0.normalizedStandard(periodType0);
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.weeks((-1000));
      Period.fieldDifference(localTime0, localTime0);
      Months months0 = Months.months(0);
      PeriodType periodType0 = months0.getPeriodType();
      Period period1 = period0.normalizedStandard(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.millis(1);
      period0.negated();
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.weeks(1);
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.weeks((-1000));
      Period period1 = period0.minusHours((-8));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minus(period0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Years years0 = Years.yearsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Period period1 = period0.ZERO.minus(years0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.days(8);
      PeriodType periodType0 = PeriodType.standard();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.plusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.days(8);
      PeriodType periodType0 = PeriodType.standard();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes(8);
      assertSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(324);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period2 = period0.withPeriodType(periodType0);
      assertNotSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.seconds(8);
      YearMonth yearMonth0 = YearMonth.now();
      period0.negated();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.multipliedBy(0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths((-10));
      YearMonth yearMonth0 = YearMonth.now();
      period0.equals(period1);
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
  public void test45()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.minusMinutes(0);
      Period period2 = period0.withFields((ReadablePeriod) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.minutes(15);
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.minusMinutes(15);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = Period.days(8);
      Period period1 = period0.withFields(period0);
      Period period2 = period0.plusMinutes(0);
      assertNotSame(period2, period1);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = new Period((-2), (-2), (-2), (-2));
      Period period1 = period0.minusMinutes((-2));
      Period period2 = period1.withFields(period0);
      assertNotSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = new Period();
      period0.ZERO.getFieldTypes();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.getFieldTypes();
      MonthDay monthDay0 = new MonthDay((DateTimeZone) null);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.weeks((-1000));
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }
}
