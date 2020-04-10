/*

 * Tue Mar 03 17:06:59 GMT 2020
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
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      boolean boolean0 = days0.SEVEN.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Days days0 = Days.standardDaysIn(weeks0);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(30962844000000L);
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
      Days days0 = Days.TWO;
      int int0 = days0.SIX.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(2, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-413L));
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = Days.SIX;
      Days days3 = days1.plus(days2);
      assertSame(days3, days2);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.ONE;
      Period period0 = days0.TWO.toPeriod();
      Days days1 = Days.standardDaysIn(period0);
      assertEquals(2, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.days(5);
      Weeks weeks0 = days0.toStandardWeeks();
      Days days1 = Days.standardDaysIn(weeks0);
      assertEquals(5, days0.getDays());
      assertEquals(1, days1.size());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.SIX;
      int int0 = days0.FOUR.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      int int0 = days0.FIVE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.minutes(1894);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.SIX;
      boolean boolean0 = days0.ONE.equals(days0);
      assertEquals(6, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Days days0 = Days.SIX;
      boolean boolean0 = days0.SIX.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ONE;
      MutablePeriod mutablePeriod0 = days0.FOUR.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(4, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.standardDaysIn(days0);
      Weeks weeks0 = days0.toStandardWeeks();
      Hours hours0 = weeks0.toStandardHours();
      Days days2 = Days.standardDaysIn(hours0);
      assertEquals(0, days2.getDays());
      assertSame(days0, days1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = days0.MAX_VALUE.minus(1412);
      assertEquals(1, days0.getDays());
      assertEquals(2147482235, days1.getDays());
  }
}
