/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:23:17 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableDateTime_ESTest extends MutableDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.property(dateTimeFieldType0);
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      mutableDateTime0.add(durationFieldType0, 0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.set((DateTimeFieldType) null, 623191204);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      mutableDateTime0.set(dateTimeFieldType0, 0);
      assertEquals(1392409260320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      mutableDateTime0.setZoneRetainFields(dateTimeZone0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 0);
      mutableDateTime0.setZoneRetainFields(dateTimeZone0);
      assertEquals(1392398481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setZone((DateTimeZone) null);
      assertEquals(0, MutableDateTime.ROUND_NONE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.add((ReadableDuration) null);
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      mutableDateTime0.setRounding(dateTimeField0, 5);
      assertEquals(5, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      mutableDateTime0.setRounding(dateTimeField0, 4);
      assertEquals(4, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      mutableDateTime0.setRounding(dateTimeField0, 3);
      assertEquals(1392595200000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      mutableDateTime0.setRounding(dateTimeField0, 2);
      assertEquals(2, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      mutableDateTime0.setRounding(dateTimeField0, 0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, 3736);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: 3736
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, (-784));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: -784
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setRounding((DateTimeField) null, 3);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) ethiopicChronology0);
      mutableDateTime0.add((ReadablePeriod) null, 1);
      assertEquals(2, MutableDateTime.ROUND_CEILING);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.year();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfMonth();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setMinuteOfHour(2);
      assertEquals(1392408141320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addWeeks(5);
      assertEquals(1395433281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) mutableDateTime0);
      MutableDateTime mutableDateTime1 = new MutableDateTime(2, 3, 5, 5, 5, 1, 0, gJChronology0);
      assertEquals(5, MutableDateTime.ROUND_HALF_EVEN);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addMonths(3);
      assertEquals(1400095281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateMidnight dateMidnight0 = new DateMidnight();
      mutableDateTime0.setMillis((ReadableInstant) dateMidnight0);
      assertEquals(1392332400000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setWeekOfWeekyear(5);
      assertEquals(1391199681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDateTime(2, 0, 5, 4, 4, 0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime mutableDateTime1 = mutableDateTime0.toMutableDateTime();
      assertEquals(5, MutableDateTime.ROUND_HALF_EVEN);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setMonthOfYear(71);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 71 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.monthOfYear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addMillis(3);
      assertEquals(1392409281323L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime1 = new MutableDateTime(mutableDateTime0, dateTimeZone0);
      assertEquals(1, MutableDateTime.ROUND_FLOOR);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekyear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setDayOfYear(5);
      assertEquals(1388953281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Duration duration0 = new Duration(mutableDateTime0, mutableDateTime0);
      mutableDateTime0.add((ReadableDuration) duration0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Instant instant0 = new Instant();
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setTime((ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setHourOfDay(5);
      assertEquals(1392351681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setMillisOfSecond(2);
      assertEquals(1392409281002L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      String string0 = mutableDateTime0.toString();
      assertEquals("2014-02-14T21:21:21.320+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setMillisOfDay(2);
      assertEquals(1392332400002L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("8a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8a\" is malformed at \"a\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDayOfMonth((-250));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -250 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1573L));
      int int0 = mutableDateTime0.getRoundingMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDayOfWeek(2250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2250 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setSecondOfMinute((-2147));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setMinuteOfDay((-2574));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2574 for minuteOfDay must be in the range [0,1439]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addMinutes(5);
      assertEquals(1392409581320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setDate(3, 3, 3);
      assertEquals((-62067178690680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(70);
      MutableDateTime mutableDateTime0 = new MutableDateTime(1, 1, 2, 1, 0, 2, 2, dateTimeZone0);
      assertEquals(5, MutableDateTime.ROUND_HALF_EVEN);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addSeconds(0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(4, 1, 3, 3, 3, 3, 3);
      assertEquals(0, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MutableDateTime mutableDateTime1 = new MutableDateTime(mutableDateTime0, islamicChronology0);
      assertEquals(5, MutableDateTime.ROUND_HALF_EVEN);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addHours(2);
      assertEquals(1392416481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfMinute();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) fixedDateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 4);
      mutableDateTime0.add((ReadablePeriod) mutablePeriod0);
      assertEquals(1392409281324L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setWeekyear(50);
      assertEquals((-60585073090680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addYears(2);
      assertEquals(1455481281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime mutableDateTime1 = mutableDateTime0.copy();
      assertNotSame(mutableDateTime0, mutableDateTime1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDate((ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setTime(1151, 1151, 1151, 1151);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1151 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeField dateTimeField0 = mutableDateTime0.getRoundingField();
      assertNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Instant instant0 = new Instant();
      MutableDateTime mutableDateTime0 = new MutableDateTime(instant0);
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfWeek();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addDays((-1188));
      assertEquals(1289766081320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      mutableDateTime0.setZone(fixedDateTimeZone0);
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setYear(1);
      assertEquals((-62131719490680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      mutableDateTime0.setRounding(dateTimeField0);
      assertEquals(1, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setSecondOfDay(4);
      assertEquals(1392332404320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addWeekyears(5);
      assertEquals(1550262081320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      mutableDateTime_Property0.roundHalfCeiling();
      assertEquals(1392591600000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) strictChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfSecond();
      mutableDateTime_Property0.addWrapField(1);
      assertEquals(1392409281321L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfYear();
      mutableDateTime_Property0.roundHalfFloor();
      assertEquals(1392418800000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = MutableDateTime.now((DateTimeZone) fixedDateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.add((long) 0);
      assertEquals(1392409281320L, mutableDateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfYear();
      mutableDateTime_Property0.set(4);
      assertEquals(1388866881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfEra();
      long long0 = mutableDateTime_Property0.getMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      mutableDateTime_Property0.add(2);
      assertEquals(1393618881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.set((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value null for secondOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.hourOfDay();
      Chronology chronology0 = mutableDateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.hourOfDay();
      mutableDateTime_Property0.roundFloor();
      assertEquals(1392408000000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      mutableDateTime_Property0.roundCeiling();
      assertEquals(1392591600000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfHour();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.getMutableDateTime();
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      mutableDateTime_Property0.roundHalfEven();
      assertEquals(1392591600000L, mutableDateTime0.getMillis());
  }
}
