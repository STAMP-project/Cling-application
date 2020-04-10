/*

 * Tue Mar 03 17:14:30 GMT 2020
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
import org.joda.time.TimeOfDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      // Undeclared exception!
      try { 
        timeOfDay0.get(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'minuteOfDay' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((Object) null);
      int[] intArray0 = localTime0.getValues();
      assertArrayEquals(new int[] {18, 14, 22, 967}, intArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      String string0 = timeOfDay0.toString();
      assertEquals("T18:14:22.715", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      timeOfDay0.MIDNIGHT.isSupported(dateTimeFieldType0);
      assertEquals(530, timeOfDay0.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
      assertEquals(14, timeOfDay0.getMinuteOfHour());
  }
}
