/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:54:15 GMT 2019
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
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(566L, ethiopicChronology0, locale0, (Integer) 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationField durationField0 = buddhistChronology0.months();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      dateTimeParserBucket0.saveField((DateTimeField) unsupportedDateTimeField0, 4);
      dateTimeParserBucket0.saveField(dateTimeField0, (-1131));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1131 for era must be in the range [1,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(566L, ethiopicChronology0, locale0, (Integer) 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      dateTimeParserBucket0.saveField(dateTimeField0, 4);
      dateTimeParserBucket0.saveField(dateTimeField0, (-1131));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 4 for era must be in the range [1,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), ethiopicChronology0, locale0, (Integer) 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"|\": Illegal instant due to time zone offset transition (Europe/Amsterdam)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Value \"\" for dayOfMonth is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-259));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -259 for clockhourOfHalfday must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(538L, ethiopicChronology0, locale0, (Integer) 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 4);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(1199401200000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(538L, ethiopicChronology0, locale0, (Integer) 1);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 4);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(538L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2152L), (Chronology) null, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1705L, (Chronology) null, locale0, (Integer) null, 0);
      boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      boolean boolean0 = dateTimeParserBucket0.restoreState(ethiopicChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("5rr\"v:^~L4e]irTz,R!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"5rr\"v:^~L4e]irTz,R!\" is malformed at \"rr\"v:^~L4e]irTz,R!\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(538L, ethiopicChronology0, locale0, (Integer) 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 4);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, buddhistChronology0);
      dateTimeParserBucket0.saveField(dateTimeField1, (-1131));
      dateTimeParserBucket0.saveField(dateTimeField0, 2469);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      dateTimeParserBucket0.saveField(dateTimeField0, 40);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "lV|r]", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2469 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) null);
      dateTimeParserBucket0.setOffset((-304));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-304), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1064), ethiopicChronology0, locale0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.setOffset((Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.setPivotYear((Integer) null);
      assertNull(dateTimeParserBucket0.getOffsetInteger());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(566L, ethiopicChronology0, locale0, (Integer) 1);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-94L), ethiopicChronology0, locale0, (Integer) 1, (-2907));
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("ita", locale1.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = new Locale("");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1273L, copticChronology0, locale0, (Integer) copticChronology0.AM, (-2442));
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), ethiopicChronology0, locale0, (Integer) 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition (Europe/Amsterdam)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, 0);
      Chronology chronology0 = dateTimeParserBucket0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0, (Integer) 1);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertTrue(dateTimeZone0.isFixed());
  }
}
