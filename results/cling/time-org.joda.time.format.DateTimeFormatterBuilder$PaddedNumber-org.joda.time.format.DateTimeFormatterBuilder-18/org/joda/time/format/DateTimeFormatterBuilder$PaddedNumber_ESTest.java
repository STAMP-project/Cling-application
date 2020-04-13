/*

 * Tue Mar 03 18:29:36 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.StringWriter;
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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 1010, true, 49);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType1, 49);
      partial0.getFormatter();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-177));
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Locale locale0 = Locale.ENGLISH;
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (long) 2216, (Chronology) iSOChronology0, 2841, dateTimeZone0, locale0);
      assertEquals(49, stringBuffer0.length());
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(dateTimeFieldType0).getField(any(org.joda.time.Chronology.class));
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType1, 16);
      partial0.getFormatter();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1010);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Locale locale0 = Locale.GERMAN;
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 31, true);
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (long) 40, (Chronology) iSOChronology0, 4, dateTimeZone0, locale0);
      assertEquals(31, stringBuffer0.length());
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 1010, true, 49);
      StringWriter stringWriter0 = new StringWriter(49);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType1, 49);
      partial0.getFormatter();
      Locale locale0 = Locale.ENGLISH;
      dateTimeFormatterBuilder_PaddedNumber0.printTo((Writer) stringWriter0, (ReadablePartial) partial0, locale0);
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringWriter0.toString());
  }
}
