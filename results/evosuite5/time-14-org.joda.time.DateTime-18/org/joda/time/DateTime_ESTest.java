/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:22:36 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTime_ESTest extends DateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTime.Property dateTime_Property0 = dateTime0.property(dateTimeFieldType0);
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.minusMillis(1);
      assertEquals(1392409281319L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.minusSeconds(26);
      assertEquals(1392409255320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMinutes(13);
      assertEquals(1392408501320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.minusHours((-421));
      assertEquals(1393924881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusDays(12);
      assertEquals(1391372481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      DateTime dateTime1 = dateTime0.minusWeeks(1);
      assertEquals(1391804481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMonths((-16));
      assertEquals(1434309681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusYears(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusYears((-292269054));
      assertEquals(9223121900521281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DateTime dateTime0 = new DateTime(63L);
      DateTime dateTime1 = dateTime0.plusMillis(0);
      assertEquals(63L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMillis(41);
      assertEquals(1392409281361L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusSeconds(550);
      assertEquals(1392409831320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMinutes(13);
      assertEquals(1392410061320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusHours((-521));
      assertEquals(1390533681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusDays((-35));
      assertEquals(1389385281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusWeeks(2286);
      assertEquals(2774982081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMonths((-2147483646));
      assertEquals((-5647335135908290680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusYears(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusYears((-194));
      assertEquals((-4729719490680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      YearMonth yearMonth0 = new YearMonth((-2456L));
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DateTime dateTime1 = dateTime0.withPeriodAdded(period0, 0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Weeks weeks0 = Weeks.MAX_VALUE;
      Duration duration0 = weeks0.toStandardDuration();
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withDurationAdded((-1827L), 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 1672);
      assertEquals(54155766081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withFieldAdded((DurationFieldType) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTime0.withField((DateTimeFieldType) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      // Undeclared exception!
      try { 
        dateTime0.withField(dateTimeFieldType0, (-3073));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3073 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withFields((ReadablePartial) null);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      MonthDay monthDay0 = new MonthDay();
      DateTime dateTime1 = dateTime0.withFields(monthDay0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test042()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withZoneRetainFields((DateTimeZone) null);
      assertNotSame(dateTime1, dateTime0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-186));
      DateTime dateTime1 = dateTime0.withZoneRetainFields(dateTimeZone0);
      assertEquals(1392412881506L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withZone((DateTimeZone) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) gJChronology0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test047()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(510);
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1999));
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withHourOfDay(1390);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1390 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.withZone(fixedDateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDate(1698, 1698, 1698);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1698 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime1 = new DateTime(dateTime0, dateTimeZone0);
      assertFalse(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = new DateTime(dateTime0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DateTime dateTime0 = new DateTime(63L);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 0);
      assertEquals(63L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime((Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.plus(1392409281320L);
      assertEquals(2784818562640L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withMillisOfSecond((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minus(685L);
      assertEquals(1392409280635L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfEra();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withYearOfCentury(1);
      assertEquals(982182081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withEra((-3025));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3025 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, julianChronology0);
      assertEquals((-62135767111000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime(968, 968, 968, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 968 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      LocalTime localTime0 = dateTime0.toLocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, dateTimeZone0);
      assertEquals((-62135594311000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withMillisOfDay(1820);
      assertEquals(1392332401820L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.hourOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      DateTime dateTime0 = new DateTime((-4007), (-4007), (-4312), 2, (-4312), lenientChronology0);
      assertEquals((-199531806720000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfYear(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withMonthOfYear(475);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 475 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (Chronology) null);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertNotSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfEra((-35));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -35 for yearOfEra must be in the range [1,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfYear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withMinuteOfHour(10);
      assertEquals(1392408621320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plus((ReadablePeriod) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1, dateTimeZone0);
      assertEquals((-62135594310999L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.parse("+I%K$7uer/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+I%K$7uer/\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfMonth(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withWeekOfWeekyear(471);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 471 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, dateTimeZone0);
      DateTime dateTime1 = dateTime0.withYear(1);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = Duration.ZERO;
      DateTime dateTime1 = dateTime0.minus((ReadableDuration) duration0);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withCenturyOfEra((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withTime(15356250, 15356250, 15356250, 15356250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 15356250 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfWeek(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTime();
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1);
      // Undeclared exception!
      try { 
        dateTime0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withSecondOfMinute(2390);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2390 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withWeekyear(1762);
      assertEquals((-6559498690680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Months months0 = Months.TWO;
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) months0);
      assertEquals(1387052481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      DateTime dateTime0 = new DateTime(3, 3, 3, 3, 3, 3);
      assertEquals((-62067244589000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0L, (Chronology) null);
      DateTime.Property dateTime_Property0 = dateTime0.millisOfSecond();
      DateTime dateTime1 = dateTime_Property0.addWrapFieldToCopy(1970);
      assertEquals(970L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      DateTime dateTime1 = dateTime_Property0.addToCopy((long) (-135));
      assertEquals(1037305281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfHour();
      DateTime dateTime1 = dateTime_Property0.roundCeilingCopy();
      assertEquals(1392409320000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      Chronology chronology0 = dateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      DateTime dateTime1 = dateTime_Property0.roundHalfEvenCopy();
      assertEquals(1392591600000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime(1147L, (Chronology) copticChronology0);
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      // Undeclared exception!
      try { 
        dateTime_Property0.setCopy("bZK<xP+8mU73w.E(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"bZK<xP+8mU73w.E(\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime((Chronology) buddhistChronology0);
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      DateTime dateTime1 = dateTime_Property0.addToCopy(1);
      assertEquals(1392495681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime.Property dateTime_Property0 = dateTime0.era();
      // Undeclared exception!
      try { 
        dateTime_Property0.roundHalfCeilingCopy();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000+00:19:32 (BuddhistChronology[Europe/Amsterdam])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime.Property dateTime_Property0 = dateTime0.era();
      // Undeclared exception!
      try { 
        dateTime_Property0.roundFloorCopy();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000+00:19:32 (BuddhistChronology[Europe/Amsterdam])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      DateTime dateTime1 = dateTime_Property0.getDateTime();
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      assertEquals(1392418799320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      DateTime dateTime1 = dateTime_Property0.withMinimumValue();
      assertEquals(1392063681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0L, (Chronology) null);
      DateTime.Property dateTime_Property0 = dateTime0.millisOfSecond();
      DateTime dateTime1 = dateTime_Property0.roundHalfFloorCopy();
      assertSame(dateTime1, dateTime0);
  }
}
