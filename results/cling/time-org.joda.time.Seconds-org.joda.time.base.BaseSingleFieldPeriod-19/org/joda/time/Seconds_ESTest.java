/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:27:48 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
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
      Seconds seconds0 = Seconds.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      int int0 = seconds0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = Seconds.TWO;
      boolean boolean0 = seconds1.equals(seconds0);
      assertFalse(boolean0);
      assertFalse(seconds0.equals((Object)seconds1));
      assertEquals(2, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Period period0 = Period.months((-236));
      boolean boolean0 = seconds0.ZERO.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.THREE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = seconds0.minus(0);
      assertEquals(Integer.MAX_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(17);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
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
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      boolean boolean0 = seconds0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = Seconds.ZERO;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      Seconds seconds3 = seconds1.plus(seconds0);
      assertSame(seconds3, seconds0);
      assertSame(seconds1, seconds2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
      
      LocalTime localTime0 = new LocalTime(0L);
      Seconds seconds2 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertSame(seconds2, seconds0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(hours0);
      assertEquals(1, seconds0.size());
      
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((-26L), (Chronology) julianChronology0);
      Seconds seconds1 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, seconds1.getSeconds());
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.ZERO;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      Seconds seconds3 = seconds1.plus(seconds0);
      assertSame(seconds1, seconds2);
      assertEquals(1, seconds3.size());
      assertSame(seconds3, seconds0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(60);
      Seconds seconds1 = seconds0.minus(60);
      Seconds seconds2 = seconds0.dividedBy(60);
      assertEquals(1, seconds2.getSeconds());
      
      Seconds seconds3 = Seconds.standardSecondsIn(seconds1);
      assertEquals(1, seconds3.size());
      assertEquals(0, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      Seconds seconds1 = Seconds.THREE;
      Seconds seconds2 = seconds0.plus(seconds1);
      assertSame(seconds2, seconds1);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Days days0 = Days.FIVE;
      // Undeclared exception!
      try { 
        seconds0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Seconds cannot be compared to class org.joda.time.Days
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.ONE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, seconds0.getSeconds());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(60);
      Seconds seconds1 = seconds0.minus(60);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertTrue(seconds2.equals((Object)seconds0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }
}
