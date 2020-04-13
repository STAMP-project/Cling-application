/*

 * Tue Mar 03 17:07:12 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.FIVE;
      Days days2 = days0.plus(days1);
      assertEquals(7, days2.getDays());
      assertEquals(5, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.FOUR;
      Weeks weeks0 = days0.toStandardWeeks();
      Days days1 = Days.standardDaysIn(weeks0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.SIX;
      Days days3 = days2.minus(days0);
      assertEquals(6, days2.getDays());
      assertEquals(2, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1164L));
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(7, 7, 7, 5, 0);
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Days days0 = Days.standardDaysIn(hours0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.THREE;
      Days days2 = Days.standardDaysIn(days1);
      assertSame(days2, days1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.ONE;
      assertEquals(1, days0.size());
      
      LocalDateTime localDateTime0 = new LocalDateTime(7, 7, 7, 5, 0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days1 = seconds0.toStandardDays();
      int int0 = days0.ONE.compareTo((BaseSingleFieldPeriod) days1);
      assertEquals(0, days1.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Days days0 = Days.standardDaysIn(hours0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.THREE;
      Days days2 = days1.plus(days1);
      assertEquals(3, days1.getDays());
      assertEquals(1, days2.size());
      assertEquals(6, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Days days0 = Days.standardDaysIn(hours0);
      Days days1 = days0.plus(1);
      assertEquals(1, days1.getDays());
      assertEquals(1, days1.size());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.FOUR;
      Weeks weeks0 = days0.toStandardWeeks();
      Days days1 = Days.standardDaysIn(weeks0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.days(4);
      assertSame(days2, days0);
      assertEquals(1, days2.size());
      assertEquals(4, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = days0.multipliedBy(5);
      Weeks weeks0 = days1.toStandardWeeks();
      Days days2 = Days.standardDaysIn(weeks0);
      assertEquals(1, days0.getDays());
      assertEquals(5, days1.getDays());
      assertEquals(1, days2.size());
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.FOUR;
      Days days1 = Days.FIVE;
      int int0 = days0.FOUR.compareTo((BaseSingleFieldPeriod) days1);
      assertEquals((-1), int0);
      assertEquals(5, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ONE;
      int int0 = days0.ONE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Minutes minutes0 = Minutes.TWO;
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      int int0 = days0.FIVE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.ONE;
      boolean boolean0 = days0.SEVEN.equals(days0);
      assertEquals(1, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Days days0 = Days.standardDaysIn(hours0);
      boolean boolean0 = days0.FIVE.equals(hours0);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = days0.minus(735108);
      assertEquals((-735107), days1.getDays());
  }
}
