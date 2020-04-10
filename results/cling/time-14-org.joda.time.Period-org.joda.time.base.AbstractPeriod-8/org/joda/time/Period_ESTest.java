/*

 * Tue Mar 03 17:20:27 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
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
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1014L, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P0D", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1000L, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minusDays(435);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) copticChronology0);
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
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusWeeks((-4375));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period((-888), (-888), (-888), (-888), (-888), (-888), (-888), (-888));
      LocalTime localTime0 = LocalTime.now();
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      Period period2 = period0.normalizedStandard();
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusSeconds((-1898));
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
      Period period0 = new Period();
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusYears((-125300));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1000L, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      boolean boolean0 = period0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.plusMillis(12);
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
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1000L, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period1 = period0.normalizedStandard(periodType0);
      boolean boolean0 = period0.equals(period1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(3350);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1000L, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1000L, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period1 = period0.plusMinutes(0);
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(50);
      Period period2 = period1.withPeriodType((PeriodType) null);
      assertNotSame(period2, period0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = Period.years(3348);
      Period period1 = period0.plusMinutes(3348);
      // Undeclared exception!
      try { 
        period1.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
      LocalDateTime localDateTime0 = new LocalDateTime();
      YearMonth yearMonth0 = new YearMonth();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1000L, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.multipliedBy(435);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths(5);
      Period period2 = period1.normalizedStandard();
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.plusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = new Period();
      period0.withFields((ReadablePeriod) null);
      Period period1 = period0.plusMinutes((-489));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusMinutes(0);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Period period0 = days0.toPeriod();
      Period period1 = period0.minusMinutes(2130);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(3, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusMinutes((-2652));
      assertNotSame(period1, period0);
  }
}
