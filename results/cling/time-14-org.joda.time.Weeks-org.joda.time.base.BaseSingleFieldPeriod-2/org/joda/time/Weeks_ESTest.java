/*

 * Tue Mar 03 17:22:20 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
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
      LocalDate localDate0 = new LocalDate();
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDateTime0);
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
      Weeks weeks0 = Weeks.MAX_VALUE;
      Minutes minutes0 = Minutes.MAX_VALUE;
      boolean boolean0 = weeks0.ZERO.equals(minutes0);
      assertFalse(boolean0);
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
      Days days0 = Days.SIX;
      Weeks weeks0 = Weeks.standardWeeksIn(days0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      int int0 = weeks0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      MutablePeriod mutablePeriod0 = weeks0.TWO.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      Weeks weeks2 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(weeks0, weeks1);
      assertEquals(2, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(0);
      boolean boolean0 = weeks0.MIN_VALUE.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      int int0 = weeks0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = weeks0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      MutablePeriod mutablePeriod0 = weeks0.TWO.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      Weeks weeks2 = weeks1.minus(weeks0);
      assertEquals((-2147483645), weeks2.getWeeks());
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
      assertEquals(2, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      int int0 = weeks0.TWO.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Object object0 = new Object();
      boolean boolean0 = weeks0.THREE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"/\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = weeks0.dividedBy(168);
      LocalDate localDate0 = new LocalDate((long) 168);
      Weeks weeks2 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, weeks2.getWeeks());
      
      Days days0 = Days.standardDaysIn(weeks1);
      assertEquals(0, days0.getDays());
      assertEquals(2, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(1, weeks1.size());
      assertEquals(0, weeks1.getWeeks());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Weeks weeks2 = Weeks.weeksBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      assertEquals(0, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }
}
