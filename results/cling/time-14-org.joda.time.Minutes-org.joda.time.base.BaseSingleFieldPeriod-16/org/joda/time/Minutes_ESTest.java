/*

 * Tue Mar 03 17:10:15 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
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
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = minutes0.minus(0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = minutes0.TWO.plus((-2588));
      assertEquals(0, minutes0.getMinutes());
      assertEquals((-2586), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Months months0 = Months.NINE;
      // Undeclared exception!
      try { 
        minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) months0);
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
      Minutes minutes0 = Minutes.ONE;
      Object object0 = new Object();
      boolean boolean0 = minutes0.MAX_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = minutes0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = Minutes.MAX_VALUE;
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes2.getMinutes());
      
      Minutes minutes3 = Minutes.standardMinutesIn(minutes1);
      assertSame(minutes3, minutes1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(3, minutes0.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Minutes minutes0 = Minutes.standardMinutesIn(weeks0);
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, weeks0.getWeeks());
      assertEquals(10080, minutes0.getMinutes());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.minutes(4266);
      Period period1 = period0.plusMinutes(2340);
      Minutes minutes0 = Minutes.standardMinutesIn(period1);
      Minutes minutes1 = minutes0.dividedBy(2340);
      assertEquals(2, minutes1.getMinutes());
      assertEquals(6606, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      int int0 = minutes0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1);
      assertEquals(1, minutes0.getMinutes());
      
      Minutes minutes1 = Minutes.ZERO;
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.MIN_VALUE.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Minutes minutes0 = Minutes.THREE;
      boolean boolean0 = minutes0.MIN_VALUE.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
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
        Minutes.parseMinutes("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }
}
