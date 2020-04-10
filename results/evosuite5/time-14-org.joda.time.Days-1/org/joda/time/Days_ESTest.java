/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:46:15 GMT 2019
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
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.MAX_VALUE;
      boolean boolean0 = days0.isLessThan(days1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.isLessThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isLessThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.FIVE;
      boolean boolean0 = days0.isLessThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.ZERO;
      boolean boolean0 = days0.isGreaterThan(days1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ZERO;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.SEVEN;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.isGreaterThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = days0.MAX_VALUE.dividedBy(1);
      assertEquals(Integer.MAX_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = days0.FIVE.dividedBy(23);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.minus((Days) null);
      assertSame(days0, days1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.plus((Days) null);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.parseDays("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Days days0 = Days.daysIn(mutableInterval0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      LocalDate localDate0 = monthDay0.toLocalDate(1);
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Minutes minutes0 = days0.toStandardMinutes();
      Days days1 = minutes0.toStandardDays();
      assertEquals(10080, minutes0.getMinutes());
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.SIX;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
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
      Days days0 = Days.THREE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = days0.plus(days0);
      assertEquals(2, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.minus(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Days days0 = Days.TWO;
      int int0 = days0.getDays();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.SIX;
      Duration duration0 = days0.toStandardDuration();
      assertEquals(518400000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Days days0 = Days.FIVE;
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = days0.multipliedBy((-3397));
      assertEquals((-6794), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.ZERO.negated();
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Seconds seconds0 = days0.ZERO.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      PeriodType periodType0 = days0.getPeriodType();
      assertEquals("Days", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Days days0 = Days.daysBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Days days0 = Days.ONE;
      Hours hours0 = days0.toStandardHours();
      assertEquals(24, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Days days0 = Days.ONE;
      String string0 = days0.toString();
      assertEquals("P1D", string0);
  }
}
