/*

 * Tue Mar 03 17:15:17 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.TimeOfDay;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'yearOfEra' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      String string0 = timeOfDay0.toString((DateTimeFormatter) null);
      assertEquals("T18:15:07.152", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3208);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3, 62110258}, intArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      timeOfDay0.MIDNIGHT.isSupported(dateTimeFieldType0);
      assertEquals(6, timeOfDay0.getSecondOfMinute());
      assertEquals(4, timeOfDay0.size());
      assertEquals(737, timeOfDay0.getMillisOfSecond());
  }
}
