/*

 * Tue Mar 03 18:20:37 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forStyle("LM");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTimeFormat.forPattern("d@cjAH7#4it7`:|");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(120, 120, 120);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      PipedWriter pipedWriter0 = new PipedWriter();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) pipedWriter0, (long) 120, (Chronology) gregorianChronology0, 120, dateTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: zh_CN
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      String string0 = DateTimeFormat.patternForStyle("-F", (Locale) null);
      assertEquals("ahh'\u6642'mm'\u5206'ss'\u79D2' z", string0);
  }
}
