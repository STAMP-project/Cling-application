/*

 * Tue Mar 03 18:21:41 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forStyle("LF");
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTimeFormat.forPattern("y7NJMM");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.shortTime();
      // Undeclared exception!
      try { 
        LocalTime.parse("'y)@1E|R", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"'y)@1E|R\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      String string0 = DateTimeFormat.patternForStyle("LM", locale0);
      assertEquals("d MMMM yyyy H.mm.ss", string0);
  }
}
