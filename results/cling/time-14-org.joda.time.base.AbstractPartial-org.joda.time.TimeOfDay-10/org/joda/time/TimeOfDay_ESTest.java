/*

 * Tue Mar 03 17:12:21 GMT 2020
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
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.TimeOfDay;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      // Undeclared exception!
      try { 
        timeOfDay0.withField((DateTimeFieldType) null, 2640);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'null' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MonthDay monthDay0 = new MonthDay((DateTimeZone) fixedDateTimeZone0);
      LocalDate localDate0 = monthDay0.toLocalDate(3);
      int[] intArray0 = localDate0.getValues();
      assertArrayEquals(new int[] {3, 3, 3}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(1L);
      String string0 = timeOfDay0.MIDNIGHT.toString();
      assertEquals("T00:00:00.000", string0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(0, timeOfDay0.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(1L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      timeOfDay0.isSupported(dateTimeFieldType0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(0, timeOfDay0.getMinuteOfHour());
      assertEquals(1, timeOfDay0.getMillisOfSecond());
  }
}
