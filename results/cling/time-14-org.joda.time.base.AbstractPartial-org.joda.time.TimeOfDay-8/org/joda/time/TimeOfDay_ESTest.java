/*

 * Tue Mar 03 17:12:48 GMT 2020
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
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, (-527));
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
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (DateTimeZone) fixedDateTimeZone0);
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {1970, 1, 1, 0}, intArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      String string0 = timeOfDay0.toString();
      assertEquals("T18:12:40.745", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((long) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      timeOfDay0.isSupported(dateTimeFieldType0);
      assertEquals(1, timeOfDay0.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
      assertEquals(0, timeOfDay0.getMinuteOfHour());
  }
}
