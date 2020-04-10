/*

 * Tue Mar 03 17:27:14 GMT 2020
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1, dateTimeZone0);
      DateTime dateTime1 = dateTime0.withZone(dateTimeZone1);
      DateMidnight dateMidnight0 = dateTime1.toDateMidnight();
      LimitChronology limitChronology0 = LimitChronology.getInstance(chronology0, dateMidnight0, dateTime0);
      Chronology chronology1 = limitChronology0.withUTC();
      assertNotSame(limitChronology0, chronology1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Locale locale0 = Locale.GERMAN;
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1, dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(chronology0, dateMidnight0, dateTime0);
      limitChronology0.withUTC();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, lenientChronology0, locale0, (Integer) 1, 1);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "' is not supported", 1);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(dateTimeParserBucket0).getLocale();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "org.joda.time.format.DateTimeFormatterBuilder$TextField", (-1512));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
