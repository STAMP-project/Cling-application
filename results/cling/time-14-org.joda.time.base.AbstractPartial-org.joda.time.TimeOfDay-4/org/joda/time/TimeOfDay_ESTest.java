/*

 * Tue Mar 03 17:11:49 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(10000, 11);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      boolean boolean0 = yearMonth0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3, 65504399}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1L), (Chronology) null);
      String string0 = timeOfDay0.toString();
      assertEquals("T00:59:59.999", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 1889);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'centuryOfEra' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
