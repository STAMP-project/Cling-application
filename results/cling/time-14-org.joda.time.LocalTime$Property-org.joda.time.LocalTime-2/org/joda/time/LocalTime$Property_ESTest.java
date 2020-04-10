/*

 * Tue Mar 03 17:28:58 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(31536000000L);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(2730);
      String string0 = localTime1.toString("E");
      assertEquals("\uFFFD", string0);
      
      boolean boolean0 = localTime0.isAfter(localTime1);
      assertFalse(boolean0);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(31535999985L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      String string0 = localTime1.toString("E");
      assertEquals("\uFFFD", string0);
      
      boolean boolean0 = localTime0.isAfter(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(3, 3, 3, 3);
      String string0 = localTime0.toString((String) null);
      assertEquals("03:03:03.003", string0);
      assertEquals(4, localTime0.size());
  }
}
