/*

 * Tue Mar 03 17:22:17 GMT 2020
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
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.IslamicChronology;
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
      Weeks weeks0 = Weeks.TWO;
      Days days0 = Days.ZERO;
      boolean boolean0 = weeks0.MIN_VALUE.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = Weeks.ZERO;
      Weeks weeks2 = weeks0.plus(weeks1);
      assertEquals(2, weeks2.getWeeks());
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
      int int0 = weeks0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      Weeks weeks2 = weeks1.THREE.negated();
      assertEquals((-3), weeks2.getWeeks());
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      boolean boolean0 = weeks0.ZERO.equals(weeks0);
      assertEquals(2, weeks0.getWeeks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      int int0 = weeks0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(2, weeks0.getWeeks());
      assertEquals((-1), int0);
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
      Weeks weeks0 = Weeks.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      boolean boolean0 = weeks0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      Weeks weeks2 = Weeks.THREE;
      Weeks weeks3 = weeks1.plus(weeks2);
      assertSame(weeks3, weeks2);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      int int0 = weeks0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertSame(weeks1, weeks0);
      
      LocalDate localDate0 = new LocalDate();
      Weeks weeks2 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      boolean boolean0 = weeks0.MIN_VALUE.equals("Parsing not supported");
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate0 = new LocalDate(2347L, (Chronology) islamicChronology0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      Weeks weeks2 = weeks1.plus(weeks0);
      assertSame(weeks1, weeks0);
      assertEquals(2, weeks2.getWeeks());
  }
}
