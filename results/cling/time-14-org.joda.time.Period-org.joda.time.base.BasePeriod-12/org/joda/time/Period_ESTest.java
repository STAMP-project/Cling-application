/*

 * Tue Mar 03 17:21:50 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(27);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.seconds(1900);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 1900);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MonthDay monthDay0 = new MonthDay(324L);
      LocalDate localDate0 = monthDay0.toLocalDate(279);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, monthDay0, periodType0);
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
      Days days0 = Days.SEVEN;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Period period0 = days0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.weeks(4);
      MonthDay monthDay0 = new MonthDay((long) 4);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
      
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.weeks(4);
      MonthDay monthDay0 = new MonthDay((long) 4);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.plusMinutes(1);
      assertNotSame(period2, period0);
      assertFalse(period2.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
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
      DateTime dateTime0 = new DateTime();
      Period period0 = new Period(dateTime0, dateTime0);
      assertEquals(1583256094144L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMonths(1476);
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period1));
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.ZERO;
      PeriodType periodType0 = PeriodType.time();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.weeks(4);
      MonthDay monthDay0 = new MonthDay((long) 4);
      Period period1 = period0.multipliedBy(4);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
      
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.weeks(4);
      MonthDay monthDay0 = new MonthDay((long) 4);
      Period period1 = period0.minusHours(4);
      assertNotSame(period1, period0);
      
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 736);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Minutes minutes0 = Minutes.TWO;
      PeriodType periodType0 = minutes0.getPeriodType();
      Period period0 = null;
      try {
        period0 = new Period(localDate0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Period period1 = period0.minusSeconds(1409);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      MonthDay monthDay0 = new MonthDay((-1057L), (Chronology) buddhistChronology0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) iSOChronology0);
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      // Undeclared exception!
      try { 
        period0.minusMillis(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = Period.ZERO;
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) iSOChronology0);
      Period period1 = new Period(monthDay0, monthDay0, periodType0);
      Period period2 = period0.minus(period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) 4);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.multipliedBy(4);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.ZERO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
