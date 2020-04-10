/*

 * Tue Mar 03 17:54:13 GMT 2020
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
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusYears((-731));
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583258039596L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusMonths(2405);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = copticChronology0.withUTC();
      LocalDateTime.now(chronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusYears(2405);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      DateTimeUtils.getIntervalChronology(readableInterval0);
      LocalDateTime localDateTime0 = new LocalDateTime(1587L);
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(811);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) ethiopicChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusMonths(2405);
      boolean boolean0 = DateTimeUtils.isContiguous(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTime dateTime1 = dateTime0.withZoneRetainFields(dateTimeZone0);
      assertEquals(1583258036080L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+q{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+q{\" is malformed at \"q{\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusYears((-731));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+q{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+q{\" is malformed at \"q{\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate((long) 4172, dateTimeZone1);
      Interval interval0 = localDate0.toInterval();
      assertEquals((-3600000L), interval0.getStartMillis());
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate((long) 4172, dateTimeZone0);
      Interval interval0 = localDate0.toInterval();
      DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertEquals("+18:00", dateTimeZone0.toString());
      assertEquals(82800000L, interval0.getEndMillis());
      assertEquals((-3600000L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDate localDate0 = new LocalDate((long) 4172, dateTimeZone0);
      Interval interval0 = localDate0.toInterval();
      assertEquals("+18:00", dateTimeZone0.toString());
      assertEquals(86400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusMonths(2405);
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
  @Ignore
  public void test15()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withCenturyOfEra(2397);
      DateTimeUtils.SystemMillisProvider dateTimeUtils_SystemMillisProvider0 = new DateTimeUtils.SystemMillisProvider();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_SystemMillisProvider0);
      assertEquals(1583258031428L, dateTimeUtils_SystemMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusYears(2312);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertEquals(1583258030919L, readableInterval0.getStartMillis());
      assertNotNull(readableInterval0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(readableInterval0).toString();
      DateTimeUtils.getReadableInterval(readableInterval0);
      LocalDateTime localDateTime0 = new LocalDateTime(1587L);
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(811);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(82101504L);
      MutableDateTime mutableDateTime0 = dateMidnight0.toMutableDateTime();
      Instant instant0 = new Instant();
      mutableDateTime0.setDate((ReadableInstant) instant0);
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) mutableDateTime0);
      assertEquals(1583190000000L, mutableDateTime0.getMillis());
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withWeekyear(2357);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate.now((Chronology) ethiopicChronology0);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-1904L), (DateTimeZone) null);
      localDate0.toInterval();
      DateTimeUtils.setCurrentMillisOffset((-1904L));
  }
}
