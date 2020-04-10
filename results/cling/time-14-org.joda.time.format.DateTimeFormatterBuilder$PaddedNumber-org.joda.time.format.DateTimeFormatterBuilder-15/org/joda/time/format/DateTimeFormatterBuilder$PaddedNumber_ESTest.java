/*

 * Tue Mar 03 18:28:44 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.getFormatter();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType1, 3403, true, 1);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (ReadablePartial) partial0, (Locale) null);
      assertEquals("\uFFFD", stringBuffer0.toString());
      assertEquals("\uFFFD", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.getFormatter();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType1, 3403, true, 1);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (ReadablePartial) partial0, (Locale) null);
      assertEquals("\uFFFD", stringBuffer0.toString());
      assertEquals(3403, dateTimeFormatterBuilder_PaddedNumber0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.getFormatter();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType1, 1, true, 1);
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      dateTimeFormatterBuilder_PaddedNumber0.printTo((Writer) pipedWriter0, (ReadablePartial) partial0, (Locale) null);
      assertEquals(1, partial0.size());
  }
}
