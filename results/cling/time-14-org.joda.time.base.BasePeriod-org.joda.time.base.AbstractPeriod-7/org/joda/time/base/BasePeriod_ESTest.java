/*

 * Tue Mar 03 17:15:37 GMT 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
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
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addSeconds(1258);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      // Undeclared exception!
      try { 
        mutablePeriod0.toString(periodFormatter0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        mutablePeriod0.set(durationFieldType0, 3541);
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
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.addSeconds(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addMillis(17);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.minutes((-3206));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 1);
      DateTime dateTime0 = new DateTime((Chronology) ethiopicChronology0);
      Minutes minutes0 = Minutes.ONE;
      Duration duration0 = minutes0.toStandardDuration();
      Hours hours0 = duration0.toStandardHours();
      PeriodType periodType0 = hours0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, periodType0);
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
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.add(446L);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(213, 213, 213, 213, 213, 213, 213, 213);
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("P213Y213M213W213DT213H213M213.213S", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      int int0 = mutablePeriod0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, dateTime0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.setMinutes(826);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      boolean boolean0 = mutablePeriod0.equals(periodType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(253, 253, 253, (-596523));
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Weeks weeks0 = Weeks.THREE;
      // Undeclared exception!
      try { 
        mutablePeriod0.mergePeriod(weeks0);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0, periodType0, islamicChronology0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.setSeconds(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.SIX;
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = new Period(days0, gJChronology0);
  }
}
