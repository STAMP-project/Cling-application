/*

 * Tue Mar 03 17:00:17 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeFieldType0).toString();
      // Undeclared exception!
      try { 
        yearMonth0.withField(dateTimeFieldType0, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'null' is not supported
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
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(30672000000L);
      Period period0 = new Period(0, 0, 0, 0);
      YearMonth yearMonth1 = yearMonth0.minus(period0);
      assertEquals(2, yearMonth1.size());
      assertEquals(1970, yearMonth1.getYear());
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(12, yearMonth1.getMonthOfYear());
  }
}
