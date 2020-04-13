/*

 * Tue Mar 03 17:33:53 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.minusMillis(0);
      assertEquals("java.util.GregorianCalendar[time=1583256775001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=32,SECOND=55,MILLISECOND=1,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minus((ReadablePeriod) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-1622L), (DateTimeZone) null);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth((long) 0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      YearMonth yearMonth0 = new YearMonth((long) 0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.ZERO;
      period0.minusHours((-1));
      LocalDateTime localDateTime0 = new LocalDateTime((-1622L), (DateTimeZone) null);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.years(0);
      period0.plusSeconds(719527);
      YearMonth yearMonth0 = new YearMonth((long) 0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.plusYears(5);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      LocalDateTime localDateTime0 = new LocalDateTime((-479L), (DateTimeZone) null);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 1);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Hours hours0 = period0.toStandardHours();
      Period period1 = period0.plus(hours0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      PeriodType periodType0 = PeriodType.days();
      PeriodType periodType1 = periodType0.withDaysRemoved();
      assertEquals(0, periodType1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period0 = Period.years(1);
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[3];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [hours, hours]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth((long) 0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-704));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.millis(1);
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      period0.withFieldAdded(durationFieldType0, (-3610));
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Days days0 = Days.standardDaysIn(period0);
      Period period1 = period0.plus(days0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.ZERO.minusMinutes(0);
      assertEquals("java.util.GregorianCalendar[time=1583256709273,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=31,SECOND=49,MILLISECOND=273,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        PeriodType.forFields((DurationFieldType[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusHours(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusMonths(0);
      LocalDateTime localDateTime0 = new LocalDateTime((-479L), (DateTimeZone) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      Period period0 = Period.hours((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Seconds seconds0 = period0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      days0.toPeriod();
      assertEquals((-28), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(292272992);
      Period period0 = Period.hours(292272992);
      Period period1 = period0.plusMinutes(292272992);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, dateTimeZone0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      Period period0 = Period.hours((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.plusYears(0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusYears(5);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusSeconds(0);
      LocalDateTime localDateTime0 = new LocalDateTime((-479L), (DateTimeZone) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.plusSeconds(719527);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth((long) 0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Months months0 = Months.NINE;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      Period period2 = period0.withFieldAdded(durationFieldType0, 0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusWeeks(0);
      LocalDateTime localDateTime0 = new LocalDateTime((-479L), (DateTimeZone) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks((-1250));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Weeks weeks0 = Weeks.weeks(0);
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period1 = period0.normalizedStandard(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      Period period0 = Period.hours((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withMonths((-683));
      // Undeclared exception!
      try { 
        period1.toStandardSeconds();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Seconds as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.millis(1);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMonths(1);
      PeriodType periodType0 = PeriodType.years();
      // Undeclared exception!
      try { 
        period1.normalizedStandard(periodType0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      Period period0 = Period.years(1);
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(292272992);
      Period period0 = Period.hours(292272992);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      Period period0 = Period.hours((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 1);
      // Undeclared exception!
      try { 
        period1.toStandardDays();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Days as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      Period period0 = Period.hours((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      period0.withPeriodType((PeriodType) null);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      PeriodType periodType0 = PeriodType.days();
      period0.ZERO.withPeriodType(periodType0);
      LocalDateTime localDateTime0 = new LocalDateTime((-479L), (DateTimeZone) null);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      period0.plusDays(0);
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[4];
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      durationFieldTypeArray0[0] = durationFieldType0;
      Years years0 = Years.THREE;
      DurationFieldType durationFieldType1 = years0.getFieldType();
      durationFieldTypeArray0[1] = durationFieldType1;
      durationFieldTypeArray0[2] = durationFieldType1;
      durationFieldTypeArray0[3] = durationFieldTypeArray0[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [years, hours]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusDays(1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.negated();
      assertTrue(period1.equals((Object)period0));
      
      YearMonth yearMonth0 = new YearMonth((long) 0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.hours((-683));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.negated();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minus(period0);
      LocalDateTime localDateTime0 = new LocalDateTime((-479L), (DateTimeZone) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusMillis(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-683));
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.millis(1);
      Period period1 = period0.plusMillis((-683));
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }
}
