/*

 * Tue Mar 03 17:35:39 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Months months0 = Months.ELEVEN;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusMillis((-885));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 1);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minus(period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(2249L, (Chronology) buddhistChronology0);
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
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) buddhistChronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      MonthDay monthDay0 = new MonthDay((long) 1);
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
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      PeriodType periodType0 = PeriodType.hours();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.withPeriodType(periodType0);
      assertNotSame(period2, period0);
      assertEquals("Hours", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodType periodType0 = PeriodType.hours();
      period0.withPeriodType(periodType0);
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      Days days0 = Days.THREE;
      DurationFieldType durationFieldType1 = days0.getFieldType();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[7];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType1;
      durationFieldTypeArray0[2] = durationFieldType0;
      durationFieldTypeArray0[3] = durationFieldType0;
      durationFieldTypeArray0[4] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      durationFieldTypeArray0[6] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weeks, weeks, weeks, weeks, days]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = new Period();
      Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(5, 1, buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[3];
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      durationFieldTypeArray0[0] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.minutes();
      durationFieldTypeArray0[1] = durationFieldType1;
      Seconds seconds0 = Seconds.ONE;
      Hours hours0 = seconds0.toStandardHours();
      DurationFieldType durationFieldType2 = hours0.getFieldType();
      durationFieldTypeArray0[2] = durationFieldType2;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("StandardNoYearsNoMonthsNoWeeksNoSecondsNoMillis", periodType0.getName());
      
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusHours(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period((-1), (-2139), (-1837), (-1837), 1896, 1896, 99, (-2139));
      Period period1 = period0.plusSeconds((-1));
      YearMonth yearMonth0 = YearMonth.now();
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.days((-3474));
      Period period1 = period0.plusHours((-3474));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.days((-3474));
      period0.plus(period0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodType periodType0 = PeriodType.hours();
      PeriodType periodType1 = periodType0.withHoursRemoved();
      assertEquals("HoursNoHours", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
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
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period(0, (-1514), 0, (-1514), (-1514), (-1514), (-1837), 0);
      LocalTime localTime0 = new LocalTime();
      Period.fieldDifference(localTime0, localTime0);
      Hours hours0 = Hours.ZERO;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      boolean boolean0 = period0.ZERO.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) 99);
      Period.fieldDifference(monthDay0, monthDay0);
      YearMonth yearMonth0 = new YearMonth(168L, (Chronology) null);
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
  public void test20()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 1);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Months months0 = Months.MIN_VALUE;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      Period period1 = period0.ZERO.withFieldAdded(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusMonths(1);
      period1.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
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
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusHours(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period((-1), (-2139), (-1837), (-1837), 1896, 1896, 99, (-2139));
      Period period1 = period0.normalizedStandard();
      MonthDay monthDay0 = new MonthDay((long) 99);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      Days days0 = Days.THREE;
      DurationFieldType durationFieldType1 = days0.getFieldType();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[7];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldType0;
      durationFieldTypeArray0[3] = durationFieldType0;
      durationFieldTypeArray0[4] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      durationFieldTypeArray0[6] = durationFieldType1;
      period0.plusMillis(0);
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weeks, weeks, weeks, weeks, weeks]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.ZERO.plusMonths(0);
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      Days days0 = Days.THREE;
      DurationFieldType durationFieldType1 = days0.getFieldType();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[7];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldType0;
      durationFieldTypeArray0[3] = durationFieldType0;
      durationFieldTypeArray0[4] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      durationFieldTypeArray0[6] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weeks, weeks, weeks, weeks, weeks]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Days days0 = Days.TWO;
      Period period1 = days0.toPeriod();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
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
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMinutes(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.days((-3474));
      period0.plusYears(83);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = new Period((Object) null);
      Period period1 = period0.plusSeconds(4421);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      MonthDay monthDay0 = new MonthDay((long) 1, (Chronology) julianChronology0);
      Period period2 = Period.fieldDifference(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.years((-24));
      Period period1 = period0.plusMinutes((-24));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.years((-24));
      period0.minusWeeks((-24));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.months(32);
      Period period1 = period0.normalizedStandard();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      period0.normalizedStandard();
      Hours hours0 = Hours.SEVEN;
      Weeks weeks0 = hours0.toStandardWeeks();
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      Days days0 = Days.THREE;
      DurationFieldType durationFieldType1 = days0.getFieldType();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[7];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType1;
      durationFieldTypeArray0[2] = durationFieldType0;
      durationFieldTypeArray0[3] = durationFieldType0;
      durationFieldTypeArray0[4] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      durationFieldTypeArray0[6] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weeks, weeks, weeks, weeks, days]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 1);
      Period period0 = duration0.toPeriodFrom((ReadableInstant) mutableDateTime0);
      Period period1 = period0.minusMonths(23118750);
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  public void test45()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period0 = new Period(1, 0, 0, 1, 1, 1, 0, 0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(9L);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Seconds seconds0 = Seconds.seconds(4);
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 325);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = Period.years((-24));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.toStandardDuration();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Duration as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodType periodType0 = PeriodType.hours();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.withPeriodType(periodType0);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusDays(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Period period0 = Period.months(32);
      Period period1 = period0.ZERO.minusDays(699);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      Period period0 = Period.months(32);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.negated();
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(5, 1, buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.multipliedBy(3528);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Days days0 = Days.TWO;
      Period period1 = period0.minus(days0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.plusMillis(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) buddhistChronology0);
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
  public void test58()  throws Throwable  {
      Period period0 = Period.days((-3474));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 451);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
