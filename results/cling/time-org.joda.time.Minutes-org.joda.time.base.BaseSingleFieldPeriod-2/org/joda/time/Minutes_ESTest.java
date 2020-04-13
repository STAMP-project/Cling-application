/*

 * Tue Mar 03 17:09:34 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) null);
      Minutes minutes1 = minutes0.minus(minutes0);
      assertSame(minutes1, minutes0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      Minutes minutes1 = minutes0.minus(Integer.MAX_VALUE);
      assertEquals((-2147483647), minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes2.getMinutes());
      assertEquals(1, minutes2.size());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Months months0 = Months.ONE;
      // Undeclared exception!
      try { 
        minutes0.ONE.compareTo((BaseSingleFieldPeriod) months0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Months
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Object object0 = new Object();
      boolean boolean0 = minutes0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      Minutes.standardMinutesIn(minutes0);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      boolean boolean0 = minutes0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(1, minutes1.size());
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      int int0 = minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, int0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(3, minutes0.getMinutes());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Period period0 = minutes0.TWO.toPeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(period0);
      assertEquals(2, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = minutes0.dividedBy(1879);
      Minutes minutes2 = minutes1.plus(minutes0);
      Minutes minutes3 = Minutes.standardMinutesIn(minutes1);
      assertSame(minutes0, minutes2);
      assertEquals(0, minutes3.getMinutes());
      assertEquals(1, minutes3.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      int int0 = minutes0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1L);
      Minutes minutes0 = duration0.toStandardMinutes();
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      Minutes minutes2 = minutes1.dividedBy(60);
      assertEquals(1, minutes1.getMinutes());
      assertEquals(0, minutes2.getMinutes());
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.ONE;
      boolean boolean0 = minutes1.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(1, minutes1.getMinutes());
      assertFalse(minutes0.equals((Object)minutes1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Period period0 = minutes0.toPeriod();
      boolean boolean0 = minutes0.ZERO.equals(period0);
      assertEquals(3, minutes0.getMinutes());
      assertFalse(boolean0);
      assertEquals(1, minutes0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      Minutes minutes1 = minutes0.plus(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(1, minutes2.size());
      assertEquals(0, minutes0.getMinutes());
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("|R-@~+kr-^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"|R-@~+kr-^\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
