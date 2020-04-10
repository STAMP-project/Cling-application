/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:28:21 GMT 2019
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
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      int int0 = hours0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      int int0 = hours0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(4, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Days days0 = Days.ZERO;
      // Undeclared exception!
      try { 
        hours0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Days
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Hours hours0 = Hours.standardHoursIn(seconds0);
      assertEquals(0, hours0.getHours());
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      boolean boolean0 = hours0.MIN_VALUE.equals("File directory doesn't exist: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      boolean boolean0 = hours0.SIX.equals(hours0);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.FOUR;
      Hours hours0 = days0.toStandardHours();
      boolean boolean0 = hours0.THREE.equals(days0);
      assertEquals(4, days0.getDays());
      assertFalse(boolean0);
      assertEquals(96, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.hours(8);
      assertEquals(8, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      boolean boolean0 = hours0.THREE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      int int0 = hours0.FIVE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Hours hours1 = Hours.ZERO;
      Hours hours2 = hours1.plus(hours0);
      assertSame(hours2, hours0);
      
      Hours hours3 = Hours.standardHoursIn(hours1);
      assertEquals(0, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.hours(4);
      assertEquals(4, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.hours(2);
      Hours hours0 = Hours.standardHoursIn(period0);
      assertEquals(2, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-790L), 3600000L);
      Hours hours0 = Hours.standardHoursIn(mutablePeriod0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) copticChronology0);
      Days days0 = Days.daysBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Hours hours0 = Hours.standardHoursIn(days0);
      Hours hours1 = Hours.ONE;
      Hours hours2 = hours0.SIX.minus(hours1);
      assertEquals(0, hours0.getHours());
      assertEquals(5, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(3, 10, 10, 4487);
      Hours hours0 = Hours.standardHoursIn(mutablePeriod0);
      assertEquals(3, hours0.getHours());
  }
}
