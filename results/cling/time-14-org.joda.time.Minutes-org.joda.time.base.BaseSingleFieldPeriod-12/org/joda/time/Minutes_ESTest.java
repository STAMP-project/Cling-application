/*

 * Tue Mar 03 17:09:59 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.temporal.ChronoField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
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
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-1440));
      LocalDate localDate0 = new LocalDate();
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
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Days days0 = minutes0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      Minutes minutes1 = Minutes.standardMinutesIn(hours0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = minutes0.negated();
      assertNotSame(minutes2, minutes0);
      assertEquals((-1), minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = Minutes.ZERO;
      Minutes minutes2 = minutes0.minus(minutes1);
      assertEquals(1, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Weeks weeks0 = Weeks.THREE;
      // Undeclared exception!
      try { 
        minutes0.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      ChronoField chronoField0 = ChronoField.SECOND_OF_DAY;
      boolean boolean0 = minutes0.equals(chronoField0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Days days0 = minutes0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      Minutes minutes1 = Minutes.standardMinutesIn(hours0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes2, minutes0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.ZERO;
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      assertEquals(1, minutes0.size());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(1L, (Chronology) islamicChronology0);
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      assertSame(minutes1, minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      boolean boolean0 = minutes0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Hours hours0 = weeks0.toStandardHours();
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      assertEquals(0, minutes0.getMinutes());
      
      Minutes minutes1 = Minutes.MAX_VALUE;
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals((-1), int0);
      assertEquals(3, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-425L), (Chronology) islamicChronology0);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(1, minutes1.size());
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(1, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = minutes0.dividedBy(915);
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertEquals(0, minutes2.getMinutes());
      
      Minutes minutes3 = Minutes.TWO;
      Minutes minutes4 = Minutes.standardMinutesIn(minutes3);
      assertSame(minutes4, minutes3);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      int int0 = minutes0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.THREE.equals(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      boolean boolean0 = minutes0.TWO.equals(hours0);
      assertEquals(300, minutes0.getMinutes());
      assertFalse(boolean0);
      assertEquals(5, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Hours hours0 = weeks0.toStandardHours();
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      Minutes minutes1 = Minutes.THREE;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertSame(minutes2, minutes1);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(1, minutes2.size());
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
        Minutes.parseMinutes("1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"1\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
