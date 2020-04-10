/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:46:01 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.temporal.ChronoField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusHours((-1181));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period((long) (-590));
      Period period1 = period0.minusWeeks((-590));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.years(2);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0);
      Period period0 = duration0.toPeriod();
      Period period1 = period0.plusMonths((-807));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period(0, 1, 0, 0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.years((-30));
      Period period1 = period0.minusDays((-30));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.years(2);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusMillis(255);
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
  public void test13()  throws Throwable  {
      Period period0 = Period.ZERO;
      MonthDay monthDay0 = new MonthDay();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.toString(periodFormatter0);
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
  public void test14()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minus(period0);
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
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
      Period period0 = Period.months((-1));
      PeriodType periodType0 = PeriodType.yearMonthDay();
      period0.normalizedStandard(periodType0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      MonthDay monthDay0 = new MonthDay((Chronology) iSOChronology0);
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
  public void test17()  throws Throwable  {
      Period period0 = Period.months(2);
      Period period1 = period0.normalizedStandard();
      LocalDate localDate0 = new LocalDate();
      Period period2 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      ChronoField chronoField0 = ChronoField.MILLI_OF_DAY;
      period0.equals(chronoField0);
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
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      ChronoField chronoField0 = ChronoField.ALIGNED_WEEK_OF_YEAR;
      boolean boolean0 = period0.ZERO.equals(chronoField0);
      assertFalse(boolean0);
      
      MonthDay monthDay0 = new MonthDay();
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay();
      period0.get((DurationFieldType) null);
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
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      period0.negated();
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0);
      Period period0 = duration0.toPeriod();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      period0.negated();
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
  public void test24()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0);
      Period period0 = duration0.toPeriod();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      period0.negated();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.years(2);
      period0.minusMinutes(0);
      MonthDay monthDay0 = new MonthDay();
      YearMonth yearMonth0 = YearMonth.now();
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
  public void test26()  throws Throwable  {
      Period period0 = Period.years((-30));
      period0.minusMinutes(255);
      MonthDay monthDay0 = new MonthDay();
      YearMonth yearMonth0 = YearMonth.now();
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
  public void test27()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0);
      Period period1 = period0.minusMinutes(0);
      period0.withFields(period1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.seconds((-590));
      Days days0 = Days.ONE;
      Period period1 = period0.withFields(days0);
      Period period2 = period0.minusMinutes((-590));
      assertNotSame(period2, period0);
      assertFalse(period0.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.years(2);
      Period period1 = period0.minusMinutes(0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.years(2);
      Period period1 = period0.minusMinutes(2);
      Period period2 = period1.ZERO.withPeriodType((PeriodType) null);
      assertNotSame(period1, period0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.years(2);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMinutes(623191204);
      PeriodType periodType0 = PeriodType.seconds();
      // Undeclared exception!
      try { 
        period1.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0);
      Period period1 = period0.minusMinutes(0);
      LocalDate localDate0 = LocalDate.now();
      Period period2 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period((-16), (-16), (-16), (-16));
      period0.minusMinutes((-16));
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-16));
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.years(2);
      period0.withFields((ReadablePeriod) null);
      Period period1 = period0.minusMinutes((-951));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.years(0);
      PeriodType periodType0 = PeriodType.minutes();
      Period period1 = period0.withPeriodType(periodType0);
      boolean boolean0 = period1.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.ZERO.getFieldTypes();
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
  public void test39()  throws Throwable  {
      Period period0 = new Period();
      period0.getFieldTypes();
      LocalDate localDate0 = new LocalDate();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = new Period((long) 1);
      period0.plusSeconds(4357);
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
  public void test41()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusSeconds((-280));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0);
      Period period0 = duration0.toPeriod();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Years years0 = Years.yearsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Weeks weeks0 = Weeks.weeks(0);
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period1 = period0.normalizedStandard(periodType0);
      boolean boolean0 = period1.equals(years0);
      assertFalse(boolean0);
      
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0);
      Period period0 = duration0.toPeriod();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Years years0 = Years.yearsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Weeks weeks0 = Weeks.weeks(0);
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period1 = period0.normalizedStandard(periodType0);
      period1.equals(years0);
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
  public void test44()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toString((PeriodFormatter) null);
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
  public void test45()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toString((PeriodFormatter) null);
      LocalDate localDate0 = new LocalDate();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.ZERO.toStandardWeeks();
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
  public void test47()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toStandardMinutes();
      LocalDate localDate0 = new LocalDate();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = Period.years(2);
      period0.normalizedStandard((PeriodType) null);
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
  public void test49()  throws Throwable  {
      Period period0 = Period.years(2);
      Period period1 = period0.normalizedStandard();
      LocalDate localDate0 = new LocalDate();
      Period period2 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.plusMillis((-93));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }
}
