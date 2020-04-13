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
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.months((-1115));
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2143L, (Chronology) copticChronology0);
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("PT2.143S", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.addHours(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, gJChronology0);
      Instant instant0 = gJChronology0.getGregorianCutover();
      Period period0 = new Period((ReadableInstant) null, instant0, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, periodType0, gregorianChronology0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMinutes(3166);
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
      PeriodType periodType0 = PeriodType.years();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0, islamicChronology_LeapYearPatternType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, islamicChronology0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addMillis(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.seconds((-19));
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      Period period1 = period0.withFieldAdded(durationFieldType0, 1);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add(0L);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.seconds((-37));
      boolean boolean0 = period0.equals(period0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, gJChronology0);
      Instant instant0 = gJChronology0.getGregorianCutover();
      Period period0 = new Period((ReadableInstant) null, instant0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Hours hours0 = Hours.SIX;
      mutablePeriod0.add((ReadablePeriod) hours0);
      assertEquals(1, hours0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = new Period(2084, 4323, 4323, 2194);
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Period period1 = period0.minus(mutablePeriod0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("P-1115M");
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Partial partial0 = new Partial();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      boolean boolean0 = mutablePeriod0.equals(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.seconds((-18));
      Period period1 = period0.plusWeeks(292271022);
      period1.equals(period0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.seconds((-19));
      Period period1 = period0.plusWeeks(292271022);
      period1.equals(period0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((long) 292271022, (Chronology) gregorianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = duration0.toPeriod(periodType0);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((long) 292271022, (Chronology) gregorianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateMidnight0);
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      mutablePeriod0.mergePeriod(hours0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.weeks(8);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, periodType0, gregorianChronology0);
      mutablePeriod0.setMinutes(0);
  }
}
