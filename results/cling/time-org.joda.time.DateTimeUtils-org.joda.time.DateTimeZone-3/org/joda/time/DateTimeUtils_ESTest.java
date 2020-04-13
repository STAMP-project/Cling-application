/*

 * Tue Mar 03 17:53:22 GMT 2020
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
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      LocalTime.fromMillisOfDay(21L);
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583257990370L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime.fromMillisOfDay(40L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone.forOffsetMillis(0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 6);
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
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Europe/Amsterdam").when(dateTimeZone0).getID();
      doReturn(1583257971968L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      DateTimeZone.setDefault(dateTimeZone1);
      LocalTime localTime1 = localTime0.withLocalMillis(1L);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 2147483634);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("C*,4\"Pp >");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'C*,4\"Pp >' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn("'").when(readableInterval0).toString();
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      ReadableInterval readableInterval1 = DateTimeUtils.getReadableInterval(readableInterval0);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      localTime0.minusMinutes(32);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval1);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 2147483634);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 2147483625);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 2147483634);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime.fromMillisOfDay(3394L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+fmh<Cx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+fmh<Cx\" is malformed at \"fmh<Cx\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 2147483634);
      boolean boolean0 = DateTimeUtils.isContiguous(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 31);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 2147483634);
      MutableInterval mutableInterval0 = new MutableInterval();
      Interval interval0 = mutableInterval0.toInterval();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(31, 31);
      DateTimeZone.forOffsetMillis(6);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 6);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 2147483619);
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
      LocalTime.fromMillisOfDay((long) 2147483634);
      DateTimeUtils.FixedMillisProvider dateTimeUtils_FixedMillisProvider0 = new DateTimeUtils.FixedMillisProvider(2147483634);
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_FixedMillisProvider0);
      assertEquals(2147483634L, dateTimeUtils_FixedMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Europe/Amsterdam").when(dateTimeZone0).getID();
      doReturn(1583257971978L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      localTime0.withMillisOfDay(0);
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 2147483625);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      assertEquals(1583257983641L, readableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Europe/Amsterdam").when(dateTimeZone0).getID();
      doReturn(1583257971978L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      localTime0.withMillisOfDay(0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, dateTimeZone1);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) mutableDateTime0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime.fromMillisOfDay(0L);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime.fromMillisOfDay(21L);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Europe/Amsterdam").when(dateTimeZone0).getID();
      doReturn(1583257971978L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      localTime0.withMillisOfDay(0);
      DateTimeUtils.setCurrentMillisOffset(1172000);
  }
}
