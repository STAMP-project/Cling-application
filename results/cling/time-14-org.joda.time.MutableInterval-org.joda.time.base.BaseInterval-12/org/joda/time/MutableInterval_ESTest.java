/*

 * Tue Mar 03 17:03:58 GMT 2020
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
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Months months0 = Months.TWO;
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn(julianChronology0).when(readableInstant0).getChronology();
      doReturn(4L).when(readableInstant0).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(months0, readableInstant0);
      assertEquals((-5270399996L), mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(readableDuration0).getMillis();
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L).when(readableInstant0).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(readableDuration0, readableInstant0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, chronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      assertEquals(1583255030590L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(86399999L).when(readableInstant0).getMillis();
      Hours hours0 = Hours.THREE;
      MutableInterval mutableInterval0 = new MutableInterval(readableInstant0, hours0);
      assertEquals(97199999L, mutableInterval0.getEndMillis());
  }
}
