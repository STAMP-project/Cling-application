/*

 * Tue Mar 03 17:16:15 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(gJChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-177L), (-177L), strictChronology0);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(66L, 0L);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
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
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.addHours(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period(localDateTime0, localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 20);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Period period0 = new Period(604800000L, 604800000L, ethiopicChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((Object) null, ethiopicChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period0 = new Period(604800000L, 604800000L, ethiopicChronology0);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertEquals(1583255748422L, dateTime0.getMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      MutablePeriod mutablePeriod1 = new MutablePeriod();
      mutablePeriod1.addMinutes(1451);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) mutablePeriod1);
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
      DateMidnight dateMidnight0 = new DateMidnight();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
      mutablePeriod0.add((long) 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period();
      Months months0 = Months.NINE;
      PeriodType periodType0 = months0.getPeriodType();
      Period period1 = new Period(0L, periodType0, (Chronology) null);
      Period period2 = period0.plus(period1);
      assertTrue(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(ethiopicChronology0).when(readableInstant0).getChronology();
      doReturn((long)1).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, readableInstant0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setMonths((-684));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = DateTime.now((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, periodType0);
      boolean boolean0 = mutablePeriod0.equals("~RAQgk&|i2P");
      assertEquals(1583255744563L, dateTime0.getMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((Object) null, ethiopicChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime((DateTimeZone) fixedDateTimeZone0);
      PeriodType periodType0 = PeriodType.standard();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, periodType0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period0 = new Period(604800000L, 604800000L, ethiopicChronology0);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertEquals(1583255741470L, dateTime0.getMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((PeriodType) null);
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
      mutablePeriod0.mergePeriod(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(1, 1, 1, 1, 1, 1, 1, 1, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L);
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0, periodType0, ethiopicChronology0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, dateMidnight0);
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
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      mutablePeriod0.setYears(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(66L, 0L);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0, ethiopicChronology0);
  }
}
