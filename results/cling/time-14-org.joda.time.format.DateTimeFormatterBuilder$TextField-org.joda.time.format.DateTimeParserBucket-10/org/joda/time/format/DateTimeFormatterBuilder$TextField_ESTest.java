/*

 * Tue Mar 03 18:32:34 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = buddhistChronology0.millis();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) null, 560);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "t-'96Xo7gOd2Heg-uX", 1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      YearMonth yearMonth0 = new YearMonth((long) 65533, (Chronology) null);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals(1, stringBuffer0.length());
      assertEquals("\uFFFD", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      StringBuffer stringBuffer0 = new StringBuffer();
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.ITALY;
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("7", stringBuffer0.toString());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      LocalDateTime localDateTime0 = new LocalDateTime();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeParserBucket.compareReverse(millisDurationField0, millisDurationField0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      Locale locale0 = Locale.ITALIAN;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("3", stringBuffer0.toString());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.ITALY;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeParserBucket.compareReverse(millisDurationField0, millisDurationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals(2, stringBuffer0.length());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeParserBucket.compareReverse(millisDurationField0, millisDurationField0);
      StringWriter stringWriter0 = new StringWriter(9);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      LocalDate localDate0 = new LocalDate();
      dateTimeFormatterBuilder_TextField0.printTo((Writer) stringWriter0, (ReadablePartial) localDate0, locale0);
      assertEquals("\uFFFD", stringWriter0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(86400L, (Chronology) null, locale0, (Integer) null, 0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "Fs1E1L?_4[_,2f", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for clockhourOfHalfday must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      StringBuffer stringBuffer0 = new StringBuffer();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.ITALY;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("7", stringBuffer0.toString());
      
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.ITALY;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0, (Integer) null, 1);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
      
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "SF", 0);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, millisDurationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(86400L, (Chronology) null, locale0, (Integer) null, 0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
