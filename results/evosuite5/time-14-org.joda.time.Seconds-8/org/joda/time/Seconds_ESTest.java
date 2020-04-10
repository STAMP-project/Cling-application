/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:40:31 GMT 2019
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
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Interval interval0 = new Interval(2551440384L, 2551440384L);
      Seconds seconds1 = Seconds.secondsIn(interval0);
      boolean boolean0 = seconds1.isLessThan(seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.isLessThan(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = Seconds.ZERO;
      boolean boolean0 = seconds0.isGreaterThan(seconds1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.isGreaterThan(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = seconds0.dividedBy(1);
      assertEquals(3, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = seconds0.MAX_VALUE.dividedBy(2885);
      assertEquals(744361, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = seconds0.minus((Seconds) null);
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = seconds0.MAX_VALUE.plus((Seconds) null);
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      // Undeclared exception!
      try { 
        seconds0.THREE.plus(seconds0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 3 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.parseSeconds((String) null);
      Seconds seconds2 = seconds0.minus(seconds1);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(2, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds(", ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \", \"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-334L));
      LocalDateTime localDateTime0 = new LocalDateTime((-334L));
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
  public void test18()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      String string0 = seconds0.toString();
      assertEquals("PT3S", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = seconds0.ZERO.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2059L), (-2059L));
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      int int0 = seconds0.getSeconds();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Hours hours0 = seconds0.MAX_VALUE.toStandardHours();
      assertEquals(596523, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Minutes minutes0 = seconds0.ONE.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = seconds0.negated();
      assertEquals((-2147483647), seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      // Undeclared exception!
      try { 
        seconds0.MAX_VALUE.multipliedBy(1631);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 1631
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Weeks weeks0 = seconds0.THREE.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      PeriodType periodType0 = seconds0.TWO.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Duration duration0 = seconds0.THREE.toStandardDuration();
      assertEquals(3000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
  }
}
