/*

 * Tue Mar 03 18:34:54 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.field.UnsupportedDurationField;
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
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(46, islamicChronology0, locale0, (Integer) 0, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
      
      int int1 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "Interval must not be null", 0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer(32);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now((Chronology) islamicChronology0);
      Locale locale0 = Locale.ITALIAN;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals(1, stringBuffer0.length());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      Locale locale0 = Locale.ITALIAN;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "Interval must not be null");
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals(27, stringBuffer0.length());
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      Locale locale0 = Locale.ITALIAN;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(182L);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "Interval must not be null");
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals("Interval must not be null24", stringBuffer0.toString());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      StringBuffer stringBuffer0 = new StringBuffer(32);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.halfdays();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 32);
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localTime0, locale0);
      assertEquals(2, stringBuffer0.length());
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer(46);
      YearMonth yearMonth0 = YearMonth.now();
      Locale locale0 = Locale.ITALIAN;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals(4, stringBuffer0.length());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringBuffer stringBuffer0 = new StringBuffer(32);
      YearMonth yearMonth0 = YearMonth.now();
      Locale locale0 = Locale.ITALIAN;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals("\uFFFD", stringBuffer0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, (DurationField) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now((Chronology) islamicChronology0);
      Locale locale0 = Locale.ITALIAN;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
      
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(32, islamicChronology0, locale0, (Integer) yearMonth0.YEAR, 1);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "9|_aNJH$Rz~7)y+cM,>", 0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(46, islamicChronology0, locale0, (Integer) 0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-3599999L), long0);
  }
}
