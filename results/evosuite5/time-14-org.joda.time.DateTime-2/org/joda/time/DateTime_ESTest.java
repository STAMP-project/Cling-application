/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 04:36:24 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTime_ESTest extends DateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
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
  public void test001()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTime.Property dateTime_Property0 = dateTime0.property(dateTimeFieldType0);
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMillis(23034375);
      assertEquals(1392386246945L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusSeconds(28265624);
      assertEquals(1364143657320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMinutes(2434);
      assertEquals(1392263241320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusHours(3362);
      assertEquals(1380306081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusDays(2117);
      assertEquals(1209496881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusWeeks(2147482262);
      assertEquals((-1298795879645890680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMonths((-1322));
      assertEquals(4868796081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusYears(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusYears(2294);
      assertEquals((-70999297090680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMillis(2147482262);
      assertEquals(1394556763582L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusSeconds(741);
      assertEquals(1392410022320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMinutes(57);
      assertEquals(1392412701320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusHours((-1176));
      assertEquals(1388175681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusDays(605);
      assertEquals(1444677681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusWeeks(86400);
      assertEquals(53647129281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMonths(1998);
      assertEquals(6646562481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusYears(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusYears(2012);
      assertEquals(64885004481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Days days0 = Days.ONE;
      DateTime dateTime1 = dateTime0.withPeriodAdded(days0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Duration duration0 = Duration.ZERO;
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withDurationAdded(26607895200000L, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withFieldAdded((DurationFieldType) null, 48);
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
      DateTime dateTime0 = DateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 117);
      assertEquals(1699993281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withField((DateTimeFieldType) null, 3383);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTime dateTime1 = dateTime0.withField(dateTimeFieldType0, 2642);
      assertEquals(21210150081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withFields((ReadablePartial) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      YearMonth yearMonth0 = YearMonth.now();
      DateTime dateTime1 = dateTime0.withFields(yearMonth0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime1 = dateTime0.withZoneRetainFields(dateTimeZone0);
      //  // Unstable assertion: assertNotSame(dateTime1, dateTime0);
      //  // Unstable assertion: assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.withZoneRetainFields(fixedDateTimeZone0);
      assertEquals(1392412881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withZone((DateTimeZone) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) buddhistChronology0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      //  // Unstable assertion: assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) ethiopicChronology0);
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
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
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withHourOfDay((-1322));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1322 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) ethiopicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTime dateTime1 = dateTime0.withZone(dateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTime0);
      DateTime dateTime1 = localDateTime0.toDateTime();
      assertTrue(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDate((-2147483645), (-2147483645), (-2147483645));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483645 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (DateTimeZone) null);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = new DateTime(dateTime0);
      assertTrue(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plus((-1L));
      assertEquals(1392409281319L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withYear(165);
      assertEquals((-56956359490680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withMillisOfSecond(1);
      assertEquals(1392409281001L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfSecond();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minus((-237L));
      assertEquals(1392409281557L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfEra();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withEra((-2147482547));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147482547 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      DateTime dateTime0 = new DateTime(7, 7, 7, 180, 180, 7, lenientChronology0);
      DateTime dateTime1 = dateTime0.withYearOfCentury(7);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1);
      assertEquals((-62135594312000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      LocalTime localTime0 = dateTime0.toLocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime(236548278, (-2101), (-2101), 0, 236548278, 0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 236548278 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withMillisOfDay(3909);
      assertEquals(1392332403909L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      DateTime dateTime0 = new DateTime(43, 43, (-1205), 43, (-1203), lenientChronology0);
      assertEquals((-41232676952000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfYear(86400);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 86400 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withMonthOfYear(3362);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3362 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0L, (DateTimeZone) null);
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTime dateTime1 = new DateTime(dateTime0, gregorianChronology0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertFalse(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfEra((-1161));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1161 for yearOfEra must be in the range [1,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfYear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withMinuteOfHour(0);
      assertEquals(1392408021320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Seconds seconds0 = Seconds.ZERO;
      DateTime dateTime1 = dateTime0.plus((ReadablePeriod) seconds0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 41, dateTimeZone0);
      assertEquals((-62135596738959L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Duration duration0 = Duration.ZERO;
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfMonth(1853);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1853 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withWeekOfWeekyear(2058005162);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2058005162 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minus((ReadableDuration) null);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withCenturyOfEra((-1260));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1260 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withTime((-1), (-1), (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfHour();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfWeek((-2077));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2077 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTime();
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-62135594310999L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withSecondOfMinute(1998);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1998 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(58);
      assertEquals((-60332871490680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, dateTimeZone0);
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) null);
      assertEquals((-62135594312000L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      DateTime dateTime0 = new DateTime(8, 8, 8, 8, 8, 8);
      assertEquals((-61895722284000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      DateTime dateTime1 = dateTime_Property0.addWrapFieldToCopy((-22));
      assertEquals(1397503281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      DateTime dateTime1 = dateTime_Property0.addToCopy((-564L));
      assertEquals((-90819518680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      DateTime dateTime1 = dateTime_Property0.roundCeilingCopy();
      assertEquals(1392418800000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      Chronology chronology0 = dateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      DateTime dateTime1 = dateTime_Property0.roundHalfEvenCopy();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      // Undeclared exception!
      try { 
        dateTime_Property0.setCopy("org.joda.time.field.BaseDateTimeField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org.joda.time.field.BaseDateTimeField\" for dayOfMonth is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      DateTime dateTime1 = dateTime_Property0.withMinimumValue();
      assertEquals(1392332400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      DateTime dateTime0 = new DateTime((long) 1);
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      DateTime dateTime1 = dateTime_Property0.addToCopy(1);
      assertEquals(60001L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      DateTime dateTime1 = dateTime_Property0.roundHalfCeilingCopy();
      assertEquals(1392409260000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.era();
      DateTime dateTime1 = dateTime_Property0.roundFloorCopy();
      assertEquals((-62135600400000L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.hourOfDay();
      DateTime dateTime1 = dateTime_Property0.getDateTime();
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.hourOfDay();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      assertEquals(1392416481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.era();
      DateTime dateTime1 = dateTime_Property0.roundHalfFloorCopy();
      assertEquals((-62135600400000L), dateTime1.getMillis());
  }
}
