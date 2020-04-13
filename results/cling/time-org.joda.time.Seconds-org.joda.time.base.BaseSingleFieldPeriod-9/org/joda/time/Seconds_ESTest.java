/*

 * Tue Mar 03 16:47:12 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) buddhistChronology0);
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.equals("ReadableInstant objects must not be null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
      Seconds seconds1 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds2 = seconds0.TWO.plus(seconds1);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(2, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      Seconds seconds2 = seconds0.minus(seconds1);
      Weeks.standardWeeksIn(seconds2);
      assertSame(seconds1, seconds0);
      assertEquals(0, seconds2.getSeconds());
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      int int0 = seconds0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = seconds0.minus(seconds0);
      Weeks weeks0 = Weeks.standardWeeksIn(seconds1);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.seconds(956);
      assertEquals(956, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Period period0 = new Period();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds2, seconds0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = seconds0.ONE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = seconds0.dividedBy(746);
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      assertEquals(3, seconds0.getSeconds());
      assertEquals(0, seconds2.getSeconds());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((-2549L), dateTimeZone0);
      Seconds seconds3 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1668L, (Chronology) iSOChronology0);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
      
      Hours hours0 = Hours.ZERO;
      Seconds seconds2 = Seconds.standardSecondsIn(hours0);
      assertEquals(0, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.THREE.equals(seconds0);
      assertEquals(2, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Months months0 = Months.FIVE;
      Seconds seconds0 = Seconds.seconds((-2147480048));
      boolean boolean0 = seconds0.MIN_VALUE.equals(months0);
      assertFalse(boolean0);
      assertEquals((-2147480048), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
