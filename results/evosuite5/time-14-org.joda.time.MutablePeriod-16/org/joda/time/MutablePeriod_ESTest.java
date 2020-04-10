/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:23:06 GMT 2019
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
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      Duration duration0 = new Duration((-463L));
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, dateMidnight0);
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(0L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) fixedDateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
      mutablePeriod0.add((ReadableDuration) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(842L, (Chronology) null);
      mutablePeriod0.add((ReadableInterval) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setPeriod((ReadableInterval) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1240L), (Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval((-1240L), (-1240L));
      mutablePeriod0.setPeriod((ReadableInterval) mutableInterval0);
      assertEquals((-1240L), mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, (Chronology) buddhistChronology0);
      mutablePeriod0.addHours((-748));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2211L), (-1), periodType0, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      Duration duration0 = Duration.standardSeconds(3282);
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, duration0, periodType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod("_~O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"_~O\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
      mutablePeriod0.setDays(3282);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(0, 0, 1, 0, 0, 0, 0, 3402, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, (Chronology) gregorianChronology0);
      mutablePeriod0.add((long) 0, (Chronology) gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      Duration duration0 = Duration.standardDays(2);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, duration0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setHours(0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMonths(1569);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2032L, (Chronology) gregorianChronology0);
      mutablePeriod0.add(2032L);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableInterval mutableInterval0 = MutableInterval.parse((String) null);
      MutablePeriod mutablePeriod0 = new MutablePeriod(2032L, 2032L);
      mutablePeriod0.add((ReadableInterval) mutableInterval0);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(842L, (Chronology) null);
      mutablePeriod0.addSeconds(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableInterval mutableInterval0 = MutableInterval.parse((String) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableInterval0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Instant instant0 = new Instant();
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, instant0, periodType0);
      mutablePeriod0.addMillis((-3399));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1L, (Chronology) null);
      mutablePeriod0.setYears(53);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2523), 1428, 84, (-2523));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, lenientChronology0);
      mutablePeriod0.setSeconds(1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-3267), 84, 84, (-118), (-2523), (-3267), 1428, 0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2080L, (Chronology) gJChronology0);
      mutablePeriod0.setWeeks((-3505));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) fixedDateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
      mutablePeriod0.addYears(0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(842L, (Chronology) null);
      mutablePeriod0.setPeriod(842L, (long) 0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, dateMidnight0, periodType0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight1);
      mutablePeriod0.setPeriod((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight1);
      assertEquals(1392336000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(842L, (Chronology) null);
      MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(842L, (Chronology) null);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(842L, (Chronology) null);
      mutablePeriod0.addWeeks(0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1268L, (PeriodType) null, (Chronology) julianChronology0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutablePeriod.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Literal", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0, 0, 0);
      DateTime dateTime0 = localTime0.toDateTimeToday();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateTime0, periodType0);
      mutablePeriod0.add(0, 0, 0, (-1401), (-3167), (-1), 0, (-1));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      mutablePeriod0.set(durationFieldType0, 3282);
      assertEquals("weeks", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = new Object();
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(object0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No period converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2032L, (Chronology) gregorianChronology0);
      mutablePeriod0.setPeriod((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(3783L, (-983L), periodType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(842L, (Chronology) null);
      mutablePeriod0.addMinutes(0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1969L), 0L, ethiopicChronology0);
      mutablePeriod0.addDays(0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(30L);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1969L), 0L, ethiopicChronology0);
      mutablePeriod0.addMonths((-2989));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, lenientChronology0);
      mutablePeriod0.setMinutes(1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) fixedDateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, (Chronology) gregorianChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      mutablePeriod0.add(durationFieldType0, (-1745));
      assertEquals("weeks", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMillis(0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1240L), (Chronology) null);
      DateTime dateTime0 = new DateTime((Object) null);
      Duration duration0 = mutablePeriod0.toDurationFrom(dateTime0);
      mutablePeriod0.setPeriod((ReadableDuration) duration0);
      assertEquals(0L, duration0.getStandardDays());
  }
}
