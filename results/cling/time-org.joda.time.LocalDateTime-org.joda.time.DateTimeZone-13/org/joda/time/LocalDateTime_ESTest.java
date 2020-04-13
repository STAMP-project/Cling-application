/*

 * Tue Mar 03 18:08:56 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks((-439));
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 5, true);
      assertEquals((-17999995L), long0);
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 5
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-690L), dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      assertNotSame(localDateTime1, localDateTime0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+05:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1501L));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      boolean boolean0 = localDateTime0.equals(julianChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+05:00", dateTimeZone1.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds((-2007));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = localDateTime0.plusMillis(3317);
      localDateTime1.isEqual(localDateTime0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1501L));
      LocalDateTime localDateTime1 = localDateTime0.plusDays((-262));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone.forOffsetHours(5);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+ > ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+ > \" is malformed at \" > \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
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
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      dateTimeZone0.convertLocalToUTC((long) 5, true);
      // Undeclared exception!
      try { 
        localDateTime0.getFieldType(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 4
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      localDateTime0.plusMinutes(3317);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 5, true);
      assertEquals((-17999995L), long0);
      assertEquals("+05:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(5, 5, 5, 5, 5);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(1175);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-439), dateTimeZone0);
      LocalDateTime localDateTime2 = localDateTime0.plusHours(884);
      assertEquals("+05:00", dateTimeZone0.toString());
      assertFalse(localDateTime0.equals((Object)localDateTime1));
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Chronology) null);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      dateMidnight0.withWeekyear(3);
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
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-551));
      LocalDateTime localDateTime1 = new LocalDateTime(0L, dateTimeZone0);
      assertEquals("-551:00", dateTimeZone0.toString());
      assertEquals("-551:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusMonths((-292269056));
      boolean boolean0 = localDateTime0.isEqual(localDateTime1);
      assertFalse(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 5, true);
      assertEquals((-17999995L), long0);
      assertEquals("+05:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test18()  throws Throwable  {
      DateTimeZone.forOffsetHours(5);
      // Undeclared exception!
      try { 
        DateTimeZone.forID(" >k ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ' >k ' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      long long0 = dateTimeZone1.convertLocalToUTC(239L, false);
      assertEquals(239L, long0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(836);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-789L));
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
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-789L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime1 = LocalDateTime.now(dateTimeZone0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-57));
      assertNotSame(localDateTime1, localDateTime0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(461L, false);
      assertEquals((-3599539L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-1438L));
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
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-789L));
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258866608,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=7,SECOND=46,MILLISECOND=608,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-789L));
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-290L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.chrono.IslamicChronology$LeapYearPatternType");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.chrono.IslamicChronology$LeapYearPatternType' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583273265389L, dateTime0.getMillis());
      
      localDateTime0.equals((Object) null);
      assertEquals("+05:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      boolean boolean0 = localDateTime0.equals(dateTimeZone1);
      assertEquals("+05:00", dateTimeZone0.getID());
      assertEquals("+05:00", dateTimeZone1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      String string0 = localDateTime0.toString();
      assertEquals("1970-01-01T05:00:00.005", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 5, true);
      assertEquals((-17999995L), long0);
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      long long0 = dateTimeZone1.convertLocalToUTC(239L, false);
      assertEquals(239L, long0);
      
      MonthDay monthDay0 = new MonthDay((long) 287);
      boolean boolean0 = localDateTime0.equals(monthDay0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime.now((Chronology) ethiopicChronology0);
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
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      LocalDateTime localDateTime1 = localDateTime0.withField(dateTimeFieldType0, 2);
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((-456L), false);
      assertEquals("+00:00:00.002", dateTimeZone0.toString());
      assertEquals((-458L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-551));
      LocalDateTime localDateTime1 = new LocalDateTime((long) 1, dateTimeZone0);
      assertEquals("-00:00:00.551", dateTimeZone0.getID());
      
      LocalDateTime localDateTime2 = localDateTime0.plusWeeks((-2302));
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime.now(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) buddhistChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      // Undeclared exception!
      try { 
        dateMidnight0.withWeekyear((-894));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000+00:19:32 (BuddhistChronology[Europe/Amsterdam])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(5, 5, 5, 5, 5);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(4);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-439), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(491);
      assertNotSame(localDateTime1, localDateTime0);
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+05:00", dateTimeZone0.toString());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:07:23 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
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
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(89, 89, 59, (-2007), 1);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, (Chronology) null);
      LocalDate localDate0 = new LocalDate((Chronology) null);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      dateMidnight0.withWeekyear(3);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+ > ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+ > \" is malformed at \" > \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        localDateTime0.isEqual(yearMonth0);
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
  public void test44()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = new DateTime(1, 5, 1, 5, 5, 5);
      DateTime dateTime1 = localDateTime0.toDateTime(dateTime0);
      assertEquals(1340554024588L, dateTime1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(2951);
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, (Chronology) null);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfSecond();
      LocalDateTime localDateTime1 = localDateTime_Property0.addWrapFieldToCopy(3);
      LocalDateTime localDateTime2 = localDateTime0.plusHours(0);
      assertNotSame(localDateTime2, localDateTime1);
      assertSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks((-439));
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
      
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(14400005L, dateTime0.getMillis());
      assertEquals("+05:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      dateTimeZone0.convertLocalToUTC((long) 0, false);
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-827));
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      LocalDateTime.now(dateTimeZone1);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+05:00", dateTimeZone0.toString());
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      Date date0 = localDateTime0.toDate();
      assertEquals("Sat Jan 01 01:01:01 CET 1", date0.toString());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 4760, true);
      assertEquals((-3595240L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, (Chronology) null);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:09 CET 2020", date0.toString());
      
      LocalDateTime localDateTime1 = new LocalDateTime((-2645L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks((-439));
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
      
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-439), dateTimeZone0);
      assertEquals("+05:00", dateTimeZone0.toString());
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, (Chronology) null);
      localDateTime0.toDate();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583258744159L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        localDateTime0.isEqual(yearMonth0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Chronology) null);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      dateMidnight0.withWeekyear(3);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Instant must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Instant must not be null' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test55()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.plusHours((-2940));
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258742460L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      long long0 = dateTimeZone0.convertLocalToUTC(2494L, false);
      assertEquals((-17997506L), long0);
      assertEquals("+05:00", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Chronology) null);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear(3);
      assertEquals((-62067169172000L), dateMidnight1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusYears(5);
      localDateTime1.isEqual(localDateTime0);
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-439), dateTimeZone0);
      assertEquals("+05:00", dateTimeZone0.toString());
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime2 = localDateTime0.minusMillis((-283));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-551));
      boolean boolean0 = localDateTime1.isAfter(localDateTime2);
      assertFalse(boolean0);
      
      LocalDateTime localDateTime3 = new LocalDateTime((long) 1, dateTimeZone0);
      assertFalse(localDateTime3.equals((Object)localDateTime0));
      assertEquals("-00:00:00.551", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LocalDateTime.now();
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
  public void test63()  throws Throwable  {
      DateTimeZone.forOffsetHours(5);
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
  public void test64()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, (Chronology) null);
      LocalDate localDate0 = new LocalDate((Chronology) null);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      dateMidnight0.withWeekyear(3);
      // Undeclared exception!
      try { 
        localDateTime0.getFieldType(10800000);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 10800000
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test65()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583273137570L, dateTime0.getMillis());
      
      localDateTime0.plusDays(24);
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test66()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-299));
      assertNotSame(localDateTime1, localDateTime0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear((-815));
      assertEquals((-87880637972000L), dateMidnight1.getMillis());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test67()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, (Chronology) null);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:05:28 CET 2020", date0.toString());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) buddhistChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear(3);
      assertEquals((-79202967572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test68()  throws Throwable  {
      DateTime dateTime0 = new DateTime(63158400000L);
      Days days0 = Days.FOUR;
      Duration duration0 = days0.toStandardDuration();
      Period period0 = new Period(dateTime0, duration0);
      TimeZone timeZone0 = TimeZone.getTimeZone("P4D");
      Locale locale0 = Locale.forLanguageTag("America/Sao_Paulo");
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258720033,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=5,SECOND=20,MILLISECOND=33,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test69()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, (Chronology) null);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(3);
      assertNotSame(localDateTime1, localDateTime0);
      
      LocalDate localDate0 = new LocalDate((Chronology) null);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear(3);
      assertEquals((-62067169172000L), dateMidnight1.getMillis());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = new DateTime(1, 5, 1, 5, 5, 5);
      localDateTime0.toDateTime(dateTime0);
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
  public void test71()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = new DateTime(1, 5, 1, 5, 5, 5);
      DateTime dateTime1 = localDateTime0.toDateTime(dateTime0);
      assertEquals(1340553899341L, dateTime1.getMillis());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Calendar calendar0 = dateMidnight0.toCalendar(locale0);
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(calendar0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      assertEquals("+05:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(31557600010L);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 295);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 295
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      dateTimeZone0.convertLocalToUTC((long) 0, false);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(2016);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(3317);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(31557600010L);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-229));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -229
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1));
      LocalDateTime.now(dateTimeZone0);
      DateTime dateTime0 = new DateTime(63158400000L);
      Days days0 = Days.FOUR;
      Duration duration0 = days0.toStandardDuration();
      Period period0 = new Period(dateTime0, duration0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test79()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583273077879L, dateTime0.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Sun Jun 24 23:04:37 CEST 2012", date0.toString());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 5, dateTimeZone0);
      localDateTime0.plusSeconds(0);
      assertEquals("+05:00", dateTimeZone0.toString());
      assertEquals("+05:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-789L));
      // Undeclared exception!
      try { 
        localDateTime0.getField(1952257861, (Chronology) gregorianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1952257861
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test82()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.plusSeconds(1);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258675993L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
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
  public void test84()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 5);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      Date date0 = localDateTime0.toDate();
      assertEquals("+05:00", dateTimeZone0.toString());
      assertEquals("Sun Jun 24 23:04:17 CEST 2012", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test85()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583258656664L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test86()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone1);
      assertEquals(1583255049280L, dateTime0.getMillis());
  }
}
