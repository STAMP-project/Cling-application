/*

 * Tue Mar 03 17:29:09 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalTime;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology.getInstance();
      long long0 = 45624888L;
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = new LocalTime();
      localTime0.isBefore(localTime1);
      localTime0.getValues();
      // Undeclared exception!
      try { 
        localTime1.toString("xx>v}Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      String string0 = localTime0.toString((String) null);
      assertEquals("18:29:02.358", string0);
      assertEquals(4, localTime0.size());
  }
}
