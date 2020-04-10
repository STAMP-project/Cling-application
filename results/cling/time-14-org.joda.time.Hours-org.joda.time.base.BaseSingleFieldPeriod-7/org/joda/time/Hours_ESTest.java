/*

 * Tue Mar 03 17:12:27 GMT 2020
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
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.SIX;
      int int0 = hours1.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(6, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Period period0 = hours0.FIVE.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertEquals(8, hours0.getHours());
      assertEquals(5, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      boolean boolean0 = hours0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = hours0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.SIX;
      int int0 = hours1.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(6, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      int int0 = hours0.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(8, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      boolean boolean0 = hours0.ONE.equals(hours0);
      assertEquals(6, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Days days0 = hours0.SEVEN.toStandardDays();
      boolean boolean0 = hours0.THREE.equals(days0);
      assertEquals(8, hours0.getHours());
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = Hours.ZERO;
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertSame(hours2, hours0);
      
      Hours hours3 = Hours.standardHoursIn(hours1);
      assertEquals(0, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Months months0 = Months.ONE;
      // Undeclared exception!
      try { 
        hours0.SIX.compareTo((BaseSingleFieldPeriod) months0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Months
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Interval interval0 = mutableInterval0.toInterval();
      Hours hours0 = Hours.hoursIn(interval0);
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours0.plus(6);
      assertSame(hours0, hours1);
      assertEquals(1, hours2.size());
      assertEquals(6, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Hours hours0 = Hours.standardHoursIn(seconds0);
      Hours hours1 = hours0.plus(3);
      Hours hours2 = hours1.dividedBy(3);
      assertEquals(3, hours1.getHours());
      assertEquals(0, hours0.getHours());
      assertEquals(1, hours2.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.TWO;
      Hours hours3 = hours2.negated();
      Hours hours4 = hours3.negated();
      assertNotSame(hours4, hours3);
      assertEquals(1, hours4.size());
      assertSame(hours4, hours2);
  }
}
