/*

 * Tue Mar 03 17:06:54 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
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
      Days days0 = Days.SEVEN;
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      boolean boolean0 = days0.ZERO.isSupported(durationFieldType0);
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
      Days days0 = Days.ONE;
      int int0 = days0.FOUR.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = days0.dividedBy(2);
      Days days2 = Days.ZERO;
      Days days3 = Days.standardDaysIn(days2);
      assertEquals(0, days3.getDays());
      
      Days days4 = days1.plus(days0);
      assertEquals(1, days1.getDays());
      assertEquals(4, days4.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = days0.dividedBy(2);
      Days days2 = Days.standardDaysIn(days0);
      Days days3 = days1.plus(days0);
      assertEquals(4, days3.getDays());
      assertSame(days0, days2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.TWO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = days0.toPeriod();
      Days days1 = Days.standardDaysIn(period0);
      Duration duration0 = period0.toStandardDuration();
      Duration duration1 = duration0.plus((long) (-322));
      Days days2 = duration1.toStandardDays();
      assertSame(days0, days1);
      assertEquals(5, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      int int0 = days0.FIVE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      int int0 = days0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      int int0 = days0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      boolean boolean0 = days0.ZERO.equals(days0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ONE;
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = days0.TWO.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = days0.toPeriod();
      Days days1 = Days.standardDaysIn(period0);
      Days days2 = days1.minus(days1);
      assertSame(days1, days0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.FOUR;
      Days days3 = days2.minus(1);
      assertEquals(3, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.days((-1522));
      assertEquals((-1522), days0.getDays());
  }
}
