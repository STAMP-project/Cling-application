/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:31:16 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.TimeOfDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      timeOfDay0.isSupported(dateTimeFieldType0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(6, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2019, 8, 18, 5474997}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.get(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'secondOfDay' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
