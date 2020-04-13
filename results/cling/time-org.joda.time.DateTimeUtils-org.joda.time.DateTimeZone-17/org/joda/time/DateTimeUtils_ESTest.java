/*

 * Tue Mar 03 17:55:03 GMT 2020
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
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.minusMillis(101);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(101);
      DateTime dateTime0 = localTime0.toDateTimeToday(dateTimeZone0);
      long long0 = DateTimeUtils.getInstantMillis(dateTime0);
      assertEquals(1583261680931L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalDateTime localDateTime0 = new LocalDateTime((-1143L), dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTimeZone.forOffsetMillis(0);
      LocalTime localTime1 = localTime0.plusSeconds(1672);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds((-1079));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1079));
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("-00:00:01.079", dateTimeZone0.toString());
      assertEquals("-00:00:01.079", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.minusMillis(527);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      DateTimeUtils.getIntervalChronology(readableInterval0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      doReturn((String) null).when(dateTimeZone0).toString();
      DateTimeZone dateTimeZone1 = DateTimeUtils.getZone(dateTimeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone1);
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(1516);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.minusMillis(575);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds((-1079));
      boolean boolean0 = DateTimeUtils.isContiguous(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(575);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(575);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(547);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00:00.060");
      assertEquals("+00:00:00.060", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.minusMillis(534);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(575);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1281);
      assertEquals("+00:00:01.281", dateTimeZone0.toString());
      
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+18:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      
      DateTimeUtils.getIntervalChronology(readableInterval0);
      assertEquals(1583258071136L, readableInterval0.getEndMillis());
      assertEquals(1583258071136L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(575);
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
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(559);
      DateTimeUtils.FixedMillisProvider dateTimeUtils_FixedMillisProvider0 = new DateTimeUtils.FixedMillisProvider(559);
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_FixedMillisProvider0);
      assertEquals(559L, dateTimeUtils_FixedMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Days days0 = Days.TWO;
      LocalTime localTime1 = localTime0.minus(days0);
      assertTrue(localTime1.equals((Object)localTime0));
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeUtils.getInstantChronology(dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(575);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      
      DateTimeUtils.getIntervalChronology(readableInterval0);
      assertEquals(1583258067694L, readableInterval0.getStartMillis());
      assertEquals(1583258067694L, readableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(108);
      Duration duration0 = Duration.standardHours(2358751302L);
      Interval interval0 = new Interval(duration0, (ReadableInstant) null);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(interval0);
      assertEquals(1583258066286L, readableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) mutableDateTime0);
      LocalTime.now(chronology0);
      assertEquals(1583258065958L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.plusSeconds(575);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.plusSeconds(1672);
      DateTimeUtils.setCurrentMillisOffset(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.minusMinutes(71);
      DateTimeUtils.setCurrentMillisOffset(14L);
  }
}
