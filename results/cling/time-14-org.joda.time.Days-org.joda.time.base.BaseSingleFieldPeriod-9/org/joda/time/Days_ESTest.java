/*

 * Tue Mar 03 17:06:56 GMT 2020
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
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.THREE;
      Weeks weeks0 = Weeks.standardWeeksIn(days0);
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      boolean boolean0 = days0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Days days0 = weeks0.toStandardDays();
      assertEquals(7, days0.getDays());
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((long) (-1), (DateTimeZone) fixedDateTimeZone0);
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
      Days days0 = Days.days(2);
      int int0 = days0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Days days1 = Days.days(1);
      assertEquals(1, days1.getDays());
      
      Days days2 = Days.standardDaysIn(days0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.FIVE;
      Days days2 = days0.plus(days1);
      assertSame(days2, days1);
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      int int0 = days0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.SEVEN;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      int int0 = days0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = days0.negated();
      Days days2 = days1.negated();
      Weeks weeks0 = days0.toStandardWeeks();
      Days days3 = Days.standardDaysIn(weeks0);
      assertNotSame(days0, days1);
      assertEquals(0, days3.getDays());
      assertSame(days0, days2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(445);
      Days days0 = weeks0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      boolean boolean0 = days0.FOUR.equals(hours0);
      assertFalse(boolean0);
      assertEquals(74760, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.days(2);
      Days days1 = days0.multipliedBy(2);
      assertEquals(4, days1.getDays());
      assertEquals(2, days0.getDays());
      
      Minutes minutes0 = Minutes.minutes(4);
      Hours hours0 = minutes0.toStandardHours();
      Days days2 = Days.standardDaysIn(hours0);
      assertEquals(0, days2.getDays());
      assertEquals(4, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.SIX;
      Days days3 = Days.standardDaysIn(days2);
      assertSame(days3, days2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      boolean boolean0 = days0.THREE.equals(days0);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }
}
