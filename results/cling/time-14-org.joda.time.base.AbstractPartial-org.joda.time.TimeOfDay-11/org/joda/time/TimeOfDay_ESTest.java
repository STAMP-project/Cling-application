/*

 * Tue Mar 03 17:16:16 GMT 2020
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
  @Ignore
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      timeOfDay0.isSupported(dateTimeFieldType0);
      assertEquals(58, timeOfDay0.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
      int[] intArray0 = localTime0.getValues();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(10, 10, 10, 10);
      String string0 = timeOfDay0.MIDNIGHT.toString();
      assertEquals(4, timeOfDay0.size());
      assertEquals("T00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'yearOfCentury' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
