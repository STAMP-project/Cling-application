/*

 * Tue Mar 03 18:33:03 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1, 1);
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "", 1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, true);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (ReadablePartial) yearMonth0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Locale locale0 = Locale.GERMAN;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "OMJ6*t*3r^JR9gH4+");
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      LocalDate localDate0 = new LocalDate((-2116L));
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      assertEquals("OMJ6*t*3r^JR9gH4+1", stringBuffer0.toString());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.GERMAN;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      StringBuffer stringBuffer0 = new StringBuffer();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(168, 12);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals(2, stringBuffer0.length());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      Locale locale0 = Locale.GERMAN;
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      LocalTime localTime0 = new LocalTime(1110L, (Chronology) buddhistChronology0);
      dateTimeFormatterBuilder_TextField0.printTo(writer0, (ReadablePartial) localTime0, locale0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      Locale locale0 = Locale.US;
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      LocalTime localTime0 = new LocalTime((long) (-2), (Chronology) buddhistChronology0);
      dateTimeFormatterBuilder_TextField0.printTo(writer0, (ReadablePartial) localTime0, locale0);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.ITALIAN;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      LocalTime localTime0 = new LocalTime((long) 5, (Chronology) buddhistChronology0);
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
      Locale locale0 = Locale.GERMAN;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-28), iSOChronology0, locale0, (Integer) null, (-28));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "c{M67^N\"@]", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "c{M67^N\"@]", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "a");
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Cannot parse \"a\": Value \"c{M67^N\"@]\" for weekOfWeekyear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.GERMAN;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
      
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, (-3221));
      int int1 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "7|)<tKeRQ!KUPdI", 168);
      assertEquals((-169), int1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }
}
