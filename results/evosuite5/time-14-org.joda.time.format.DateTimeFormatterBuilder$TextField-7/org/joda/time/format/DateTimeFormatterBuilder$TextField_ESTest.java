/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:48:17 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, ethiopicChronology0, (Locale) null, (Integer) ethiopicChronology0.EE, 1);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "99D.(4jXCkU-j5f6RA", 1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, islamicChronology0, locale0, (Integer) islamicChronology0.AH, 685);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "O2", 1);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1393L, copticChronology0, locale0, (Integer) null, 1);
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "4L0D.,,L@Q5,", 1);
      assertEquals((-2), int0);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer();
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.CANADA_FRENCH;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals(1, stringBuffer0.length());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      Locale locale0 = Locale.TAIWAN;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (-1632L), (Chronology) julianChronology0, 0, (DateTimeZone) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      int int0 = dateTimeFormatterBuilder_TextField0.estimateParsedLength();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      Locale locale0 = Locale.JAPANESE;
      StringBuffer stringBuffer0 = new StringBuffer();
      LocalTime localTime0 = new LocalTime();
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals("21", stringBuffer0.toString());
      assertEquals(2, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      int int0 = dateTimeFormatterBuilder_TextField0.estimateParsedLength();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.CHINESE;
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (-1632L), (Chronology) julianChronology0, 0, (DateTimeZone) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      StringBuffer stringBuffer0 = new StringBuffer();
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (long) (-1796), (Chronology) ethiopicChronology0, (-1796), (DateTimeZone) fixedDateTimeZone0, (Locale) null);
      assertEquals(2, stringBuffer0.length());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.CANADA;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      dateTimeFormatterBuilder_TextField0.printTo((Writer) charArrayWriter0, (ReadablePartial) localTime0, locale0);
      assertEquals("PM", charArrayWriter0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }
}
