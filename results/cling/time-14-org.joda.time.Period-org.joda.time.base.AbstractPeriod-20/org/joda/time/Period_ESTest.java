/*

 * Tue Mar 03 17:21:34 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Partial;
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
      Period period0 = Period.years(5);
      MonthDay monthDay0 = new MonthDay();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.ZERO.toString(periodFormatter0);
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
      Period period0 = Period.seconds(5);
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.ZERO.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.years(5);
      MonthDay monthDay0 = new MonthDay();
      period0.toString((PeriodFormatter) null);
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
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P0D", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.seconds(5);
      Period period1 = period0.minusDays(5);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      YearMonth yearMonth0 = new YearMonth();
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
  public void test07()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusWeeks(10209375);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.years(5);
      MonthDay monthDay0 = new MonthDay();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      linkedHashSet0.remove(period0);
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
  public void test10()  throws Throwable  {
      Period period0 = Period.years(5);
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      boolean boolean0 = linkedHashSet0.remove(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.years(5);
      MonthDay monthDay0 = new MonthDay(5, 5);
      period0.normalizedStandard();
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
  public void test12()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      Period period0 = Period.years(1);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay();
      period0.minusSeconds(1);
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
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
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
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
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
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      Months months0 = Months.EIGHT;
      Period period1 = period0.plus(months0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.months(5);
      MonthDay monthDay0 = new MonthDay();
      period0.normalizedStandard();
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
      Period period0 = Period.seconds(0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.plusYears(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.seconds(5);
      MonthDay monthDay0 = new MonthDay();
      period0.toStandardDays();
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
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.millis((-109));
      Object object0 = new Object();
      period0.ZERO.equals(object0);
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
      Period period0 = Period.seconds(5);
      Period period1 = period0.minusMillis(5);
      MonthDay monthDay0 = new MonthDay();
      period1.equals(period0);
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
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      boolean boolean0 = period0.equals(monthDay0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.years(11);
      Period period1 = period0.minusMinutes(11);
      boolean boolean0 = period1.equals(period0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(11);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.seconds(5);
      period0.minusMillis(5);
      MonthDay monthDay0 = new MonthDay();
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      period0.normalizedStandard();
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
  public void test29()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.months(5);
      Period period1 = period0.plusHours(25734375);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.seconds(5);
      MonthDay monthDay0 = new MonthDay();
      period0.minus(period0);
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
  public void test32()  throws Throwable  {
      Period period0 = Period.seconds(5);
      MonthDay monthDay0 = new MonthDay();
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      period0.minus(period1);
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
      Period period0 = new Period();
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period1.minusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period1.minusMinutes(1747);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0);
      Period period1 = period0.plusMinutes(0);
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period0, period1);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.seconds();
      Period period1 = period0.withPeriodType(periodType0);
      // Undeclared exception!
      try { 
        period1.minusMinutes((-119));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.seconds(5);
      Period period1 = period0.negated();
      MonthDay monthDay0 = new MonthDay();
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.seconds(5);
      Period period1 = period0.minusMonths(5);
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.months(5);
      period0.withFields((ReadablePeriod) null);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.plusMinutes(2);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Period period0 = days0.toPeriod();
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Days days0 = Days.ZERO;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusMinutes(7);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = Period.seconds(5);
      period0.getFieldTypes();
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
  public void test46()  throws Throwable  {
      Period period0 = Period.seconds(5);
      period0.getFieldTypes();
      MonthDay monthDay0 = new MonthDay();
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }
}
