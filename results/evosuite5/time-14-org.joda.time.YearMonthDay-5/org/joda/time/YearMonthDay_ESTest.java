/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:13:18 GMT 2019
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Weeks weeks0 = Weeks.weeks(1);
      Days days0 = weeks0.toStandardDays();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded(days0, 0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(0, 2, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 1);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 1);
      assertEquals(1, yearMonthDay1.getDayOfMonth());
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
        yearMonthDay0.getField((-2794));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2794
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
      MockDate mockDate0 = new MockDate(0);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      assertEquals(1970, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusDays(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusYears(1);
      assertEquals(2013, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay(635L, (Chronology) islamicChronology0);
      assertEquals(10, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Period period0 = new Period(0, 0, (byte) (-1), 1, (byte) (-1), 2, (byte) (-1), 2);
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(period0);
      assertEquals(13, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusMonths(0);
      assertSame(yearMonthDay1, yearMonthDay0);
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
      assertEquals(2014, yearMonthDay1.getYear());
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
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusYears(1);
      assertEquals(2015, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusDays(2);
      assertEquals(16, yearMonthDay1.getDayOfMonth());
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(mockGregorianCalendar0);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) julianChronology0);
      yearMonthDay0.getFieldTypes();
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Interval interval0 = yearMonthDay0.toInterval();
      assertEquals(1392332400000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusMonths(1);
      assertEquals(3, yearMonthDay1.getMonthOfYear());
      assertEquals(14, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) (byte) (-1));
      assertEquals(1970, yearMonthDay0.getYear());
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
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(1);
      assertEquals(1, yearMonthDay1.getYear());
      assertEquals(14, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      YearMonthDay yearMonthDay1 = new YearMonthDay(dateTime0, gregorianChronology0);
      assertEquals(1392332400000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      
      yearMonthDay0.toDateMidnight();
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime();
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null);
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }
}
