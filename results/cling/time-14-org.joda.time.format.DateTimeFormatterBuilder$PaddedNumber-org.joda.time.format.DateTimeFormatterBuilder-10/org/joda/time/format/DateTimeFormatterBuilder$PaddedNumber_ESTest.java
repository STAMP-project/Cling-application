/*

 * Tue Mar 03 18:27:26 GMT 2020
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
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(8, 8);
      DateTimeFieldType dateTimeFieldType1 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(dateTimeFieldType1).getField(any(org.joda.time.Chronology.class));
      Partial partial0 = new Partial(dateTimeFieldType0, 8, julianChronology0);
      partial0.getFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("'J|f{RAw<`}Y");
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType1, 45, false);
      Locale locale0 = Locale.US;
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, 1678L, (Chronology) julianChronology0, 65533, dateTimeZone0, locale0);
      assertEquals("'J|f{RAw<`}Y\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
      assertEquals(58, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) (-2262));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      monthDay0.toString();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1, true);
      StringBuffer stringBuffer0 = new StringBuffer("Pacific/Auckland");
      Locale locale0 = new Locale("--01-01");
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (ReadablePartial) monthDay0, locale0);
      assertEquals("Pacific/Auckland\uFFFD", stringBuffer0.toString());
      assertEquals(17, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(8, 8);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType1 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeField) null).when(dateTimeFieldType1).getField(any(org.joda.time.Chronology.class));
      Partial partial0 = new Partial(dateTimeFieldType0, 8, julianChronology0);
      partial0.getFormatter();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType1, 45, false);
      Locale locale0 = Locale.ROOT;
      dateTimeFormatterBuilder_FixedNumber0.printTo(writer0, (long) (-578), (Chronology) julianChronology0, (-1331), dateTimeZone0, locale0);
      assertEquals("+08:08", dateTimeZone0.toString());
  }
}
