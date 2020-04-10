/*

 * Tue Mar 03 17:12:56 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, hours0.getHours());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.hours(7);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours1.dividedBy((-893));
      assertSame(hours1, hours0);
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.hours(5);
      assertEquals(5, hours0.getHours());
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
      Hours hours1 = Hours.hours(1);
      assertEquals(1, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours2.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      boolean boolean0 = hours0.SIX.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      int int0 = hours0.EIGHT.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Minutes minutes0 = hours0.toStandardMinutes();
      boolean boolean0 = hours0.equals(minutes0);
      assertEquals(0, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.hours(4);
      Hours hours1 = hours0.plus(4);
      assertEquals(4, hours0.getHours());
      assertEquals(8, hours1.getHours());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      DateTime dateTime1 = dateTime0.plusDays((-2593));
      Hours hours0 = Hours.hoursBetween((ReadableInstant) dateTime1, (ReadableInstant) dateTime0);
      boolean boolean0 = hours0.ZERO.equals(hours0);
      assertEquals(1359220360380L, dateTime1.getMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Minutes minutes0 = hours0.toStandardMinutes();
      // Undeclared exception!
      try { 
        hours0.FOUR.compareTo((BaseSingleFieldPeriod) minutes0);
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
      Hours hours0 = Hours.hours(6);
      assertEquals(6, hours0.getHours());
      
      Hours hours1 = Hours.hoursIn((ReadableInterval) null);
      Hours hours2 = Hours.standardHoursIn(hours1);
      assertEquals(0, hours2.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Hours hours0 = minutes0.toStandardHours();
      Hours hours1 = hours0.plus(3);
      assertEquals(3, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours0.getHours());
      assertEquals(0, hours2.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(5, 8, (-603), 8);
      Hours hours0 = Hours.standardHoursIn(mutablePeriod0);
      assertEquals(4, hours0.getHours());
      
      Hours hours1 = Hours.hours(5);
      assertEquals(5, hours1.getHours());
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
      Minutes minutes0 = hours2.toStandardMinutes();
      Hours hours3 = minutes0.toStandardHours();
      assertEquals(120, minutes0.getMinutes());
      assertEquals(1, hours3.size());
      assertEquals(2, hours2.getHours());
      assertSame(hours3, hours2);
  }
}
