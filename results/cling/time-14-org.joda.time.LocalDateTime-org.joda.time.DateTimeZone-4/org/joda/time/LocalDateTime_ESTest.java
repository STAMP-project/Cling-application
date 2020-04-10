/*

 * Tue Mar 03 18:09:07 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals("+01:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(0L, dateTimeZone0);
      localDateTime0.equals((Object) null);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-3663), (DateTimeZone) null);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-2062));
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:08:08 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forOffsetHours(112);
      // Undeclared exception!
      try { 
        localDateTime0.getField(112);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 112
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      assertEquals("+59:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = new LocalDateTime(306L);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(112);
      assertEquals("+112:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-2062));
      localDateTime0.plusDays(21);
      assertFalse(localDateTime0.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone.forOffsetHours(112);
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
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(836);
      LocalDateTime localDateTime2 = localDateTime0.plusSeconds(84);
      assertNotSame(localDateTime0, localDateTime1);
      assertFalse(localDateTime2.equals((Object)localDateTime1));
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((-1089L));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1479L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Field '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Field '' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((-1479L));
      LocalDateTime localDateTime2 = localDateTime0.plusHours(1000);
      assertNotSame(localDateTime2, localDateTime0);
      assertFalse(localDateTime0.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withWeekyear(836);
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
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-2401), dateTimeZone0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1804100229257L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-2437));
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(46);
      assertEquals("+46:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-2062));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(912);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:00.912", dateTimeZone0.toString());
      assertEquals("+00:00:00.912", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone.forOffsetHours(112);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("4caS5wY$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '4caS5wY$' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime1 = LocalDateTime.now(chronology0);
      localDateTime1.withWeekyear(875);
      LocalDateTime localDateTime2 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.plusWeeks((-2437));
      // Undeclared exception!
      try { 
        localDateTime0.getField(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 4
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusDays(3899);
      boolean boolean0 = localDateTime1.isAfter(localDateTime0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(668);
      assertEquals("+00:00:00.668", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-2062));
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(338, 912, 1900, (-2062), 668, 46);
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-2062));
      LocalDateTime localDateTime2 = localDateTime0.plusMinutes((-2062));
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
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
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withLocalMillis((-175L));
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
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime1 = localDateTime0.minusMillis((-2147483615));
      MonthDay monthDay0 = new MonthDay((long) (-896), (Chronology) gJChronology0);
      assertEquals(1, monthDay0.getDayOfMonth());
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258855081L, dateTime0.getMillis());
      
      DurationFieldType.weekyears();
      boolean boolean0 = localDateTime0.isAfter(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Integer integer0 = new Integer(1);
      localDateTime0.equals(integer0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258854764L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.minusDays(875);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("2020-03-03T19:01:54.997");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '2020-03-03T19:01:54.997' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      localDateTime0.withFieldAdded(durationFieldType0, 582);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+:4_u0pFL[7#r!w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+:4_u0pFL[7#r!w\" is malformed at \":4_u0pFL[7#r!w\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      assertEquals("-01:00", dateTimeZone0.toString());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:07:32 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(2147483612);
      LocalDateTime localDateTime2 = localDateTime0.withLocalMillis((-175L));
      assertNotSame(localDateTime0, localDateTime1);
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(0, 0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      assertEquals("+59:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((-1089L));
      LocalDateTime localDateTime2 = localDateTime0.plusSeconds((-2147483646));
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(836);
      LocalDateTime localDateTime2 = localDateTime0.plusDays(21);
      assertNotSame(localDateTime2, localDateTime0);
      assertFalse(localDateTime2.equals((Object)localDateTime1));
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withWeekyear(836);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 20:07:21 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(833);
      LocalDateTime localDateTime2 = localDateTime0.plusHours(938);
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(928L);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
      
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertEquals(928L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks(192);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime2 = LocalDateTime.now(dateTimeZone0);
      localDateTime2.isAfter(localDateTime1);
      localDateTime1.toDateTime();
      assertEquals("java.util.GregorianCalendar[time=1583258785356,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=6,SECOND=25,MILLISECOND=356,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusDays(21);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(912);
      assertEquals("+00:00:00.912", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone.forOffsetHours(151);
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
  public void test42()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(338, 912, 1900, (-2062), 668, 46);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(912);
      assertEquals("+00:00:00.912", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(20);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+00:00:00.020", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      TimeZone timeZone0 = dateTimeZone1.toTimeZone();
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone2);
      assertSame(dateTimeZone2, dateTimeZone1);
      assertEquals("+01:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      assertNotSame(dateTimeZone1, dateTimeZone0);
      
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) gJChronology0);
      Hours hours0 = Hours.FOUR;
      LocalDateTime localDateTime2 = LocalDateTime.now((Chronology) gJChronology0);
      localDateTime1.isAfter(localDateTime2);
      assertFalse(localDateTime2.equals((Object)localDateTime1));
      
      LocalDateTime localDateTime3 = new LocalDateTime((-459L));
      assertFalse(localDateTime3.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(928L);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(2147483485);
      assertNotSame(localDateTime1, localDateTime0);
      
      Date date0 = localDateTime1.toDate();
      assertEquals("Tue Oct 02 14:00:00 CEST 246953", date0.toString());
      
      DateTime dateTime0 = localDateTime1.toDateTime(dateTimeZone0);
      assertEquals(7730940542400928L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withWeekyear(836);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(912);
      DateTimeZone.setDefault(dateTimeZone1);
      assertEquals("+00:00:00.912", dateTimeZone1.toString());
      assertEquals("+00:00:00.912", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forOffsetHours(102);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((long) 102, (Chronology) julianChronology0);
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
  public void test48()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(928L);
      DateTimeZone.forOffsetMillis(2164);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forOffsetHours(112);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withWeekyear(875);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("2020-03-03T19:01:54.997");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '2020-03-03T19:01:54.997' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withWeekyear(836);
      try { 
        DateTimeZone.forOffsetHours((-2249));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:05:02 CET 2020", date0.toString());
      
      LocalDateTime localDateTime1 = new LocalDateTime((-1089L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      DateTimeZone.forOffsetHours(112);
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
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1804100229290L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone1).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime1 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime2 = localDateTime0.plusWeeks(813);
      assertNotSame(localDateTime2, localDateTime0);
      
      LocalDateTime localDateTime3 = localDateTime1.withYear(813);
      assertNotSame(localDateTime3, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone.forOffsetMillis(20);
      try { 
        DateTimeZone.forOffsetHoursMinutes(68513462, (-1612));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1612
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime localDateTime2 = localDateTime0.minusMillis(84);
      localDateTime0.withWeekyear(833);
      boolean boolean0 = localDateTime1.isEqual(localDateTime2);
      assertFalse(boolean0);
      assertNotSame(localDateTime2, localDateTime0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test59()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime1 = LocalDateTime.now(chronology0);
      localDateTime1.withWeekyear(836);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:04:43 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone.forOffsetHours(112);
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
  public void test61()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(836);
      LocalDateTime localDateTime2 = localDateTime1.plusMinutes((-2062));
      assertNotSame(localDateTime2, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test62()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:04:25 CET 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      assertEquals("+59:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1804100229257L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone1).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime1 = LocalDateTime.now(chronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      localDateTime1.withFieldAdded(durationFieldType0, 582);
      LocalDateTime localDateTime2 = localDateTime0.plusMinutes(0);
      assertNotSame(localDateTime2, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusDays(836);
      LocalDateTime localDateTime2 = localDateTime0.plusMinutes((-2062));
      assertFalse(localDateTime2.equals((Object)localDateTime1));
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withWeekyear(836);
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
  public void test66()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withWeekyear(836);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(338, 912, 1900, (-2062), 668, 46);
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeZone.forOffsetHours(46);
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
  public void test68()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalDate localDate0 = new LocalDate();
      localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
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
  @Ignore
  public void test69()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusDays(836);
      Date date0 = localDateTime1.toDate();
      assertEquals("Sat Nov 18 20:03:46 CET 2017", date0.toString());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      assertEquals("+59:00", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-2276));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(68513462, (-1612));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1612
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        localDateTime0.isAfter(partial0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      assertEquals("+59:00", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds((-2147483646));
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime1 = LocalDateTime.now(chronology0);
      localDateTime0.plusSeconds(84);
      LocalDateTime localDateTime2 = localDateTime1.minusDays(875);
      assertNotSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.plusWeeks((-2437));
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
  public void test77()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusDays(836);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(912);
      DateTimeZone.setDefault(dateTimeZone1);
      assertEquals("+00:00:00.912", dateTimeZone1.getID());
      assertEquals("+00:00:00.912", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(gJChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.minusDays(875);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2147483645), Integer.MAX_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2147483647
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(46, (-3477), 46, 1876, 707, 1876, 1);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -3477 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
