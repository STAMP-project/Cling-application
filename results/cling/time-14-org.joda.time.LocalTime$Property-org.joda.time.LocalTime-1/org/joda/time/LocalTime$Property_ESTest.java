/*

 * Tue Mar 03 17:28:29 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
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
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusHours((-2197));
      localTime1.isEqual(localTime0);
      // Undeclared exception!
      try { 
        localTime1.toString("Field must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      localTime0.isEqual(localTime1);
      // Undeclared exception!
      try { 
        localTime0.toString("~b2|&G;DLTmgEGlu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      String string0 = localTime0.toString((String) null);
      assertEquals("18:28:19.757", string0);
      assertEquals(4, localTime0.size());
  }
}
