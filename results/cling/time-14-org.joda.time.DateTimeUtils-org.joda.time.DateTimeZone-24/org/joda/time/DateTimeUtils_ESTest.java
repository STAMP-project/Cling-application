/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 01:28:33 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateTimeUtils.getInstantChronology(dateMidnight0);
      assertEquals(1566079200000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      long long0 = DateTimeUtils.getInstantMillis(dateTime0);
      assertEquals(1566091707966L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) mutableInterval0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) islamicChronology0);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(397);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      LocalDate localDate0 = new LocalDate((-6L), chronology0);
      LocalDate localDate1 = localDate0.withYear(2807);
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) ethiopicChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfHalfday();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      int[] intArray0 = new int[3];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      boolean boolean0 = DateTimeUtils.isContiguous(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(9223129433408400009L, chronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.withMillisOfSecond(397);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalDate localDate0 = new LocalDate(1566091696143L, dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(1);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      LocalDate localDate0 = new LocalDate((-6L), chronology0);
      LocalDate localDate1 = localDate0.withYear(2807);
      boolean boolean0 = DateTimeUtils.isContiguous(localDate1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.withWeekyear(1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+6xd~_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+6xd~_\" is malformed at \"6xd~_\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.withMillisOfSecond(397);
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn("_UsX~]!z7XR").when(readableInterval0).toString();
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      ReadableInterval readableInterval1 = DateTimeUtils.getReadableInterval(readableInterval0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval1);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-22), (Chronology) islamicChronology0);
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadablePeriod) null);
      DateTimeUtils.getReadableInterval(mutableInterval0);
      assertEquals(1566091704874L, mutableInterval0.getStartMillis());
      assertEquals(1566091704874L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.withWeekyear(1);
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
      DateTimeUtils.OffsetMillisProvider dateTimeUtils_OffsetMillisProvider0 = new DateTimeUtils.OffsetMillisProvider((-6L));
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_OffsetMillisProvider0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      LocalDate localDate0 = new LocalDate((-6L), chronology0);
      LocalDate localDate1 = localDate0.withYear(2807);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      LocalDate localDate1 = localDate0.minusWeeks(60000);
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateTime0);
      LocalDate localDate0 = new LocalDate((long) 1, chronology0);
      localDate0.withYear(3923);
      assertEquals(1566091703312L, dateTime0.getMillis());
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
      
      LocalDate localDate0 = new LocalDate((-6L), chronology0);
      localDate0.withYear(2807);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }
}
