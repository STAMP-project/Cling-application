/*

 * Tue Mar 03 17:06:41 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) null);
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
      Minutes minutes0 = Minutes.minutes(1062);
      LocalTime localTime0 = new LocalTime(0L);
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes2 = minutes0.plus(minutes1);
      assertEquals(1062, minutes2.getMinutes());
      assertSame(minutes2, minutes0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Weeks weeks0 = Weeks.TWO;
      // Undeclared exception!
      try { 
        minutes0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.ONE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.minutes(1);
      assertEquals(1, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1062);
      LocalTime localTime0 = new LocalTime((long) 1062);
      Hours hours0 = minutes0.THREE.toStandardHours();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes2 = Minutes.standardMinutesIn(hours0);
      assertEquals(0, minutes2.getMinutes());
      assertEquals(1062, minutes0.getMinutes());
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      boolean boolean0 = minutes0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Interval interval0 = new Interval((-129L), (-129L), (DateTimeZone) null);
      Minutes minutes0 = Minutes.minutesIn(interval0);
      Minutes minutes1 = Minutes.minutes(447);
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes1);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(447, minutes1.getMinutes());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.MAX_VALUE.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1062);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertTrue(minutes1.equals((Object)minutes0));
      
      LocalTime localTime0 = new LocalTime(0L);
      Minutes minutes2 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1062);
      int int0 = minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, int0);
      assertEquals(1062, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertSame(minutes1, minutes0);
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Object) null, islamicChronology0);
      Minutes minutes2 = Minutes.minutesBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      int int0 = minutes0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = minutes0.plus(1);
      assertEquals(1, minutes1.getMinutes());
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1062);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      boolean boolean0 = minutes0.equals(minutes1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      boolean boolean0 = minutes0.TWO.equals(mutablePeriod0);
      assertFalse(boolean0);
      assertEquals(2, minutes0.getMinutes());
      assertEquals(1, minutes0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("V!Q}Td44h2f3I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"V!Q}Td44h2f3I\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
