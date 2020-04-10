/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:32:57 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(ethiopicChronology0);
      TimeOfDay timeOfDay0 = new TimeOfDay(1L, (Chronology) strictChronology0);
      timeOfDay0.isSupported((DateTimeFieldType) null);
      assertEquals(4, timeOfDay0.size());
      assertEquals(0, timeOfDay0.getMinuteOfHour());
      assertEquals(1, timeOfDay0.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2019, 8, 18, 5575643}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      String string0 = timeOfDay0.toString();
      assertEquals(4, timeOfDay0.size());
      assertEquals("T00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 5367);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfMonth' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
