/*

 * Tue Mar 03 17:04:05 GMT 2020
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
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = mutableInterval0.toPeriod(periodType0);
      MutableInterval mutableInterval1 = new MutableInterval(period0, (ReadableInstant) null);
      assertEquals(1583255039764L, mutableInterval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, chronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: 
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, weeks0);
      assertEquals(1583255039240L, mutableInterval0.getStartMillis());
  }
}
