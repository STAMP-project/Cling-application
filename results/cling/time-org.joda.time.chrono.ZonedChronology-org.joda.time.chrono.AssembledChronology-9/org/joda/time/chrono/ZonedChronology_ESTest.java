/*

 * Tue Mar 03 16:52:50 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime((-1363), (-1363), 1, (-1363), 1);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -1363 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      Chronology chronology1 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(gJChronology0, chronology1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      StrictChronology strictChronology0 = StrictChronology.getInstance(chronology0);
      // Undeclared exception!
      try { 
        strictChronology0.getDateTimeMillis((-1722), (-1722), (-2403), 540);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // year field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Chronology chronology1 = zonedChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology1, zonedChronology0);
  }

  @Test(timeout = 4000)
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      // Undeclared exception!
      try { 
        islamicChronology0.getDateTimeMillis(1850L, 2839, 2839, 2839, 2839);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hourOfDay field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, fixedDateTimeZone0);
      Object object0 = new Object();
      zonedChronology1.equals(object0);
      IslamicChronology islamicChronology1 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0, islamicChronology_LeapYearPatternType0);
      assertNotSame(islamicChronology1, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((-1521L), 1, 1, 1, 1);
      assertEquals((-82738999L), long0);
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertTrue(boolean0);
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
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate(2558, (-691), 1);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -691 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
