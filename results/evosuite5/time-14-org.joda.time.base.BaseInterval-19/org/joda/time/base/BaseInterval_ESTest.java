/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:34:23 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BaseInterval_ESTest extends BaseInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("yx0;6_[{B-1e*7Mh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: yx0;6_[{B-1e*7Mh
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-2060L), (-2060L));
      assertEquals((-2060L), mutableInterval0.getStartMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      Interval interval0 = new Interval(mutableInterval0, strictChronology0);
      assertEquals((-2060L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
      
      Interval interval0 = new Interval(mutableInterval0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: 
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) gregorianChronology0);
      MutableInterval mutableInterval0 = new MutableInterval((ReadablePeriod) null, dateTime0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Interval interval0 = new Interval(mutablePeriod0, (ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadablePeriod) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, mutablePeriod0);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      Interval interval0 = new Interval((ReadableInstant) null, instant0);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      assertEquals(1392332400000L, interval0.getStartMillis());
      assertEquals(1392418800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      Duration duration0 = new Duration(2443L, (-1L));
      // Undeclared exception!
      try { 
        mutableInterval0.setDurationAfterStart((ReadableDuration) duration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Instant instant0 = Instant.now();
      Minutes minutes0 = Minutes.TWO;
      Duration duration0 = minutes0.toStandardDuration();
      MutableInterval mutableInterval0 = new MutableInterval(instant0, duration0);
      assertEquals(1392409401320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = new Duration(2443L, (-1L));
      // Undeclared exception!
      try { 
        duration0.toIntervalTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }
}
