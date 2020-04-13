/*

 * Tue Mar 03 17:05:07 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Months months0 = Months.EIGHT;
      Instant instant0 = new Instant(1783L);
      MutableInterval mutableInterval0 = new MutableInterval(months0, instant0);
      assertEquals((-21167998217L), mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, copticChronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      assertEquals(1583255100510L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Months months0 = Months.SIX;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableInterval mutableInterval0 = new MutableInterval(mutableDateTime0, months0);
      assertEquals(1583255100028L, mutableDateTime0.getMillis());
  }
}
