/*

 * Tue Mar 03 17:10:32 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.TWO.compareTo((BaseSingleFieldPeriod) hours0);
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
      Hours hours0 = Hours.FIVE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours0.dividedBy(187);
      Hours hours3 = Hours.standardHoursIn(hours2);
      assertEquals(0, hours3.getHours());
      assertSame(hours0, hours1);
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
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.hours(1);
      assertEquals(1, hours2.size());
      assertEquals(1, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = hours0.SIX.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      int int0 = hours0.SIX.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(5, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.SEVEN.dividedBy(2);
      assertEquals(3, hours1.getHours());
      assertEquals(5, hours0.getHours());
      
      Hours hours2 = Hours.ZERO;
      Hours hours3 = Hours.standardHoursIn(hours2);
      assertEquals(0, hours3.getHours());
      assertEquals(1, hours3.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.TWO.equals(hours0);
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
      Years years0 = Years.ZERO;
      Hours hours0 = Hours.standardHoursIn(years0);
      boolean boolean0 = hours0.EIGHT.equals(years0);
      assertEquals(1, hours0.size());
      assertFalse(boolean0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Years years0 = Years.ZERO;
      Hours hours0 = Hours.standardHoursIn(years0);
      assertEquals(0, hours0.getHours());
      
      Hours hours1 = Hours.TWO;
      Hours hours2 = hours1.plus(hours1);
      assertEquals(4, hours2.getHours());
      assertEquals(2, hours1.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.toStandardWeeks();
      // Undeclared exception!
      try { 
        hours0.THREE.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = Hours.EIGHT;
      Hours hours2 = hours1.minus(hours0);
      assertEquals(6, hours2.getHours());
      
      Period period0 = Period.minutes((-1172));
      Hours hours3 = Hours.standardHoursIn(period0);
      assertEquals((-19), hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Years years0 = Years.ZERO;
      assertEquals(0, years0.getYears());
      
      Hours hours0 = Hours.standardHoursIn(years0);
      Hours hours1 = Hours.TWO;
      Hours hours2 = hours0.plus(hours1);
      assertEquals(1, hours2.size());
      assertEquals(0, hours0.getHours());
      assertSame(hours2, hours1);
  }
}
