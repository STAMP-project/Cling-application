/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:39:15 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.toStandardWeeks();
      Weeks weeks1 = Weeks.TWO;
      boolean boolean0 = weeks0.isLessThan(weeks1);
      assertTrue(boolean0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      boolean boolean0 = weeks0.isLessThan((Weeks) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = weeks0.isLessThan((Weeks) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      boolean boolean0 = weeks0.isLessThan(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Weeks weeks0 = seconds0.toStandardWeeks();
      Weeks weeks1 = Weeks.ONE;
      boolean boolean0 = weeks0.isGreaterThan(weeks1);
      assertTrue(boolean0);
      assertEquals(3550, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      boolean boolean0 = weeks0.isGreaterThan((Weeks) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = weeks0.isGreaterThan((Weeks) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Weeks weeks0 = seconds0.toStandardWeeks();
      boolean boolean0 = weeks0.isGreaterThan(weeks0);
      assertEquals(3550, weeks0.getWeeks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Interval interval0 = new Interval((-2762L), (-2762L), buddhistChronology0);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      Weeks weeks1 = weeks0.dividedBy(1);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Weeks weeks0 = days0.toStandardWeeks();
      Weeks weeks1 = weeks0.minus((Weeks) null);
      assertEquals((-306783378), weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.standardWeeksIn((ReadablePeriod) null);
      Weeks weeks1 = weeks0.plus((Weeks) null);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.standardWeeksIn((ReadablePeriod) null);
      Weeks weeks1 = weeks0.plus(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("/  ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"/  \"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(604800000L);
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(604800000L);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(2);
      assertEquals(2, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks((-4810));
      Weeks weeks1 = weeks0.dividedBy((-4810));
      assertEquals((-4810), weeks0.getWeeks());
      assertEquals(1, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Weeks weeks0 = seconds0.toStandardWeeks();
      Hours hours0 = weeks0.toStandardHours();
      assertEquals((-596400), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      String string0 = weeks0.toString();
      assertEquals("P2147483647W", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = weeks0.ONE.toStandardSeconds();
      assertEquals(604800, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Weeks weeks0 = Weeks.standardWeeksIn((ReadablePeriod) null);
      weeks0.toStandardDays();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      // Undeclared exception!
      try { 
        weeks0.MIN_VALUE.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Weeks weeks1 = weeks0.minus(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      int int0 = weeks0.getWeeks();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Weeks weeks0 = Weeks.standardWeeksIn((ReadablePeriod) null);
      weeks0.TWO.getPeriodType();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Minutes minutes0 = weeks0.toStandardMinutes();
      assertEquals(30240, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Weeks weeks0 = seconds0.toStandardWeeks();
      Weeks weeks1 = weeks0.ZERO.multipliedBy(2586);
      assertEquals(3550, weeks0.getWeeks());
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTime dateTime0 = new DateTime(6914L);
      Weeks weeks0 = Weeks.weeksBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Duration duration0 = weeks0.toStandardDuration();
      assertEquals(21646635161760L, duration0.getStandardMinutes());
  }
}
