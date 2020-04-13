/*

 * Tue Mar 03 17:20:05 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.ZERO.toString(periodFormatter0);
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
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn((-2926)).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.weeks((-561));
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
  public void test03()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.months(4);
      Period period1 = period0.minusDays(375);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period((-1), 1000, 1000, (-1));
      LocalTime localTime0 = new LocalTime();
      period0.ZERO.get((DurationFieldType) null);
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
  public void test07()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks(393);
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
      Period period0 = new Period();
      Period period1 = period0.plusYears(2928);
      period1.normalizedStandard();
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
  public void test10()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      Period period1 = period0.plusYears((-1847));
      period1.normalizedStandard();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
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
  public void test11()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1217L), (Chronology) null);
      Period period0 = new Period(mutableDateTime0, mutableDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.months(4);
      period0.ZERO.plusSeconds(4);
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
      Period period0 = Period.months(4);
      Period period1 = period0.ZERO.plusSeconds(4);
      LocalTime localTime0 = new LocalTime();
      Period period2 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = Weeks.TWO;
      Period period1 = period0.plus(weeks0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.months(4);
      LocalTime localTime0 = new LocalTime();
      period0.normalizedStandard();
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
      Period period0 = Period.months(4);
      LocalTime localTime0 = new LocalTime();
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      period0.toStandardSeconds();
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.years();
      LocalTime localTime0 = new LocalTime();
      period0.equals(periodType0);
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
  public void test20()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.normalizedStandard();
      LocalTime localTime0 = new LocalTime();
      period0.equals(period1);
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
  public void test21()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.years();
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = period0.equals(periodType0);
      assertFalse(boolean0);
      
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.multipliedBy(2896);
      LocalTime localTime0 = new LocalTime();
      period1.equals(period0);
      LocalDate localDate0 = LocalDate.now();
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
  public void test23()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.minusMillis((-149));
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
  public void test24()  throws Throwable  {
      Period period0 = new Period();
      period0.plusMinutes(0);
      LocalTime localTime0 = new LocalTime();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
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
      Period period0 = new Period();
      period0.minusMinutes(719527);
      LocalTime localTime0 = new LocalTime((long) (-992), (Chronology) null);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-992));
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
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      period0.normalizedStandard();
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      period0.negated();
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
  public void test28()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusHours(94);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      Minutes minutes0 = period0.toStandardMinutes();
      period0.ZERO.minus(minutes0);
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
  public void test31()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMinutes(0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMinutes(2898);
      Period period2 = period1.withPeriodType((PeriodType) null);
      assertSame(period2, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMinutes(0);
      PeriodType periodType0 = PeriodType.seconds();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.months((-2521));
      period0.plusMinutes((-619));
      Seconds seconds0 = Seconds.seconds((-619));
      PeriodType periodType0 = seconds0.getPeriodType();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      Period period1 = period0.negated();
      Period period2 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths((-1745));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.days(380);
      Period period1 = period0.plusMinutes(0);
      Period period2 = period1.withFields((ReadablePeriod) null);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period(2371, (-351), 2371, 2371);
      period0.withFields((ReadablePeriod) null);
      Period period1 = period0.minusMinutes(20);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMinutes(0);
      Years years0 = Years.MIN_VALUE;
      Period period2 = period0.withFields(years0);
      assertNotSame(period2, period0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = new Period();
      Years years0 = Years.MIN_VALUE;
      Period period1 = period0.withFields(years0);
      Period period2 = period0.minusMinutes(170);
      assertNotSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      period0.getFieldTypes();
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
  public void test44()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      period0.getFieldTypes();
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      Period period1 = period0.plusMinutes(0);
      Period period2 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = new Period();
      LocalTime localTime0 = new LocalTime();
      Period period1 = period0.minusMinutes(170);
      Period period2 = Period.fieldDifference(localTime0, localTime0);
      assertNotSame(period2, period1);
  }
}
