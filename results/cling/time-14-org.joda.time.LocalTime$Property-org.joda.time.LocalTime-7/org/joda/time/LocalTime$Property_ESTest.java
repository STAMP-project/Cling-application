/*

 * Tue Mar 03 17:29:26 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy(2642);
      localTime1.toString(".");
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy(887);
      String string0 = localTime1.toString("M");
      assertEquals("\uFFFD", string0);
      
      int int0 = localTime1.compareTo((ReadablePartial) localTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      String string0 = localTime0.toString((String) null);
      assertEquals(4, localTime0.size());
      assertEquals("18:29:18.689", string0);
  }
}
