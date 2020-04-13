/*

 * Tue Mar 03 17:23:50 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.minutes(0);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, (-1092));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1437));
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, yearMonth0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(yearMonth0, yearMonth0, periodType0);
      // Undeclared exception!
      try { 
        period0.minusMonths((-2616));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.seconds(14);
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period(759L);
      MonthDay monthDay0 = new MonthDay();
      PeriodType periodType0 = PeriodType.days();
      Period period1 = new Period(monthDay0, monthDay0, periodType0);
      Period period2 = period0.minusMinutes(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null, (PeriodType) null);
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
      DateMidnight dateMidnight0 = new DateMidnight((-4148L), (DateTimeZone) null);
      Period period0 = new Period(dateMidnight0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.minutes(0);
      period0.negated();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      LocalDate localDate0 = LocalDate.now((Chronology) julianChronology0);
      LocalTime localTime0 = LocalTime.now();
      PeriodType periodType0 = PeriodType.minutes();
      Period period1 = null;
      try {
        period1 = new Period(localDate0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.months(10125000);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period(759L);
      Period period1 = period0.plusSeconds(0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MonthDay monthDay0 = new MonthDay((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.days();
      Period period2 = new Period(monthDay0, monthDay0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Period period0 = Period.minutes(2);
      PeriodType periodType0 = PeriodType.yearDayTime();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      MonthDay monthDay0 = MonthDay.fromCalendarFields(gregorianCalendar0);
      Period period1 = new Period(monthDay0, monthDay0, periodType0);
      assertEquals("java.util.GregorianCalendar[time=1583256163601,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=22,SECOND=43,MILLISECOND=601,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      Period period2 = period0.negated();
      assertNotSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.minutes(0);
      period0.minusYears(0);
      LocalDate localDate0 = new LocalDate((Object) null);
      LocalTime localTime0 = LocalTime.now();
      PeriodType periodType0 = PeriodType.time();
      Period period1 = null;
      try {
        period1 = new Period(localDate0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.minutes(0);
      LocalDate localDate0 = new LocalDate((Object) null);
      LocalTime localTime0 = LocalTime.now();
      period0.minusYears(5);
      PeriodType periodType0 = PeriodType.time();
      Period period1 = null;
      try {
        period1 = new Period(localDate0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period(759L);
      period0.minusHours(0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MonthDay monthDay0 = new MonthDay((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.days();
      Period period1 = new Period(monthDay0, monthDay0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period(759L);
      period0.minusHours((-1372));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MonthDay monthDay0 = new MonthDay((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.days();
      Period period1 = new Period(monthDay0, monthDay0, periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Days days0 = period0.toStandardDays();
      days0.toMutablePeriod();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.months(0);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withField(durationFieldType0, (-1477));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period(759L);
      Period period1 = period0.plusSeconds((-1372));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MonthDay monthDay0 = new MonthDay((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.days();
      Period period2 = new Period(monthDay0, monthDay0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = new Period(759L);
      Period period1 = period0.plusMillis(0);
      MonthDay monthDay0 = new MonthDay();
      PeriodType periodType0 = PeriodType.days();
      Period period2 = new Period(monthDay0, monthDay0, periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0, (PeriodType) null);
      Period period1 = period0.plusMillis((-2661));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.months(2684);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period1 = new Period(yearMonth0, yearMonth0, (PeriodType) null);
      Period period2 = period0.minus(period1);
      assertNotSame(period2, period0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.ZERO;
      PeriodType periodType0 = PeriodType.minutes();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      Period period0 = Period.minutes(2);
      Period period1 = period0.minusMinutes(2);
      PeriodType periodType0 = PeriodType.yearDayTime();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      MonthDay monthDay0 = MonthDay.fromCalendarFields(gregorianCalendar0);
      Period period2 = new Period(monthDay0, monthDay0, periodType0);
      assertEquals("java.util.GregorianCalendar[time=1583256086691,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=21,SECOND=26,MILLISECOND=691,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      Period period3 = period1.negated();
      assertTrue(period3.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.minutes((-1390));
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-1390));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
