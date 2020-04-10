/*

 * Tue Mar 03 18:35:14 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, (Locale) null, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "A5w)");
      assertEquals((-53184211200000L), long0);
      
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "JrI0b@0.kt]'+t]", 1);
      assertEquals((-2), int0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, (Locale) null, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "#", (Locale) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringWriter stringWriter0 = new StringWriter();
      LocalTime localTime0 = new LocalTime();
      dateTimeFormatterBuilder_TextField0.printTo((Writer) stringWriter0, (ReadablePartial) localTime0, (Locale) null);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "#");
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Cannot parse \"#\": Value \"#\" for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, (Locale) null, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "#", (Locale) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      BufferedWriter bufferedWriter0 = new BufferedWriter(charArrayWriter0);
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      dateTimeFormatterBuilder_TextField0.printTo((Writer) bufferedWriter0, (ReadablePartial) partial0, (Locale) null);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "#");
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Cannot parse \"#\": Value \"#\" for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, (Locale) null, (Integer) 1, 1);
      StringBuffer stringBuffer0 = new StringBuffer(" ");
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      dateTimeParserBucket0.computeMillis(false, " ");
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) partial0, (Locale) null);
      assertEquals(" 1", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, (Locale) null, (Integer) 1, 1);
      StringBuffer stringBuffer0 = new StringBuffer();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, copticChronology0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "A5w)");
      assertEquals((-53184211200000L), long0);
      
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) partial0, (Locale) null);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, (Locale) null, (Integer) 1, 1);
      StringBuffer stringBuffer0 = new StringBuffer();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, copticChronology0);
      Partial partial1 = partial0.without(dateTimeFieldType0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) partial1, (Locale) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "A5w)");
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, (Locale) null, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "#", (Locale) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "#", 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "#");
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Cannot parse \"#\": Value \"#\" for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }
}
