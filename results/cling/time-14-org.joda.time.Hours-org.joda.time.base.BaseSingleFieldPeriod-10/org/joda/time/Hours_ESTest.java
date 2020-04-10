/*

 * Tue Mar 03 17:12:35 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period((-1L));
      Period period1 = period0.plusSeconds((-4422));
      Hours hours0 = Hours.standardHoursIn(period1);
      Hours hours1 = Hours.SIX;
      Hours hours2 = hours1.plus(hours0);
      assertEquals(6, hours1.getHours());
      assertEquals(5, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.SIX.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      int int0 = hours0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(5, hours0.getHours());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.MAX_VALUE.equals(hours0);
      assertFalse(boolean0);
      assertEquals(3, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Weeks weeks0 = hours0.toStandardWeeks();
      boolean boolean0 = hours0.equals(weeks0);
      assertFalse(boolean0);
      assertEquals((-12782640), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Weeks weeks0 = Weeks.ONE;
      // Undeclared exception!
      try { 
        hours0.EIGHT.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period((-1L));
      Period period1 = period0.plusSeconds((-4422));
      Hours hours0 = Hours.standardHoursIn(period1);
      Hours hours1 = hours0.negated();
      assertEquals((-1), hours0.getHours());
      assertEquals(1, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(41L, dateTimeZone0);
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, mutableDateTime0, periodType0);
      Hours hours0 = Hours.standardHoursIn(mutablePeriod0);
      Hours hours1 = hours0.plus(3);
      assertEquals(3, hours1.getHours());
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period((-1L));
      Hours hours0 = Hours.standardHoursIn(period0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }
}
