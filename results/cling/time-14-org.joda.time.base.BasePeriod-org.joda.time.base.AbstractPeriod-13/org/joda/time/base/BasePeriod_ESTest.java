/*

 * Tue Mar 03 17:16:05 GMT 2020
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
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ZERO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((PeriodType) null);
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
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
      DateMidnight dateMidnight0 = new DateMidnight();
      PeriodType periodType0 = PeriodType.time();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateMidnight0, periodType0);
      mutablePeriod0.addDays(0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Instant instant0 = new Instant();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, instant0, (PeriodType) null);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      assertEquals(1583255740457L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setSeconds(1537);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.THREE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(days0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addWeeks(4);
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
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      mutablePeriod0.addMonths(7);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-1), (Chronology) null);
      Period period0 = new Period(localTime0, localTime0);
      Months months0 = Months.ELEVEN;
      boolean boolean0 = period0.equals(months0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Instant instant0 = new Instant();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-1), (Chronology) null);
      Period period0 = new Period(localTime0, localTime0);
      Months months0 = Months.ELEVEN;
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, instant0, (PeriodType) null);
      assertEquals(1583255739387L, instant0.getMillis());
      
      boolean boolean0 = period0.equals(months0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks((-239));
      Seconds seconds0 = weeks0.toStandardSeconds();
      Duration duration0 = seconds0.toStandardDuration();
      DateTime dateTime0 = new DateTime((long) (-239));
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, dateTime0, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) weeks0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Duration duration0 = Duration.millis((-2015L));
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals((-2L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(days0);
      Period period0 = new Period(3642L);
      Period period1 = period0.plus(mutablePeriod0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      mutablePeriod0.setDays(7);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period((-1201), (-1201), (-1201), (-1201), (-1201), (-1201), (-1201), (-1201));
      Object object0 = new Object();
      boolean boolean0 = period0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Instant instant0 = new Instant();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 7, (Chronology) null);
      Period period0 = new Period(localTime0, localTime0);
      period0.equals(mutablePeriod0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, instant0, (PeriodType) null);
      assertEquals(1583255729111L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(0L, 0L, periodType0);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(1, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 7, (Chronology) null);
      Period period0 = new Period(localTime0, localTime0);
      Weeks weeks0 = period0.toStandardWeeks();
      mutablePeriod0.mergePeriod(weeks0);
      assertEquals(1, weeks0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setPeriod((-3875), (-3875), (-3875), (-3875), (-3875), 1321, 1321, 1321);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }
}
