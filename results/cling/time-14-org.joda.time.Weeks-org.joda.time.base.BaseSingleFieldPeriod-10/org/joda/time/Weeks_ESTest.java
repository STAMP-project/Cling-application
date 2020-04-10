/*

 * Tue Mar 03 17:26:08 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
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
      Weeks weeks0 = Weeks.MIN_VALUE;
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Weeks weeks1 = Weeks.ZERO;
      Weeks weeks2 = weeks0.THREE.plus(weeks1);
      assertEquals(3, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Days days0 = seconds0.toStandardDays();
      Seconds seconds1 = days0.toStandardSeconds();
      Weeks weeks0 = Weeks.standardWeeksIn(seconds1);
      Weeks weeks1 = weeks0.plus(1049);
      assertEquals(1049, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      int int0 = weeks0.ZERO.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
      assertEquals(3, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Weeks weeks0 = Weeks.standardWeeksIn(seconds0);
      Weeks weeks1 = weeks0.plus(1049);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(1049, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      MutablePeriod mutablePeriod0 = weeks0.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      boolean boolean0 = weeks0.MAX_VALUE.equals(weeks0);
      assertEquals(2, weeks0.getWeeks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      int int0 = weeks0.TWO.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      int int0 = weeks0.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      boolean boolean0 = weeks0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      int int0 = weeks0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      boolean boolean0 = weeks0.THREE.equals((Object) null);
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
        Weeks.parseWeeks("u ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"u \"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Days days0 = seconds0.toStandardDays();
      Seconds seconds1 = days0.toStandardSeconds();
      Weeks weeks0 = Weeks.standardWeeksIn(seconds1);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(2, seconds0.getSeconds());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1049, (Chronology) islamicChronology0);
      Weeks weeks1 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0, 0, 0, 0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.ONE;
      Weeks weeks2 = weeks0.plus(weeks1);
      assertSame(weeks2, weeks1);
      
      Weeks weeks3 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks3.getWeeks());
      assertEquals(1, weeks3.size());
  }
}
