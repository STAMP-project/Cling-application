/*

 * Tue Mar 03 17:12:52 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      int int0 = hours0.EIGHT.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Hours hours0 = Hours.standardHoursIn(seconds0);
      assertEquals(2, seconds0.getSeconds());
      assertEquals(0, hours0.getHours());
      assertEquals(1, hours0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(hours0);
      Weeks weeks0 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(hours0, hours1);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      boolean boolean0 = hours0.FOUR.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      int int0 = hours0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      int int0 = hours0.EIGHT.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.ONE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.MIN_VALUE.equals(hours0);
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
      Seconds seconds0 = Seconds.TWO;
      Hours hours0 = seconds0.toStandardHours();
      boolean boolean0 = hours0.EIGHT.equals(seconds0);
      assertEquals(0, hours0.getHours());
      assertFalse(boolean0);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      // Undeclared exception!
      try { 
        hours0.compareTo((BaseSingleFieldPeriod) minutes0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Minutes
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(5, 5, 5, 5);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      Hours hours0 = seconds0.toStandardHours();
      Hours hours1 = hours0.plus(5);
      assertEquals(10, hours1.getHours());
      assertEquals(5, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }
}
