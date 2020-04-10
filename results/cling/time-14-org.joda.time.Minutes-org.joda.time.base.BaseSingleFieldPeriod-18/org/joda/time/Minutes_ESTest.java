/*

 * Tue Mar 03 17:10:22 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Minutes minutes0 = Minutes.standardMinutesIn(seconds0);
      assertEquals(2, seconds0.getSeconds());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) islamicChronology0);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.ZERO;
      Minutes minutes2 = minutes0.minus(minutes1);
      assertEquals(Integer.MIN_VALUE, minutes2.getMinutes());
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.days(279);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(401760, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Seconds seconds0 = Seconds.THREE;
      // Undeclared exception!
      try { 
        minutes0.compareTo((BaseSingleFieldPeriod) seconds0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = minutes0.MAX_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      boolean boolean0 = minutes0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.ZERO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, int0);
      assertEquals(1, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Period period0 = minutes0.toPeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(period0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      int int0 = minutes0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      Minutes minutes1 = Minutes.ONE;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertSame(minutes2, minutes1);
      
      Minutes minutes3 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes3, minutes0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      boolean boolean0 = minutes0.MIN_VALUE.equals(minutes0);
      assertEquals(1, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Weeks weeks0 = Weeks.standardWeeksIn(minutes0);
      boolean boolean0 = minutes0.THREE.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(213044, weeks0.getWeeks());
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Minutes minutes0 = Minutes.standardMinutesIn(seconds0);
      Minutes minutes1 = Minutes.MAX_VALUE;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertEquals(0, minutes0.getMinutes());
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("MUA0kB]sd+]!asfsv");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"MUA0kB]sd+]!asfsv\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Object) null);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }
}
