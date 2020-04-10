/*

 * Tue Mar 03 18:07:16 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.YearMonth;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("a", "a", true, 12, 12);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("a");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("+00:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+00:\" is too short
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("America/Puerto_Rico");
      assertEquals(14400000L, dateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 24);
      String string0 = dateTimeZone0.getName(1892L);
      assertEquals("+04:24", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      String string0 = dateTimeZone0.getName(0L, locale0);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("z3)4T6").when(dateTimeParser0).toString();
      doReturn(2).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateMidnight dateMidnight0 = new DateMidnight();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("z3)4T6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"z3)4T6\" is malformed at \")4T6\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("BET").when(dateTimeParser0).toString();
      doReturn(26).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("E<AQvr");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      assertEquals(1585699200000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("a", "a", true, 12, 12);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDate("a");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(12);
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      assertEquals(1583020799988L, interval0.getStartMillis());
      assertEquals("+00:00:00.012", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1880));
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      yearMonth0.toInterval(dateTimeZone0);
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("[ &\"hb>ccDXSfDAT");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("yH 7MHP_M", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"yH 7MHP_M\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("BET", "BET", "+;nbUwOZ[7#2?W?wQ)?", "+;nbUwOZ[7#2?W?wQ)?", (String) null).when(dateTimeParser0).toString();
      doReturn(26, 2746, 26, 2746, 26).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("E<AQvr");
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("CNT");
      dateTimeFormatter0.parseLocalDate("");
      dateTimeFormatter0.parseInto(mutableDateTime0, "Europe/Amsterdam", 1);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("1970-01-01T00:00:00.000+01:00");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"1970-01-01T00:00:00.000+01:00\" is malformed at \":00\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1880));
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      yearMonth0.toInterval(dateTimeZone0);
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("yH 7MHP_M", "yH 7MHP_M", false, 3901, 73200000);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("yH 7MHP_M");
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("WET", dateTimeFormatter0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals(0L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("ZpjA13$0cZLlZ");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseDateTime("ZpjA13$0cZLlZ");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("ZpjA13$0cZLlZ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ZpjA13$0cZLlZ\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("a", "a", true, 12, 12);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(12, 12, 12, 12, 12, 12, 12);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("+00:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+00:\" is too short
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("a", "a", true, 1162, 2147483629);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalDate.parse("a", dateTimeFormatter0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "a", 3);
      assertEquals(1583258812635L, mutableDateTime0.getMillis());
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("a", "a", true, 12, 12);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("a");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      MutableDateTime mutableDateTime0 = new MutableDateTime(12, 12, 12, 12, 12, 12, 12);
      assertEquals((-61758590839988L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      LocalDate.parse("WET", dateTimeFormatter0);
      MutableDateTime.parse("WET", dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }
}
