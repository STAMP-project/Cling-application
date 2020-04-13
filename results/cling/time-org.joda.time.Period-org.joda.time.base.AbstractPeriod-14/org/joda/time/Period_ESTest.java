/*

 * Tue Mar 03 17:22:27 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.temporal.ChronoField;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.minutes(0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      period0.toString(periodFormatter0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDate localDate0 = new LocalDate((long) 17887500, dateTimeZone0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period();
      period0.toString((PeriodFormatter) null);
      LocalDate localDate0 = LocalDate.now();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
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
  public void test03()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.toString((PeriodFormatter) null);
      assertEquals("java.util.GregorianCalendar[time=1583256083848,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=21,SECOND=23,MILLISECOND=848,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period((-1528L));
      Period period1 = period0.minusDays(8);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-8), 7);
      Period period0 = Period.years(7);
      period0.normalizedStandard(periodType0);
      LocalDate localDate0 = new LocalDate((long) 7, dateTimeZone0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
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
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusYears(1);
      period1.normalizedStandard(periodType0);
      assertEquals("java.util.GregorianCalendar[time=1583256022793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=20,SECOND=22,MILLISECOND=793,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.minutes(351);
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.ZERO;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      period0.plusSeconds(17);
      LocalTime localTime0 = LocalTime.now((Chronology) gregorianChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.ZERO;
      LocalDate localDate0 = new LocalDate();
      Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minusSeconds((-1233));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.weeks((-1188));
      Hours hours0 = Hours.SIX;
      Period period1 = period0.plus(hours0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(5, 7);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 7, 7, 3, 2, 5, 3, 0, periodType0);
      Period period0 = mutablePeriod0.toPeriod();
      period0.normalizedStandard();
      LocalDate localDate0 = new LocalDate((long) 7, dateTimeZone0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks((-8));
      Period period0 = Period.fieldDifference(localDateTime1, localDateTime0);
      Period period1 = period0.normalizedStandard();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period((-1528L));
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(5, 7);
      Period period0 = new Period();
      LocalDate localDate0 = new LocalDate((long) 7, dateTimeZone0);
      period0.toStandardMinutes();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-8), 7);
      Period period0 = new Period();
      LocalDate localDate0 = new LocalDate((long) 7, dateTimeZone0);
      ChronoField chronoField0 = ChronoField.SECOND_OF_MINUTE;
      period0.ZERO.equals(chronoField0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.negated();
      LocalDate localDate0 = LocalDate.now();
      period0.equals(period1);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      boolean boolean0 = period0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.weeks((-1041));
      Period period1 = period0.minusWeeks((-1041));
      period1.equals(period0);
      Period period2 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-8), 7);
      Period period0 = new Period();
      LocalDate localDate0 = new LocalDate((long) 7, dateTimeZone0);
      period0.plusMillis((-8));
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusMillis(80);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.minutes(0);
      period0.plusMinutes(0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.ZERO;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) gregorianChronology0);
      period0.plusMinutes(3);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-8), 7);
      Period period0 = new Period();
      period0.normalizedStandard(periodType0);
      LocalDate localDate0 = new LocalDate((long) 7, dateTimeZone0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.normalizedStandard();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusHours(24);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.days(0);
      LocalDate localDate0 = LocalDate.now();
      period0.minus(period0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.days(0);
      LocalDate localDate0 = LocalDate.now();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      period0.minus(period1);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMinutes(0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.days((-12));
      Period period1 = period0.minusMinutes((-12));
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertSame(period2, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMinutes(5);
      Days days0 = Days.ZERO;
      PeriodType periodType0 = days0.getPeriodType();
      Period period2 = period0.withPeriodType(periodType0);
      assertNotSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.millis((-1188));
      LocalDate localDate0 = new LocalDate();
      period0.multipliedBy(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.negated();
      LocalDate localDate0 = LocalDate.now();
      Period period2 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.millis((-1188));
      Period period1 = period0.plusMonths((-1188));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.months(0);
      Period period1 = period0.minusMinutes(0);
      Period period2 = period0.withFields(period0);
      assertSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Days days0 = Days.SIX;
      Period period0 = days0.toPeriod();
      Period period1 = period0.minusMinutes((-1796));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.ZERO.getFieldTypes();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minusMinutes(0);
      PeriodType periodType0 = PeriodType.months();
      Period period2 = period1.withPeriodType(periodType0);
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plusMinutes(3);
      assertNotSame(period1, period0);
  }
}
