/*

 * Tue Mar 03 17:03:38 GMT 2020
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
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L).when(readableInstant0).getMillis();
      Seconds seconds0 = Seconds.secondsBetween(readableInstant0, readableInstant0);
      ReadableInstant readableInstant1 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant1).getChronology();
      doReturn(0L).when(readableInstant1).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(seconds0, readableInstant1);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L).when(readableInstant0).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(readableInstant0, readableInstant0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, chronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("The calendar must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: The calendar must not be null
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null, (Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L, 0L).when(readableInstant0).getMillis();
      Seconds seconds0 = Seconds.secondsBetween(readableInstant0, readableInstant0);
      Weeks weeks0 = seconds0.toStandardWeeks();
      MutableInterval mutableInterval0 = new MutableInterval(readableInstant0, weeks0);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }
}
