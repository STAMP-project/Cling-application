/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 14:49:55 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period();
      period0.ZERO.minusSeconds(832);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusYears(1195);
      Period period2 = period1.normalizedStandard();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period period3 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period3.equals((Object)period2));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      Period period2 = period0.withFieldAdded(durationFieldType0, 0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period();
      period0.normalizedStandard();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period();
      period0.minus((ReadablePeriod) null);
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [minutes]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      MonthDay monthDay0 = new MonthDay((DateTimeZone) null);
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = period0.minusYears(0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 2014);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks(1);
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
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.withPeriodType(periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis(1);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(3L, dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusYears(2246);
      // Undeclared exception!
      try { 
        period1.toStandardDuration();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Duration as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 4, 4, 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 718);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 122);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.negated();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusDays(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      period0.plusDays((-1523));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      PeriodType periodType0 = PeriodType.millis();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      Period period0 = duration0.toPeriod(periodType0, (Chronology) islamicChronology0);
      Weeks weeks0 = period0.toStandardWeeks();
      Period period1 = period0.minus(weeks0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.plusHours(0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusHours((-899));
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
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      Period period1 = period0.withFieldAdded(durationFieldType0, 2019);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths((-585));
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
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(3L, dateTimeZone0);
      Period.fieldDifference(localDateTime0, localDateTime0);
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
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusMinutes(2105);
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
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Weeks weeks0 = Weeks.MIN_VALUE;
      Duration duration0 = weeks0.toStandardDuration();
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = duration0.toPeriodFrom((ReadableInstant) null, periodType0);
      period0.withFields(period0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusHours((-2805));
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime1);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-480));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = LocalTime.now((Chronology) islamicChronology0);
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
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(3L, dateTimeZone0);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(3L, dateTimeZone0);
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
  public void test41()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      DurationFieldType durationFieldType1 = DurationFieldType.hours();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType1;
      durationFieldTypeArray0[1] = durationFieldType0;
      PeriodType.forFields(durationFieldTypeArray0);
      DurationFieldType[] durationFieldTypeArray1 = new DurationFieldType[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      LocalDate localDate0 = new LocalDate();
      periodType0.withMonthsRemoved();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      assertNotNull(period0);
  }
}
