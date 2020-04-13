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
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Years years0 = Years.ONE;
      Instant instant0 = Instant.now();
      Chronology chronology0 = instant0.getChronology();
      MutableDateTime mutableDateTime0 = new MutableDateTime(chronology0);
      MutableInterval mutableInterval0 = new MutableInterval(years0, mutableDateTime0);
      assertEquals(1583255028340L, mutableDateTime0.getMillis());
      assertEquals(1583255028339L, instant0.getMillis());
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
  @Ignore
  public void test2()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      assertEquals(1583255027711L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Months months0 = Months.FIVE;
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, months0);
      assertEquals(1583255027474L, mutableInterval0.getStartMillis());
  }
}
