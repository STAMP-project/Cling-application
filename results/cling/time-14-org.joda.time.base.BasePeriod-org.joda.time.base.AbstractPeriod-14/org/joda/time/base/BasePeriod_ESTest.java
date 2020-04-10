/*

 * Tue Mar 03 17:16:18 GMT 2020
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
import org.joda.time.LocalDate;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Years;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0).when(readableInstant0).getChronology();
      doReturn((long)1, 15778800000L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addWeeks(27);
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
      Period period0 = Period.minutes(6);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0).when(readableInstant0).getChronology();
      doReturn((-3258L), 15778800000L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      Period period0 = new Period(mutablePeriod0, (Chronology) null);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P6M2DT15H3.258S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.ZERO;
      MutablePeriod mutablePeriod0 = new MutablePeriod(years0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setWeeks((-2806));
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
      MutablePeriod mutablePeriod0 = new MutablePeriod(903L);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      mutablePeriod0.add(durationFieldType0, 0);
      assertEquals("centuries", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addMinutes((-1313));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0).when(readableInstant0).getChronology();
      doReturn((-3258L)).when(readableInstant0).getMillis();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period0 = new Period(0, 15778800017L, copticChronology0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, readableInstant0, periodType0);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertFalse(mutablePeriod0.equals((Object)mutablePeriod1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period0 = Period.hours(6);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, dateMidnight0, periodType0);
      Period period0 = Period.hours(1);
      mutablePeriod0.add((ReadablePeriod) period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(localDate0, localDate0, periodType0);
      Period period1 = period0.plus(period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0).when(readableInstant0).getChronology();
      doReturn((-3258L), 15778800000L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0).when(readableInstant0).getChronology();
      doReturn((-3258L), 15778800000L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      Period period0 = new Period(mutablePeriod0, (Chronology) null);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      Period period1 = period0.withField(durationFieldType0, 0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(localDate0, localDate0, periodType0);
      Object object0 = new Object();
      boolean boolean0 = period0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0).when(readableInstant0).getChronology();
      doReturn((-3258L), 15778800000L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      mutablePeriod0.clear();
      Period period0 = Period.hours(0);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0).when(readableInstant0).getChronology();
      doReturn((-3258L), 15778800000L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period0 = new Period(0, 15778800000L, copticChronology0);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(strictChronology0, copticChronology0).when(readableInstant0).getChronology();
      doReturn((-3258L), 15778800000L, 378L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(0, 15778800000L, copticChronology0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, readableInstant0, periodType0);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = Period.hours(8);
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMonths(0);
  }
}
