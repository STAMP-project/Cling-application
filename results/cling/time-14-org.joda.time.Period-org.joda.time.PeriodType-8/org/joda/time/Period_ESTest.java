/*

 * Tue Mar 03 17:33:32 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) iSOChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.minusSeconds(0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period((long) 1);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.plus(period1);
      assertNotSame(period1, period2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodType periodType0 = PeriodType.months();
      PeriodType periodType1 = periodType0.withMonthsRemoved();
      assertEquals("MonthsNoMonths", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1331L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime((long) 331, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
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
  public void test05()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[5];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.HOURS_TYPE;
      durationFieldTypeArray0[2] = durationFieldType1;
      durationFieldTypeArray0[3] = durationFieldType0;
      durationFieldTypeArray0[4] = durationFieldTypeArray0[1];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [months, months, months]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Date date0 = localDateTime0.toDate();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localDate0);
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
      Period period0 = new Period(1331L, (Chronology) null);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1331L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime((long) 331, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      Period period1 = period0.withFieldAdded(durationFieldType0, 37);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = new Period(0L, periodType0, (Chronology) gJChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 779, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Days days0 = period0.toStandardDays();
      Period period1 = period0.plus(days0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.plusMinutes(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.months(7);
      period0.normalizedStandard();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(59);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 7, dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (DateTimeZone) null);
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
  public void test14()  throws Throwable  {
      Period period0 = new Period(1331L, 1331L);
      period0.minusHours(0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1331L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0, dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1331L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime((long) 331, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.minusHours((-1135));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period(1331L, (Chronology) null);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime((long) 331, dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.minusMonths(0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths(1237);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 874, (DateTimeZone) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      Period period1 = period0.withFields(period0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, (DateTimeZone) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, (DateTimeZone) null);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(576);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.ZERO.minus(period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period(1331L, (Chronology) null);
      period0.minusYears(0);
      LocalDateTime localDateTime0 = new LocalDateTime((-362L));
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.minusMinutes((-4251));
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
      Period period0 = new Period(1331L, 1331L, (Chronology) null);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.plusWeeks(0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1331L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime((long) 331, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks(331);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      Period period1 = period0.normalizedStandard();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
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
  public void test29()  throws Throwable  {
      Period period0 = Period.months(874);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.toStandardMinutes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Minutes as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.months(779);
      Period period1 = period0.normalizedStandard();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 779, dateTimeZone0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(10800000L).when(readableDuration0).getMillis();
      Period period0 = new Period(readableDuration0, (ReadableInstant) null);
      Period period1 = period0.plusYears(9994);
      Period period2 = period1.minusSeconds(9994);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 9994, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period3 = period2.normalizedStandard();
      assertFalse(period3.equals((Object)period2));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, (-2584));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(10800000L).when(readableDuration0).getMillis();
      Period period0 = new Period(readableDuration0, (ReadableInstant) null);
      period0.toStandardHours();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 9994, dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withPeriodType(periodType0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      Period period1 = period0.withPeriodType((PeriodType) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period1.minusYears(326565);
      // Undeclared exception!
      try { 
        period2.toStandardDays();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Days as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = new Period(1331L, 1331L, (Chronology) null);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusDays((-2357));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
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
  public void test40()  throws Throwable  {
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(10800000L).when(readableDuration0).getMillis();
      Period period0 = new Period(readableDuration0, (ReadableInstant) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 9994, dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.negated();
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      period0.plusMillis(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(874);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, dateTimeZone0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1135, (DateTimeZone) null);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis((-1583));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.ZERO.withFieldAdded((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((long) 1135, periodType0, (Chronology) gJChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      period0.ZERO.withFieldAdded(durationFieldType0, 0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }
}
