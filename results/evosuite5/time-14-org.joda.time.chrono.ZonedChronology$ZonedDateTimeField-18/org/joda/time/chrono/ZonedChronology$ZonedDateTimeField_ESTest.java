/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:43:51 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicDayOfMonthDateTimeField;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJEraDateTimeField;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      long long0 = dateTimeField0.roundHalfCeiling((-3599928L));
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 3);
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      long long0 = dateTimeField0.roundHalfCeiling((-19165161600000L));
      assertEquals((-19165162772000L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      long long0 = dateTimeField0.getDifferenceAsLong(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getDifference((-3598464L), (-1460L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.hours();
      BasicDayOfMonthDateTimeField basicDayOfMonthDateTimeField0 = new BasicDayOfMonthDateTimeField(julianChronology0, durationField0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicDayOfMonthDateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((long) copticChronology0.AM, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for dayOfMonth is not supported: Illegal instant due to time zone offset transition: 1969-12-31T06:00:00.001 (UTC)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 1, 1);
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      // Undeclared exception!
      try { 
        dateTimeField0.add(9223372036854775807L, (-609L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 3);
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      long long0 = dateTimeField0.add(706L, (long) 1);
      assertEquals(31536000706L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      long long0 = dateTimeField0.add((-609L), 960);
      assertEquals(3455999391L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 3);
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      long long0 = dateTimeField0.add((-1857L), 1079);
      assertEquals(34050671998143L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Integer integer0 = new Integer(0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(gregorianChronology0, integer0, islamicChronology_LeapYearPatternType0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getLeapDurationField();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-89));
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 3);
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      Locale locale0 = Locale.ROOT;
      int int0 = dateTimeField0.getMaximumTextLength(locale0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      Locale locale0 = Locale.ENGLISH;
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = dateTimeField0.getMinimumValue((ReadablePartial) localTime0, (int[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      // Undeclared exception!
      try { 
        dateTimeField0.set(3600001L, "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org.joda.time.chrono.ZonedChronology$ZonedDateTimeField\" for hourOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      String string0 = dateTimeField0.getAsShortText((long) 1);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 3);
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      int[] intArray0 = new int[0];
      int int0 = dateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
      assertEquals(292272708, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-7));
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumValue((ReadablePartial) null);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      int int0 = dateTimeField0.getMinimumValue(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      int int0 = dateTimeField0.getMaximumValue(3601024L);
      assertEquals(23, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-7));
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue((ReadablePartial) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      int int0 = dateTimeField0.getLeapAmount(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 3);
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      boolean boolean0 = dateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJEraDateTimeField0, (DateTimeZone) null, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = new Locale(" Q\"q)DJv2GPgnIs4kVF", "3%", "3%");
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.getAsShortText(2224, locale0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2224
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      Locale locale0 = Locale.CHINA;
      String string0 = dateTimeField0.getAsText(1, locale0);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.set((-1L), 1);
      assertEquals((-22982400001L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      long long0 = dateTimeField0.remainder((-373L));
      assertEquals(3599627L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      boolean boolean0 = zonedChronology_ZonedDateTimeField0.isLeap(1);
      assertFalse(boolean0);
  }
}
