/*

 * Tue Mar 03 17:07:40 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      boolean boolean0 = days0.SIX.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.parseDays((String) null);
      Days days2 = days1.plus(days0);
      assertSame(days2, days0);
      
      Days days3 = Days.standardDaysIn(days1);
      assertEquals(0, days3.getDays());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1006L));
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 543, 543, 543, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.SEVEN;
      int int0 = days0.TWO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(7, days0.getDays());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = Days.FIVE;
      int int0 = days0.FIVE.compareTo((BaseSingleFieldPeriod) days1);
      assertEquals(5, days1.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ONE;
      int int0 = days0.FIVE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      int int0 = days0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.SIX;
      Days days2 = days0.ZERO.plus(days1);
      assertSame(days2, days1);
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(1, days3.size());
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.SEVEN;
      MutablePeriod mutablePeriod0 = days0.THREE.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(7, days0.getDays());
      assertEquals(3, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.SIX;
      boolean boolean0 = days0.THREE.equals(days0);
      assertFalse(boolean0);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.SIX;
      Hours hours0 = days0.toStandardHours();
      boolean boolean0 = days0.MIN_VALUE.equals(hours0);
      assertEquals(144, hours0.getHours());
      assertEquals(6, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period(109, 109, (-746), (-746));
      Days days0 = Days.standardDaysIn(period0);
      Days days1 = Days.ONE;
      Days days2 = days0.plus(days1);
      assertEquals(4, days0.getDays());
      assertEquals(5, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Days days0 = Days.standardDaysIn(hours0);
      assertEquals(7, hours0.getHours());
      assertEquals(1, days0.size());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.millis(153692453);
      Days days0 = Days.standardDaysIn(period0);
      Days days1 = days0.minus((-1055));
      assertEquals(1056, days1.getDays());
      assertEquals(1, days0.getDays());
  }
}
