/*

 * Tue Mar 03 18:08:49 GMT 2020
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
import java.util.Locale;
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
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = localDateTime0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(46, 46);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(46, (Chronology) buddhistChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 46
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      localDateTime0.plusMinutes(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(256, 3);
      assertEquals("+256:03", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(2147482775);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-801));
      assertEquals("-00:00:00.801", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Date date0 = new Date(1137L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1284));
      assertEquals("-00:00:01.284", dateTimeZone0.toString());
      
      LocalDateTime localDateTime1 = LocalDateTime.now();
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-2506L), (Chronology) buddhistChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(1583262019381L);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.centuryOfEra();
      Locale locale0 = Locale.US;
      dateTimeZone0.getName((long) 7, locale0);
      boolean boolean0 = localDateTime0.equals(localDateTime_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTimeZone.forID("-00:00:02.444");
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+X5UX!&B8@*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+X5UX!&B8@*\" is malformed at \"X5UX!&B8@*\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds((-416));
      assertNotSame(localDateTime1, localDateTime0);
      
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) buddhistChronology0);
      Interval interval0 = localDate0.toInterval();
      assertEquals((-3600000L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test009()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      localDateTime0.plusWeeks(1);
      DateTime dateTime0 = new DateTime();
      localDateTime0.toDateTime(dateTime0);
      assertEquals(1583258883366L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3866L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("resuxting");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'resuxting' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      Years years0 = Years.TWO;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      localDateTime0.isSupported(durationFieldType0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-416), (Chronology) iSOChronology0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals((-62135594311000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      localDateTime0.plusWeeks(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTimeZone.forOffsetMillis((-412));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'z' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTime dateTime0 = new DateTime();
      dateTime0.plusDays(1);
      // Undeclared exception!
      try { 
        localDateTime0.getField((-2147404210));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2147404210
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-2919L));
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
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.withYear((-1632));
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime0 = new LocalDateTime(30672000000L);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3880L));
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(236548278, (-2147483646), 2091);
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      localDateTime0.plusMinutes(46);
      DateMidnight dateMidnight0 = new DateMidnight((long) 46);
      // Undeclared exception!
      try { 
        dateMidnight0.withCenturyOfEra((-2159));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2159 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test021()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258844988L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-00:00:02.444");
      assertEquals("-00:00:02.444", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test022()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Mar 03 18:07:11 CET 2563", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test023()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(2147482775);
      localDateTime0.compareTo((ReadablePartial) localDateTime1);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258831060L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3880L));
      boolean boolean0 = localDateTime0.isAfter(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1768L);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1768L, dateTime0.getMillis());
      
      boolean boolean0 = localDateTime0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime.now((Chronology) islamicChronology0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ITALIAN;
      String string0 = fixedDateTimeZone0.getName((long) 3, locale0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("halfdays");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'halfdays' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Field '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Field '\" is malformed at \"Field '\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      LocalDate localDate0 = new LocalDate((-1138L), (Chronology) zonedChronology0);
      localDate0.toInterval();
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-1003));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1003
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ITALIAN;
      fixedDateTimeZone0.getName((long) 3, locale0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.chrono.GJChronology$ImpreciseCutoverField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.chrono.GJChronology$ImpreciseCutoverField' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes((-1), 46);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = localDateTime0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime.now(dateTimeZone0);
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getName((long) 7, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = localDateTime0.minusYears(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ITALIAN;
      String string0 = fixedDateTimeZone0.getName((long) 3, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = localDateTime0.withFields(localDateTime0);
      assertSame(localDateTime1, localDateTime0);
      assertEquals(4, localDateTime1.size());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      localDateTime0.plusWeeks(1554);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      LocalDate localDate0 = new LocalDate((-1138L), (Chronology) zonedChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Date date0 = new Date(1137L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.set(localDateTime0, 2032L);
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
  public void test037()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1768L);
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
  public void test038()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3880L));
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds((-1632));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      DateMidnight dateMidnight0 = new DateMidnight((long) 7);
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(1);
      assertEquals((-56802471572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test041()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(46, 46);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Mar 03 18:06:48 CET 2563", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test042()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258807804L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test043()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      localDateTime0.plusWeeks(2147483211);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258807259L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test044()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(153692453);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) iSOChronology0);
      localDateTime1.toDateTime(dateTime0);
      boolean boolean0 = localDateTime1.equals(dateTime0);
      assertEquals(1583258806374L, dateTime0.getMillis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 7);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(58);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) 7);
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(1);
      assertEquals((-56802471572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test046()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258805401L, dateTime0.getMillis());
      
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      DateMidnight dateMidnight0 = new DateMidnight((long) 1);
      DateMidnight dateMidnight1 = dateMidnight0.plusWeeks(1927);
      assertEquals(1165446000000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      localDateTime0.isSupported(durationFieldType0);
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) buddhistChronology0);
      Interval interval0 = localDate0.toInterval();
      assertEquals(82800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("-00:00:02.444");
      assertEquals("-00:00:02.444", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(2147482775);
      boolean boolean0 = localDateTime1.equals(localDateTime0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean1 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertTrue(boolean1 == boolean0);
      assertFalse(localDateTime0.equals((Object)localDateTime1));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toDateTime();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) islamicChronology0);
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
  @Ignore
  public void test052()  throws Throwable  {
      Date date0 = new Date(1137L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      LocalDateTime localDateTime1 = LocalDateTime.now();
      localDateTime1.compareTo((ReadablePartial) localDateTime0);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258802363L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ITALIAN;
      String string0 = fixedDateTimeZone0.getName((long) 3, locale0);
      assertEquals("+00:00", string0);
      
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(3);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(256, 3);
      assertEquals("+256:03", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      localDateTime0.plusDays((-2292));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DateTimeZone.forOffsetMillis((-801));
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
  public void test058()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258781246,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=6,SECOND=21,MILLISECOND=246,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3111);
      assertEquals("+00:00:03.111", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.withCenturyOfEra(60);
      LocalDateTime localDateTime2 = new LocalDateTime((-3672L), (DateTimeZone) null);
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-974L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone.forOffsetMillis((-412));
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
  public void test061()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-547));
      assertEquals("-00:00:00.547", dateTimeZone0.toString());
      
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
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
  public void test064()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258778951L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test065()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      localDateTime0.plusHours(3600000);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258778595L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      LocalDate localDate0 = new LocalDate(1100L, (Chronology) zonedChronology0);
      Interval interval0 = localDate0.toInterval();
      assertEquals(82800000L, interval0.getEndMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.withYear((-1632));
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
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
  public void test068()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime.now((Chronology) islamicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(1583262019381L);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(4519);
      assertNotSame(localDateTime1, localDateTime0);
      
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getName((long) 7, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.withCenturyOfEra(60);
      LocalDateTime localDateTime2 = localDateTime0.withFields(localDateTime1);
      LocalDateTime localDateTime3 = new LocalDateTime((-3672L), (DateTimeZone) null);
      int int0 = localDateTime2.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
      assertTrue(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(1, 46);
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
  public void test072()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(2085);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) 1);
      DateMidnight dateMidnight1 = dateMidnight0.plusWeeks(1927);
      assertEquals(1165446000000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      DateTime dateTime0 = new DateTime();
      localDateTime0.toDateTime(dateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+X5UX!&B8@*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+X5UX!&B8@*\" is malformed at \"X5UX!&B8@*\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test074()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-801));
      assertEquals("-00:00:00.801", dateTimeZone0.toString());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:08 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(1, 59);
      try { 
        DateTimeZone.forOffsetHoursMinutes(2869, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(1, 46);
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
  public void test077()  throws Throwable  {
      Date date0 = new Date(1137L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      localDateTime0.plusMinutes(3601137);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.set(localDateTime0, 2032L);
      assertEquals((-17134672770863L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test078()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      long long0 = zonedChronology0.set(localDateTime0, 1);
      assertEquals((-16434940405059L), long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
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
  public void test080()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      localDateTime0.toDateTime();
      assertEquals("java.util.GregorianCalendar[time=1583258738724,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=5,SECOND=38,MILLISECOND=724,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1);
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
  public void test082()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Puerto_Rico");
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(2444);
      assertEquals("+00:00:02.444", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      LocalDateTime.now();
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-71));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -71
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test084()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      localDateTime0.toDate();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258715786L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ITALIAN;
      String string0 = fixedDateTimeZone0.getName((long) 3, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-2147483646));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime.now((Chronology) islamicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DateTimeZone.forID("-00:00:02.444");
      LocalDateTime localDateTime0 = new LocalDateTime((-3672L), (DateTimeZone) null);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-412));
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.getField(46, (Chronology) buddhistChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 46
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      LocalDateTime localDateTime0 = new LocalDateTime((long) 7);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(58);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
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
  public void test092()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      localDateTime0.plusSeconds((-416));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-1144L));
      // Undeclared exception!
      try { 
        localDateTime0.getField(5, (Chronology) buddhistChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 5
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test094()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      localDateTime0.plusSeconds((-416));
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258710513L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime.now((Chronology) islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone.forID((String) null);
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, islamicChronology0);
      Weeks weeks0 = Weeks.MIN_VALUE;
      DateMidnight dateMidnight1 = dateMidnight0.minus((ReadablePeriod) weeks0);
      assertEquals(1298755588719600000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test097()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258706754L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("EST");
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("EST", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test098()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetHours(1);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258706133L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone.forID((String) null);
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, islamicChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.withMillis(1);
      DateMidnight dateMidnight2 = dateMidnight1.withYearOfCentury(1);
      assertEquals((-2694298772000L), dateMidnight2.getMillis());
      assertEquals((-3600000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test100()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258704414L, dateTime0.getMillis());
      
      localDateTime0.withFields(localDateTime0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test101()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      localDateTime1.compareTo((ReadablePartial) localDateTime0);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258703008L, dateTime0.getMillis());
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      localDateTime0.toDate();
      DateMidnight dateMidnight0 = new DateMidnight((long) 46);
      // Undeclared exception!
      try { 
        dateMidnight0.withCenturyOfEra((-2159));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2159 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
