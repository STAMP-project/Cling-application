/*

 * Tue Mar 03 17:03:31 GMT 2020
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
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("x9Hpd;le$Jln");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: x9Hpd;le$Jln
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Period period0 = new Period(43200000L, 1485L);
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval(period0, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      MutableInterval mutableInterval0 = MutableInterval.parse((String) null);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, chronology0);
      assertEquals(1583255002740L, mutableInterval0.getStartMillis());
      assertEquals(1583255002740L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null, (Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L, 0L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      MutableInterval mutableInterval0 = new MutableInterval(readableInstant0, mutablePeriod0);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }
}
