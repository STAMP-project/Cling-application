/*

 * Tue Mar 03 17:21:58 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(441);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, monthDay0);
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
      Period period0 = new Period();
      Period period1 = period0.minusMonths(2);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
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
  public void test10()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      Period period0 = new Period(dateMidnight0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.years((-762));
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.negated();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.minusHours(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.plusHours(1563);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Minutes minutes0 = duration0.toStandardMinutes();
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withField(durationFieldType0, (-2285));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) copticChronology0);
      Date date0 = new Date(798);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, localDate0);
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
      Period period0 = new Period();
      Period period1 = period0.minusSeconds(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMillis(2);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((DateTimeZone) null);
      Period period0 = new Period(monthDay0, monthDay0);
      Years years0 = Years.THREE;
      Period period1 = period0.minus(years0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Period period0 = new Period(monthDay0, monthDay0);
      Period period1 = period0.minusSeconds(1);
      Period period2 = period1.negated();
      assertFalse(period2.equals((Object)period1));
      assertNotSame(period2, period1);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.hours();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.plusMinutes((-1254));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MonthDay monthDay0 = MonthDay.now((DateTimeZone) fixedDateTimeZone0);
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 4641);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
