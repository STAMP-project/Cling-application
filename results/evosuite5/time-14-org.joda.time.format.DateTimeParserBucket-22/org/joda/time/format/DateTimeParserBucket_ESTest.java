/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 03:36:13 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Months;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Months months0 = Months.SEVEN;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      DurationField durationField0 = durationFieldType0.getField((Chronology) null);
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-575L), (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2530));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2530));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "N6Cbs^M2Fj", locale0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType1, "org.joda.time.format.DateTimeParserBucket", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "6oc1R~", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "SSwJ5+(N`/\"k;vo", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org.joda.time.format.DateTimeParserBucket\" for dayOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), (Chronology) null, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition (Europe/Amsterdam)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), (Chronology) null, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, ";V_&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \";V_&\": Illegal instant due to time zone offset transition (Europe/Amsterdam)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-575L), (Chronology) null, locale0);
      dateTimeParserBucket0.setOffset(34);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(34, dateTimeParserBucket0.getOffset());
      assertEquals((-609L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1518L), (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "dayOfMonth", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "dayOfMonth");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"dayOfMonth\": Value \"dayOfMonth\" for millisOfSecond is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1861L), (Chronology) null, (Locale) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, (String) null);
      assertEquals(946681200000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1518L), (Chronology) null, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 3);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(true, "");
      assertEquals((-3601518L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      Object object0 = dateTimeParserBucket1.saveState();
      assertNotNull(object0);
      
      boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      Integer integer0 = new Integer(1);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4711L, iSOChronology0, locale0, integer0);
      Object object0 = new Object();
      boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Instant.parse("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.format.DateTimeFor...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1518L), (Chronology) null, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 3);
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "dayOfMonth", locale0);
      assertNull(dateTimeParserBucket0.getOffsetInteger());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      Integer integer0 = new Integer(1);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4711L, iSOChronology0, locale0, integer0);
      dateTimeParserBucket0.setOffset((-813));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-813), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(10L, (Chronology) null, locale0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1861L), (Chronology) null, locale0);
      Integer integer0 = new Integer(11);
      dateTimeParserBucket0.setOffset(integer0);
      assertNull(dateTimeParserBucket0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2653L), (Chronology) null, locale0);
      dateTimeParserBucket0.setPivotYear((Integer) null);
      assertNull(dateTimeParserBucket0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2055L, (Chronology) null, locale0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis(false, "org.joda.time.Chronology");
      assertEquals(2055L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(10L, (Chronology) null, locale0);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1511L, buddhistChronology0, locale0, (Integer) 1);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("KOR", locale1.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1518L), (Chronology) null, locale0);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1861L), (Chronology) null, (Locale) null);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals((-3601861L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      Integer integer0 = new Integer(1);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4711L, iSOChronology0, locale0, integer0);
      Chronology chronology0 = dateTimeParserBucket0.getChronology();
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      Integer integer0 = new Integer(1);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4711L, iSOChronology0, locale0, integer0);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertEquals("UTC", dateTimeZone0.getID());
  }
}
