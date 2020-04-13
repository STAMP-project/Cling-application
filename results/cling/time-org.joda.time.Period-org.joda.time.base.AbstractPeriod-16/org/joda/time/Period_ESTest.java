/*

 * Tue Mar 03 17:20:59 GMT 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
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
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
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
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
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
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
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
      Period period0 = Period.ZERO;
      Period period1 = period0.plusDays(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusWeeks(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period period1 = period0.ZERO.minusYears(1);
      period1.normalizedStandard();
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
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.ZERO.minusYears(1);
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(16L, (Chronology) ethiopicChronology0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      Period period2 = period0.minus(period1);
      Period period3 = period2.plusSeconds(1);
      boolean boolean0 = period2.ZERO.equals(period3);
      assertTrue(period2.equals((Object)period0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.months(2);
      Period period1 = period0.normalizedStandard();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      period0.toStandardHours();
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
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Hours hours0 = period0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      period0.equals("P-1Y");
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
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(16L, (Chronology) ethiopicChronology0);
      Period period1 = period0.plusSeconds(1);
      period1.ZERO.equals(period1);
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
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      boolean boolean0 = period0.equals("P-1Y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      period0.ZERO.minusMillis(384);
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
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.ZERO.minusMillis(384);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(16L, (Chronology) ethiopicChronology0);
      period0.minusMinutes(0);
      YearMonth yearMonth0 = new YearMonth(5230L);
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
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      period0.minusMinutes(2897);
      java.time.Instant instant0 = java.time.Instant.now();
      Date date0 = Date.from(instant0);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalTime localTime0 = new LocalTime((long) (-1787), dateTimeZone0);
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
  public void test24()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
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
  public void test25()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period period1 = period0.minus(period0);
      Period period2 = period1.minusMinutes(0);
      period2.negated();
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
  public void test27()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.ZERO.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(1609);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
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
  public void test30()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes((-4));
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertNotSame(period2, period1);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period((-997L), (-997L));
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes((-509));
      assertNotSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period();
      period0.multipliedBy((-2318));
      LocalTime localTime0 = LocalTime.now();
      MonthDay monthDay0 = MonthDay.now();
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
  public void test35()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths(84);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.ZERO.withFields((ReadablePeriod) null);
      Period period1 = period0.minusMinutes(8);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = days0.toPeriod();
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(8);
      Period period2 = period0.withFields(period0);
      assertNotSame(period2, period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
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
  public void test42()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.ZERO;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) ethiopicChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(1169);
      assertNotSame(period1, period0);
  }
}
