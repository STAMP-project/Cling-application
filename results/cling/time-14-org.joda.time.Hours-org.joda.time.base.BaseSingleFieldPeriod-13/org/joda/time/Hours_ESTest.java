/*

 * Tue Mar 03 17:12:44 GMT 2020
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
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.ONE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, hours0.getHours());
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
      Minutes minutes0 = hours0.toStandardMinutes();
      Hours hours1 = Hours.ZERO;
      Hours hours2 = Hours.standardHoursIn(hours1);
      assertEquals(0, hours2.getHours());
      
      Hours hours3 = minutes0.toStandardHours();
      assertSame(hours3, hours0);
      assertEquals(5, hours0.getHours());
      assertEquals(300, minutes0.getMinutes());
      assertEquals(1, hours3.size());
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
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      boolean boolean0 = hours0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      int int0 = hours0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      int int0 = hours0.TWO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      int int0 = hours0.EIGHT.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(8, hours0.getHours());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.parseHours((String) null);
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = hours0.plus(3);
      assertEquals(1, hours2.size());
      assertEquals(3, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.ZERO;
      boolean boolean0 = hours1.equals(hours0);
      assertFalse(boolean0);
      assertFalse(hours0.equals((Object)hours1));
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Hours hours0 = seconds0.toStandardHours();
      boolean boolean0 = hours0.FIVE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(596523, hours0.getHours());
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Minutes minutes0 = Minutes.TWO;
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
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.parseHours((String) null);
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.hours(6);
      assertEquals(1, hours2.size());
      assertEquals(6, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      Hours hours2 = hours0.minus(hours1);
      assertSame(hours1, hours0);
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.hours(4);
      Hours hours1 = hours0.plus(hours0);
      Weeks weeks0 = hours0.toStandardWeeks();
      Hours hours2 = Hours.standardHoursIn(weeks0);
      assertEquals(0, hours2.getHours());
      
      Hours hours3 = hours1.dividedBy(4);
      assertEquals(1, hours3.size());
      assertEquals(2, hours3.getHours());
      assertEquals(4, hours0.getHours());
      assertEquals(8, hours1.getHours());
  }
}
