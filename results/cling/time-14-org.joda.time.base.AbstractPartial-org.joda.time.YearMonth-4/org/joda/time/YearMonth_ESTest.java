/*

 * Tue Mar 03 17:00:00 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      YearMonth yearMonth0 = YearMonth.now(chronology0);
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeFieldType0).toString();
      // Undeclared exception!
      try { 
        yearMonth0.withField(dateTimeFieldType0, (-708));
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
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      assertEquals(1, yearMonth0.getMonthOfYear());
      
      YearMonth yearMonth1 = new YearMonth(yearMonth0);
      assertEquals(2, yearMonth1.size());
      assertEquals(1970, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        yearMonth0.withFieldAdded((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'null' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
