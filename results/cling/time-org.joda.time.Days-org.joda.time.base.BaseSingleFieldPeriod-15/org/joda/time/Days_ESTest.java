/*

 * Tue Mar 03 17:07:12 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      boolean boolean0 = days0.ZERO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Days days0 = Days.standardDaysIn(weeks0);
      assertEquals(1, weeks0.getWeeks());
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Days days0 = Days.standardDaysIn(minutes0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.FIVE;
      Days days2 = days1.dividedBy(2);
      assertEquals(2, days2.getDays());
      assertEquals(5, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
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
      Minutes minutes0 = Minutes.ZERO;
      Days days0 = Days.standardDaysIn(minutes0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.SIX;
      Days days2 = days1.dividedBy(2);
      assertEquals(3, days2.getDays());
      assertEquals(6, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = Days.SIX;
      Minutes minutes0 = days1.toStandardMinutes();
      Hours hours0 = minutes0.toStandardHours();
      Days days2 = hours0.toStandardDays();
      assertEquals(8640, minutes0.getMinutes());
      assertSame(days2, days1);
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      Days days0 = Days.days(1);
      assertEquals(1, days0.getDays());
      
      Days days1 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Days days2 = Days.standardDaysIn(days1);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.FOUR;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      Days days1 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Days days2 = days1.minus(days0);
      Days days3 = days2.negated();
      assertEquals(4, days0.getDays());
      assertSame(days3, days0);
      
      Days days4 = Days.standardDaysIn(days1);
      assertEquals(0, days4.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.FOUR;
      assertEquals(1, days0.size());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      Days days1 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Days days2 = Days.standardDaysIn(days1);
      assertEquals(0, days2.getDays());
      
      Days days3 = days0.plus(1);
      assertEquals(5, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.SEVEN;
      int int0 = days0.SIX.compareTo((BaseSingleFieldPeriod) days1);
      assertEquals((-1), int0);
      assertEquals(7, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.SEVEN;
      int int0 = days0.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      int int0 = days0.SIX.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      int int0 = days0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.ONE;
      boolean boolean0 = days0.MAX_VALUE.equals(days0);
      assertFalse(boolean0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.standardDaysIn((ReadablePeriod) null);
      Seconds seconds0 = days0.toStandardSeconds();
      boolean boolean0 = days0.MAX_VALUE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.FOUR;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      Days days1 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.standardDaysIn(days0);
      assertSame(days2, days0);
  }
}
