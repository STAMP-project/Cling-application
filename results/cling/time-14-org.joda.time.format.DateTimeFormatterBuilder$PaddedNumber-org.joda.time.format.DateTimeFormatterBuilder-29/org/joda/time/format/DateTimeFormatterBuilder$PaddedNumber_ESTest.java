/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 03:20:13 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      Partial partial0 = new Partial(dateTimeFieldType0, 47);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isParser());
      assertNotNull(dateTimeFormatter0);
      assertTrue(dateTimeFormatter0.isPrinter());
      
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Locale locale0 = Locale.CANADA;
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 47, false, (-3410));
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, 0L, chronology0, 1942, dateTimeZone0, locale0);
      assertEquals(47, dateTimeFormatterBuilder_PaddedNumber0.estimatePrintedLength());
      assertEquals(0, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 47);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0);
  }
}
