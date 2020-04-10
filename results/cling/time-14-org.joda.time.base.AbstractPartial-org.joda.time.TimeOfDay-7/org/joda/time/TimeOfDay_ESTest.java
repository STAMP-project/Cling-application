/*

 * Tue Mar 03 17:13:13 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.TimeOfDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'hourOfDay' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      String string0 = timeOfDay0.toString();
      assertEquals(4, timeOfDay0.size());
      assertEquals("T00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int[] intArray0 = localTime0.getValues();
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      timeOfDay0.MIDNIGHT.isSupported((DateTimeFieldType) null);
      assertEquals(4, timeOfDay0.size());
      assertEquals(498, timeOfDay0.getMillisOfSecond());
  }
}
