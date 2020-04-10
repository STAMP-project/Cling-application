/*

 * Tue Mar 03 18:27:35 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("BE", (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"BE\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("jqD}{$").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("fs6yij9").when(dateTimeParser0).toString();
      doReturn(3896).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Instant instant0 = Instant.parse("", dateTimeFormatter0);
      dateTimeFormatter0.printTo(stringBuffer0, (ReadableInstant) instant0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("4Sd4){}=Cgij^-,ZO");
      Locale locale0 = Locale.GERMAN;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.parse("ce");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ce\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      DateTime dateTime0 = DateTime.now();
      dateTimeFormatter0.printTo(writer0, (ReadableInstant) dateTime0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"G\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      
      String string0 = dateTimeFormatter0.print((long) 1);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals(0L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("weekyearOfCentury", "weekyearOfCentury", true, 34, 34);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalTime localTime0 = dateTimeFormatter0.parseLocalTime("weekyearOfCentury");
      dateTimeFormatter0.printTo((Writer) null, (ReadablePartial) localTime0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(4);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(1);
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(1, (int)dateTimeFormatter2.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("4Sd4){}=Cgij^-,ZO");
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMillis("");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("jBAy1G9sf{V-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"jBAy1G9sf{V-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("9BCd; f2Oj#", dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"9BCd; f2Oj#\" is malformed at \"BCd; f2Oj#\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("weekyearOfCentury", "weekyearOfCentury", true, 34, 34);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      Integer integer0 = new Integer(34);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      Integer integer1 = new Integer(34);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer1);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      
      dateTimeFormatter0.parseLocalTime("weekyearOfCentury");
      assertNotSame(dateTimeFormatter0, dateTimeFormatter2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.parse("4Sd4){}=Cgij^-,ZO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"4Sd4){}=Cgij^-,ZO\" is malformed at \"Sd4){}=Cgij^-,ZO\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Printing not supported").when(dateTimeParser0).toString();
      doReturn(166).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("Value ");
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime("Printing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("jqD}{$", "jqD}{$").when(dateTimePrinter0).toString();
      doReturn(3896).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalDate localDate0 = LocalDate.now();
      dateTimeFormatter0.print((ReadablePartial) localDate0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("4Sd4){}=Cgij^-,ZO");
      String string0 = dateTimeFormatter0.print((-3599171L));
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals("+01:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("4Sd4){}=Cgij^-,ZO");
      String string0 = dateTimeFormatter0.print(15778800000L);
      assertEquals("+01:00:00.000", string0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.withLocale((Locale) null);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("jBAy1G9sf{V-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"jBAy1G9sf{V-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("7]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"7]\" is malformed at \"]\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      Locale locale0 = Locale.ITALY;
      dateTimeFormatter0.withLocale(locale0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("Xcfrv_|66E(I*m~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Xcfrv_|66E(I*m~\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeParser0).toString();
      doReturn(0, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalTime("org.joda.time.LocalTime$Property");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.LocalTime$Property\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("The field type must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"The field type must not be null\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(86).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      DateTime dateTime0 = DateTime.parse("G", dateTimeFormatter0);
      dateTimeFormatter0.printTo(writer0, (ReadableInstant) dateTime0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"G\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(86).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      DateTime dateTime0 = DateTime.now();
      dateTimeFormatter0.printTo(writer0, (ReadableInstant) dateTime0);
      assertEquals(1583260002514L, dateTime0.getMillis());
      
      dateTimeFormatter0.parseLocalTime("3>ti*<");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 1);
      dateTimeFormatter0.parseMutableDateTime(string0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalTime("V.c6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"V.c6\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(86).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = dateTimeFormatter0.parseLocalTime("3>ti*<");
      dateTimeFormatter0.printTo((Writer) null, (ReadablePartial) localTime0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"G\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(3600L);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "9BCd; f2Oj#", 4);
      assertEquals((-5), int0);
      assertEquals(3600L, mutableDateTime0.getMillis());
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertTrue(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("0001");
      assertEquals(946681200000L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(1933).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("");
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("pXGSa4(~+%O4tzn&").when(dateTimeParser0).toString();
      doReturn(5).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(boolean0);
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      ReadWritableInstant readWritableInstant0 = mock(ReadWritableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(islamicChronology0).when(readWritableInstant0).getChronology();
      doReturn((long)2).when(readWritableInstant0).getMillis();
      dateTimeFormatter0.parseInto(readWritableInstant0, "' is not supported", 1);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(4);
      dateTimeFormatter1.withPivotYear(1);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.isPrinter();
      // Undeclared exception!
      try { 
        MutableDateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("|)h\u0002pLqd").when(dateTimeParser0).toString();
      doReturn(86).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalTime("3>ti*<");
      Locale locale0 = Locale.ROOT;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      Locale locale1 = new Locale("");
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withLocale(locale1);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("4Sd4){}=Cgij^-,ZO");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals(0L, dateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("wGzM,o7`W~(Ltsn,{g#", "Value ").when(dateTimePrinter0).toString();
      doReturn(19).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.print((long) (-2610));
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime("Printing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Instant must not be null", "", true, 1812, 1812);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("Illegal instant due to time zone offset transition (");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Illegal instant due to time zone...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print(6L);
      assertEquals("0001", string0);
      
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("0001");
      assertEquals(946681200000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(3600L);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "9BCd; f2Oj#", 4);
      assertEquals(3600L, mutableDateTime0.getMillis());
      assertEquals((-5), int0);
      
      String string0 = dateTimeFormatter0.print((-1L));
      assertEquals("0001", string0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("|)h\u0002pLqd", "").when(dateTimeParser0).toString();
      doReturn(86).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalTime("3>ti*<");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, (String) null, 86);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("0001");
      assertEquals(946681200000L, dateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 1);
      long long0 = dateTimeFormatter0.parseMillis(string0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("weekyearOfCentury", "weekyearOfCentury", true, 34, 34);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 34);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "weekyearOfCentury", 1);
      assertEquals(34L, mutableDateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals((-2), int0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      
      long long0 = dateTimeFormatter0.parseMillis("+01:00:00.000");
      assertEquals((-3600000L), long0);
      assertNotSame(dateTimeFormatter0, dateTimeFormatter1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 1);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('.');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_CharacterLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      dateTimeFormatter1.parseInto(mutableDateTime0, "9BCd; f2Oj#", 0);
      assertEquals(1583259985561L, mutableDateTime0.getMillis());
      
      MutableDateTime mutableDateTime1 = dateTimeFormatter0.parseMutableDateTime(".");
      assertEquals((-3600000L), mutableDateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("4Sd4){}=Cgij^-,ZO");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("_7a/cJ2'Xrb*hq{+]}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"_7a/cJ2'Xrb*hq{+]}\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 1);
      dateTimeFormatter0.parseLocalTime(string0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(166).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("Yl_lA");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.print((ReadableInstant) mutableDateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 1);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      Locale locale0 = Locale.GERMANY;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("4Sd4){}=Cgij^-,ZO");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("\"196td ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"196td \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(166).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((-2610));
      dateTimeFormatter0.parseLocalTime("Jd@Tph`q+|p_?d]){X");
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((-2610));
      assertEquals((-2610), (int)dateTimeFormatter2.getPivotYear());
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("");
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo(stringBuffer0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("4Sd4){}=Cgij^-,ZO", "4Sd4){}=Cgij^-,ZO", true, 34, 1487);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalTime localTime0 = dateTimeFormatter0.parseLocalTime("4Sd4){}=Cgij^-,ZO");
      StringBuffer stringBuffer0 = new StringBuffer(".8oO~U");
      dateTimeFormatter0.printTo(stringBuffer0, (ReadablePartial) localTime0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('.');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_CharacterLiteral0);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      dateTimeFormatter0.parseInto(mutableDateTime0, "9BCd; f2Oj#", 0);
      assertEquals(1583259978908L, mutableDateTime0.getMillis());
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale((Locale) null);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("weekyearOfCentury", "weekyearOfCentury", true, 34, 34);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 34);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "weekyearOfCentury", 1);
      assertEquals((-2), int0);
      assertEquals(34L, mutableDateTime0.getMillis());
      
      long long0 = dateTimeFormatter0.parseMillis("+01:00:00.000");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals((-3600000L), long0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("wQcJ-`").when(dateTimeParser0).toString();
      doReturn(151).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals((-3600000L), long0);
      
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("njPVHm>bB)y$=N{7", "", false, 151, 2000);
      DateTimeFormatter dateTimeFormatter1 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter1.parseLocalDate("");
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 1);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(1000000000000L, (Chronology) gJChronology0);
      dateTimeFormatter0.printTo(stringBuffer0, (ReadablePartial) monthDay0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2657, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_FixedNumber0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      dateTimeFormatter1.parseInto(mutableDateTime0, "e_6%D|E)Z3T}CrFd", 2540);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("e_6%D|E)Z3T}CrFd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"e_6%D|E)Z3T}CrFd\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((-1L));
      assertEquals("0001", string0);
      
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("0001");
      assertEquals(946681200000L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(7945856L, (DateTimeZone) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 3);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("jBAy1G9sf{V-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"jBAy1G9sf{V-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("WnBARbbQbPY|g,").when(dateTimePrinter0).toString();
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("WnBARbbQbPY|g,");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseDateTime("WnBARbbQbPY|g,");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(3600L);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "9BCd; f2Oj#", 4);
      assertEquals((-5), int0);
      assertEquals(3600L, mutableDateTime0.getMillis());
      
      MutableDateTime mutableDateTime1 = dateTimeFormatter0.parseMutableDateTime("0001");
      assertEquals(946681200000L, mutableDateTime1.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2668, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(7934848L);
      String string0 = dateTimeFormatter0.print((long) 1);
      MutableDateTime mutableDateTime1 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(0L, mutableDateTime1.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((Integer) mutableDateTime0.ROUND_HALF_FLOOR);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(39);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(39, (int)dateTimeFormatter2.getPivotYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((-2610));
      dateTimeFormatter1.withPivotYear((-2610));
      // Undeclared exception!
      try { 
        MutableDateTime.parse("&1d#Pa0@5<!lWU=v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"&1d#Pa0@5<!lWU=v\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}
