/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 00:20:43 GMT 2019
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
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Years;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime_ESTest extends LocalTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      // Undeclared exception!
      try { 
        localTime_Property0.addNoWrapToCopy((-2140511297));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The addition exceeded the boundaries of LocalTime
         //
         verifyException("org.joda.time.LocalTime$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy((-2141));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Locale locale0 = Locale.CHINA;
      try { 
        localTime0.MIDNIGHT.toString("", locale0);
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
      LocalTime localTime0 = LocalTime.now();
      String string0 = localTime0.toString((String) null);
      assertEquals("21:21:21.320", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.toString("The calendar must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      LocalTime.Property localTime_Property0 = localTime0.MIDNIGHT.property(dateTimeFieldType0);
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusMillis(10209375);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusSeconds(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(573L);
      LocalTime localTime1 = localTime0.minusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusMinutes(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.MIDNIGHT.minusHours(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusHours(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusMillis(10209333);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusSeconds(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMinutes((-666));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.plusHours(0);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusHours(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Years years0 = Years.ZERO;
      LocalTime localTime1 = localTime0.withPeriodAdded(years0, 0);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      LocalTime localTime1 = localTime0.MIDNIGHT.withFieldAdded(durationFieldType0, 0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded(durationFieldType0, 2814);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'months' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.withFieldAdded((DurationFieldType) null, (-2147483617));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'year' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.withField((DateTimeFieldType) null, (-61));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 17 for hourOfHalfday must be in the range [0,11]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.withFields((ReadablePartial) null);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.withFields(localTime0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = LocalTime.now();
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalTime localTime1 = LocalTime.now((Chronology) gJChronology0);
      boolean boolean0 = localTime0.MIDNIGHT.isBefore(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.compareTo((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      boolean boolean0 = localTime0.MIDNIGHT.isBefore(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = new LocalTime();
      boolean boolean0 = localTime1.equals(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-13));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 3);
      LocalTime localTime1 = new LocalTime((Chronology) copticChronology0);
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = localTime0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-13));
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 2814);
      boolean boolean0 = localTime1.equals(localTime0);
      assertFalse(localTime0.equals((Object)localTime1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      boolean boolean0 = localTime0.MIDNIGHT.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      boolean boolean0 = localTime0.isSupported((DateTimeFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.get((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.getValue(938);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 938
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.getFieldType((-2147483597));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2147483597
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      boolean boolean0 = localTime0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.withMinuteOfHour((-3854));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3854 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = new LocalTime((-1L), (DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.withSecondOfMinute(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.getHourOfDay();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.FRENCH;
      String string0 = localTime0.toString((String) null, locale0);
      assertEquals("21:21:21.320", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.withMillisOfSecond(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.getMillisOfSecond();
      assertEquals(320, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = null;
      try {
        localTime0 = new LocalTime(dateTimeFieldType0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plus((ReadablePeriod) null);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.getSecondOfMinute();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.getMinuteOfHour();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.withMillisOfDay(13);
      boolean boolean0 = localTime0.isAfter(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test64()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      assertEquals(4, localTime0.size());
      
      LocalTime localTime1 = new LocalTime(localTime0);
      assertTrue(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalTime localTime0 = null;
      try {
        localTime0 = new LocalTime(1107, 1107);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1107 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Hours hours0 = Hours.ONE;
      LocalTime localTime1 = localTime0.MIDNIGHT.minus(hours0);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.withHourOfDay(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTime dateTime0 = localTime0.toDateTimeToday();
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.MIDNIGHT.getMillisOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy((-1832));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.getLocalTime();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.addCopy(1L);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-1001));
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfCeilingCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.roundHalfEvenCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.withMaximumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundCeilingCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2615625, 2615625, (-833), 0, 2615625, 0);
      LocalTime localTime0 = LocalTime.fromCalendarFields(mockGregorianCalendar0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addCopy(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 0);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      // Undeclared exception!
      try { 
        localTime_Property0.setCopy(")_F!=U*7QivI");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \")_F!=U*7QivI\" for secondOfMinute is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      Chronology chronology0 = localTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundFloorCopy();
      assertSame(localTime1, localTime0);
  }
}
