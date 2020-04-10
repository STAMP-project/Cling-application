/*

 * Tue Mar 03 18:07:06 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.BuddhistChronology;
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
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-122607198));
      dateTimeZone0.convertLocalToUTC((long) 2146, true);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("\"COiAxD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"COiAxD\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("0i=evV5=><]69kZ@).");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("0i=evV5=><]69kZ@).");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("0i=evV5=><]69kZ@).");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"0i=evV5=><]69kZ@).\" is malformed at \"i=evV5=><]69kZ@).\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("mwT?VoUp+8");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("mwT?VoUp+8");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("mwT?VoUp+8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"mwT?VoUp+8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("dcoC", "dcoC", false, 2156, 2156);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDate("dcoC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-200));
      long long0 = dateTimeZone0.convertLocalToUTC((long) (-200), true);
      assertEquals(0L, long0);
      assertEquals("-00:00:00.200", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2914);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 2914, true);
      assertEquals(0L, long0);
      assertEquals("+00:00:02.914", dateTimeZone0.toString());
      
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.DateTimeZone.NameProvider", false, 2914, 2914);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime.parse("org.joda.time.DateTimeZone.NameProvider", dateTimeFormatter0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147335133);
      dateTimeZone0.convertLocalToUTC(3053L, true);
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
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2940);
      dateTimeZone0.convertLocalToUTC((long) 2940, true);
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+mwT?VoU>p+");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("_J,wb");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"_J,wb\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("America/Argentina/Buenos_Aires");
      assertEquals(10800000L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2914);
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName(850L, locale0);
      assertEquals("+00:00:02.914", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = Locale.CHINA;
      String string0 = dateTimeZone0.getName((-3596416L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      LocalTime.now();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("HST");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"HST\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147335133);
      long long0 = dateTimeZone0.convertLocalToUTC(3053L, false);
      assertEquals("+596:28:55.133", dateTimeZone0.toString());
      assertEquals((-2147332080L), long0);
      
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("org.joda.time.chrono.GJLocaleSymbols");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("org.joda.time.chrono.GJLocaleSymbols");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("W_El:1Eb|oX?F");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("W_El:1Eb|oX?F");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(652);
      long long0 = dateTimeZone0.convertLocalToUTC(122607266L, true);
      assertEquals("+00:00:00.652", dateTimeZone0.toString());
      assertEquals(122606614L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("mVnGj#$;p\u0003\"c$^04;", "mVnGj#$;p\u0003\"c$^04;", true, 2146, 2146);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDate("mVnGj#$;p\u0003\"c$^04;");
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("+");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      LocalTime.now();
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime("+");
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        MutableDateTime.parse("mwT?VoUpQ8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"mwT?VoUpQ8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("mwT?VoUp+8");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("mwT?VoUp+8");
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("-mwT?VoUpQ8");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("-mwT?VoUpQ8");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("31P,BJKNu/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"31P,BJKNu/\" is malformed at \"P,BJKNu/\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147335133);
      long long0 = dateTimeZone0.convertLocalToUTC(3053L, false);
      assertEquals("+596:28:55.133", dateTimeZone0.getID());
      assertEquals((-2147332080L), long0);
      
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("org.joda.time.chrono.GJLocaleSymbols");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("org.joda.time.chrono.GJLocaleSymbols", dateTimeFormatter0);
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2914);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 2914, true);
      assertEquals("+00:00:02.914", dateTimeZone0.getID());
      assertEquals(0L, long0);
      
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.DateTimeZone.NameProvider", false, 2914, 2914);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDate("org.joda.time.DateTimeZone.NameProvider");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("\"COiAxD", "qb[LH& qB%03", true, 99, 99);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDate("qb[LH& qB%03");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(28265625);
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime(9223372036854775807L, dateTimeZone0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("mwT?VoUpQ8");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseMutableDateTime("mwT?VoUpQ8");
      // Undeclared exception!
      try { 
        MutableDateTime.parse("mwT?VoUpQ8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"mwT?VoUpQ8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("dc v", "dc v", false, 2156, 2156);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDate("dc v");
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      dateTimeFormatter0.parseInto(mutableDateTime0, "Illegal instant due to time zone offset transition (", 1);
      assertEquals(1583258795703L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("mwT?VoU>p+");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("mwT?VoU>p+");
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("mwT?VoU>p+", dateTimeFormatter0);
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("1");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDate("1");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1");
      assertEquals((-62135597972000L), mutableDateTime0.getMillis());
  }
}
