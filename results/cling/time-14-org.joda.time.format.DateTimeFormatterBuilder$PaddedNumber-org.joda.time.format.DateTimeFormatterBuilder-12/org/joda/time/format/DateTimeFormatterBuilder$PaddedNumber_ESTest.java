/*

 * Tue Mar 03 18:28:04 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 6, buddhistChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      Partial partial0 = new Partial(dateTimeFieldType0, 14);
      partial0.getFormatter();
      Partial partial1 = partial0.without(dateTimeFieldType0);
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1, true);
      StringBuffer stringBuffer0 = new StringBuffer();
      Locale locale0 = Locale.CANADA_FRENCH;
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (ReadablePartial) partial1, locale0);
      assertEquals(1, stringBuffer0.length());
      assertEquals("\uFFFD", stringBuffer0.toString());
  }
}
