/*

 * Tue Mar 03 18:10:25 GMT 2020
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
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Years;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName(770L);
      assertNotNull(string0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      assertEquals("+04:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = localDateTime0.equals(julianChronology0);
      assertFalse(boolean0);
      
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-2737), (Chronology) julianChronology0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName(770L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
      
      Object object0 = new Object();
      boolean boolean0 = localDateTime0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-498));
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(42, (Chronology) islamicChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 42
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName(770L);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(35849);
      LocalTime localTime0 = new LocalTime((-305L), dateTimeZone0);
      assertEquals("+00:00:35.849", dateTimeZone0.toString());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(35849);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test006()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getName(770L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTimeZone.forOffsetMillis(2143755377);
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
  @Ignore
  public void test008()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1);
      assertNotSame(localDateTime1, localDateTime0);
      assertEquals("+591:35:35.849", dateTimeZone0.toString());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      LocalTime localTime0 = new LocalTime((-1L), dateTimeZone0);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test010()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      localDateTime0.plusHours(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2178));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      long long0 = islamicChronology0.set(localDateTime0, 336L);
      assertEquals(17763843602178L, long0);
      assertEquals("-00:00:02.178", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours((-1754));
      LocalDateTime localDateTime1 = new LocalDateTime((-1024L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test012()  throws Throwable  {
      DateTimeZone.forID("UTC");
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(ethiopicChronology0);
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) strictChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.withYear(83);
      assertEquals((-59291482772000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.withYear(2);
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
  public void test014()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime.now((Chronology) ethiopicChronology0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(10800000L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime localDateTime1 = new LocalDateTime((-2307L), dateTimeZone1);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((long) 1, (Chronology) ethiopicChronology0);
      Duration duration0 = new Duration(84L);
      dateMidnight0.withDurationAdded((ReadableDuration) duration0, 1);
      LocalTime localTime0 = new LocalTime((-1L), dateTimeZone0);
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
  public void test017()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(690562356);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      assertEquals("+04:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTimeZone.forOffsetHours(1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-<I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-<I\" is malformed at \"<I\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DateTimeZone.forOffsetMillis(2129735849);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '4' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test020()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(800);
      assertEquals((-36916301972000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(2145121179);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(1583262005061L, 1084L);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        localDateTime0.getField((-2147483647), (Chronology) islamicChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2147483647
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName(770L);
      assertEquals("+00:00", string0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(690562356);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(45);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1024L));
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
  public void test025()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(35849, (-1275), (-1), 10000, 13, 2);
      DateMidnight dateMidnight0 = new DateMidnight((-555L));
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(10800000L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime localDateTime1 = new LocalDateTime((-2307L), dateTimeZone1);
      LocalDateTime localDateTime2 = localDateTime0.plusMinutes(511);
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((-555L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("[NhAFK?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '[NhAFK?' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-2307L), dateTimeZone0);
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) gJChronology0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(1583262005061L, 1084L);
      LocalDateTime localDateTime1 = localDateTime0.minusDays(1389);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
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
  public void test032()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime0.equals(julianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(1583262005061L, 1084L);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getName(770L);
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(10800000L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("SST");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'SST' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1970, periodType0);
      ethiopicChronology0.get((ReadablePeriod) mutablePeriod0, (long) 15377, (long) 1970);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Wsm5rX#qF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Wsm5rX#qF\" is malformed at \"Wsm5rX#qF\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Object object0 = new Object();
      localDateTime0.equals(object0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      assertEquals("+04:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateMidnight.now((Chronology) ethiopicChronology0);
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
  public void test038()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-<I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-<I\" is malformed at \"<I\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      assertEquals("+591:35:35.849", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(278);
      assertEquals("+278:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName(770L);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      localDateTime0.indexOf(dateTimeFieldType0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      localDateTime0.plusWeeks(2129735849);
      LocalDateTime localDateTime1 = new LocalDateTime((-363L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test042()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime0.toDate();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1583262005061L, 1084L);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1934L, 1478998769431L);
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
  public void test044()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(35849);
      LocalTime localTime0 = new LocalTime((-305L), dateTimeZone0);
      assertEquals("+00:00:35.849", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(3938);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DateTimeZone.forOffsetMillis(2129735849);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test046()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.plusDays(839);
      assertEquals("+591:35:35.849", dateTimeZone0.toString());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test047()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      DateTimeZone.forOffsetHours(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258929929L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test048()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-422));
      assertEquals("-00:00:00.422", dateTimeZone0.toString());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Wed Feb 19 19:08:24 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test049()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      localDateTime0.plusWeeks(2129735849);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255304010L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      fixedDateTimeZone0.getName(770L);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(511);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test051()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      Years years0 = Years.THREE;
      localDateTime0.isSupported((DurationFieldType) null);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.minus((ReadablePeriod) years0);
      assertEquals(1488495600000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(1934L, 1478998769431L);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("SST");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'SST' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Wsm5rX#qF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Wsm5rX#qF\" is malformed at \"Wsm5rX#qF\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test056()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1112);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear((-4038));
      assertEquals((-189588903572000L), dateMidnight1.getMillis());
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test057()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(10800000L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258899961L, dateTime0.getMillis());
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test058()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 18:08:00 CET 2020", date0.toString());
      
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      localDateTime0.plusDays(0);
      assertNotSame(fixedDateTimeZone0, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTimeZone.forOffsetHours((-154));
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
  @Ignore
  public void test061()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      DateMidnight dateMidnight0 = new DateMidnight(10800000L);
      GregorianCalendar gregorianCalendar0 = dateMidnight0.toGregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=-3600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
      
      localDateTime0.plusMinutes(511);
      assertNotSame(fixedDateTimeZone0, dateTimeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test063()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((-363L));
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 18:07:12 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test064()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime0.equals(julianChronology0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear((-4038));
      assertEquals((-189588903572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone.forOffsetMillis(2129735849);
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((-2307L), dateTimeZone0);
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
  public void test068()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime0.plusHours(1112);
      MutablePeriod mutablePeriod0 = new MutablePeriod(1583262005061L, 1084L);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test069()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(278);
      assertEquals("+278:00", dateTimeZone0.toString());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.withYear((-3313));
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (DateTimeZone) null);
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
  public void test072()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(35848);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:35.848", dateTimeZone0.getID());
      assertEquals("+00:00:35.848", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName(770L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(2129735849);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusDays(35849);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(35849);
      LocalTime localTime0 = new LocalTime((-305L), dateTimeZone0);
      assertEquals("+00:00:35.849", dateTimeZone0.getID());
      
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
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
  public void test077()  throws Throwable  {
      DateTimeZone.forOffsetMillis(35849);
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
  public void test078()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.withYear((-4038));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        localDateTime0.getField((-2147483647), (Chronology) islamicChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2147483647
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.plusDays(839);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-95787896347251L), 1340564452672L);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test080()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(1);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(13);
      assertEquals((-61751636372000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTimeZone.forOffsetMillis(2129735849);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-21), (-176));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -176
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test082()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName(770L);
      assertEquals("+00:00", string0);
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 18:06:28 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test083()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear((-4038));
      assertEquals((-189588903572000L), dateMidnight1.getMillis());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.minusDays(1389);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test084()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("+591:35:35.849", dateTimeZone0.toString());
      assertEquals("Sat Mar 28 09:41:49 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTimeZone.forOffsetMillis(2129735849);
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
  public void test086()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.toDateTime();
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
  public void test087()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(240, (-1));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test088()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255152557L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(47);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test089()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258734523,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=5,SECOND=34,MILLISECOND=523,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(240);
      assertEquals((-54588212372000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName(770L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(690562356);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      localDateTime0.plusMinutes(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      localDateTime0.isSupported((DurationFieldType) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-422));
      assertEquals("-00:00:00.422", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test093()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(2);
      assertEquals((-62098791572000L), dateMidnight1.getMillis());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test094()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-2178));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone1);
      long long0 = islamicChronology0.set(localDateTime0, 336L);
      assertEquals(17763843602178L, long0);
      assertEquals("-00:00:02.178", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(76);
      assertEquals("+00:00:00.076", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      assertEquals("+591:35:35.849", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-359));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      LocalDateTime.now();
      try { 
        DateTimeZone.forOffsetHoursMinutes(968, (-52));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -52
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.toDate();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-95787896347251L), 1340564452672L);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((long) 1, (Chronology) ethiopicChronology0);
      Duration duration0 = new Duration(84L);
      Period period0 = duration0.toPeriod();
      Period period1 = period0.withDays((-2204));
      dateMidnight0.minus((ReadablePeriod) period1);
      LocalTime localTime0 = new LocalTime((-1L), dateTimeZone0);
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
  public void test100()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime2 = new LocalDateTime((Chronology) ethiopicChronology0);
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.plusSeconds(1);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-95787896347251L), 1340564452672L);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTimeZone.forOffsetHours(278);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-95787896347251L), 1340564452672L);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(2629746000L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone1);
      DateMidnight dateMidnight1 = dateMidnight0.withFields(localDateTime0);
      assertEquals(2592000000L, dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = new LocalDateTime((-1280L));
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test105()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2129735849);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.withFields(localDateTime0);
      assertEquals("+591:35:35.849", dateTimeZone0.getID());
      assertEquals(4, localDateTime1.size());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test106()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Wed Feb 19 19:04:34 CET 2020", date0.toString());
      assertEquals(4, localDateTime0.size());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.withYear((-4038));
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test107()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258646252,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=4,SECOND=6,MILLISECOND=252,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }
}
