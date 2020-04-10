/*

 * Tue Mar 03 17:13:34 GMT 2020
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
import org.joda.time.Minutes;
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
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      // Undeclared exception!
      try { 
        mutablePeriod0.addWeeks((-520));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.years(3483);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P3483Y", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, (PeriodType) null, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1523L), (-1523L), periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMonths(3483);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(37, 37);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      mutablePeriod0.add(durationFieldType0, 37);
      assertEquals("weeks", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.ZERO;
      PeriodType periodType0 = PeriodType.time();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      boolean boolean0 = mutablePeriod0.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      Days days0 = Days.days(590);
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
      PeriodType periodType0 = PeriodType.time();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      mutablePeriod0.add((-2507L));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Minutes minutes0 = hours0.toStandardMinutes();
      PeriodType periodType0 = minutes0.getPeriodType();
      DateTime dateTime0 = new DateTime((-1590L));
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      String string0 = mutablePeriod0.toString();
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.setMinutes(2955);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, (PeriodType) null);
      boolean boolean0 = mutablePeriod0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.normalizedStandard();
      boolean boolean0 = period0.equals(period1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.ZERO;
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      boolean boolean0 = mutablePeriod0.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      Hours hours0 = Hours.FIVE;
      // Undeclared exception!
      try { 
        mutablePeriod0.mergePeriod(hours0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      Hours hours0 = Hours.ZERO;
      mutablePeriod0.mergePeriod(hours0);
      assertEquals(1, hours0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2073, 5004, 5004, (-1768), 2073, (-2035), (-1768), (-2035));
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
  public void test21()  throws Throwable  {
      Period period0 = Period.millis((-2135));
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period((Object) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
      mutablePeriod0.addWeeks(0);
  }
}
