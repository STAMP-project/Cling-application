/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:43:00 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.Weeks;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.years(1969);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P1969Y", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.years(0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.years(0);
      period0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.years(0);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, (ReadableDuration) null, periodType0);
      Days days0 = period0.toStandardDays();
      Weeks weeks0 = days0.toStandardWeeks();
      Hours hours0 = weeks0.toStandardHours();
      boolean boolean0 = mutablePeriod0.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period((ReadableInstant) null, (ReadableDuration) null, periodType0);
      Minutes minutes0 = Minutes.ONE;
      boolean boolean0 = period0.equals(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.hours((-1578));
      Object object0 = new Object();
      boolean boolean0 = period0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1L, 1L);
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 23034375, 23034375, 0);
      Period period0 = Period.years(1969);
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.years(0);
      PeriodType periodType0 = PeriodType.weeks();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period0.minus(period1);
      assertTrue(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1174L), 86400000L);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = mutablePeriod0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, (ReadableInstant) null);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1L, 1L);
      MutablePeriod mutablePeriod1 = mutablePeriod0.toMutablePeriod();
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = new Duration(100000000000000000L);
      Instant instant0 = new Instant();
      Period period0 = duration0.toPeriodTo((ReadableInstant) instant0, (PeriodType) null);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }
}
