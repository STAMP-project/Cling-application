/*

 * Tue Mar 03 17:34:09 GMT 2020
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
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-2123L));
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusHours(558);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period.fieldDifference(localDate0, localDate0);
      PeriodType periodType0 = PeriodType.standard();
      PeriodType periodType1 = periodType0.withMinutesRemoved();
      PeriodType periodType2 = periodType1.withMonthsRemoved();
      assertEquals("StandardNoMinutesNoMonths", periodType2.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldTypeArray0[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [hours, hours]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4441)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      LocalTime localTime0 = new LocalTime();
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
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Period period0 = Period.weeks((-4405));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Years years0 = Years.MAX_VALUE;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      Period period1 = period0.withFieldAdded(durationFieldType0, (-3860));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4441)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        PeriodType.forFields((DurationFieldType[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.weeks((-4405));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.plusHours(0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-2123L));
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minusMonths(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.weeks((-4405));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-2123L));
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      period0.plusMinutes(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.weeks((-4405));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.plusMinutes(621);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.weeks((-4405));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.plusSeconds(0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusSeconds((-4405));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-2123L));
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minusWeeks(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks(100);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, localDateTime0);
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
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period0 = Period.months(329);
      Period period1 = period0.normalizedStandard();
      // Undeclared exception!
      try { 
        period1.toStandardWeeks();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Weeks as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths(8);
      Period period2 = period0.plus(period1);
      Period period3 = period2.normalizedStandard();
      assertFalse(period3.equals((Object)period0));
      assertTrue(period3.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusYears((-2));
      period1.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1333);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      Period period1 = period0.ZERO.withField(durationFieldType0, (-4405));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withYears(1701);
      // Undeclared exception!
      try { 
        period1.toStandardWeeks();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Weeks as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period1, period2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.millis(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays(7);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
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
      Period period0 = Period.years((-4441));
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.multipliedBy(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Seconds seconds0 = Seconds.seconds(6);
      Period period1 = period0.ZERO.minus(seconds0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.weeks((-4405));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis(7);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.weeks((-4405));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-4405)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 621);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = new Period();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }
}
