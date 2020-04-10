/*

 * Tue Mar 03 17:10:16 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1639L, (DateTimeZone) null);
      YearMonth yearMonth0 = new YearMonth();
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) yearMonth0);
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
      Period period0 = Period.minutes(8);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(8, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Minutes minutes0 = Minutes.standardMinutesIn(seconds0);
      Minutes minutes1 = minutes0.plus(minutes0);
      assertEquals(0, minutes1.getMinutes());
      assertEquals(0, minutes0.getMinutes());
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Minutes minutes0 = days0.toStandardMinutes();
      Minutes minutes1 = minutes0.minus(minutes0);
      assertEquals(0, minutes1.getMinutes());
      assertEquals(7, days0.getDays());
      assertEquals(10080, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
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
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = minutes0.ZERO.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.TWO.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.TWO;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes1);
      assertEquals(2, minutes1.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = LocalTime.now((DateTimeZone) fixedDateTimeZone0);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.ZERO;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes1);
      assertEquals(1, int0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
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
      Period period0 = Period.seconds(140);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      int int0 = minutes0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.seconds(115);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(1, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Minutes minutes0 = days0.toStandardMinutes();
      boolean boolean0 = minutes0.THREE.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(10080, minutes0.getMinutes());
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.equals(minutes0);
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
      Period period0 = Period.minutes(508);
      Period period1 = period0.withFields(minutes0);
      Minutes minutes1 = Minutes.standardMinutesIn(period1);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Minutes minutes0 = Minutes.standardMinutesIn(seconds0);
      MutablePeriod mutablePeriod0 = minutes0.MAX_VALUE.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(2, seconds0.getSeconds());
      assertEquals(Integer.MAX_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }
}
