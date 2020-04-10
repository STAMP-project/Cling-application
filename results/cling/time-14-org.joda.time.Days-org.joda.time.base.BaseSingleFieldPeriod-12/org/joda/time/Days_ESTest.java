/*

 * Tue Mar 03 17:07:03 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ZERO;
      boolean boolean0 = days0.TWO.isSupported((DurationFieldType) null);
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
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(256L, 256L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Days days1 = Days.ONE;
      Days days2 = days1.plus(1);
      assertEquals(2, days2.getDays());
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) buddhistChronology0);
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
      int int0 = days0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = days0.plus(1);
      assertSame(days0, days1);
      assertEquals(1, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = days1.plus(4);
      assertEquals(4, days2.getDays());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.FOUR;
      Days days2 = days0.ONE.plus(days1);
      assertEquals(5, days2.getDays());
      assertEquals(4, days1.getDays());
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days3.getDays());
      assertEquals(1, days3.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.ZERO;
      int int0 = days0.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      int int0 = days0.TWO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.SEVEN;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      int int0 = days0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.FIVE;
      Days days2 = days0.ONE.plus(days1);
      assertEquals(5, days1.getDays());
      assertEquals(6, days2.getDays());
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(1, days3.size());
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.ZERO;
      boolean boolean0 = days0.TWO.equals(days0);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Seconds seconds0 = minutes0.toStandardSeconds();
      boolean boolean0 = seconds0.equals(minutes0);
      assertEquals(180, seconds0.getSeconds());
      assertEquals(3, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.THREE;
      Days days2 = Days.standardDaysIn(days0);
      assertEquals(0, days2.getDays());
      
      Days days3 = Days.standardDaysIn(days1);
      assertSame(days3, days1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Days days0 = Days.standardDaysIn(minutes0);
      assertEquals(1491308, days0.getDays());
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }
}
