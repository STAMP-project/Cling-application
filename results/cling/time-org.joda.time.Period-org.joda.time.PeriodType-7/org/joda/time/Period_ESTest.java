/*

 * Tue Mar 03 17:33:06 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Years years0 = Years.yearsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      DurationFieldType durationFieldType0 = years0.getFieldType();
      Period period0 = Period.seconds(1);
      period0.withField(durationFieldType0, 0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth();
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Hours hours0 = period0.toStandardHours();
      Period period2 = period1.minus(hours0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period(1451L, 1451L);
      Period period1 = period0.negated();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period.fieldDifference(yearMonth0, yearMonth0);
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
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      YearMonth yearMonth0 = new YearMonth();
      Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth();
      Period.fieldDifference(yearMonth0, yearMonth0);
      Hours hours0 = period0.toStandardHours();
      PeriodType periodType0 = hours0.getPeriodType();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.seconds(1);
      Period period1 = Period.fieldDifference(monthDay0, monthDay0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.seconds(1);
      Period period1 = period0.minusDays(0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.plusDays(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Days days0 = period0.toStandardDays();
      DurationFieldType durationFieldType0 = days0.getFieldType();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.plusHours(0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusHours(2);
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
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMonths(1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.seconds(1);
      period0.plusSeconds(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.minusYears(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.seconds(1);
      Period period1 = period0.withMonths(1);
      period1.normalizedStandard();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period.fieldDifference(yearMonth0, yearMonth0);
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plus(period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      Hours hours0 = Hours.FIVE;
      PeriodType periodType0 = hours0.getPeriodType();
      PeriodType periodType1 = periodType0.withHoursRemoved();
      assertEquals("HoursNoHours", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
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
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[5];
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.hours();
      durationFieldTypeArray0[2] = durationFieldType1;
      durationFieldTypeArray0[3] = durationFieldType1;
      durationFieldTypeArray0[4] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [eras, eras, hours, eras]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.minusWeeks(8);
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
      Period period0 = new Period(1451L, 1451L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      boolean boolean0 = period0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, monthDay0);
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
      MonthDay monthDay0 = new MonthDay();
      Period.fieldDifference(monthDay0, monthDay0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(292272992);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period1.toStandardHours();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Hours as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.plusMinutes(0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.weeks(1263);
      Period period1 = period0.plusMinutes(2222);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
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
  public void test36()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusHours(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.ZERO.plusHours(759);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
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
  public void test39()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusMonths(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(2729L, (Chronology) gregorianChronology0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withFields(hours0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusYears(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.seconds(1);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusSeconds(1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
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
  public void test46()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period0 = Period.months(1);
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
  public void test47()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 945);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Years years0 = Years.yearsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      DurationFieldType durationFieldType0 = years0.getFieldType();
      Period period0 = Period.seconds(1);
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.plusWeeks(0);
      assertSame(period2, period0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusWeeks(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
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
  public void test52()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusMonths(86399999);
      // Undeclared exception!
      try { 
        period1.toStandardMinutes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Minutes as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.seconds(1);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.withMonths(1);
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(2729L, (Chronology) gregorianChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = Period.years(120);
      Period period1 = period0.normalizedStandard(periodType0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Period period0 = new Period(1451L, 1451L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 7);
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
      MonthDay monthDay0 = new MonthDay();
      Years years0 = Years.yearsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      DurationFieldType durationFieldType0 = years0.getFieldType();
      Period period0 = Period.seconds(1);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.withField(durationFieldType0, 392);
      // Undeclared exception!
      try { 
        period1.toStandardMinutes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Minutes as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Hours hours0 = period0.toStandardHours();
      PeriodType periodType0 = hours0.getPeriodType();
      Period period1 = new Period(366, 1633L, periodType0);
      Period period2 = period1.withPeriodType(periodType0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusDays(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusDays((-836));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.negated();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
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
  public void test62()  throws Throwable  {
      Period period0 = Period.seconds(1);
      Period period1 = period0.multipliedBy(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth();
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      Period period2 = period1.multipliedBy(1);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Period period0 = new Period(1451L, 1451L);
      Period period1 = period0.plusMillis(449);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 543);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Years years0 = Years.yearsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      DurationFieldType durationFieldType0 = years0.getFieldType();
      Period period0 = Period.seconds(1);
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }
}
