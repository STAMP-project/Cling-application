/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:30:20 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.FIVE;
      boolean boolean0 = days0.isLessThan(days1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isLessThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      boolean boolean0 = days0.isLessThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.FIVE;
      boolean boolean0 = days0.isLessThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = Days.TWO;
      boolean boolean0 = days0.isGreaterThan(days1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.THREE;
      boolean boolean0 = days0.isGreaterThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = days0.dividedBy(1);
      assertEquals(3, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = days0.dividedBy(6);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = days0.minus((Days) null);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.ZERO.plus((Days) null);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.ZERO.plus(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.parseDays("-Suemer");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-Suemer\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Interval interval0 = new Interval(5784L, 5784L, copticChronology0);
      Days days0 = Days.daysIn(interval0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) null);
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
      LocalDate localDate0 = LocalDate.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.days(6);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Days days0 = Days.FOUR;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Days days0 = Days.days(3);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = Days.SIX;
      Days days2 = days1.minus(days0);
      assertEquals(1, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = days0.ZERO.plus(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Days days0 = Days.TWO;
      int int0 = days0.getDays();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.ONE;
      Duration duration0 = days0.THREE.toStandardDuration();
      assertEquals(259200000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Days days0 = Days.ZERO;
      Weeks weeks0 = days0.SIX.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.SEVEN;
      // Undeclared exception!
      try { 
        days0.MAX_VALUE.multipliedBy(730);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 730
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Days days0 = Days.days(220);
      days0.negated();
      assertEquals(220, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Days days0 = Days.THREE;
      Seconds seconds0 = days0.THREE.toStandardSeconds();
      assertEquals(259200, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Days days0 = Days.ZERO;
      PeriodType periodType0 = days0.FOUR.getPeriodType();
      assertEquals("Days", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      Days days0 = Days.daysBetween((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Hours hours0 = days0.toStandardHours();
      assertEquals(168, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Days days0 = Days.THREE;
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals(4320, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Days days0 = Days.ONE;
      String string0 = days0.ZERO.toString();
      assertEquals("P0D", string0);
  }
}
