/*

 * Tue Mar 03 17:10:10 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
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
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.minus(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      // Undeclared exception!
      try { 
        minutes0.minus(292278993);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -292278993
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Hours hours0 = Hours.FOUR;
      // Undeclared exception!
      try { 
        minutes0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Hours
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Object object0 = new Object();
      boolean boolean0 = minutes0.MIN_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ZERO;
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      assertEquals(0, minutes0.getMinutes());
      
      Minutes minutes1 = Minutes.ONE;
      Seconds seconds0 = minutes1.toStandardSeconds();
      Minutes minutes2 = seconds0.toStandardMinutes();
      assertSame(minutes2, minutes1);
      assertEquals(1, minutes1.getMinutes());
      assertEquals(60, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.ONE.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
      
      Minutes minutes2 = Minutes.standardMinutesIn(period0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ZERO;
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      assertEquals(0, minutes0.getMinutes());
      
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(Integer.MIN_VALUE, Integer.MIN_VALUE, (-21565440), (-21565440), 3091);
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = new Period();
      LocalDateTime localDateTime0 = new LocalDateTime();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Minutes minutes1 = Minutes.standardMinutesIn(period0);
      assertEquals(0, minutes1.getMinutes());
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
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
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
      
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Period period0 = new Period(30962844000000L, (Chronology) julianChronology0);
      Minutes minutes2 = Minutes.standardMinutesIn(period0);
      assertEquals(516047400, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      int int0 = minutes0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      boolean boolean0 = minutes0.TWO.equals(minutes0);
      assertEquals(1, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Days days0 = Days.THREE;
      boolean boolean0 = minutes0.THREE.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("W8]lQE,%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"W8]lQE,%\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }
}
