/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:58:54 GMT 2019
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
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicDayOfMonthDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      // Undeclared exception!
      try { 
        dateTimeField0.addWrapField(9223372036854775807L, 2147483187);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DurationField durationField0 = copticChronology0.weeks();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor(1);
      assertEquals((-60000L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      long long0 = dateTimeField0.getDifferenceAsLong(15778476031L, (-2765L));
      assertEquals(4382L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(3660000, 3660000);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfDay();
      DurationField durationField0 = copticChronology0.halfdays();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getDifference(21260793600000L, 1);
      assertEquals(5905775, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.minutes();
      BasicDayOfMonthDateTimeField basicDayOfMonthDateTimeField0 = new BasicDayOfMonthDateTimeField(copticChronology0, durationField0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicDayOfMonthDateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((long) 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for dayOfMonth is not supported: Illegal instant due to time zone offset transition: 1969-12-31T23:38:00.001 (UTC)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfDay();
      DurationField durationField0 = copticChronology0.halfdays();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 1, 1);
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DurationField durationField0 = copticChronology0.weeks();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add(116L, 2057L);
      assertEquals(7405200116L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DurationField durationField0 = copticChronology0.weeks();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, 1);
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, preciseDurationField0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, dateTimeZone0, preciseDurationField0, preciseDurationField0, preciseDurationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      int int0 = dateTimeField0.getMaximumTextLength((Locale) null);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      Locale locale0 = Locale.PRC;
      int int0 = dateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) copticChronology0);
      int[] intArray0 = new int[0];
      int int0 = dateTimeField0.getMinimumValue((ReadablePartial) localDateTime0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      String string0 = dateTimeField0.getAsText((long) 1);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      // Undeclared exception!
      try { 
        dateTimeField0.set((long) 1, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value null for clockhourOfHalfday is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      String string0 = dateTimeField0.getAsShortText((long) 1);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      LocalDateTime localDateTime0 = new LocalDateTime();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        dateTimeField0.add((ReadablePartial) localDateTime0, 1, intArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      LocalDate localDate0 = new LocalDate((long) 1, dateTimeZone0);
      int int0 = dateTimeField0.getMaximumValue((ReadablePartial) localDate0);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      int int0 = dateTimeField0.getMinimumValue((long) 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      int int0 = dateTimeField0.getMaximumValue((long) 1);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) copticChronology0);
      int int0 = dateTimeField0.getMinimumValue((ReadablePartial) yearMonth0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      int int0 = dateTimeField0.getLeapAmount(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      boolean boolean0 = dateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      Locale locale0 = Locale.KOREA;
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      String string0 = dateTimeField0.getAsShortText((ReadablePartial) localDateTime0, locale0);
      assertEquals("9", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      String string0 = dateTimeField0.getAsText(1, (Locale) null);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 4);
      assertEquals((-79271565510996L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      long long0 = dateTimeField0.remainder(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      boolean boolean0 = dateTimeField0.isLeap(1);
      assertFalse(boolean0);
  }
}
