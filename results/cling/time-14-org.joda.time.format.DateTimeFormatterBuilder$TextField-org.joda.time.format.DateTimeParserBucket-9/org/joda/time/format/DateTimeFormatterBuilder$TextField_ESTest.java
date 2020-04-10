/*

 * Tue Mar 03 18:33:02 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.halfdays();
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstanceUTC();
      DurationField durationField1 = buddhistChronology1.halfdays();
      DateTimeParserBucket.compareReverse(durationField1, durationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField1 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringWriter stringWriter0 = new StringWriter();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      localDateTime0.toLocalDate();
      Integer integer0 = new Integer(0);
      Locale locale1 = new Locale("ggxG**frD~S~Q7.Z", "w-/-2(6X^");
      Integer integer1 = new Integer((-3473));
      Integer integer2 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(86399999, buddhistChronology0, locale1, integer2, 86399999);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "w-/-2(6X^", (-1212));
      dateTimeFormatterBuilder_TextField0.printTo((Writer) stringWriter0, (ReadablePartial) localDateTime0, locale1);
      assertEquals("1970", stringWriter0.toString());
      
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "w-/-2(6X^", 1);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      MonthDay monthDay0 = new MonthDay((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (ReadablePartial) monthDay0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream(byteArrayOutputStream0, false);
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(printStream0);
      dateTimeFormatterBuilder_TextField0.printTo((Writer) outputStreamWriter0, (ReadablePartial) partial0, locale0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((StringBuffer) null, (ReadablePartial) localDateTime0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.halfdays();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      StringWriter stringWriter0 = new StringWriter(1);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      dateTimeFormatterBuilder_TextField0.printTo((Writer) stringWriter0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("3", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.halfdays();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringWriter stringWriter0 = new StringWriter();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      dateTimeFormatterBuilder_TextField0.printTo((Writer) stringWriter0, (ReadablePartial) localDate0, locale0);
      assertEquals("\uFFFD", stringWriter0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1070L), buddhistChronology0, locale0, (Integer) 1, 2713);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Locale locale0 = Locale.UK;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1070L), buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, 2713);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "@(\"0:zJ\"n[O", 1037);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.weeks();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }
}
