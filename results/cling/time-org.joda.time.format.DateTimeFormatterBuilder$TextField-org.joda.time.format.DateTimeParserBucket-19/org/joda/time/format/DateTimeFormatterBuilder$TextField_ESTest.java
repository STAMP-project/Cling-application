/*

 * Tue Mar 03 18:35:59 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.GERMAN;
      DateMidnight.parse("6");
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, ethiopicChronology0, locale0, (Integer) 1, (-1559));
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "6", 1);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter(byteArrayOutputStream0);
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.PRC;
      dateTimeFormatterBuilder_TextField0.printTo((Writer) printWriter0, (ReadablePartial) localTime0, locale0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
      
      DateMidnight dateMidnight0 = DateMidnight.parse("6");
      assertEquals((-61977831572000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      LocalTime localTime0 = new LocalTime(0L, (DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.GERMAN;
      StringBuffer stringBuffer0 = new StringBuffer();
      DateMidnight.parse("6");
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals(2, stringBuffer0.length());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      StringBuffer stringBuffer0 = new StringBuffer();
      DateMidnight dateMidnight0 = DateMidnight.parse("6");
      assertEquals((-61977831572000L), dateMidnight0.getMillis());
      
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.forLanguageTag("GF");
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Integer integer0 = new Integer(9);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(9, gregorianChronology0, (Locale) null, integer0, 9);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1011);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1011 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DurationField durationField0 = buddhistChronology0.millis();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }
}
