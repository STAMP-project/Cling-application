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
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583258019542L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      assertEquals(1583280000000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      DateTimeUtils.getIntervalChronology(readableInterval0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(645L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583190000000L, interval0.getStartMillis());
      
      boolean boolean0 = DateTimeUtils.isContiguous(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      assertEquals(1583344800000L, interval0.getEndMillis());
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) ethiopicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone.forID("+00:00:00.001");
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks(366);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) ethiopicChronology0);
      localDateTime0.plusHours(1);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone1.getID());
      
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      assertEquals(1583193599999L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("6e^6 s1ll#$]DW[M");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, (int[]) null);
      boolean boolean0 = DateTimeUtils.isContiguous(partial0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertFalse(boolean0);
      assertEquals(1583280000000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeUtils.getReadableInterval((ReadableInterval) null);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime(3600000L, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.toInterval();
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
      DateTimeUtils.FixedMillisProvider dateTimeUtils_FixedMillisProvider0 = new DateTimeUtils.FixedMillisProvider((-1650L));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_FixedMillisProvider0);
      LocalDateTime localDateTime0 = new LocalDateTime(3600000L, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("6e^6 s1ll#$]DW[M");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      Interval interval0 = localDate0.toInterval();
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(interval0);
      assertEquals(1583276400000L, readableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      LocalTime localTime0 = new LocalTime(chronology0);
      DateTime dateTime0 = localDate0.toDateTime(localTime0);
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateTime0);
      assertEquals(1583258007007L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("6e^6 s1ll#$]DW[M");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate();
      localDate0.toInterval(dateTimeZone0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeUtils.setCurrentMillisOffset(0L);
      LocalDate localDate0 = new LocalDate((-1257L), (DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset((-4985L));
      TimeZone timeZone0 = TimeZone.getTimeZone("6e^6 s1ll#$]DW[M");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      assertEquals(1583280000000L, interval0.getEndMillis());
  }
}
