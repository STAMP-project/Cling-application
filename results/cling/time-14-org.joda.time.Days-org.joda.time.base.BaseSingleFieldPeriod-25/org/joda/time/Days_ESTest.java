/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:04:35 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      boolean boolean0 = days0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.SEVEN;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      int int0 = days0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.SEVEN;
      boolean boolean0 = days0.FOUR.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.FOUR.equals(days0);
      assertFalse(boolean0);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = days0.MIN_VALUE.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.seconds((-3936));
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals((-65), minutes0.getMinutes());
      
      Seconds seconds0 = Seconds.ZERO;
      Days days0 = seconds0.toStandardDays();
      Days days1 = Days.SIX;
      Days days2 = days0.plus(days1);
      assertSame(days2, days1);
      assertEquals(0, days0.getDays());
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
      Period period0 = Period.minutes(1440);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period(128, 128, 128, 128);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.hours(84);
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.THREE;
      int int0 = days0.SEVEN.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(3, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Minutes minutes0 = Minutes.MIN_VALUE;
      // Undeclared exception!
      try { 
        days0.ZERO.compareTo((BaseSingleFieldPeriod) minutes0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Days cannot be compared to class org.joda.time.Minutes
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.FIVE;
      int int0 = days0.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(5, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.SEVEN;
      int int0 = days0.THREE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(7, days0.getDays());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.days((-887));
      assertEquals((-887), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Days days0 = Days.FOUR;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
      
      Minutes minutes0 = Minutes.ZERO;
      Weeks weeks0 = minutes0.toStandardWeeks();
      Days days2 = Days.standardDaysIn(weeks0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }
}
