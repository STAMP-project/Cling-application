/*

 * Tue Mar 03 17:00:18 GMT 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.MutablePeriod;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      YearMonth yearMonth0 = new YearMonth(chronology0);
      YearMonth yearMonth1 = null;
      try {
        yearMonth1 = new YearMonth(yearMonth0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      // Undeclared exception!
      try { 
        yearMonth0.withField(dateTimeFieldType0, (-1843));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'clockhourOfHalfday' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      YearMonth yearMonth1 = yearMonth0.withPeriodAdded(mutablePeriod0, 1);
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(2, yearMonth1.size());
      assertEquals(1, yearMonth1.getMonthOfYear());
      assertEquals(1970, yearMonth1.getYear());
  }
}
