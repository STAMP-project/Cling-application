/*

 * Tue Mar 03 16:46:08 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
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
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, int0);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      boolean boolean0 = seconds0.MIN_VALUE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = Seconds.ZERO;
      Seconds seconds2 = seconds0.minus(seconds1);
      assertEquals(3, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = seconds0.minus(seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      int int0 = seconds0.THREE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.seconds((-1));
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals((-1), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      boolean boolean0 = seconds0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Hours hours0 = Hours.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(hours0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      assertEquals(0, seconds0.getSeconds());
      
      Hours hours0 = Hours.ONE;
      Seconds seconds1 = Seconds.standardSecondsIn(hours0);
      assertEquals(1, hours0.getHours());
      assertEquals(3600, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.seconds(3);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      Seconds seconds1 = seconds0.dividedBy(3);
      assertEquals(3, seconds0.getSeconds());
      assertEquals(1, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Period period0 = seconds0.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      boolean boolean0 = seconds0.ZERO.equals(seconds0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      Seconds seconds0 = Seconds.secondsIn(interval0);
      Minutes minutes0 = seconds0.MAX_VALUE.toStandardMinutes();
      boolean boolean0 = seconds0.equals(minutes0);
      assertEquals(1583253950866L, interval0.getStartMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
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
        Seconds.parseSeconds("<?X0M5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"<?X0M5\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
