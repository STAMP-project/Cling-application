/*

 * Tue Mar 03 17:22:46 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.days(0);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(3);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) buddhistChronology0);
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 2099);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) buddhistChronology0);
      PeriodType periodType0 = PeriodType.weeks();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = null;
      try {
        period0 = new Period(localTime0, yearMonth0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
      Period period1 = period0.plusMonths(3846);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.years(5);
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.yearDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) (-5551), (Chronology) buddhistChronology0);
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  @Ignore
  public void test10()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      PeriodType periodType0 = PeriodType.millis();
      Period period0 = new Period(mutableDateTime0, mutableDateTime0, periodType0);
      assertEquals(1583256141535L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.months((-1584));
      Period period1 = period0.normalizedStandard();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      Period period0 = Period.days(1913);
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.minutes();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      YearMonth yearMonth0 = new YearMonth(1378L, (Chronology) lenientChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.plusSeconds(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period((-17L), 0);
      PeriodType periodType0 = PeriodType.millis();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.multipliedBy(1);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.days(0);
      PeriodType periodType0 = PeriodType.yearDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) (-5551), (Chronology) buddhistChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.negated();
      assertNotSame(period2, period0);
      assertTrue(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.months(0);
      period0.minusHours(0);
      PeriodType periodType0 = PeriodType.yearDay();
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.months(0);
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(175L, dateTimeZone0);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      PeriodType periodType0 = PeriodType.dayTime();
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
  public void test19()  throws Throwable  {
      Period period0 = Period.months(0);
      Period period1 = period0.plusHours(1);
      PeriodType periodType0 = PeriodType.yearDay();
      YearMonth yearMonth0 = new YearMonth();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusSeconds((-5551));
      PeriodType periodType0 = PeriodType.yearDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) (-5551), (Chronology) buddhistChronology0);
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.months(0);
      period0.minusMillis(0);
      PeriodType periodType0 = PeriodType.yearDay();
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.days(0);
      period0.minusMillis((-24));
      PeriodType periodType0 = PeriodType.yearDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) (-5551), (Chronology) buddhistChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.days(0);
      PeriodType periodType0 = PeriodType.yearDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) (-5551), (Chronology) buddhistChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.minus((ReadablePeriod) null);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.minutes();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      YearMonth yearMonth0 = new YearMonth(1378L, (Chronology) lenientChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.minus(period0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Days days0 = Days.daysBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
      Period period1 = period0.plusMinutes(3846);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((long) 0, (Chronology) buddhistChronology0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = new Period((-261), (-261), (-261), (-261));
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-261));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
