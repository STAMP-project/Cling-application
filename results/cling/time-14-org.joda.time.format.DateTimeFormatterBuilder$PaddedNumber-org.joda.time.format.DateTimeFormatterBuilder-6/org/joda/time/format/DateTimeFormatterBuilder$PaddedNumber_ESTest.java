/*

 * Tue Mar 03 18:27:08 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      Partial partial0 = new Partial(dateTimeFieldType0, 1587);
      partial0.getFormatter();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      StringBuffer stringBuffer0 = new StringBuffer();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType1, 152, false, 42);
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (ReadablePartial) partial0, (Locale) null);
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
      assertEquals(42, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1587);
      partial0.getFormatter();
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 0, false, 1587);
      StringBuffer stringBuffer0 = new StringBuffer();
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, (Locale) null);
      assertEquals(1587, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      Partial partial0 = new Partial(dateTimeFieldType0, 1587);
      partial0.getFormatter();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType1, 1, false);
      StringWriter stringWriter0 = new StringWriter();
      dateTimeFormatterBuilder_FixedNumber0.printTo((Writer) stringWriter0, (ReadablePartial) partial0, (Locale) null);
      assertEquals("\uFFFD", stringWriter0.toString());
  }
}
