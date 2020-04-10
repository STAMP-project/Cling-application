/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 20:59:14 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      FastDateFormat.getInstance();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertEquals(16, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      String string0 = fastDateFormat0.format((long) 0);
      assertEquals("Thursday, January 1, 1970 12:00:00 o'clock AM GMT", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2, timeZone0);
      assertEquals("d-MMM-yyyy", fastDateFormat0.getPattern());
  }
}
