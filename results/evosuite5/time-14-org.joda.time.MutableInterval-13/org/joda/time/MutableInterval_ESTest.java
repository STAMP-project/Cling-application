/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:26:18 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setPeriodBeforeEnd((ReadablePeriod) null);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Period period0 = Period.hours((-692));
      // Undeclared exception!
      try { 
        mutableInterval0.setPeriodBeforeEnd(period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      mutableInterval0.setPeriodAfterStart((ReadablePeriod) null);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Minutes minutes0 = hours0.toStandardMinutes();
      Duration duration0 = minutes0.toStandardDuration();
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      mutableInterval0.setPeriodAfterStart(hours0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      mutableInterval0.setInterval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      // Undeclared exception!
      try { 
        mutableInterval0.setInterval((ReadableInstant) null, (ReadableInstant) dateMidnight0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getStart();
      mutableInterval0.setInterval((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      // Undeclared exception!
      try { 
        mutableInterval0.setInterval((ReadableInterval) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Interval must not be null
         //
         verifyException("org.joda.time.MutableInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      LocalDate localDate0 = new LocalDate(26607895200000L, (DateTimeZone) null);
      Interval interval0 = localDate0.toInterval();
      mutableInterval0.setInterval((ReadableInterval) interval0);
      assertEquals(26607913200000L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(207L, dateTimeZone0);
      MutableInterval mutableInterval0 = new MutableInterval(mutableDateTime0, mutableDateTime0);
      assertEquals(207L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      mutableInterval0.setDurationAfterStart(0L);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.ZERO;
      Period period0 = days0.toPeriod();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      MutableInterval mutableInterval0 = new MutableInterval(period0, dateTime0);
      mutableInterval0.setEnd(dateTime0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Duration duration0 = Duration.standardMinutes((-872L));
      // Undeclared exception!
      try { 
        mutableInterval0.setDurationBeforeEnd((ReadableDuration) duration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      MutableInterval mutableInterval1 = mutableInterval0.copy();
      assertNotSame(mutableInterval0, mutableInterval1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(3423L, dateTimeZone0);
      Period period0 = new Period();
      Days days0 = Days.standardDaysIn(period0);
      MutableInterval mutableInterval0 = new MutableInterval(mutableDateTime0, days0);
      assertEquals(3423L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      // Undeclared exception!
      try { 
        mutableInterval0.setStart((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      mutableInterval0.setDurationBeforeEnd(15308640144L);
      assertEquals(1377100641176L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      Duration duration0 = mutableInterval0.toDuration();
      MutableInterval mutableInterval1 = new MutableInterval((ReadableInstant) null, duration0);
      assertEquals(1392409281320L, mutableInterval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval(object0, islamicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No interval converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("...");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: ...
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      mutableInterval0.setDurationAfterStart((ReadableDuration) duration0);
      assertEquals(0L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-931L), (-931L));
      assertEquals((-931L), mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(0L, 1154L, lenientChronology0);
      assertEquals(1154L, mutableInterval0.getEndMillis());
  }
}
