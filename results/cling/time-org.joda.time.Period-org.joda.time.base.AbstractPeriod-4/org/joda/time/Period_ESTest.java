/*

 * Tue Mar 03 17:20:16 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
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
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      Period period1 = period0.minusDays(9);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      Period period1 = period0.plusWeeks(9);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.years((-2050));
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(86389L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      Period period1 = period0.ZERO.withFieldAdded(durationFieldType0, 0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      period0.minusSeconds(9);
      LocalTime localTime0 = new LocalTime((-1L));
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
  public void test09()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusSeconds(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(86400L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 11);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period0 = Period.months(11);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(86400L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Days days0 = period0.toStandardDays();
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = new Period(0L, periodType0);
      boolean boolean0 = period1.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      Period period1 = period0.minusYears(9);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      boolean boolean0 = period0.equals(yearMonth0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      period0.minusMillis(9);
      LocalTime localTime0 = new LocalTime((-1L));
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
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis(6);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(86400L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      Period period1 = period0.ZERO.minusHours(39);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      period0.minus(period0);
      LocalTime localTime0 = new LocalTime((-1L));
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
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.millis(1);
      Period period1 = period0.plusMinutes(0);
      PeriodType periodType0 = PeriodType.standard();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period((long) (-2437), periodType0);
      Period period1 = period0.plusMinutes((-2437));
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period2, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      Period period0 = Period.months((-2427));
      Period period1 = period0.plusMinutes((-2427));
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
  public void test26()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime(708L, (Chronology) julianChronology0);
      Period period0 = Period.weeks(0);
      period0.negated();
      YearMonth yearMonth0 = new YearMonth();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, yearMonth0);
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
      YearMonth yearMonth0 = new YearMonth(86400L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMonths(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1L));
      Period period0 = new Period(localDate0, localDate0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.plusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.days(9);
      Period period1 = period0.minusMinutes(9);
      Period period2 = period0.withFields((ReadablePeriod) null);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Days days0 = Days.ZERO;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusMinutes((-1378));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType[] durationFieldTypeArray0 = period0.ZERO.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(86400L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMinutes(0);
      PeriodType periodType0 = PeriodType.time();
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.plusMinutes(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }
}
