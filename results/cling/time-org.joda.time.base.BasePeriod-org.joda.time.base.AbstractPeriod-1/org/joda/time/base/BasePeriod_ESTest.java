/*

 * Tue Mar 03 17:13:16 GMT 2020
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addHours(2046);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period(2055L);
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period();
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((-704L), (Chronology) ethiopicChronology0);
      DateTime dateTime0 = dateMidnight0.toDateTime((Chronology) ethiopicChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateMidnight0, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.set((DurationFieldType) null, (-1855));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Instant instant0 = Instant.now();
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(instant0, instant0, periodType0);
      mutablePeriod0.addMinutes(0);
      assertEquals(1583255573905L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.addSeconds(1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Instant instant0 = Instant.now();
      Duration duration0 = Duration.standardMinutes(0L);
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(instant0, instant0, periodType0);
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(1583255573378L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Days days0 = Days.FIVE;
      MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateMidnight0, periodType0);
      Days days0 = Days.FIVE;
      MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Months months0 = Months.SIX;
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) months0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.ZERO;
      int int0 = period0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.setMonths(11);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, dateMidnight0, periodType0);
      boolean boolean0 = mutablePeriod1.equals(mutablePeriod0);
      assertFalse(boolean0);
      assertFalse(mutablePeriod0.equals((Object)mutablePeriod1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(1, 604800L, periodType0);
      Object object0 = new Object();
      boolean boolean0 = period0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Months months0 = Months.SIX;
      mutablePeriod0.mergePeriod(months0);
      assertEquals(1, months0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Months months0 = Months.SIX;
      // Undeclared exception!
      try { 
        mutablePeriod0.mergePeriod(months0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodType periodType0 = PeriodType.years();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0, periodType0, gregorianChronology0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Days days0 = Days.ONE;
      Weeks weeks0 = days0.toStandardWeeks();
      PeriodType periodType0 = weeks0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMonths(0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Months months0 = Months.SIX;
      Period period0 = new Period(months0);
  }
}
