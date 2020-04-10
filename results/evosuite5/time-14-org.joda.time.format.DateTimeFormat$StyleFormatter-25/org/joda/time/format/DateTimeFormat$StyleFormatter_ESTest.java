/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 02:50:47 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat$StyleFormatter_ESTest extends DateTimeFormat$StyleFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(2, 2, 2);
      Locale locale0 = Locale.CHINESE;
      String string0 = dateTimeFormat_StyleFormatter0.getPattern(locale0);
      assertEquals("yyyy-M-d H:mm:ss", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-1), 2607, 1);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.getPattern((Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 2607
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      Locale locale0 = Locale.KOREAN;
      String string0 = dateTimeFormat_StyleFormatter0.getPattern(locale0);
      assertEquals("yyyy'\uB144' M'\uC6D4' d'\uC77C' EEEE", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1026, 4, 4);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1026);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) charArrayWriter0, (ReadablePartial) null, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: en
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.parseInto((DateTimeParserBucket) null, "Mrg_N&", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = Locale.CHINA;
      dateTimeFormat_StyleFormatter0.printTo((Writer) stringWriter0, (long) 0, (Chronology) gJChronology0, 2262, dateTimeZone0, locale0);
      assertEquals("1970\u5E741\u67081\u65E5 \u661F\u671F\u56DB", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1425, 1425, 15356250);
      int int0 = dateTimeFormat_StyleFormatter0.estimateParsedLength();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      StringBuffer stringBuffer0 = new StringBuffer();
      MonthDay monthDay0 = new MonthDay();
      Locale locale0 = Locale.KOREAN;
      dateTimeFormat_StyleFormatter0.printTo(stringBuffer0, (ReadablePartial) monthDay0, locale0);
      assertEquals(14, stringBuffer0.length());
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uB144 2\uC6D4 14\uC77C \uFFFD", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      StringBuffer stringBuffer0 = new StringBuffer();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.FRENCH;
      dateTimeFormat_StyleFormatter0.printTo(stringBuffer0, 0L, (Chronology) ethiopicChronology0, 0, (DateTimeZone) null, locale0);
      assertEquals(15, stringBuffer0.length());
      assertEquals("jeudi 23 4 1962", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      int int0 = dateTimeFormat_StyleFormatter0.estimatePrintedLength();
      assertEquals(40, int0);
  }
}
