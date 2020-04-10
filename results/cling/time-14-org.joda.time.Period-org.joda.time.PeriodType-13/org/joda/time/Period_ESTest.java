/*

 * Tue Mar 03 17:34:05 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(1, 1);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.minusDays(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.years(32);
      Period period1 = period0.plusHours(32);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1000, (Chronology) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.yearDayTime();
      PeriodType periodType1 = periodType0.withYearsRemoved();
      assertEquals("YearDayTimeNoYears", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      YearMonth yearMonth0 = new YearMonth(0, (-4), chronology0);
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
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      DurationFieldType durationFieldType1 = DurationFieldType.HOURS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[6];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldType0;
      durationFieldTypeArray0[3] = durationFieldType1;
      durationFieldTypeArray0[4] = durationFieldType1;
      durationFieldTypeArray0[5] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [days, days, hours, days]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      String string0 = period0.toString();
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period.fieldDifference(localDateTime0, localDateTime0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(32);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
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
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period.fieldDifference(localDateTime0, localDateTime0);
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(monthDay0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 37);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period1.plus(period0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Period period0 = Period.weeks(1);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      YearMonth yearMonth0 = new YearMonth(0, (-4), chronology0);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period2 = period0.plusHours(0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.years(32);
      period0.plusHours(32);
      LocalDate localDate0 = new LocalDate();
      Period period1 = Period.fieldDifference(localDate0, localDate0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.years(32);
      Period period1 = period0.normalizedStandard();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.years(32);
      Period period1 = period0.ZERO.minusMonths(0);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1000, (Chronology) null);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMonths(3335);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.years(32);
      Period period1 = period0.plusYears(0);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusYears(32);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.hours(32);
      Period period1 = period0.minusSeconds(0);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.plusSeconds(32);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.years(32);
      Period period1 = period0.minusMinutes(1000);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(2577L, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period0.ZERO.plusWeeks(5584);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.years(32);
      Period period1 = period0.ZERO.withWeeks(0);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      YearMonth yearMonth0 = new YearMonth(0, (-4), chronology0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      Period period0 = new Period((-1702), 1, 3, 3, 1, (-1205), 0, 1687, (PeriodType) null);
      // Undeclared exception!
      try { 
        period0.toStandardHours();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Hours as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.normalizedStandard();
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 2893);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(1, 1, buddhistChronology0);
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test34()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1000, (Chronology) null);
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.standard();
      Period period1 = period0.withPeriodType(periodType0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period.fieldDifference(localDateTime0, localDateTime0);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays(2637);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
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
      Period period0 = Period.years(32);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1000, (Chronology) null);
      Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.negated();
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.minus((ReadablePeriod) null);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(2577L, (Chronology) buddhistChronology0);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.years(32);
      Period period1 = period0.plusMillis(0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1000, (Chronology) null);
      Period period2 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = Period.months(1);
      period0.ZERO.minusMillis(1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period1 = Period.fieldDifference(localDateTime0, localDateTime0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Period period0 = Period.weeks(1);
      LocalDateTime localDateTime0 = new LocalDateTime((-4513L), (Chronology) buddhistChronology0);
      Period.fieldDifference(localDateTime0, localDateTime0);
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
  public void test47()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1000, (Chronology) null);
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period0, period1);
  }
}
