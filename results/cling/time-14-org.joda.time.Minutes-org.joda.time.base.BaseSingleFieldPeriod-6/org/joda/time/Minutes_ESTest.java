/*

 * Tue Mar 03 17:09:47 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      minutes0.plus(minutes0);
      assertEquals(1583255375258L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.hours((-728));
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals((-43680), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Days days0 = Days.ZERO;
      // Undeclared exception!
      try { 
        minutes0.THREE.compareTo((BaseSingleFieldPeriod) days0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Days
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.THREE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(3402L);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      boolean boolean0 = minutes0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(3, minutes0.getMinutes());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Minutes.standardMinutesIn(minutes0);
      Minutes minutes1 = Minutes.MAX_VALUE;
      minutes0.plus(minutes1);
      assertEquals(1583255374241L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
      
      LocalTime localTime0 = new LocalTime();
      Minutes minutes2 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      int int0 = minutes0.THREE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Hours.standardHoursIn(minutes0);
      Minutes minutes1 = Minutes.THREE;
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      int int0 = minutes0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1);
      assertEquals(1, minutes0.getMinutes());
      
      Minutes minutes1 = Minutes.ZERO;
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.MIN_VALUE.equals(minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Hours hours0 = Hours.FOUR;
      boolean boolean0 = minutes0.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.chrono.BasicWeekOf...\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }
}
