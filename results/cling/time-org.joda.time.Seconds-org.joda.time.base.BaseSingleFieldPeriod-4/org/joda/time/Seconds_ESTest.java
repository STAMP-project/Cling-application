/*

 * Tue Mar 03 16:46:41 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
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
      Seconds seconds0 = Seconds.MAX_VALUE;
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((Chronology) null);
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
      Seconds seconds0 = Seconds.ONE;
      boolean boolean0 = seconds0.ZERO.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = Seconds.ZERO;
      Seconds seconds2 = seconds0.minus(seconds1);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(Integer.MAX_VALUE, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = seconds0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.hours(121);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(435600, seconds0.getSeconds());
      
      Seconds seconds1 = Seconds.seconds(2);
      assertEquals(2, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Instant instant0 = new Instant();
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      Seconds seconds1 = Seconds.TWO;
      Seconds.standardSecondsIn(seconds0);
      assertEquals(1583253984610L, instant0.getMillis());
      
      Seconds seconds2 = seconds1.minus((-1));
      assertEquals(3, seconds2.getSeconds());
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
      Seconds seconds0 = Seconds.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      boolean boolean0 = seconds0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period(1L);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.hours(121);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(435600, seconds0.getSeconds());
      
      Seconds seconds1 = Seconds.MAX_VALUE;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      assertSame(seconds2, seconds1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Weeks weeks0 = Weeks.standardWeeksIn(seconds0);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(mutablePeriod0);
      assertSame(seconds1, seconds0);
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
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      boolean boolean0 = seconds0.equals(period0);
      assertFalse(boolean0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(0, int0);
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
        Seconds.parseSeconds("c;Ir");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"c;Ir\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
