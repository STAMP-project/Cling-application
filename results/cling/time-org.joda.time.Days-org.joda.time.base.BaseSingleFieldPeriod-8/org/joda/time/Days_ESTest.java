/*

 * Tue Mar 03 17:06:51 GMT 2020
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
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = days0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.SIX;
      int int0 = days0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(6, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.SIX;
      Hours hours0 = Hours.FIVE;
      Days days1 = hours0.toStandardDays();
      Days days2 = Days.standardDaysIn(days1);
      Days days3 = days1.plus(days0);
      assertSame(days1, days2);
      assertSame(days3, days0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.days(1);
      assertEquals(1, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Days days1 = Days.FIVE;
      Days days2 = days0.plus(days1);
      assertSame(days2, days1);
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days0.getDays());
      assertSame(days3, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      int int0 = days0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      int int0 = days0.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SEVEN;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      int int0 = days0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period(259200000L, periodType0);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      boolean boolean0 = days0.ZERO.equals(days0);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Years years0 = Years.MIN_VALUE;
      boolean boolean0 = years0.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.days(2);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Days days0 = Days.standardDaysIn(hours0);
      assertEquals(0, days0.getDays());
      assertEquals(6, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Days days1 = days0.FIVE.minus(1);
      assertEquals(4, days1.getDays());
      
      Days days2 = Days.standardDaysIn(days0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = days0.negated();
      assertEquals((-5), days1.getDays());
      assertEquals(5, days0.getDays());
  }
}
