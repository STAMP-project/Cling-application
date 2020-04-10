/*

 * Tue Mar 03 17:32:51 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
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
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.hours();
      PeriodType periodType1 = periodType0.withHoursRemoved();
      assertEquals("HoursNoHours", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.seconds((-1));
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[4];
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldTypeArray0[0];
      durationFieldTypeArray0[2] = durationFieldTypeArray0[0];
      DurationFieldType durationFieldType1 = DurationFieldType.MONTHS_TYPE;
      period0.ZERO.withFields((ReadablePeriod) null);
      durationFieldTypeArray0[3] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [days, days]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[4];
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.hours();
      DurationFieldType durationFieldType1 = periodType0.getFieldType(0);
      durationFieldTypeArray0[1] = durationFieldType1;
      DurationFieldType durationFieldType2 = DurationFieldType.YEARS_TYPE;
      durationFieldTypeArray0[2] = durationFieldType2;
      DurationFieldType durationFieldType3 = DurationFieldType.MONTHS_TYPE;
      durationFieldTypeArray0[3] = durationFieldType3;
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
  public void test03()  throws Throwable  {
      Period period0 = Period.months((-2422));
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      period0.isSupported(durationFieldType0);
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      LocalTime localTime0 = new LocalTime();
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
  public void test05()  throws Throwable  {
      Period period0 = Period.seconds((-1));
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[4];
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.YEARS_TYPE;
      durationFieldTypeArray0[2] = durationFieldType1;
      period0.ZERO.withFields((ReadablePeriod) null);
      durationFieldTypeArray0[3] = durationFieldTypeArray0[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [days, days]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((long) 1, (Chronology) buddhistChronology0);
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
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Chronology) null);
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
  public void test08()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Months months0 = Months.FOUR;
      Period period1 = period0.plus(months0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period0 = Period.months(1);
      period0.normalizedStandard();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      MonthDay monthDay0 = new MonthDay((long) 1820, (Chronology) strictChronology0);
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
  public void test12()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.plusHours(0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.months((-2422));
      period0.minusHours((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths((-551));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.seconds((-1));
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[4];
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldType0;
      period0.ZERO.withFields((ReadablePeriod) null);
      durationFieldTypeArray0[3] = durationFieldTypeArray0[1];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [days, days, days]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.plusMinutes(0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.plusSeconds(0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusSeconds((-899));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.months((-1));
      period0.ZERO.minusMinutes((-1));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusWeeks((-3432));
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
  public void test26()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.toStandardDays();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Days as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.months((-2422));
      period0.normalizedStandard();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusYears((-868));
      Period period2 = period1.normalizedStandard();
      assertNotSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.ZERO.withField((DurationFieldType) null, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.hours(317);
      Days days0 = Days.days(3377);
      DurationFieldType durationFieldType0 = days0.getFieldType();
      Period period1 = period0.withField(durationFieldType0, 3377);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(8, (-669), 97, 8, 3377, (-3822));
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusYears(575);
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
  public void test32()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Hours hours0 = period0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.standard();
      Period period2 = period0.withPeriodType(periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.standard();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays(3600000);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  public void test38()  throws Throwable  {
      Period period0 = Period.seconds((-1));
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[4];
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.hours();
      DurationFieldType durationFieldType1 = periodType0.getFieldType(0);
      durationFieldTypeArray0[1] = durationFieldType1;
      DurationFieldType durationFieldType2 = DurationFieldType.YEARS_TYPE;
      durationFieldTypeArray0[2] = durationFieldType2;
      DurationFieldType durationFieldType3 = DurationFieldType.MONTHS_TYPE;
      durationFieldTypeArray0[3] = durationFieldType3;
      PeriodType.forFields(durationFieldTypeArray0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.normalizedStandard();
      Period period2 = period1.multipliedBy(732);
      assertTrue(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.seconds((-1));
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[4];
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.hours();
      DurationFieldType durationFieldType1 = periodType0.getFieldType(0);
      durationFieldTypeArray0[1] = durationFieldType1;
      DurationFieldType durationFieldType2 = DurationFieldType.YEARS_TYPE;
      durationFieldTypeArray0[2] = durationFieldType2;
      DurationFieldType durationFieldType3 = DurationFieldType.MONTHS_TYPE;
      durationFieldTypeArray0[3] = durationFieldType3;
      PeriodType.forFields(durationFieldTypeArray0);
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minus(period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.minusMillis(0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMillis((-1313));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 2809);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = Period.months((-2422));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) strictChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, (-2422));
      assertFalse(period1.equals((Object)period0));
  }
}
