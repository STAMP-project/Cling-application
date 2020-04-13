/*

 * Tue Mar 03 16:46:03 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Interval interval0 = new Interval(0L, 0L);
      Seconds seconds0 = Seconds.secondsIn(interval0);
      Seconds seconds1 = Seconds.MAX_VALUE;
      int int0 = seconds0.ONE.compareTo((BaseSingleFieldPeriod) seconds1);
      assertEquals(0, seconds0.getSeconds());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      boolean boolean0 = seconds0.THREE.equals("g+Y|dk[]j");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1651)).when(dateTimeZone0).getOffset(anyLong());
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(1583253948979L, dateTime0.getMillis());
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      int int0 = seconds0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1651)).when(dateTimeZone0).getOffset(anyLong());
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      seconds0.plus(27);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(1583253948297L, dateTime0.getMillis());
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      Seconds seconds2 = seconds0.minus(seconds1);
      Seconds.standardSecondsIn(seconds2);
      assertSame(seconds1, seconds0);
      assertEquals(0, seconds2.getSeconds());
      assertNotSame(seconds0, seconds2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.seconds(3);
      assertEquals(3, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Hours hours0 = Hours.TWO;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      boolean boolean0 = seconds0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      assertEquals(1, seconds0.size());
      
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, (Chronology) julianChronology0);
      Seconds seconds1 = Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds2.getSeconds());
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.MAX_VALUE;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      assertSame(seconds2, seconds1);
      
      Seconds seconds3 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.millis(1688);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(1936);
      boolean boolean0 = seconds0.ONE.equals(seconds0);
      assertEquals(1936, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Months months0 = Months.SEVEN;
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.ONE.equals(months0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Interval interval0 = new Interval(0L, 0L);
      Seconds seconds0 = Seconds.secondsIn(interval0);
      int int0 = seconds0.ONE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1651)).when(dateTimeZone0).getOffset(anyLong());
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1583253944460L, dateTime0.getMillis());
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
        Seconds.parseSeconds("yyyy-MM-dd'T'HH:mm:ss.SSS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"yyyy-MM-dd'T'HH:mm:ss.SSS\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
