/*

 * Tue Mar 03 18:08:12 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(4, (Chronology) julianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 4
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getName((-1037L));
      try { 
        DateTimeZone.forOffsetHours(86400);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-658), dateTimeZone0);
      Object object0 = new Object();
      boolean boolean0 = localDateTime0.equals(object0);
      assertFalse(boolean0);
      assertEquals("+04:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(2020);
      LocalDateTime localDateTime2 = localDateTime1.plusSeconds(46);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      LocalDateTime.Property localDateTime_Property0 = new LocalDateTime.Property(localDateTime1, dateTimeField0);
      localDateTime_Property0.roundHalfFloorCopy();
      assertNotSame(localDateTime1, localDateTime2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
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
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(292272956);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+04:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.plusHours(2020);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-3509), dateTimeZone0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((-3391L), dateTimeZone0);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-3509), dateTimeZone0);
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"--\" is malformed at \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("nKA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'nKA' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-3509), dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(128);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Period period0 = new Period(128, 1583262008115L);
      // Undeclared exception!
      try { 
        localDateTime0.getField(28, (Chronology) ethiopicChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 28
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      localDateTime0.plusDays(1);
      DateTime dateTime0 = DateTime.now();
      dateTime0.withTimeAtStartOfDay();
      assertEquals(1583258849993L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(128);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-120));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(4797312L, (Chronology) julianChronology0);
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
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
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
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-2832L), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(29);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period((-547L), 81);
      boolean boolean0 = localDateTime0.equals(buddhistChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3, 68847846}, intArray0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-658), dateTimeZone0);
      assertEquals("+04:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("yearOfEra");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'yearOfEra' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      localDateTime0.plusMillis(1);
      long long0 = localDateTime0.getLocalMillis();
      assertEquals(1583258845250L, long0);
      
      localDateTime0.withCenturyOfEra(1);
      LocalDateTime localDateTime1 = LocalDateTime.now();
      localDateTime1.toDate();
      localDateTime0.withMillisOfSecond(563);
      localDateTime0.plusMinutes(563);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3, 68844655}, intArray0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("yearOfEra");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'yearOfEra' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(292272956);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-658), dateTimeZone0);
      assertEquals("+04:00", dateTimeZone0.toString());
      assertEquals("+04:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusDays(43);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+04:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      Period period0 = new Period((-2429L), 1583258058998L);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(4, localDateTime1.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
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
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-3509), dateTimeZone0);
      LocalDateTime localDateTime2 = localDateTime0.plusSeconds(46);
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone.forID((String) null);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(46, "GMT+K+1Zr");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+K+1Zr\" is malformed at \"K+1Zr\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(13);
      assertEquals("+13:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      boolean boolean0 = localDateTime0.equals(localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(128);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 2147481182);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      Object object0 = new Object();
      boolean boolean0 = localDateTime0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
      
      YearMonth yearMonth0 = YearMonth.now();
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1585692000000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258827147,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+01:00\",offset=3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=7,SECOND=7,MILLISECOND=147,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.isSupported((DurationFieldType) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258826629L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period((-2429L), 1583258058998L);
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(62, 62, 0, chronology0);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      LocalDateTime localDateTime1 = localDateTime0.plusHours(2020);
      localDateTime0.isSupported(durationFieldType0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      LocalDateTime.Property localDateTime_Property0 = new LocalDateTime.Property(localDateTime1, dateTimeField0);
      LocalDateTime localDateTime2 = localDateTime_Property0.roundHalfFloorCopy();
      assertNotSame(localDateTime1, localDateTime0);
      assertNotSame(localDateTime2, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"--\" is malformed at \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+org");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+org\" is malformed at \"org\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(4797312L, (Chronology) julianChronology0);
      LocalDate localDate0 = new LocalDate((long) (-1201), (Chronology) julianChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.isBefore(localDate0);
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
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime1 = new LocalDateTime(dateTimeZone0);
      boolean boolean0 = localDateTime1.equals(localDateTime0);
      assertFalse(boolean0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getName((-1108L));
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-3509), dateTimeZone0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:35 GMT+00:00 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period((-2429L), 1583258058998L);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(2020);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      LocalDateTime.Property localDateTime_Property0 = new LocalDateTime.Property(localDateTime1, dateTimeField0);
      localDateTime_Property0.roundHalfFloorCopy();
      assertNotSame(localDateTime1, localDateTime0);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      DateTimeZone.forOffsetMillis(1);
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
  public void test62()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1, 1);
      DateTimeZone.forOffsetHours(1);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LocalDateTime.now();
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
  public void test64()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusHours(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258792927L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test65()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(43);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258792522L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test67()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusSeconds(2147481182);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 2147481182);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(43);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
      
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-658), dateTimeZone0);
      assertEquals("+04:00", dateTimeZone0.toString());
      assertEquals("+04:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-921L), dateTimeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      LocalDateTime localDateTime1 = new LocalDateTime((Chronology) islamicChronology0);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(4, localDateTime1.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test72()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      localDateTime0.plusDays(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255189037L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test73()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusDays(43);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258788485L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test74()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime((Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      LocalDateTime localDateTime0 = dateTime1.toLocalDateTime();
      localDateTime0.plusWeeks(1);
      assertEquals(1583258788240L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test75()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Mar 03 18:06:13 GMT+00:00 2563", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test76()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int int0 = localDateTime0.getYearOfEra();
      assertEquals(2020, int0);
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:00 GMT+00:00 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 2147481182);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test77()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(2020);
      Date date0 = localDateTime1.toDate();
      assertEquals("Tue May 26 23:05:37 GMT+00:00 2020", date0.toString());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      LocalDateTime.Property localDateTime_Property0 = new LocalDateTime.Property(localDateTime1, dateTimeField0);
      localDateTime_Property0.roundHalfFloorCopy();
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(62, 62, 0, chronology0);
      assertEquals((-60050247572000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Period period0 = new Period((-1201), 788L);
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
  public void test80()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3463L), (Chronology) islamicChronology0);
      localDateTime0.toDateTime();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(288, (-337), (-3309), 1, 749);
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period((-2429L), 1583258058998L);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(128);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(2020);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(46, 46, 2147483485, (-4461), 46);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      LocalDateTime.Property localDateTime_Property0 = new LocalDateTime.Property(localDateTime1, dateTimeField0);
      LocalDateTime localDateTime2 = localDateTime_Property0.roundHalfFloorCopy();
      assertNotSame(localDateTime1, localDateTime0);
      assertNotSame(localDateTime2, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.setDefault(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test85()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = LocalDateTime.now();
      Date date0 = localDateTime1.toDate();
      date0.setTime(1583261987071L);
      LocalDateTime localDateTime2 = localDateTime1.minusHours(23118750);
      localDateTime1.year();
      localDateTime0.year();
      localDateTime2.plusMinutes(0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(313);
      dateTimeZone0.toTimeZone();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258682381L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(43);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      LocalDateTime.now();
      try { 
        DateTimeZone.forOffsetHoursMinutes(7, (-1716));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1716
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test89()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(292272956);
      localDateTime1.compareTo((ReadablePartial) localDateTime0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258679410L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-658), dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(4, (Chronology) julianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 4
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusSeconds(2147481182);
      Period period0 = new Period((-2429L), 1583258058998L);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test93()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258676466L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test94()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      DateMidnight dateMidnight1 = dateMidnight0.withChronology(buddhistChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateMidnight1);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals(1583190000000L, dateMidnight1.getMillis());
      assertEquals((-15551414097948L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test95()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
      
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3, 68672935}, intArray0);
      
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258672935L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test96()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMillis(1);
      long long0 = localDateTime0.getLocalMillis();
      assertEquals(1583258666370L, long0);
      
      LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
      LocalDateTime localDateTime3 = LocalDateTime.now();
      localDateTime3.toDate();
      localDateTime0.withMillisOfSecond(563);
      LocalDateTime localDateTime4 = localDateTime0.plusMinutes(563);
      localDateTime2.millisOfDay();
      LocalDateTime localDateTime5 = localDateTime4.withYearOfCentury(61);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      localDateTime3.toDateTime(dateTimeZone1);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime5);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
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
  public void test98()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(4, localDateTime1.size());
      assertEquals(1, int0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 2147481182);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }
}
