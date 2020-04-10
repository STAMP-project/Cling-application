/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:40:47 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BaseInterval_ESTest extends BaseInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.FOUR;
      Instant instant0 = new Instant();
      MutableInterval mutableInterval0 = new MutableInterval(days0, instant0);
      Interval interval0 = new Interval(mutableInterval0);
      assertEquals(1392063681320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) copticChronology0);
      Interval interval0 = new Interval((ReadablePeriod) null, mutableDateTime0);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Seconds seconds0 = weeks0.toStandardSeconds();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) gregorianChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      MutableInterval mutableInterval0 = new MutableInterval(seconds0, dateMidnight0);
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, gregorianChronology0);
      assertEquals(1391122800000L, mutableInterval0.getStartMillis());
      assertTrue(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadablePeriod) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-1496L));
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1496L));
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval(dateTime0, mutablePeriod0);
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
      DateTime dateTime0 = new DateTime();
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, dateTime0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) copticChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(mutableDateTime0, mutableDateTime0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.millis((-2870L));
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval((ReadableInstant) null, duration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = new Duration(355L);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, mutableDateTime0);
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

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
      
      Interval interval0 = mutableInterval0.toInterval();
      assertEquals(1392409281320L, interval0.getEndMillis());
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
      assertEquals(1392409281320L, interval0.getStartMillis());
  }
}
