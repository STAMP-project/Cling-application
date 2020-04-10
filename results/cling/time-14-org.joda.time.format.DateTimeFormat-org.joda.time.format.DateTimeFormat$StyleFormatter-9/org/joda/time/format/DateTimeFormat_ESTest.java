/*

 * Tue Mar 03 18:20:53 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        DateTimeFormat.patternForStyle("L}", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style character: }
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(101, 101, 101);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((StringBuffer) null, (ReadablePartial) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: it
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = DateTimeFormat.patternForStyle("FM", locale0);
      assertEquals("yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE a hh:mm:ss", string0);
  }
}
