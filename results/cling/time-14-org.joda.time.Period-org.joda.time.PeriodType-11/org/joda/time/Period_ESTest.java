/*

 * Tue Mar 03 17:31:45 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.days(0);
      period0.minusDays(0);
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(12, 12);
      Period.fieldDifference(localTime0, localTime0);
      Days days0 = Days.ZERO;
      PeriodType periodType0 = days0.getPeriodType();
      PeriodType periodType1 = periodType0.withDaysRemoved();
      assertEquals("DaysNoDays", periodType1.getName());
      assertFalse(periodType1.equals((Object)periodType0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DurationFieldType durationFieldType1 = DurationFieldType.hours();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType1;
      PeriodType.forFields(durationFieldTypeArray0);
      DurationFieldType[] durationFieldTypeArray1 = new DurationFieldType[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      String string0 = period0.toString();
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period.fieldDifference(localDateTime0, localDateTime0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-805L));
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
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period.fieldDifference(localDateTime0, localDateTime0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 589);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(59);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime1);
      Period period1 = period0.normalizedStandard();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusHours(308);
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
      Period period0 = Period.days(0);
      period0.minusMonths(0);
      LocalDateTime localDateTime0 = new LocalDateTime(1363L);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.plusYears(0);
      LocalDateTime localDateTime0 = new LocalDateTime(934L);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.plusYears(1954);
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.weeks((-1583));
      period0.ZERO.plusSeconds(18);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-2408));
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusMinutes((-999));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.weeks((-1583));
      period0.minusWeeks((-3904));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-2408));
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.minusDays((-1709));
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime1);
      // Undeclared exception!
      try { 
        period0.toStandardDuration();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Duration as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths((-89));
      period1.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withYearOfEra(272);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime1);
      Period period1 = period0.normalizedStandard();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.ZERO.withField((DurationFieldType) null, 28181250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-3133));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withYears((-1015));
      // Undeclared exception!
      try { 
        period1.toStandardDays();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Days as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.weeks((-1583));
      period0.toStandardDuration();
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-2408));
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.weeks((-1583));
      Period period1 = period0.withPeriodType((PeriodType) null);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-2408));
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays((-533));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test37()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.normalizedStandard();
      Period period2 = period1.negated();
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMillis(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis(798);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, (-3218));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = Period.days(0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      period0.ZERO.withFieldAdded(durationFieldType0, 0);
      LocalDateTime localDateTime0 = new LocalDateTime(934L);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }
}
