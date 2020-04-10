/*

 * Tue Mar 03 17:09:53 GMT 2020
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
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) yearMonth0);
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
      Period period0 = Period.weeks(168);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(1693440, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Days days0 = Days.standardDaysIn(minutes0);
      // Undeclared exception!
      try { 
        minutes0.THREE.compareTo((BaseSingleFieldPeriod) days0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Days
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      boolean boolean0 = seconds0.equals("k8z>?M_8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      Minutes minutes2 = minutes1.plus(1);
      assertEquals(1, minutes2.getMinutes());
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      LocalTime localTime0 = new LocalTime();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes2.getMinutes());
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      boolean boolean0 = minutes0.MAX_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Period period0 = minutes0.toPeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(period0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.FIVE;
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      assertEquals(7200, minutes0.getMinutes());
      assertEquals(5, days0.getDays());
      
      LocalTime localTime0 = new LocalTime();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(3, minutes0.getMinutes());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.ZERO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.seconds(168);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      int int0 = minutes0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.ZERO.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Seconds seconds0 = Seconds.MAX_VALUE;
      boolean boolean0 = minutes0.TWO.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.minutes(3);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(3, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      Minutes minutes1 = minutes0.plus(minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Partial partial0 = new Partial();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }
}
