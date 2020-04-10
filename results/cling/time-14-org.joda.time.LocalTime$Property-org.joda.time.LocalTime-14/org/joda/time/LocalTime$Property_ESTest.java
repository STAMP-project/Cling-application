/*

 * Tue Mar 03 17:29:49 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = LocalTime.fromMillisOfDay(1506L);
      localTime1.isEqual(localTime0);
      String string0 = localTime0.toString(";");
      assertEquals(";", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = LocalTime.fromMillisOfDay(1506L);
      localTime0.isAfter(localTime1);
      String string0 = localTime0.toString(";");
      assertEquals(";", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      String string0 = localTime0.toString((String) null);
      assertEquals("18:29:41.555", string0);
      assertEquals(4, localTime0.size());
  }
}
