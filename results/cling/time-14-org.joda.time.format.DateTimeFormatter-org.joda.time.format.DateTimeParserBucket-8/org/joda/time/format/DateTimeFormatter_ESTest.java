/*

 * Tue Mar 03 18:27:59 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals(0L, long0);
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((Integer) null);
      long long0 = dateTimeFormatter1.parseMillis("");
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("ry}}S", "ry}}S").when(dateTimePrinter0).toString();
      doReturn(3258).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = new LocalTime();
      dateTimeFormatter0.print((ReadablePartial) localTime0);
      // Undeclared exception!
      try { 
        LocalDateTime.parse("Zqj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Zqj\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", false, 119, 119);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(466L, (DateTimeZone) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "W#t", 1);
      assertEquals(3600466L, mutableDateTime0.getMillis());
      
      Date date0 = new Date(1);
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      Partial partial0 = new Partial(localDate0);
      dateTimeFormatter0.printTo((StringBuffer) null, (ReadablePartial) partial0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(342).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals((-3600000L), long0);
      
      StringWriter stringWriter0 = new StringWriter();
      dateTimeFormatter0.printTo((Writer) stringWriter0, 18L);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      Locale locale0 = Locale.ENGLISH;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("K#^8E.").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("K#^8E.").when(dateTimeParser0).toString();
      doReturn(3099).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      long long0 = dateTimeFormatter0.parseMillis("K#^8E.");
      assertEquals((-3600000L), long0);
      
      dateTimeFormatter0.printTo((Writer) null, (-3243L));
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(84, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      dateTimeFormatter0.parseMillis("");
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto(mutableDateTime0, "", 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "m@H$7,/", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("m@H$7,/", dateTimeFormatter0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "m@H$7,/", 93);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("m~;MNEcc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"m~;MNEcc\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      StringWriter stringWriter0 = new StringWriter();
      dateTimeFormatter0.printTo((Writer) stringWriter0, 18L);
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("org.joda.time.LocalTime");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.LocalTime\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("K#^8E.").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.printTo((Writer) null, (-3243L));
      // Undeclared exception!
      try { 
        MutableDateTime.parse("O2}ReJ$beSl`Lytxg}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"O2}ReJ$beSl`Lytxg}\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(292278990).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMillis("");
      // Undeclared exception!
      try { 
        DateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.parse("8J/MhgvjO@rz.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8J/MhgvjO@rz.\" is malformed at \"J/MhgvjO@rz.\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Illegal instant due to time zone offset transition (");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("Illegal instant due to time zone offset transition (");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("org.joda.time.chrono.GJChronology$CutoverField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.chrono.GJChronolog...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$),/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime.parse("", dateTimeFormatter0);
      StringBuffer stringBuffer0 = new StringBuffer("?!w\"1");
      dateTimeFormatter0.printTo(stringBuffer0, (-110L));
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 119, 119);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(466L, (DateTimeZone) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "W#t", 1);
      mutableDateTime0.toString("m@H$7,/", (Locale) null);
      assertEquals(3600466L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.withLocale((Locale) null);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("O2}ReJ$beSl`Lytxg}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"O2}ReJ$beSl`Lytxg}\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Instant.parse("8J/MhgvjO@rz.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8J/MhgvjO@rz.\" is malformed at \"J/MhgvjO@rz.\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Printing not supported");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_StringLiteral0);
      Locale locale0 = Locale.CHINESE;
      dateTimeFormatter0.withLocale(locale0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("Printing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset transition (", "Illegal instant due to time zone offset transition (").when(dateTimeParser0).toString();
      doReturn(45, 45).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("^(fA32Dl=m@qX[S8");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("Illegal instant due to time zone offset transition (");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Illegal instant due to time zone offset transition (\" is malformed at \"ition (\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("");
      assertEquals(0L, dateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      dateTimeFormatter0.parseMillis("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("m@H$7,/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"m@H$7,/\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeParser0).toString();
      doReturn(0, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("8J/MhgvjO@rz.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8J/MhgvjO@rz.\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("S9h", (String) null).when(dateTimeParser0).toString();
      doReturn(0, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 1116, 1116);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("ISOChronology[Europe/Amsterdam]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ISOChronology[Europe/Amsterdam]\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", false, 119, 119);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(466L, (DateTimeZone) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "W#t", 1);
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
  public void test25()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset transition (").when(dateTimeParser0).toString();
      doReturn(41).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals((-3600000L), long0);
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(342).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(5975680L, (DateTimeZone) fixedDateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 1);
      assertEquals(5975680L, mutableDateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("T#jG2:c!*-I1B$61h").when(dateTimeParser0).toString();
      doReturn(84).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.isPrinter();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) julianChronology0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "T#jG2:c!*-I1B$61h", 2);
      assertEquals(1583260017273L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Printing not supported");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_StringLiteral0);
      Integer integer0 = new Integer(2514);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      dateTimeFormatter1.withPivotYear((-720));
      // Undeclared exception!
      try { 
        MutableDateTime.parse("Printing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.isPrinter();
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("org.joda.time.LocalTime");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.LocalTime\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
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
  @Ignore
  public void test32()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      dateTimeFormatter0.parseMillis("");
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Instant instant0 = mutableDateTime0.toInstant();
      dateTimeFormatter0.print((ReadableInstant) instant0);
      assertEquals(1583260015718L, instant0.getMillis());
      assertEquals(1583260015718L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", false, 119, 119);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(466L, (DateTimeZone) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "W#t", 1);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("& 8w3n+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"& 8w3n+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals(0L, long0);
      
      Locale locale0 = Locale.TAIWAN;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("K#^8E.").when(dateTimeParser0).toString();
      doReturn(3099).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      long long0 = dateTimeFormatter0.parseMillis("K#^8E.");
      assertEquals((-3600000L), long0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertSame(dateTimeFormatter0, dateTimeFormatter1);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("ry}}S", "ry}}S").when(dateTimePrinter0).toString();
      doReturn(3231).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ry}}S").when(dateTimeParser0).toString();
      doReturn(3231).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = new LocalTime();
      dateTimeFormatter0.print((ReadablePartial) localTime0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeZone0).getID();
      doReturn(657).when(dateTimeZone0).getOffset(anyLong());
      doReturn(24).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter1.parseDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition ()
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimePrinter0).toString();
      doReturn(342).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.print(30L);
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("org.joda.time.LocalTime");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.LocalTime\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime.parse("", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDateTime("|ffWOUE}yh:oH?B8Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"|ffWOUE}yh:oH?B8Q\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 119, 119);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(466L, (DateTimeZone) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "W#t", 1);
      MutableDateTime mutableDateTime1 = null;
      try {
        mutableDateTime1 = new MutableDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ry}}S", " `W';x%.yr b").when(dateTimeParser0).toString();
      doReturn(3231, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) fixedDateTimeZone0);
      dateTimeFormatter1.parseInto(mutableDateTime0, "", 5);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeZone0).getID();
      doReturn(657).when(dateTimeZone0).getOffset(anyLong());
      doReturn(24).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter2.parseDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition ()
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(466L, (DateTimeZone) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "W#t", 1);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("m@H$7,/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"m@H$7,/\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(342).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      StringWriter stringWriter0 = new StringWriter();
      LocalDate localDate0 = dateTimeFormatter0.parseLocalDate("uV");
      dateTimeFormatter0.printTo((Writer) stringWriter0, (ReadablePartial) localDate0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("The partial must not be null").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.printTo((StringBuffer) null, (-572L));
      // Undeclared exception!
      try { 
        DateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(34).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(34);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((Integer) null);
      dateTimeFormatter2.parseLocalDateTime("YZ5^JA$DtLo0`l6{x");
      assertEquals(34, (int)dateTimeFormatter1.getPivotYear());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.LocalTime$Property", "org.joda.time.LocalTime$Property").when(dateTimeParser0).toString();
      doReturn(59).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseMillis("org.joda.time.LocalTime$Property");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "PST", 59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("", "n").when(dateTimeParser0).toString();
      doReturn(292278990, 65535).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("z5w[+PCk@^w");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      dateTimeFormatter1.parseInto(mutableDateTime0, "W#t", 2);
      assertEquals(0L, mutableDateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime.parse("", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) null, (-264L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("");
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      dateTimeFormatter0.printTo((Writer) pipedWriter0, (long) 120);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "m@H$7,/", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("m@H$7,/", dateTimeFormatter0);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "m@H$7,/", 93);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals((-94), int0);
      assertEquals(0L, mutableDateTime0.getMillis());
      assertTrue(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(2);
      assertEquals(2, (int)dateTimeFormatter2.getPivotYear());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("9");
      assertEquals((-61883137172000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("");
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
  public void test53()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(2514).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("");
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
  public void test54()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 372, false, 372);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_PaddedNumber0);
      dateTimeFormatter0.withPivotYear((Integer) null);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((-2526L), (Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto(mutableDateTime0, "MMm41bJ0^IEiIE<Bh", 3);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Cannot parse \"MMm41bJ0^IEiIE<Bh\": Value 41 for clockhourOfHalfday must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      dateTimeFormatter1.parseInto(mutableDateTime0, "m@H$7,/", 93);
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
  @Ignore
  public void test56()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ry}}S").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.withPivotYear(2829);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeZone0).getID();
      doReturn(657).when(dateTimeZone0).getOffset(anyLong());
      doReturn(24).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter1.parseDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition ()
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset transition (").when(dateTimeParser0).toString();
      doReturn(41).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals((-3600000L), long0);
      
      Integer integer0 = new Integer(0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(0);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(119);
      assertEquals(119, (int)dateTimeFormatter1.getPivotYear());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      
      long long0 = dateTimeFormatter0.parseMillis("");
      assertNotSame(dateTimeFormatter0, dateTimeFormatter1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("T#jG2:c!*-I1B$61h").when(dateTimeParser0).toString();
      doReturn(84).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      StringWriter stringWriter0 = new StringWriter();
      LocalDate localDate0 = dateTimeFormatter0.parseLocalDate("T#jG2:c!*-I1B$61h");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) stringWriter0, (ReadablePartial) localDate0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimePrinter0).toString();
      doReturn(342).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(342).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.print(30L);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals((-3600000L), long0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 119, 119);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(466L, (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((Integer) 2);
      dateTimeFormatter1.parseLocalDate("");
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((Integer) mutableDateTime0.ROUND_CEILING);
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("5BB&K78{o$7}6:", "5BB&K78{o$7}6:").when(dateTimePrinter0).toString();
      doReturn(86400000).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("]<$cZ,i=UNcay,U\"").when(dateTimeParser0).toString();
      doReturn(4539).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("#g`/<s?:A");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.print((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("ry}}S", "ry}}S").when(dateTimePrinter0).toString();
      doReturn(3231).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ry}}S").when(dateTimeParser0).toString();
      doReturn(3231).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = new LocalTime();
      dateTimeFormatter0.print((ReadablePartial) localTime0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) fixedDateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 5);
      assertEquals(1583259976159L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Illegal instant due to time zone offset transition (");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      Locale locale0 = Locale.GERMANY;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.parseLocalDate("Illegal instant due to time zone offset transition (");
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(120, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "m@H$7,/", true, 120, 120);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("m@H$7,/", dateTimeFormatter0);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "m@H$7,/", 93);
      assertEquals((-94), int0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      dateTimeFormatter0.parseLocalDate("m@H$7,/");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      dateTimeFormatter0.parseLocalDateTime("");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("<wv^>+2pue7DZpN9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"<wv^>+2pue7DZpN9\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("The partial must not be null").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(292278990).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("");
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      
      dateTimeFormatter0.printTo((StringBuffer) null, (-572L));
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Aa(kX#u").when(dateTimeParser0).toString();
      doReturn((-2738)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((-4464L), (DateTimeZone) null);
      dateTimeFormatter1.parseInto(mutableDateTime0, "Aa(kX#u", (-1533));
      MutableDateTime mutableDateTime1 = null;
      try {
        mutableDateTime1 = new MutableDateTime("Aa(kX#u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Aa(kX#u\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(119, hashMap0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("m@H$7,/", "", true, 119, 119);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalDate localDate0 = dateTimeFormatter0.parseLocalDate("");
      dateTimeFormatter0.printTo((Writer) null, (ReadablePartial) localDate0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Integer integer0 = new Integer(372);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 372, false, 372);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_PaddedNumber0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(16);
      dateTimeFormatter1.withPivotYear(integer0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((-2526L), (Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto(mutableDateTime0, "MMm41bJ0^IEiIE<Bh", 3);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Cannot parse \"MMm41bJ0^IEiIE<Bh\": Value 41 for clockhourOfHalfday must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Printing not supported");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_StringLiteral0);
      Integer integer0 = new Integer(2514);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      dateTimeFormatter1.withPivotYear(2514);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("Printing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}
