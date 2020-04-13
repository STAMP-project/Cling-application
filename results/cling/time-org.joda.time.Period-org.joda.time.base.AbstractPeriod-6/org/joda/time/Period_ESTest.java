/*

 * Tue Mar 03 17:20:37 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.toString(periodFormatter0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
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
  public void test01()  throws Throwable  {
      Period period0 = Period.seconds(6);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.toString(periodFormatter0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 6);
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.millis((-1994));
      period0.ZERO.toString((PeriodFormatter) null);
      LocalDateTime localDateTime0 = new LocalDateTime(86400L);
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
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 6);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.months(6);
      Period period1 = period0.plusDays(6);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.ZERO;
      YearMonth yearMonth0 = YearMonth.now();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.plus(period1);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1104L);
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
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusWeeks(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.millis((-1994));
      Period period1 = period0.minusYears(6);
      period1.normalizedStandard();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-4L));
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
  public void test10()  throws Throwable  {
      Period period0 = Period.years(35);
      period0.normalizedStandard();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-479L));
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.seconds(0);
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      period0.ZERO.minusSeconds(8);
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test13()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.plusSeconds(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.negated();
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  public void test15()  throws Throwable  {
      Period period0 = Period.seconds(6);
      Period period1 = period0.withMonths(6);
      period1.normalizedStandard();
      LocalTime localTime0 = LocalTime.fromMillisOfDay(86400L);
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
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withMonthOfYear(8);
      Period period0 = Period.fieldDifference(localDateTime1, localDateTime0);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toStandardMinutes();
      LocalDateTime localDateTime0 = new LocalDateTime((-1667L));
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
  public void test19()  throws Throwable  {
      Period period0 = Period.seconds(6);
      period0.toStandardMinutes();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 6);
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      period0.equals(mutableDateTime0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 4);
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
  public void test21()  throws Throwable  {
      Period period0 = Period.millis((-1994));
      Period period1 = period0.ZERO.withWeeks(0);
      period1.equals(period0);
      LocalDateTime localDateTime0 = new LocalDateTime(86400L);
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
  public void test22()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      boolean boolean0 = period0.equals(yearMonth0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusMillis(733);
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusMillis(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.millis(0);
      period0.plusMinutes(0);
      LocalDateTime localDateTime0 = new LocalDateTime(21859200000L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(21859200000L);
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
  public void test26()  throws Throwable  {
      Period period0 = Period.years(918);
      period0.minusMinutes(918);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(2440L);
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test27()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.normalizedStandard();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
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
  public void test28()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(62035200000L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      boolean boolean0 = period1.equals(period0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.seconds(6);
      period0.multipliedBy((-10));
      LocalTime localTime0 = LocalTime.fromMillisOfDay(86400L);
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
  public void test30()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusHours((-125));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.millis((-1994));
      period0.minus(period0);
      LocalDateTime localDateTime0 = new LocalDateTime(86400L);
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
  public void test33()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(62035200000L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minus(period0);
      boolean boolean0 = period0.equals(period1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period(0L, 0L, periodType0);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period0.plusMinutes((-1524));
      assertSame(period0, period1);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.hours();
      Period period2 = period0.withPeriodType(periodType0);
      assertNotSame(period2, period1);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.millis((-1373));
      Period period1 = period0.plusMinutes((-1373));
      PeriodType periodType0 = PeriodType.yearWeekDay();
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
  public void test38()  throws Throwable  {
      Period period0 = new Period(1, 0);
      period0.multipliedBy(3);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-1824L));
      MonthDay monthDay0 = new MonthDay(417L);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.millis(0);
      period0.negated();
      LocalDateTime localDateTime0 = new LocalDateTime(21859200000L);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(21859200000L);
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
  public void test40()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.seconds(6);
      Period period1 = period0.minusMonths(572);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = Period.seconds(6);
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.plusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = new Period(5270L, 5270L);
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.plusMinutes(43);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.seconds((-23));
      Period period1 = period0.plusMinutes(0);
      Period period2 = period0.withFields(period0);
      assertSame(period0, period1);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = new Period(5270L, 5270L);
      Period period1 = period0.plusMinutes(43);
      Period period2 = period0.withFields(period0);
      assertNotSame(period2, period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.millis((-1994));
      period0.getFieldTypes();
      LocalDateTime localDateTime0 = new LocalDateTime(86400L);
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
  public void test47()  throws Throwable  {
      Period period0 = Period.seconds(6);
      period0.getFieldTypes();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 6);
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = Period.seconds(6);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 6);
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.plusMinutes(3766);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }
}
