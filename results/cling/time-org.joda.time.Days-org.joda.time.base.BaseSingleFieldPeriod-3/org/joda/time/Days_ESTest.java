/*

 * Tue Mar 03 17:06:45 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
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
      LocalDate localDate0 = new LocalDate();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(100, 100).when(dateTimeZone0).getOffset(anyLong());
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      Days days0 = Days.daysBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Days days1 = Days.standardDaysIn(days0);
      days1.plus(1);
      assertEquals(1583255192297L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.TWO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(100, 100).when(dateTimeZone0).getOffset(anyLong());
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      Days days0 = Days.daysBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Days.standardDaysIn(days0);
      assertEquals(1583255191109L, mutableDateTime0.getMillis());
      
      Days days1 = Days.days(5);
      assertEquals(5, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.THREE;
      int int0 = days0.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      int int0 = days0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      Days days1 = seconds0.toStandardDays();
      assertSame(days1, days0);
      assertEquals(3, days0.getDays());
      assertEquals(259200, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.THREE;
      boolean boolean0 = days0.ONE.equals(days0);
      assertFalse(boolean0);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Days days0 = Days.THREE;
      boolean boolean0 = days0.THREE.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.SIX;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Days days0 = Days.standardDaysIn(minutes0);
      assertEquals(1, minutes0.getMinutes());
      assertEquals(0, days0.getDays());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.days(1673);
      assertEquals(1673, days0.getDays());
  }
}
