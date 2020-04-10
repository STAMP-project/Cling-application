/*

 * Tue Mar 03 16:47:34 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      int int0 = seconds0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = seconds0.MIN_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = Seconds.ZERO;
      Seconds seconds2 = seconds0.plus(seconds1);
      assertEquals(3, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      int int0 = seconds0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = seconds0.minus((-2051));
      assertEquals(2051, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds2.getSeconds());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Period period0 = seconds0.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertSame(seconds1, seconds0);
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
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      boolean boolean0 = seconds0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      assertEquals(1, seconds0.size());
      
      YearMonth yearMonth0 = YearMonth.now();
      Seconds seconds1 = Seconds.secondsBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds2, seconds0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(mutablePeriod0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(mutablePeriod0);
      assertSame(seconds1, seconds0);
      
      Seconds seconds2 = Seconds.seconds(3);
      assertEquals(3, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.MAX_VALUE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Minutes minutes0 = seconds0.toStandardMinutes();
      boolean boolean0 = seconds0.ZERO.equals(minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(3, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, int0);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("q:,$<Z'*m}-WM;>E=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"q:,$<Z'*m}-WM;>E=\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
