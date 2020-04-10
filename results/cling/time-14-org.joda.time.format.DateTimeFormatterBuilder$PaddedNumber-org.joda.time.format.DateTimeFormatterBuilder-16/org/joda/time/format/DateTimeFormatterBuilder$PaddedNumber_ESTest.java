/*

 * Tue Mar 03 18:28:39 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 191, false, 191);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType1, 191);
      YearMonth yearMonth0 = YearMonth.now();
      partial0.getFormatter();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_PaddedNumber0.printTo((StringBuffer) null, (ReadablePartial) yearMonth0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 11);
      partial0.getFormatter();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      StringBuffer stringBuffer0 = new StringBuffer();
      Locale locale0 = Locale.CHINESE;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 11, false);
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (long) 1, chronology0, 25, (DateTimeZone) fixedDateTimeZone0, locale0);
      assertEquals(11, stringBuffer0.length());
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 191, false, 191);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType1, 191);
      dateTimeFormatterBuilder_PaddedNumber0.printTo(writer0, (ReadablePartial) partial0, (Locale) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0);
  }
}
