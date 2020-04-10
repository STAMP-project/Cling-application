/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:37:46 GMT 2019
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
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Partial_ESTest extends Partial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Partial partial0 = new Partial();
      Locale locale0 = Locale.FRENCH;
      String string0 = partial0.toString((String) null, locale0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Partial partial0 = new Partial();
      String string0 = partial0.toString("'$wc kSF#E*oF/R-1", (Locale) null);
      assertEquals("$wc kSF#E*oF/R-1", string0);
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
        partial0.toString("&n|,uI66O5h8k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      String string0 = partial0.toString();
      assertEquals("--02-14", string0);
      
      String string1 = partial0.toString();
      assertEquals("--02-14", string1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Partial partial1 = partial0.with(dateTimeFieldType0, 0);
      String string0 = partial1.toString();
      assertEquals("[weekyearOfCentury=0, monthOfYear=2, dayOfMonth=14]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      partial0.toString();
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      Partial partial0 = new Partial(localDateTime0);
      Partial partial1 = partial0.with(dateTimeFieldType0, 168);
      boolean boolean0 = partial0.isMatch((ReadablePartial) partial1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      Partial partial0 = new Partial(localDateTime0);
      boolean boolean0 = partial0.isMatch((ReadablePartial) partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      Instant instant0 = new Instant(1744L);
      boolean boolean0 = partial0.isMatch((ReadableInstant) instant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[8];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      Instant instant0 = new Instant(0L);
      // Undeclared exception!
      try { 
        partial0.isMatch((ReadableInstant) instant0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Partial partial0 = new Partial();
      Instant instant0 = new Instant((-1L));
      boolean boolean0 = partial0.isMatch((ReadableInstant) instant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      Period period0 = Period.fieldDifference(monthDay0, partial0);
      Partial partial1 = partial0.plus(period0);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      Minutes minutes0 = Minutes.MIN_VALUE;
      Partial partial1 = partial0.withPeriodAdded(minutes0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, (int[]) null);
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
      Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 1);
      assertFalse(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, (int[]) null);
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
      Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 1);
      assertFalse(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial1 = partial0.with(dateTimeFieldType0, 0);
      Partial partial2 = partial1.withField(dateTimeFieldType0, 0);
      assertSame(partial2, partial1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[8];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.withField(dateTimeFieldType0, 1901);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertEquals(2, partial1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfWeek must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      Partial partial1 = partial0.with(dateTimeFieldType1, 0);
      Partial partial2 = partial1.with(dateTimeFieldType0, (-2939));
      assertFalse(partial2.equals((Object)partial1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      // Undeclared exception!
      try { 
        partial0.with((DateTimeFieldType) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      Partial partial1 = partial0.withChronologyRetainFields((Chronology) null);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Partial partial0 = new Partial();
      assertEquals(0, partial0.size());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      Partial partial1 = partial0.withChronologyRetainFields(gregorianChronology0);
      assertNotSame(partial1, partial0);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: dayOfWeek
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfDay();
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.minuteOfHour();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType2;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType2;
      int[] intArray0 = new int[5];
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
  public void test32()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[0];
      int[] intArray0 = new int[4];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: weekyearOfCentury < year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
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
  public void test34()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: weekyear < era
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfMonth();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.centuryOfEra();
      dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldTypeArray0[2];
      dateTimeFieldTypeArray0[5] = dateTimeFieldTypeArray0[3];
      dateTimeFieldTypeArray0[6] = dateTimeFieldTypeArray0[2];
      dateTimeFieldTypeArray0[7] = dateTimeFieldType2;
      dateTimeFieldTypeArray0[8] = dateTimeFieldTypeArray0[4];
      int[] intArray0 = new int[9];
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, copticChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: dayOfMonth < centuryOfEra
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
      int[] intArray0 = new int[2];
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
  public void test37()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      assertEquals(0, partial0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      int[] intArray0 = new int[17];
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
  public void test39()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      Partial partial0 = null;
      try {
        partial0 = new Partial((DateTimeFieldType) null, (-2269));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(copticChronology0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 32);
      // Undeclared exception!
      try { 
        partial_Property0.withMinimumValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial.Property partial_Property0 = new Partial.Property(partial0, (-313));
      // Undeclared exception!
      try { 
        partial_Property0.addToCopy((-3359));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 950, ethiopicChronology0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 365);
      Partial partial1 = partial_Property0.getPartial();
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1268);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.withMaximumValue();
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
      partial_Property0.addWrapFieldToCopy(32);
      assertEquals(2, partial_Property0.get());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial.Property partial_Property0 = new Partial.Property(partial0, (-313));
      // Undeclared exception!
      try { 
        partial_Property0.getAsString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -313
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial.Property partial_Property0 = new Partial.Property(partial0, (-899));
      // Undeclared exception!
      try { 
        partial_Property0.setCopy("[]");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
      assertEquals(0, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      Partial partial1 = partial0.minus((ReadablePeriod) null);
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial1 = partial0.with(dateTimeFieldType0, 0);
      Partial partial2 = partial1.with(dateTimeFieldType0, 0);
      assertSame(partial2, partial1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      assertEquals(0, partial_Property0.get());
  }
}
