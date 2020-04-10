/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:53:34 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MonthDay_ESTest extends MonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Locale locale0 = Locale.ITALY;
      String string0 = monthDay0.toString((String) null, locale0);
      assertEquals("--02-14", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Locale locale0 = Locale.FRANCE;
      try { 
        monthDay0.toString("|L", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        monthDay0.toString("Must supply a chronology");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Hours hours0 = Hours.ONE;
      MonthDay monthDay1 = monthDay0.withPeriodAdded(hours0, 0);
      assertSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.plus((ReadablePeriod) null);
      assertEquals(2, monthDay1.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-2788L));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      MonthDay monthDay1 = monthDay0.withField(dateTimeFieldType0, 1);
      assertSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      MonthDay monthDay1 = monthDay0.withField(dateTimeFieldType0, 3);
      assertEquals(3, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields((Chronology) null);
      assertSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        monthDay0.getField(2941);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 2941
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      assertEquals(1, MonthDay.DAY_OF_MONTH);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MonthDay monthDay0 = MonthDay.fromCalendarFields(calendar0);
      assertEquals(2, monthDay0.getMonthOfYear());
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.plusDays(1);
      assertEquals(15, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = monthDay0.getFieldTypes();
      assertEquals(2, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.withMonthOfYear(1);
      assertEquals(1, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay((Object) integer0, (Chronology) buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Integer
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.withDayOfMonth(2);
      assertEquals(2, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(100000000L, (Chronology) islamicChronology0);
      assertEquals(23, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Minutes minutes0 = Minutes.ZERO;
      MonthDay monthDay1 = monthDay0.minus(minutes0);
      assertNotSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.parse("The chronology of the time does not match");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"The chronology of the time does ...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.plusMonths(1);
      assertEquals(3, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      // Undeclared exception!
      try { 
        monthDay0.property(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfWeek' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(gJChronology0);
      assertNotSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      String string0 = monthDay0.toString((String) null);
      assertEquals("--02-14", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(monthDay0, monthDay0);
      MonthDay monthDay1 = monthDay0.plus(period0);
      assertNotSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      assertEquals(2, monthDay0.getMonthOfYear());
      
      monthDay0.toLocalDate(1);
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      assertEquals(14, monthDay0.getDayOfMonth());
      
      MonthDay monthDay1 = monthDay0.minusDays(5);
      assertEquals(9, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
      assertEquals(13, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Object) null);
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      assertEquals(2, monthDay0.getMonthOfYear());
      
      MonthDay monthDay1 = monthDay0.minusMonths(0);
      assertSame(monthDay1, monthDay0);
      assertEquals(14, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      // Undeclared exception!
      try { 
        monthDay_Property0.setCopy(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfMonth must be in the range [1,29]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      MonthDay monthDay1 = monthDay_Property0.addToCopy(1);
      assertEquals(14, monthDay1.getDayOfMonth());
      assertEquals(3, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      assertEquals(2, monthDay0.size());
      
      String string0 = monthDay_Property0.getAsText();
      assertEquals("14", string0);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay.Property monthDay_Property0 = new MonthDay.Property(monthDay0, 0);
      MonthDay monthDay1 = monthDay_Property0.addWrapFieldToCopy(0);
      assertEquals(2, monthDay0.size());
      assertTrue(monthDay1.equals((Object)monthDay0));
      assertEquals(14, monthDay1.getDayOfMonth());
      assertEquals(2, monthDay_Property0.get());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      MonthDay monthDay1 = monthDay_Property0.getMonthDay();
      assertEquals(14, monthDay_Property0.get());
      assertEquals(2, monthDay1.size());
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      // Undeclared exception!
      try { 
        monthDay_Property0.setCopy("\"ev\"8\"GGv1cLZq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\"ev\"8\"GGv1cLZq\" for dayOfMonth is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}
