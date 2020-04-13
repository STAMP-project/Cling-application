/*

 * Tue Mar 03 16:46:12 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      YearMonth yearMonth0 = YearMonth.now((Chronology) iSOChronology0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      Seconds seconds1 = seconds0.plus(1);
      assertEquals(1, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = seconds0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      int int0 = seconds0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Seconds seconds1 = seconds0.plus(2);
      assertEquals(2, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Days days0 = Days.standardDaysIn(seconds0);
      Duration duration0 = days0.toStandardDuration();
      Duration duration1 = duration0.plus(3468L);
      Seconds seconds1 = duration1.toStandardSeconds();
      assertEquals(3, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      boolean boolean0 = seconds0.ZERO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-5599L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Duration duration0 = Duration.millis((-909L));
      Instant instant0 = Instant.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(instant0, duration0);
      Seconds.standardSecondsIn(mutablePeriod0);
      assertEquals(1583253955736L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.MAX_VALUE;
      Seconds seconds3 = Seconds.standardSecondsIn(seconds2);
      assertSame(seconds3, seconds2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Hours hours0 = seconds0.toStandardHours();
      Seconds seconds1 = Seconds.standardSecondsIn(hours0);
      Seconds seconds2 = seconds0.plus(2);
      Seconds seconds3 = seconds2.plus(2);
      assertEquals(4, seconds3.getSeconds());
      assertEquals(2, seconds2.getSeconds());
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      boolean boolean0 = seconds0.THREE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Hours hours0 = seconds0.ZERO.toStandardHours();
      boolean boolean0 = seconds0.TWO.equals(hours0);
      assertEquals(0, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(0, int0);
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
        Seconds.parseSeconds(" instant,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \" instant,\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
