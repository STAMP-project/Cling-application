/*

 * Tue Mar 03 17:54:20 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 39, dateTimeZone0);
      Duration duration0 = new Duration((ReadableInstant) null, mutableDateTime0);
      assertEquals((-1583258044353L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDate localDate0 = new LocalDate((long) 0, dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:02.780", dateTimeZone0.toString());
      assertEquals("+00:00:02.780", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("tpg;.=; ]o?E`(qwx");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate((long) 45, dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("tpg;.=; ]o?E`(qwx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'tpg;.=; ]o?E`(qwx' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertEquals(86397220L, interval0.getEndMillis());
      assertEquals("+00:00:02.780", dateTimeZone0.getID());
      assertEquals("+00:00:02.780", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2596, "StrictChronology[GJChronology[+00:00:02.780,cutover=1969-12-31T23:00:00.000Z]]");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'StrictChronology[GJChronology[+00:00:02.780,cutover=1969-12-31T23:00:00.000Z]]' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      boolean boolean0 = DateTimeUtils.isContiguous(localDate0);
      assertTrue(boolean0);
      assertEquals("+00:00:02.780", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toLocalDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2780, "GMT+GMT-d\"kr35xVj5GXW");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+GMT-d\"kr35xVj5GXW\" is malformed at \"GMT-d\"kr35xVj5GXW\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(97);
      DateTimeZone.forID((String) null);
      LocalDate localDate0 = new LocalDate((long) 97, dateTimeZone0);
      localDate0.minusWeeks(1);
      assertEquals("+00:00:00.097", dateTimeZone0.toString());
      assertEquals("+00:00:00.097", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusWeeks((-1197));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+3Kp-Ti#?hS$0W,bna+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+3Kp-Ti#?hS$0W,bna+\" is malformed at \"3Kp-Ti#?hS$0W,bna+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean());
      doReturn(0L, 0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      doReturn((String) null, (String) null, (String) null).when(dateTimeZone0).getID();
      doReturn("B5KEUel#To9Z:4uqp]i", (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      DateTimeZone dateTimeZone1 = DateTimeUtils.getZone(dateTimeZone0);
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval0);
      assertNotNull(chronology0);
      
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval(dateTimeZone1);
      assertEquals(0L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      assertEquals("+00:00:02.780", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1172000);
      assertEquals("+00:19:32", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("tpg;.=uD; ]o?E`(qwx");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
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
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      DateTimeUtils.FixedMillisProvider dateTimeUtils_FixedMillisProvider0 = new DateTimeUtils.FixedMillisProvider(0);
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_FixedMillisProvider0);
      assertEquals(0L, dateTimeUtils_FixedMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("tpg;=;b6]q?E`(wx");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate.now(dateTimeZone0);
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate((long) 2780, dateTimeZone0);
      localDate0.minusWeeks(39);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertEquals(1583258027952L, readableInterval0.getStartMillis());
      assertNotNull(readableInterval0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("tpg;=;b6]q?E`(wx");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      Interval interval0 = localDate0.toInterval();
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(interval0);
      assertEquals(1583190000000L, readableInterval0.getStartMillis());
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(39);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateTime0);
      assertEquals(1583258024912L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2780);
      LocalDate localDate0 = new LocalDate((long) 2780, dateTimeZone0);
      localDate0.minusWeeks(2780);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("ttpg;.=;b]oq?E`(qwx");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate.now(dateTimeZone0);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("tpg;=;b6]q?E`(wx");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate.now(dateTimeZone0);
      DateTimeUtils.setCurrentMillisOffset(9223372036854775807L);
  }
}
