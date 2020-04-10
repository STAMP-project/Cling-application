/*

 * Tue Mar 03 16:52:17 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.Hours;
import org.joda.time.MonthDay;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MonthDay_ESTest extends MonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Hours hours0 = Hours.FIVE;
      MonthDay monthDay1 = monthDay0.plus(hours0);
      assertEquals(3, monthDay1.getMonthOfYear());
      assertEquals(2, monthDay1.size());
      assertNotSame(monthDay1, monthDay0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Calendar calendar0 = mock(Calendar.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(calendar0).get(anyInt());
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(calendar0);
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay(yearMonth0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfMonth' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
