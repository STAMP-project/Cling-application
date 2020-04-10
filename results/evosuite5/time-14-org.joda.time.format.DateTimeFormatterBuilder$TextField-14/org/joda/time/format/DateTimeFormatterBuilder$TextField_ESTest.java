/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 21:33:40 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(999);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1460L), lenientChronology0, (Locale) null, (Integer) buddhistChronology0.BE, 999);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "d4KK%S!w+vzTJiF", 1);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(330);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      Locale locale0 = Locale.US;
      Integer integer0 = new Integer((-1313));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-208L), gregorianChronology0, locale0, integer0, 352831696);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "~XD}GpvxOm7^1+", 50);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = new Locale("q");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), copticChronology0, locale0, (Integer) 1, 3);
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "q", 1393);
      assertEquals((-1394), int0);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer();
      LocalTime localTime0 = new LocalTime(0, 0, 0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, (Locale) null);
      assertEquals("0", stringBuffer0.toString());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      int int0 = dateTimeFormatterBuilder_TextField0.estimatePrintedLength();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(609L, (Chronology) copticChronology0);
      Locale locale0 = new Locale("q");
      StringBuffer stringBuffer0 = new StringBuffer();
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) monthDay0, locale0);
      assertEquals("\uFFFD", stringBuffer0.toString());
      assertEquals(1, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      int int0 = dateTimeFormatterBuilder_TextField0.estimateParsedLength();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringWriter stringWriter0 = new StringWriter(6);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 2432L, 6);
      Locale locale0 = Locale.ENGLISH;
      dateTimeFormatterBuilder_TextField0.printTo((Writer) stringWriter0, (-513L), (Chronology) gJChronology0, 1447, (DateTimeZone) null, locale0);
      assertEquals("59", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((StringBuffer) null, 24L, (Chronology) gJChronology0, 10, (DateTimeZone) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = new Locale("q");
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      LocalTime localTime0 = LocalTime.now();
      dateTimeFormatterBuilder_TextField0.printTo((Writer) mockPrintWriter0, (ReadablePartial) localTime0, locale0);
      assertEquals("21", charArrayWriter0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }
}
