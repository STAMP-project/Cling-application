/*

 * Tue Mar 03 16:48:02 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
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
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1108L);
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
      boolean boolean0 = seconds0.TWO.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Seconds seconds1 = seconds0.THREE.minus(seconds0);
      assertEquals(3, seconds1.getSeconds());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      int int0 = seconds0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.seconds(4641);
      assertEquals(4641, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(1, seconds0.getSeconds());
      assertEquals(2, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((DateTime) null).when(readableInterval0).getEnd();
      doReturn((DateTime) null).when(readableInterval0).getStart();
      // Undeclared exception!
      try { 
        Seconds.secondsIn(readableInterval0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      boolean boolean0 = seconds0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Minutes minutes0 = seconds0.toStandardMinutes();
      Seconds seconds1 = Seconds.MAX_VALUE;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      assertSame(seconds2, seconds1);
      
      Seconds seconds3 = Seconds.standardSecondsIn(minutes0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(0, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(mutablePeriod0);
      Seconds seconds2 = seconds1.plus(seconds0);
      assertSame(seconds1, seconds0);
      assertEquals(2, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Period period0 = seconds0.THREE.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertEquals(3, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      boolean boolean0 = seconds0.TWO.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Weeks weeks0 = Weeks.THREE;
      boolean boolean0 = seconds0.THREE.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      int int0 = seconds0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(3, seconds0.getSeconds());
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
        Seconds.parseSeconds("PT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"PT\" is too short
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
