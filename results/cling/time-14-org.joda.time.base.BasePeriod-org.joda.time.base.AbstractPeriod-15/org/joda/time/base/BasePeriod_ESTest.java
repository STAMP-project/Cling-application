/*

 * Tue Mar 03 17:16:06 GMT 2020
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
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.ONE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        mutablePeriod0.add(durationFieldType0, 1561);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.SEVEN;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.addWeeks(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0, 0, 0, 2324, 0, 0, 0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      GJChronology gJChronology0 = GJChronology.getInstance();
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      DateTime dateTime0 = new DateTime(108L, (Chronology) gJChronology0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, gJChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setWeeks(1220);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(hours0);
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
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addSeconds(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((ReadablePeriod) mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTime dateTime0 = new DateTime(1L, (Chronology) gJChronology0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      boolean boolean0 = mutablePeriod1.equals(mutablePeriod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
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
  public void test14()  throws Throwable  {
      Period period0 = Period.weeks(14);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      int int0 = period0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setWeeks((-4133));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      boolean boolean0 = mutablePeriod1.equals(mutablePeriod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0, 0, 12825000, 0, 0, 12825000, 83);
      boolean boolean0 = mutablePeriod0.equals("{]hW<DA&|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      Period period0 = null;
      try {
        period0 = new Period(8, 8, 8, 1, 8, 8, 8, (-207), periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod1.mergePeriod(mutablePeriod0);
      assertFalse(mutablePeriod0.equals((Object)mutablePeriod1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.setMonths(0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-456L), (-456L));
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }
}
