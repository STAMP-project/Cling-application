/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 02:50:18 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.Writer;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat$StyleFormatter_ESTest extends DateTimeFormat$StyleFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-1153), (-1153), 2);
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.getPattern(locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -1153
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(28265625, 28265625, 1);
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.getPattern(locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 28265625
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((StringBuffer) null, (ReadablePartial) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 800);
      Locale locale0 = Locale.CANADA_FRENCH;
      Integer integer0 = new Integer(800);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, (Chronology) null, locale0, integer0, 4);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.parseInto(dateTimeParserBucket0, "sv@s:S", 800);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: fr_CA
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(28181250, 28181250, 0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.CHINA;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, gregorianChronology0, locale0, integer0, 0);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) null, (long) 28181250, (Chronology) gregorianChronology0, 0, dateTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 28181250
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-477), 0, 0);
      int int0 = dateTimeFormat_StyleFormatter0.estimateParsedLength();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(683, 683, 8);
      StringBuffer stringBuffer0 = new StringBuffer(10);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo(stringBuffer0, (ReadablePartial) null, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: en
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(683, (-349), 683);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((StringBuffer) null, (long) (-349), (Chronology) buddhistChronology0, 1, (DateTimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: 
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(28181250, 28181250, 0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) charArrayWriter0, (ReadablePartial) localTime0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 28181250
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 800);
      int int0 = dateTimeFormat_StyleFormatter0.estimatePrintedLength();
      assertEquals(40, int0);
  }
}
