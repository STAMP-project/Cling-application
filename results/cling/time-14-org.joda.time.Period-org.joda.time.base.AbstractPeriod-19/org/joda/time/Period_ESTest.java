/*

 * Tue Mar 03 17:21:07 GMT 2020
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
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, (Chronology) null);
      Duration duration0 = Duration.standardMinutes(0L);
      Period period0 = new Period(mutableDateTime0, duration0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.toString(periodFormatter0);
      Partial partial0 = new Partial(dateTimeFieldType0, 3);
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
  public void test01()  throws Throwable  {
      Date date0 = new Date(604802L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toString((PeriodFormatter) null);
      Date date0 = new Date(604800L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
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
      Date date0 = new Date(604812L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(604800L);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusDays(1023);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period();
      period0.get((DurationFieldType) null);
      Date date0 = new Date(0);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
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
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.plusWeeks(1);
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
      Period period0 = Period.years(2);
      period0.normalizedStandard();
      Date date0 = new Date(2);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
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
      Period period0 = Period.years((-9));
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
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.weeks(2);
      period0.minusSeconds(2);
      Date date0 = new Date(2);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
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
      Date date0 = new Date(604800L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusSeconds((-1335));
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
      Date date0 = new Date(604800L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Days days0 = Days.SIX;
      Period period1 = period0.plus(days0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, (Chronology) null);
      Duration duration0 = Duration.standardMinutes(0L);
      Period period0 = new Period(mutableDateTime0, duration0);
      Period period1 = period0.withMonths(1);
      period1.normalizedStandard();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 3);
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
  public void test16()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.weeks(2);
      Period period1 = period0.plusYears(2);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toStandardDays();
      Date date0 = new Date(0);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
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
      Period period0 = new Period();
      period0.ZERO.toStandardSeconds();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 70);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((-1150L), (Chronology) ethiopicChronology0);
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
  public void test20()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.equals((Object) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 3);
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
  public void test21()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.normalizedStandard();
      period1.equals(period0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
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
      LocalDateTime localDateTime0 = new LocalDateTime(604800L);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      boolean boolean0 = period0.equals(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.normalizedStandard();
      period1.equals(period0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period2 = Period.fieldDifference(partial0, partial0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusMillis(2);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
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
  public void test25()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusMillis(2);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period1 = Period.fieldDifference(partial0, partial0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusMinutes(0);
      Date date0 = new Date(2147483647L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      LocalTime localTime0 = new LocalTime(2621L, (DateTimeZone) null);
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
  public void test27()  throws Throwable  {
      Period period0 = new Period();
      period0.minusMinutes(70);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 70);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((-1150L), (Chronology) ethiopicChronology0);
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
      Period period0 = new Period();
      period0.negated();
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
  public void test29()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusHours(765);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.weeks(2);
      period0.minus(period0);
      Date date0 = new Date(2);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
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
  public void test32()  throws Throwable  {
      Date date0 = new Date(604800L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.plusMinutes(0);
      Period period2 = period1.withPeriodType((PeriodType) null);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.months(365);
      Period period1 = period0.minusMinutes(365);
      PeriodType periodType0 = PeriodType.standard();
      Period period2 = period1.withPeriodType(periodType0);
      assertNotSame(period2, period0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.seconds();
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.months(332);
      Period period1 = period0.minusMinutes(332);
      PeriodType periodType0 = PeriodType.dayTime();
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
  public void test37()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
      YearMonth yearMonth0 = new YearMonth();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, partial0);
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
      Date date0 = new Date(604802L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.negated();
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Date date0 = new Date(604800L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths(7);
      Period period2 = period1.normalizedStandard();
      assertNotSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.minusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.withFields((ReadablePeriod) null);
      Period period2 = period1.ZERO.minusMinutes((-1717));
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(0);
      Period period2 = period1.withFields(period0);
      assertSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(584);
      Period period2 = period1.withFields(period0);
      assertNotSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.getFieldTypes();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
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
  public void test46()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.getFieldTypes();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period1 = Period.fieldDifference(partial0, partial0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusMinutes(792);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusMinutes(0);
      YearMonth yearMonth0 = YearMonth.now();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }
}
