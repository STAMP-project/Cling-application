/*

 * Tue Mar 03 18:10:04 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      assertNotSame(localDateTime1, localDateTime0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = new DateTime(0L);
      DateTime dateTime1 = dateTime0.minusMillis(129);
      LocalDate localDate0 = dateTime1.toLocalDate();
      boolean boolean0 = localDateTime0.equals(localDate0);
      assertEquals(4, localDateTime0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds((-1199));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(43);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime2 = new LocalDateTime((-5479L), dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(1);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.weeks(1);
      LocalDateTime localDateTime1 = localDateTime0.plus((ReadablePeriod) period0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test006()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      MonthDay monthDay0 = new MonthDay((-3254L));
      assertEquals(1, monthDay0.getMonthOfYear());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertNotSame(localDateTime1, localDateTime0);
      
      LocalDateTime localDateTime2 = new LocalDateTime((long) (-563), dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime1 = new LocalDateTime((-5479L), dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1768L), (DateTimeZone) null);
      LocalDate localDate0 = new LocalDate((long) 14);
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
  public void test010()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime1, localDateTime0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime((-1L), dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime((-233L), dateTimeZone0);
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
  public void test013()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((-1417L), dateTimeZone0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTimeZone.forOffsetHours(1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Kk3<JD^lM19.}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Kk3<JD^lM19.}' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(606, (Chronology) gregorianChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 606
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((-1417L), dateTimeZone0);
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
  public void test017()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime((-1L), dateTimeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258934155,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=8,SECOND=54,MILLISECOND=155,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      localDateTime0.plusMinutes(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime1 = new LocalDateTime((-1417L), dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.set(localDateTime0, 1138L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(57);
      LocalDateTime localDateTime0 = new LocalDateTime((-3598464L), dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+org.joda.time.DateTimeZone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+org.joda.time.DateTimeZone\" is malformed at \"org.joda.time.DateTimeZone\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1742L));
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
  public void test022()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((-5479L), dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test023()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(553);
      localDateTime1.isAfter(localDateTime0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258931753L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test024()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-1224));
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:08:38 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test025()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      LocalDate localDate0 = dateTime0.toLocalDate();
      boolean boolean0 = localDateTime0.equals(localDate0);
      assertEquals(1583255318517L, dateTime0.getMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("8w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '8w' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-#53|@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-#53|@\" is malformed at \"#53|@\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = new DateTime(0L);
      DateTime dateTime1 = dateTime0.minusMillis(129);
      dateTime1.toLocalDate();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(195);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      julianChronology0.set(localDateTime0, (-168L));
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
  public void test030()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      long long0 = julianChronology0.set(localDateTime0, (-168L));
      assertEquals(1584382116073L, long0);
      
      LocalDateTime localDateTime1 = LocalDateTime.now(dateTimeZone0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays((-1199));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test032()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      LocalDateTime localDateTime1 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.toDate();
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258906322L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
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
  @Ignore
  public void test034()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) copticChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258904954L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = new DateTime(0L);
      DateTime dateTime1 = dateTime0.minusMillis(129);
      dateTime1.toLocalDate();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime((-1L), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1697);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test037()  throws Throwable  {
      DateTimeZone.forOffsetHours(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test038()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusDays(43);
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(1);
      assertEquals((-62129999468908L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test039()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test040()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Mar 03 19:08:09 CET 2563", date0.toString());
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(57);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(1);
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime(1, 1000, 1, 58, 2199, (-559), buddhistChronology0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1000 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258862968,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=7,SECOND=42,MILLISECOND=968,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test045()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.isSupported((DurationFieldType) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258862515L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test046()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      localDateTime0.isSupported(durationFieldType0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258861931L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test047()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.isSupported((DurationFieldType) null);
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(1);
      assertEquals((-62129999510481L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test048()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      long long0 = julianChronology0.set(localDateTime0, (-168L));
      assertEquals(1584382060960L, long0);
      
      localDateTime0.isSupported(durationFieldType0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withYearOfEra(1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone1.isFixed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test050()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(43);
      localDateTime0.compareTo((ReadablePartial) localDateTime1);
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(1);
      assertEquals((-62129999512303L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test051()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(43);
      localDateTime0.compareTo((ReadablePartial) localDateTime1);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583256279088L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test052()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Period period0 = Period.weeks(1);
      LocalDateTime localDateTime1 = localDateTime0.plus((ReadablePeriod) period0);
      Date date0 = localDateTime1.toDate();
      assertEquals("Thu Jan 08 01:00:00 CET 1970", date0.toString());
      assertFalse(localDateTime1.equals((Object)localDateTime0));
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) yearMonth0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      localDateTime0.plusDays(0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime.now(dateTimeZone1);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      localDateTime0.equals((Object) null);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusDays(57);
      MonthDay monthDay0 = new MonthDay((-3505L));
      assertEquals(1, monthDay0.getDayOfMonth());
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withYearOfEra(91);
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
  public void test059()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withYearOfEra(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.setDefault(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      julianChronology0.set(localDateTime0, (-168L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("The fields must not be null or empty");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'The fields must not be null or empty' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test062()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258844635L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test063()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusHours(57);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258844113L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test064()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forID("UTC");
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258843771L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test065()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      YearMonth yearMonth0 = YearMonth.fromDateFields(date0);
      yearMonth0.toInterval(dateTimeZone0);
      assertEquals("Tue Mar 03 19:06:59 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test066()  throws Throwable  {
      DateTimeZone.forOffsetHours(1);
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(1);
      assertEquals((-62129999553473L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      localDateTime0.isSupported((DurationFieldType) null);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertTrue(boolean0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(43);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime2 = new LocalDateTime((-5479L), dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1900);
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
  public void test071()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258816225L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test072()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(3);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583518015886L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test073()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(5);
      assertEquals((-62004097172000L), dateMidnight1.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(2157);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test074()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withYearOfEra(46);
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withMillisOfDay(430);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1583258814826L, dateTime0.getMillis());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test075()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(20);
      assertEquals((-61530642784971L), dateTime1.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:27 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  @Ignore
  public void test077()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258765275,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=6,SECOND=5,MILLISECOND=275,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test078()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      localDateTime0.plusMinutes(20);
      dateTime0.withWeekyear(20);
      assertEquals(1583258764601L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withYearOfEra(46);
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
  public void test080()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      localDateTime0.withYearOfEra(1);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258742893,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=5,SECOND=42,MILLISECOND=893,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(37);
      assertEquals("+37:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.getFieldType(43);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 43
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1402);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
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
  public void test088()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localDateTime0.isAfter(localTime0);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      localDateTime0.plusSeconds(0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1072L), (DateTimeZone) null);
      Chronology chronology0 = localDateTime0.getChronology();
      // Undeclared exception!
      try { 
        localDateTime0.getField((-1417), chronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1417
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test091()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258737850L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test092()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1454);
      DateTime dateTime0 = localDateTime1.toDateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(20);
      assertEquals((-61530641380901L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
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
  @Ignore
  public void test094()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
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
  public void test096()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.setDefault(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      localDateTime0.toDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-336), (-1337));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1337
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test098()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withYearOfEra(46);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test099()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-1224));
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Mar 03 19:04:52 CET 2563", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test100()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withYearOfEra(46);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Wed Feb 19 18:04:14 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      assertEquals(4, localDateTime0.size());
  }
}
