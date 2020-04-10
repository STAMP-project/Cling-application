/*

 * Tue Mar 03 16:46:44 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
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
      Seconds seconds0 = Seconds.THREE;
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(3, seconds0.getSeconds());
      assertEquals(0, int0);
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
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.TWO.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = seconds0.plus(0);
      assertEquals(Integer.MAX_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      int int0 = seconds0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Weeks weeks0 = Weeks.THREE;
      MutablePeriod mutablePeriod0 = seconds0.THREE.toMutablePeriod();
      Seconds seconds1 = weeks0.toStandardSeconds();
      assertEquals(3, weeks0.getWeeks());
      assertEquals(1814400, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(mutablePeriod0);
      assertEquals(3, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2958L);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      assertEquals(2, seconds0.getSeconds());
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
      Seconds seconds0 = Seconds.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      boolean boolean0 = seconds0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(1, seconds1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      Seconds seconds2 = seconds0.minus(seconds1);
      assertSame(seconds1, seconds0);
      assertEquals(0, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Hours hours0 = seconds0.toStandardHours();
      Seconds.standardSecondsIn(hours0);
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
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
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = seconds0.multipliedBy(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, seconds1.getSeconds());
      
      Minutes minutes0 = seconds0.toStandardMinutes();
      Seconds seconds2 = Seconds.standardSecondsIn(minutes0);
      assertEquals(1, seconds0.getSeconds());
      assertEquals(1, seconds2.size());
      assertEquals(0, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.MAX_VALUE.equals(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = weeks0.toStandardSeconds();
      boolean boolean0 = seconds0.THREE.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(604800, seconds0.getSeconds());
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, seconds0.getSeconds());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.MAX_VALUE;
      int int0 = seconds0.THREE.compareTo((BaseSingleFieldPeriod) seconds1);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("The calendar must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"The calendar must not be null\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
