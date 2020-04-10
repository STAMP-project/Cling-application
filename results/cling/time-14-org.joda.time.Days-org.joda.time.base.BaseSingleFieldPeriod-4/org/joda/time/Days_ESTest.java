/*

 * Tue Mar 03 17:06:41 GMT 2020
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
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      boolean boolean0 = days0.THREE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.days(7);
      assertEquals(7, days0.getDays());
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
      Days days0 = Days.ZERO;
      Days days1 = Days.days(3);
      assertEquals(3, days1.getDays());
      
      Weeks weeks0 = days0.toStandardWeeks();
      Days days2 = Days.standardDaysIn(weeks0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ZERO;
      Weeks weeks0 = Weeks.standardWeeksIn(days0);
      assertEquals(0, weeks0.getWeeks());
      
      Days days1 = days0.plus(4);
      assertEquals(4, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.minutes(3833);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = new Period(7, 7, 86400, 86400);
      Days days1 = Days.standardDaysIn(period0);
      Days days2 = days0.minus(days1);
      assertEquals(5, days2.getDays());
      assertEquals(1, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ZERO;
      int int0 = days0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      int int0 = days0.TWO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      int int0 = days0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = days0.toPeriod();
      Days days1 = Days.standardDaysIn(period0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      boolean boolean0 = days0.THREE.equals(days0);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ZERO;
      Hours hours0 = Hours.standardHoursIn(days0);
      boolean boolean0 = days0.MIN_VALUE.equals(hours0);
      assertEquals(0, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = Days.standardDaysIn(seconds0);
      assertEquals(3, seconds0.getSeconds());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.days(323);
      assertEquals(323, days0.getDays());
  }
}
