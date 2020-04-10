/*

 * Tue Mar 03 17:31:37 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.plusHours(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      Period period0 = new Period(dateTime0, dateTime0);
      Period period1 = period0.plusMonths(0);
      YearMonth yearMonth0 = new YearMonth((Chronology) buddhistChronology0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.minutes(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.plusMonths(1193);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(968L, (Chronology) gJChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.ZERO.plusSeconds(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.minusYears(336);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Period.fieldDifference(localDate0, localDate0);
      PeriodType periodType1 = periodType0.withDaysRemoved();
      assertEquals("DaysNoDays", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[9];
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldTypeArray0[0];
      durationFieldTypeArray0[2] = durationFieldTypeArray0[0];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
      durationFieldTypeArray0[3] = durationFieldType1;
      durationFieldTypeArray0[4] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      durationFieldTypeArray0[6] = durationFieldTypeArray0[3];
      durationFieldTypeArray0[7] = durationFieldType1;
      durationFieldTypeArray0[8] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [minutes, minutes, minutes, minutes, hours, hours, hours]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(968L, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.ZERO.plusWeeks(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      LocalTime localTime0 = new LocalTime((long) (-1986), (DateTimeZone) fixedDateTimeZone0);
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
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 960);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(168L);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period();
      period0.minusMinutes(192);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
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
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusHours(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.minusHours((-1986));
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
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.ZERO.minusMonths(22);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.minutes(0);
      period0.minusMinutes(0);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0, 1, 1, 1, 1, 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusYears(1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.years((-1986));
      period0.minusSeconds((-1986));
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.minusMinutes(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.minutes(0);
      period0.minusWeeks(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.minusWeeks(58);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readableInstant0).getChronology();
      doReturn(4294967295L, 4294967295L).when(readableInstant0).getMillis();
      Period period0 = new Period(readableInstant0, readableInstant0);
      period0.normalizedStandard();
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
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
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readableInstant0).getChronology();
      doReturn(4294967295L, (long)1).when(readableInstant0).getMillis();
      Period period0 = new Period(readableInstant0, readableInstant0);
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.toStandardDuration();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Duration as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readableInstant0).getChronology();
      doReturn(4294967295L, 968L).when(readableInstant0).getMillis();
      Period period0 = new Period(readableInstant0, readableInstant0);
      Period period1 = period0.normalizedStandard();
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.years((-1986));
      period0.normalizedStandard();
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L).when(readableInstant0).getMillis();
      Period period0 = new Period(readableInstant0, readableInstant0);
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, (-8));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-1837));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(3661L);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.years((-1986));
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
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
  public void test39()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals(1, seconds0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readableInstant0).getChronology();
      doReturn(4294967295L, 4294967295L).when(readableInstant0).getMillis();
      Period period0 = new Period(readableInstant0, readableInstant0);
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = new Period(period0, periodType0);
      Period period2 = period1.withPeriodType(periodType0);
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readableInstant0).getChronology();
      doReturn(4294967295L, 4294967295L).when(readableInstant0).getMillis();
      Period period0 = new Period(readableInstant0, readableInstant0);
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays(1);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
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
  public void test45()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(3661L);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      Instant instant0 = Instant.now();
      Period period0 = new Period(instant0, instant0);
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      period0.negated();
      assertEquals(1583256552684L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(921L);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minus(period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMillis(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = Period.years((-1986));
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusMillis((-1986));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readableInstant0).getChronology();
      doReturn(4294967295L, 968L).when(readableInstant0).getMillis();
      Period period0 = new Period(readableInstant0, readableInstant0);
      LocalDateTime localDateTime0 = new LocalDateTime(968L);
      Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period0, period1);
  }
}
