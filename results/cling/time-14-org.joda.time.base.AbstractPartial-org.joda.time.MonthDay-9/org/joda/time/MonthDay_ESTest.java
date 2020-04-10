/*

 * Tue Mar 03 16:52:30 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MonthDay_ESTest extends MonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-1925L));
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      MonthDay monthDay1 = monthDay0.minus(mutablePeriod0);
      assertEquals(2, monthDay1.size());
      assertNotSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      MonthDay monthDay0 = MonthDay.now(chronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      // Undeclared exception!
      try { 
        monthDay0.property(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'era' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-1925L));
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      MonthDay monthDay1 = new MonthDay(monthDay0, chronology0);
      assertEquals(2, monthDay1.size());
  }
}
