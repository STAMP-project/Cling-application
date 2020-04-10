/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:39:16 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.Seconds;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Duration duration0 = hours0.toStandardDuration();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, (Chronology) null);
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(21600L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, (-1245L));
      mutablePeriod0.add((ReadableDuration) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, 2009L);
      mutablePeriod0.add((ReadableInterval) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1567L), (-2771L));
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1);
      mutablePeriod0.setPeriod((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight1);
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      mutablePeriod0.setPeriod((ReadableInterval) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      MutableInterval mutableInterval0 = new MutableInterval(1, 1440);
      mutablePeriod0.setPeriod((ReadableInterval) mutableInterval0);
      assertEquals(1440L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1557L), (-2771L));
      mutablePeriod0.addHours((-842));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(3829L, 1, periodType0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.millis(2009L);
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, periodType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, 2009L);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(".<D(o;Fx&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \".<D(o;Fx&\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L);
      mutablePeriod0.setDays(0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(0, 0, 0, 0, 2170, 0, 0, 0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, 2009L);
      GJChronology gJChronology0 = GJChronology.getInstance();
      mutablePeriod0.add((-1979L), (Chronology) gJChronology0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setHours((-273));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1567L), (-2771L));
      mutablePeriod0.setMonths(1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, 2009L);
      mutablePeriod0.add(100000000000000L);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1);
      Duration duration0 = Duration.standardHours(86400L);
      DateTime dateTime0 = new DateTime();
      Interval interval0 = duration0.toIntervalFrom(dateTime0);
      mutablePeriod0.add((ReadableInterval) interval0);
      assertEquals(1703449281320L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(459, (-2571), (-2571), 0, 0, 1, 0, 17887500);
      mutablePeriod0.addSeconds(17887500);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(31536000000L, (Chronology) ethiopicChronology0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setValue(37, 37);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 37
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      mutablePeriod0.addMillis(0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1567L), (-2771L));
      mutablePeriod0.setYears(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1, 1, 1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(149L);
      mutablePeriod0.setSeconds(1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1567L), (-2771L));
      mutablePeriod0.setWeeks((-3135));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, (-1245L));
      mutablePeriod0.addYears(835);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, (-1245L));
      mutablePeriod0.setPeriod(0L, 1330L);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) iSOChronology0);
      Duration duration0 = Duration.standardDays(10800000L);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, duration0);
      MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) iSOChronology0);
      Duration duration0 = Duration.standardDays(10800000L);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, duration0);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1567L), (-2771L));
      mutablePeriod0.addWeeks(3058);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2608L), periodType0, (Chronology) julianChronology0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutablePeriod.parse(".#qnTQ3yj;`s=Z<R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \".#qnTQ3yj;`s=Z<R\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Duration duration0 = seconds0.toStandardDuration();
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, dateMidnight0, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(406L);
      Instant instant0 = new Instant();
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, instant0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Months months0 = Months.MIN_VALUE;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      mutablePeriod0.set(durationFieldType0, (-649));
      assertEquals("months", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add(0, 1208, 0, 1462, 1462, 1208, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1567L), (-2771L));
      Instant instant0 = new Instant();
      mutablePeriod0.setPeriod((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertEquals(1392409281320L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1709L, 0L, periodType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(149L);
      mutablePeriod0.addMinutes((-3823));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, 2009L);
      mutablePeriod0.addDays(0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2009L, 2009L);
      mutablePeriod0.addMonths(0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(149L);
      mutablePeriod0.setMinutes((-943));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      mutablePeriod0.add(durationFieldType0, (-763));
      assertEquals("seconds", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1557L), (-2771L));
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0, copticChronology0);
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMillis((-273));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      Period period0 = new Period();
      Duration duration0 = period0.toStandardDuration();
      mutablePeriod0.setPeriod((ReadableDuration) duration0);
      assertEquals(0L, duration0.getStandardDays());
  }
}
