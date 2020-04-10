/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 01:45:03 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
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
      DateTime dateTime0 = DateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTime.Property dateTime_Property0 = dateTime0.property(dateTimeFieldType0);
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMillis((-2033));
      assertEquals(1392409283353L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.minusSeconds((-966));
      assertEquals(1392410247320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMinutes(460);
      assertEquals(1392381681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDate localDate0 = new LocalDate(1272L, (Chronology) julianChronology0);
      DateTime dateTime0 = localDate0.toDateTime((ReadableInstant) null);
      DateTime dateTime1 = dateTime0.minusHours(0);
      assertEquals((-1049918680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusHours((-3858));
      assertEquals(1406298081320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.minusDays(1);
      assertEquals(1392322881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusWeeks(1);
      assertEquals(1391804481320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.minusMonths((-2227));
      assertEquals(7248770481320L, dateTime1.getMillis());
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
      // Undeclared exception!
      try { 
        dateTime0.minusYears(2147483644);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147481630 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMillis(460);
      assertEquals(1392409281780L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMinutes(460);
      assertEquals(1392436881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusHours((-2018));
      assertEquals(1385144481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusDays((-340));
      assertEquals(1363033281320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.plusWeeks(25734375);
      assertEquals(15565542405681320L, dateTime1.getMillis());
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
      DateTime dateTime1 = dateTime0.plusMonths(337);
      assertEquals(2278441281320L, dateTime1.getMillis());
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
      Months months0 = Months.SIX;
      DateTime dateTime1 = dateTime0.withPeriodAdded(months0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = Duration.ZERO;
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 0);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withDurationAdded(5018L, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      // Undeclared exception!
      try { 
        dateTime0.withFieldAdded(durationFieldType0, (-2146899456));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2146897442 for weekyear must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withFieldAdded((DurationFieldType) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withField((DateTimeFieldType) null, (-2146853886));
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      // Undeclared exception!
      try { 
        dateTime0.withField(dateTimeFieldType0, (-1737));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1737 for yearOfCentury must be in the range [0,99]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withFields((ReadablePartial) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTime dateTime1 = dateTime0.withFields(localTime0);
      assertEquals(1392332400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withZoneRetainFields((DateTimeZone) null);
      //  // Unstable assertion: assertEquals(1392409281320L, dateTime1.getMillis());
      //  // Unstable assertion: assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.withZoneRetainFields(fixedDateTimeZone0);
      assertEquals(1392412881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime1 = dateTime0.withChronology(buddhistChronology0);
      assertNotSame(dateTime1, dateTime0);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) buddhistChronology0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = DateTime.now((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
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
  public void test051()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now((Chronology) julianChronology0);
      assertEquals(1392409281320L, dateTime0.getMillis());
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
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime1 = dateTime0.withZone(dateTimeZone0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDate((-855), (-855), (-855));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -855 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (DateTimeZone) null);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1392332340000L);
      assertEquals(1392332340000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plus(504L);
      assertEquals(1392409281824L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withYear((-849));
      assertEquals((-88955204290680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withMillisOfSecond(1469);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1469 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfSecond();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minus(3939L);
      assertEquals(1392409277381L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfEra();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfCentury((-821));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -821 for yearOfCentury must be in the range [0,99]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withEra((-26));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -26 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      DateTime dateTime0 = new DateTime(4676, 4676, 4676, 15271875, 15271875, 4676, lenientChronology0);
      DateTime dateTime1 = dateTime0.plusSeconds(15271875);
      assertEquals(154004492651000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DateTime dateTime0 = new DateTime(5, 5, 5, 5, 5);
      assertEquals((-61998635672000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      LocalTime localTime0 = dateTime0.toLocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, dateTimeZone0);
      assertEquals((-62135594311000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withMillisOfDay((-854));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -854 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, gJChronology0);
      assertEquals((-62135767112000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withDayOfYear(306);
      assertEquals(1414959681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withMonthOfYear(2147482877);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2147482877 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime((Object) null, gJChronology0);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertEquals(1392332400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfEra(2146603531);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2146603531 for yearOfEra must be in the range [1,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfYear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withMinuteOfHour((-2359));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2359 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plus((ReadablePeriod) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1, dateTimeZone0);
      DateTime dateTime1 = dateTime0.withHourOfDay(1);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.era();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Duration duration0 = mutablePeriod0.toDurationTo(dateTime0);
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) julianChronology0);
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
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
  public void test096()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfMonth((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withWeekOfWeekyear(1);
      assertEquals(1388780481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, dateTimeZone0);
      assertEquals((-62135594312000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minus((ReadableDuration) null);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withCenturyOfEra((-1073741823));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1073741823 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withTime(1, 1, 1, 1);
      assertEquals(1392336061001L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfHour();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfWeek((-70));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -70 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTime();
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0, 1, 1, 1, 1, 0, 22);
      DateTime dateTime1 = dateTime0.plusYears(1);
      assertEquals((-62135594311978L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withSecondOfMinute((-855));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -855 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withWeekyear((-847));
      assertEquals((-88892132290680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Period period0 = new Period((-1733L));
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) period0);
      assertEquals(1392409283053L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateTime dateTime0 = new DateTime(5, 5, 5, 5, 5, 5);
      assertEquals((-61998635667000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      DateTime dateTime0 = new DateTime(825L, (DateTimeZone) null);
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      DateTime dateTime1 = dateTime_Property0.addWrapFieldToCopy(2714);
      assertEquals(14825L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-13));
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.addToCopy((long) 0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      DateTime dateTime1 = dateTime_Property0.roundCeilingCopy();
      assertEquals(1393628400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      Chronology chronology0 = dateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.roundHalfEvenCopy();
      assertEquals(1392409281000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      DateTime dateTime0 = localTime0.toDateTimeToday((DateTimeZone) null);
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      // Undeclared exception!
      try { 
        dateTime_Property0.setCopy("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.withMinimumValue();
      assertEquals(1392332400320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null);
      DateTime.Property dateTime_Property0 = dateTime0.hourOfDay();
      DateTime dateTime1 = dateTime_Property0.addToCopy((-2145086886));
      assertEquals((-7720920380318680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.roundHalfCeilingCopy();
      assertEquals(1392409281000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      DateTime dateTime1 = dateTime_Property0.roundFloorCopy();
      assertEquals(1392332400000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      DateTime dateTime1 = dateTime_Property0.getDateTime();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      assertEquals(1418588481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.roundHalfFloorCopy();
      assertEquals(1392409281000L, dateTime1.getMillis());
  }
}
