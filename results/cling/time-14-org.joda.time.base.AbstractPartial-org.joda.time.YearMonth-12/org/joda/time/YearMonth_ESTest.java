/*

 * Tue Mar 03 17:00:16 GMT 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      LocalTime localTime0 = null;
      try {
        localTime0 = new LocalTime(partial0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'hourOfDay' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      String string0 = yearMonth0.toString();
      assertEquals("2020-03", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(0L);
      Days days0 = Days.MAX_VALUE;
      DurationFieldType durationFieldType0 = days0.getFieldType();
      // Undeclared exception!
      try { 
        yearMonth0.withFieldAdded(durationFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'days' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
