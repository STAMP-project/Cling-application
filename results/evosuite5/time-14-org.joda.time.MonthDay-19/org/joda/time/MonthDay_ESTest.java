/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:55:57 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MonthDay_ESTest extends MonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      Locale locale0 = Locale.ITALIAN;
      String string0 = monthDay0.toString((String) null, locale0);
      assertEquals("--02-14", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Locale locale0 = Locale.ENGLISH;
      try { 
        monthDay0.toString("L", locale0);
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
      String string0 = monthDay0.toString((String) null);
      assertEquals("--02-14", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        monthDay0.toString("Incomplete parser array");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Weeks weeks0 = Weeks.ONE;
      MonthDay monthDay1 = monthDay0.withPeriodAdded(weeks0, 0);
      assertSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period(0, 0);
      MonthDay monthDay1 = monthDay0.minus(period0);
      assertNotSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      MonthDay monthDay1 = monthDay0.withField(dateTimeFieldType0, 1);
      MonthDay monthDay2 = monthDay1.withField(dateTimeFieldType0, 1);
      assertEquals(1, monthDay2.getDayOfMonth());
      assertSame(monthDay2, monthDay1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields((Chronology) null);
      assertSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        monthDay0.getField((-1816));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1816
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
      MockDate mockDate0 = new MockDate(1);
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      assertEquals(1, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
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
  public void test13()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) iSOChronology0);
      assertEquals(2, monthDay0.size());
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
      MonthDay monthDay1 = monthDay0.plusDays(0);
      assertSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-115L));
      assertEquals(1, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.withMonthOfYear(1);
      assertEquals(1, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((-39L), (Chronology) iSOChronology0);
      MonthDay monthDay0 = new MonthDay(dateMidnight0, iSOChronology0);
      assertEquals(1, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        monthDay0.withDayOfMonth(141);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 141 for dayOfMonth must be in the range [1,29]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MonthDay monthDay0 = new MonthDay((long) 1, (Chronology) ethiopicChronology0);
      assertEquals(23, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.minus((ReadablePeriod) null);
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.parse("S!HP~nK;sj.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"S!HP~nK;sj.\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.plusMonths(0);
      assertSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MonthDay monthDay0 = MonthDay.fromCalendarFields(mockGregorianCalendar0);
      assertEquals(2, monthDay0.getMonthOfYear());
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      // Undeclared exception!
      try { 
        monthDay0.property(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'weekOfWeekyear' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(buddhistChronology0);
      assertNotSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.plus((ReadablePeriod) null);
      assertEquals(2, monthDay1.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      assertEquals(2, monthDay0.getMonthOfYear());
      
      monthDay0.toLocalDate(0);
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      assertEquals(14, monthDay0.getDayOfMonth());
      
      MonthDay monthDay1 = monthDay0.minusDays(1);
      assertEquals(13, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Object) null);
      monthDay0.getFieldTypes();
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      assertEquals(2, monthDay0.getMonthOfYear());
      
      MonthDay monthDay1 = monthDay0.minusMonths(635);
      assertEquals(14, monthDay1.getDayOfMonth());
      assertEquals(3, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = new MonthDay.Property(monthDay0, 0);
      MonthDay monthDay1 = monthDay_Property0.setCopy(1);
      assertEquals(2, monthDay_Property0.get());
      assertEquals(14, monthDay0.getDayOfMonth());
      assertEquals(1, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay.Property monthDay_Property0 = new MonthDay.Property(monthDay0, 0);
      MonthDay monthDay1 = monthDay_Property0.addToCopy(0);
      assertEquals(14, monthDay1.getDayOfMonth());
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      assertEquals(2, monthDay0.size());
      
      String string0 = monthDay_Property0.getAsText();
      assertEquals("14", string0);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = new MonthDay.Property(monthDay0, 0);
      MonthDay monthDay1 = monthDay_Property0.addWrapFieldToCopy(0);
      assertEquals(2, monthDay0.size());
      assertEquals(14, monthDay1.getDayOfMonth());
      assertTrue(monthDay1.equals((Object)monthDay0));
      assertEquals(2, monthDay_Property0.get());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      MonthDay monthDay1 = monthDay_Property0.getMonthDay();
      assertEquals(14, monthDay1.getDayOfMonth());
      assertEquals(2, monthDay_Property0.get());
      assertEquals(2, monthDay1.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = new MonthDay.Property(monthDay0, 1);
      // Undeclared exception!
      try { 
        monthDay_Property0.setCopy("(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"(\" for dayOfMonth is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}
