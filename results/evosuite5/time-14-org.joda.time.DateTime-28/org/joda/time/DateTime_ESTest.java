/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 01:47:32 GMT 2019
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
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTime_ESTest extends DateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTime.Property dateTime_Property0 = dateTime0.property(dateTimeFieldType0);
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMillis((-2221));
      assertEquals(1392409283541L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusSeconds((-2136121299));
      assertEquals(3528530580320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMinutes((-1));
      assertEquals(1392409341320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusHours((-855));
      assertEquals(1395487281320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.minusDays((-1177));
      assertEquals(1494098481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusWeeks((-1177));
      assertEquals(2104255281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMonths(14);
      assertEquals(1355516481320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.minusYears((-1432));
      assertEquals(46581942081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMillis(67);
      assertEquals(1392409281387L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusSeconds((-2221));
      assertEquals(1392407060320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.plusMinutes((-39));
      assertEquals(1392406941320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.plusHours((-2207));
      assertEquals(1384464081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusDays((-61));
      assertEquals(1387138881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusWeeks((-1));
      assertEquals(1391804481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMonths((-37));
      assertEquals(1295036481320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.plusYears((-2241));
      assertEquals((-69326679490680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Days days0 = Days.SIX;
      DateTime dateTime1 = dateTime0.withPeriodAdded(days0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Duration duration0 = Duration.millis((-1250L));
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withDurationAdded(2863L, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Hours hours0 = Hours.FOUR;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withFieldAdded((DurationFieldType) null, 32);
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
      DateTime dateTime0 = new DateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        dateTime0.withFieldAdded(durationFieldType0, (-2147480893));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -214748089300
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withField((DateTimeFieldType) null, (-2765));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      // Undeclared exception!
      try { 
        dateTime0.withField(dateTimeFieldType0, 5096);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 5096 for clockhourOfDay must be in the range [1,24]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withFields((ReadablePartial) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      DateTime dateTime1 = dateTime0.withFields(localDateTime0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime1 = dateTime0.withZoneRetainFields(dateTimeZone0);
      //  // Unstable assertion: assertNotSame(dateTime1, dateTime0);
      //  // Unstable assertion: assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.withZoneRetainFields(fixedDateTimeZone0);
      assertEquals(1392412881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.withZone(fixedDateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) buddhistChronology0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      //  // Unstable assertion: assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertSame(dateTime1, dateTime0);
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
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = DateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withHourOfDay(6);
      assertEquals(1392355281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withZone((DateTimeZone) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(2901L);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(2901L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDate((-1120), (-1120), (-1120));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1120 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (DateTimeZone) null);
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
  public void test065()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = new DateTime(dateTime0);
      assertTrue(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plus(0L);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withYear(971);
      assertEquals((-31521495490680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
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
  public void test069()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minus((-189L));
      assertEquals(1392409281509L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfCentury(972);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 972 for yearOfCentury must be in the range [0,99]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withEra(6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 6 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      DateTime dateTime0 = new DateTime((-277), (-277), (-277), 132, (-277), (-277), lenientChronology0);
      assertEquals((-71663072469000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1);
      assertEquals((-62135594312000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      LocalTime localTime0 = dateTime0.toLocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, fixedDateTimeZone0);
      assertEquals((-62135593139000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withMillisOfDay(18);
      assertEquals(1392332400018L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.hourOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime((-13), (-13), (-1), (-1), 126, ethiopicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfYear((-1327));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1327 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withMonthOfYear((-2241));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2241 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-1279L), (DateTimeZone) null);
      assertEquals((-1279L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTime dateTime1 = new DateTime(dateTime0, islamicChronology0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertFalse(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfEra((-2241));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2241 for yearOfEra must be in the range [1,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfYear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withMinuteOfHour(86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 86400000 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Days days0 = Days.SEVEN;
      DateTime dateTime1 = dateTime0.plus((ReadablePeriod) days0);
      assertEquals(1393014081320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1, dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.millisOfSecond();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.era();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = Duration.ZERO;
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.parse("org.joda.time.DateTime$Property");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.DateTime$Property\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfMonth(2147483623);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2147483623 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withWeekOfWeekyear((-2256));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2256 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, fixedDateTimeZone0);
      assertEquals((-62135593140000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minus((ReadableDuration) null);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withCenturyOfEra(8);
      assertEquals((-36475930690680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withTime(0, 0, 0, 0);
      assertEquals(1392332400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfHour();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfWeek((-489));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -489 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTime();
      assertEquals(1392409281320L, dateTime1.getMillis());
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
        dateTime0.withSecondOfMinute(86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 86400000 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withWeekyear((-1120));
      assertEquals((-97506903490680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1399L);
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) null);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      assertEquals((-62135594311000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      DateTime dateTime1 = dateTime_Property0.addWrapFieldToCopy((-1616));
      assertEquals(4043174400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      DateTime dateTime1 = dateTime_Property0.addToCopy((long) (-21));
      assertEquals(1392409260320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Instant instant0 = new Instant(0L);
      Chronology chronology0 = instant0.getChronology();
      DateTime dateTime0 = DateTime.now(chronology0);
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      DateTime dateTime1 = dateTime_Property0.roundCeilingCopy();
      assertEquals(1420070400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      Chronology chronology0 = dateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      DateTime dateTime1 = dateTime_Property0.roundHalfEvenCopy();
      assertEquals(1392409281000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.yearOfEra();
      // Undeclared exception!
      try { 
        dateTime_Property0.setCopy("The DateTimeFieldType must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"The DateTimeFieldType must not be null\" for yearOfEra is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      DateTime dateTime1 = dateTime_Property0.addToCopy(1);
      assertEquals(4548082881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Instant instant0 = new Instant(0L);
      Chronology chronology0 = instant0.getChronology();
      DateTime dateTime0 = DateTime.now(chronology0);
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      DateTime dateTime1 = dateTime_Property0.roundHalfCeilingCopy();
      assertEquals(1388534400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      DateTime dateTime1 = dateTime_Property0.roundFloorCopy();
      assertEquals(1388530800000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.getDateTime();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      assertEquals(1418588481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      DateTime dateTime1 = dateTime_Property0.withMinimumValue();
      assertEquals(1392409260320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      DateTime dateTime1 = dateTime_Property0.roundHalfFloorCopy();
      assertEquals(1392409281000L, dateTime1.getMillis());
  }
}
