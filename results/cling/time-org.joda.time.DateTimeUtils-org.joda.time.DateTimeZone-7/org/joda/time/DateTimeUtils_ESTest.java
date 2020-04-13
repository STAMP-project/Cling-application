/*

 * Tue Mar 03 17:53:51 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583258018340L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      LocalTime.fromMillisOfDay(1000L);
      DateMidnight dateMidnight0 = new DateMidnight();
      long long0 = DateTimeUtils.getInstantMillis(dateMidnight0);
      assertEquals(1583190000000L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime.fromMillisOfDay(1073741823L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime.fromMillisOfDay(1L);
      DateTimeUtils.setCurrentMillisFixed(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime.fromMillisOfDay(432L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime.fromMillisOfDay(3103L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'X' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime.fromMillisOfDay(1073741856L);
      MutableInterval mutableInterval0 = new MutableInterval();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) mutableInterval0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      LocalTime.fromMillisOfDay((-5096L));
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime.fromMillisOfDay((-3660000L));
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime.fromMillisOfDay((-1232L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1581L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime.fromMillisOfDay((-1232L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+'\" is malformed at \"'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeUtils.SystemMillisProvider dateTimeUtils_SystemMillisProvider0 = new DateTimeUtils.SystemMillisProvider();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_SystemMillisProvider0);
      assertEquals(1583258012418L, dateTimeUtils_SystemMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("(sDGA@3K)lW`}<Sxvj").when(dateTimeZone0).getID();
      doReturn((-481L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      doReturn("(sDGA@3K)lW`}<Sxvj").when(dateTimeZone0).toString();
      DateTimeZone dateTimeZone1 = DateTimeUtils.getZone(dateTimeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone1);
      DateTimeUtils.isContiguous(localDateTime0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(592);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime.fromMillisOfDay((-6L));
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("(sDGA@3K)lW`}<Sxvj").when(dateTimeZone0).getID();
      doReturn((-481L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      doReturn("(sDGA@3K)lW`}<Sxvj").when(dateTimeZone0).toString();
      DateTimeZone dateTimeZone1 = DateTimeUtils.getZone(dateTimeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone1);
      localDateTime0.plusMinutes(592);
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn("jiKrN}j").when(readableInterval0).toString();
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      ReadableInterval readableInterval1 = DateTimeUtils.getReadableInterval(readableInterval0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval1);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      LocalTime.fromMillisOfDay(1L);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(2147483077);
      assertEquals("+596:31:23.077", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime.now((DateTimeZone) fixedDateTimeZone0);
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeUtils.getInstantChronology(dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      LocalTime.fromMillisOfDay(1073741856L);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      assertEquals(1583258009491L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateTime0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }
}
