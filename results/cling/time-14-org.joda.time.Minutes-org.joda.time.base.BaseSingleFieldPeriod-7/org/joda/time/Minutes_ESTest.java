/*

 * Tue Mar 03 17:09:48 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
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
      YearMonth yearMonth0 = new YearMonth();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Minutes minutes1 = Minutes.minutes(236548278);
      assertEquals(236548278, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Minutes minutes1 = minutes0.plus(0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Weeks weeks0 = Weeks.standardWeeksIn(minutes0);
      // Undeclared exception!
      try { 
        minutes0.ZERO.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      boolean boolean0 = minutes0.ONE.equals("5.U");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      PeriodType periodType0 = PeriodType.time();
      Duration duration0 = new Duration(mutableDateTime0, (ReadableInstant) null);
      Period period0 = new Period(duration0, mutableDateTime0, periodType0);
      Minutes.standardMinutesIn(period0);
      Minutes minutes1 = Minutes.ONE;
      minutes0.plus(minutes1);
      assertEquals(1583255374760L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      boolean boolean0 = minutes0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Minutes minutes1 = Minutes.MAX_VALUE;
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertSame(minutes2, minutes1);
      
      Minutes minutes3 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes3.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(1, minutes1.size());
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.ZERO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, minutes0.getMinutes());
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
      Minutes minutes0 = Minutes.minutes(2);
      assertEquals(2, minutes0.getMinutes());
      
      YearMonth yearMonth0 = new YearMonth();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = minutes0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.minutes(3);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(3, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.TWO.equals(minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Days days0 = Days.SIX;
      boolean boolean0 = minutes0.ZERO.equals(days0);
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
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes(":T'10sbTn9Rd,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \":T'10sbTn9Rd,\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
