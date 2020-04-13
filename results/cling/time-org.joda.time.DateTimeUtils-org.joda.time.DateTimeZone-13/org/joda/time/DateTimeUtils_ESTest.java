/*

 * Tue Mar 03 17:54:22 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-2524), (-2524), (-2819), (-2524), (-2819), (-2819));
      DateTimeZone.forID("UTC");
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      LocalTime localTime1 = localTime0.plusMillis((-3689));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      localTime0.withFieldAdded(durationFieldType0, (-1444));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("?4)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '?4)' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(43);
      boolean boolean0 = DateTimeUtils.isContiguous(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(43);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) buddhistChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) gregorianChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+,+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+,+\" is malformed at \",+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeUtils.getZone((DateTimeZone) null);
      assertNotNull(dateTimeZone0);
      
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertEquals(1583276400000L, interval0.getEndMillis());
      assertEquals(1583190000000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      localTime0.minusHours((-2146564756));
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(1);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      assertEquals("+02:00", dateTimeZone0.toString());
      
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(5);
      assertEquals("+00:00:00.005", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      localTime0.minusHours(4);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.minusHours(3);
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
      LocalTime.fromMillisOfDay((-1L));
      DateTimeUtils.FixedMillisProvider dateTimeUtils_FixedMillisProvider0 = new DateTimeUtils.FixedMillisProvider((-1L));
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_FixedMillisProvider0);
      assertEquals((-1L), dateTimeUtils_FixedMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(310L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.plusMillis(1);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertEquals(1583258035017L, readableInterval0.getStartMillis());
      assertNotNull(readableInterval0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.plusMillis(1);
      MutableInterval mutableInterval0 = new MutableInterval(1, 1);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(mutableInterval0);
      assertEquals(1L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("GMT");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(4);
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) mutableDateTime0);
      assertEquals(1583258033453L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.plusHours(43);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.withMillisOfDay(4);
      DateTimeUtils.setCurrentMillisOffset(1);
  }
}
