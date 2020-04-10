/*

 * Tue Mar 03 17:30:10 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.LocalTime;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) copticChronology0);
      LocalTime localTime1 = localTime0.minusMinutes(1);
      localTime1.isEqual(localTime0);
      // Undeclared exception!
      try { 
        localTime0.toString("-<v 6#H>Z 2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) copticChronology0);
      LocalTime localTime1 = localTime0.minusMinutes(1);
      localTime0.isEqual(localTime1);
      // Undeclared exception!
      try { 
        localTime0.toString("-<v 6#H>Z 2");
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
  public void test2()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      String string0 = localTime0.toString((String) null);
      assertEquals(4, localTime0.size());
      assertEquals("18:30:03.008", string0);
  }
}
