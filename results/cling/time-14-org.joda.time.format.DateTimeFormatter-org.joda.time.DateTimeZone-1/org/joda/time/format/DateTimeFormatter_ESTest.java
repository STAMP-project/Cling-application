/*

 * Tue Mar 03 18:05:16 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("No field to apply suf/ix to");
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Printing not supported", "Printing not supported").when(dateTimeParser0).toString();
      doReturn(17, 17).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("DkUdb0S");
      mutableDateTime0.setYear((-1642));
      // Undeclared exception!
      try { 
        MutableDateTime.parse("No field to apply suf/ix to", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"No field to apply suf/ix to\" is malformed at \" suf/ix to\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 346, 346);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("gA&` gDfL]]hC\"hLMb");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"gA&` gDfL]]hC\"hLMb\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 346, 346);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      LocalDate localDate0 = LocalDate.now();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-218));
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      localDate0.toDateTimeAtStartOfDay();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("_RAq/{m+p.3B.qe\"d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"_RAq/{m+p.3B.qe\"d\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("America/Puerto_Rico");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(14400000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(5, 4);
      Locale locale0 = Locale.UK;
      String string0 = dateTimeZone0.getName((-1410L), locale0);
      assertEquals("+05:04", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(766623600001L);
      assertNotNull(string0);
      assertEquals("+02:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("DlteTimeZone.setNameProvider");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseDateTime("DlteTimeZone.setNameProvider");
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      LocalDate localDate0 = new LocalDate(mutableDateTime0);
      localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583258698448L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("DlteTimeZone.setNameProvider");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDateTime("DlteTimeZone.setNameProvider");
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      LocalDate localDate0 = new LocalDate(mutableDateTime0);
      localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583258697258L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Printing not supported").when(dateTimeParser0).toString();
      doReturn(17).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDate.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTime.parse("Printing not supported", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Printing not supported\" is malformed at \"orted\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 1, 1395);
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(236);
      Locale locale0 = Locale.FRENCH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      Date date0 = gregorianCalendar0.getGregorianChange();
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_Fraction0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("Q!Kp! `Z@0OW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Q!Kp! `Z@0OW\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("WET");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("MuT");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("MuT");
      // Undeclared exception!
      try { 
        DateTime.parse("MuT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"MuT\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 346, 346);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.plusYears((-175));
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 346, 346);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("");
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.plusYears((-1959));
      assertEquals((-60236871572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("DlteTimeZone.setNameProvider");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDateTime("DlteTimeZone.setNameProvider");
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("DlteTimeZone.setNameProvider");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseLocalDateTime("WET");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("org.joda.time.DateTimeZone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.DateTimeZone\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}
