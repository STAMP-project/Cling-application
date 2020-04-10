/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:48:50 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = Minutes.MAX_VALUE;
      boolean boolean0 = minutes0.isLessThan(minutes1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.isLessThan(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.ZERO;
      boolean boolean0 = minutes0.isGreaterThan(minutes1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.isGreaterThan(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.ONE;
      Minutes minutes0 = days0.toStandardMinutes();
      Minutes minutes1 = minutes0.dividedBy(1);
      assertEquals(1440, minutes1.getMinutes());
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = minutes0.dividedBy((-537));
      assertEquals(3999038, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = minutes0.minus((Minutes) null);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = minutes0.plus((Minutes) null);
      assertSame(minutes0, minutes1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = minutes0.plus(minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = minutes0.plus(minutes0);
      assertEquals(6, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-2982L));
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(2);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Duration duration0 = minutes0.toStandardDuration();
      assertEquals(1491308L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = minutes0.multipliedBy(1273);
      assertEquals(1273, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      // Undeclared exception!
      try { 
        minutes0.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 60
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      // Undeclared exception!
      try { 
        minutes0.minus(minutes0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Hours hours0 = minutes0.THREE.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      String string0 = minutes0.THREE.toString();
      assertEquals("PT3M", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) fixedDateTimeZone0);
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.getMinutes();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      minutes0.THREE.getPeriodType();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Days days0 = minutes0.toStandardDays();
      assertEquals((-1491308), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = minutes0.negated();
      assertEquals((-3), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1752);
      Weeks weeks0 = minutes0.ONE.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
      assertEquals(1752, minutes0.getMinutes());
  }
}
