/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:36:00 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      int int0 = seconds0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      boolean boolean0 = seconds0.ZERO.equals(seconds0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.FOUR;
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.MIN_VALUE.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Object object0 = new Object();
      boolean boolean0 = seconds0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(days0);
      Seconds seconds1 = seconds0.minus(seconds0);
      assertSame(seconds1, seconds0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.MIN_VALUE.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = seconds0.toStandardDays();
      Seconds seconds1 = Seconds.standardSecondsIn(days0);
      Seconds seconds2 = seconds1.plus(Integer.MAX_VALUE);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(Integer.MAX_VALUE, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Partial partial0 = new Partial();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((PeriodType) null);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      Seconds seconds1 = Seconds.TWO;
      Seconds seconds2 = seconds0.plus(seconds1);
      assertSame(seconds2, seconds1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(1);
      Weeks weeks0 = seconds0.toStandardWeeks();
      Seconds seconds1 = Seconds.standardSecondsIn(weeks0);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(0, seconds1.getSeconds());
      assertEquals(1, seconds0.getSeconds());
      assertEquals(1, seconds1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.weeks(105);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(63504000, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = seconds0.toStandardDays();
      Seconds seconds1 = Seconds.standardSecondsIn(days0);
      Seconds seconds2 = seconds1.plus(seconds0);
      assertSame(seconds2, seconds0);
      assertEquals(0, days0.getDays());
      assertEquals(0, seconds1.getSeconds());
      assertEquals(1, seconds2.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      int int0 = seconds0.THREE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Minutes minutes0 = Minutes.MIN_VALUE;
      // Undeclared exception!
      try { 
        seconds0.compareTo((BaseSingleFieldPeriod) minutes0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Seconds cannot be compared to class org.joda.time.Minutes
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      int int0 = seconds0.THREE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.FOUR;
      Seconds seconds0 = Seconds.standardSecondsIn(days0);
      Seconds seconds1 = seconds0.minus(seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(4, days0.getDays());
      assertEquals(345600, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }
}
