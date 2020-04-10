/*

 * Tue Mar 03 17:13:38 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, mutableDateTime0);
      mutablePeriod0.add((ReadablePeriod) null);
      assertEquals(1583255597777L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addYears(1395);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      MutablePeriod mutablePeriod1 = mutablePeriod0.toMutablePeriod();
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
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
  public void test05()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, mutableDateTime0);
      assertEquals(1583255594802L, mutableDateTime0.getMillis());
      
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      assertTrue(mutablePeriod0.equals((Object)mutablePeriod1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setSeconds(1442);
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
      DateMidnight dateMidnight0 = DateMidnight.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      mutablePeriod0.add(durationFieldType0, 0);
      assertEquals("weekyears", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addMonths((-1004));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Years years0 = Years.ONE;
      boolean boolean0 = period0.equals(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = period0.toStandardWeeks();
      period0.equals(weeks0);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, mutableDateTime0, (PeriodType) null);
      assertEquals(1583255594303L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Period period0 = Period.months(17);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((long) (-1004));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      int int0 = mutablePeriod0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      mutablePeriod0.mergePeriod(period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      mutablePeriod0.setYears(1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.ZERO;
      boolean boolean0 = period0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      period0.equals(mutablePeriod0);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, mutableDateTime0, (PeriodType) null);
      assertEquals(1583255579119L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.setSeconds(0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.months((-3949));
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, (PeriodType) null, chronology0);
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }
}
