/*

 * Tue Mar 03 17:15:38 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      DateTime dateTime0 = new DateTime((long) 1371);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.addWeeks(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 0);
      // Undeclared exception!
      try { 
        mutablePeriod0.set((DurationFieldType) null, (-1493));
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
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addWeeks(1);
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
      PeriodType periodType0 = PeriodType.dayTime();
      DateTime dateTime0 = new DateTime((long) 1374);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.addHours(1374);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.FOUR;
      DateTime dateTime0 = new DateTime((-1L));
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) days0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      DateTime dateTime0 = new DateTime((long) 1374);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.add((long) 1451);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      int int0 = mutablePeriod0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      DateTime dateTime0 = new DateTime((long) 1374);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      DateTime dateTime0 = new DateTime((long) 1374);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.setMinutes(1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.millis(1374);
      PeriodType periodType0 = PeriodType.dayTime();
      DateTime dateTime0 = new DateTime((long) 1374);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = Period.millis(0);
      boolean boolean0 = period0.equals(periodType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 0);
      Period period0 = Period.weeks(1);
      mutablePeriod0.mergePeriod(period0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      DateTime dateTime0 = new DateTime((long) 1374);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      Period period0 = Period.months(283);
      // Undeclared exception!
      try { 
        mutablePeriod0.mergePeriod(period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      DateTime dateTime0 = new DateTime((long) 1374);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.setWeeks(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.millis(1374);
      PeriodType periodType0 = PeriodType.dayTime();
      Period period1 = period0.withPeriodType(periodType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      MutablePeriod mutablePeriod1 = new MutablePeriod(1451, 1, 2120, 1451, 283, (-1), (-1876), 2120);
      boolean boolean0 = mutablePeriod1.equals(period1);
      assertFalse(period1.equals((Object)period0));
      assertFalse(boolean0);
  }
}
