/*

 * Tue Mar 03 16:48:51 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((long) 17, (Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localDate0);
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
      Seconds seconds0 = Seconds.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = seconds0.MAX_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = seconds0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period((-1L), (-3501L));
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals((-3), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period(2480L);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      boolean boolean0 = seconds0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      LocalTime localTime0 = new LocalTime((Chronology) julianChronology0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 4, (Chronology) gregorianChronology0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      Seconds seconds2 = seconds0.plus(3);
      assertEquals(3, seconds2.getSeconds());
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Weeks weeks0 = Weeks.standardWeeksIn(seconds0);
      Seconds seconds1 = Seconds.standardSecondsIn(weeks0);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(3, seconds0.getSeconds());
      assertEquals(1, seconds1.size());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Period period0 = new Period(1140L, (Chronology) copticChronology0);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Period period0 = new Period(1140L, (Chronology) copticChronology0);
      Seconds seconds2 = Seconds.standardSecondsIn(period0);
      assertEquals(1, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      boolean boolean0 = seconds0.TWO.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Hours hours0 = Hours.hours(2383);
      boolean boolean0 = seconds0.ZERO.equals(hours0);
      assertEquals(2383, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
