/*

 * Tue Mar 03 17:20:44 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = LocalTime.now();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      period0.toString(periodFormatter0);
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
      Period period0 = new Period();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      period0.ZERO.toString(periodFormatter0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period();
      period0.ZERO.toString((PeriodFormatter) null);
      LocalDate localDate0 = LocalDate.now();
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
  public void test03()  throws Throwable  {
      Period period0 = Period.minutes(103);
      period0.toString((PeriodFormatter) null);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period((-1547L));
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      Period period1 = period0.minusDays(4);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L);
      Period period1 = period0.withPeriodType(periodType0);
      period0.ZERO.plus(period1);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, (ReadablePartial) null);
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
      LocalTime localTime0 = new LocalTime();
      LocalDate localDate0 = new LocalDate(15308640144L);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
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
  public void test08()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.ZERO.plusWeeks(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusWeeks(8);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = new Period(30L, (PeriodType) null);
      Years years0 = Years.ONE;
      Period period1 = period0.plus(years0);
      period1.normalizedStandard();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, (ReadablePartial) null);
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
      Period period0 = new Period();
      Period period1 = period0.withYears(222);
      period1.normalizedStandard();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      Days days0 = period0.toStandardDays();
      Weeks weeks0 = Weeks.TWO;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period1 = new Period(1235L, (-1474L), periodType0);
      period1.equals(days0);
      LocalTime localTime0 = new LocalTime();
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
  public void test13()  throws Throwable  {
      Period period0 = Period.ZERO;
      Days days0 = period0.toStandardDays();
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = new Period(8, 8, periodType0);
      period1.equals(days0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.minutes(6586);
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      period0.plusSeconds((-6));
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-3254L));
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
      Period period0 = new Period();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusSeconds(1);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.months(4);
      period0.normalizedStandard();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, (ReadablePartial) null);
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
      Period period0 = new Period(15308640144L, 1387);
      period0.normalizedStandard();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(1024);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L);
      period0.equals(periodType0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, (ReadablePartial) null);
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
      Period period0 = new Period(15308640144L, 1387);
      Object object0 = new Object();
      period0.equals(object0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(0L, 10000000L, periodType0);
      Period period1 = period0.minus(period0);
      period1.equals(period0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      period0.plusMillis(4);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-3263L));
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
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      period0.minusMillis(8);
      Partial partial0 = new Partial();
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, localDate0);
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
      Period period0 = Period.ZERO;
      period0.normalizedStandard();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, (ReadablePartial) null);
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
      Period period0 = new Period();
      period0.normalizedStandard();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period();
      period0.multipliedBy(8);
      LocalTime localTime0 = new LocalTime();
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
  public void test29()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      Period period1 = period0.minusHours(4);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minus(period0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, (ReadablePartial) null);
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
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes(4);
      assertNotSame(period2, period1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes((-4383));
      assertNotSame(period2, period1);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = new Period();
      period0.multipliedBy(8);
      Partial partial0 = new Partial();
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = new Period();
      period0.multipliedBy(8);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths(5);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      period0.withFields((ReadablePeriod) null);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.minusMinutes(3773);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      Period period1 = period0.withFields(period0);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      Period period1 = period0.minusMinutes(4);
      Period period2 = period0.withFields(period1);
      assertNotSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(30L, 30L, periodType0);
      period0.getFieldTypes();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-3263L));
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
  public void test45()  throws Throwable  {
      Period period0 = new Period();
      period0.getFieldTypes();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = new Period(30L);
      period0.minusMinutes(0);
      LocalDate localDate0 = new LocalDate();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = new Period();
      period0.ZERO.plusMinutes(2533);
      LocalDate localDate0 = LocalDate.now();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period1, period0);
  }
}
