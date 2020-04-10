/*

 * Tue Mar 03 17:17:58 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.TimeOfDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfYear' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      int[] intArray0 = localDate0.getValues();
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      String string0 = timeOfDay0.toString();
      assertEquals("T18:17:54.052", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      timeOfDay0.toString("6Y#&@M");
      assertEquals(4, timeOfDay0.size());
  }
}
