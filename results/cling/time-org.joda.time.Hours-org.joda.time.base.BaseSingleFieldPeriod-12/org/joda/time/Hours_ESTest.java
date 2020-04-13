/*

 * Tue Mar 03 17:12:41 GMT 2020
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
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      int int0 = hours0.EIGHT.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(2, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Weeks weeks0 = hours0.toStandardWeeks();
      Hours hours1 = Hours.standardHoursIn(weeks0);
      Hours hours2 = hours1.plus(hours0);
      assertEquals(1, hours2.size());
      assertSame(hours2, hours0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      boolean boolean0 = hours0.SEVEN.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      int int0 = hours0.SIX.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      int int0 = hours0.THREE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Period period0 = Period.millis((-172));
      Hours hours1 = Hours.standardHoursIn(period0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = hours0.minus(1);
      assertEquals(3, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.TWO.equals(hours0);
      assertFalse(boolean0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.FIVE;
      Minutes minutes0 = days0.toStandardMinutes();
      Hours hours0 = minutes0.toStandardHours();
      boolean boolean0 = hours0.THREE.equals(minutes0);
      assertEquals(120, hours0.getHours());
      assertEquals(7200, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Days days0 = hours0.toStandardDays();
      Hours hours1 = Hours.standardHoursIn(days0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.THREE;
      Hours hours3 = hours0.minus(hours2);
      assertEquals(3, hours2.getHours());
      assertEquals(1, hours3.size());
      assertEquals(4, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Days days0 = Days.FOUR;
      // Undeclared exception!
      try { 
        hours0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) days0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Days
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.hours(1);
      Hours hours2 = hours0.minus(hours1);
      assertEquals(1, hours1.getHours());
      assertEquals(6, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = Hours.ZERO;
      Hours hours2 = Hours.standardHoursIn(hours1);
      Hours hours3 = hours2.plus(hours0);
      assertSame(hours3, hours0);
      assertEquals(0, hours2.getHours());
      assertEquals(1, hours3.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Days days0 = hours0.toStandardDays();
      Hours hours1 = Hours.standardHoursIn(days0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.hours(1);
      Hours hours3 = hours0.minus(hours2);
      assertEquals(1, hours2.getHours());
      assertEquals(1, hours3.size());
      assertEquals(6, hours3.getHours());
  }
}
