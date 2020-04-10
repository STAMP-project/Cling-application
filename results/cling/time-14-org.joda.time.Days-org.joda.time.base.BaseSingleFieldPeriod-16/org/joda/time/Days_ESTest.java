/*

 * Tue Mar 03 17:07:07 GMT 2020
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
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      boolean boolean0 = days0.FIVE.isSupported(durationFieldType0);
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
  public void test05()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.TWO;
      Days days2 = Days.standardDaysIn(days1);
      Days days3 = days0.ONE.plus(days1);
      assertSame(days1, days2);
      assertEquals(3, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.ONE;
      int int0 = days0.FOUR.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.SIX;
      Seconds seconds0 = days0.ONE.toStandardSeconds();
      Days days1 = days0.dividedBy(115);
      Days days2 = Days.standardDaysIn(days1);
      assertEquals(0, days2.getDays());
      
      Days days3 = Days.standardDaysIn(seconds0);
      assertEquals(86400, seconds0.getSeconds());
      assertEquals(1, days3.getDays());
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
      Days days2 = Days.standardDaysIn(days0);
      Days days3 = days0.ONE.plus(days1);
      assertEquals(1, days3.size());
      assertEquals(5, days3.getDays());
      assertSame(days0, days2);
      assertEquals(4, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.FIVE;
      int int0 = days0.FIVE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SIX;
      int int0 = days0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(6, days0.getDays());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      int int0 = days0.SIX.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.TWO;
      Days days2 = days0.ONE.plus(days1);
      assertEquals(3, days2.getDays());
      assertEquals(2, days1.getDays());
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(1, days3.size());
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.SEVEN;
      boolean boolean0 = days0.TWO.equals(days0);
      assertFalse(boolean0);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Days days0 = seconds0.toStandardDays();
      boolean boolean0 = days0.MIN_VALUE.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.TWO;
      Days days2 = Days.standardDaysIn(days1);
      assertSame(days2, days1);
      
      Days days3 = Days.standardDaysIn(days0);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Days days0 = Days.standardDaysIn(minutes0);
      assertEquals((-1491308), days0.getDays());
  }
}
