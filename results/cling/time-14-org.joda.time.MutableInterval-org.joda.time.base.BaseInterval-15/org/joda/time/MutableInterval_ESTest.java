/*

 * Tue Mar 03 17:04:33 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      MutableInterval mutableInterval0 = new MutableInterval(mutablePeriod0, (ReadableInstant) null);
      assertEquals(1583255066766L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-386L), (-386L));
      assertEquals((-386L), mutableInterval0.getStartMillis());
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, copticChronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
      assertEquals((-386L), mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("Clone error");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: Clone error
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Period period0 = Period.millis(292278993);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, period0);
      assertEquals(1583255065897L, dateTime0.getMillis());
  }
}
