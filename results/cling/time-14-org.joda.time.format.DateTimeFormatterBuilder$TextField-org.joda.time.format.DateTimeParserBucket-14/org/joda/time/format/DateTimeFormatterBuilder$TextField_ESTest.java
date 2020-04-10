/*

 * Tue Mar 03 18:35:15 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.Writer;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = buddhistChronology0.hours();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.forLanguageTag("DateTimeZone must not be null");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1942L), copticChronology0, locale0, (Integer) islamicChronology0.AH, 960);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals((-22920365972000L), long0);
      
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "DateTimeZone must not be null", 1);
      assertEquals((-2), int0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.forLanguageTag("DateTimeZone must not be null");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1942L), copticChronology0, locale0, (Integer) islamicChronology0.AH, 960);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.computeMillis(true);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      DateMidnight dateMidnight0 = new DateMidnight((-332L));
      Date date0 = dateMidnight0.toDate();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      assertEquals("1", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) gJChronology0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      dateTimeFormatterBuilder_TextField0.printTo((Writer) charArrayWriter0, (ReadablePartial) yearMonth0, locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2147483648L), gJChronology0, locale0, (Integer) null, 3600000);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 3600000);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 3600000 for clockhourOfHalfday must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Locale locale0 = Locale.forLanguageTag("DateTimeZone must not be null");
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      DateMidnight dateMidnight0 = new DateMidnight((-332L));
      Date date0 = dateMidnight0.toDate();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      assertEquals("1", stringBuffer0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Integer integer0 = new Integer(20);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(20, iSOChronology0, (Locale) null, integer0, 7);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 7);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-61945775999980L), long0);
      
      long long1 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-61945775999980L), long1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.forLanguageTag("DateTimeZone must not be null");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1942L), copticChronology0, locale0, (Integer) islamicChronology0.AH, 960);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.computeMillis(true);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      DateMidnight dateMidnight0 = new DateMidnight((-332L));
      Date date0 = dateMidnight0.toDate();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDate0, locale0);
      assertEquals("1", stringBuffer0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }
}
