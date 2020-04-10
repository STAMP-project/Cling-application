/*

 * Tue Mar 03 17:37:28 GMT 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(134, 134, 134);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMillis(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2372L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      period0.withPeriodType((PeriodType) null);
      assertFalse(period0.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.years(2482);
      Period period1 = period0.negated();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2030));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 5);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      MonthDay monthDay0 = new MonthDay((Chronology) lenientChronology0);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period(2372L, 2372L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMonths(1677);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period(2372L, 2372L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2372L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
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
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusHours(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusDays(41);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusHours(1803);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMonths(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2370L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      MonthDay monthDay1 = new MonthDay(1, 1);
      Period period0 = Period.fieldDifference(monthDay1, monthDay0);
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      Period period2 = period0.minusYears(0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.ZERO.plus(period1);
      assertEquals("java.util.GregorianCalendar[time=1583256864648,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=34,SECOND=24,MILLISECOND=648,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      periodType0.withYearsRemoved();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      assertEquals("java.util.GregorianCalendar[time=1583256823935,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=33,SECOND=43,MILLISECOND=935,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.withYears(52);
      period1.normalizedStandard();
      assertEquals("java.util.GregorianCalendar[time=1583256776302,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=32,SECOND=56,MILLISECOND=302,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      LocalTime localTime0 = new LocalTime((Chronology) gregorianChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
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
  public void test24()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[6];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldTypeArray0[0];
      durationFieldTypeArray0[2] = durationFieldType0;
      durationFieldTypeArray0[3] = durationFieldType0;
      durationFieldTypeArray0[4] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [hours, hours, hours, hours, hours]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks(146);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      String string0 = period0.toString();
      assertEquals("P0M", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2372L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
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
  public void test28()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      period0.minusMinutes(100);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2370L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      LocalTime localTime0 = new LocalTime((Chronology) gregorianChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period.fieldDifference(yearMonth0, yearMonth0);
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
  public void test31()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.withYears(52);
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
  public void test32()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-1478));
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Minutes minutes0 = Minutes.TWO;
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      Period period1 = period0.ZERO.withFieldAdded(durationFieldType0, (-194));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2030));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 5);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      MonthDay monthDay0 = new MonthDay((Chronology) lenientChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.ZERO.plus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
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
  public void test35()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.plusHours(0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      period0.plusMonths(0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = new Period(2372L, 2372L, (PeriodType) null);
      YearMonth yearMonth0 = new YearMonth(2372L);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.withFields((ReadablePeriod) null);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.withFields(period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = new Period(2340L, 2340L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      Period period2 = period0.plusMinutes(0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusYears((-1000));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = new Period();
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.minusSeconds(0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusSeconds(3);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      period0.minusMinutes(100);
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Period period0 = new Period();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2030));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 5);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      MonthDay monthDay0 = new MonthDay((Chronology) lenientChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2370L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Period period0 = Period.minutes((-1478));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-1478));
      LocalDateTime localDateTime1 = localDateTime0.withPeriodAdded(period0, 115);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime1);
      // Undeclared exception!
      try { 
        period1.toStandardDuration();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Duration as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2372L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMonths(1677);
      Period period2 = period1.normalizedStandard();
      assertNotSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Period period0 = Period.years(2482);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2030));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 5);
      PeriodType periodType0 = PeriodType.years();
      period0.normalizedStandard(periodType0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      MonthDay monthDay0 = new MonthDay((Chronology) lenientChronology0);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-846));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Period period0 = Period.years(2482);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2030));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 5);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      MonthDay monthDay0 = new MonthDay((Chronology) lenientChronology0);
      Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.toStandardMinutes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Minutes as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusDays(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2370L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test62()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      Period period1 = period0.ZERO.plusWeeks(1239);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      assertEquals("java.util.GregorianCalendar[time=1583256615439,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=30,SECOND=15,MILLISECOND=439,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      Period period2 = period1.negated();
      assertNotSame(period1, period2);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Period period0 = new Period(2370L, 2370L, (PeriodType) null);
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period1.minus(period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis((-2468));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2370L);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Period period0 = new Period(2372L, 2372L, (PeriodType) null);
      YearMonth yearMonth0 = new YearMonth(2372L);
      Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }
}
