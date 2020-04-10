/*

 * Tue Mar 03 18:28:53 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate("8T\"M~%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8T\"M~%\" is malformed at \"T\"M~%\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 2264, false);
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_MatchingParser0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2264, buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, 41);
      int int0 = dateTimeFormatterBuilder_MatchingParser0.parseInto(dateTimeParserBucket0, "", 2146922800);
      dateTimeFormatter0.parseMillis("");
      int int1 = dateTimeFormatterBuilder_MatchingParser0.parseInto(dateTimeParserBucket0, "", 8);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 2264, false);
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.withLocale((Locale) null);
      // Undeclared exception!
      try { 
        Instant.parse("");
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
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Locale locale0 = Locale.KOREAN;
      dateTimeFormatter0.withLocale(locale0);
      // Undeclared exception!
      try { 
        Instant.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("The partial must not be null", "The partial must not be null").when(dateTimeParser0).toString();
      doReturn(1518, 8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("The partial must not be null");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeParser0);
      MutableDateTime.parse("The partial must not be null", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("Cannot parse \"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Cannot parse \"\" is malformed at \"arse \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("p}fd)!g,", (String) null).when(dateTimeParser0).toString();
      doReturn(10).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("Z");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "Z", 1080);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[12];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("o~*Xgk\"ZNBKw,o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"o~*Xgk\"ZNBKw,o\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.isPrinter();
      // Undeclared exception!
      try { 
        YearMonth.parse("Fbt>m>h$b@ %bQ6k)$s");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Fbt>m>h$b@ %bQ6k)$s\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 2264, false);
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_MatchingParser0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      dateTimeFormatter0.printTo((Writer) charArrayWriter0, (long) 2264);
      // Undeclared exception!
      try { 
        Instant.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(7L, 1940L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      dateTimeFormatter0.withPivotYear((Integer) yearMonth0.MONTH_OF_YEAR);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("CTT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"CTT\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Parsing not supported");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("Parsing not supported");
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      dateTimeFormatter0.printTo(writer0, (ReadableInstant) dateTime0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Z\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 2264, false);
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_MatchingParser0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2264, buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, 41);
      dateTimeFormatterBuilder_MatchingParser0.parseInto(dateTimeParserBucket0, "", 2146922800);
      dateTimeFormatterBuilder_MatchingParser0.parseInto(dateTimeParserBucket0, "", 8);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDateTime("?N]RSfkQ)K_G'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"?N]RSfkQ)K_G'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 465);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(333);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeParserArray0[1]);
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = gJChronology0.getGregorianCutover();
      dateTimeFormatter0.printTo((Appendable) charArrayWriter0, (ReadableInstant) instant0);
      assertEquals("Vr6Kw[M#p\"V_nyjKe", charArrayWriter0.toString());
      
      dateTimeFormatter0.parseLocalTime("Vr6Kw[M#p\"V_nyjKe");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", true, 18, 470);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseLocalDateTime("Vr6Kw[M#p\"V_nyjKe");
      Locale locale0 = Locale.GERMAN;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale((Locale) null);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset trasition (").when(dateTimeParser0).toString();
      doReturn(1706).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseDateTime("o~*Xgk\"ZNBKw,o");
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("o~*Xgk\"ZNBKw,o", (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"o~*Xgk\"ZNBKw,o\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("1Fn#K1E#m/1>(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"1Fn#K1E#m/1>(\" is malformed at \"Fn#K1E#m/1>(\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", true, 18, 470);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      long long0 = dateTimeFormatter0.parseMillis("Vr6Kw[M#p\"V_nyjKe");
      assertEquals(0L, long0);
      
      Locale locale0 = Locale.GERMAN;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withLocale(locale0);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Field must not be null");
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "").when(dateTimeParser0).toString();
      doReturn(15, 18).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeParser0);
      dateTimeFormatter0.parseLocalTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("Field must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Field must not be null\" is malformed at \"null\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 2264, false);
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMutableDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDateTime("?N]RSfkQ)K_G'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"?N]RSfkQ)K_G'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 2264, false);
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_MatchingParser0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(2264);
      dateTimeFormatter0.printTo((Writer) charArrayWriter0, (long) 2264);
      assertEquals("1", charArrayWriter0.toString());
      
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("");
      assertEquals((-3600000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("CTT").when(dateTimeParser0).toString();
      doReturn(256).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      dateTimeFormatter0.parseInto(mutableDateTime0, "CTT", 1);
      assertEquals(1583260085046L, mutableDateTime0.getMillis());
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(boolean0);
      
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "^jC9g6ma0J", 2000);
      assertEquals(2000, int0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(0L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("");
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("d* @z>p.pcnlPK\"Z~ ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"d* @z>p.pcnlPK\"Z~ \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "PTw1JOHEwV4+Z", true, 2, 41);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.withPivotYear((Integer) null);
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
  public void test25()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("`e1'/4<2_2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"`e1'/4<2_2\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      dateTimeFormatter0.parseMutableDateTime(string0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) null, (-1651L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Parsing not supported");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.print(100000000L);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Z\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 465);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("CE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"CE\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", true, 18, 470);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMillis("Vr6Kw[M#p\"V_nyjKe");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("16[hvDd{/0f_~lA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"16[hvDd{/0f_~lA\" is malformed at \"[hvDd{/0f_~lA\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      dateTimeFormatter0.parseMutableDateTime(string0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("ON");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ON\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.print(1663L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("CTT").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(7L, 1940L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      dateTimeFormatter0.printTo(writer0, (ReadablePartial) yearMonth0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("CTT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"CTT\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      dateTimeFormatter0.parseMutableDateTime(string0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDateTime("");
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
  public void test34()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      long long0 = dateTimeFormatter0.parseMillis(string0);
      assertEquals(952297200000L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      String string0 = dateTimeFormatter0.print((ReadableInstant) mutableDateTime0);
      dateTimeFormatter0.parseDateTime(string0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("p,i<zE+,EbX&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"p,i<zE+,EbX&\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(952297200000L, mutableDateTime0.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("The partial must not be null", "The partial must not be null").when(dateTimeParser0).toString();
      doReturn(1518, 8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("The partial must not be null");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("The partial must not be null", dateTimeFormatter0);
      dateTimeFormatter1.parseInto(mutableDateTime0, "The partial must not be null", 2);
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset trasition (").when(dateTimeParser0).toString();
      doReturn(1706).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDate("o~*Xgk\"ZNBKw,o");
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("o~*Xgk\"ZNBKw,o", (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"o~*Xgk\"ZNBKw,o\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      String string0 = dateTimeFormatter0.print((ReadableInstant) mutableDateTime0);
      LocalDateTime.parse(string0, dateTimeFormatter0);
      assertEquals(1583260062354L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset transition (").when(dateTimeParser0).toString();
      doReturn(1703).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("Corrupt zone info map");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.print((long) 3);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(952297200000L, mutableDateTime0.getMillis());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("<vK?5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"<vK?5\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(1452).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Integer integer0 = new Integer(1452);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      dateTimeFormatter0.parseLocalDate("KYk@.M],^a");
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(1452);
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(1452).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseDateTime("");
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
  public void test45()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("The partial must not be null").when(dateTimeParser0).toString();
      doReturn(1518).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("The partial must not be null");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeParser0);
      Locale locale0 = Locale.CANADA;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale((Locale) null);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("The partial must not be null", dateTimeFormatter1);
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", true, 18, 470);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMillis("Vr6Kw[M#p\"V_nyjKe");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "7sh#Dj;8%c", 2319);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[21];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseLocalDateTime("Vr6Kw[M#p\"V_nyjKe");
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals((-3600000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("Er@eu$c'Z >xy&$)Xv", (String) null).when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(15).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      dateTimeFormatter0.parseLocalTime("");
      dateTimeFormatter0.printTo((Appendable) charArrayWriter0, (-3268L));
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("CTT").when(dateTimeParser0).toString();
      doReturn(256).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      dateTimeFormatter1.parseInto(mutableDateTime0, "m5E(RHE}_>FF+E}\"~", 1);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("Illegal instant due to time zone offset transition (");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Illegal instant due to time zone...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Illegal instant due to time zone offset trasition (", ">_)iy").when(dateTimeParser0).toString();
      doReturn(1706, 1706).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("Illegal instant due to time zone offset trasition (");
      dateTimeFormatter0.parseInto(mutableDateTime0, ">_)iy", 17);
      // Undeclared exception!
      try { 
        DateMidnight.parse("org.joda.time.field.SkipUndoDateTimeField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.field.SkipUndoDate...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("CTT").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("CTT").when(dateTimeParser0).toString();
      doReturn(256).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(7L, 1940L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      dateTimeFormatter0.printTo(writer0, (ReadablePartial) yearMonth0);
      dateTimeFormatter0.parseLocalTime("");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "^jC9g6ma0J", 2000);
      assertEquals(3600000L, mutableDateTime0.getMillis());
      assertEquals(2000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, string0, 1100);
      assertEquals(952297200000L, mutableDateTime0.getMillis());
      assertEquals((-1101), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1100, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      LocalDate localDate0 = LocalDate.now();
      String string0 = dateTimeFormatter0.print((ReadablePartial) localDate0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime(string0);
      assertEquals(952297200000L, mutableDateTime0.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(31);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(1968);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(1968, (int)dateTimeFormatter2.getPivotYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeParser[] dateTimeParserArray0 = new DateTimeParser[21];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 18, 18);
      dateTimeParserArray0[0] = (DateTimeParser) dateTimeFormatterBuilder_Fraction0;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("Vr6Kw[M#p\"V_nyjKe", "Vr6Kw[M#p\"V_nyjKe", false, 18, 18);
      dateTimeParserArray0[1] = (DateTimeParser) dateTimeFormatterBuilder_TimeZoneOffset0;
      DateTimeFormatterBuilder.MatchingParser dateTimeFormatterBuilder_MatchingParser0 = new DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_MatchingParser0);
      dateTimeFormatter0.parseMutableDateTime("Vr6Kw[M#p\"V_nyjKe");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(2);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(3);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(3, (int)dateTimeFormatter2.getPivotYear());
  }
}
