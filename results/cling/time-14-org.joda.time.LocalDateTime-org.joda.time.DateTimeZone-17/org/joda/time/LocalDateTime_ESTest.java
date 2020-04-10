/*

 * Tue Mar 03 18:09:26 GMT 2020
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
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.getName((long) 3535);
      try { 
        DateTimeZone.forOffsetHoursMinutes(3293, (-2146625340));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2146625340
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-3316L));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test002()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getName((-943L));
      assertEquals("+01:00", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(390);
      assertEquals("+390:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-177), (Chronology) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(68595332);
      localDateTime0.equals(dateTimeZone0);
      assertEquals("+19:03:15.332", dateTimeZone0.toString());
      assertEquals("+19:03:15.332", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      String string0 = dateTimeZone0.getName(463L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
      
      boolean boolean0 = localDateTime0.equals(dateTimeZone0);
      assertFalse(boolean0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(43, 43);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.getFieldType(1172);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1172
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-2147483646));
      localDateTime0.isBefore(localDateTime1);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(390);
      assertEquals("+390:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTimeZone.forOffsetMillis(68595525);
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
  public void test008()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-166), (Chronology) null);
      try { 
        DateTimeZone.forOffsetHoursMinutes(68595568, (-1272));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1272
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes((-346), 3);
      LocalDateTime localDateTime2 = new LocalDateTime((long) 0, dateTimeZone1);
      assertEquals("-346:03", dateTimeZone1.toString());
      assertEquals("-346:03", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.isSupported((DurationFieldType) null);
      LocalDateTime localDateTime1 = new LocalDateTime((-3316L));
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-166), (Chronology) null);
      Weeks weeks0 = Weeks.weeks(45);
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(43, 43);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(3);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-287));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTimeZone.forOffsetMillis(68594766);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("#_x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '#_x' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("9C)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '9C)' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.getField(3600000);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 3600000
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      localDateTime0.plusWeeks(0);
      String string0 = dateTimeZone0.getName(463L);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(605L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-1550));
      assertNotSame(localDateTime1, localDateTime0);
      
      String string0 = dateTimeZone1.getName(6168624912122685L);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone1.toString());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-166), (Chronology) null);
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
  public void test020()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis((-9577056142810046L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(325);
      assertEquals("+00:00:00.325", dateTimeZone0.toString());
      
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(3393, (-2043), 3393, (-2043), (-1), (-1193));
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-2043));
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-166), (Chronology) null);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+FIAXP}VcOijX21zl");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+FIAXP}VcOijX21zl\" is malformed at \"FIAXP}VcOijX21zl\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-166), (Chronology) null);
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
  public void test024()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, (-2485L));
      assertEquals(19300007294858L, long0);
      
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.dayOfYear();
      LocalDateTime localDateTime1 = new LocalDateTime();
      localDateTime1.isBefore(localDateTime0);
      LocalDateTime localDateTime2 = new LocalDateTime((-3316L));
      assertFalse(localDateTime2.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test026()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(3600000);
      localDateTime0.isBefore(localDateTime1);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258894084L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test027()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255293616L, dateTime0.getMillis());
      
      localDateTime0.equals(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      dateTimeZone0.getName(463L);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.FRENCH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      dateTimeZone0.getName(463L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("9C)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '9C)' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test031()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(43, 43);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      String string0 = localDateTime0.toString();
      assertEquals("2020-03-03T19:07:57.958", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 43, false);
      assertEquals((-157379957L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test032()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-2147483646));
      boolean boolean0 = localDateTime0.isBefore(localDateTime1);
      assertFalse(boolean0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getName((-943L));
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-1550));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      String string0 = dateTimeZone0.getName(463L);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-jF((thq?UjE]m GzM1:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-jF((thq?UjE]m GzM1:\" is malformed at \"jF((thq?UjE]m GzM1:\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3600000);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-166), (Chronology) null);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(2);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 43);
      assertEquals("+00:43", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
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
  @Ignore
  public void test039()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255274519L, dateTime0.getMillis());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test040()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusSeconds((-559));
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      IslamicChronology islamicChronology1 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology0.LEAP_YEAR_INDIAN);
      long long0 = islamicChronology1.set(localDateTime0, (-2485L));
      assertEquals(19300007273931L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test041()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = localDateTime0.toString();
      assertEquals("2020-03-03T19:07:53.121", string0);
      
      String string1 = dateTimeZone0.getName((-943L));
      assertEquals("+01:00", string1);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(46);
      assertEquals("+00:00:00.046", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusDays(5767);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight((long) 5767, dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfCentury(21);
      assertEquals((-1546301972000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-8));
      assertEquals("-08:00", dateTimeZone1.getID());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals((-1), int0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test045()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255271254L, dateTime0.getMillis());
      
      localDateTime0.plusWeeks(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test046()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusHours((-1550));
      YearMonth yearMonth0 = new YearMonth();
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1585692000000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      DateTimeZone.setDefault(dateTimeZone0);
      String string0 = dateTimeZone0.getName(463L);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test048()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      localDateTime0.isSupported(durationFieldType0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258869612L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test049()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      localDateTime0.isSupported(durationFieldType0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 68595028);
      assertEquals(19300007269146L, long0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+01:00");
      assertNotNull(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      localDateTime0.isSupported(durationFieldType0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      String string0 = dateTimeZone0.getName(701L);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusWeeks(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(11);
      assertEquals("+11:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(43, 43);
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
  public void test054()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      DateTimeZone.forOffsetHours((-8));
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258842153,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=7,SECOND=22,MILLISECOND=153,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-166), (Chronology) null);
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
  public void test056()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-166), (Chronology) null);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetMillis(68595434);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
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
  public void test058()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(3600000);
      assertEquals("+01:00", dateTimeZone1.getID());
      
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258840630L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test061()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(3535);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258840282L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test062()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 4788864L);
      assertEquals(19300003640029L, long0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime.now(dateTimeZone0);
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
  public void test064()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(5767);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight((long) 5767, dateTimeZone0);
      dateMidnight0.withYearOfCentury(21);
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test065()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusSeconds(4364);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getName((-943L));
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test066()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes((-346), 3);
      LocalDateTime localDateTime1 = new LocalDateTime((long) 0, dateTimeZone1);
      assertEquals("-346:03", dateTimeZone1.toString());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 18:07:00 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTimeZone.forOffsetMillis(68595395);
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
  public void test068()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.plusDays(3600000);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258819221L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test069()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusWeeks((-4730));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 68595028);
      assertEquals(19300007218629L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test070()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:38 CET 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(11);
      assertEquals("+11:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(43, 43);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      dateTimeZone0.convertLocalToUTC((long) 43, false);
      LocalDateTime localDateTime1 = localDateTime0.plusDays(1961);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DateTimeZone.forOffsetHours(65);
      try { 
        DateTimeZone.forOffsetHoursMinutes(3293, (-2146625340));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2146625340
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test073()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:18 CET 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      String string0 = dateTimeZone0.getName(463L);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DateTimeZone.forOffsetMillis((-4591));
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
  public void test075()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(43, 43);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-3070));
      assertNotSame(localDateTime1, localDateTime0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 43, false);
      assertEquals("+43:43", dateTimeZone0.getID());
      assertEquals((-157379957L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test076()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:05:55 CET 2020", date0.toString());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 1583326776963L);
      assertEquals(19300007155720L, long0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
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
  public void test078()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.FRENCH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258746819,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=5,SECOND=46,MILLISECOND=819,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((-827L), false);
      assertEquals((-827L), long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTimeZone.forOffsetMillis(3600000);
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
  public void test080()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(11);
      assertEquals("+11:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime.now((Chronology) islamicChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 34632);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 34632
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test082()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.FRENCH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      localDateTime0.toDate();
      localDateTime0.toDateTime();
      assertEquals("java.util.GregorianCalendar[time=1583258713279,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=5,SECOND=13,MILLISECOND=279,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test084()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.isSupported((DurationFieldType) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258712566L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      localDateTime0.isSupported(durationFieldType0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(325);
      assertEquals("+00:00:00.325", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusHours(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2884);
      assertEquals("+00:00:02.884", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(3293, (-2146625340));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2146625340
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
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
  @Ignore
  public void test089()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-2147483646));
      localDateTime0.isBefore(localDateTime1);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258709547L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
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
  public void test091()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetMillis(68595059);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusSeconds(4364);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(390);
      assertEquals("+390:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test093()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258707176L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(4364);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test094()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.minusMonths(921);
      assertEquals((-838864800000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test095()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone.setDefault(dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258705886L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test096()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258705306L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(390);
      assertEquals("+390:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.plusYears((-1550));
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1756), (-1756));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1756
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test098()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258702507L, dateTime0.getMillis());
      
      String string0 = localDateTime0.toString();
      assertEquals("2020-03-03T19:05:02.507", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(43, 43);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 43, false);
      assertEquals((-157379957L), long0);
      
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+43:43", dateTimeZone0.toString());
      assertEquals("+43:43", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test100()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) islamicChronology0);
      localDateTime1.compareTo((ReadablePartial) localDateTime0);
      long long0 = islamicChronology0.set(localDateTime1, 4788864L);
      assertEquals(1583258700459L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test101()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258675395,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=4,SECOND=35,MILLISECOND=395,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }
}
