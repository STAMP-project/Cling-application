/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 00:19:52 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      assertNotNull(periodType0);
      
      boolean boolean0 = periodType0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      PeriodType periodType1 = periodType0.withDaysRemoved();
      assertEquals(2, periodType1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      assertNotNull(periodType0);
      
      PeriodType periodType1 = periodType0.withMinutesRemoved();
      assertEquals("Millis", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Months months0 = Months.FIVE;
      PeriodType periodType0 = months0.getPeriodType();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        periodType0.addIndexedField(months0, 7, intArray0, 7);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Months months0 = Months.FIVE;
      PeriodType periodType0 = months0.getPeriodType();
      assertNotNull(periodType0);
      
      int[] intArray0 = new int[9];
      boolean boolean0 = periodType0.addIndexedField(months0, 7, intArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusWeeks(586);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      Years years0 = Years.years(440);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        periodType0.setIndexedField(years0, 0, intArray0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withSeconds(586);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(1, weeks0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      assertNotNull(periodType0);
      
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertEquals(7, periodType0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      PeriodType periodType0 = PeriodType.hours();
      assertNotNull(periodType0);
      
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertEquals("Hours", periodType0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      durationFieldTypeArray0[0] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.MILLIS_TYPE;
      durationFieldTypeArray0[1] = durationFieldType1;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("StandardNoYearsNoMonthsNoWeeksNoDaysNoHoursNoMinutes", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [seconds]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [minutes]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [hours]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("Days", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weeks]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("Months", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [years]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      PeriodType periodType1 = PeriodType.forFields(durationFieldTypeArray0);
      assertSame(periodType1, periodType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain null
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      Months months0 = Months.EIGHT;
      PeriodType periodType0 = months0.getPeriodType();
      Period period1 = period0.withPeriodType(periodType0);
      period1.toStandardWeeks();
      assertEquals("Months", periodType0.getName());
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      assertNotNull(periodType0);
      
      String string0 = periodType0.toString();
      assertEquals("PeriodType[Weeks]", string0);
  }
}
