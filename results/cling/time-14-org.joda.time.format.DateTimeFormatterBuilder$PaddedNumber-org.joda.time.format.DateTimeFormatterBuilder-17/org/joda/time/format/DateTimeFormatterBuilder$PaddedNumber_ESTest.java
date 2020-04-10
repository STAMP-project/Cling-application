/*

 * Tue Mar 03 18:29:35 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFieldType dateTimeFieldType1 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(dateTimeFieldType1).getField(any(org.joda.time.Chronology.class));
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType1, 1137, true, 759);
      StringBuffer stringBuffer0 = new StringBuffer("b&aR");
      dateTimeFormatterBuilder_PaddedNumber0.printTo(stringBuffer0, (long) 939, (Chronology) buddhistChronology0, 1, (DateTimeZone) null, (Locale) null);
      Partial partial0 = new Partial(dateTimeFieldType0, 35, buddhistChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 35, buddhistChronology0);
      partial0.getFormatter();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType1, 1, false);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (ReadablePartial) partial0, locale0);
      assertEquals(1, stringBuffer0.length());
      assertEquals("\uFFFD", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFieldType dateTimeFieldType1 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType1, 939, true, 759);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      Partial partial0 = new Partial(dateTimeFieldType0, 1, buddhistChronology0);
      partial0.getFormatter();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      dateTimeFormatterBuilder_PaddedNumber0.printTo(writer0, (ReadablePartial) partial0, locale0);
      assertEquals(1, partial0.size());
  }
}
