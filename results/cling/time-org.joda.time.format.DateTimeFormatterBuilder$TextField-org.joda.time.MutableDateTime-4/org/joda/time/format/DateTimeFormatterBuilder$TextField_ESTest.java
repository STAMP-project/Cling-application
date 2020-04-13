/*

 * Tue Mar 03 17:27:14 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 1, (DateTimeZone) fixedDateTimeZone0);
      mutableDateTime0.setZoneRetainFields(fixedDateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3, (Chronology) null, (Locale) null, (Integer) 1, 4);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "'{Hh", 5);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      mutableDateTime0.set(dateTimeFieldType0, 26);
      assertEquals(1772558822035L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) buddhistChronology0);
      mutableDateTime0.setDate((ReadableInstant) mutableDateTime0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(2, 1);
      mutableDateTime0.setZone(dateTimeZone0);
      assertEquals(1583256421881L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 3);
      mutableDateTime0.setZoneRetainFields(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "Months", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) ethiopicChronology0);
      mutableDateTime0.setDate(0L);
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, (-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      Duration duration0 = new Duration((long) 3);
      Period period0 = duration0.toPeriodTo((ReadableInstant) mutableDateTime0);
      mutableDateTime0.add((ReadablePeriod) period0);
      assertEquals(1583256421122L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      Hours hours0 = Hours.MAX_VALUE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      mutableDateTime0.add(durationFieldType0, 0);
      assertEquals(1583256420989L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      mutableDateTime0.setTime((ReadableInstant) mutableDateTime0);
      assertEquals(1583256420843L, mutableDateTime0.getMillis());
  }
}
