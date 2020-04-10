/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 00:12:39 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      assertNotNull(periodType0);
      
      Integer integer0 = new Integer(0);
      boolean boolean0 = periodType0.equals(integer0);
      assertFalse(boolean0);
      assertEquals("YearWeekDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      assertNotNull(periodType0);
      
      PeriodType periodType1 = periodType0.withYearsRemoved();
      assertEquals(2, periodType1.size());
      assertEquals("YearMonthDayNoYears", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      assertNotNull(periodType0);
      
      PeriodType periodType1 = periodType0.withMillisRemoved();
      assertEquals("Minutes", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(1L, periodType0);
      // Undeclared exception!
      try { 
        period0.minusWeeks(690562340);
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
      Period period0 = Period.weeks(0);
      Period period1 = period0.plus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.minutes((-2911));
      Period period1 = period0.minusSeconds((-2911));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      PeriodType periodType1 = periodType0.withHoursRemoved();
      Minutes minutes0 = Minutes.MIN_VALUE;
      // Undeclared exception!
      try { 
        periodType1.setIndexedField(minutes0, 4, (int[]) null, 4);
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
      Period period0 = Period.minutes((-2911));
      Period period1 = period0.withSeconds((-2911));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(536L, 536L, periodType0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      assertNotNull(periodType0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertEquals(8, periodType0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      assertNotNull(periodType0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertFalse(boolean0);
      assertEquals("Days", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      DurationFieldType durationFieldType1 = DurationFieldType.millis();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType1;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("StandardNoMonthsNoWeeksNoDaysNoHoursNoMinutesNoSeconds", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("Seconds", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
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
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
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
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [days]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
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
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [months]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      PeriodType periodType1 = PeriodType.forFields(durationFieldTypeArray0);
      assertSame(periodType1, periodType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      assertNotNull(periodType0);
      
      String string0 = periodType0.toString();
      assertEquals("PeriodType[Months]", string0);
  }
}
