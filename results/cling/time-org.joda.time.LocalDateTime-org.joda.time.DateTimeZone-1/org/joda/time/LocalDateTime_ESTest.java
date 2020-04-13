/*

 * Tue Mar 03 18:11:39 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-5717));
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-1949));
      assertEquals("+00:01", dateTimeZone0.getID());
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      localDateTime0.equals(buddhistChronology0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime1 = new LocalDateTime((-2233L), (Chronology) copticChronology0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test003()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-5717));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, fixedDateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((Chronology) zonedChronology0);
      Date date0 = localDateTime1.toDate();
      assertEquals("Tue Mar 03 18:10:50 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+00:01", dateTimeZone1.getID());
      
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) zonedChronology0);
      localDateTime0.plusSeconds(4849);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(100);
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(100);
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("N");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'N' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID(",C?'*xQ{{>&3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ',C?'*xQ{{>&3' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DateTimeZone.forOffsetMillis(318);
      // Undeclared exception!
      try { 
        LocalDateTime.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-102));
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-367200000), (-367200000));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -367200000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1\" is malformed at \"1\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-102));
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(438);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-5717));
      try { 
        DateTimeZone.forOffsetHoursMinutes((-842), (-286));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -286
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.plusWeeks(144);
      assertEquals("+00:01", dateTimeZone0.getID());
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-5717));
      LocalTime localTime0 = localDateTime1.toLocalTime();
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) localTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-102));
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("...");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '...' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(100);
      Instant instant0 = new Instant(1207904L);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) instant0);
      assertEquals(360000000, int0);
      
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+100:00", dateTimeZone0.toString());
      assertEquals("+100:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime0.plusMinutes((-102));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-102), 506, (-367200000), 4593);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 506 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDateTime((DateTimeZone) null);
      // Undeclared exception!
      try { 
        localDateTime0.getField((-1755), (Chronology) ethiopicChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1755
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test020()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      localDateTime0.plusDays(0);
      assertEquals(1583259042839L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1L));
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime0 = new LocalDateTime((-1689L));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-102));
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-102));
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test024()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.set(localDateTime0, (-2705L));
      assertEquals(1584382225323L, long0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-3490));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("<R{/(_2BxUlo|8A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '<R{/(_2BxUlo|8A' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-601L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+stlx~p5^-rNwE5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+stlx~p5^-rNwE5\" is malformed at \"stlx~p5^-rNwE5\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-139L), (Chronology) null);
      // Undeclared exception!
      try { 
        LocalDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-1));
      LocalDateTime.now((Chronology) gJChronology0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = new LocalDateTime((-1590L), (Chronology) null);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-5717));
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals((-5717L), dateTime0.getMillis());
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test032()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.equals("MST");
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583259023119L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-DP|W?!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-DP|W?!\" is malformed at \"DP|W?!\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDateTime((DateTimeZone) null);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1\" is malformed at \"1\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test035()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      assertEquals(1583259021580L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusDays((-21));
      boolean boolean0 = localDateTime0.isBefore(localDateTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(497);
      LocalDateTime localDateTime2 = new LocalDateTime((-601L));
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+00:01", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
      
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) zonedChronology0);
      localDateTime0.plusDays(4849);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test039()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime((DateTimeZone) null);
      assertEquals(1583255397689L, dateTime0.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Sun Jun 24 18:09:57 CEST 2012", date0.toString());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        LocalDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds((-1));
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-1));
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DateTimeZone.forID((String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test043()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusDays(86400000);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.set(localDateTime0, 86400000);
      assertEquals(1584382196112L, long0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTimeZone.forOffsetHours((-102));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-102), 506, (-367200000), 4593);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 506 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test045()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Sun Jun 24 18:09:50 CEST 2012", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-292269054));
      LocalTime.now(dateTimeZone0);
      assertEquals("-81:11:09.054", dateTimeZone0.toString());
      assertEquals("-81:11:09.054", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test046()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(497);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1883840990476L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.equals("MST");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(2179, 1, (-1192), 51);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -1192 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+00:01", dateTimeZone1.getID());
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Hours hours0 = Hours.MIN_VALUE;
      Days days0 = hours0.toStandardDays();
      Duration duration0 = days0.toStandardDuration();
      localDateTime0.equals(duration0);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test049()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = new LocalDateTime(gregorianCalendar0);
      localDateTime0.plusHours(2147483646);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.set(localDateTime0, (-2705L));
      assertEquals("java.util.GregorianCalendar[time=1583258944335,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=9,SECOND=4,MILLISECOND=335,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals(1584382144335L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test050()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258929470,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+00:01\",offset=60000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=9,SECOND=49,MILLISECOND=470,ZONE_OFFSET=60000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-102));
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-DP|W?!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-DP|W?!\" is malformed at \"DP|W?!\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime0.toDateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test053()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = new LocalDateTime(gregorianCalendar0);
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.set(localDateTime0, (-2705L));
      assertEquals("java.util.GregorianCalendar[time=1583258882581,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=8,SECOND=2,MILLISECOND=581,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals(1584382082581L, long0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1\" is malformed at \"1\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.equals("MST");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Instant instant0 = new Instant((-1621L));
      int int0 = dateTimeZone0.getOffset((ReadableInstant) instant0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test056()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      assertEquals(1583258881539L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks(57);
      localDateTime0.isBefore(localDateTime1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test057()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime((DateTimeZone) null);
      assertEquals(1583255280939L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.minusDays(445);
      boolean boolean0 = localDateTime0.isBefore(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateTimeZone.forOffsetHours(1);
      // Undeclared exception!
      try { 
        LocalDateTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.withFields(localDateTime0);
      assertEquals("+00:01", dateTimeZone0.getID());
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test060()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-298L), (DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.withWeekOfWeekyear(3);
      assertNotSame(localDateTime1, localDateTime0);
      
      Date date0 = localDateTime1.toDate();
      assertEquals("Thu Jan 15 00:59:59 CET 1970", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test061()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = new LocalDateTime(gregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.set(localDateTime0, (-2705L));
      assertEquals("java.util.GregorianCalendar[time=1583258824832,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=7,SECOND=4,MILLISECOND=832,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals(1584382024832L, long0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        LocalDateTime.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("GMT+00:01");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'GMT+00:01' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test065()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258823622L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(272);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      MonthDay monthDay0 = new MonthDay((long) 12);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) monthDay0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-1));
      LocalDateTime localDateTime1 = localDateTime0.plusDays((-21));
      boolean boolean0 = localDateTime1.isBefore(localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTimeZone.forOffsetHours(1);
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDateTime((DateTimeZone) null);
      // Undeclared exception!
      try { 
        localDateTime0.plusDays((-125886972));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (EthiopicChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test071()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      localDateTime0.plusWeeks((-1));
      assertEquals(1583258819201L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test072()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:47 CET 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1233);
      assertEquals("+00:00:01.233", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DateTimeZone.forOffsetMillis(67);
      // Undeclared exception!
      try { 
        LocalDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test074()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      assertEquals(1583258806505L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      localDateTime0.plusMinutes(0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test075()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDateTime((DateTimeZone) null);
      TimeZone timeZone0 = TimeZone.getDefault();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258786959,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=6,SECOND=26,MILLISECOND=959,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test076()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) null);
      localDateTime0.plusMinutes(0);
      DateTime dateTime1 = dateTime0.plusWeeks((-1254));
      assertEquals(824839586629L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test077()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-102));
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583252666242L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-102));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-102));
      Instant instant0 = new Instant(1207904L);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) instant0);
      assertEquals((-367200000), int0);
      assertEquals("-102:00", dateTimeZone0.toString());
      
      boolean boolean0 = localDateTime1.equals(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-1));
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(100);
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(24, (Chronology) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 24
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(100);
      Instant instant0 = new Instant(1207904L);
      dateTimeZone0.getOffset((ReadableInstant) instant0);
      Partial partial0 = new Partial(localDateTime0);
      assertEquals(4, partial0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test084()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gJChronology0);
      localDateTime0.plusHours(12);
      assertEquals(1583258782465L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      try { 
        DateTimeZone.forOffsetHoursMinutes(12, (-3393));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -3393
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test087()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDate();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) copticChronology0);
      DateTime dateTime1 = dateTime0.withCenturyOfEra(706);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime1);
      assertEquals(1583258777625L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDateTime((DateTimeZone) null);
      LocalTime localTime0 = localDateTime0.toLocalTime();
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) localTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-704));
      assertEquals("-00:00:00.704", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = new LocalDateTime(gregorianCalendar0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-3490));
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      // Undeclared exception!
      try { 
        localDateTime0.getField((-2147481279), (Chronology) julianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2147481279
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test091()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusSeconds(1268);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) copticChronology0);
      DateTime dateTime1 = dateTime0.withCenturyOfEra(706);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime1);
      assertEquals(1583258756521L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+00:01", dateTimeZone1.getID());
      
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) zonedChronology0);
      localDateTime0.plusHours(4849);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test093()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone.forID((String) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255154476L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test094()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = new LocalDateTime(gregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      localDateTime0.toDateTime();
      assertEquals("java.util.GregorianCalendar[time=1583258722756,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=5,SECOND=22,MILLISECOND=756,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test095()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTimeZone.forOffsetHours(1);
      dateTime0.plusWeeks((-1254));
      assertEquals(1583258720643L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(1583254763374L, (Chronology) gregorianChronology0);
      localDateTime0.toDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1386), (-1386));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1386
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(1, 1920, 2020, 506);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1920 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = new LocalDateTime(gregorianCalendar0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      julianChronology0.set(localDateTime0, (-2705L));
      // Undeclared exception!
      try { 
        localDateTime0.getField((-2147481279), (Chronology) julianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2147481279
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test099()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Sun Jun 24 18:04:02 CEST 2012", date0.toString());
      
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      long long0 = julianChronology0.set(localDateTime0, 1);
      assertEquals(4, localDateTime0.size());
      assertEquals(1341677042986L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      // Undeclared exception!
      try { 
        LocalDateTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1, 1, 2147447857);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime0.size());
  }
}
