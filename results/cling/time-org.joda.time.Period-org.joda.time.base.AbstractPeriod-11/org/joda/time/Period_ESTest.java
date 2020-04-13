/*

 * Tue Mar 03 17:20:51 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.toString((PeriodFormatter) null);
      LocalTime localTime0 = new LocalTime((-570L));
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
  public void test02()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P0D", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period(2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132);
      Period period1 = period0.plusDays(2132);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.minusWeeks((-1544));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period.fieldDifference(localDate0, localDate0);
      Period period0 = Period.years(2949);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.hours(43);
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusSeconds(1225);
      LocalTime localTime0 = new LocalTime((-570L));
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
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusSeconds((-844));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.negated();
      LocalTime localTime0 = new LocalTime((-570L));
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
  public void test12()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(556);
      Period period0 = Period.months(3);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 3, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Hours hours0 = period0.toStandardHours();
      PeriodType periodType0 = PeriodType.seconds();
      Period period1 = new Period((long) 17, periodType0);
      boolean boolean0 = period1.equals(hours0);
      assertEquals(0, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period(2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132);
      Period period1 = period0.minusYears(2132);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.equals((Object) null);
      LocalTime localTime0 = new LocalTime((-570L));
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
  public void test18()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      boolean boolean0 = period0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusMillis(1000);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.years(0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 0, 0, 0, 0);
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      period0.plusMinutes((-1539));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
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
  public void test21()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.normalizedStandard();
      Period period2 = period1.negated();
      assertTrue(period2.equals((Object)period1));
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      period0.negated();
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
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusHours((-605));
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
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minus(period0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withPeriodType((PeriodType) null);
      Period period2 = period1.plusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(1073741824);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertSame(period2, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.months();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes(0);
      assertNotSame(period2, period0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.years(65);
      PeriodType periodType0 = PeriodType.days();
      period0.ZERO.withPeriodType(periodType0);
      Period period1 = period0.minusMinutes(65);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = new Period((-3024), (-3024), (-3024), (-3024));
      period0.multipliedBy((-3024));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(83);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-3024), dateTimeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
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
  public void test31()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.plusMonths(5026);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.seconds(2132);
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period(2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132);
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.plusMinutes(2092);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(0);
      Period period2 = period0.withFields(period1);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes((-33));
      Period period2 = period0.withFields(period1);
      assertNotSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(3, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusMinutes(37);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }
}
