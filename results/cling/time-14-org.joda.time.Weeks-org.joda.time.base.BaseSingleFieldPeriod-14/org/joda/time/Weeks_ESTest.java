/*

 * Tue Mar 03 17:26:31 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
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
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = localDateTime0.toLocalDate();
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
      Hours hours0 = Hours.ONE;
      Weeks weeks0 = hours0.toStandardWeeks();
      boolean boolean0 = weeks0.equals(hours0);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(1, hours0.getHours());
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
      Hours hours0 = Hours.ONE;
      Weeks weeks0 = Weeks.standardWeeksIn(hours0);
      assertEquals(1, hours0.getHours());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      int int0 = weeks0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(3, weeks0.getWeeks());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      Weeks weeks1 = weeks0.plus((-32));
      assertEquals((-32), weeks1.getWeeks());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      boolean boolean0 = weeks0.ONE.equals(weeks0);
      assertEquals(2, weeks0.getWeeks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      int int0 = weeks0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, weeks0.getWeeks());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      boolean boolean0 = weeks0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      int int0 = weeks0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = weeks0.plus(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks2.getWeeks());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Object object0 = new Object();
      boolean boolean0 = weeks0.THREE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("ISOChronology");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ISOChronology\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.ONE;
      Weeks weeks0 = days0.toStandardWeeks();
      Weeks weeks1 = weeks0.plus(1);
      assertEquals(1, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks2.getWeeks());
      assertEquals(0, weeks0.getWeeks());
      assertEquals(1, weeks2.size());
  }
}
