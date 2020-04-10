/*

 * Tue Mar 03 18:26:27 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
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
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("i").when(dateTimeParser0).toString();
      doReturn(2033).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      StringWriter stringWriter0 = new StringWriter(6);
      dateTimeFormatter0.printTo((Writer) stringWriter0, (long) 2033);
      dateTimeFormatter0.parseLocalDate("");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("oj^KhK(I 2FMxO2").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\" ClassLoader: ").when(dateTimeParser0).toString();
      doReturn(1771).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      dateTimeFormatter0.printTo((Writer) null, (ReadableInstant) mutableDateTime0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      dateTimeFormatter0.parseInto(mutableDateTime0, string0, 3);
      assertEquals(1570296358675L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      Locale locale0 = Locale.forLanguageTag("h=PI:[.OM34Z{@[");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDate.parse("G4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"G4\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('D');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_CharacterLiteral0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter('D');
      dateTimeFormatter0.printTo((Writer) charArrayWriter0, 1190L);
      // Undeclared exception!
      try { 
        MonthDay.parse("JEuy?HV[O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"JEuy?HV[O\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1", dateTimeFormatter0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("G4").when(dateTimePrinter0).toString();
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      LocalDate localDate0 = LocalDate.now((Chronology) islamicChronology0);
      dateTimeFormatter0.printTo((Writer) null, (ReadablePartial) localDate0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("[v@'RvMVijb}v(").when(dateTimeParser0).toString();
      doReturn(1856).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Integer integer0 = new Integer(894);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(894);
      DateMidnight dateMidnight0 = DateMidnight.parse("qoe@{hM)TiVo$DK.", dateTimeFormatter1);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertSame(dateTimeFormatter1, dateTimeFormatter2);
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertTrue(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalTime("Cannot parse \"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Cannot parse \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("dx<3~]e(d#xNM \"rB").when(dateTimeParser0).toString();
      doReturn(913).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) islamicChronology0);
      dateTimeFormatter0.withPivotYear((Integer) null);
      dateTimeFormatter0.parseInto(mutableDateTime0, "", 913);
      assertEquals(1583259954383L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime("pyMg-", julianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"pyMg-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      
      Integer integer0 = new Integer((-1746));
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((-696));
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals((-696), (int)dateTimeFormatter2.getPivotYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) islamicChronology0);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "Partial must not be null", 997);
      assertEquals(1583259952498L, mutableDateTime0.getMillis());
      assertEquals((-998), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null).when(dateTimePrinter0).toString();
      doReturn(2431).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "Kc;\"mR[^9").when(dateTimeParser0).toString();
      doReturn(1374, 0, 1374).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalTime("");
      dateTimeFormatter0.parseMillis("");
      LocalDate localDate0 = LocalDate.parse("Ov*#M;lh.l^r", dateTimeFormatter0);
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
  public void test16()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("G4", (String) null).when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      StringBuffer stringBuffer0 = new StringBuffer(3089);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      dateTimeFormatter0.printTo((Appendable) stringBuffer0, (ReadableInstant) null);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("G4", (String) null).when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      LocalDate localDate0 = LocalDate.now((Chronology) islamicChronology0);
      LocalDate.parse("G4", dateTimeFormatter0);
      dateTimeFormatter0.print((ReadablePartial) localDate0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals("-18:00", dateTimeZone0.toString());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.withLocale((Locale) null);
      // Undeclared exception!
      try { 
        MonthDay.parse("Parsing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Parsing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(2663);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1", dateTimeFormatter0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((Integer) mutableDateTime0.ROUND_FLOOR);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertEquals(2663, (int)dateTimeFormatter1.getPivotYear());
      assertEquals(1, (int)dateTimeFormatter2.getPivotYear());
      
      dateTimeFormatter0.parseInto(mutableDateTime0, "Printing not supported", 2663);
      assertEquals(0L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.US;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1");
      assertEquals((-62135597972000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "~#", 1947);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      MutableDateTime.parse("1", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        MonthDay.parse("ceEhhBIkd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ceEhhBIkd\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("VgB+").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      dateTimeFormatter0.printTo(writer0, (ReadablePartial) localTime0);
      // Undeclared exception!
      try { 
        MonthDay.parse("Parsing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Parsing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
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
  public void test26()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("pyMg-", (String) null).when(dateTimeParser0).toString();
      doReturn(913, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("a)\"_[0y(R\tkW1K");
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(3, 9, 41);
      DateTimeFormatter dateTimeFormatter1 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormat_StyleFormatter0);
      boolean boolean0 = dateTimeFormatter1.isPrinter();
      assertFalse(boolean0);
      
      dateTimeFormatter0.parseInto(mutableDateTime0, "v/h oahOU?uSN`9", 1);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("62)_9G)^", "62)_9G)^").when(dateTimeParser0).toString();
      doReturn(521, 521).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertTrue(boolean0);
      
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("");
      dateTimeFormatter0.parseInto(mutableDateTime0, "62)_9G)^", (-2147483050));
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.isPrinter();
      // Undeclared exception!
      try { 
        MonthDay.parse("Parsing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Parsing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(3, 9, 41);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormat_StyleFormatter0);
      dateTimeFormatter0.isPrinter();
      // Undeclared exception!
      try { 
        MonthDay.parse("JEuy?V[O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"JEuy?V[O\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeParser0).toString();
      doReturn(1374, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      dateTimeFormatter0.parseInto(mutableDateTime0, " field is unsupported", (-70));
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime(" * ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \" * \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.withPivotYear((Integer) null);
      // Undeclared exception!
      try { 
        MonthDay.parse("(bg}@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"(bg}@\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      MutableDateTime.parse("1", dateTimeFormatter0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1428);
      dateTimeFormatter0.printTo((Writer) charArrayWriter0, 7934592L);
      assertEquals(1, charArrayWriter0.size());
      assertEquals("3", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(1374).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      
      DateTime dateTime0 = dateTimeFormatter0.parseDateTime(" * ");
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime(" field is unsupported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \" field is unsupported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1494);
      dateTimeFormatter0.printTo((Writer) charArrayWriter0, (-3599043L));
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("Partial must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Partial must not be null\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeParser0).toString();
      doReturn(1374, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null, julianChronology0);
      dateTimeFormatter0.parseInto(mutableDateTime0, "Illegal instant due to time zone offset transition (", 2);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("Kc;\"mR[^9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Kc;\"mR[^9\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(2425);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(3315);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertEquals(3315, (int)dateTimeFormatter2.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      // Undeclared exception!
      try { 
        DateMidnight.parse("", dateTimeFormatter0);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      String string0 = dateTimeFormatter0.print(1780L);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals("1", string0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1");
      assertEquals((-62135597972000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("SsS:Q)o[%wuZP*kv[c");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("SsS:Q)o[%wuZP*kv[c", dateTimeFormatter0);
      dateTimeFormatter0.print((ReadableInstant) mutableDateTime0);
      // Undeclared exception!
      try { 
        MonthDay.parse("SsS:Q)o[%wuZP*kv[c");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"SsS:Q)o[%wuZP*kv[c\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      long long0 = dateTimeFormatter0.parseMillis("1");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(1374).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalTime("");
      // Undeclared exception!
      try { 
        DateMidnight.parse("1Jkpvf]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"1Jkpvf]\" is malformed at \"Jkpvf]\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("62)_9G)^", "62)_9G)^").when(dateTimeParser0).toString();
      doReturn(521, 521).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("Types array must not contain null: index ", dateTimeFormatter0);
      dateTimeFormatter1.parseInto(mutableDateTime0, "%{$MO[", 2);
      // Undeclared exception!
      try { 
        MonthDay.parse("R5o'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"R5o'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      Locale locale0 = Locale.PRC;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDateTime("/!5&40M+;4-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"/!5&40M+;4-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("Q_hDz(D8De$*Zo'm6r", "Q_hDz(D8De$*Zo'm6r").when(dateTimePrinter0).toString();
      doReturn(290).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Q_hDz(D8De$*Zo'm6r").when(dateTimeParser0).toString();
      doReturn(2000).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalTime("");
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Appendable) stringBuffer0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("py zY").when(dateTimeParser0).toString();
      doReturn(913).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Locale locale0 = Locale.PRC;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.parseLocalTime("\": ");
      dateTimeFormatter1.withLocale((Locale) null);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("G4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "Ig", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1", dateTimeFormatter0);
      MutableDateTime.parse("1");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      dateTimeFormatter1.parseInto(mutableDateTime0, "Printing not supported", 3);
      assertEquals(3600000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      String string0 = dateTimeFormatter0.print((-3597878L));
      assertEquals("12", string0);
      
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("12", dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("SsS:Q)o[%wuZP*kv[c");
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\" ClassLoader: ").when(dateTimeParser0).toString();
      doReturn(1771).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeParser0);
      MutableDateTime.parse("", dateTimeFormatter0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) stringWriter0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("VgB+").when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("62)_9G)^").when(dateTimeParser0).toString();
      doReturn(521).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      long long0 = dateTimeFormatter0.parseMillis("!N");
      assertEquals((-3600000L), long0);
      
      dateTimeFormatter0.printTo(writer0, (ReadablePartial) localTime0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.parse(string0, dateTimeFormatter0);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "", 3);
      assertEquals(946684800000L, mutableDateTime0.getMillis());
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1", dateTimeFormatter0);
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "The partial must not be null", 2413);
      assertEquals((-2414), int0);
      assertEquals(0L, mutableDateTime0.getMillis());
      
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale((Locale) null);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 2425, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      String string0 = dateTimeFormatter0.print((long) 2425);
      dateTimeFormatter0.parseLocalDateTime(string0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(2425);
      Integer integer0 = new Integer(2425);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(integer0);
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertFalse(dateTimeFormatter2.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(2663);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1", dateTimeFormatter0);
      MutableDateTime mutableDateTime1 = MutableDateTime.parse("1");
      assertEquals((-62135597972000L), mutableDateTime1.getMillis());
      
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((Integer) mutableDateTime0.ROUND_CEILING);
      assertEquals(0L, mutableDateTime0.getMillis());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertEquals(2663, (int)dateTimeFormatter1.getPivotYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }
}
