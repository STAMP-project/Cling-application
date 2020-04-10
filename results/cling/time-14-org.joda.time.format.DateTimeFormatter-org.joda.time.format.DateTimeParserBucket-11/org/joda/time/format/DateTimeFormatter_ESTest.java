/*

 * Tue Mar 03 18:28:16 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      long long0 = dateTimeFormatter0.parseMillis("000");
      assertEquals((-3600000L), long0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("F*/@zST-X*Ci2Xv").when(dateTimeParser0).toString();
      doReturn(53).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(53);
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 53, dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, (String) null, 5);
      assertEquals(53L, mutableDateTime0.getMillis());
      
      dateTimeFormatter0.printTo((Writer) null, (long) (-517));
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      long long0 = dateTimeFormatter1.parseMillis("");
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(0L, long0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-374));
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) (-374), dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "*fhI", 4);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("000");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"000\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("2=gLDn^N$#kj%]]", "", true, 1, 1);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      assertEquals(0L, mutableDateTime0.getMillis());
      assertNotSame(dateTimeFormatter0, dateTimeFormatter1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.isPrinter();
      // Undeclared exception!
      try { 
        LocalDate.parse("T:;ZlI6yk");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"T:;ZlI6yk\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("org/joda/time/tz/data").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ZJz.Q[ V").when(dateTimeParser0).toString();
      doReturn(145).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("qC&`(b$P,KG", "").when(dateTimeZone0).getID();
      doReturn(145, (-696)).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("ZJz.Q[ V").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      dateTimeFormatter1.printTo(writer0, (ReadableInstant) null);
      // Undeclared exception!
      try { 
        dateTimeFormatter1.parseMillis("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition (ZJz.Q[ V)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      dateTimeFormatter0.parseLocalDate("000");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("|Vp;kH-O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"|Vp;kH-O\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Partial partial0 = new Partial(localDate0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "", 2132774855);
      assertEquals(1583260049445L, mutableDateTime0.getMillis());
      assertEquals((-2132774856), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(901).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDate("");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      dateTimeFormatter0.parseLocalDate("000");
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 9, (-581));
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_TimeZoneOffset0);
      LocalTime localTime0 = dateTimeFormatter0.parseLocalTime("");
      StringWriter stringWriter0 = new StringWriter();
      dateTimeFormatter0.printTo((Writer) stringWriter0, (ReadablePartial) localTime0);
      assertEquals("000000000", stringWriter0.toString());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(207).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(207);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
      Integer integer0 = new Integer(207);
      DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withPivotYear(integer0);
      long long0 = dateTimeFormatter2.parseMillis("<p");
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertNotSame(dateTimeFormatter2, dateTimeFormatter1);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertTrue(dateTimeFormatter2.isOffsetParsed());
      assertSame(dateTimeFormatter2, dateTimeFormatter3);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(boolean0);
      
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      dateTimeFormatter0.parseLocalDate("000");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("?MhvP52'!QWu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"?MhvP52'!QWu\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(3);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(2);
      assertEquals(2, (int)dateTimeFormatter2.getPivotYear());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(745);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 3);
      assertEquals(1583260044357L, mutableDateTime0.getMillis());
      
      dateTimeFormatter0.withPivotYear((Integer) null);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Instant.parse("000");
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      LocalDate localDate0 = dateTimeFormatter0.parseLocalDate("000");
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        dateTimeFormatter0.printTo((Appendable) pipedWriter0, (ReadablePartial) localDate0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 1, 898);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.printTo(stringBuffer0, (-3603988L));
      assertEquals("+01", stringBuffer0.toString());
      
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ZJz.Q[ V").when(dateTimeParser0).toString();
      doReturn(145).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      StringBuffer stringBuffer0 = new StringBuffer();
      YearMonth yearMonth0 = new YearMonth(2228L);
      dateTimeFormatter0.printTo(stringBuffer0, (ReadablePartial) yearMonth0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("qC&`(b$P,KG").when(dateTimeZone0).getID();
      doReturn(145).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("Illegal instant due to time zone offset transition (").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter1.parseDateTime("Printing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"Printing not supported\": Illegal instant due to time zone offset transition (Illegal instant due to time zone offset transition ()
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(929).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("}aDnz");
      // Undeclared exception!
      try { 
        Instant.parse("8GLyPF#~G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8GLyPF#~G\" is malformed at \"GLyPF#~G\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("2=gLDn^N$#kj%]]", "", true, 1, 1);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("\": ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\": \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(745);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 3);
      assertEquals(1583260040064L, mutableDateTime0.getMillis());
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(929).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDate("");
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(929).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(929);
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "p&KC4sWBtx w\":W|R", 0);
      assertEquals(1583260038203L, mutableDateTime0.getMillis());
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      dateTimeFormatter0.isPrinter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 9);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(9);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 3);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("oIGgS~V");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"oIGgS~V\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(2119).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Locale locale0 = Locale.CANADA;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeZone0).getID();
      doReturn(192).when(dateTimeZone0).getOffset(anyLong());
      doReturn(1).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZone(dateTimeZone0);
      dateTimeFormatter2.withLocale(locale0);
      // Undeclared exception!
      try { 
        dateTimeFormatter2.parseMutableDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition ()
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      StringWriter stringWriter0 = new StringWriter();
      dateTimeFormatter1.printTo((Writer) stringWriter0, (-2901L));
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Partial partial0 = new Partial(localDate0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) null, (-448L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("2=gLDn^N$#kj%]]", "", true, 1, 1);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime.parse("", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("\": ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\": \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime.parse("", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("27,v0#VwlQo''L)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"27,v0#VwlQo''L)\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Instant.parse("000");
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("?MhvP52'!QWu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"?MhvP52'!QWu\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeParser0).toString();
      doReturn(2119, 1).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeZone0).getID();
      doReturn(192).when(dateTimeZone0).getOffset(anyLong());
      doReturn(1).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      dateTimeFormatter0.parseLocalDateTime("");
      // Undeclared exception!
      try { 
        dateTimeFormatter1.parseMutableDateTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition ()
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", false, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      String string0 = dateTimeFormatter0.print((-30L));
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals("+010000000", string0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ZJz.Q[ V").when(dateTimeParser0).toString();
      doReturn(145).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((-696));
      dateTimeFormatter1.withPivotYear((-2099));
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("qC&`(b$P,KG").when(dateTimeZone0).getID();
      doReturn(145).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("ZJz.Q[ V").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter2.parseMillis("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition (ZJz.Q[ V)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Instant.parse("000");
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("|Vp;kH-O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"|Vp;kH-O\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, (String) null, (-1282));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      long long0 = dateTimeFormatter0.parseMillis("");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("]m$Jte).0h=#y$z#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"]m$Jte).0h=#y$z#\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("000");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"000\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("G", "G", false, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(745);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("G", dateTimeFormatter0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "", 0);
      assertEquals(3599255L, mutableDateTime0.getMillis());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 9, (-581));
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_TimeZoneOffset0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      dateTimeFormatter0.parseLocalTime("");
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1372L), (Chronology) julianChronology0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "org.joda.time.format.ISODateTimeFormat", 660);
      assertEquals(3598628L, mutableDateTime0.getMillis());
      assertEquals(660, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      LocalDate localDate0 = dateTimeFormatter0.parseLocalDate("000");
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(51);
      dateTimeFormatter0.printTo((Writer) charArrayWriter0, (ReadablePartial) localDate0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 41, 51);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      dateTimeFormatter0.parseLocalDate("000");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(51);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(51, (int)dateTimeFormatter1.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\" is malformed at \"").when(dateTimeParser0).toString();
      doReturn(1486).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.parseLocalDate("");
      StringBuffer stringBuffer0 = new StringBuffer(1486);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo(stringBuffer0, 24L);
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
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("org/joda/time/tz/data", "org/joda/time/tz/data").when(dateTimePrinter0).toString();
      doReturn(145).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("ZJz.Q[ V").when(dateTimeParser0).toString();
      doReturn(145).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("qC&`(b$P,KG", "").when(dateTimeZone0).getID();
      doReturn(145, (-696)).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("ZJz.Q[ V").when(dateTimeZone0).toString();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      dateTimeFormatter1.print((ReadableInstant) null);
      // Undeclared exception!
      try { 
        dateTimeFormatter1.parseMillis("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition (ZJz.Q[ V)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      String string0 = dateTimeFormatter0.print(29963904L);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals("Europe/Amsterdam", string0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("G", "G", false, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime.parse("G", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"&\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 1, 898);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseMillis("");
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
  public void test52()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(745);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 3);
      assertEquals(1583260014330L, mutableDateTime0.getMillis());
      
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      YearMonth yearMonth0 = YearMonth.now();
      dateTimeFormatter0.printTo(stringBuffer0, (ReadablePartial) yearMonth0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      Locale locale0 = Locale.ENGLISH;
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("2=gLDn^N$#kj%]]", "", true, 1, 1);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(745);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 3);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "):dMq%S;x$$", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("G", "G", false, 9, 745);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("G", dateTimeFormatter0);
      dateTimeFormatter0.parseLocalDate("G");
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "", 0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals((-1), int0);
      assertEquals(0L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", true, 1, 898);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
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
  public void test57()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) (-1104), (Chronology) copticChronology0);
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('{');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_CharacterLiteral0);
      dateTimeFormatter0.printTo(stringBuffer0, (ReadableInstant) mutableDateTime0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(207).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("I");
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) pipedWriter0, (ReadablePartial) null);
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
  public void test59()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1104));
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "", 0);
      assertEquals(1583260007241L, mutableDateTime0.getMillis());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test60()  throws Throwable  {
      Instant.parse("000");
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1104));
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "", 2147483053);
      assertEquals(1583260003981L, mutableDateTime0.getMillis());
      assertEquals((-2147483054), int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(2);
      Integer integer0 = new Integer(2);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer0);
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Instant instant0 = Instant.parse("000");
      assertEquals((-62167220372000L), instant0.getMillis());
      
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((-1627));
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((-1282));
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals((-1282), (int)dateTimeFormatter2.getPivotYear());
  }
}
