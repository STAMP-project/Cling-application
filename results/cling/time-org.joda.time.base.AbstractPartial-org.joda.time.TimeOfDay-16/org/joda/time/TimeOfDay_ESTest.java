/*

 * Tue Mar 03 17:14:24 GMT 2020
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
      TimeOfDay timeOfDay0 = new TimeOfDay((-7L));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'centuryOfEra' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int[] intArray0 = localDateTime0.getValues();
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      String string0 = timeOfDay0.toString();
      assertEquals("T00:00:00.000", string0);
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      timeOfDay0.isSupported(dateTimeFieldType0);
      assertEquals(4, timeOfDay0.size());
  }
}
