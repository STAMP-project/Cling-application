/*

 * Tue Mar 03 18:27:31 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 1, true, 1079);
      StringWriter stringWriter0 = new StringWriter(1);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.centuryOfEra();
      Locale locale0 = Locale.GERMAN;
      Partial partial0 = new Partial(dateTimeFieldType1, 1079);
      partial0.getFormatter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (ReadablePartial) partial0, locale0);
      assertEquals(1079, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 1, false, 1);
      MonthDay monthDay0 = new MonthDay();
      monthDay0.toString();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_PaddedNumber0.printTo((StringBuffer) null, (ReadablePartial) monthDay0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 1, true, 1079);
      StringWriter stringWriter0 = new StringWriter(1);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.centuryOfEra();
      Locale locale0 = Locale.GERMAN;
      Partial partial0 = new Partial(dateTimeFieldType1, 1079);
      partial0.getFormatter();
      dateTimeFormatterBuilder_PaddedNumber0.printTo((Writer) stringWriter0, (ReadablePartial) partial0, locale0);
      assertEquals(1, dateTimeFormatterBuilder_PaddedNumber0.estimatePrintedLength());
  }
}
