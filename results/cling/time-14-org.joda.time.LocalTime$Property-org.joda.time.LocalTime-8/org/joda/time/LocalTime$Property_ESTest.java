/*

 * Tue Mar 03 17:29:26 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy((-3253));
      localTime1.compareTo((ReadablePartial) localTime0);
      // Undeclared exception!
      try { 
        localTime1.toString("w+[pTbhc7ELPXEM=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(1603);
      localTime1.isBefore(localTime0);
      // Undeclared exception!
      try { 
        localTime1.toString("l5 gXPNA&v gPzt|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      String string0 = localTime0.toString((String) null);
      assertEquals("00:00:00.000", string0);
      assertEquals(4, localTime0.size());
  }
}
