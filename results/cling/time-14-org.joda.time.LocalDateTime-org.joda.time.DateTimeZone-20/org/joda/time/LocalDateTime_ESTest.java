/*

 * Tue Mar 03 18:11:40 GMT 2020
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
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-3159L));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.equals((Object) null);
      LocalDateTime localDateTime1 = new LocalDateTime((-3733L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((Chronology) julianChronology0);
      localDateTime1.equals(localDateTime0);
      LocalDateTime localDateTime2 = new LocalDateTime((-2921L));
      assertEquals(4, localDateTime2.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(57);
      assertEquals("+57:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-417));
      assertEquals("-00:00:00.417", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-1921));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-621L));
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-417));
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) 43, (Chronology) iSOChronology0);
      LocalDateTime localDateTime2 = localDateTime0.plusDays((-417));
      assertEquals(4, localDateTime2.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone.forOffsetHours((-410));
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
      LocalDateTime localDateTime0 = new LocalDateTime((-1099L));
      try { 
        DateTimeZone.forOffsetHoursMinutes((-42305033), (-2066));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2066
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusHours((-30));
      long long0 = iSOChronology0.set(localDateTime0, (-30));
      assertEquals(1583259069359L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      localDateTime0.isSupported(durationFieldType0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-1));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone.forOffsetHours(89);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetMillis((-417));
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(2076);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime((-580L));
      DateTimeZone.setDefault(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone.forOffsetHours(89);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-`~T[Y?Tt.u3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-`~T[Y?Tt.u3\" is malformed at \"`~T[Y?Tt.u3\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone.forOffsetHours((-508));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Pd;Y2}=LO{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Pd;Y2}=LO{' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusMinutes(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(0, 0, 0, 0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-528), 12740625, 1539, (-528));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 12740625 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      // Undeclared exception!
      try { 
        localDateTime0.getField(1900, (Chronology) buddhistChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1900
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusMinutes(0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-3171));
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusMinutes((-989));
      LocalDateTime localDateTime1 = new LocalDateTime((-3733L));
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1099L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '$' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.set(localDateTime0, (-423L));
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
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, (-423L));
      assertEquals(17763840000001L, long0);
      
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LocalDateTime.now((Chronology) julianChronology0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      localDateTime0.toDateTime();
      boolean boolean0 = localDateTime0.equals(buddhistChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(265);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      localDateTime0.equals(zonedChronology0);
      assertEquals("+00:00:00.265", dateTimeZone0.getID());
      assertEquals("+00:00:00.265", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.equals((Object) null);
      YearMonth yearMonth0 = YearMonth.now();
      Interval interval0 = yearMonth0.toInterval((DateTimeZone) null);
      assertEquals(1585692000000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Pd;Y2}=LO{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Pd;Y2}=LO{' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-508));
      assertEquals("-508:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-2147483646));
      assertEquals("-596:31:23.646", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusWeeks((-30));
      long long0 = iSOChronology0.set(localDateTime0, (-30));
      assertEquals(1583259012935L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.toInterval((DateTimeZone) null);
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
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 5);
      assertEquals("+00:05", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDate();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) ethiopicChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.plusWeeks(1);
      assertEquals(1583794800000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, (-423L));
      assertEquals(17763840000001L, long0);
      
      localDateTime0.plusSeconds(1);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-410));
      assertEquals("-410:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusDays(2076);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-1921), (-2129), 3, (-2129));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2129 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) (-2758));
      int[] intArray0 = iSOChronology0.get((ReadablePeriod) mutablePeriod0, 1583554434791L, (long) (-2758));
      assertArrayEquals(new int[] {(-50), (-2), 0, (-6), (-4), (-13), (-57), (-549)}, intArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = new LocalDateTime(gregorianCalendar0, fixedDateTimeZone0);
      localDateTime0.toDate();
      assertEquals("java.util.GregorianCalendar[time=1583258942449,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=9,SECOND=2,MILLISECOND=449,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusWeeks(0);
      Days days0 = Days.FIVE;
      Duration duration0 = days0.toStandardDuration();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, mutableDateTime0);
      assertEquals(1583258941636L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(292272708);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours((-1830));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-1921), (-2129), 3, (-2129));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2129 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(5, "GMT++SSL}sL");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"++SSL}sL\" is malformed at \"+SSL}sL\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, (-413));
      LocalDateTime.Property localDateTime_Property0 = new LocalDateTime.Property(localDateTime0, offsetDateTimeField0);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      LocalDateTime localDateTime1 = localDateTime_Property0.addWrapFieldToCopy((-413));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime.now((Chronology) iSOChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-`~T[Y?Tt.u3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-`~T[Y?Tt.u3\" is malformed at \"`~T[Y?Tt.u3\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Pd;Y2}=LO{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Pd;Y2}=LO{\" is malformed at \"Pd;Y2}=LO{\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.era();
      LocalDateTime localDateTime1 = new LocalDateTime();
      localDateTime0.isAfter(localDateTime1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-1921), (-2129), 3, (-2129));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2129 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDateTime localDateTime1 = new LocalDateTime();
      localDateTime1.compareTo((ReadablePartial) localDateTime0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583258904412L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forOffsetHours(57);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone.forOffsetMillis((-30));
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
  public void test51()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = new LocalDateTime((-1476L), (DateTimeZone) null);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:07:41 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258861254L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays((-3148));
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateTimeZone.forOffsetMillis(1);
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      localDateTime0.isSupported(durationFieldType0);
      assertEquals("java.util.GregorianCalendar[time=1583258821706,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=7,SECOND=1,MILLISECOND=706,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.getName(3158L, (Locale) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime.now(dateTimeZone0);
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
  public void test56()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateMidnight dateMidnight0 = new DateMidnight(1L);
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(99);
      assertEquals((-3124138772000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusHours(43);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258820130L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.set(localDateTime0, (-423L));
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
  public void test59()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-593));
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
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
  public void test60()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147483644);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+596:31:23.644", dateTimeZone0.getID());
      assertEquals("+596:31:23.644", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((Chronology) julianChronology0);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
      
      LocalDateTime localDateTime2 = new LocalDateTime((-2921L));
      assertEquals(4, localDateTime2.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeZone.forOffsetHours((-593));
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
  public void test63()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258817308L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test64()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusDays((-30));
      long long0 = iSOChronology0.set(localDateTime1, (-30));
      assertEquals(1585847216794L, long0);
      
      LocalDateTime localDateTime2 = localDateTime1.plusWeeks(0);
      assertNotSame(localDateTime0, localDateTime2);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusWeeks(2076);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-1921), (-2129), 3, (-2129));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2129 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test66()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(57);
      assertEquals("+57:00", dateTimeZone0.toString());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:34 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2147483606), (-42305025));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -42305025
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test68()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime1.size());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime1, (-423L));
      assertEquals(19300007193327L, long0);
      
      boolean boolean0 = localDateTime0.isAfter(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test69()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, (-423L));
      assertEquals(17763840000001L, long0);
      
      LocalDateTime localDateTime1 = localDateTime0.minusWeeks(1);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test70()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258792012L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-1669));
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test72()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusMinutes(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258791335L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMinutes((-1921));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis((-1921), (-2129), 3, (-2129));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2129 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test74()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.isSupported((DurationFieldType) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258790590L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test75()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258790061L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      localDateTime0.plusHours(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 5);
      assertEquals("+00:05", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-417));
      assertEquals("-00:00:00.417", dateTimeZone0.toString());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-1830));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2147483606), (-42305025));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -42305025
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, fixedDateTimeZone0);
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
  public void test80()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258759248L, dateTime0.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:05:59 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test81()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      localDateTime0.plusSeconds(0);
      assertEquals("java.util.GregorianCalendar[time=1583258725643,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=5,SECOND=25,MILLISECOND=643,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-370));
      assertEquals("-370:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test83()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      localDateTime0.toDateTime();
      assertEquals("java.util.GregorianCalendar[time=1583258682582,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=4,SECOND=42,MILLISECOND=582,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test84()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusSeconds(57);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258681666L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test85()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forOffsetHours(57);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258680985L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1583261976052L, 46);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2147483606), (-42305025));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -42305025
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test87()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      LocalDate localDate0 = LocalDate.now((Chronology) buddhistChronology0);
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals(1583190000000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) iSOChronology0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.set(localDateTime0, (-423L));
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(2147483281, (Chronology) julianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 2147483281
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test89()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.withFields(localDateTime0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258676212L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime.now((Chronology) iSOChronology0);
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
  public void test91()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(205L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(5, "GMT++SSL}sL");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"++SSL}sL\" is malformed at \"+SSL}sL\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}
