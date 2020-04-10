/*

 * Tue Mar 03 17:12:44 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      Hours hours0 = Hours.hoursBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Hours.standardHoursIn(hours0);
      assertEquals(1583255549099L, mutableDateTime0.getMillis());
      
      Hours hours1 = Hours.hours(5);
      assertEquals(5, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      Hours hours0 = Hours.hoursBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Hours hours1 = Hours.standardHoursIn(hours0);
      hours1.plus(1);
      assertEquals(1583255548288L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      boolean boolean0 = hours0.ZERO.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      int int0 = hours0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      int int0 = hours0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(3, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.ONE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, hours0.getHours());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Hours hours0 = Hours.hoursBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Hours.standardHoursIn(hours0);
      assertEquals(1583255547341L, mutableDateTime0.getMillis());
      
      Hours hours1 = Hours.hours(3);
      assertEquals(3, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Minutes minutes0 = hours0.toStandardMinutes();
      boolean boolean0 = hours0.FIVE.equals(minutes0);
      assertEquals(420, minutes0.getMinutes());
      assertFalse(boolean0);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.FOUR.equals(hours0);
      assertEquals(1, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      Hours hours0 = Hours.hoursBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Hours.standardHoursIn(hours0);
      hours0.plus(4);
      assertEquals(1583255545839L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Minutes minutes0 = Minutes.ZERO;
      // Undeclared exception!
      try { 
        hours0.ZERO.compareTo((BaseSingleFieldPeriod) minutes0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Minutes
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Hours hours2 = hours1.dividedBy((-837));
      Hours hours3 = Hours.standardHoursIn(hours2);
      assertSame(hours1, hours0);
      assertEquals(0, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Hours hours0 = seconds0.toStandardHours();
      MutablePeriod mutablePeriod0 = hours0.TWO.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertEquals(2, hours1.getHours());
      assertEquals((-596523), hours0.getHours());
  }
}
