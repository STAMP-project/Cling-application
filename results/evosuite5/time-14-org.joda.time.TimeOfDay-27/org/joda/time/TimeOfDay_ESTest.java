/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:35:45 GMT 2019
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
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      Months months0 = Months.TWELVE;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withPeriodAdded(months0, 0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      TimeOfDay timeOfDay1 = timeOfDay0.withField(dateTimeFieldType0, 0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      TimeOfDay timeOfDay1 = timeOfDay0.withField(dateTimeFieldType0, 0);
      assertEquals(0, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withChronologyRetainFields((Chronology) null);
      assertEquals(4, timeOfDay1.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.getField(153692453);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 153692453
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(mockGregorianCalendar0);
      assertEquals(21, timeOfDay0.getSecondOfMinute());
      assertEquals(21, timeOfDay0.getMinuteOfHour());
      assertEquals(20, timeOfDay0.getHourOfDay());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 3);
      assertEquals(0, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 2, (Chronology) null);
      assertEquals(0, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(14, 14);
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      assertEquals(2, TimeOfDay.SECOND_OF_MINUTE);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusSeconds(2);
      assertEquals(2, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusMinutes(1);
      assertEquals(59, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusMinutes(3);
      assertEquals(3, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusMillis(1);
      assertEquals(1, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      Minutes minutes0 = Minutes.minutes(1);
      TimeOfDay timeOfDay1 = timeOfDay0.plus(minutes0);
      assertEquals(22, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 0);
      assertEquals(2, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withChronologyRetainFields(copticChronology0);
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0);
      assertTrue(timeOfDay1.equals((Object)timeOfDay0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusHours(3);
      assertEquals(21, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusSeconds(3);
      assertEquals(57, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTime dateTime0 = timeOfDay0.toDateTimeToday();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withMillisOfSecond(0);
      assertEquals(0, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, buddhistChronology0);
      assertEquals(21, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      timeOfDay0.MIDNIGHT.toLocalTime();
      assertEquals(21, timeOfDay0.getSecondOfMinute());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withHourOfDay(0);
      assertEquals(0, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType[] dateTimeFieldTypeArray0 = timeOfDay0.getFieldTypes();
      assertEquals(4, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
      
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusMillis(0);
      assertEquals(0, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusHours(1);
      assertEquals(4, timeOfDay1.size());
      assertEquals(1, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, 0, (Chronology) null);
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withMinuteOfHour(3);
      assertEquals(4, timeOfDay1.size());
      assertEquals(3, timeOfDay1.getMinuteOfHour());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(21, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-2093L));
      assertEquals(4, timeOfDay0.size());
      assertEquals(57, timeOfDay0.getSecondOfMinute());
      assertEquals(59, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minus((ReadablePeriod) null);
      assertEquals(4, timeOfDay1.size());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(21, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.withSecondOfMinute(3);
      assertEquals(3, timeOfDay1.getSecondOfMinute());
      assertEquals(320, timeOfDay1.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
      assertEquals(21, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) iSOChronology0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(21, timeOfDay0.getHourOfDay());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((-2538L));
      String string0 = timeOfDay0.toString();
      assertEquals("T23:59:57.462", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }
}
