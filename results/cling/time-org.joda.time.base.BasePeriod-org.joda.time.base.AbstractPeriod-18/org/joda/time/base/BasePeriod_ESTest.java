/*

 * Tue Mar 03 17:16:14 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addDays(294);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1929L), 7L, (PeriodType) null);
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      // Undeclared exception!
      try { 
        mutablePeriod0.toString(periodFormatter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period(0L, 0L);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1174L);
      Instant instant0 = new Instant((long) 3);
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, instant0, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      assertFalse(mutablePeriod0.equals((Object)mutablePeriod1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        mutablePeriod0.set(durationFieldType0, 577);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Instant instant0 = Instant.now();
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, instant0, periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      mutablePeriod0.add(durationFieldType0, 0);
      assertEquals(1583255755052L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, (Chronology) null);
      mutablePeriod0.addSeconds(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Months months0 = Months.EIGHT;
      Period period0 = Period.ZERO;
      period0.equals(months0);
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Months months0 = Months.TWELVE;
      Period period0 = new Period();
      period0.equals(months0);
      Instant instant0 = new Instant((long) 0);
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, instant0, periodType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1186L);
      mutablePeriod0.add((long) 27);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(localTime0, localTime0, periodType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period1 = period0.minus(mutablePeriod0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, (Chronology) null);
      mutablePeriod0.setDays(7);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Object object0 = new Object();
      boolean boolean0 = mutablePeriod0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.ZERO;
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, (Chronology) null);
      MutablePeriod mutablePeriod1 = new MutablePeriod(2833L, 0L, (PeriodType) null);
      boolean boolean0 = mutablePeriod1.equals(mutablePeriod0);
      assertFalse(boolean0);
      
      MutablePeriod mutablePeriod2 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      assertFalse(mutablePeriod2.equals((Object)mutablePeriod1));
      assertTrue(mutablePeriod2.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2652L), (-2652L));
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1186L);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = null;
      try {
        period0 = new Period(64, 64, 0, 4, 0, 407, 407, 64, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1174L);
      // Undeclared exception!
      try { 
        mutablePeriod0.set((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.hours((-2194));
      PeriodType periodType0 = hours0.getPeriodType();
      Period period0 = new Period((-2194), (-1094), periodType0);
      Seconds seconds0 = hours0.toStandardSeconds();
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = new Period((Object) null, (Chronology) null);
  }
}
