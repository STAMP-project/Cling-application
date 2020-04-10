/*

 * Tue Mar 03 18:34:15 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(100L, buddhistChronology0, locale0, (Integer) 1, 274);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 274);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals((-70656365972000L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2342L), buddhistChronology0, locale0, (Integer) 1, 1);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "Cnn'ot parse \"", 28181250);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1016));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.forLanguageTag("org.joda.time.MonthDay$Property");
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      LocalDate localDate0 = new LocalDate((-1044L), (DateTimeZone) fixedDateTimeZone0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      assertEquals(1, stringBuffer0.length());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      StringBuffer stringBuffer0 = new StringBuffer();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.forLanguageTag("");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      LocalDate localDate0 = new LocalDate(1073741823L, (Chronology) gJChronology0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      assertEquals(4, stringBuffer0.length());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      StringBuffer stringBuffer0 = new StringBuffer();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.forLanguageTag("");
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      LocalDate localDate0 = new LocalDate(1073741823L, (Chronology) gJChronology0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      assertEquals(4, stringBuffer0.length());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 20);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) partial0, locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1042L, buddhistChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "annot", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value \"annot\" for weekyear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringBuffer stringBuffer0 = new StringBuffer();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 20);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) partial0, locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1042L, buddhistChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "annot", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value \"annot\" for weekyear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringBuffer stringBuffer0 = new StringBuffer("Cnn'ot parse \"");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Partial partial0 = new Partial(buddhistChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2342L), buddhistChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1016));
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) partial0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(100000000000L, buddhistChronology0, (Locale) null, (Integer) 1, (-2445));
      DateTimeField dateTimeField0 = buddhistChronology0.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", (Locale) null);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Integer integer0 = new Integer(2);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5294L, gJChronology0, (Locale) null, integer0, 2);
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "Parsing is not supported", 3398);
      assertEquals((-3399), int0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      int int1 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(100L, buddhistChronology0, locale0, (Integer) 1, 274);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 274);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 274 for era must be in the range [1,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }
}
