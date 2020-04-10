/*

 * Tue Mar 03 17:12:59 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Hours hours0 = Hours.standardHoursIn(minutes0);
      assertEquals(0, hours0.getHours());
      assertEquals(1, hours0.size());
      assertEquals(1, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Hours hours0 = Hours.hoursIn(mutableInterval0);
      Hours hours1 = hours0.minus(6);
      assertEquals((-6), hours1.getHours());
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      MutablePeriod mutablePeriod0 = hours0.FIVE.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertEquals(7, hours0.getHours());
      assertEquals(5, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      boolean boolean0 = hours0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      int int0 = hours0.SIX.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      int int0 = hours0.THREE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(3, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.hours(3);
      assertEquals(3, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours2.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.MAX_VALUE.equals(hours0);
      assertFalse(boolean0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ZERO;
      Hours hours0 = days0.toStandardHours();
      boolean boolean0 = hours0.SEVEN.equals(days0);
      assertFalse(boolean0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Years years0 = Years.MAX_VALUE;
      // Undeclared exception!
      try { 
        hours0.compareTo((BaseSingleFieldPeriod) years0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Years
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Hours hours0 = Hours.hoursIn(mutableInterval0);
      Hours hours1 = Hours.hours(6);
      assertEquals(6, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(1, hours2.size());
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Hours hours0 = Hours.hoursBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Hours hours1 = hours0.minus((-1));
      assertEquals(1, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours0.getHours());
      assertSame(hours2, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }
}
