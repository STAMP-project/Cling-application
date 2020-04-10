/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:08:10 GMT 2019
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
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((-4294967296L));
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded((ReadablePeriod) null, 5);
      assertEquals(12, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(5, 5, 5);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 5);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 499);
      assertEquals(499, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields((Chronology) null);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(5, 5, 5);
      // Undeclared exception!
      try { 
        yearMonthDay0.getField(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 5
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
      MockDate mockDate0 = new MockDate((-3007), 2679, (-3007), 2679, (-3007));
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      assertEquals(4, yearMonthDay0.getMonthOfYear());
      assertEquals(893, yearMonthDay0.getYear());
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(76, 76, 0, 76, 76);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(mockGregorianCalendar0);
      assertEquals(82, yearMonthDay0.getYear());
      assertEquals(5, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusYears(1);
      assertEquals(2013, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Months months0 = Months.TWO;
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(months0);
      assertEquals(12, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(6, 6, 6);
      DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight();
      assertEquals((-61964353172000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonthDay yearMonthDay0 = new YearMonthDay((DateTimeZone) fixedDateTimeZone0);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusMonths(1738);
      assertEquals(4, yearMonthDay1.getMonthOfYear());
      assertEquals(1869, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.withMonthOfYear((-995));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -995 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) 5);
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime();
      assertEquals(73281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      yearMonthDay0.toLocalDate();
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay(28L, (Chronology) copticChronology0);
      Days days0 = Days.MAX_VALUE;
      // Undeclared exception!
      try { 
        yearMonthDay0.plus(days0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483626 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.withDayOfMonth((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusDays(2);
      assertEquals(16, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay(1, 1, 1);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields(islamicChronology0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusMonths(144);
      assertEquals(2, yearMonthDay1.getMonthOfYear());
      assertEquals(2026, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((-576L));
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusYears(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2014-02-14", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(10, 10, 10);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(10);
      assertEquals(10, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight();
      assertEquals(1392332400000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) iSOChronology0);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      
      Interval interval0 = yearMonthDay0.toInterval();
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = interval0.toPeriod(periodType0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded(period0, 0);
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertSame(yearMonthDay1, yearMonthDay0);
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(953);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null, gregorianChronology0);
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone0);
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusDays(6);
      assertEquals(8, yearMonthDay1.getDayOfMonth());
  }
}
