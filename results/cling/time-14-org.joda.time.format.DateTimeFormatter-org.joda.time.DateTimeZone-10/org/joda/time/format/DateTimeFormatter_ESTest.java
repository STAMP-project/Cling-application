/*

 * Tue Mar 03 18:06:48 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setYear((-765));
      // Undeclared exception!
      try { 
        MutableDateTime.parse("8zxOiT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8zxOiT\" is malformed at \"zxOiT\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime((-1L));
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setYear(4);
      assertEquals((-62035564375840L), mutableDateTime0.getMillis());
      
      dateTimeFormatter0.parseDateTime("Europe/Amsterdam");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      Locale locale0 = Locale.CHINA;
      String string0 = dateTimeZone0.getName(10800000L, locale0);
      assertEquals("+04:00", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) 2364, (Locale) null);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("America/Sao_Paulo");
      assertEquals(10800000L, dateTime0.getMillis());
      
      dateTimeFormatter0.parseLocalDate("America/Sao_Paulo");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setYear(4);
      assertEquals((-62035564378691L), mutableDateTime0.getMillis());
      
      dateTimeFormatter0.parseLocalDate("America/Phoenix");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("! !LI0`qZ/|L/~w@7", "! !LI0`qZ/|L/~w@7", true, 60, 60);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalDate localDate0 = dateTimeFormatter0.parseLocalDate("! !LI0`qZ/|L/~w@7");
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals((-3600000L), dateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseLocalDate("America/Sao_Paulo");
      // Undeclared exception!
      try { 
        DateTime.parse("4FeO{[*BOc6A3P3h0VP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"4FeO{[*BOc6A3P3h0VP\" is malformed at \"FeO{[*BOc6A3P3h0VP\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseLocalDate("America/Phoenix");
      // Undeclared exception!
      try { 
        DateTime.parse("America/Phoenix");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"America/Phoenix\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      dateTimeFormatter0.parseInto(mutableDateTime0, "9A^ [H$)8P]FdoG:&Z", 2);
      // Undeclared exception!
      try { 
        DateTime.parse("9A^ [H$)8P]FdoG:&Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"9A^ [H$)8P]FdoG:&Z\" is malformed at \"A^ [H$)8P]FdoG:&Z\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTime dateTime0 = new DateTime(2, 2, 1, 3, 0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("8zxOiT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8zxOiT\" is malformed at \"zxOiT\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setYear(4);
      // Undeclared exception!
      try { 
        DateTime.parse("America/Phoenix");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"America/Phoenix\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTime dateTime0 = new DateTime(2, 2, 1, 3, 0);
      assertEquals((-62101372772000L), dateTime0.getMillis());
      
      DateTime dateTime1 = dateTimeFormatter0.parseDateTime("Europe/Amsterdam");
      assertEquals((-3600000L), dateTime1.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseMutableDateTime("Asia/Ho_Chi_Minh");
      // Undeclared exception!
      try { 
        DateTime.parse("Asia/Ho_Chi_Minh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Asia/Ho_Chi_Minh\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTime dateTime0 = new DateTime(2, 2, 1, 3, 0);
      // Undeclared exception!
      try { 
        MutableDateTime.parse("~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"~\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("! !LI0`qZ/|L/~w@7", "! !LI0`qZ/|L/~w@7", true, 54, 54);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDate("! !LI0`qZ/|L/~w@7");
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("! !LI0`qZ/|L/~w@7");
      dateTimeFormatter0.parseInto(mutableDateTime0, "! !LI0`qZ/|L/~w@7", 4);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseLocalTime("Asia/Yerevan");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.parseLocalDateTime("America/Puerto_Rico");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      
      DateTime dateTime0 = new DateTime(2, 2, 4, 3, 3, 1, 3);
      assertEquals((-62101113390997L), dateTime0.getMillis());
  }
}
