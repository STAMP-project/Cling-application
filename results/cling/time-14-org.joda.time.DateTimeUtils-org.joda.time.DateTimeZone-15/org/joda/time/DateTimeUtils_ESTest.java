/*

 * Tue Mar 03 17:54:54 GMT 2020
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
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583258072099L, long0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      DateTime dateTime0 = DateTime.now((Chronology) copticChronology0);
      long long0 = DateTimeUtils.getInstantMillis(dateTime0);
      assertEquals(1583258072054L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(2158);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("<f%q^th(R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '<f%q^th(R' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.minusMillis(7199980);
      DateMidnight dateMidnight0 = new DateMidnight();
      Interval interval0 = dateMidnight0.toInterval();
      DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertEquals(1583276400000L, interval0.getEndMillis());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(2158);
      boolean boolean0 = DateTimeUtils.isContiguous(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(2158);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.minusMillis(86400000);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(2158);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.minusMillis(20);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+a^~-sGNJ6:e]CKE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+a^~-sGNJ6:e]CKE\" is malformed at \"a^~-sGNJ6:e]CKE\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(1493);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(11, 11);
      assertEquals("+11:11", dateTimeZone0.getID());
      
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(11);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(11);
      assertEquals("+00:00:00.011", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval0);
      assertNotNull(chronology0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(1493);
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
  public void test14()  throws Throwable  {
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeUtils.getInstantChronology((ReadableInstant) null);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(4, 4, 4);
      localTime0.plusMillis(4);
      DateTime dateTime0 = new DateTime();
      DateTimeUtils.getInstantChronology(dateTime0);
      assertEquals(1583258061917L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(1542);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      assertEquals(1583258061175L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(readableInterval0).toString();
      DateTimeUtils.getReadableInterval(readableInterval0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      DateTime dateTime0 = DateTime.now((Chronology) copticChronology0);
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateTime0);
      assertEquals(1583258059803L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(1493);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(0);
      DateTimeUtils.setCurrentMillisOffset(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(45);
      DateTimeUtils.setCurrentMillisOffset(45);
  }
}
