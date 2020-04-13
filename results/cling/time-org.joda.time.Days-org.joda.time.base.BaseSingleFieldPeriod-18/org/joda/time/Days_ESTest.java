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
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = days0.THREE.isSupported(durationFieldType0);
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
      Days days0 = Days.days(0);
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = Days.TWO;
      Days days3 = days1.plus(days2);
      assertSame(days3, days2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-574L));
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ONE;
      Hours hours0 = Hours.EIGHT;
      Days days1 = hours0.toStandardDays();
      Days days2 = days1.SEVEN.minus(days0);
      assertEquals(6, days2.getDays());
      
      Days days3 = Days.standardDaysIn(days1);
      assertEquals(8, hours0.getHours());
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.ONE;
      Hours hours0 = Hours.EIGHT;
      Days days2 = hours0.toStandardDays();
      Days days3 = Days.standardDaysIn(days2);
      assertEquals(0, days3.getDays());
      
      Days days4 = days0.plus(days1);
      assertEquals(4, days4.getDays());
      assertEquals(1, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.ONE;
      Days days2 = Days.standardDaysIn(days1);
      Days days3 = days0.plus(days1);
      assertEquals(4, days3.getDays());
      assertSame(days1, days2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.days(0);
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = Days.FIVE;
      Days days3 = days1.plus(days2);
      assertSame(days3, days2);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.SEVEN;
      int int0 = days0.SEVEN.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(7, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.ZERO;
      int int0 = days0.FOUR.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      int int0 = days0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.ONE;
      Period period0 = days0.toPeriod();
      Days days1 = Days.standardDaysIn(period0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ONE;
      boolean boolean0 = days0.SIX.equals(days0);
      assertFalse(boolean0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.ZERO;
      Minutes minutes0 = Minutes.THREE;
      boolean boolean0 = days0.THREE.equals(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
      
      PeriodType periodType0 = PeriodType.standard();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Days days2 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.SEVEN.plus((-669));
      assertEquals((-662), days1.getDays());
  }
}
