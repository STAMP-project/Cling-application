/*

 * Tue Mar 03 17:26:44 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDate localDate0 = new LocalDate(0L, dateTimeZone0);
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
      MutablePeriod mutablePeriod0 = weeks0.ZERO.toMutablePeriod();
      boolean boolean0 = weeks0.ONE.equals(mutablePeriod0);
      assertFalse(boolean0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(2, 2);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
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
      Weeks weeks0 = Weeks.THREE;
      int int0 = weeks0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(3, weeks0.getWeeks());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Weeks weeks0 = seconds0.toStandardWeeks();
      Hours hours0 = weeks0.toStandardHours();
      Seconds seconds1 = hours0.toStandardSeconds();
      Weeks weeks1 = Weeks.standardWeeksIn(seconds1);
      Weeks weeks2 = weeks0.plus(Integer.MAX_VALUE);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(Integer.MAX_VALUE, weeks2.getWeeks());
      assertSame(weeks0, weeks1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      boolean boolean0 = weeks0.THREE.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.THREE;
      int int0 = weeks1.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(3, weeks1.getWeeks());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      Weeks weeks0 = seconds0.toStandardWeeks();
      int int0 = weeks0.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(0, int0);
      assertEquals(0, weeks0.getWeeks());
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
      Weeks weeks0 = Weeks.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      boolean boolean0 = weeks0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Weeks weeks0 = seconds0.toStandardWeeks();
      Weeks weeks1 = Weeks.standardWeeksIn(seconds0);
      assertEquals(0, weeks1.getWeeks());
      
      Weeks weeks2 = weeks0.plus(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1004, 1004, 1004, 1004);
      Weeks weeks0 = Weeks.standardWeeksIn(mutablePeriod0);
      assertEquals(6, weeks0.getWeeks());
      
      Weeks weeks1 = Weeks.TWO;
      Weeks weeks2 = Weeks.standardWeeksIn(weeks1);
      assertSame(weeks2, weeks1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(0);
      Weeks weeks1 = Weeks.weeks(3);
      assertEquals(3, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      int int0 = weeks0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Object object0 = new Object();
      boolean boolean0 = weeks0.MAX_VALUE.equals(object0);
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
        Weeks.parseWeeks("Standard");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Standard\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDate localDate0 = new LocalDate(0L, (Chronology) gJChronology0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(2, 2);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.minutes(1);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      Weeks weeks1 = weeks0.plus(1);
      assertEquals(1, weeks1.getWeeks());
      assertEquals(0, weeks0.getWeeks());
  }
}
