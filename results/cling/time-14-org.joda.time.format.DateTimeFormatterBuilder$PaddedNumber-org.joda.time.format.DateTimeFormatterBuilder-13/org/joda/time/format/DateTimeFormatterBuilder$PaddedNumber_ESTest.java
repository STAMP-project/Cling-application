/*

 * Tue Mar 03 18:28:06 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType1, 5, julianChronology0);
      partial0.getFormatter();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 5, true);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_FixedNumber0.printTo((StringBuffer) null, (ReadablePartial) partial0, locale0);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekOfWeekyear();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType1, 5, julianChronology0);
      partial0.getFormatter();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 5, true);
      StringBuffer stringBuffer0 = new StringBuffer("rFpS' 6Y`A\"|V");
      Locale locale0 = Locale.GERMAN;
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (ReadablePartial) partial0, locale0);
      assertEquals(18, stringBuffer0.length());
      assertEquals("rFpS' 6Y`A\"|V\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 10, julianChronology0);
      partial0.getFormatter();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 10, true, 10);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_PaddedNumber0.printTo((Writer) null, (long) 1712, (Chronology) julianChronology0, 10, dateTimeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }
}
