/*

 * Tue Mar 03 17:31:04 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
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
import org.joda.time.Years;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(60L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1483);
      Period.fieldDifference(localTime0, localTime0);
      PeriodType periodType0 = PeriodType.yearDay();
      PeriodType periodType1 = periodType0.withYearsRemoved();
      assertEquals("YearDayNoYears", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[3];
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldTypeArray0[0];
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
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      boolean boolean0 = period0.ZERO.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) julianChronology0);
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
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      LocalDate localDate0 = new LocalDate((Chronology) islamicChronology0);
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Period period1 = period0.plus(weeks0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.months(1);
      period0.normalizedStandard();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusHours(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusHours(1398);
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
      Period period0 = new Period(2042, 2042, 2042, 2042);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) julianChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMonths(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = new Period(30617280288L, 654L, periodType0);
      LocalTime localTime0 = new LocalTime(30617280288L, (DateTimeZone) null);
      Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Days days0 = Days.days(1067);
      Period period0 = days0.toPeriod();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1067, (Chronology) julianChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period(4, 4, 438, 4);
      Period period1 = period0.minusMinutes(0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period(2042, 2042, 2042, 2042);
      Period period1 = period0.minusSeconds(0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) julianChronology0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period((-1043L));
      Period period1 = period0.minusSeconds(1035);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-1043L), (Chronology) julianChronology0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusMinutes(2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks(59);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period(2042, 2042, 2042, 2042);
      Period period1 = period0.normalizedStandard();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) julianChronology0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  public void test24()  throws Throwable  {
      Period period0 = new Period(30672000000L);
      Period period1 = period0.plusMonths(25734375);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(3600L, (Chronology) julianChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
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
  public void test25()  throws Throwable  {
      Period period0 = new Period(30672000000L);
      Period period1 = period0.plusMonths(25734375);
      period1.normalizedStandard();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(3600L, (Chronology) julianChronology0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusYears((-42));
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.ZERO.withField((DurationFieldType) null, 1398);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 3);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = new Period(4, 4, 438, 4);
      Period period1 = period0.minusYears(Integer.MIN_VALUE);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
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
  public void test30()  throws Throwable  {
      Period period0 = new Period(30672000000L);
      period0.toStandardWeeks();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(3600L, (Chronology) julianChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withPeriodType((PeriodType) null);
      PeriodType periodType0 = PeriodType.standard();
      Period period2 = period1.withPeriodType(periodType0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = new Period((-1043L));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-1043L), (Chronology) julianChronology0);
      period0.ZERO.minusDays(0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period(30672000000L);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(3600L, (Chronology) julianChronology0);
      Period period1 = period0.minusDays(1483);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-2227L));
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
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      PeriodType periodType0 = PeriodType.yearMonthDay();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Period period0 = new Period(3080L, 2448L, periodType0, ethiopicChronology0);
      period0.multipliedBy(1);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.multipliedBy(5);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = new Period(2042, 2042, 2042, 2042);
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0);
      period0.minus(mutablePeriod0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) julianChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = new Period((-1043L));
      period0.minusMillis(0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-1043L), (Chronology) julianChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = new Period(30672000000L);
      Period period1 = period0.minusMillis(25734375);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(3600L, (Chronology) julianChronology0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-1043L), (Chronology) julianChronology0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.ZERO.withFieldAdded((DurationFieldType) null, (-4381));
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
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Years years0 = Years.yearsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      DurationFieldType durationFieldType0 = years0.getFieldType();
      Period period1 = period0.withFieldAdded(durationFieldType0, (-10));
      assertNotSame(period0, period1);
  }
}
