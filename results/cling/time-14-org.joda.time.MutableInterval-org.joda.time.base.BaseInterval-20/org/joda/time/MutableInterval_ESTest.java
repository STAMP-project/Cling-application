/*

 * Tue Mar 03 17:04:43 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L).when(readableInstant0).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(mutablePeriod0, readableInstant0);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L).when(readableInstant0).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(readableInstant0, (ReadablePeriod) null);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, chronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      assertEquals(1583255075657L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null, (Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L).when(readableInstant0).getMillis();
      Period period0 = new Period((ReadableDuration) null, readableInstant0);
      MutableInterval mutableInterval0 = new MutableInterval(readableInstant0, period0);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }
}
