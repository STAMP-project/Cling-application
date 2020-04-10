/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:48:48 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Minutes minutes0 = seconds0.toStandardMinutes();
      Minutes minutes1 = Minutes.TWO;
      boolean boolean0 = minutes0.isLessThan(minutes1);
      assertTrue(boolean0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) null);
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertFalse(boolean0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Minutes minutes0 = seconds0.toStandardMinutes();
      boolean boolean0 = minutes0.isLessThan(minutes0);
      assertFalse(boolean0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isGreaterThan(minutes1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      boolean boolean0 = minutes0.isGreaterThan(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = minutes0.ZERO.dividedBy(1);
      assertNotSame(minutes0, minutes1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.dividedBy(Integer.MIN_VALUE);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = minutes0.MIN_VALUE.minus((Minutes) null);
      assertEquals(1, minutes1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = minutes0.plus((Minutes) null);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.plus(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
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
      MutableInterval mutableInterval0 = new MutableInterval((Object) null, (Chronology) null);
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1);
      Partial partial0 = new Partial(localTime0);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) partial0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) buddhistChronology0);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes0.getMinutes());
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
      Minutes minutes0 = Minutes.minutes(3);
      assertEquals(3, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1);
      assertEquals(1, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Duration duration0 = minutes0.toStandardDuration();
      assertEquals(180000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = minutes0.multipliedBy(0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Seconds seconds0 = minutes0.ZERO.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      // Undeclared exception!
      try { 
        minutes0.MIN_VALUE.minus(minutes0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -2
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Minutes minutes0 = seconds0.toStandardMinutes();
      Hours hours0 = minutes0.MAX_VALUE.toStandardHours();
      assertEquals(35791394, hours0.getHours());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      String string0 = minutes0.toString();
      assertEquals("PT0M", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) null);
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertFalse(boolean0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.getMinutes();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      PeriodType periodType0 = minutes0.MIN_VALUE.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Days days0 = minutes0.MIN_VALUE.toStandardDays();
      assertEquals((-1491308), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.TWO.negated();
      assertEquals((-2), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Weeks weeks0 = minutes0.ZERO.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }
}
