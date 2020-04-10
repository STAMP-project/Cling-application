/*

 * Tue Mar 03 17:06:44 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      boolean boolean0 = days0.ZERO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(29L);
      Days days0 = Days.TWO;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
      
      Days days2 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days3 = Days.standardDaysIn(days2);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Days days0 = Days.standardDaysIn(weeks0);
      assertEquals(7, days0.getDays());
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Hours hours0 = Hours.TWO;
      Days days1 = Days.standardDaysIn(hours0);
      Days days2 = days1.plus(days0);
      assertEquals(Integer.MIN_VALUE, days2.getDays());
      assertEquals(2, hours0.getHours());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ZERO;
      int int0 = days0.FOUR.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-2L));
      Days days0 = Days.FOUR;
      Days days1 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days2 = days1.TWO.plus(days0);
      assertEquals(6, days2.getDays());
      assertEquals(4, days0.getDays());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Hours hours0 = days0.toStandardHours();
      Days days1 = Days.standardDaysIn(hours0);
      Days days2 = days0.minus((-1));
      assertEquals(0, days0.getDays());
      assertEquals(1, days2.getDays());
      assertSame(days0, days1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Days days0 = Days.standardDaysIn(hours0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.days(5);
      assertEquals(5, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.THREE;
      boolean boolean0 = days0.TWO.equals(days0);
      assertFalse(boolean0);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.minutes(1044414);
      Hours hours0 = period0.toStandardHours();
      Days days0 = hours0.toStandardDays();
      boolean boolean0 = days0.SIX.equals(hours0);
      assertEquals(725, days0.getDays());
      assertFalse(boolean0);
      assertEquals(17406, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-2L));
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      int int0 = days0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, days0.getDays());
      assertEquals((-1), int0);
  }
}
