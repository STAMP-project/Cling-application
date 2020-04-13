/*

 * Tue Mar 03 17:00:07 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.MonthDay;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      YearMonth yearMonth0 = null;
      try {
        yearMonth0 = new YearMonth(monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'year' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(date0).getMonth();
      doReturn(0).when(date0).getYear();
      YearMonth yearMonth0 = YearMonth.fromDateFields(date0);
      String string0 = yearMonth0.toString();
      assertEquals("1900-01", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Hours hours0 = Hours.FOUR;
      Days days0 = hours0.toStandardDays();
      YearMonth yearMonth1 = yearMonth0.plus(days0);
      assertEquals(2020, yearMonth1.getYear());
      assertEquals(3, yearMonth1.getMonthOfYear());
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(2, yearMonth1.size());
  }
}
