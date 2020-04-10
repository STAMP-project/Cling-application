/*

 * Tue Mar 03 17:12:43 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
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
      Hours hours0 = Hours.hours((-3461));
      assertEquals((-3461), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.MAX_VALUE.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      int int0 = hours0.EIGHT.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      int int0 = hours0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(5, hours0.getHours());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      MutablePeriod mutablePeriod0 = hours0.ONE.toMutablePeriod();
      boolean boolean0 = hours0.SEVEN.equals(mutablePeriod0);
      assertEquals(1, hours0.size());
      assertFalse(boolean0);
      assertEquals(2, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      boolean boolean0 = hours0.ONE.equals(hours0);
      assertFalse(boolean0);
      assertEquals(6, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Years years0 = Years.MAX_VALUE;
      // Undeclared exception!
      try { 
        hours0.FIVE.compareTo((BaseSingleFieldPeriod) years0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Years
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours0.THREE.multipliedBy(2);
      assertEquals(6, hours2.getHours());
      assertEquals(1, hours2.size());
      assertSame(hours0, hours1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.ONE;
      Hours hours2 = hours0.TWO.plus(hours1);
      assertEquals(3, hours2.getHours());
      
      Hours hours3 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours3.getHours());
      assertEquals(1, hours3.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours0.minus(hours1);
      assertEquals(0, hours2.getHours());
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      MutablePeriod mutablePeriod0 = hours0.ONE.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      Hours hours2 = hours0.minus(hours1);
      assertEquals(2, hours2.getHours());
      assertEquals(1, hours1.getHours());
  }
}
