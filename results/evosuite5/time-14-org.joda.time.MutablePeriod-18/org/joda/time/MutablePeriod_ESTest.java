/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:23:53 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 1L);
      Duration duration0 = Duration.standardHours((-1580L));
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals((-65L), duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Months months0 = Months.MAX_VALUE;
      PeriodType periodType0 = months0.getPeriodType();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(4556L, (-310L), periodType0, gregorianChronology0);
      mutablePeriod0.add((ReadableDuration) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(15778800000L, (PeriodType) null, (Chronology) null);
      Period period0 = new Period((long) 1826, (Chronology) null);
      DateMidnight dateMidnight0 = new DateMidnight((long) 0, (Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval(period0, dateMidnight0);
      mutablePeriod0.add((ReadableInterval) mutableInterval0);
      assertEquals((-3600000L), mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(15778800000L, (PeriodType) null, (Chronology) null);
      mutablePeriod0.add((ReadableInterval) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Months months0 = Months.MAX_VALUE;
      PeriodType periodType0 = months0.getPeriodType();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(4556L, (-310L), periodType0, gregorianChronology0);
      mutablePeriod0.setPeriod((ReadableInterval) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1082, 17, 10209375, 17);
      Interval interval0 = new Interval(mutablePeriod0, (ReadableInstant) null);
      mutablePeriod0.setPeriod((ReadableInterval) interval0);
      assertEquals(1392409281320L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      mutablePeriod0.addHours(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-4131), 745, 1613, (-4131));
      MutablePeriod mutablePeriod1 = mutablePeriod0.toMutablePeriod();
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(0L);
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, periodType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = new Period();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod("Clone error", gregorianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Clone error\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      mutablePeriod0.setDays(0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(48, (-258), 48, (-258), 48, 913, 0, 1, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.FIVE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      mutablePeriod0.add(4030L, (Chronology) gJChronology0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-1));
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 1L);
      mutablePeriod0.setHours((-1706));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(15778800000L, (PeriodType) null, (Chronology) null);
      mutablePeriod0.setMonths(0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1082, 17, 10209375, 17);
      mutablePeriod0.add((-1L));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addSeconds((-1285));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      mutablePeriod0.setValue(0, 0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.addMillis((-2848));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Months months0 = Months.MAX_VALUE;
      PeriodType periodType0 = months0.getPeriodType();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(4556L, (-310L), periodType0, gregorianChronology0);
      mutablePeriod0.setYears(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.setSeconds(720);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2471L);
      mutablePeriod0.addYears(0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 2163, 4661, (-2185), 1, 0, 0, (-1450));
      mutablePeriod0.setPeriod((-1910L), (-1910L));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 2665, (Chronology) iSOChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      mutablePeriod0.setPeriod((ReadableInstant) null, (ReadableInstant) dateTime0);
      assertEquals(2665L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(825L, (Chronology) islamicChronology0);
      Period period0 = new Period((-588L));
      mutablePeriod0.mergePeriod(period0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1082, 17, 10209375, 17);
      mutablePeriod0.addWeeks(10209375);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(45, 45);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutablePeriod.parse("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.chrono.BasicMonthO...\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Days days0 = Days.MAX_VALUE;
      Duration duration0 = days0.toStandardDuration();
      // Undeclared exception!
      try { 
        mutablePeriod0.setPeriod((ReadableDuration) duration0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 51539607528
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      Minutes minutes0 = Minutes.standardMinutesIn(mutablePeriod0);
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      Duration duration0 = mutablePeriod0.toDurationFrom((ReadableInstant) null);
      MutablePeriod mutablePeriod1 = new MutablePeriod(duration0, (ReadableInstant) null, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(calendar0);
      Interval interval0 = yearMonth0.toInterval();
      Duration duration0 = interval0.toDuration();
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateMidnight dateMidnight0 = DateMidnight.parse("", dateTimeFormatter0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.add(95, 95, 0, (-596), 29, 0, (-389), (-389));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      mutablePeriod0.set(durationFieldType0, 701);
      assertEquals("hours", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1L), 1L);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod1 = null;
      try {
        mutablePeriod1 = new MutablePeriod(mutablePeriod0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      mutablePeriod0.setPeriod((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[0];
      int[] intArray0 = new int[4];
      PeriodType periodType0 = new PeriodType((String) null, durationFieldTypeArray0, intArray0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(3577, 636, periodType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.addMinutes(39);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(1501).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      mutablePeriod0.addDays((-799));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(15778800000L, (PeriodType) null, (Chronology) null);
      mutablePeriod0.addMonths((-693));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-1L));
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMinutes(27);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.setWeeks(400);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), 0, 17, 2665);
      Minutes minutes0 = Minutes.standardMinutesIn(mutablePeriod0);
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      mutablePeriod0.add(durationFieldType0, 1);
      assertEquals("minutes", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(787L);
      mutablePeriod0.setMillis((-1354));
  }
}
