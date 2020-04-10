/*

 * Tue Mar 03 17:13:17 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addWeeks((-28));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.seconds(0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      // Undeclared exception!
      try { 
        mutablePeriod0.set(durationFieldType0, (-837));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0, periodType0);
      mutablePeriod0.addSeconds(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addSeconds(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(744, 744, 744, 744);
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.ONE;
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = days0.toPeriod();
      period0.equals(days0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now((Chronology) ethiopicChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      Period period0 = Period.months(1);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertEquals(1583255576753L, dateTime0.getMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      PeriodType periodType0 = PeriodType.minutes();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now((Chronology) ethiopicChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) mutablePeriod1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period0 = new Period(mutablePeriod0);
      Period period1 = period0.plus(mutablePeriod0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.TWO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = days0.toPeriod();
      mutablePeriod0.mergePeriod(period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1954L));
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setDays((-292275054));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period(localDateTime0, localDateTime0, (PeriodType) null);
      boolean boolean0 = period0.equals(fixedDateTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      MutablePeriod mutablePeriod1 = new MutablePeriod(20, 744, (Chronology) null);
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod1);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
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
      Days days0 = Days.ONE;
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(days0, periodType0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      PeriodType periodType0 = PeriodType.days();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      DateTime dateTime0 = DateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.setMonths(0);
      assertEquals(1583255567775L, dateTime0.getMillis());
  }
}
