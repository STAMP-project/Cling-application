/*

 * Tue Mar 03 17:16:24 GMT 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
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
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("", periodFormatter0);
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period(0L);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.weeks(2989);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P2989W", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      mutablePeriod0.add(durationFieldType0, 0);
      assertEquals("halfdays", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ONE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      PeriodType periodType0 = PeriodType.seconds();
      MutableInterval mutableInterval0 = new MutableInterval(43200000L, 43200000L);
      Interval interval0 = mutableInterval0.toInterval();
      DateTime dateTime0 = interval0.getEnd();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      assertFalse(mutablePeriod0.equals((Object)mutablePeriod1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMinutes((-2493));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addMonths((-1198));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-16), (-16), (-16), (-16), (-16), (-16), (-16), (-16));
      mutablePeriod0.addHours((-16));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ZERO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.SEVEN;
      PeriodType periodType0 = PeriodType.time();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
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
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      PeriodType periodType0 = PeriodType.months();
      Period period0 = new Period(localTime0, localTime0, periodType0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ONE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.mergePeriod(days0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMinutes(0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      boolean boolean0 = mutablePeriod0.equals(periodType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = mock(PeriodType.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(periodType0).size();
      doReturn("<}bb`Yg'/ -", "<}bb`Yg'/ -").when(periodType0).toString();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Weeks weeks0 = Weeks.ZERO;
      Days days0 = weeks0.toStandardDays();
      PeriodType periodType1 = days0.getPeriodType();
      Period period0 = new Period((ReadableDuration) null, (ReadableInstant) null, periodType1);
      boolean boolean0 = period0.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.THREE;
      PeriodType periodType0 = days0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(1, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      Days days0 = Days.ONE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.set(durationFieldType0, 0);
      assertEquals("eras", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.seconds((-49));
      Weeks weeks0 = Weeks.weeks((-49));
      PeriodType periodType0 = weeks0.getPeriodType();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
