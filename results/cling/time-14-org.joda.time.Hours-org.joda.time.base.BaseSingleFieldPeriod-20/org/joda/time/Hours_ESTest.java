/*

 * Tue Mar 03 17:13:01 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.SEVEN.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.hours(7);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.hours((-2244));
      assertEquals((-2244), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      boolean boolean0 = hours0.EIGHT.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      int int0 = hours0.FOUR.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      int int0 = hours0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      int int0 = hours0.SEVEN.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      Hours hours2 = hours0.minus(hours1);
      Hours hours3 = hours2.plus(3);
      assertEquals(3, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      boolean boolean0 = hours0.FOUR.equals(hours0);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Seconds seconds0 = Seconds.seconds((-19));
      boolean boolean0 = hours0.THREE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals((-19), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Months months0 = Months.ZERO;
      // Undeclared exception!
      try { 
        hours0.compareTo((BaseSingleFieldPeriod) months0);
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
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = new Period(0L, periodType0);
      Hours hours0 = Hours.standardHoursIn(period0);
      Hours hours1 = Hours.SIX;
      Hours hours2 = hours0.plus(hours1);
      assertEquals(0, hours0.getHours());
      assertSame(hours2, hours1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period(3600000L);
      Hours hours0 = Hours.standardHoursIn(period0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.plusMillis(15271875);
      Hours hours0 = Hours.standardHoursIn(period1);
      assertEquals(4, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      Hours hours2 = hours1.minus(3);
      assertSame(hours1, hours0);
      assertEquals(2, hours2.getHours());
  }
}
