/*

 * Tue Mar 03 18:21:10 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.longDateTime();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "+ul=)B(", 3);
      assertEquals(1583259664382L, mutableDateTime0.getMillis());
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        DateTimeFormat.patternForStyle("F$", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style character: $
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }
}
