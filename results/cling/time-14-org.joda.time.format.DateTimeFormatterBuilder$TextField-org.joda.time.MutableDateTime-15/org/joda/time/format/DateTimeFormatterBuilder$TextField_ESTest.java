/*

 * Tue Mar 03 17:27:59 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDate localDate0 = new LocalDate(0L);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(ethiopicChronology0, dateTime0, (ReadableDateTime) null);
      Chronology chronology0 = limitChronology0.withZone(dateTimeZone0);
      assertNotSame(limitChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTime dateTime0 = new DateTime((long) 1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(ethiopicChronology0, (ReadableDateTime) null, dateTime0);
      limitChronology0.withUTC();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "Zone must not be null", 1);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(dateTimeParserBucket0).getLocale();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "bce", 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
