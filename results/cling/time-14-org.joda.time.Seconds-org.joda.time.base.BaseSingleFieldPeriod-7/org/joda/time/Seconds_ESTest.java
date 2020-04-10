/*

 * Tue Mar 03 16:47:09 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      Date date0 = gregorianCalendar0.getTime();
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1442L);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.ONE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Period period0 = Period.ZERO;
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds2, seconds0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      int int0 = seconds0.ZERO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3001L);
      Period period0 = duration0.toPeriod();
      Weeks.standardWeeksIn(period0);
      Seconds seconds0 = Seconds.seconds(2018);
      assertEquals(2018, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      boolean boolean0 = seconds0.ZERO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.THREE;
      Seconds seconds2 = seconds0.ZERO.plus(seconds1);
      assertSame(seconds2, seconds1);
      
      Seconds seconds3 = Seconds.standardSecondsIn(seconds0);
      assertEquals(1, seconds3.size());
      assertEquals(0, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(3001L);
      Period period0 = duration0.toPeriod();
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      Seconds seconds0 = weeks0.toStandardSeconds();
      Seconds seconds1 = Seconds.MAX_VALUE;
      Seconds seconds2 = seconds0.plus(seconds1);
      assertSame(seconds2, seconds1);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.ZERO.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = Days.FIVE;
      boolean boolean0 = seconds0.MAX_VALUE.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.ONE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(2, seconds0.getSeconds());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("iPPmPni91ds;b{G_6(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"iPPmPni91ds;b{G_6(\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
