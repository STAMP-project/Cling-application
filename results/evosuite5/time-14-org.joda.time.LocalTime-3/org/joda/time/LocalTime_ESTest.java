/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:35:36 GMT 2019
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
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime_ESTest extends LocalTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      java.time.Instant instant0 = MockInstant.ofEpochMilli(259200000L);
      Date date0 = Date.from(instant0);
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      // Undeclared exception!
      try { 
        localTime_Property0.addNoWrapToCopy(2034);
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
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy(1061);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Locale locale0 = Locale.GERMANY;
      String string0 = localTime0.toString((String) null, locale0);
      assertEquals("00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.FRANCE;
      try { 
        localTime0.toString("?{:} =!O", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      String string0 = localTime0.toString((String) null);
      assertEquals("21:21:21.320", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.toString("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.property((DateTimeFieldType) null);
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
      LocalTime localTime0 = LocalTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusSeconds(955);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.minusMinutes(0);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusMinutes(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.MIDNIGHT.minusHours(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusHours(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusMillis((-1));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusSeconds((-421));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime(478L, (Chronology) iSOChronology0);
      LocalTime localTime1 = localTime0.plusMinutes(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusHours(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusHours(1101);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = new Period(localTime0, localTime0);
      LocalTime localTime1 = localTime0.withPeriodAdded(period0, 0);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minus((ReadablePeriod) null);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded(durationFieldType0, 2147483642);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'days' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.withFieldAdded((DurationFieldType) null, 266);
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
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime(478L, (Chronology) iSOChronology0);
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, 2147483136);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2147483136 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.withField((DateTimeFieldType) null, 10080);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.withFields((ReadablePartial) null);
      assertSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.withFields(localTime0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = LocalTime.now();
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.isEqual(localDateTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime1 = new LocalTime((Chronology) copticChronology0);
      boolean boolean0 = localTime0.isAfter(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = new LocalTime();
      boolean boolean0 = localTime0.equals(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(ethiopicChronology0);
      LocalTime localTime1 = new LocalTime((Object) null, strictChronology0);
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusMillis((-1));
      boolean boolean0 = localTime1.equals(localTime0);
      assertFalse(localTime0.equals((Object)localTime1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 14 for halfdayOfDay must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      boolean boolean0 = localTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      boolean boolean0 = localTime0.isSupported((DateTimeFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
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
  public void test43()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.getValue((-2865));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2865
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.getField(11);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 11
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      boolean boolean0 = localTime0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      LocalTime localTime0 = LocalTime.fromCalendarFields(calendar0);
      boolean boolean0 = localTime0.equals(calendar0);
      assertFalse(boolean0);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) islamicChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.withMinuteOfHour((-2147483511));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483511 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(3L, (DateTimeZone) null);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.withSecondOfMinute(5);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(455L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.getHourOfDay();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.withMillisOfSecond(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.getMillisOfSecond();
      assertEquals(320, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = null;
      try {
        localTime0 = new LocalTime(dateTimeFieldType0, fixedDateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Weeks weeks0 = Weeks.THREE;
      LocalTime localTime1 = localTime0.MIDNIGHT.plus(weeks0);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.getSecondOfMinute();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.getMinuteOfHour();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.withMillisOfDay(12);
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test67()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
      
      LocalTime localTime1 = new LocalTime(localTime0);
      assertTrue(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = localTime0.getMillisOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.withHourOfDay(2147483634);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2147483634 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.parse("$nIKK93,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"$nIKK93,\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DateTime dateTime0 = localTime0.toDateTimeToday();
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.getLocalTime();
      assertSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addCopy(1000000000000000000L);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime localTime0 = new LocalTime(478L, (Chronology) iSOChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfCeilingCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfEvenCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(11, 11, 11, 11);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.withMaximumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime(478L, (Chronology) iSOChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundCeilingCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime(478L, (Chronology) iSOChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addCopy(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      // Undeclared exception!
      try { 
        localTime_Property0.setCopy("x.(^p#_ ~~n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"x.(^p#_ ~~n\" for hourOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(11, 11, 11, 11);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      Chronology chronology0 = localTime_Property0.getChronology();
      LocalTime localTime1 = LocalTime.fromMillisOfDay(379L, chronology0);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.roundFloorCopy();
      assertSame(localTime1, localTime0);
  }
}
