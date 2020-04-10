/*

 * Tue Mar 03 17:07:20 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.SEVEN;
      boolean boolean0 = days0.SIX.isSupported((DurationFieldType) null);
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
      LocalDate localDate0 = LocalDate.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Days days0 = minutes0.toStandardDays();
      Days days1 = Days.THREE;
      Days days2 = Days.standardDaysIn(days1);
      assertSame(days2, days1);
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
      
      Days days2 = Days.ZERO;
      Days days3 = Days.standardDaysIn(days2);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.millis((-3257L));
      Days days0 = Days.FIVE;
      DateMidnight dateMidnight0 = new DateMidnight();
      Days days1 = Days.daysBetween((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight0);
      Days days2 = days1.plus(days0);
      assertSame(days2, days0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, duration0);
      Days days3 = Days.standardDaysIn(mutablePeriod0);
      assertSame(days3, days1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.SEVEN;
      int int0 = days0.FIVE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(7, days0.getDays());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.ONE;
      int int0 = days0.ONE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.TWO;
      int int0 = days0.SEVEN.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(2, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      int int0 = hours0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.SIX;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period(days0, periodType0);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      Days days1 = minutes0.toStandardDays();
      assertEquals(6, days0.getDays());
      assertEquals(8640, minutes0.getMinutes());
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period(86400000L);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.SEVEN.equals(days0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.FIVE;
      Hours hours0 = Hours.MAX_VALUE;
      boolean boolean0 = days0.SIX.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.millis((-3257L));
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      DateMidnight dateMidnight0 = new DateMidnight();
      Days days1 = Days.FOUR;
      Days days2 = days0.plus(days1);
      assertEquals(0, days0.getDays());
      assertSame(days2, days1);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, duration0);
      Days days3 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = days0.minus((-59));
      assertEquals(61, days1.getDays());
  }
}
