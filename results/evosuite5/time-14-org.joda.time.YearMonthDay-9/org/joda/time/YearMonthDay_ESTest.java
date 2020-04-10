/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:14:29 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Years years0 = Years.ZERO;
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(years0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Minutes minutes0 = Minutes.MAX_VALUE;
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded(minutes0, 0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 0);
      assertEquals(0, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields((Chronology) null);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.getField(257);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 257
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(433, 433, 433);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(mockGregorianCalendar0);
      assertEquals(9, yearMonthDay0.getDayOfMonth());
      assertEquals(470, yearMonthDay0.getYear());
      assertEquals(4, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusDays(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusYears(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay((-175L), (Chronology) copticChronology0);
      assertEquals(4, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight();
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2014);
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 2);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusMonths(1);
      assertEquals(1, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withMonthOfYear(1);
      assertEquals(1, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      yearMonthDay0.toLocalDate();
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plus((ReadablePeriod) null);
      assertEquals(1, YearMonthDay.MONTH_OF_YEAR);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withDayOfMonth(1);
      assertEquals(1, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusYears(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusDays(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields(buddhistChronology0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = yearMonthDay0.getFieldTypes();
      assertEquals(3, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Interval interval0 = yearMonthDay0.toInterval();
      assertEquals(1392418800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusMonths(2);
      assertEquals(14, yearMonthDay1.getDayOfMonth());
      assertEquals(4, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) 1);
      assertEquals(1, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2014-02-14", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(2014, yearMonthDay0.getYear());
      
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(0);
      assertEquals(14, yearMonthDay1.getDayOfMonth());
      assertEquals(0, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) strictChronology0);
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight();
      assertEquals(1392332400000L, dateTime0.getMillis());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime();
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(3, yearMonthDay0.size());
  }
}
