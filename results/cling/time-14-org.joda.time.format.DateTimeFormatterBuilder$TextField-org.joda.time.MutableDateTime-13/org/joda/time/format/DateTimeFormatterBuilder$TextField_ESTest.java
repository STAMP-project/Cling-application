/*

 * Tue Mar 03 17:27:51 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      LimitChronology limitChronology0 = LimitChronology.getInstance(islamicChronology0, (ReadableDateTime) null, dateTime0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, limitChronology0, locale0, (Integer) 1, 1);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      Chronology chronology0 = limitChronology0.withZone(dateTimeZone1);
      assertSame(limitChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, true);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      LimitChronology limitChronology0 = LimitChronology.getInstance(islamicChronology0, (ReadableDateTime) null, dateTime0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(713, limitChronology0, locale0, (Integer) islamicChronology0.AH, 1267);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, (String) null, 1267);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      LimitChronology limitChronology0 = LimitChronology.getInstance(islamicChronology0, (ReadableDateTime) null, dateTime0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1, limitChronology0, locale0, (Integer) 1, 1);
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "b+ 5Ji", 1);
      assertEquals((-2), int0);
      assertEquals(6, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }
}
