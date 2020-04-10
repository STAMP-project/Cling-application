/*

 * Tue Mar 03 17:07:01 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = days0.TWO.isSupported(durationFieldType0);
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
      Days days0 = Days.ZERO;
      Days days1 = Days.days(2);
      assertEquals(2, days1.getDays());
      
      Days days2 = Days.standardDaysIn(days0);
      assertEquals(0, days2.getDays());
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
      Days days0 = Days.FIVE;
      Days days1 = Days.SIX;
      int int0 = days1.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(6, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.days(6);
      assertEquals(6, days1.getDays());
      
      Days days2 = Days.standardDaysIn(days0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.days(5);
      Days days1 = days0.negated();
      Days days2 = days0.plus(days1);
      Days days3 = Days.standardDaysIn(days2);
      assertEquals((-5), days1.getDays());
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ONE;
      int int0 = days0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.FIVE;
      int int0 = days0.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      int int0 = minutes0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.TWO;
      Period period0 = days0.ONE.toPeriod();
      Days days1 = Days.standardDaysIn(period0);
      assertEquals(1, days1.getDays());
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = days0.minus(days1);
      Days days3 = Days.standardDaysIn(days2);
      assertEquals(0, days2.getDays());
      assertSame(days1, days0);
      assertNotSame(days0, days3);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ZERO;
      boolean boolean0 = days0.MIN_VALUE.equals(days0);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.TWO;
      Hours hours0 = Hours.TWO;
      boolean boolean0 = days0.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(10000000L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Days days0 = Days.daysBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Days days1 = Days.FOUR;
      Days days2 = Days.standardDaysIn(days1);
      assertSame(days2, days1);
      
      Days.standardDaysIn(days0);
      assertEquals(0, days0.getDays());
      assertNotSame(days0, days2);
  }
}
