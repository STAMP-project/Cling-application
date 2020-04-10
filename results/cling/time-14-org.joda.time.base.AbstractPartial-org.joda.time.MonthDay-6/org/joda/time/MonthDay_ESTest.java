/*

 * Tue Mar 03 16:52:16 GMT 2020
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
import org.joda.time.Period;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MonthDay_ESTest extends MonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      MonthDay monthDay0 = new MonthDay(576, 0, chronology0);
      Period period0 = Period.months(576);
      // Undeclared exception!
      try { 
        monthDay0.withPeriodAdded(period0, 576);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      // Undeclared exception!
      try { 
        monthDay0.withField(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'secondOfDay' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      MonthDay monthDay0 = new MonthDay(chronology0);
      String string0 = monthDay0.toString((String) null);
      assertEquals(2, monthDay0.size());
      assertEquals("--\uFFFD\uFFFD-\uFFFD\uFFFD", string0);
  }
}
