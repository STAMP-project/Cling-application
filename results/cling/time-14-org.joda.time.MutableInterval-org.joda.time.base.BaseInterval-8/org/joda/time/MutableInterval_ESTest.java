/*

 * Tue Mar 03 17:03:56 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Months months0 = Months.monthsIn(mutableInterval0);
      DateTime dateTime0 = DateTime.now();
      MutableInterval mutableInterval1 = new MutableInterval(months0, dateTime0);
      assertEquals(1583255029897L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, islamicChronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Interval interval0 = new Interval((Object) null, buddhistChronology0);
      assertEquals(1583255029564L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null, (Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L).when(readableInstant0).getMillis();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, readableInstant0);
      MutableInterval mutableInterval0 = new MutableInterval(readableInstant0, mutablePeriod0);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }
}
