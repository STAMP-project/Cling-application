/*

 * Tue Mar 03 17:22:21 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      Period period0 = Period.minutes(62);
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 62);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      Period period1 = period0.minusMonths(581);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period();
      Hours hours0 = period0.toStandardHours();
      hours0.toMutablePeriod();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.days(1);
      YearMonth yearMonth0 = new YearMonth(1, 1);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.plusMinutes(1);
      assertNotSame(period2, period0);
      assertFalse(period2.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) buddhistChronology0);
      Period period0 = new Period(dateMidnight0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusYears(987);
      Period period2 = period1.normalizedStandard();
      assertNotSame(period1, period0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      PeriodType periodType0 = PeriodType.months();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(1, 1);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      YearMonth yearMonth0 = new YearMonth(1, 1);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.multipliedBy(1);
      assertFalse(period2.equals((Object)period1));
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(1, 1);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusHours(2378);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.weeks(2968);
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      Period period1 = period0.withField(durationFieldType0, 2968);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalTime localTime0 = new LocalTime((Chronology) null);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.plusMillis(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      // Undeclared exception!
      try { 
        period0.plusMillis(690562340);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      YearMonth yearMonth0 = new YearMonth(1, 1);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.minus((ReadablePeriod) null);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(1, 1);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Hours hours0 = Hours.SIX;
      Period period1 = period0.minus(hours0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusSeconds(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-8));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
