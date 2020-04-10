/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:37:02 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
      boolean boolean0 = DateTimeUtils.isContiguous(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setDurationAfterStart((ReadableDuration) null);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      assertEquals(1392409281320L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(mutableInterval0);
      assertSame(mutableInterval0, readableInterval0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Instant instant0 = new Instant();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) instant0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Interval interval0 = new Interval(duration0, (ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(787L);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeUtils.OffsetMillisProvider dateTimeUtils_OffsetMillisProvider0 = new DateTimeUtils.OffsetMillisProvider(1);
      long long0 = dateTimeUtils_OffsetMillisProvider0.getMillis();
      assertEquals(1392409281321L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1391209200000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeUtils.SystemMillisProvider dateTimeUtils_SystemMillisProvider0 = new DateTimeUtils.SystemMillisProvider();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_SystemMillisProvider0);
      assertEquals(1392409281320L, dateTimeUtils_SystemMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DateFormatSymbols dateFormatSymbols0 = DateTimeUtils.getDateFormatSymbols(locale0);
      assertEquals("GyMdkHmsSEDFwWahKzZ", dateFormatSymbols0.getLocalPatternChars());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeUtils dateTimeUtils0 = new DateTimeUtils();
      assertEquals(1392409281320L, dateTimeUtils0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeUtils.setCurrentMillisSystem();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeUtils.setCurrentMillisFixed(0L);
      DateTime dateTime0 = new DateTime();
      assertEquals(0L, dateTime0.getMillis());
  }
}
