/*

 * Tue Mar 03 18:28:05 GMT 2020
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
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      Partial partial0 = new Partial(dateTimeFieldType1, (-422));
      partial0.getFormatter();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 122, false);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_FixedNumber0.printTo((StringBuffer) null, 100000000000000L, (Chronology) ethiopicChronology0, 30, dateTimeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }
}
