/*

 * Tue Mar 03 17:20:24 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.months(1);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
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
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.years(3);
      period0.toString((PeriodFormatter) null);
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
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P0D", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.minusDays(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = period0.ZERO.normalizedStandard(periodType0);
      period1.toString();
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
  public void test07()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.months(3);
      Period period1 = period0.minusWeeks(3);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.years(3);
      period0.normalizedStandard();
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
  public void test10()  throws Throwable  {
      Period period0 = Period.years((-1331));
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((long) (-1331), dateTimeZone0);
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.normalizedStandard();
      Period period2 = period1.plusMinutes(1);
      period2.minusSeconds(1);
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
      Period period0 = new Period();
      period0.negated();
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
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      Minutes minutes0 = Minutes.MIN_VALUE;
      Period period1 = period0.plus(minutes0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.months(1);
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
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period0 = Period.months(8);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.hours(1423);
      Period period1 = period0.plusYears(1423);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(2066L);
      period0.toStandardWeeks();
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
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((long) (-1331), dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = new Period();
      period0.ZERO.equals(period0);
      MonthDay monthDay0 = new MonthDay((long) 0);
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
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      period0.equals(monthDay0);
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
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.multipliedBy(15271875);
      boolean boolean0 = period1.equals(period0);
      assertTrue(boolean0);
      assertNotSame(period1, period0);
      
      MonthDay monthDay0 = new MonthDay((long) 15271875);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.years(3);
      period0.minusMillis(3);
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
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
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
  public void test26()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.months(1);
      period0.minusMinutes(0);
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
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.normalizedStandard();
      period1.plusMinutes(1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localTime0);
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
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(6);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(2066L);
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
  public void test31()  throws Throwable  {
      Period period0 = new Period();
      MonthDay monthDay0 = new MonthDay((long) 15271875);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.hours(1423);
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period1.minusMinutes(1423);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period1 = period0.ZERO.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes(0);
      Period period3 = period2.withPeriodType(periodType0);
      assertSame(period3, period1);
      assertFalse(period3.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.weeks(157);
      PeriodType periodType0 = PeriodType.dayTime();
      Period period1 = period0.ZERO.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes(41);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
      MonthDay monthDay0 = new MonthDay((-1580L));
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, (-292), 512, (-292), 512);
      LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMonths(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.minusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.minusMinutes((-4359));
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields(period0);
      Period period2 = period1.minusMinutes(0);
      assertSame(period2, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.ZERO;
      Minutes minutes0 = period0.toStandardMinutes();
      Period period1 = period0.withFields(minutes0);
      period0.minusMinutes(1964);
      assertTrue(period0.equals((Object)period1));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      period0.getFieldTypes();
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
  public void test43()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(3190L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }
}
