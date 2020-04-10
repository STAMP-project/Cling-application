/*

 * Tue Mar 03 17:55:07 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.withMillisOfDay(585);
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583258087749L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      LocalTime localTime0 = new LocalTime((Object) null);
      LocalTime localTime1 = localTime0.withHourOfDay(0);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      doReturn("Czwk", "s_ r3_#.+sU 95").when(dateTimeZone0).toString();
      DateTimeZone dateTimeZone1 = DateTimeUtils.getZone(dateTimeZone0);
      DateTimeZone.setDefault(dateTimeZone1);
      LocalDateTime localDateTime0 = new LocalDateTime(2560L);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(690);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 2, 5, 3);
      localTime0.plusHours(80);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+GMT-Ww;f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+GMT-Ww;f\" is malformed at \"GMT-Ww;f\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.minusMinutes(584);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfDay();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      Partial partial0 = new Partial(ethiopicChronology0, dateTimeFieldTypeArray0, (int[]) null);
      boolean boolean0 = DateTimeUtils.isContiguous(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 2, 5, 3);
      LocalTime localTime1 = localTime0.minusMinutes(60000);
      Months months0 = Months.monthsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime1);
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 2, 5, 3);
      localTime0.minusMinutes(60000);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(1133L);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(690);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(2103L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertEquals(82800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      localTime0.plusMillis(1);
      assertEquals("+01:01", dateTimeZone0.toString());
      
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      localTime0.withMillisOfDay(1);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      localTime0.withMillisOfDay(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertNotNull(dateTimeZone1);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(readableInterval0).toString();
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      ReadableInterval readableInterval1 = DateTimeUtils.getReadableInterval(readableInterval0);
      DateTimeUtils.getIntervalChronology(readableInterval1);
      LocalDateTime localDateTime0 = new LocalDateTime(1133L);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(690);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((Object) null);
      localTime0.withHourOfDay(0);
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
  public void test15()  throws Throwable  {
      DateTimeUtils.FixedMillisProvider dateTimeUtils_FixedMillisProvider0 = new DateTimeUtils.FixedMillisProvider((-430L));
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_FixedMillisProvider0);
      LocalDateTime localDateTime0 = new LocalDateTime(2560L);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(690);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.withMillisOfDay(585);
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusHours(86400);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      assertEquals(1583258073327L, readableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight((long) 292272708, (DateTimeZone) fixedDateTimeZone0);
      dateMidnight0.toLocalDate();
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateMidnight0);
      assertEquals(259200000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusHours(603);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(0L);
      LocalDateTime localDateTime0 = new LocalDateTime(2560L);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(690);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusHours(603);
      DateTimeUtils.setCurrentMillisOffset(603);
  }
}
