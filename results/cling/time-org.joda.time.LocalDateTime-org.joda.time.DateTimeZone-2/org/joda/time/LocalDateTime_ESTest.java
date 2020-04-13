/*

 * Tue Mar 03 18:08:10 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1826L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = new LocalTime(1819L, (Chronology) islamicChronology0);
      boolean boolean0 = localDateTime0.equals(localTime0);
      assertFalse(boolean0);
      
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withMillis(1819L);
      assertEquals((-3600000L), dateMidnight1.getMillis());
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone.forOffsetHoursMinutes(1, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField((-418), (Chronology) ethiopicChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -418
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-517));
      assertEquals("-00:00:00.517", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusMinutes(3237);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      assertEquals("+03:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1685L));
      LocalDateTime localDateTime1 = localDateTime0.plusDays(28181250);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test005()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, (-2147483648L));
      assertEquals(19300003653219L, long0);
      
      localDateTime0.plusSeconds((-2147483647));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.get((ReadablePartial) localDate0, (-136L));
      try { 
        DateTimeZone.forOffsetHoursMinutes((-64800000), (-64800000));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -64800000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(46);
      assertNotSame(localDateTime1, localDateTime0);
      
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-368L));
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-51L), (Chronology) copticChronology0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      int[] intArray0 = buddhistChronology0.get((ReadablePartial) localDateTime0, (-51L));
      assertArrayEquals(new int[] {2513, 1, 1, 3599949}, intArray0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertEquals(4, localDateTime0.size());
      assertNotSame(localDateTime1, localDateTime0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = new LocalDateTime((-328L), (DateTimeZone) null);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Seconds seconds0 = Seconds.MAX_VALUE;
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      LocalDateTime localDateTime1 = new LocalDateTime((-368L));
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test013()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone.forOffsetMillis(5025);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-Summer");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-Summer\" is malformed at \"Summer\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1687);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("c5md{K3dpKd<pe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'c5md{K3dpKd<pe' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-51L), (Chronology) copticChronology0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.get((ReadablePartial) localDateTime0, 60000L);
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
  public void test017()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime((DateTimeZone) null);
      // Undeclared exception!
      try { 
        localDateTime0.getField(2147483127);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 2147483127
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-2634L));
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
  public void test019()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withMillis(1819L);
      assertEquals((-3600000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(1);
      boolean boolean0 = localDateTime1.isBefore(localDateTime0);
      assertTrue(boolean0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1L));
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(3600000, 719527, 719527, 3600000, 3600000);
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusMinutes(0);
      LocalDate localDate0 = new LocalDate((long) 0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-613L));
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(28265624);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withCenturyOfEra(12);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+6Sn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+6Sn\" is malformed at \"6Sn\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-613L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("6Sn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '6Sn' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-613L));
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
  public void test027()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withCenturyOfEra(0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(32, (-767));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -767
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1826L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = new LocalTime(1819L, (Chronology) islamicChronology0);
      localDateTime0.equals(localTime0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1);
      assertEquals("+00:00:00.001", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1799L, (Chronology) null);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-Summer");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-Summer\" is malformed at \"Summer\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1823);
      assertEquals("+00:00:01.823", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = new LocalDate();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime1, localDateTime0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      int[] intArray0 = buddhistChronology0.get((ReadablePartial) localDate0, (-136L));
      assertArrayEquals(new int[] {2513, 1, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(52);
      LocalDateTime localDateTime2 = new LocalDateTime((-368L));
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(2147483127);
      assertEquals("+596:31:23.127", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test034()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
      
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime(localDateTime0, islamicChronology0);
      Days days0 = Days.days(60000);
      LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
      boolean boolean0 = localDateTime2.isAfter(localDateTime1);
      assertTrue(boolean0);
      
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.plus((ReadablePeriod) days0);
      assertEquals(6767186400000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-51L), (Chronology) copticChronology0);
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
  public void test036()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1799L, (Chronology) null);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      localDateTime0.plusSeconds(4659);
      LocalDateTime localDateTime1 = new LocalDateTime((long) 1, dateTimeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTimeZone.forOffsetMillis(60);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test038()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(0);
      assertEquals((-61530711572000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test039()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(0);
      assertEquals((-61530711572000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(355);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test040()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime((DateTimeZone) null);
      assertEquals(1583258824441L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test041()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone.forOffsetHoursMinutes(0, 9);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255224025L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test042()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583255223796L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test043()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusWeeks(45);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255223509L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test044()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Days days0 = Days.days(60000);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
      
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.plus((ReadablePeriod) days0);
      assertEquals(6767186400000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test045()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(0);
      assertEquals((-61530711572000L), dateMidnight1.getMillis());
      
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+6Sn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+6Sn\" is malformed at \"6Sn\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test047()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(9);
      assertEquals((-33129476372000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test048()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Minutes minutes0 = Minutes.minutes((-2121));
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadablePeriod) minutes0);
      Days days0 = Days.TWO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutablePeriod0.toDurationFrom(mutableDateTime0);
      assertEquals(1583258821045L, mutableDateTime0.getMillis());
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60);
      LocalDateTime localDateTime1 = LocalDateTime.now(dateTimeZone0);
      assertEquals("+00:00:00.060", dateTimeZone0.getID());
      
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      localDateTime0.isSupported(durationFieldType0);
      assertFalse(localDateTime0.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusDays(3060);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-710));
      assertEquals("-00:00:00.710", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test052()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(6, 6);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(7, 32, 7, 6, 32);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test053()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:20 CET 2020", date0.toString());
      
      LocalDateTime localDateTime1 = new LocalDateTime((-2634L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1799L, (Chronology) null);
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(115);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
      
      LocalDateTime localDateTime2 = new LocalDateTime((long) 1, dateTimeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test055()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals(4, localDateTime0.size());
      assertEquals("+05:00", dateTimeZone0.toString());
      assertEquals("Sun Jun 24 23:06:05 CEST 2012", date0.toString());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = new LocalDate();
      DateTimeZone.forOffsetHours(3);
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) localDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
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
  public void test058()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      dateMidnight0.withYear(1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("r8/A:*;aXj{XS@p.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'r8/A:*;aXj{XS@p.' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusHours(0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(60000L, 0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test060()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255164257L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-597));
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-546));
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("-00:00:00.546", dateTimeZone0.getID());
      assertEquals("-00:00:00.546", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test062()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withZoneRetainFields(dateTimeZone0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals(1583193600000L, dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test063()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime1 = new LocalDateTime((-786L), dateTimeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime2 = new LocalDateTime((Chronology) gregorianChronology0);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTimeZone.forOffsetMillis((-546));
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
  public void test065()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusDays(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255162641L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test066()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(0);
      assertEquals((-61530711572000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test067()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 18:05:31 CET 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2147483647));
      assertEquals("-596:31:23.647", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Integer integer0 = new Integer(839);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      try { 
        DateTimeZone.forOffsetHours((int) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTimeZone.forOffsetHours((-357));
      try { 
        DateTimeZone.forOffsetHoursMinutes(32, (-767));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -767
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test070()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(1);
      boolean boolean0 = localDateTime1.isBefore(localDateTime0);
      assertTrue(boolean0);
      
      LocalDate localDate0 = localDateTime1.toLocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(28);
      assertEquals((-61278250772000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test071()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(32);
      localDateTime1.compareTo((ReadablePartial) localDateTime0);
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = Duration.standardHours(775);
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      localDateTime0.toDateTime(dateTime1);
      assertEquals(1586048729728L, dateTime1.getMillis());
      assertEquals(1583258729728L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test072()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, (-2147483648L));
      assertEquals(19300003529334L, long0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test073()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:05:10 CET 2020", date0.toString());
      
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(12);
      assertEquals((-23662369172000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test074()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(5191296L, (Chronology) iSOChronology0);
      dateMidnight0.plusWeeks(2146409369);
      Calendar calendar0 = dateMidnight0.toCalendar((Locale) null);
      LocalDateTime.fromCalendarFields(calendar0);
      assertEquals("java.util.GregorianCalendar[time=-3600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=3600000,DST_OFFSET=0]", calendar0.toString());
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-51L), (Chronology) copticChronology0);
      localDateTime0.toDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(17);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withCenturyOfEra(12);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(12, (-1), (-61));
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+00:01", dateTimeZone0.getID());
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test078()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.toDate();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255031872L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test079()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      DateTime dateTime0 = localDateTime1.toDateTime();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      dateMidnight0.withYear(1);
      assertEquals(1583255031357L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.isSupported((DurationFieldType) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test081()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      localDateTime0.isSupported(durationFieldType0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255030153L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(5025);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+00:00:05.025", dateTimeZone0.toString());
      assertEquals("+00:00:05.025", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(32);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(22);
      assertEquals("+22:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test084()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetHours(22);
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = Duration.standardHours(775);
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      localDateTime0.toDateTime(dateTime1);
      assertEquals(1586048628203L, dateTime1.getMillis());
      assertEquals(1583258628203L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-51L), (Chronology) copticChronology0);
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
  public void test086()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
      
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(28);
      assertEquals((-61278250772000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test087()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(1);
      boolean boolean0 = localDateTime1.isBefore(localDateTime0);
      assertTrue(boolean0);
      
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withMillis(1819L);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals((-3600000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusSeconds(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-517));
      assertEquals("-00:00:00.517", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusSeconds(0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusSeconds(839);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime1 = new LocalDateTime((-2295L), dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        localDateTime0.getField(2147483641, (Chronology) julianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 2147483641
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test092()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusSeconds(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      dateMidnight0.withYear(1);
      assertEquals(1583255022491L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test093()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusSeconds((-18));
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255021449L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test095()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255019825L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test096()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.plusYears(7200000);
      assertEquals(227211637590000000L, dateMidnight1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-357));
      assertEquals("-357:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.plusYears(7200000);
      try { 
        DateTimeZone.forOffsetHoursMinutes(32, (-767));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -767
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test098()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1799L, (Chronology) null);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(400);
      DateTime dateTime0 = DateTime.now();
      localDateTime1.toDateTime(dateTime0);
      assertEquals(1583258617249L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test099()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1826L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = new LocalTime(1819L, (Chronology) islamicChronology0);
      localDateTime0.equals(localTime0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(28);
      assertEquals((-61278250772000L), dateMidnight1.getMillis());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
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
}
