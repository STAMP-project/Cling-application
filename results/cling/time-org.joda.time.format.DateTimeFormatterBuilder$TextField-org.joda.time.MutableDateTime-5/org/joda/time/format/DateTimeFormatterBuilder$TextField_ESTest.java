/*

 * Tue Mar 03 17:27:08 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      Integer integer0 = new Integer(65533);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(65533);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      DateTime dateTime0 = new DateTime((long) 588, (Chronology) lenientChronology0);
      DateTime dateTime1 = dateTime0.withYearOfEra(588);
      LimitChronology limitChronology0 = LimitChronology.getInstance(chronology0, dateTime1, dateTime0);
      limitChronology0.withZone(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(588, limitChronology0, locale0, integer0, 355);
      assertEquals(65533, (int)dateTimeParserBucket0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(delegatedDateTimeField0).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "g6r{ew)0", 1);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField1 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1, 1);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField1.parseInto(dateTimeParserBucket1, "g6r{ew)0", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }
}
