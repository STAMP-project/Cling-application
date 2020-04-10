/*

 * Tue Mar 03 17:26:32 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalTime localTime0 = new LocalTime((Object) null);
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Weeks weeks0 = hours0.toStandardWeeks();
      boolean boolean0 = weeks0.THREE.equals(hours0);
      assertFalse(boolean0);
      assertEquals((-12782640), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = weeks0.plus(weeks0);
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
      Weeks weeks0 = Weeks.MAX_VALUE;
      int int0 = weeks0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      Weeks weeks2 = weeks1.minus(40);
      assertEquals(1, weeks2.size());
      assertEquals(0, weeks1.getWeeks());
      assertEquals((-40), weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = weeks0.ZERO.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      int int0 = weeks0.ZERO.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(0, int0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Interval interval0 = new Interval(1817L, 1817L);
      Weeks weeks0 = Weeks.weeksIn(interval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      boolean boolean0 = weeks0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      Weeks weeks2 = weeks1.minus(weeks0);
      Weeks.standardWeeksIn(weeks2);
      assertEquals(0, weeks2.getWeeks());
      assertSame(weeks1, weeks0);
      assertSame(weeks0, weeks1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      int int0 = weeks0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      MutablePeriod mutablePeriod0 = weeks0.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Object object0 = new Object();
      boolean boolean0 = weeks0.MIN_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(1, weeks1.size());
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(604800000L);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      Weeks weeks0 = seconds0.toStandardWeeks();
      assertEquals(604800, seconds0.getSeconds());
      assertEquals(1, weeks0.getWeeks());
  }
}
