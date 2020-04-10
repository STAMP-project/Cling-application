/*

 * Tue Mar 03 18:34:44 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Locale locale0 = new Locale("V's");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2197, buddhistChronology0, locale0, (Integer) 1, 1);
      DurationField durationField0 = buddhistChronology0.millis();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "V's", 0);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      Locale locale0 = Locale.FRANCE;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer("Vs>");
      LocalTime localTime0 = new LocalTime((Chronology) buddhistChronology0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals("Vs>\uFFFD", stringBuffer0.toString());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      Locale locale0 = Locale.FRANCE;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer("Vs>");
      LocalTime localTime0 = new LocalTime((Chronology) buddhistChronology0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals(5, stringBuffer0.length());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      Locale locale0 = Locale.ENGLISH;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeFormatterBuilder_TextField0.printTo((Writer) charArrayWriter0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("19", charArrayWriter0.toString());
      assertEquals(2, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      YearMonth yearMonth0 = new YearMonth((long) 6);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      StringWriter stringWriter0 = new StringWriter(6);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Locale locale0 = Locale.CANADA;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals("1970", stringBuffer0.toString());
      
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = new Locale("Vs>");
      DurationField durationField0 = buddhistChronology0.millis();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "Vs>");
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals(4, stringBuffer0.length());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.millis();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, (DurationField) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      LocalTime localTime0 = LocalTime.parse("0");
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (ReadablePartial) localTime0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      Locale locale0 = Locale.ENGLISH;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, buddhistChronology0, locale0, (Integer) 1, 0);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "9shwtt<`z8=.j", 0);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.millis();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }
}
