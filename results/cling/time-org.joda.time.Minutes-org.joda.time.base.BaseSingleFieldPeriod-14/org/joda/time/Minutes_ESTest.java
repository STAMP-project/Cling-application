/*

 * Tue Mar 03 17:10:13 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      LocalDate localDate0 = LocalDate.now();
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-2128L));
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Minutes minutes1 = minutes0.TWO.multipliedBy(3065);
      assertEquals(6130, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period((Object) null);
      Days days0 = period0.toStandardDays();
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      Minutes minutes1 = minutes0.THREE.plus(minutes0);
      assertEquals(1, minutes1.size());
      assertEquals(3, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      // Undeclared exception!
      try { 
        minutes0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Hours
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Object object0 = new Object();
      boolean boolean0 = minutes0.THREE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
      assertEquals(1, minutes1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      boolean boolean0 = minutes0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      LocalTime localTime0 = new LocalTime();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(3, minutes0.getMinutes());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      Minutes.minutesIn(interval0);
      assertEquals(1583255395101L, interval0.getEndMillis());
      assertEquals(1583255395101L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period((Object) null);
      Days days0 = period0.toStandardDays();
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      Minutes minutes1 = Minutes.TWO;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertEquals(1, minutes2.size());
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      int int0 = minutes0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      minutes1.plus(3);
      assertEquals(1583255393577L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period((Object) null);
      Days days0 = period0.toStandardDays();
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      Minutes minutes1 = Minutes.ONE;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertSame(minutes2, minutes1);
      assertEquals(1, minutes2.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.TWO.equals(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Days days0 = minutes0.MAX_VALUE.toStandardDays();
      boolean boolean0 = minutes0.TWO.equals(days0);
      assertEquals(1491308, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.millis((-89L));
      PeriodType periodType0 = PeriodType.days();
      Period period0 = new Period((ReadableInstant) null, duration0, periodType0);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      Minutes minutes1 = Minutes.MAX_VALUE;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertSame(minutes2, minutes1);
      assertEquals(0, minutes0.getMinutes());
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
        Minutes.parseMinutes("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
