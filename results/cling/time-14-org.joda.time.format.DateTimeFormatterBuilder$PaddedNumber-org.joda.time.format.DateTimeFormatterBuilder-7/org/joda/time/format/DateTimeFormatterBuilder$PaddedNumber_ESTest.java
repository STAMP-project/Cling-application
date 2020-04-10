/*

 * Tue Mar 03 18:27:01 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Locale locale0 = Locale.UK;
      YearMonth yearMonth0 = new YearMonth((long) 8, (Chronology) gJChronology0);
      Partial partial0 = new Partial(yearMonth0);
      partial0.getFormatter();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber((DateTimeFieldType) null, 8, true, 8);
      StringBuffer stringBuffer0 = new StringBuffer();
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (ReadablePartial) yearMonth0, locale0);
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
      assertEquals(8, dateTimeFormatterBuilder_PaddedNumber0.estimatePrintedLength());
  }
}
