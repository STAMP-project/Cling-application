/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:34:37 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LimitChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BaseInterval_ESTest extends BaseInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("!&.l");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: !&.l
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Interval interval0 = yearMonth0.toInterval();
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutableInterval mutableInterval0 = new MutableInterval(interval0, gJChronology0);
      assertEquals(1393628400000L, mutableInterval0.getEndMillis());
      assertEquals(1391209200000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("P3W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: P3W
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Months months0 = Months.FIVE;
      MutableInterval mutableInterval0 = new MutableInterval(months0, (ReadableInstant) null);
      assertEquals(1379186481320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1208L));
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval((ReadableInstant) null, mutableDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Interval interval0 = yearMonth0.toInterval();
      MutableInterval mutableInterval0 = new MutableInterval(interval0);
      assertEquals(1393628400000L, mutableInterval0.getEndMillis());
      assertEquals(1391209200000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadablePeriod) null);
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      mutableInterval0.setInterval((ReadableInterval) interval0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight((long) 0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(iSOChronology0, dateMidnight0, (ReadableDateTime) null);
      DateTime dateTime0 = limitChronology0.getLowerLimit();
      Duration duration0 = new Duration((long) 0);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, duration0);
      assertEquals((-3600000L), mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Interval interval0 = new Interval((ReadableInstant) null, weeks0);
      Interval interval1 = interval0.withPeriodBeforeEnd(weeks0);
      assertTrue(interval1.equals((Object)interval0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.millis((-2438));
      Duration duration0 = period0.toStandardDuration();
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        duration0.toIntervalTo(dateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }
}
