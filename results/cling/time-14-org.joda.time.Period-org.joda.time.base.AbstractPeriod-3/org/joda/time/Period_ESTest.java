/*

 * Tue Mar 03 17:20:06 GMT 2020
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
import org.joda.time.DateTimeZone;
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
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      YearMonth yearMonth0 = new YearMonth();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.ZERO.toString(periodFormatter0);
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
      Period period0 = Period.ZERO;
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.toString(periodFormatter0);
      LocalDate localDate0 = LocalDate.now();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toString((PeriodFormatter) null);
      LocalDate localDate0 = new LocalDate((long) 1187, (DateTimeZone) null);
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
      Period period0 = Period.years((-2033));
      period0.toString((PeriodFormatter) null);
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-1041L), (Chronology) gJChronology0);
      LocalDate localDate0 = new LocalDate((-584L), (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Period period0 = duration0.toPeriod((Chronology) julianChronology0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.years((-2033));
      Period period1 = period0.minusDays((-2033));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      period0.get(durationFieldType0);
      LocalDate localDate0 = new LocalDate((-100L));
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
  public void test07()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusWeeks(12);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusYears((-1423));
      period1.normalizedStandard();
      LocalDate localDate0 = new LocalDate((-100L));
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
  public void test10()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.hours((-1423));
      period0.minusSeconds(1);
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
      Period period0 = Period.years((-2033));
      period0.minusSeconds(25);
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-1041L), (Chronology) gJChronology0);
      LocalDate localDate0 = new LocalDate((-584L), (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
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
      Period period0 = new Period();
      LocalDate localDate0 = LocalDate.now();
      Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = period0.minusMonths(2);
      period1.normalizedStandard();
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
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      YearMonth yearMonth0 = new YearMonth();
      period0.toStandardHours();
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
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-3477));
      Period.fieldDifference(localTime0, localTime0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.years((-2033));
      PeriodType periodType0 = PeriodType.weeks();
      period0.equals(periodType0);
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
  public void test21()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = Period.hours(4018);
      period0.equals(period1);
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
  public void test22()  throws Throwable  {
      Period period0 = new Period();
      boolean boolean0 = period0.equals((Object) null);
      assertFalse(boolean0);
      
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.years((-2033));
      Period period1 = period0.normalizedStandard();
      period1.equals(period0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-1041L), (Chronology) gJChronology0);
      LocalDate localDate0 = new LocalDate((-584L), (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localDate0);
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
      Period period0 = Period.years((-2033));
      period0.plusMillis((-2033));
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
  public void test25()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusMillis(555);
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
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      period0.plusMinutes(0);
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
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
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      YearMonth yearMonth0 = new YearMonth();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      period0.plusMinutes((-2400));
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
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
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
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
  public void test29()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours((-2516));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.FIVE;
      Period period0 = days0.toPeriod();
      YearMonth yearMonth0 = new YearMonth();
      period0.minus(period0);
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
  public void test32()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Seconds seconds0 = Seconds.ONE;
      // Undeclared exception!
      try { 
        period0.minus(seconds0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period((-491L), (-2407L));
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period1.plusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period1.plusMinutes(1247);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = period0.ZERO.withPeriodType(periodType0);
      Period period2 = period0.plusMinutes(0);
      assertFalse(period2.equals((Object)period1));
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = period0.ZERO.withPeriodType(periodType0);
      Period period2 = period1.plusMinutes((-2101));
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.years((-2033));
      period0.multipliedBy((-533));
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-1041L), (Chronology) gJChronology0);
      LocalDate localDate0 = new LocalDate((-584L), (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localDate0);
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
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMonths(3);
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Period period0 = duration0.toPeriod((Chronology) julianChronology0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.minusMinutes((-176));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = new Period((-491L), (-2407L));
      Period period1 = period0.plusMinutes(0);
      Period period2 = period0.withFields(period0);
      assertSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.getFieldTypes();
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
  public void test43()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-3477));
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plusMinutes(1247);
      assertNotSame(period1, period0);
  }
}
