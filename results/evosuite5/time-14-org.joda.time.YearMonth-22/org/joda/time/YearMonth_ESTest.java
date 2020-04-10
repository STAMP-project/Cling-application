/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:45:47 GMT 2019
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      Locale locale0 = Locale.UK;
      String string0 = yearMonth0.toString((String) null, locale0);
      assertEquals("2014-02", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Locale locale0 = Locale.KOREA;
      try { 
        yearMonth0.toString("@^l~", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        yearMonth0.toString("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Hours hours0 = Hours.THREE;
      YearMonth yearMonth1 = yearMonth0.withPeriodAdded(hours0, 0);
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.withPeriodAdded((ReadablePeriod) null, 1);
      assertSame(yearMonth0, yearMonth1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth yearMonth1 = yearMonth0.minusYears(1262);
      assertEquals(752, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonth yearMonth1 = yearMonth0.withField(dateTimeFieldType0, 2);
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      YearMonth yearMonth1 = yearMonth0.withField(dateTimeFieldType0, 1);
      assertEquals(1, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields((Chronology) null);
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      // Undeclared exception!
      try { 
        yearMonth0.getField(1712);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1712
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      YearMonth yearMonth0 = YearMonth.fromDateFields(mockDate0);
      assertEquals(1970, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      assertEquals(2, yearMonth0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      // Undeclared exception!
      try { 
        yearMonth0.property(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'weekyearOfCentury' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(1377);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      YearMonth yearMonth0 = null;
      try {
        yearMonth0 = new YearMonth((Object) integer0, (Chronology) iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Integer
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      YearMonth yearMonth0 = new YearMonth(2, 2, lenientChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = yearMonth0.getFieldTypes();
      assertEquals(2, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) (-1));
      assertEquals(1970, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      YearMonth yearMonth0 = YearMonth.now((Chronology) islamicChronology0);
      YearMonth yearMonth1 = yearMonth0.withYear(1);
      assertEquals(1, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null, 2);
      YearMonth yearMonth0 = new YearMonth((long) 2, (Chronology) gregorianChronology0);
      assertEquals(1970, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      YearMonth yearMonth1 = yearMonth0.minus(period0);
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(2, yearMonth1.getMonthOfYear());
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields(julianChronology0);
      assertNotSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      assertEquals(2014, yearMonth0.getYear());
      
      YearMonth yearMonth1 = yearMonth0.plusYears(1);
      assertEquals(2015, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Weeks weeks0 = Weeks.MIN_VALUE;
      YearMonth yearMonth1 = yearMonth0.plus(weeks0);
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.withMonthOfYear(1);
      assertEquals(1, yearMonth1.getMonthOfYear());
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Object) null);
      String string0 = yearMonth0.toString((String) null);
      assertEquals("2014-02", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth yearMonth1 = yearMonth0.minusMonths(0);
      assertEquals(2014, yearMonth1.getYear());
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      assertEquals(2, yearMonth0.getMonthOfYear());
      
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1393628400000L, interval0.getEndMillis());
      assertEquals(1391209200000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = new YearMonth.Property(yearMonth0, 1);
      // Undeclared exception!
      try { 
        yearMonth_Property0.setCopy(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      assertEquals(2, yearMonth0.size());
      
      int int0 = yearMonth_Property0.get();
      assertEquals(2, int0);
      assertEquals(2014, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      YearMonth yearMonth1 = (YearMonth)yearMonth_Property0.getReadablePartial();
      assertEquals(2014, yearMonth_Property0.get());
      assertEquals(2, yearMonth1.getMonthOfYear());
      assertEquals(2, yearMonth1.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      YearMonth yearMonth1 = yearMonth_Property0.addWrapFieldToCopy(1);
      assertEquals(2, yearMonth0.getMonthOfYear());
      assertEquals(2, yearMonth1.size());
      assertEquals(2015, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      YearMonth yearMonth1 = yearMonth_Property0.addToCopy((-2651));
      assertEquals(2, yearMonth0.getMonthOfYear());
      assertEquals(2, yearMonth0.size());
      assertEquals((-637), yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = new YearMonth.Property(yearMonth0, 0);
      YearMonth yearMonth1 = yearMonth_Property0.getYearMonth();
      assertEquals(2014, yearMonth_Property0.get());
      assertEquals(2, yearMonth1.getMonthOfYear());
      assertEquals(2, yearMonth1.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = new YearMonth.Property(yearMonth0, 0);
      // Undeclared exception!
      try { 
        yearMonth_Property0.setCopy("1LB53`3djWqa^(p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"1LB53`3djWqa^(p\" for year is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}
