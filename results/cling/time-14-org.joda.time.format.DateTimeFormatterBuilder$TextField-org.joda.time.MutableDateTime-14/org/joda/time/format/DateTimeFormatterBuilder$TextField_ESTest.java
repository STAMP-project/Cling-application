/*

 * Tue Mar 03 17:27:54 GMT 2020
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
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeField0).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "\uFFFD", 1);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField1 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, true);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1, (-2011));
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField1.parseInto(dateTimeParserBucket1, "\uFFFD", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }
}
