/*

 * Tue Mar 03 17:05:28 GMT 2020
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
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      MutableInterval mutableInterval0 = new MutableInterval(seconds0, (ReadableInstant) null);
      assertEquals(1583255122428L, mutableInterval0.getEndMillis());
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
      Hours hours0 = Hours.SEVEN;
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, hours0);
      assertEquals(1583255121597L, mutableInterval0.getStartMillis());
  }
}
