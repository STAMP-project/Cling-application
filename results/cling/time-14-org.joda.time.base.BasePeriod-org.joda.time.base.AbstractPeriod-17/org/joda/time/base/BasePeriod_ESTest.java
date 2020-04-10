/*

 * Tue Mar 03 17:16:08 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) buddhistChronology0);
      Seconds seconds0 = Seconds.ONE;
      PeriodType periodType0 = seconds0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, mutableDateTime0, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addMinutes(5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.hours(0);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, dateMidnight0, (PeriodType) null);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      assertFalse(mutablePeriod0.equals((Object)mutablePeriod1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMinutes(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.addMinutes(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      mutablePeriod0.addMinutes(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1496L), periodType0);
      Period period0 = Period.millis(50);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.add(1L);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setMillis((-2281));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 4706, (PeriodType) null);
      boolean boolean0 = mutablePeriod0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 4706, (PeriodType) null);
      Period period0 = new Period((long) 4706);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Period period0 = new Period((long) 1);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) buddhistChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateMidnight0, (PeriodType) null);
      Period period0 = new Period((long) 1);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = null;
      try {
        period0 = new Period(3204, 3204, 3204, 3204, 1963, 1963, 3204, (-218), periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.millis(0);
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, periodType0, (Chronology) null);
      Period period1 = period0.minus(mutablePeriod0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Years years0 = Years.ZERO;
      PeriodType periodType0 = years0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1, periodType0);
      mutablePeriod0.setSeconds(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }
}
