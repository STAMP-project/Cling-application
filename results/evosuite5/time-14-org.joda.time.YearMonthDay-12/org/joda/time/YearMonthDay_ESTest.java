/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:07:40 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Period period0 = Period.millis(0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded(period0, 0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded((ReadablePeriod) null, 0);
      assertEquals(0, YearMonthDay.YEAR);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withFieldAdded(durationFieldType0, 0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withFieldAdded(durationFieldType0, 2354);
      assertEquals(26, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-245), (-245), 0);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 7);
      assertSame(yearMonthDay1, yearMonthDay0);
      assertEquals(1634, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      // Undeclared exception!
      try { 
        yearMonthDay0.withField(dateTimeFieldType0, 117);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 117 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields((Chronology) null);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.getField(17);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 17
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(calendar0);
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusDays(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusYears((-198));
      assertEquals(2212, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L, (Chronology) null);
      assertEquals(1970, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Seconds seconds0 = Seconds.MIN_VALUE;
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(seconds0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight();
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusMonths(122);
      assertEquals(12, yearMonthDay1.getMonthOfYear());
      assertEquals(2003, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, islamicChronology0);
      assertEquals(2, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.withMonthOfYear(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Period period0 = Period.millis(0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.plus(period0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.withDayOfMonth((-1845));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1845 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusYears(1);
      assertEquals(2015, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusDays(3);
      assertEquals(17, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields(islamicChronology0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      yearMonthDay0.getFieldTypes();
      assertEquals(12, yearMonthDay0.getMonthOfYear());
      assertEquals(1899, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Interval interval0 = yearMonthDay0.toInterval();
      assertEquals(1392418800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusMonths(0);
      assertSame(yearMonthDay1, yearMonthDay0);
      assertEquals(2014, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(1L);
      assertEquals(1970, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2014-02-14", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(1);
      assertEquals(1, yearMonthDay1.getYear());
      assertEquals(14, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight();
      assertEquals(1392332400000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) null);
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      
      yearMonthDay0.toLocalDate();
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime();
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null);
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
  }
}
