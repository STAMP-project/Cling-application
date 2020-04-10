/*

 * Tue Mar 03 17:12:30 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.TWO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Hours hours1 = hours0.plus(4052);
      assertEquals(0, hours0.getHours());
      assertEquals(4052, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.ONE;
      Hours hours2 = Hours.standardHoursIn(hours1);
      assertSame(hours2, hours1);
      
      Hours hours3 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      Hours hours1 = hours0.EIGHT.minus(3);
      assertEquals(5, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      boolean boolean0 = hours0.SIX.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      int int0 = hours0.FIVE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      int int0 = hours0.TWO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(6, hours0.getHours());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Hours hours1 = Hours.THREE;
      int int0 = hours0.THREE.compareTo((BaseSingleFieldPeriod) hours1);
      assertEquals(0, int0);
      assertEquals(3, hours1.getHours());
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.THREE;
      Hours hours3 = Hours.standardHoursIn(hours2);
      assertSame(hours3, hours2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.THREE.equals(hours0);
      assertFalse(boolean0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Hours hours0 = Hours.MAX_VALUE;
      boolean boolean0 = hours0.MIN_VALUE.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours1.getHours());
      
      Hours hours2 = Hours.FOUR;
      Hours hours3 = Hours.standardHoursIn(hours2);
      assertSame(hours3, hours2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Months months0 = Months.SEVEN;
      // Undeclared exception!
      try { 
        hours0.ZERO.compareTo((BaseSingleFieldPeriod) months0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Months
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      MutablePeriod mutablePeriod0 = hours0.SIX.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertEquals(6, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Hours hours0 = minutes0.toStandardHours();
      Hours hours1 = hours0.EIGHT.dividedBy(3);
      assertEquals(2, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours2.getHours());
      assertEquals(1, hours2.size());
      assertEquals(3, minutes0.getMinutes());
  }
}
