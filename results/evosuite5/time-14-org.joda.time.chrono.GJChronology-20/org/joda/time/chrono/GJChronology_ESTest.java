/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:45:42 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Months months0 = Months.SIX;
      long long0 = gJChronology0.add((ReadablePeriod) months0, (long) 60, 60);
      assertEquals(946684800060L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((-9223372024732800000L), 0, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = new Period(713L, (-9223372024732800024L), gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0);
      DateTime dateTime0 = DateTime.now((Chronology) gJChronology0);
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((-2446L), (Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.withMonthOfYear(11);
      assertEquals(30, monthDay1.getDayOfMonth());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0);
      MonthDay monthDay0 = MonthDay.now((Chronology) gJChronology0);
      monthDay0.withDayOfMonth(1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((-1), 2, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      MonthDay monthDay1 = monthDay0.plus(mutablePeriod0);
      assertEquals(14, monthDay1.getDayOfMonth());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) iSOChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0, 5);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2014-02-13T23:00:00.000Z,mdfw=5]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology1 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateMidnight0, 4);
      String string0 = gJChronology1.toString();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("GJChronology[UTC,cutover=2014-02-14]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTime dateTime0 = new DateTime(4003, 12, 12, 9, 12, gJChronology0);
      assertEquals(64185120720000L, dateTime0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime(2, 2, 2, 86399999, 86399999, gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 86399999 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 29, 2, 2, 29, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime((-1092), (-1092), (-1092), (-1092), (-1092), gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1092 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(12, 12, 12, 12);
      assertEquals((-61758807571988L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(4181, 1, 1, 4181);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(69772492804181L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (-12219292800000L), 3034);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 3034
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (long) (-2302), (-2302));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -2302
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Months months0 = Months.FIVE;
      long long0 = gJChronology0.add((ReadablePeriod) months0, (-9223372024732800000L), (-2277));
      assertEquals(9223152716609123616L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.plusDays(9);
      assertEquals(23, monthDay1.getDayOfMonth());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      DateMidnight dateMidnight0 = new DateMidnight(1043, 1043, 1043, lenientChronology0);
      assertEquals((-26422503572000L), dateMidnight0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear(1043);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-29248646400000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.equals("GJChronology[Europe/Amsterdam]");
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.hashCode();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((-60427983602089L), (-12219292800000L), gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(6134400000L, (DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateMidnight0);
      MonthDay monthDay0 = MonthDay.now((Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        monthDay0.withDayOfMonth(121);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 121 for dayOfMonth must be in the range [1,26]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 29, gJChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear(2176);
      assertEquals((-62133351572000L), dateMidnight0.getMillis());
      assertEquals(6502978800000L, dateMidnight1.getMillis());
  }
}
