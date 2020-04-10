/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 21:29:19 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-475L), copticChronology0, (Locale) null, (Integer) copticChronology0.AM, 1745);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "oh8^n*T#ETmO%2^PA", 2);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1680L), copticChronology0, (Locale) null, (Integer) copticChronology0.AM, 1);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "", 1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1587L, copticChronology0, (Locale) null, (Integer) 1, 1);
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, (String) null, 1);
      assertEquals((-2), int0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now((Chronology) copticChronology0);
      Locale locale0 = Locale.TAIWAN;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals("\uFFFD", stringBuffer0.toString());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      int int0 = dateTimeFormatterBuilder_TextField0.estimateParsedLength();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      StringBuffer stringBuffer0 = new StringBuffer(1745);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      Locale locale0 = Locale.KOREAN;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("7", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      int int0 = dateTimeFormatterBuilder_TextField0.estimateParsedLength();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      GJChronology gJChronology0 = GJChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      dateTimeFormatterBuilder_TextField0.printTo((Writer) charArrayWriter0, (-139L), (Chronology) gJChronology0, 623191204, (DateTimeZone) null, locale0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      StringWriter stringWriter0 = new StringWriter(2554);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, 470L, (Chronology) copticChronology0, 2554, dateTimeZone0, (Locale) null);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test9()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now((Chronology) copticChronology0);
      Locale locale0 = Locale.TAIWAN;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      dateTimeFormatterBuilder_TextField0.printTo((Writer) charArrayWriter0, (ReadablePartial) yearMonth0, locale0);
      assertEquals(4, charArrayWriter0.size());
      assertEquals("1730", charArrayWriter0.toString());
  }
}
