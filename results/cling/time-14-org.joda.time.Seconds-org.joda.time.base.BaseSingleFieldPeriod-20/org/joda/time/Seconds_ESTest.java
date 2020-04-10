/*

 * Tue Mar 03 16:49:27 GMT 2020
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
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
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
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Minutes minutes0 = seconds0.toStandardMinutes();
      Seconds seconds1 = Seconds.ONE;
      Seconds seconds2 = seconds0.plus(seconds1);
      assertSame(seconds2, seconds1);
      
      Seconds seconds3 = Seconds.standardSecondsIn(minutes0);
      assertEquals(0, seconds3.getSeconds());
      assertEquals(1, seconds3.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Object object0 = new Object();
      boolean boolean0 = seconds0.TWO.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = seconds0.THREE.minus(0);
      assertEquals(3, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      int int0 = seconds0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.hours((-1));
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals((-3600), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Months months0 = Months.ZERO;
      Seconds seconds1 = Seconds.standardSecondsIn(months0);
      Seconds seconds2 = seconds1.plus(seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertSame(seconds2, seconds0);
      assertEquals(2, seconds0.getSeconds());
      assertEquals(1, seconds2.size());
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
      Seconds seconds0 = Seconds.ZERO;
      boolean boolean0 = seconds0.TWO.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Days days0 = seconds0.toStandardDays();
      Seconds seconds1 = Seconds.standardSecondsIn(days0);
      assertEquals(1, seconds1.size());
      assertEquals(0, seconds1.getSeconds());
      assertEquals(0, seconds0.getSeconds());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = Days.standardDaysIn(seconds0);
      Seconds seconds1 = days0.toStandardSeconds();
      assertEquals(3, seconds0.getSeconds());
      assertEquals(0, seconds1.getSeconds());
      assertEquals(1, seconds1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MonthDay monthDay0 = MonthDay.now((DateTimeZone) fixedDateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Period period0 = seconds0.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Period period0 = seconds0.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      boolean boolean0 = seconds0.ONE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = Days.standardDaysIn(seconds0);
      boolean boolean0 = seconds0.ZERO.equals(days0);
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
      assertEquals(3, seconds0.getSeconds());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(3, seconds0.getSeconds());
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
