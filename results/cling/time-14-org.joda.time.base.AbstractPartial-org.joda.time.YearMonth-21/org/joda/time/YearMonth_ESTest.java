/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:39:27 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Minutes;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(0L);
      Duration duration0 = Duration.millis((-1715L));
      Minutes minutes0 = duration0.toStandardMinutes();
      YearMonth yearMonth1 = yearMonth0.plus(minutes0);
      assertEquals(2, yearMonth1.size());
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(1970, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      // Undeclared exception!
      try { 
        yearMonth0.property(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'yearOfEra' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      assertEquals(1, yearMonth0.getMonthOfYear());
      
      YearMonth yearMonth1 = new YearMonth(yearMonth0);
      assertEquals(1970, yearMonth1.getYear());
      assertEquals(2, yearMonth1.size());
  }
}
