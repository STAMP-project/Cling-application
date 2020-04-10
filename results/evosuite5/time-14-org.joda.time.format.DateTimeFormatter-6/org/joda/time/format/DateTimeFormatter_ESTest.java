/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:22:27 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.PipedWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Composite0, (DateTimeParser) null);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Parsing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMutableDateTime("org.joda.time.Partial$Property");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.Partial$Property\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("]");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMutableDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYNA6;iscF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      DateTime dateTime0 = dateTimeFormatter1.parseDateTime("5:!GwYNA6;iscF-f");
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYNA6;iscF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      DateTime dateTime0 = dateTimeFormatter1.parseDateTime("5:!GwYNA6;iscF-f");
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("5:!GwYNA6;isc)-f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"5:!GwYNA6;isc)-f\" is malformed at \":!GwYNA6;isc)-f\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("[W$2u_`Oj-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"[W$2u_`Oj-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("org.joda.time.chrono.GJEraDateTimeField");
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("org.joda.time.chrono.GJEraDateTimeField", "org.joda.time.chrono.GJEraDateTimeField", false, 26, 26);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("org.joda.time.chrono.GJEraDateTimeField");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.parse("2#X|}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"2#X|}\" is malformed at \"#X|}\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("!SXf");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("j\"q=MZj");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      MutableDateTime mutableDateTime0 = dateTimeFormatter1.parseMutableDateTime("j\"q=MZj");
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "j\"q=MZj", 0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(0L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("w5zE`E4ii#:BLsf", "", false, 1204, 1204);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "0", 5);
      assertEquals(1392412881320L, mutableDateTime0.getMillis());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("j\"q=MZj");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = dateTimeFormatter1.parseMutableDateTime("j\"q=MZj");
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "j\"q=MZj", 0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("0");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "0", 2000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, (DateTimeParser) null);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.print(117L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYA6;isF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("5:!GwYA6;isF-f");
      dateTimeFormatter0.printTo((Writer) mockFileWriter0, 1L);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYNA6;iscF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.print((-3600000L));
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("]");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Composite0, dateTimeFormatterBuilder_StringLiteral0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) mockFileWriter0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      PipedWriter pipedWriter0 = new PipedWriter();
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Composite0, dateTimeFormatterBuilder_Composite0);
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) pipedWriter0, (ReadablePartial) localTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("i9$F`[$3:6");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) buddhistChronology0);
      dateTimeFormatter0.print((ReadablePartial) localTime0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((-174));
      Integer integer0 = new Integer(21);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter1);
      assertEquals((-174), (int)dateTimeFormatter1.getPivotYear());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("l$w!e");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(2147483211);
      Integer integer0 = new Integer(2147483211);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer0);
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("0");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone((DateTimeZone) null);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("(");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertTrue(dateTimeFormatter2.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("]0J[3$kL~HRXj<p7_7");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      Locale locale0 = Locale.ITALY;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale((Locale) null);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral(" - ");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYA6;isF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      boolean boolean0 = dateTimeFormatter0.isParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertTrue(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Composite0, (DateTimeParser) null);
      boolean boolean0 = dateTimeFormatter0.isParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(2147481646, hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertTrue(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, (DateTimeParser) null);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      YearMonth yearMonth0 = null;
      try {
        yearMonth0 = new YearMonth("5:!GwYNA6;iscF-f", julianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"5:!GwYNA6;iscF-f\" is malformed at \":!GwYNA6;iscF-f\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      dateTimeFormatter0.getPivotYear();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Composite0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.getChronolgy();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYA6;isF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      int int0 = dateTimeFormatter0.getDefaultYear();
      assertEquals(2000, int0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Parsing not supported");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Appendable) charArrayWriter0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      StringBuffer stringBuffer0 = new StringBuffer("");
      dateTimeFormatter0.printTo((Appendable) stringBuffer0, 30355840L);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(2147481646, hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      boolean boolean0 = dateTimeFormatter0.isOffsetParsed();
      assertFalse(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Appendable) null, (ReadableInstant) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("|`2Yi*\"0IG:<j");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("|`2Yi*\"0IG:<j");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) null, (ReadableInstant) dateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("0");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withDefaultYear(2);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals(2, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("V\"<M");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) null, 9223372036854775807L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime("0");
      assertEquals(1, MutableDateTime.ROUND_FLOOR);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYA6;isF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("5:!GwYA6;isF-f");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("5:!GwYNA6;iscF-f");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalTime("5:!GwYNA6;iscF-f");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      dateTimeFormatter0.getChronology();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }
}
