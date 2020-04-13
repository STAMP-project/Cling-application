/*

 * Tue Mar 03 18:10:31 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(1928);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1928
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-1428L));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.plusMinutes(0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
      
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 1, 0, 0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(2147481742);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      boolean boolean0 = localDateTime0.equals(gJChronology0);
      assertFalse(boolean0);
      
      LocalDateTime localDateTime1 = new LocalDateTime((-761L), dateTimeZone0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 1, 0, 0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(60);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test007()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(2412);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
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
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(100000000L, (Chronology) gregorianChronology0);
      localDateTime0.plusDays(0);
      LocalDateTime localDateTime1 = new LocalDateTime((-835L), (Chronology) copticChronology0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1428L));
      LocalDateTime localDateTime1 = localDateTime0.plusDays(17);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(100000000L, (Chronology) gregorianChronology0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(12);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Odj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Odj\" is malformed at \"Odj\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(100000000L, (Chronology) gregorianChronology0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
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
  public void test015()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      dateTime0.withHourOfDay(0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("--q#Um?o>SzS>W6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"--q#Um?o>SzS>W6\" is malformed at \"-q#Um?o>SzS>W6\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.DateTimeZone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.DateTimeZone' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test018()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1);
      Locale locale0 = Locale.ITALY;
      Calendar calendar0 = dateMidnight1.toCalendar(locale0);
      LocalDateTime.fromCalendarFields(calendar0);
      assertEquals("java.util.GregorianCalendar[time=-62130327572000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=64,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=40,SECOND=28,MILLISECOND=0,ZONE_OFFSET=3600000,DST_OFFSET=0]", calendar0.toString());
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(100000000L, (Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      LocalDate localDate0 = localDateTime1.toLocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      assertEquals(82800000L, dateTime0.getMillis());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-1L), (Chronology) copticChronology0);
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
  public void test021()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((-1428L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-1L), (Chronology) copticChronology0);
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
  public void test023()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-1297), 24, 25649978, 326565, (-1297));
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      MonthDay monthDay0 = new MonthDay((-591L), (Chronology) gregorianChronology0);
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
  public void test024()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      DateTime dateTime1 = dateTime0.withHourOfDay(0);
      assertEquals((-3540000L), dateTime1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((-761L), dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Yp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Yp' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-1L), (Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+DateTimeZone.setProvider");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+DateTimeZone.setProvider\" is malformed at \"DateTimeZone.setProvider\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-1564), dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(1);
      LocalDateTime localDateTime2 = new LocalDateTime((-1L), (Chronology) copticChronology0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      boolean boolean0 = localDateTime0.isEqual(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test029()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      MonthDay.now((Chronology) copticChronology0);
      DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime1 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.isAfter(localDateTime1);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258876608L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, dateTimeZone0);
      DateTime dateTime0 = new DateTime(0, 1, 1, 0, 1, 1, 1);
      boolean boolean0 = localDateTime0.equals(dateTime0);
      assertFalse(boolean0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals((-62167220310999L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.DateTimeZone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.DateTimeZone' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(1);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-290), (-1864));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1864
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Odj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Odj\" is malformed at \"Odj\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.getID());
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertNotSame(dateTimeZone2, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      LocalDateTime localDateTime2 = new LocalDateTime((-965L));
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      localDateTime0.plusWeeks((-1032));
      LocalDateTime localDateTime1 = new LocalDateTime((-1428L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(53);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(6);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
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
  public void test040()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      DateTime dateTime1 = dateTime0.withHourOfDay(0);
      assertEquals(60000L, dateTime0.getMillis());
      assertEquals((-3540000L), dateTime1.getMillis());
      
      localDateTime0.plusSeconds(0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((-761L), dateTimeZone0);
      LocalDateTime localDateTime2 = localDateTime0.plusSeconds(4);
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test043()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      LocalDateTime localDateTime0 = new LocalDateTime(2280L, (Chronology) gregorianChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Jan 01 01:00:02 CET 1970", date0.toString());
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test044()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(70);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test045()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      Period period0 = new Period(1, 1);
      Period period1 = period0.plusYears(1);
      long long0 = gregorianChronology0.add((ReadablePeriod) period1, (long) 0, 1);
      assertEquals(31536000000L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test047()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258868243L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-1));
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test048()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:07:42 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.equals(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(60);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) 45);
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1575);
      assertEquals((-12465015572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 1, 0, 0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime1 = localDateTime0.withMillisOfSecond(974);
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1L, dateTime0.getMillis());
      
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test054()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(53);
      assertEquals((-60489332372000L), dateMidnight1.getMillis());
      
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test055()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(53);
      assertEquals((-60489332372000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(53);
      boolean boolean0 = localDateTime0.isEqual(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(53);
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
  public void test057()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, dateTimeZone0);
      DateTime dateTime0 = new DateTime(0, 1, 1, 0, 1, 1, 1);
      // Undeclared exception!
      try { 
        localDateTime0.isEqual(monthDay0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test058()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekOfWeekyear();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258825136L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime_Property0.addWrapFieldToCopy(12);
      boolean boolean0 = localDateTime1.isAfter(localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-1));
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test061()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      dateTime0.withHourOfDay(0);
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
  public void test063()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((-761L), dateTimeZone0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:40 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test064()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258779128L, dateTime0.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:19 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(100000000L, (Chronology) gregorianChronology0);
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals(82800000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test066()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(1);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Mar 03 19:05:54 CET 2563", date0.toString());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDate localDate0 = LocalDate.now();
      localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("--q#Um?o>SzS>W6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"--q#Um?o>SzS>W6\" is malformed at \"-q#Um?o>SzS>W6\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(53);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("wq6-h,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'wq6-h,' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test069()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258753628L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test070()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258753240L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(60);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      DateTimeZone.forID("UTC");
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalTime localTime0 = new LocalTime((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.isEqual(localTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(2077L, (Chronology) gregorianChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test074()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((-1L), (Chronology) copticChronology0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Jan 01 01:00:00 CET 1970", date0.toString());
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      // Undeclared exception!
      try { 
        localDateTime0.getField(2000, (Chronology) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 2000
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test076()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(46);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1587229533869L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(100000000L, (Chronology) gregorianChronology0);
      localDateTime0.plusWeeks(0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      assertEquals(82800000L, dateTime0.getMillis());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test078()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1);
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(10080);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1024, (-2147483465));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2147483465
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.secondOfMinute();
      LocalDateTime localDateTime1 = localDateTime_Property0.addWrapFieldToCopy(12);
      boolean boolean0 = localDateTime0.isEqual(localDateTime1);
      assertFalse(boolean0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) 45);
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1575);
      assertEquals((-12465015572000L), dateMidnight1.getMillis());
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test081()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.withYearOfEra(53);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:05:03 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test082()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      LocalDate localDate0 = localDateTime1.toLocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      assertEquals(1583190000000L, dateTime0.getMillis());
      assertSame(localDateTime1, localDateTime0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(12);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) 45);
      dateMidnight0.withYear(1575);
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test084()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      GregorianCalendar gregorianCalendar0 = dateMidnight0.toGregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583190000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      DateMidnight dateMidnight0 = new DateMidnight((long) (-2146409905));
      DateMidnight dateMidnight1 = dateMidnight0.minusMonths((-2146409905));
      assertEquals((-2163600000L), dateMidnight0.getMillis());
      assertEquals(5644512859935600000L, dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test086()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258683559L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(12);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test087()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258660543,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=4,SECOND=20,MILLISECOND=543,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 53);
      localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      assertEquals("+00:53", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forID("UTC");
      assertNotSame(dateTimeZone2, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.setDefault(dateTimeZone1);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test090()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) gregorianChronology0);
      assertEquals(3, monthDay0.getMonthOfYear());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      localDateTime0.isSupported(durationFieldType0);
      LocalDateTime localDateTime1 = new LocalDateTime((-1428L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(60000L, dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      dateTime0.withHourOfDay(0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-1320));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1320
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertNotNull(dateTimeZone1);
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-174));
      assertSame(dateTimeZone0, dateTimeZone1);
      assertNotSame(localDateTime1, localDateTime0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDateTime((DateTimeZone) null);
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
  public void test096()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusSeconds(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258652203L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(111);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertNotSame(localDateTime0, localDateTime1);
      assertEquals(1L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(60, (Chronology) buddhistChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 60
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      localDate0.toDateMidnight();
      try { 
        DateTimeZone.forOffsetHoursMinutes(2000, (-1983455979));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1983455979
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test100()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) gregorianChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Jan 01 01:00:00 CET 1970", date0.toString());
      
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1L, dateTime0.getMillis());
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime.now(dateTimeZone0);
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
  public void test102()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      assertEquals(4, localDateTime0.size());
  }
}
