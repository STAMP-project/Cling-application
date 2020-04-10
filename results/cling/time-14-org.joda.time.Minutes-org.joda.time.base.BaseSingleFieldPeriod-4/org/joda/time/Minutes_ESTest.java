/*

 * Tue Mar 03 17:09:42 GMT 2020
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
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 1);
      LocalTime localTime0 = new LocalTime(7, 7, 7, 7, ethiopicChronology0);
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
      Period period0 = Period.weeks(172);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      assertEquals(1733760, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.ZERO;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertEquals(Integer.MIN_VALUE, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      assertEquals(360, minutes0.getMinutes());
      assertEquals(6, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Hours hours0 = minutes0.toStandardHours();
      // Undeclared exception!
      try { 
        minutes0.ONE.compareTo((BaseSingleFieldPeriod) hours0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Hours
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Object object0 = new Object();
      boolean boolean0 = minutes0.MIN_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.ONE;
      Minutes minutes3 = Minutes.standardMinutesIn(minutes2);
      assertSame(minutes3, minutes2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      boolean boolean0 = minutes0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = Minutes.MAX_VALUE;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertSame(minutes2, minutes1);
      
      Minutes minutes3 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes3.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      int int0 = minutes0.THREE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(3, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Years years0 = Years.ZERO;
      assertEquals(0, years0.getYears());
      
      Minutes minutes0 = Minutes.standardMinutesIn(years0);
      assertEquals(0, minutes0.getMinutes());
      
      LocalTime localTime0 = LocalTime.now();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      int int0 = minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, int0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.ZERO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
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
      Minutes minutes0 = Minutes.TWO;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(minutes0);
      assertEquals(0, seconds0.getSeconds());
      
      Minutes minutes1 = Minutes.THREE;
      Minutes minutes2 = minutes0.plus(minutes1);
      assertSame(minutes2, minutes1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      int int0 = minutes0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      boolean boolean0 = minutes0.THREE.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Days days0 = Days.MAX_VALUE;
      boolean boolean0 = days0.equals(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("kqD#_YezM]2L(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"kqD#_YezM]2L(\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
