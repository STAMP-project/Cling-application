/*

 * Tue Mar 03 17:21:59 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.months((-98));
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.plusYears(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, Integer.MIN_VALUE);
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
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      LocalDate localDate0 = new LocalDate((long) 1, dateTimeZone0);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, yearMonth0);
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
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths((-132));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
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
  @Ignore
  public void test09()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      Period period0 = new Period(mutableDateTime0, mutableDateTime0);
      assertEquals(1583256100293L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.years(2000);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = new Period(0L, 168L);
      Period period2 = period1.negated();
      assertFalse(period2.equals((Object)period1));
      assertNotSame(period2, period1);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.plusHours(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Days days0 = period0.toStandardDays();
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period1 = period0.withFields(mutablePeriod0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 43);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateMidnight dateMidnight0 = DateMidnight.now();
      GregorianCalendar gregorianCalendar0 = dateMidnight0.toGregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusHours(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusSeconds((-832));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.plusMillis(585);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.plusMinutes(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 48);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
