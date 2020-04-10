/*

 * Tue Mar 03 17:44:31 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      localDateTime0.plusSeconds(3092);
      assertEquals("java.util.GregorianCalendar[time=1583257422894,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+01:00\",offset=3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=43,SECOND=42,MILLISECOND=894,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(3092);
      assertEquals(44360352000000L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone.forID("UTC");
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 1101);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1101
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      dateTimeZone0.convertLocalToUTC((long) 0, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("pw(\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'pw(\"' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-![_g|tH?.ku");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-![_g|tH?.ku\" is malformed at \"![_g|tH?.ku\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(107220);
      assertEquals(3330390124800000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime.now();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1911);
      assertEquals(7090761600000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-28), 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) (-28), false);
      assertEquals("-28:01", dateTimeZone0.getID());
      assertEquals(100859972L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-172800000));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -172800000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withWeekOfWeekyear(1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(20503125, 20503125);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 20503125
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.withMinuteOfHour(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-W\" is malformed at \"W\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology1 = null;
      try {
        copticChronology1 = new CopticChronology(copticChronology0, dateTimeZone1, 2518);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 2518
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = copticChronology0.withZone(fixedDateTimeZone0);
      DateTimeZone.forID("+00:00");
      LocalDateTime localDateTime0 = new LocalDateTime(chronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone.forID("+00:00");
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 21859200000L);
      assertEquals(21855600000L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(2482);
      assertEquals(25110172800000L, long1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1498L);
      assertEquals((-3598501L), long0);
      
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone.forOffsetHours((-45));
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone.forID("UTC");
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, "s", (-794));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -794
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(12, 12);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 0, false);
      assertEquals((-43920000L), long0);
      assertEquals("+12:12", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-45));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -45
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 0, false);
      assertEquals((-3600000L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      assertEquals((-1L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis((-1138));
      assertEquals((-89128339200000L), long1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(0L, false);
      assertEquals((-3600000L), long0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1963);
      assertEquals(8731756800000L, long1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("-18:00");
      assertSame(dateTimeZone1, dateTimeZone0);
      
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1102L);
      assertEquals((-3598898L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("e])rM,iXlJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'e])rM,iXlJ' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-3600000L), long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-1L), long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
      assertNotSame(copticChronology0, chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(0L, false);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 21859200000L);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 1209);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1209
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes((-58), 1);
      assertEquals("-58:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("-18:00", dateTimeZone1.getID());
      
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      dateTimeZone0.convertLocalToUTC((long) 0, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-37));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -37
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1498L);
      assertEquals((-3598501L), long0);
      
      DateTimeZone.forTimeZone((TimeZone) null);
      long long1 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      assertEquals((-1L), long1);
  }
}
