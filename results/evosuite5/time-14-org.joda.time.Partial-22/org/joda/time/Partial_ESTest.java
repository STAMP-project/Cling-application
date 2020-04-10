/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:06:07 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Partial_ESTest extends Partial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Partial partial0 = new Partial();
      Locale locale0 = Locale.KOREA;
      String string0 = partial0.toString((String) null, locale0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Partial partial0 = new Partial();
      Locale locale0 = new Locale("hldayOfDay");
      // Undeclared exception!
      try { 
        partial0.toString("hldayOfDay", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Partial partial0 = new Partial();
      String string0 = partial0.toString((String) null);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Partial partial0 = new Partial(localTime0);
      String string0 = partial0.toString("21:21:21.320");
      assertEquals("21:21:21.320", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 12);
      String string0 = partial0.toString();
      assertEquals("0012", string0);
      
      String string1 = partial0.toString();
      assertEquals("0012", string1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Partial partial0 = new Partial(localTime0);
      partial0.toString();
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(3742L, (Chronology) gregorianChronology0);
      Partial partial0 = new Partial(yearMonth0);
      boolean boolean0 = partial0.isMatch((ReadablePartial) yearMonth0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 12);
      // Undeclared exception!
      try { 
        partial0.isMatch((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 12);
      YearMonth yearMonth0 = new YearMonth();
      LocalDate localDate0 = yearMonth0.toLocalDate(12);
      boolean boolean0 = partial0.isMatch((ReadablePartial) localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      Partial partial0 = new Partial(lenientChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTime dateTime0 = DateTime.now((Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        partial0.isMatch((ReadableInstant) dateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 12, buddhistChronology0);
      boolean boolean0 = partial0.isMatch((ReadableInstant) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(13);
      DateMidnight dateMidnight0 = new DateMidnight((long) 13, dateTimeZone0);
      Partial partial0 = new Partial();
      boolean boolean0 = partial0.isMatch((ReadableInstant) dateMidnight0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(3726L, (Chronology) gregorianChronology0);
      Partial partial0 = new Partial(yearMonth0);
      Months months0 = Months.THREE;
      Partial partial1 = partial0.withPeriodAdded(months0, (-1512));
      assertFalse(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      int[] intArray0 = new int[8];
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, intArray0);
      Minutes minutes0 = Minutes.MIN_VALUE;
      Partial partial1 = partial0.withPeriodAdded(minutes0, 0);
      assertEquals(4, partial1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Partial partial0 = new Partial(localTime0);
      Partial partial1 = partial0.withPeriodAdded((ReadablePeriod) null, 2);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, intArray0);
      DurationFieldType durationFieldType0 = dateTimeFieldTypeArray0[2].getDurationType();
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DurationFieldType durationFieldType0 = dateTimeFieldTypeArray0[0].getDurationType();
      Partial partial0 = new Partial(islamicChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.withFieldAdded(durationFieldType0, 93);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Maximum value exceeded for add
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(44);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.withField(dateTimeFieldType0, 44);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 44 for hourOfHalfday must be in the range [0,11]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 5);
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertEquals(0, partial1.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 5);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfMonth();
      Partial partial1 = partial0.without(dateTimeFieldType1);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, 26);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 26 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.clockhourOfDay();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType2, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.hourOfHalfday();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType2, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 12, buddhistChronology0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekOfWeekyear();
      Partial partial1 = partial0.with(dateTimeFieldType1, 12);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType2;
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType1, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 5);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfMonth();
      Partial partial1 = partial0.with(dateTimeFieldType1, 5);
      assertNotSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, 2043);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2043 for era must not be larger than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, islamicChronology0);
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        partial0.with((DateTimeFieldType) null, 24);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(3742L, (Chronology) gregorianChronology0);
      Partial partial0 = new Partial(yearMonth0);
      Partial partial1 = partial0.withChronologyRetainFields(gregorianChronology0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Partial partial0 = new Partial();
      assertEquals(0, partial0.size());
      
      Partial partial1 = partial0.withChronologyRetainFields(gregorianChronology0);
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Partial partial0 = null;
      try {
        partial0 = new Partial((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: minuteOfHour < minuteOfDay
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[3];
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: yearOfCentury < year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = new int[3];
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: weekyearOfCentury < era
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekyearOfCentury();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.secondOfDay();
      dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[5] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[6] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[7] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[8] = dateTimeFieldType2;
      int[] intArray0 = new int[9];
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, islamicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: secondOfDay < year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      int[] intArray0 = new int[2];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      assertEquals(2, partial0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: clockhourOfHalfday
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      assertEquals(0, partial0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      int[] intArray0 = new int[6];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Values array must be the same length as the types array
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, (int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Values array must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int[] intArray0 = new int[0];
      Partial partial0 = null;
      try {
        partial0 = new Partial((DateTimeFieldType[]) null, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0[0], 1149);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Partial.Property partial_Property0 = new Partial.Property((Partial) null, 93);
      // Undeclared exception!
      try { 
        partial_Property0.withMinimumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      int[] intArray0 = new int[6];
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 3354);
      // Undeclared exception!
      try { 
        partial_Property0.addToCopy(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3354
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 12);
      Partial.Property partial_Property0 = new Partial.Property(partial0, (-3904));
      Partial partial1 = partial_Property0.getPartial();
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 24, gregorianChronology0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.withMaximumValue();
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
      // Undeclared exception!
      try { 
        partial_Property0.addWrapFieldToCopy(3868);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 24);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      int int0 = partial_Property0.compareTo((ReadablePartial) partial0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Partial partial0 = new Partial(localTime0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, (-3632));
      // Undeclared exception!
      try { 
        partial_Property0.setCopy("21:21:21.320");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3632
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(3726L, (Chronology) gregorianChronology0);
      Partial partial0 = new Partial(yearMonth0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
      assertEquals(2, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 13);
      Hours hours0 = Hours.SEVEN;
      Partial partial1 = partial0.minus(hours0);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, islamicChronology0);
      Seconds seconds0 = Seconds.ZERO;
      Partial partial1 = partial0.plus(seconds0);
      assertTrue(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, intArray0);
      DurationFieldType durationFieldType0 = dateTimeFieldTypeArray0[0].getDurationType();
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 1);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 12);
      Partial partial1 = partial0.withField(dateTimeFieldType0, 12);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      int[] intArray0 = new int[4];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain null: index 0
         //
         verifyException("org.joda.time.Partial", e);
      }
  }
}
