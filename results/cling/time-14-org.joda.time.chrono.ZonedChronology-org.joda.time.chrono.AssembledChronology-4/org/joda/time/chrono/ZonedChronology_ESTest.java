/*

 * Tue Mar 03 16:51:46 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn(0L).when(chronology0).getDateTimeMillis(anyInt() , anyInt() , anyInt() , anyInt());
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((-541), (-541), (-541), (-541));
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((Chronology) null).when(chronology0).withUTC();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withChronology(zonedChronology0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZoneUTC();
      // Undeclared exception!
      try { 
        LocalDateTime.parse("j?DYD6*F~xT*s z", dateTimeFormatter2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"j?DYD6*F~xT*s z\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, (DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone1).getID();
      Chronology chronology2 = zonedChronology0.withZone(dateTimeZone1);
      assertNotSame(chronology2, zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((long) 1, 1, 1, (-601), (-601));
      assertEquals(3058398L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LimitChronology limitChronology0 = LimitChronology.getInstance(gJChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-280));
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(limitChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, 25);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, millisDurationField0).when(chronology0).centuries();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfYear();
      doReturn((DurationField) null, millisDurationField0).when(chronology0).days();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).era();
      doReturn((DurationField) null, millisDurationField0).when(chronology0).eras();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, millisDurationField0).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, dateTimeField0, dateTimeField0).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, millisDurationField0).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, offsetDateTimeField0, offsetDateTimeField0).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, offsetDateTimeField0).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, offsetDateTimeField0).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).monthOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null, ")").when(chronology0).toString();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, offsetDateTimeField0).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(chronology1, dateTimeZone1);
      ZonedChronology zonedChronology2 = ZonedChronology.getInstance(zonedChronology1, dateTimeZone1);
      assertNotSame(zonedChronology2, zonedChronology1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.getInstance(chronology1, dateTimeZone0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      assertEquals(1583254276093L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.getInstance(chronology1, dateTimeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((long) 1, 1, (-2147483575), (-2147483575), (-2147483575));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2147483575 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, (DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, (DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, fixedDateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1522));
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(dateTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology.getInstance(chronology1, dateTimeZone0);
      LocalDate localDate0 = new LocalDate(1, 1, 1, buddhistChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-79271569172000L), dateMidnight0.getMillis());
  }
}
