/*

 * Tue Mar 03 17:16:08 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Years;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(5062500, 5062500, 0, 5244, 5062500, 20, 5062500, 770);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, mutableDateTime0, periodType0);
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
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1356L), (-1356L), periodType0);
      mutablePeriod0.addMonths(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Years years0 = Years.ZERO;
      PeriodType periodType0 = years0.getPeriodType();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setWeeks((-2207));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period0 = new Period(localTime0, localTime0, periodType0);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod0.addMinutes((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addMillis((-94));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = new Period(10000000L, 10000000L, periodType0);
      PeriodType periodType1 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, periodType1);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(10000000L, 10000000L, periodType0);
      PeriodType periodType1 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, periodType1);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertFalse(boolean0);
      
      Period period1 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(10000000L, 10000000L, periodType0);
      Period period1 = period0.plusYears((-317));
      PeriodType periodType1 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, periodType1);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Duration duration0 = new Duration((-1L));
      Period period0 = new Period((ReadableInstant) null, duration0, periodType0);
      Period period1 = period0.minus(mutablePeriod0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1262L));
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.days((-25));
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.setYears((-1767));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Period period0 = new Period(1, 1, 1, 1);
      boolean boolean0 = period0.equals(dateTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(iSOChronology0).when(readableInstant0).getChronology();
      doReturn(0L).when(readableInstant0).getMillis();
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, readableInstant0, periodType0);
      Period period0 = new Period(1L, (-574L), periodType0);
      Period period1 = period0.withFields(mutablePeriod0);
      boolean boolean0 = period1.equals(mutablePeriod0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period(1, 1, 1, 1);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(period0, periodType0, ethiopicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(10000000L, 10000000L, periodType0);
      PeriodType periodType1 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, periodType1);
      period0.equals(mutablePeriod0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      assertEquals(1583255735671L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, mutableDateTime0, periodType0);
      mutablePeriod0.setMonths(0);
      assertEquals(1583255735267L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(10000000L, 10000000L, periodType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, periodType0);
      mutablePeriod0.add((ReadablePeriod) period0);
  }
}
