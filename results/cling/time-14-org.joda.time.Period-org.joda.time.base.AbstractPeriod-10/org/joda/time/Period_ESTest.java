/*

 * Tue Mar 03 17:21:17 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
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
      Period period0 = Period.ZERO;
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(719527).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.toString(periodFormatter0);
      LocalDate localDate0 = new LocalDate();
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
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
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
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.toString((PeriodFormatter) null);
      LocalDate localDate0 = new LocalDate();
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
      Period period0 = Period.years(0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.plusDays(18);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      period0.ZERO.get(durationFieldType0);
      LocalDate localDate0 = new LocalDate();
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
  public void test06()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      try { 
        period0.minusWeeks((-536));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.minutes(121);
      Years years0 = Years.ONE;
      Period period1 = period0.minus(years0);
      period1.normalizedStandard();
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
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.minutes(121);
      Years years0 = Years.ONE;
      Period period1 = period0.minus(years0);
      period1.normalizedStandard();
      Period period2 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.years(0);
      Months months0 = Months.months(6);
      DurationFieldType durationFieldType0 = months0.getFieldType();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.hours(11);
      period0.ZERO.plusSeconds(1544);
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
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plusSeconds(70);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plusMinutes(28265625);
      boolean boolean0 = period0.equals(period1);
      assertFalse(period1.equals((Object)period0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate localDate1 = localDate0.plusWeeks(24);
      Period period0 = Period.fieldDifference(localDate0, localDate1);
      period0.normalizedStandard();
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
  public void test16()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.THREE;
      Period period0 = days0.toPeriod();
      Period period1 = period0.minusYears(5);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.seconds((-536));
      period0.toStandardDuration();
      LocalDate localDate0 = new LocalDate();
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
  public void test19()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.seconds((-536));
      Period period1 = Period.minutes((-536));
      period1.equals(period0);
      LocalDate localDate0 = new LocalDate();
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
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Object object0 = new Object();
      period0.equals(object0);
      LocalDate localDate0 = new LocalDate();
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
  public void test22()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.minusMillis(7);
      LocalDate localDate0 = new LocalDate();
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
      Period period0 = Period.years(0);
      period0.minusMinutes(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((-1122L), (Chronology) buddhistChronology0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(27, (-1681), 1563, 857, 3);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
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
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.ZERO.minusMinutes((-552));
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-552), 366, (-552), 697, (-552), 366);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
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
  public void test25()  throws Throwable  {
      Period period0 = Period.seconds((-536));
      period0.normalizedStandard();
      LocalDate localDate0 = new LocalDate();
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
  public void test26()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.normalizedStandard();
      period1.negated();
      LocalDate localDate0 = new LocalDate();
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
  public void test27()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.ZERO.plusHours(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.days((-536));
      Period period1 = period0.plusHours((-536));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.standard();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.minusMinutes((-536));
      Period period2 = period1.withPeriodType((PeriodType) null);
      assertNotSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.plusMinutes(0);
      Years years0 = Years.THREE;
      PeriodType periodType0 = years0.getPeriodType();
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.millis(0);
      Years years0 = Years.THREE;
      PeriodType periodType0 = years0.getPeriodType();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes(1000);
      assertNotSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.negated();
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0);
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths(1136);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period1.plusMinutes((-3671));
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.seconds((-536));
      Period period1 = period0.minusMinutes(0);
      Period period2 = period1.withFields(period0);
      assertSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getFieldTypes();
      LocalDate localDate0 = new LocalDate();
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
  public void test39()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusMinutes((-813));
      period0.withFields(period1);
      assertNotSame(period1, period0);
  }
}
