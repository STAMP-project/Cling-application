/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:33:41 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isLessThan(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isGreaterThan(minutes1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(14);
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertTrue(boolean0);
      assertEquals(14, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes((-295));
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertFalse(boolean0);
      assertEquals((-295), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.isGreaterThan(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = minutes0.dividedBy(1);
      assertEquals(1, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = minutes0.dividedBy(2);
      boolean boolean0 = minutes0.isLessThan(minutes1);
      assertTrue(boolean0);
      assertEquals((-1073741824), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) null);
      minutes0.MIN_VALUE.minus((Minutes) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(14);
      Minutes minutes1 = minutes0.plus((Minutes) null);
      assertEquals(14, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(30);
      Minutes minutes1 = minutes0.TWO.plus(minutes0);
      assertEquals(32, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(14);
      Minutes minutes1 = Minutes.parseMinutes((String) null);
      Minutes minutes2 = minutes0.minus(minutes1);
      assertEquals(14, minutes2.getMinutes());
      assertSame(minutes2, minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("]r?OhA|[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"]r?OhA|[\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Interval interval0 = Interval.parse((String) null);
      Minutes minutes0 = Minutes.minutesIn(interval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(3, 3);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 0);
      LocalDate localDate0 = new LocalDate((long) 0);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.ONE;
      Minutes minutes2 = minutes0.minus(minutes1);
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(14);
      Duration duration0 = minutes0.ZERO.toStandardDuration();
      assertEquals(14, minutes0.getMinutes());
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = minutes0.THREE.multipliedBy(10);
      assertEquals(30, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Seconds seconds0 = minutes0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Hours hours0 = minutes0.toStandardHours();
      assertEquals((-35791394), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      String string0 = minutes0.toString();
      assertEquals("PT1M", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.getMinutes();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      PeriodType periodType0 = minutes0.ZERO.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) null);
      Days days0 = minutes0.THREE.toStandardDays();
      assertEquals(0, days0.getDays());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = minutes0.TWO.negated();
      assertEquals((-2), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Weeks weeks0 = minutes0.toStandardWeeks();
      assertEquals(213044, weeks0.getWeeks());
  }
}
