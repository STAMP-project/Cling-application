/*

 * Tue Mar 03 17:09:50 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
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
      Minutes minutes0 = Minutes.TWO;
      Days days0 = minutes0.toStandardDays();
      Minutes minutes1 = Minutes.standardMinutesIn(days0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.minutes((-1));
      assertEquals((-1), minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.ZERO;
      Minutes minutes2 = minutes0.minus(minutes1);
      assertEquals(0, minutes1.getMinutes());
      assertEquals(Integer.MAX_VALUE, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Minutes minutes0 = Minutes.standardMinutesIn(hours0);
      // Undeclared exception!
      try { 
        minutes0.compareTo((BaseSingleFieldPeriod) hours0);
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
      Minutes minutes0 = Minutes.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = minutes0.THREE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      assertEquals(1, minutes0.size());
      
      Partial partial0 = new Partial();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      assertEquals(0, minutes1.getMinutes());
      
      Days days0 = Days.standardDaysIn(minutes0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      boolean boolean0 = minutes0.ONE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(minutes0);
      assertEquals(0, seconds0.getSeconds());
      
      Minutes minutes1 = Minutes.minutes(Integer.MAX_VALUE);
      assertEquals(1, minutes1.size());
      assertEquals(Integer.MAX_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Days days0 = minutes0.toStandardDays();
      Minutes minutes1 = Minutes.standardMinutesIn(days0);
      assertEquals(2, minutes0.getMinutes());
      assertEquals(0, minutes1.getMinutes());
      
      LocalTime localTime0 = new LocalTime();
      Minutes minutes2 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(1, minutes2.size());
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, minutes0.getMinutes());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((DateTime) null).when(readableInterval0).getEnd();
      doReturn((DateTime) null).when(readableInterval0).getStart();
      // Undeclared exception!
      try { 
        Minutes.minutesIn(readableInterval0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(1);
      Period period0 = minutes0.ONE.toPeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(period0);
      Minutes minutes2 = minutes1.plus(minutes0);
      assertSame(minutes1, minutes0);
      assertEquals(2, minutes2.getMinutes());
      assertEquals(1, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.ONE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.ONE.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Hours hours0 = minutes0.toStandardHours();
      boolean boolean0 = minutes0.equals(hours0);
      assertEquals((-35791394), hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
      
      LocalTime localTime0 = new LocalTime();
      Minutes minutes2 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = minutes0.minus((-1));
      assertEquals(3, minutes1.getMinutes());
      
      Days days0 = minutes0.toStandardDays();
      Minutes minutes2 = Minutes.standardMinutesIn(days0);
      assertEquals(0, minutes2.getMinutes());
      assertEquals(1, minutes2.size());
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
        Minutes.parseMinutes("hq[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"hq[\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
