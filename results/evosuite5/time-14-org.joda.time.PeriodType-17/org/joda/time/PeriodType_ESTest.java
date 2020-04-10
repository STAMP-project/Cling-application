/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:20:53 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      assertNotNull(periodType0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      boolean boolean0 = periodType0.equals(buddhistChronology0);
      assertEquals("Millis", periodType0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      PeriodType periodType1 = periodType0.withMinutesRemoved();
      assertEquals("MinutesNoMinutes", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      PeriodType periodType1 = periodType0.withWeeksRemoved();
      assertEquals(4, periodType0.size());
      assertEquals("Time", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      // Undeclared exception!
      try { 
        periodType0.addIndexedField((ReadablePeriod) null, 1, (int[]) null, 1);
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
      Hours hours0 = Hours.MAX_VALUE;
      PeriodType periodType0 = hours0.getPeriodType();
      int[] intArray0 = new int[7];
      boolean boolean0 = periodType0.addIndexedField(hours0, (-1177), intArray0, 0);
      assertFalse(boolean0);
      assertEquals("Hours", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period(690562340, 690562340, 690562340, 690562340);
      Period period1 = period0.minusMillis(690562340);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        periodType0.setIndexedField((ReadablePeriod) null, 7, intArray0, (-1135));
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
      Period period0 = new Period(690562340, 690562340, 690562340, 690562340);
      Period period1 = period0.withMillis(690562340);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-1990L));
      DateTime dateTime0 = new DateTime();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(duration0, dateTime0, periodType0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals((-11), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      assertNotNull(periodType0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertEquals(8, periodType0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      PeriodType periodType0 = PeriodType.years();
      assertNotNull(periodType0);
      
      boolean boolean0 = periodType0.isSupported(durationFieldTypeArray0[0]);
      assertEquals("Years", periodType0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [millis]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType1 = DurationFieldType.SECONDS_TYPE;
      durationFieldTypeArray0[0] = durationFieldType1;
      durationFieldTypeArray0[1] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("StandardNoYearsNoMonthsNoWeeksNoHoursNoMinutesNoMillis", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
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
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("Hours", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType1 = DurationFieldType.weeks();
      durationFieldTypeArray0[0] = durationFieldType1;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weekyears]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.months();
      durationFieldTypeArray0[1] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weekyears]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
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
      PeriodType periodType0 = PeriodType.hours();
      assertNotNull(periodType0);
      
      String string0 = periodType0.toString();
      assertEquals("PeriodType[Hours]", string0);
  }
}
