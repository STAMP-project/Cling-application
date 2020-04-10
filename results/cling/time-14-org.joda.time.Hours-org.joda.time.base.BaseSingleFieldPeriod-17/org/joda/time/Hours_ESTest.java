/*

 * Tue Mar 03 17:12:53 GMT 2020
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
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      int int0 = hours0.SIX.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(3, hours0.getHours());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Hours hours0 = Hours.standardHoursIn(seconds0);
      assertEquals(1, seconds0.getSeconds());
      assertEquals(0, hours0.getHours());
      assertEquals(1, hours0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.TWO;
      Hours hours0 = Hours.standardHoursIn(days0);
      assertEquals(2, days0.getDays());
      assertEquals(48, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Weeks weeks0 = minutes0.toStandardWeeks();
      Hours hours0 = Hours.standardHoursIn(weeks0);
      Hours hours1 = Hours.FIVE;
      Hours hours2 = hours0.plus(hours1);
      assertSame(hours2, hours1);
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = hours0.SEVEN.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      int int0 = hours0.THREE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      int int0 = hours0.SIX.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(8, hours0.getHours());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, hours0.getHours());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours0.minus((-3));
      assertEquals(3, hours2.getHours());
      assertSame(hours0, hours1);
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.TWO.equals(hours0);
      assertEquals(0, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = hours0.EIGHT.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      // Undeclared exception!
      try { 
        hours0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Minutes
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.dividedBy(2930);
      Hours hours2 = hours1.SEVEN.minus(hours0);
      assertEquals(6, hours2.getHours());
      
      Hours hours3 = Hours.standardHoursIn(hours1);
      assertEquals(1, hours3.size());
      assertEquals(1, hours0.getHours());
      assertEquals(0, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusSeconds(3848);
      Hours hours0 = Hours.standardHoursIn(period1);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Weeks weeks0 = minutes0.toStandardWeeks();
      Hours hours0 = Hours.standardHoursIn(weeks0);
      Hours hours1 = Hours.FOUR;
      Hours hours2 = hours0.plus(hours1);
      assertEquals(1, hours2.size());
      assertSame(hours2, hours1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.hours(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Hours hours0 = Hours.standardHoursIn(weeks0);
      Hours hours1 = hours0.plus(2);
      assertEquals(1, hours1.size());
      assertEquals(0, hours0.getHours());
      assertEquals(2, hours1.getHours());
  }
}
