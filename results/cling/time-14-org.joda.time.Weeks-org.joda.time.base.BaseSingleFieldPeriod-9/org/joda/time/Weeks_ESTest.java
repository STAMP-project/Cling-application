/*

 * Tue Mar 03 17:26:08 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period(29L, 29L);
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = weeks0.TWO.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = weeks0.minus(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.FIVE;
      Weeks weeks0 = Weeks.standardWeeksIn(days0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.weeks(Integer.MAX_VALUE);
      Weeks weeks2 = weeks0.minus(weeks1);
      Weeks weeks3 = Weeks.standardWeeksIn(weeks2);
      assertSame(weeks1, weeks0);
      assertEquals(0, weeks3.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      boolean boolean0 = weeks0.MAX_VALUE.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      int int0 = weeks0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.ZERO.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      boolean boolean0 = weeks0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Period period0 = weeks0.TWO.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertEquals(2, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      int int0 = weeks0.ONE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      MutablePeriod mutablePeriod0 = weeks0.THREE.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertEquals(2, weeks0.getWeeks());
      
      Weeks weeks2 = weeks0.MAX_VALUE.minus(weeks1);
      assertEquals(2147483644, weeks2.getWeeks());
      assertEquals(3, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Object object0 = new Object();
      boolean boolean0 = weeks0.MAX_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("8|X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8|X\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(0L, 0L);
      Months months0 = Months.monthsIn(mutableInterval0);
      assertEquals(0, months0.getMonths());
      
      Days days0 = Days.standardDaysIn(months0);
      assertEquals(0, days0.getDays());
      
      LocalDate localDate0 = new LocalDate();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.ZERO;
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      assertEquals(1, weeks0.size());
      assertEquals(0, weeks0.getWeeks());
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      Weeks weeks1 = Weeks.weeksBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      MutablePeriod mutablePeriod0 = weeks0.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(weeks1, weeks0);
  }
}
