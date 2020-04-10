/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 21:35:44 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), copticChronology0, locale0, (Integer) 1, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 7200000);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1663));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2000);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2000);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1663));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2000);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "Cannot parse \"", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 7200000 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), copticChronology0, locale0);
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), copticChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "zkOVsNRaC6U[o0VK{--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"zkOVsNRaC6U[o0VK{--\": Illegal instant due to time zone offset transition (Europe/Amsterdam)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2699L, (Chronology) null, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1039));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "org.joda.time.format.DateTimeParserBucket");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"org.joda.time.format.DateTimeParserBucket\": Value -1039 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "'}Fr(46_r_9\"PB");
      assertEquals((-2723674772000L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1, copticChronology0, locale0, (Integer) null);
      Object object0 = dateTimeParserBucket0.saveState();
      assertNotNull(object0);
      
      boolean boolean0 = dateTimeParserBucket1.restoreState(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      boolean boolean0 = dateTimeParserBucket0.restoreState(copticChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "Both printing and parsing not supported", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"Both printing and parsing not supported\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(30672000000L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.setOffset(2365);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(2365, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-32L), julianChronology0, locale0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateMidnight dateMidnight0 = null;
      try {
        dateMidnight0 = new DateMidnight("35{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"35{\" is malformed at \"{\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      dateTimeParserBucket0.setOffset((Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      dateTimeParserBucket0.setPivotYear((Integer) 1);
      assertEquals(1, (int)dateTimeParserBucket0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, gregorianChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = new Locale("Lm=:~l\"\"");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1534L), iSOChronology0, locale0);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("lm=:~l\"\"", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "Nj2");
      assertEquals((-79271570344000L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(30672000000L, ethiopicChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      Chronology chronology0 = dateTimeParserBucket0.getChronology();
      assertFalse(chronology0.equals((Object)copticChronology0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertEquals("UTC", dateTimeZone0.getID());
  }
}
