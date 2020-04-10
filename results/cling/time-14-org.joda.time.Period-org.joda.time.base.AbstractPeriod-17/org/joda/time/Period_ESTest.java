/*

 * Tue Mar 03 17:20:59 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.weeks(0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      LocalDate localDate0 = new LocalDate((long) 517);
      period0.toString(periodFormatter0);
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
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      LocalDate localDate0 = new LocalDate((long) 517);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.weeks(0);
      period0.toString((PeriodFormatter) null);
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
      Period period0 = Period.weeks(0);
      period0.toString((PeriodFormatter) null);
      LocalDate localDate0 = LocalDate.now();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusDays(2);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusWeeks(12);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.years((-1594));
      period0.normalizedStandard();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period0 = Period.years((-1921));
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.weeks(0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      period0.plusSeconds(4);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
  public void test12()  throws Throwable  {
      Period period0 = Period.weeks(0);
      period0.minusSeconds(517);
      LocalDate localDate0 = new LocalDate((long) 517);
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.normalizedStandard();
      Period period2 = period1.negated();
      assertNotSame(period2, period1);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plus(period0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMonths(2);
      period1.normalizedStandard();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
      Period period0 = Period.seconds(0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.plusYears(517);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      period0.toStandardDuration();
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
      period0.equals((Object) null);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
  public void test20()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = Period.weeks((-1594));
      period1.equals(period0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) islamicChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      boolean boolean0 = period0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      boolean boolean0 = period0.equals(period1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.weeks(0);
      LocalDate localDate0 = new LocalDate(604800L);
      period0.minusMillis((-1663));
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
  public void test24()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(604800L);
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusMillis((-1663));
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
      Period period0 = Period.weeks(0);
      period0.minusMinutes(0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
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
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = new Period();
      period0.plusMinutes((-1921));
      LocalTime localTime0 = new LocalTime((Object) null);
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
      Period period0 = Period.weeks((-1594));
      period0.normalizedStandard();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
  public void test28()  throws Throwable  {
      Period period0 = Period.weeks(0);
      period0.negated();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
  public void test29()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusHours((-1572));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.weeks(0);
      period0.minus(period0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
  public void test32()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      period0.minus(period0);
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
      Period period0 = Period.weeks(0);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.standard();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period();
      period0.ZERO.withPeriodType((PeriodType) null);
      Period period1 = period0.minusMinutes((-272));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(10);
      Years years0 = Years.THREE;
      PeriodType periodType0 = years0.getPeriodType();
      Period period2 = period0.withPeriodType(periodType0);
      assertNotSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.weeks(3);
      period0.negated();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
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
  public void test38()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMonths(2);
      period1.normalizedStandard();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) islamicChronology0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.minusMinutes(517);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
      
      Days days0 = Days.SEVEN;
      Period period2 = days0.toPeriod();
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusMinutes(372);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.weeks(0);
      period0.getFieldTypes();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
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
  public void test45()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(4, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.minusMinutes(0);
      LocalDate localDate0 = new LocalDate((long) 517);
      Period period2 = Period.fieldDifference(localDate0, localDate0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusMinutes(1160);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }
}
