/*

 * Tue Mar 03 17:10:29 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
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
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.negated();
      assertEquals((-1), hours1.getHours());
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      Hours hours2 = hours0.minus(hours1);
      assertEquals(0, hours2.getHours());
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      boolean boolean0 = hours0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      int int0 = hours0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      boolean boolean0 = hours0.TWO.equals(hours0);
      assertEquals(7, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.TWO.toStandardWeeks();
      boolean boolean0 = hours0.ZERO.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Weeks weeks0 = Weeks.ZERO;
      // Undeclared exception!
      try { 
        hours0.SIX.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours1.TWO.multipliedBy(3);
      assertEquals(0, hours1.getHours());
      assertEquals(6, hours2.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Years years0 = Years.ZERO;
      assertEquals(0, years0.getYears());
      
      Days days0 = Days.standardDaysIn(years0);
      Hours hours0 = days0.toStandardHours();
      Hours hours1 = hours0.plus(1);
      assertEquals(1, hours1.size());
      assertEquals(1, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Duration duration0 = hours0.toStandardDuration();
      Period period0 = duration0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertEquals(14400000L, duration0.getMillis());
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
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours1.plus(2);
      assertEquals(1, hours2.size());
      assertEquals(0, hours1.getHours());
      assertEquals(2, hours2.getHours());
  }
}
