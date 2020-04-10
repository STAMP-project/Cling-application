/*

 * Tue Mar 03 17:28:53 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeField;
import org.joda.time.LocalTime;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = mock(LocalTime.class, new ViolatedAssumptionAnswer());
      doReturn(iSOChronology0, iSOChronology0, iSOChronology0, iSOChronology0).when(localTime0).getChronology();
      doReturn(31449600000L, (-1681L), 888L, 21260793600000L, 31449600000L).when(localTime0).getLocalMillis();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(2295L).when(dateTimeField0).add(anyLong() , anyInt());
      doReturn((-3159L)).when(dateTimeField0).add(anyLong() , anyLong());
      doReturn(21260793600000L).when(dateTimeField0).roundFloor(anyLong());
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      LocalTime localTime1 = localTime_Property0.addCopy(2290L);
      localTime_Property0.addNoWrapToCopy((-1));
      LocalTime localTime2 = localTime_Property0.roundFloorCopy();
      localTime2.isBefore(localTime1);
      String string0 = localTime2.toString("\uFFFD\uFFFD:59:56.841");
      assertEquals("\uFFFD\uFFFD:59:56.841", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = mock(LocalTime.class, new ViolatedAssumptionAnswer());
      doReturn(iSOChronology0, iSOChronology0, iSOChronology0, iSOChronology0).when(localTime0).getChronology();
      doReturn(31449600000L, (-1681L), 888L, 21260793600000L, 31449600000L).when(localTime0).getLocalMillis();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(2295L).when(dateTimeField0).add(anyLong() , anyInt());
      doReturn((-3159L)).when(dateTimeField0).add(anyLong() , anyLong());
      doReturn(21260793600000L).when(dateTimeField0).roundFloor(anyLong());
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      LocalTime localTime1 = localTime_Property0.addCopy(2290L);
      localTime_Property0.addNoWrapToCopy((-1));
      LocalTime localTime2 = localTime_Property0.roundFloorCopy();
      localTime1.isAfter(localTime2);
      String string0 = localTime2.toString("\uFFFD\uFFFD:59:56.841");
      assertEquals("\uFFFD\uFFFD:59:56.841", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      String string0 = localTime0.toString((String) null);
      assertEquals("00:00:00.000", string0);
      assertEquals(4, localTime0.size());
  }
}
