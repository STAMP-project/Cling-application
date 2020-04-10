/*

 * Tue Mar 03 16:35:40 GMT 2020
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
  public void test0()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The validated collection contains null element at index: %d", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
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
  public void test2()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      assertEquals(2, FastDateFormat.MEDIUM);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertSame(fastDateFormat1, fastDateFormat0);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertNotNull(fastDateFormat1);
  }
}
