/*

 * Tue Mar 03 18:29:43 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("U-'_dF2W~1fD&`C1olt").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      PipedWriter pipedWriter0 = new PipedWriter();
      BufferedWriter bufferedWriter0 = new BufferedWriter(pipedWriter0);
      dateTimeFormatter0.printTo((Writer) bufferedWriter0, (long) 89);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("U-'_dF2W~1fD&`C1olt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"U-'_dF2W~1fD&`C1olt\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      LocalDate.parse("3600");
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1L), (DateTimeZone) null);
      GregorianCalendar gregorianCalendar0 = mutableDateTime0.toGregorianCalendar();
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      dateTimeFormatter0.print((ReadablePartial) localTime0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", false, 1349, 1349);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneOffset0);
      Locale locale0 = Locale.FRENCH;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withLocale(locale0);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("");
      assertEquals(0L, dateTime0.getMillis());
      assertNotSame(dateTimeFormatter0, dateTimeFormatter1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("", " cannot we compared tT ").when(dateTimePrinter0).toString();
      doReturn(1077).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", false, 1349, 1349);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalTime localTime0 = dateTimeFormatter0.parseLocalTime("");
      dateTimeFormatter0.print((ReadablePartial) localTime0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("FsYKgkJt :OO2r");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      StringWriter stringWriter0 = new StringWriter();
      dateTimeFormatter0.printTo((Writer) stringWriter0, 0L);
      dateTimeFormatter0.parseLocalDate("FsYKgkJt :OO2r");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      dateTimeFormatter0.print(0L);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("7#/zFX\"sf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"7#/zFX\"sf\" is malformed at \"#/zFX\"sf\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">-", ">-", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      Locale locale0 = Locale.GERMAN;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.parseLocalDateTime(">-");
      Integer integer0 = new Integer(1);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer0);
      DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withLocale((Locale) null);
      assertFalse(dateTimeFormatter3.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter3.getDefaultYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter1);
      assertNotSame(dateTimeFormatter3, dateTimeFormatter2);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("9[").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      PipedWriter pipedWriter0 = new PipedWriter();
      BufferedWriter bufferedWriter0 = new BufferedWriter(pipedWriter0);
      dateTimeFormatter0.printTo((Writer) bufferedWriter0, (long) 112);
      // Undeclared exception!
      try { 
        LocalTime.parse("WVx+m7rT~8Az|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"WVx+m7rT~8Az|\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\": ", "\": ").when(dateTimeParser0).toString();
      doReturn(8, 8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("{(N");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("Kjg4r)q^&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Kjg4r)q^&\" is malformed at \"&\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      dateTimeFormatter0.withLocale(locale0);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "--01-01", (-60));
      assertEquals(1583260074364L, mutableDateTime0.getMillis());
      assertEquals((-60), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      dateTimeFormatter0.withLocale((Locale) null);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "--01-01", (-60));
      assertEquals(1583260073638L, mutableDateTime0.getMillis());
      assertEquals((-60), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalDateTime localDateTime0 = dateTimeFormatter0.parseLocalDateTime(">/");
      StringWriter stringWriter0 = new StringWriter();
      dateTimeFormatter0.printTo((Writer) stringWriter0, (ReadablePartial) localDateTime0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      dateTimeFormatter1.parseInto(mutableDateTime0, "--01-01", (-60));
      assertEquals(1583263672204L, mutableDateTime0.getMillis());
      
      dateTimeFormatter0.parseLocalTime("--01-01");
      assertNotSame(dateTimeFormatter0, dateTimeFormatter1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", false, 1349, 1349);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneOffset0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("");
      assertEquals(0L, dateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      dateTimeFormatter0.printTo(writer0, (long) (-49));
      // Undeclared exception!
      try { 
        MutableDateTime.parse("\")ziw[Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\")ziw[Q\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("4946");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"4946\" is malformed at \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">/");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(592);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((-168));
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertEquals((-168), (int)dateTimeFormatter2.getPivotYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.parse("Cannot parse \"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Cannot parse \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("FsYKgkJt :OO2r");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.print((long) (-1941));
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("Printing not spported", iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not spported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">-", ">-", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">-");
      String string0 = dateTimeFormatter0.print(31083663600000L);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals("+01:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormat_StyleFormatter0, dateTimeFormat_StyleFormatter0);
      Locale locale0 = Locale.UK;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale((Locale) null);
      // Undeclared exception!
      try { 
        DateMidnight.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("FsYKgkJt :OO2r");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      Locale locale0 = Locale.UK;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale(locale0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("Printing not spported", iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not spported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2231));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone1).convertUTCToLocal(anyLong());
      doReturn((String) null).when(dateTimeZone1).getID();
      doReturn((-2231), 0).when(dateTimeZone1).getOffset(anyLong());
      doReturn(0).when(dateTimeZone1).getOffsetFromLocal(anyLong());
      doReturn((String) null, (String) null).when(dateTimeZone1).toString();
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone1);
      MutableDateTime mutableDateTime0 = new MutableDateTime(chronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1545, chronology0);
      dateTimeFormatter0.print((ReadablePartial) partial0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 848);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      LocalDate.parse("1970");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "1970", 34);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\": ", "\": ").when(dateTimeParser0).toString();
      doReturn(8, 8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime.parse("\": ", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("c8Z3 ]G!(~XR}xgTV%l");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"c8Z3 ]G!(~XR}xgTV%l\" is malformed at \"(~XR}xgTV%l\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeParser0).toString();
      doReturn(4098, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseDateTime("shhR0G");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("T@;a=mBL]J-S");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"T@;a=mBL]J-S\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals((-3600000L), long0);
      
      PipedWriter pipedWriter0 = new PipedWriter();
      dateTimeFormatter0.printTo((Writer) pipedWriter0, (-3600000L));
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      dateTimeFormatter0.parseLocalDateTime("1969");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("yvn.ZwaTwvfEwld");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"yvn.ZwaTwvfEwld\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      dateTimeFormatter0.parseMillis("77483");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("7#/zFX\"sf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"7#/zFX\"sf\" is malformed at \"#/zFX\"sf\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("<?I").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 2000, (Chronology) gregorianChronology0);
      dateTimeFormatter0.printTo(writer0, (ReadablePartial) localDateTime0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("mkQO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"mkQO\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      dateTimeFormatter0.isPrinter();
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("1970");
      assertEquals((-262800000L), mutableDateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      ReadWritableInstant readWritableInstant0 = mock(ReadWritableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(gJChronology0).when(readWritableInstant0).getChronology();
      doReturn(100000000000000000L).when(readWritableInstant0).getMillis();
      dateTimeFormatter0.parseInto(readWritableInstant0, "org.joda.time.field.DecoratedDurationField", (-1558));
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertTrue(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(2058).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("*6U@k4GF~YNVf");
      DateTimeFormatter dateTimeFormatter1 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_StringLiteral0);
      boolean boolean0 = dateTimeFormatter1.isPrinter();
      assertFalse(boolean0);
      
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("");
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "*6U@k4GF~YNVf", 1);
      assertEquals((-2), int0);
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((-818));
      dateTimeFormatter1.withPivotYear((-1388));
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.isPrinter();
      // Undeclared exception!
      try { 
        DateTime.parse("Rv$ns+eW^l#WQ3OU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Rv$ns+eW^l#WQ3OU\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((Integer) null);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("3600");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertSame(dateTimeFormatter0, dateTimeFormatter1);
      assertEquals(0L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      
      dateTimeFormatter0.parseLocalTime("--01-01");
      assertNotSame(dateTimeFormatter0, dateTimeFormatter1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      LocalDate.parse("3600");
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1L), (DateTimeZone) null);
      String string0 = dateTimeFormatter0.print((ReadableInstant) mutableDateTime0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals("3599", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", false, 1349, 1349);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDateTime(" cannot we compared tT ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \" cannot we compared tT \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">/");
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
  public void test40()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      long long0 = dateTimeFormatter0.parseMillis(">/");
      assertEquals(0L, long0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 35, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      dateTimeFormatter0.parseMutableDateTime("21");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("GF|H-P");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"GF|H-P\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      String string0 = dateTimeFormatter0.print((-1L));
      assertEquals("--01-01", string0);
      
      dateTimeFormatter0.parseLocalTime("--01-01");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      dateTimeFormatter0.print(0L);
      LocalDate localDate0 = LocalDate.parse("1970");
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      dateTimeFormatter0.print((-1L));
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "--01-01", (-60));
      assertEquals(1583260050279L, mutableDateTime0.getMillis());
      assertEquals((-60), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\": ").when(dateTimeParser0).toString();
      doReturn(1444).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Integer integer0 = new Integer(112);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(112);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer0);
      dateTimeFormatter2.parseLocalDate("O!RgUgf)Z ynB]");
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertEquals(112, (int)dateTimeFormatter1.getPivotYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalDate.parse("1970");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("7#/zFX\"sf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"7#/zFX\"sf\" is malformed at \"#/zFX\"sf\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      dateTimeFormatter0.parseMutableDateTime("1970");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("Ee");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Ee\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Ecvk/SJwk", "Ecvk/SJwk", true, 2, 2);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("Ecvk/SJwk");
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(2);
      dateTimeFormatter0.printTo((Writer) charArrayWriter0, 3665L);
      assertEquals(6, charArrayWriter0.size());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      dateTimeFormatter0.withLocale((Locale) null);
      dateTimeFormatter0.parseLocalTime("--01-01");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(0);
      assertEquals(0, (int)dateTimeFormatter1.getPivotYear());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      
      dateTimeFormatter0.parseLocalTime("--01-01");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">/");
      Integer integer0 = new Integer(1);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(1);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer0);
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">/");
      // Undeclared exception!
      try { 
        MutableDateTime.parse(">/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \">/\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Appendable) null, 2505L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 35, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      String string0 = dateTimeFormatter0.print(0L);
      assertEquals("1", string0);
      
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("21");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals(72000000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("T<eB)Xc-S=\";(i>7h", "").when(dateTimePrinter0).toString();
      doReturn(1279).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("4$N!%").when(dateTimeParser0).toString();
      doReturn((-292)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-2236)).when(dateTimeZone1).convertUTCToLocal(anyLong());
      doReturn("eo6nZ!_S>fA)jkr1").when(dateTimeZone1).getID();
      doReturn(1, (-2236)).when(dateTimeZone1).getOffset(anyLong());
      doReturn((-735)).when(dateTimeZone1).getOffsetFromLocal(anyLong());
      doReturn((String) null).when(dateTimeZone1).toString();
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone1);
      MutableDateTime mutableDateTime0 = new MutableDateTime(chronology0);
      dateTimeFormatter0.print((-3600011L));
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto(mutableDateTime0, ">>+-|", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \">>+-|\": Illegal instant due to time zone offset transition (null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">/");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("JmvNc;_+$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"JmvNc;_+$\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      dateTimeFormatter0.parseInto(mutableDateTime0, "--01-01", (-60));
      assertEquals(1583260033387L, mutableDateTime0.getMillis());
      
      dateTimeFormatter0.parseLocalTime("--01-01");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 34, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      LocalDate.parse("1970");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((Integer) null);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset transition (").when(dateTimeParser0).toString();
      doReturn(34).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("1LY/V");
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
  public void test60()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormat_StyleFormatter0, dateTimeFormat_StyleFormatter0);
      Locale locale0 = Locale.UK;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale((Locale) null);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("Thursday, January 1, 1970");
      assertEquals((-3600000L), dateTime0.getMillis());
      assertNotSame(dateTimeFormatter0, dateTimeFormatter1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">/");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "U*Fd?nVFr", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 35, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("21");
      dateTimeFormatter1.parseInto(mutableDateTime0, "Te-NB>*DI]N):M", 5);
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertEquals(72000000L, mutableDateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset(">/", ">/", true, 592, 592);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime(">/");
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, ">/", 2813);
      assertEquals(1583260020470L, mutableDateTime0.getMillis());
      assertEquals((-2814), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      dateTimeFormatter0.parseLocalTime("--01-01");
      dateTimeFormatter0.print((ReadablePartial) monthDay0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\": ", "\": ").when(dateTimeParser0).toString();
      doReturn(8, 8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("\": ", dateTimeFormatter0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      dateTimeFormatter1.parseInto(mutableDateTime0, ":_Ne{", 8);
      // Undeclared exception!
      try { 
        DateTime.parse("\": ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\": \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\": ", "\": ").when(dateTimeParser0).toString();
      doReturn(8, 8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("\": ", dateTimeFormatter0);
      dateTimeFormatter0.parseInto(mutableDateTime0, ":_Ne{", 8);
      // Undeclared exception!
      try { 
        DateTime.parse("\": ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\": \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\": ").when(dateTimeParser0).toString();
      doReturn(8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("{(N");
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
  public void test68()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("FsYKgkJt :OO2r");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      StringWriter stringWriter0 = new StringWriter();
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("FsYKgkJt :OO2r");
      assertEquals((-3600000L), dateTime0.getMillis());
      
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 2000, (Chronology) gregorianChronology0);
      dateTimeFormatter0.printTo((Writer) stringWriter0, (ReadablePartial) localDateTime0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 35, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      Locale locale0 = Locale.US;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(35);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withLocale(locale0);
      DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withPivotYear(54);
      DateTime dateTime0 = dateTimeFormatter3.parseDateTime("1");
      assertFalse(dateTimeFormatter3.isOffsetParsed());
      assertNotSame(dateTimeFormatter3, dateTimeFormatter2);
      assertEquals(0L, dateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertEquals(54, (int)dateTimeFormatter3.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((-818));
      Integer integer0 = new Integer((-818));
      dateTimeFormatter1.withPivotYear(integer0);
      // Undeclared exception!
      try { 
        DateTime.parse("Rv$ns+eW^l#WQ3OU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Rv$ns+eW^l#WQ3OU\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}
