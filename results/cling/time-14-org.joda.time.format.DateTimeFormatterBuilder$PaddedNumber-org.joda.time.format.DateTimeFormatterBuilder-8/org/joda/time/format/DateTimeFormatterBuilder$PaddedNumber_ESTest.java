/*

 * Tue Mar 03 18:27:03 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, islamicChronology0);
      partial0.getFormatter();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1, false);
      Locale locale0 = Locale.US;
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, islamicChronology0);
      partial0.getFormatter();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1, false);
      Locale locale0 = Locale.US;
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
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.getFormatter();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1, false);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_FixedNumber0.printTo((Writer) null, (ReadablePartial) partial0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }
}
