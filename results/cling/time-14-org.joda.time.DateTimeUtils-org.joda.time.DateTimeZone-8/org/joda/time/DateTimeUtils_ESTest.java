/*

 * Tue Mar 03 17:54:06 GMT 2020
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
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583190000000L, interval0.getStartMillis());
      
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583258030866L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone.forID("UTC");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toLocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusWeeks((-25));
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
      localDate0.minusDays((-17));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+dC-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+dC-\" is malformed at \"dC-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(31449600000L);
      localDate0.minusDays(19);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(19);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '+00:00:00.019' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      Partial partial0 = new Partial(gJChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeUtils.isContiguous(partial0);
      LocalDate localDate0 = new LocalDate((-742L));
      LocalDate localDate1 = localDate0.plusYears(1);
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusWeeks((-25));
      boolean boolean0 = DateTimeUtils.isContiguous(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate(117L);
      LocalDate localDate1 = localDate0.minusDays(2615);
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.minusDays(57);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.minusDays(57);
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
  @Ignore
  public void test11()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(4158336L, 4158336L);
      DateTimeUtils.getIntervalChronology((ReadableInterval) mutableInterval0);
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(2487);
      localDate0.withDayOfYear(5);
      assertEquals(3, monthDay0.getMonthOfYear());
      assertEquals(3, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("AmeQrzca/Cicago");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate.now(dateTimeZone0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      DateTimeUtils.getIntervalChronology(readableInterval0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDate localDate0 = new LocalDate((long) 1013, (Chronology) gregorianChronology0);
      LocalDate localDate1 = localDate0.minusWeeks(60);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(31449600000L);
      localDate0.minusDays(17);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      DateTimeUtils.getIntervalChronology((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(31446000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate();
      LocalDate localDate1 = localDate0.plusWeeks(4543);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-3598346L));
      localDate0.minusDays(945);
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
      DateTimeUtils.SystemMillisProvider dateTimeUtils_SystemMillisProvider0 = new DateTimeUtils.SystemMillisProvider();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_SystemMillisProvider0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDate localDate0 = new LocalDate((long) 1013, (Chronology) gregorianChronology0);
      LocalDate localDate1 = localDate0.minusWeeks(60);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2567));
      DateTimeZone.setDefault(dateTimeZone0);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-2567));
      assertEquals("-00:00:02.567", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.minusDays((-17));
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusDays(17);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      assertEquals(1583258017299L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(4158336L, 4158336L);
      DateTimeUtils.getReadableInterval(mutableInterval0);
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(2487);
      localDate0.withDayOfYear(5);
      assertEquals(3, monthDay0.getMonthOfYear());
      assertEquals(3, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.toInterval();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(0L);
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(2487);
      localDate0.withDayOfYear(5);
      assertEquals(3, monthDay0.getDayOfMonth());
      assertEquals(3, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(4158336L);
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(2487);
      localDate0.withDayOfYear(5);
      assertEquals(3, monthDay0.getDayOfMonth());
      assertEquals(3, monthDay0.getMonthOfYear());
  }
}
