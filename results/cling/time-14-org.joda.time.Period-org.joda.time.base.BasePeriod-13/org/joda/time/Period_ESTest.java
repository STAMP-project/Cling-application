/*

 * Tue Mar 03 17:22:13 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Duration duration0 = Duration.ZERO;
      Period period0 = new Period(duration0, mutableDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      period0.withField(durationFieldType0, 0);
      assertEquals(1583256113518L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears((-808));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 8);
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
      LocalTime localTime0 = LocalTime.now();
      PeriodType periodType0 = PeriodType.years();
      Period period0 = new Period(localTime0, localTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      YearMonth yearMonth0 = new YearMonth((-1242L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3860);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalDate localDate0 = new LocalDate((Chronology) islamicChronology0);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, yearMonth0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.days(3860);
      Period period1 = period0.minusMonths((-1285));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      MutablePeriod mutablePeriod0 = seconds0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = period0.toStandardWeeks();
      Period period1 = period0.withFields(weeks0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.days(3860);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = period0.plusMinutes(3860);
      YearMonth yearMonth0 = new YearMonth(921L);
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Period period0 = new Period(mutableDateTime0, mutableDateTime0);
      assertEquals(1583256110891L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period(3840, 3840, 3840, 3840, 3840, 3840, 3840, 3840);
      Period period1 = period0.normalizedStandard();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.days(3860);
      PeriodType periodType0 = PeriodType.yearDayTime();
      YearMonth yearMonth0 = new YearMonth(921L);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.plusSeconds(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      YearMonth yearMonth0 = new YearMonth((long) 3860);
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.weeks();
      YearMonth yearMonth0 = new YearMonth(0L);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period2 = period0.multipliedBy((-1089));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.days(3860);
      PeriodType periodType0 = PeriodType.yearDayTime();
      YearMonth yearMonth0 = new YearMonth(921L);
      Period period1 = period0.plusHours(0);
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      Period period1 = period0.withField(durationFieldType0, (-2693));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      YearMonth yearMonth0 = new YearMonth((long) 3840);
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      Period period1 = period0.ZERO.minusHours(5);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = new Period();
      period0.minusSeconds(435);
      PeriodType periodType0 = PeriodType.weeks();
      YearMonth yearMonth0 = new YearMonth(0L);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.plusMillis(0);
      YearMonth yearMonth0 = new YearMonth(237L);
      PeriodType periodType0 = PeriodType.months();
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.days(3860);
      PeriodType periodType0 = PeriodType.yearDayTime();
      YearMonth yearMonth0 = new YearMonth(921L);
      period0.plusMillis(3860);
      Period period1 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minus((ReadablePeriod) null);
      YearMonth yearMonth0 = new YearMonth(60L);
      Period period2 = new Period(yearMonth0, yearMonth0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minus(period0);
      YearMonth yearMonth0 = new YearMonth(237L);
      PeriodType periodType0 = PeriodType.months();
      Period period2 = new Period(yearMonth0, yearMonth0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.days(3860);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.months(1000);
      DurationFieldType durationFieldType0 = mock(DurationFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(durationFieldType0).toString();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 2858);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
