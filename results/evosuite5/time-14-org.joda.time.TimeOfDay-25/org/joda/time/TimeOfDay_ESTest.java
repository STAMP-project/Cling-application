/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:34:34 GMT 2019
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
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(30L);
      Period period0 = Period.ZERO;
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded(period0, (-977));
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      Period period0 = Period.millis(1);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plus(period0);
      assertEquals(1, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      Minutes minutes0 = Minutes.minutes(2);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withPeriodAdded(minutes0, 0);
      assertEquals(0, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(calendar0);
      TimeOfDay timeOfDay1 = timeOfDay0.minusMinutes(0);
      assertEquals(20, timeOfDay1.getHourOfDay());
      assertEquals(320, timeOfDay1.getMillisOfSecond());
      assertEquals(21, timeOfDay1.getSecondOfMinute());
      assertSame(timeOfDay1, timeOfDay0);
      assertEquals(21, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withFieldAdded(durationFieldType0, 1);
      assertEquals(1, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withField(dateTimeFieldType0, 0);
      assertEquals(0, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 757);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 757 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withChronologyRetainFields((Chronology) null);
      assertNotSame(timeOfDay0, timeOfDay1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.getField(1916);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1916
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      String string0 = timeOfDay0.toString();
      assertEquals("T00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(3, 2, (Chronology) null);
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(530);
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      assertEquals(22, timeOfDay0.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusSeconds(3);
      assertEquals(3, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusMinutes(0);
      assertEquals(0, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusMillis(1);
      assertEquals(1, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plus((ReadablePeriod) null);
      assertNotSame(timeOfDay0, timeOfDay1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 2);
      assertEquals(0, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withChronologyRetainFields(copticChronology0);
      assertEquals(0, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null);
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusHours(1);
      assertEquals(23, timeOfDay1.getHourOfDay());
      assertEquals(0, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusSeconds(3);
      assertEquals(57, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTime dateTime0 = timeOfDay0.MIDNIGHT.toDateTimeToday();
      assertEquals(1392332400000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withMillisOfSecond(1);
      assertEquals(1, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null, buddhistChronology0);
      assertEquals(2, TimeOfDay.SECOND_OF_MINUTE);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      timeOfDay0.MIDNIGHT.toLocalTime();
      assertEquals(21, timeOfDay0.getSecondOfMinute());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withHourOfDay(1);
      assertEquals(1, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertEquals(4, timeOfDay0.size());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusMillis(0);
      assertEquals(0, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusHours(3);
      assertEquals(3, timeOfDay1.getHourOfDay());
      assertEquals(4, timeOfDay1.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(1, 3, 3, (Chronology) null);
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withMinuteOfHour(3);
      assertEquals(4, timeOfDay1.size());
      assertEquals(3, timeOfDay1.getMinuteOfHour());
      assertEquals(21, timeOfDay0.getHourOfDay());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(596L);
      TimeOfDay timeOfDay1 = timeOfDay0.minus((ReadablePeriod) null);
      assertEquals(4, timeOfDay1.size());
      assertEquals(596, timeOfDay1.getMillisOfSecond());
      assertEquals(0, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.withSecondOfMinute(2);
      assertEquals(2, timeOfDay1.getSecondOfMinute());
      assertEquals(4, timeOfDay0.size());
      assertEquals(21, timeOfDay0.getMinuteOfHour());
      assertEquals(320, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) ethiopicChronology0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(20, timeOfDay0.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      timeOfDay0.getFieldTypes();
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2);
      assertEquals(4, timeOfDay0.size());
  }
}
