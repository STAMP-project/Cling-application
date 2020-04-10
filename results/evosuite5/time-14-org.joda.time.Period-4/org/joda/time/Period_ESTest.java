/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:49:55 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.years((-4005));
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.months(6);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.years((-3403));
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
  public void test03()  throws Throwable  {
      Period period0 = Period.years(5);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.multipliedBy(925);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.plusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.ZERO.plusMinutes(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.months(0);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.plusMonths(6);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.minutes((-610));
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      Period period1 = period0.withFieldAdded(durationFieldType0, 544);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.seconds(84);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.days(0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 88);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      Period period1 = period0.withField(durationFieldType0, (-81));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.years((-4005));
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.withPeriodType((PeriodType) null);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1230));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
      int[] intArray0 = new int[8];
      Partial partial0 = new Partial(gJChronology0, dateTimeFieldTypeArray0, intArray0);
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
  public void test24()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
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
  public void test25()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      YearMonth yearMonth0 = YearMonth.now();
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
  public void test26()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
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
  public void test28()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minusSeconds(3);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.minusWeeks((-387));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = Period.years(0);
      Seconds seconds0 = period0.ZERO.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.minusDays((-754));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period(390L);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = new Period(1, 1, 0, 1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = LocalTime.parse("", dateTimeFormatter0);
      DateTime dateTime0 = localTime0.toDateTimeToday();
      Minutes minutes0 = Minutes.ONE;
      Duration duration0 = minutes0.toStandardDuration();
      Weeks weeks0 = Weeks.MAX_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period0 = new Period(dateTime0, duration0, periodType0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Period period0 = new Period(30617280288L, 30617280288L, periodType0, ethiopicChronology0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.ZERO;
      Duration duration0 = period0.ZERO.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      Period period0 = new Period(44L, 44L, periodType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Weeks weeks0 = Weeks.ZERO;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period0 = new Period((ReadableDuration) null, dateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Period period0 = new Period((-2751L), (Chronology) buddhistChronology0);
      Months months0 = Months.MAX_VALUE;
      Period period1 = period0.plus(months0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Minutes minutes0 = period0.ZERO.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = null;
      try {
        period0 = new Period("RP]eEC(o", periodType0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"RP]eEC(o\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = DateMidnight.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = dateMidnight0.toDateTime();
      Duration duration0 = Duration.standardHours(10000000L);
      Period period0 = new Period(dateTime0, duration0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) ethiopicChronology0);
      PeriodType periodType0 = PeriodType.years();
      Period period0 = new Period(localDate0, localDate0, periodType0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.minutes(3083);
      Days days0 = period0.toStandardDays();
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.toPeriod();
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = new Period(390L, 390L);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = Period.hours(0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 91);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Hours hours0 = period0.ZERO.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Duration duration0 = new Duration(3699L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(3699L, dateTimeZone0);
      Period period0 = new Period(duration0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusHours(1742);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      Period period1 = period0.minusMinutes(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Period period0 = Period.millis(1);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.toPeriod();
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Period period0 = Period.weeks(0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Period period0 = new Period(168L, 63158400000L, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.ZERO.withMillis(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Period period0 = Period.minutes((-610));
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Period period0 = duration0.toPeriod((PeriodType) null);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Period period0 = new Period(1023, 47, 2, 2, 1023, 2, Integer.MAX_VALUE, 1023, (PeriodType) null);
      // Undeclared exception!
      try { 
        period0.toStandardWeeks();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Weeks as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Period period0 = Period.days(1);
      Period period1 = period0.minusYears(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Period period0 = null;
      try {
        period0 = new Period("\"F-n8!S DY%1PD(", ethiopicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"F-n8!S DY%1PD(\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period0 = new Period(localTime0, localTime0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
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
  public void test67()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.negated();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.withPeriodType((PeriodType) null);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Period period0 = Period.days(1);
      Period period1 = period0.ZERO.withSeconds(1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.withWeeks(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.withHours(1901);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMillis((-610));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withMinutes((-610));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Period period0 = Period.seconds(57);
      Period period1 = period0.withDays(57);
      assertNotSame(period0, period1);
  }
}
