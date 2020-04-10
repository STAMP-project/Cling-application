/*

 * Tue Mar 03 18:07:12 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+1tauS$;^mn=*D@C,");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalTime("+1tauS$;^mn=*D@C,");
      // Undeclared exception!
      try { 
        DateTime.parse("+1tauS$;^mn=*D@C,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1tauS$;^mn=*D@C,\" is malformed at \"auS$;^mn=*D@C,\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+1tzLauS$;^mn=*D@C,");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      LocalDate localDate0 = new LocalDate();
      localDate0.toDateTimeAtStartOfDay((DateTimeZone) null);
      // Undeclared exception!
      try { 
        DateTime.parse("+#Wue|$p", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+#Wue|$p\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseLocalTime("America/Indiana/Indianapolis");
      // Undeclared exception!
      try { 
        DateTime.parse("America/Indiana/Indianapolis");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"America/Indiana/Indianapolis\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getName(63510400L, locale0);
      assertEquals("+00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(0, hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) null, 31557600000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+1tzLauS$;^mn=*D@C,");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      LocalDate localDate0 = LocalDate.parse("+1tzLauS$;^mn=*D@C,", dateTimeFormatter0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay((DateTimeZone) null);
      assertEquals((-3600000L), dateTime0.getMillis());
      
      DateTime dateTime1 = DateTime.parse("+1tzLauS$;^mn=*D@C,", dateTimeFormatter0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals((-3600000L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("n9iFH5S9]4'lz\"1][", "n9iFH5S9]4'lz\"1][", true, 38, 38);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("n9iFH5S9]4'lz\"1][");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay((DateTimeZone) null);
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      // Undeclared exception!
      try { 
        DateTime.parse("+1tauS$;^mn=*D@C,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1tauS$;^mn=*D@C,\" is malformed at \"auS$;^mn=*D@C,\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("WET");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+1tauS$;^mn=*D@C,");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("+1tauS$;^mn=*D@C,");
      // Undeclared exception!
      try { 
        DateTime.parse("+1tauS$;^mn=*D@C,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1tauS$;^mn=*D@C,\" is malformed at \"auS$;^mn=*D@C,\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("+1|c</QzD1a0n(Daeb", "+1|c</QzD1a0n(Daeb", true, 67, 67);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("+1|c</QzD1a0n(Daeb");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-43));
      long long0 = dateTimeZone0.convertLocalToUTC((-256L), true);
      assertEquals("-43:00", dateTimeZone0.getID());
      assertEquals(154799744L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      localDate0.toDateTimeAtStartOfDay((DateTimeZone) null);
      // Undeclared exception!
      try { 
        DateTime.parse("+1tauS$;^mn=*D@C,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1tauS$;^mn=*D@C,\" is malformed at \"auS$;^mn=*D@C,\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addWeeks((-124249917));
      // Undeclared exception!
      try { 
        DateTime.parse("+1tuS$;^m#=*DC,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+1tuS$;^m#=*DC,\" is malformed at \"uS$;^m#=*DC,\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+1tzLauS$;^mn=*D@C,");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("+1tzLauS$;^mn=*D@C,");
      // Undeclared exception!
      try { 
        DateTime.parse("+#Wue|$p", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+#Wue|$p\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseMutableDateTime("EET");
      // Undeclared exception!
      try { 
        DateTime.parse("EET");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"EET\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("+1|c</QzD1a0n(Daeb", "+1|c</QzD1a0n(Daeb", true, 67, 67);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalTime("+1|c</QzD1a0n(Daeb");
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      dateTimeFormatter0.parseInto(mutableDateTime0, "+1|c</QzD1a0n(Daeb", 4);
      assertEquals(1583258801394L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("n9iFH5S9]4'lz\"1][", "n9iFH5S9]4'lz\"1][", true, 38, 38);
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+;hQ]pvy0URt.E");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addWeeks((-18000000));
      assertEquals((-10884816738771526L), mutableDateTime0.getMillis());
      
      dateTimeFormatter0.parseLocalTime("n9iFH5S9]4'lz\"1][");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseLocalTime("EET");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }
}
