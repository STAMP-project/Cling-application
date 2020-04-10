/*

 * Tue Mar 03 17:20:34 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.seconds((-1679));
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.ZERO.toString(periodFormatter0);
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
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      String string0 = period0.ZERO.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.minutes(560);
      period0.toString((PeriodFormatter) null);
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
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period((long) 0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.minutes(560);
      Period period1 = period0.minusDays((-2236));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period(0, 1, 0, 0, 0, 0, 1, 1);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.hours(560);
      Period period1 = period0.plusWeeks(560);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.years((-1623));
      period0.normalizedStandard();
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
  public void test09()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.years(1);
      period0.normalizedStandard();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.days(0);
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.years((-1623));
      period0.minusSeconds((-1623));
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
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period();
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusSeconds(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
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
  public void test14()  throws Throwable  {
      Period period0 = Period.millis((-2105));
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      Period period1 = period0.plus(seconds0);
      assertEquals((-2), seconds0.getSeconds());
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(0, 1, 0, 0, 0, 0, 1, 1);
      period0.normalizedStandard();
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
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(0, 1, 0, 0, 0, 0, 1, 1);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusYears(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.minutes(560);
      period0.ZERO.toStandardHours();
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
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period((long) 0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.days(0);
      period0.equals(1);
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
      Period period0 = Period.minutes(560);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      period0.equals(mutablePeriod0);
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
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.days(0);
      period0.equals(1);
      MonthDay monthDay0 = new MonthDay();
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
  public void test24()  throws Throwable  {
      Period period0 = Period.minutes((-513));
      int[] intArray0 = period0.ZERO.getValues();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      Partial partial0 = new Partial(islamicChronology0, dateTimeFieldTypeArray0, intArray0);
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
  public void test25()  throws Throwable  {
      Period period0 = Period.years((-1623));
      period0.ZERO.minusMillis((-1623));
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
  public void test26()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.plusMillis(1);
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
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.days(0);
      period0.minusMinutes(0);
      MonthDay monthDay0 = new MonthDay();
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
  public void test28()  throws Throwable  {
      Period period0 = new Period();
      period0.minusMinutes(3689);
      YearMonth yearMonth0 = new YearMonth();
      Date date0 = new Date(1);
      MonthDay monthDay0 = MonthDay.fromDateFields(date0);
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
  public void test29()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.days(0);
      period0.normalizedStandard();
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
  public void test30()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.months(3);
      Period period1 = period0.minusHours(3);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.years((-1623));
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, (-1623), periodType0, (Chronology) null);
      period0.ZERO.minus(mutablePeriod0);
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
  public void test34()  throws Throwable  {
      Period period0 = Period.hours((-513));
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      Period period2 = period0.minus(period1);
      assertTrue(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period1.minusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.years(3);
      Period period1 = period0.minusMinutes(10209375);
      Period period2 = period1.withPeriodType((PeriodType) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = new Period(0, 1, 0, 0, 0, 0, 1, 1);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.yearDay();
      // Undeclared exception!
      try { 
        period1.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.minutes(560);
      Period period1 = period0.minusMinutes(560);
      assertNotSame(period1, period0);
      
      PeriodType periodType0 = PeriodType.seconds();
      Period period2 = period1.withPeriodType(periodType0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.negated();
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.multipliedBy(397);
      YearMonth yearMonth0 = new YearMonth();
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.hours(0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = new Period((long) 0);
      Period period1 = period0.minusMonths(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = Period.minutes(560);
      Period period1 = period0.minusMinutes(560);
      Period period2 = period0.withFields((ReadablePeriod) null);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.minusMinutes(0);
      Period period2 = period1.withFields(period0);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(5062500);
      Period period2 = period1.withFields(period0);
      assertNotSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.seconds((-1656));
      period0.getFieldTypes();
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
  public void test47()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType[] durationFieldTypeArray0 = period0.ZERO.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = new Period();
      YearMonth yearMonth0 = new YearMonth();
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.days(0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMinutes(1419);
      boolean boolean0 = period1.equals(period0);
      assertFalse(boolean0);
  }
}
