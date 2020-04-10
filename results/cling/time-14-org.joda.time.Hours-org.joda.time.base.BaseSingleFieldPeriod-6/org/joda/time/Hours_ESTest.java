/*

 * Tue Mar 03 17:12:28 GMT 2020
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
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      int int0 = hours0.SEVEN.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.minutes(23);
      Hours hours0 = Hours.standardHoursIn(period0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours0.minus((-5));
      assertSame(hours0, hours1);
      assertEquals(1, hours2.size());
      assertEquals(5, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 0, periodType0);
      Hours hours0 = Hours.standardHoursIn(mutablePeriod0);
      assertEquals(0, hours0.getHours());
      
      Hours hours1 = Hours.hours(1);
      assertEquals(1, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = hours0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      int int0 = hours0.THREE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.EIGHT;
      int int0 = hours0.SEVEN.compareTo((BaseSingleFieldPeriod) hours1);
      assertEquals((-1), int0);
      assertEquals(Integer.MIN_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      int int0 = hours0.SEVEN.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(7, hours0.getHours());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours0.plus(3);
      assertEquals(3, hours2.getHours());
      assertSame(hours0, hours1);
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SIX;
      Hours hours0 = days0.toStandardHours();
      boolean boolean0 = days0.equals(hours0);
      assertEquals(6, days0.getDays());
      assertEquals(144, hours0.getHours());
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
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.THREE.equals(hours0);
      assertEquals(0, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Hours hours0 = Hours.hoursBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Weeks weeks0 = hours0.toStandardWeeks();
      Hours hours1 = Hours.TWO;
      Hours hours2 = hours0.minus(hours1);
      Hours hours3 = hours2.minus(hours1);
      Hours hours4 = hours0.minus(hours3);
      assertEquals(4, hours4.getHours());
      assertEquals((-2), hours2.getHours());
      
      Hours hours5 = Hours.standardHoursIn(weeks0);
      assertSame(hours5, hours0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Minutes minutes0 = Minutes.ZERO;
      // Undeclared exception!
      try { 
        hours0.THREE.compareTo((BaseSingleFieldPeriod) minutes0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Minutes
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.hours(6);
      assertEquals(6, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(1, hours2.size());
      assertEquals(0, hours2.getHours());
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
      Hours hours2 = hours0.minus((-2));
      assertEquals(2, hours2.getHours());
      assertSame(hours0, hours1);
      assertEquals(1, hours2.size());
  }
}
