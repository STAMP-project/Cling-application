/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:33:24 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, intArray0);
      boolean boolean0 = DateTimeUtils.isContiguous(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      boolean boolean0 = DateTimeUtils.isContiguous(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeUtils.isContiguous((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setDurationBeforeEnd((ReadableDuration) null);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Period period0 = mutableInterval0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = mutableInterval0.toPeriod(periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1391209200000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertEquals(1392409281320L, readableInterval0.getStartMillis());
      assertNotNull(readableInterval0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(mutableInterval0);
      assertSame(readableInterval0, mutableInterval0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) mutableInterval0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateMidnight0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      boolean boolean0 = mutableDateTime0.isBefore((ReadableInstant) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = new Duration(138L);
      DateMidnight dateMidnight0 = new DateMidnight(138L);
      Interval interval0 = new Interval(duration0, dateMidnight0);
      assertEquals((-3600138L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeUtils.setCurrentMillisProvider((DateTimeUtils.MillisProvider) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The MillisProvider must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeUtils.OffsetMillisProvider dateTimeUtils_OffsetMillisProvider0 = new DateTimeUtils.OffsetMillisProvider((-2046L));
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_OffsetMillisProvider0);
      assertEquals(1392409279274L, dateTimeUtils_OffsetMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(1286L);
      long long0 = DateTimeUtils.currentTimeMillis();
      assertEquals(1392409282606L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeUtils.SystemMillisProvider dateTimeUtils_SystemMillisProvider0 = new DateTimeUtils.SystemMillisProvider();
      long long0 = dateTimeUtils_SystemMillisProvider0.getMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      String string0 = dateTimeZone0.getShortName((-1272L), locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeUtils dateTimeUtils0 = new DateTimeUtils();
      assertEquals(1392409281320L, dateTimeUtils0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeUtils.setCurrentMillisSystem();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeUtils.setCurrentMillisFixed(604800021L);
      YearMonth yearMonth0 = new YearMonth();
      assertEquals(1970, yearMonth0.getYear());
  }
}
