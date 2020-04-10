/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:38:34 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BaseInterval_ESTest extends BaseInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("}35aPE9yK:bC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: }35aPE9yK:bC
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L));
      assertEquals((-1L), interval0.getStartMillis());
      
      MutableInterval mutableInterval0 = new MutableInterval(interval0);
      assertEquals((-1L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      DateTime dateTime0 = new DateTime((-1L), dateTimeZone0);
      Hours hours0 = Hours.EIGHT;
      Interval interval0 = new Interval(hours0, dateTime0);
      assertEquals((-28800001L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadablePeriod) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval((ReadableInstant) null, hours0);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1011));
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval((ReadableInstant) null, dateMidnight0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Instant instant0 = new Instant(9L);
      Interval interval0 = new Interval(instant0, instant0);
      assertEquals(9L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Interval interval0 = duration0.toIntervalFrom((ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: 
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      Interval interval0 = duration0.toIntervalTo((ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      MutableInterval mutableInterval0 = new MutableInterval(interval0, julianChronology0);
      // Undeclared exception!
      try { 
        mutableInterval0.setEndMillis(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }
}
