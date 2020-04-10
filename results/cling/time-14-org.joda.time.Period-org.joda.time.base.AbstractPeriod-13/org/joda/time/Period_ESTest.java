/*

 * Tue Mar 03 17:20:46 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      period0.toString(periodFormatter0);
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
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
      period0.toString((PeriodFormatter) null);
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
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      Period period1 = period0.ZERO.minusDays(0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      // Undeclared exception!
      try { 
        period0.minusDays(9);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      period0.get(durationFieldType0);
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
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      Period period1 = period0.ZERO.minusWeeks(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusWeeks(1157);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.years((-1));
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      period0.normalizedStandard(periodType0);
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
  public void test09()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period.fieldDifference(localTime0, localTime0);
      Period period0 = Period.years(2);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period1 = period0.normalizedStandard(periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      period0.plusSeconds(765);
      LocalTime localTime0 = LocalTime.now();
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
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plusSeconds(17971853);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
      period0.negated();
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
  public void test14()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = new Period(10080L, periodType0);
      Period period1 = period0.plus(period0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.months((-1));
      period0.normalizedStandard((PeriodType) null);
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
  public void test16()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period.fieldDifference(localTime0, localTime0);
      Period period0 = Period.months(2);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      Period period0 = new Period(174L, 174L, (PeriodType) null, islamicChronology0);
      Period period1 = period0.plusYears(1893);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      period0.equals(partial0);
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
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      Minutes minutes0 = period0.toStandardMinutes();
      period0.equals(minutes0);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(islamicChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not have overlapping fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      period0.minusMillis(5);
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
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
      Partial partial1 = new Partial(dateTimeFieldType1, 0);
      period0.minusMinutes(0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial1, partial0);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.millis(0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
      Partial partial1 = new Partial(dateTimeFieldType1, 0);
      period0.plusMinutes(2077);
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial1, partial0);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      PeriodType periodType0 = PeriodType.seconds();
      period0.normalizedStandard(periodType0);
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
  public void test26()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(765);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.millis(0);
      Minutes minutes0 = period0.toStandardMinutes();
      LocalTime localTime0 = new LocalTime();
      period0.minus(minutes0);
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
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = new Period(0L, (-2647L), periodType0);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = new Period(10080L, periodType0);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.plusMinutes(2437);
      assertSame(period1, period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = new Period();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes(0);
      assertNotSame(period2, period1);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = Weeks.MIN_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period1 = period0.ZERO.withPeriodType(periodType0);
      Period period2 = period0.minusMinutes(9);
      assertNotSame(period2, period0);
      assertFalse(period0.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
      period0.negated();
      LocalTime localTime0 = new LocalTime(0, 0, 0, 0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, partial0);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      period0.negated();
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
  public void test36()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMonths(1822);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.months((-1));
      Period period1 = period0.minusMinutes(2697);
      Period period2 = period0.withFields((ReadablePeriod) null);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(0);
      Period period2 = period0.withFields(period1);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(28);
      Period period2 = period0.withFields(period1);
      assertNotSame(period2, period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.years((-1));
      period0.getFieldTypes();
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
  public void test42()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.fieldDifference(partial0, partial0);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(1, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusMinutes((-1145));
      assertNotSame(period1, period0);
  }
}
