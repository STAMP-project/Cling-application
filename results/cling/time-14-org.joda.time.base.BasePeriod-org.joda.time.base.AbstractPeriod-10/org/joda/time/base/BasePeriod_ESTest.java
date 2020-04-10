/*

 * Tue Mar 03 17:15:55 GMT 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((PeriodType) null);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      Days days0 = Days.ONE;
      PeriodType periodType0 = days0.getPeriodType();
      Instant instant0 = new Instant((-1L));
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, instant0, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Duration duration0 = Duration.standardDays(2940L);
      Hours hours0 = duration0.toStandardHours();
      PeriodType periodType0 = hours0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      mutablePeriod0.addMinutes(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.years((-469));
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-469));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 23034375);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.addMonths(388);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      MonthDay monthDay0 = MonthDay.now();
      PeriodType periodType0 = PeriodType.days();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.minutes((-3303));
      Duration duration0 = period0.toDurationTo((ReadableInstant) null);
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      PeriodType periodType0 = weeks0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.FIVE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Period period0 = new Period(mutablePeriod0);
      Period period1 = period0.plus(mutablePeriod0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      int int0 = mutablePeriod0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.setMillis(2642);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      Period period0 = new Period(3607, 3607, 1925, 1925);
      boolean boolean0 = period0.equals(chronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
      boolean boolean0 = mutablePeriod1.equals(mutablePeriod0);
      assertTrue(boolean0);
      
      Days days0 = Days.ONE;
      PeriodType periodType0 = days0.getPeriodType();
      Instant instant0 = new Instant((-1L));
      MutablePeriod mutablePeriod2 = new MutablePeriod((ReadableInstant) null, instant0, periodType0);
      assertFalse(mutablePeriod2.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.weeks(756);
      PeriodType periodType0 = PeriodType.yearDay();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
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
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      mutablePeriod0.set(durationFieldType0, 0);
      assertEquals("centuries", durationFieldType0.getName());
  }
}
