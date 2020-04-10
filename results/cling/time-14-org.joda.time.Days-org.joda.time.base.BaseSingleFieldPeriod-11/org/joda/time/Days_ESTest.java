/*

 * Tue Mar 03 17:07:04 GMT 2020
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
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = days0.SIX.isSupported(durationFieldType0);
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
      LocalDateTime localDateTime0 = new LocalDateTime();
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      PeriodType periodType0 = PeriodType.minutes();
      Days days1 = Days.TWO;
      Days days2 = days0.minus(days1);
      Days days3 = days2.negated();
      assertSame(days3, days1);
      assertNotSame(days2, days1);
      
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Days days4 = Days.standardDaysIn(period0);
      assertNotSame(days4, days3);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
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
      Days days0 = Days.MIN_VALUE;
      int int0 = days0.SIX.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.days(6);
      assertEquals(6, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days1 = Days.SIX;
      Days days2 = Days.TWO;
      Days days3 = days1.minus(days2);
      assertEquals(2, days2.getDays());
      assertEquals(4, days3.getDays());
      
      Days days4 = Days.standardDaysIn(days0);
      assertEquals(0, days4.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = period0.toStandardWeeks();
      Days days0 = Days.standardDaysIn(weeks0);
      Days days1 = Days.FIVE;
      Days days2 = days0.plus(days1);
      assertSame(days2, days1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.MAX_VALUE;
      int int0 = days0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) days1);
      assertEquals(Integer.MAX_VALUE, days1.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SEVEN;
      int int0 = days0.FOUR.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      int int0 = days0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days1 = days0.plus(19);
      Days days2 = days1.dividedBy(19);
      assertEquals(1, days2.getDays());
      assertEquals(19, days1.getDays());
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days0.getDays());
      assertSame(days3, days0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days1 = Days.THREE;
      Days days2 = days1.plus(days0);
      Days days3 = Days.SIX;
      Days days4 = days3.minus(days2);
      assertSame(days4, days2);
      
      Days days5 = Days.standardDaysIn(days0);
      assertSame(days5, days0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.ZERO;
      boolean boolean0 = days0.SEVEN.equals(days0);
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Hours hours0 = Hours.ONE;
      boolean boolean0 = days0.SEVEN.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Days days0 = Days.standardDaysIn(hours0);
      assertEquals(0, days0.getDays());
      assertEquals(7, hours0.getHours());
      assertEquals(1, days0.size());
  }
}
