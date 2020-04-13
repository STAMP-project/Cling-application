/*

 * Tue Mar 03 16:48:50 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
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
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      int int0 = seconds0.ONE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
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
      Seconds seconds0 = Seconds.ONE;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 27, (Chronology) ethiopicChronology0);
      Seconds seconds1 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      Seconds seconds3 = seconds1.plus(seconds0);
      assertSame(seconds1, seconds2);
      assertSame(seconds3, seconds0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = seconds0.THREE.equals(object0);
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
      Seconds seconds0 = Seconds.THREE;
      Period period0 = seconds0.TWO.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertEquals(2, seconds1.getSeconds());
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      int int0 = seconds0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
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
      Seconds seconds0 = Seconds.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      boolean boolean0 = seconds0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((-941L));
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      MonthDay monthDay0 = new MonthDay();
      Seconds seconds1 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds2, seconds0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 27, (Chronology) ethiopicChronology0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds seconds1 = seconds0.MAX_VALUE.negated();
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds2.getSeconds());
      
      Seconds seconds3 = seconds1.negated();
      assertEquals((-2147483647), seconds1.getSeconds());
      assertEquals(Integer.MAX_VALUE, seconds3.getSeconds());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Days days0 = hours0.toStandardDays();
      Seconds seconds0 = Seconds.standardSecondsIn(days0);
      Seconds seconds1 = Seconds.THREE;
      Seconds seconds2 = seconds0.plus(seconds1);
      assertEquals(0, seconds0.getSeconds());
      assertSame(seconds2, seconds1);
      assertEquals(1, seconds2.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      boolean boolean0 = seconds0.MIN_VALUE.equals(seconds0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Seconds seconds0 = Seconds.standardSecondsIn(hours0);
      boolean boolean0 = seconds0.equals(hours0);
      assertEquals(5, hours0.getHours());
      assertEquals(18000, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.ONE;
      int int0 = seconds1.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
      assertEquals(1, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
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
        Seconds.parseSeconds("`Zfe%Ccj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"`Zfe%Ccj\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
