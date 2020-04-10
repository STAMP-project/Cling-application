/*

 * Tue Mar 03 17:22:32 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
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
      Weeks weeks0 = Weeks.ONE;
      Hours hours0 = Hours.THREE;
      boolean boolean0 = weeks0.equals(hours0);
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
      Days days0 = Days.FOUR;
      Weeks weeks0 = Weeks.standardWeeksIn(days0);
      assertEquals(4, days0.getDays());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.weeks(1118);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      assertEquals(1118, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      boolean boolean0 = weeks0.MIN_VALUE.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.THREE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      int int0 = weeks0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
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
      Weeks weeks0 = Weeks.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      boolean boolean0 = weeks0.THREE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.MIN_VALUE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      MutablePeriod mutablePeriod0 = weeks0.THREE.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      Weeks weeks2 = weeks0.plus((-1));
      assertSame(weeks0, weeks1);
      assertEquals(2, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      MutablePeriod mutablePeriod0 = weeks0.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Object object0 = new Object();
      boolean boolean0 = weeks0.equals(object0);
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
        Weeks.parseWeeks("jB&>2c\"Rqob");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"jB&>2c\"Rqob\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(9L);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.parse("");
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }
}
