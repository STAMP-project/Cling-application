/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:35:45 GMT 2019
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Partial_ESTest extends Partial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Partial partial0 = new Partial();
      Locale locale0 = Locale.CANADA_FRENCH;
      String string0 = partial0.toString((String) null, locale0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Partial partial0 = new Partial(localDateTime0);
      Locale locale0 = new Locale("");
      // Undeclared exception!
      try { 
        partial0.toString("", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
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
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        partial0.toString("oq/isg>fT.(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 53);
      partial0.toString();
      String string0 = partial0.toString();
      assertEquals("[yearOfCentury=53]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      String string0 = partial0.toString();
      assertEquals("---.006", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      String string0 = partial0.toString();
      assertEquals("[year=2014, monthOfYear=2, dayOfMonth=14, millisOfDay=73281320]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, (Chronology) null);
      String string0 = partial0.toString();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.toString();
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Partial partial0 = new Partial();
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
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      boolean boolean0 = partial0.isMatch((ReadablePartial) partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      MutableDateTime mutableDateTime0 = new MutableDateTime(10059L);
      boolean boolean0 = partial0.isMatch((ReadableInstant) mutableDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      boolean boolean0 = partial0.isMatch((ReadableInstant) mutableDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Weeks weeks0 = Weeks.MAX_VALUE;
      Partial partial0 = new Partial(dateTimeFieldType0, 2);
      Partial partial1 = partial0.plus(weeks0);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Hours hours0 = Hours.hours(0);
      Partial partial1 = partial0.withPeriodAdded(hours0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 1);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 51);
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 1);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      Partial partial1 = partial0.withField(dateTimeFieldType0, 1);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 65);
      // Undeclared exception!
      try { 
        partial0.withField(dateTimeFieldType0, 28181250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 28181250 for minuteOfDay must be in the range [0,1439]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertEquals(0, partial1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      Partial partial0 = new Partial();
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertEquals(0, partial1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      assertEquals(5, partial1.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      assertNotSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfHalfday();
      Partial partial2 = partial1.with(dateTimeFieldType1, 1);
      assertNotSame(partial1, partial2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Partial partial0 = new Partial(localDate0);
      // Undeclared exception!
      try { 
        partial0.with((DateTimeFieldType) null, 73281320);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 65);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Partial partial1 = partial0.withChronologyRetainFields(julianChronology0);
      Partial partial2 = partial1.withChronologyRetainFields(julianChronology0);
      assertNotSame(partial2, partial0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[2];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
      assertEquals(2, partial0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekyearOfCentury();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[6] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[7] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[8] = dateTimeFieldType0;
      int[] intArray0 = new int[9];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: weekyearOfCentury < year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
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
         // Types array must not contain duplicate: weekyear
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: minuteOfHour < era
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: minuteOfHour < yearOfEra
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[2];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: millisOfSecond
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      int[] intArray0 = new int[8];
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
  public void test37()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
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
  public void test38()  throws Throwable  {
      int[] intArray0 = new int[0];
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Partial partial0 = null;
      try {
        partial0 = new Partial((DateTimeFieldType[]) null, intArray0, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0[1], 4041);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 65);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.withMinimumValue();
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 65);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        partial_Property0.addToCopy((-2504));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Maximum value exceeded for add
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      int[] intArray0 = new int[7];
      Partial partial0 = new Partial(gregorianChronology0, dateTimeFieldTypeArray0, intArray0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
      Partial partial1 = partial_Property0.getPartial();
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 65);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.withMaximumValue();
      boolean boolean0 = partial1.isMatch((ReadablePartial) partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 65);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.addWrapFieldToCopy(65);
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Partial.Property partial_Property0 = new Partial.Property((Partial) null, (-602));
      // Undeclared exception!
      try { 
        partial_Property0.setCopy("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Partial partial0 = new Partial(buddhistChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
      assertEquals(0, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Partial partial0 = new Partial(localDate0);
      Partial partial1 = partial0.plus((ReadablePeriod) null);
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial1 = partial0.with(dateTimeFieldType0, 6);
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      assertEquals(5, partial1.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Partial partial0 = new Partial();
      assertEquals(0, partial0.size());
      
      Seconds seconds0 = Seconds.seconds(2);
      Partial partial1 = partial0.minus(seconds0);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      int[] intArray0 = new int[3];
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

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 65);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      String string0 = partial_Property0.getAsShortText();
      assertEquals("65", string0);
  }
}
