/*

 * Tue Mar 03 17:28:07 GMT 2020
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTime dateTime0 = new DateTime((DateTimeZone) null);
      DateTime dateTime1 = dateTime0.withDayOfMonth(1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(copticChronology0, dateTime1, dateTime0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(limitChronology0);
      Chronology chronology0 = lenientChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, buddhistChronology0, locale0, (Integer) 1, 1);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "j", 0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField1 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField1.parseInto(dateTimeParserBucket0, "j", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }
}
