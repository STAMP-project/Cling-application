/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:45:30 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      DurationField durationField0 = copticChronology0.halfdays();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfCeiling(2);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifference(0, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, copticChronology0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField1, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((-3599999L), 1783);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1783 for hourOfDay is not supported: Illegal instant due to time zone offset transition: 1970-03-16T06:00:00.001 (Europe/Amsterdam)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      long long0 = dateTimeField0.addWrapField((long) 2, 10080);
      assertEquals(10080002L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.halfdayOfDay();
      DurationField durationField0 = copticChronology0.months();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, (DateTimeZone) null, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.addWrapField((long) 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      DurationField durationField0 = copticChronology0.halfdays();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, (long) 1);
      assertEquals(1001L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, (-1291));
      assertEquals((-4647599999L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 534320768L);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, decoratedDurationField0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = LenientDateTimeField.getInstance(unsupportedDateTimeField0, gJChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, preciseDurationField0, decoratedDurationField0, decoratedDurationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.millisOfDay();
      DurationField durationField0 = copticChronology0.months();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, (DateTimeZone) null, durationField0, durationField0, durationField0);
      Locale locale0 = Locale.GERMANY;
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      String string0 = dateTimeField0.getAsText((long) 1);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.millisOfDay();
      DurationField durationField0 = copticChronology0.months();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, (DateTimeZone) null, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((-1L), "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      String string0 = dateTimeField0.getAsShortText((long) 1);
      assertEquals("3600", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.millisOfDay();
      DurationField durationField0 = copticChronology0.months();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, (DateTimeZone) null, durationField0, durationField0, durationField0);
      YearMonth yearMonth0 = new YearMonth(3601280L, (Chronology) copticChronology0);
      int[] intArray0 = new int[3];
      int[] intArray1 = zonedChronology_ZonedDateTimeField0.addWrapPartial(yearMonth0, 0, intArray0, 1);
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      dateTimeField0.getMaximumValue((ReadablePartial) yearMonth0);
      assertEquals(2014, yearMonth0.getYear());
      assertEquals(2, yearMonth0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      int int0 = dateTimeField0.getMinimumValue((long) 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 2, (-1239), 2);
      DurationField durationField0 = offsetDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(21, 21);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(copticChronology0, dateTimeField0);
      DurationField durationField0 = skipDateTimeField0.getDurationField();
      assertNotNull(durationField0);
      assertEquals("hours", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      int int0 = dateTimeField0.getMaximumValue((long) 1);
      assertEquals(86399, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getRangeDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, (DateTimeZone) null, durationField0, durationField0, durationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue((ReadablePartial) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      int int0 = dateTimeField0.getLeapAmount(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(copticChronology0, dateTimeField0);
      DurationField durationField0 = skipDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      Locale locale0 = Locale.FRANCE;
      String string0 = dateTimeField0.getAsText(1, locale0);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.millisOfDay();
      DurationField durationField0 = copticChronology0.months();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, (DateTimeZone) null, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.remainder(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 2);
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      boolean boolean0 = dateTimeField0.isLeap(2);
      assertFalse(boolean0);
  }
}
