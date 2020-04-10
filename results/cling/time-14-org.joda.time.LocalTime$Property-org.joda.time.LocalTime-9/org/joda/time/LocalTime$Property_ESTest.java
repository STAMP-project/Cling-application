/*

 * Tue Mar 03 17:30:21 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      LocalTime localTime1 = localTime0.minusHours(1);
      localTime1.isAfter(localTime0);
      // Undeclared exception!
      try { 
        localTime1.toString("SZTPe8IVIhT{/,l|'Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 12825004);
      LocalTime localTime1 = localTime0.minusHours(12825004);
      localTime1.isAfter(localTime0);
      // Undeclared exception!
      try { 
        localTime0.toString("org.joda.time.LocalTime");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 12825004);
      String string0 = localTime0.toString((String) null);
      assertEquals("03:33:45.004", string0);
      assertEquals(4, localTime0.size());
  }
}
