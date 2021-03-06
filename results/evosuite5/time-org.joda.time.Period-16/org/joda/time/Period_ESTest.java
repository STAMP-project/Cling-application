/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:38:34 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.years(1556);
      // Undeclared exception!
      try { 
        period0.toStandardWeeks();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Weeks as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period((-290), (-290), (-290), (-290), (-290), (-290), (-290), (-290));
      // Undeclared exception!
      try { 
        period0.toStandardSeconds();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Seconds as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.days(1);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMillis(681);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plusSeconds(758);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.hours(0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.days(7);
      Period period1 = period0.plusWeeks(7);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3157);
      LocalDate localDate0 = new LocalDate((Object) null, dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime(dateTimeZone0);
      Duration duration0 = Duration.standardHours((-2720L));
      Period period0 = new Period(dateTime0, duration0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.ZERO;
      Hours hours0 = Hours.ONE;
      Period period1 = period0.plus(hours0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.days(7);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.days(97);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      Period period1 = period0.withFieldAdded(durationFieldType0, (-4005));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, (-752));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.seconds((-318));
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      Period period1 = period0.ZERO.withField(durationFieldType0, (-318));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3157);
      LocalDate localDate0 = new LocalDate((Object) null, dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime(dateTimeZone0);
      Duration duration0 = Duration.standardHours((-2720L));
      Period period0 = new Period(dateTime0, duration0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      Period period0 = new Period((Object) null, periodType0);
      Period period1 = period0.withPeriodType(periodType0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
      int[] intArray0 = new int[9];
      Partial partial0 = new Partial(islamicChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not have overlapping fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test24()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      YearMonth yearMonth0 = new YearMonth();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
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
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, (ReadablePartial) null);
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) copticChronology0);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = new Period(dateMidnight0, dateMidnight0, periodType0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.ZERO.minusYears(1);
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.minusWeeks(0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 7);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      try { 
        period0.minusDays(7);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1586L);
      DateTime dateTime0 = new DateTime();
      PeriodType periodType0 = PeriodType.years();
      Period period0 = duration0.toPeriodFrom((ReadableInstant) dateTime0, periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period(445L, 3796L, periodType0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period((-5600), (-870), periodType0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.months((-2));
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-987L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(duration0, dateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Period period0 = new Period((-1166L), (Chronology) iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.ZERO;
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period((Object) null, (PeriodType) null, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      PeriodType periodType0 = PeriodType.weeks();
      Period period0 = new Period(localTime0, localTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2747L);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = new Period((-1441L), (-1441L));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(24L);
      Period period0 = new Period(mutableDateTime0, mutableDateTime0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = new Period(7, 7, 7, 7, 7, 7, 7, 7);
      Period period1 = period0.minusMinutes(43);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Hours hours0 = period0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = Period.seconds(17887500);
      DateMidnight dateMidnight0 = new DateMidnight();
      Instant instant0 = dateMidnight0.toInstant();
      Duration duration0 = period0.toDurationTo(instant0);
      duration0.toPeriodTo((ReadableInstant) dateMidnight0);
      assertEquals(17887500000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = Period.seconds(584);
      Period period1 = period0.minusHours(584);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = new Period(0, 1, 0, 0, 0, 0, 0, 0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Period period0 = Period.minutes(0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.toPeriod();
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Period period0 = Period.weeks(0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = new Period(1, 0L, buddhistChronology0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.withMillis(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.ZERO.minusMonths(15271875);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period((-1442L), periodType0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Days days0 = period0.toStandardDays();
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Period period0 = Period.millis(0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Period period0 = new Period(1300, (-1386), (-1386), (-1386), 1300, (-497), (-1386), 1, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Partial partial0 = new Partial();
      Period period0 = new Period(partial0, partial0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        Period.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test64()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Period period0 = new Period((Object) null, buddhistChronology0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      PeriodType periodType0 = PeriodType.months();
      Period period1 = period0.ZERO.withPeriodType(periodType0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Period period0 = Period.days(7);
      Period period1 = period0.withSeconds(7);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test67()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withWeeks(26);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.withHours((-2009));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.minusMillis(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.withMinutes((-1963));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Period period0 = new Period((long) 9);
      Period period1 = period0.withDays(9);
      assertFalse(period1.equals((Object)period0));
  }
}
