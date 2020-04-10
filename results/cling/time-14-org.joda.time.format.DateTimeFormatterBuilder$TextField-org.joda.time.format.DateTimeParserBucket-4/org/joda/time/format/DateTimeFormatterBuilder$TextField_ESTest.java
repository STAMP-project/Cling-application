/*

 * Tue Mar 03 18:34:16 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = new Locale("BCE", "BCE", "rg");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), buddhistChronology0, locale0, (Integer) 1, (-3));
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(buddhistChronology0);
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-79271136000001L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "Deutschland", 20);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(0L, (Chronology) null, locale0, (Integer) 1, 1);
      dateTimeParserBucket1.saveField(dateTimeFieldType0, "Deutschland", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket1.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value \"Deutschland\" for dayOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (ReadablePartial) monthDay0, (Locale) null);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Locale locale0 = new Locale("1K~K&GL)8}hn");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (ReadablePartial) localDateTime0, locale0);
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
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Locale locale0 = Locale.US;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "1K~K&GL)8}hn");
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("1K~K&GL)8}hn20", stringBuffer0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer(41);
      YearMonth yearMonth0 = YearMonth.now();
      Locale locale0 = Locale.JAPAN;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1108L), ethiopicChronology0, (Locale) null, (Integer) 0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "C", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value \"C\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer(41);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = new Locale("BCE", "BCE", "rg");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), buddhistChronology0, locale0, (Integer) 1, (-3));
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(buddhistChronology0);
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      YearMonth yearMonth0 = YearMonth.now();
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals("\uFFFD", stringBuffer0.toString());
      
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-79271136000001L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "Deutschland", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 47);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value \"Deutschland\" for dayOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.GERMANY;
      StringBuffer stringBuffer0 = new StringBuffer("Deutschland");
      DateMidnight dateMidnight0 = new DateMidnight((long) (-21), (Chronology) null);
      Calendar calendar0 = dateMidnight0.toCalendar(locale0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(calendar0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "Deutschland", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value \"Deutschland\" for dayOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Locale locale0 = new Locale("1K~K&GL)8}hn");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1879048190), islamicChronology0, locale0, (Integer) islamicChronology0.AH, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      int int1 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "DurationField[millis]", 1620);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
      assertEquals((-1621), int1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1470), islamicChronology0, locale0, (Integer) 1, 181);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "m3`dG", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value \"m3`dG\" for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals(0, int0);
  }
}
