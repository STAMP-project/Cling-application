/*

 * Tue Mar 03 16:48:08 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.ONE;
      int int0 = seconds1.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, seconds1.getSeconds());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
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
      Seconds seconds0 = Seconds.TWO;
      Locale locale0 = Locale.US;
      boolean boolean0 = seconds0.TWO.equals(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = seconds0.plus(0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(86400);
      Seconds seconds1 = seconds0.ONE.plus(86400);
      assertEquals(86401, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.ONE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period(2, 2, 2, 2);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(7322, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Period period0 = seconds0.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Interval interval0 = Interval.parse((String) null);
      Seconds.secondsIn(interval0);
      assertEquals(1583254074259L, interval0.getStartMillis());
      assertEquals(1583254074259L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      boolean boolean0 = seconds0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Period period0 = seconds0.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      Seconds seconds2 = seconds1.dividedBy(18);
      assertEquals(0, seconds2.getSeconds());
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period(1832L);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(1, seconds0.getSeconds());
      
      Seconds seconds1 = Seconds.MAX_VALUE;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      assertSame(seconds2, seconds1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.THREE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(86400);
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(86400, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.ONE;
      int int0 = seconds1.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, int0);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
