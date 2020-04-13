/*

 * Tue Mar 03 17:00:34 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Duration;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      YearMonth yearMonth0 = YearMonth.now(chronology0);
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology1).withUTC();
      YearMonth yearMonth1 = null;
      try {
        yearMonth1 = new YearMonth(yearMonth0, chronology1);
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
      // Undeclared exception!
      try { 
        yearMonth0.withField((DateTimeFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'null' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(1800L);
      Duration duration0 = new Duration(0, (-106L));
      Seconds seconds0 = duration0.toStandardSeconds();
      YearMonth yearMonth1 = yearMonth0.plus(seconds0);
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(2, yearMonth1.size());
      assertEquals(1970, yearMonth1.getYear());
      assertEquals(1, yearMonth1.getMonthOfYear());
  }
}
