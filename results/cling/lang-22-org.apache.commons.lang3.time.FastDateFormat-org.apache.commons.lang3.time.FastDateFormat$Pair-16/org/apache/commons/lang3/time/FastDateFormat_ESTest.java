/*

 * Tue Mar 03 16:37:23 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      String string0 = fastDateFormat0.format((long) 1);
      assertEquals("December 31, 1969 11:59:58 PM GMT+00:00", string0);
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
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0);
      assertEquals(31, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertSame(fastDateFormat1, fastDateFormat0);
  }
}
