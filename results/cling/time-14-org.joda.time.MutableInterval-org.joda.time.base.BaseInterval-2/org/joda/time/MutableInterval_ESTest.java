/*

 * Tue Mar 03 17:03:46 GMT 2020
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
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L, 0L).when(readableInstant0).getMillis();
      PeriodType periodType0 = PeriodType.months();
      Period period0 = new Period(readableInstant0, readableInstant0, periodType0);
      ReadableInstant readableInstant1 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant1).getChronology();
      doReturn(0L).when(readableInstant1).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(period0, readableInstant1);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Duration duration0 = new Duration(63L, 63L);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      Interval interval0 = mutableInterval0.toInterval();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MutableInterval mutableInterval1 = new MutableInterval(interval0, gregorianChronology0);
      assertEquals(1583255018563L, mutableInterval0.getStartMillis());
      assertEquals(1583255018563L, mutableInterval0.getEndMillis());
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
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(63L).when(readableDuration0).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(readableDuration0, (ReadableInstant) null);
      Days days0 = Days.daysIn(mutableInterval0);
      MutableInterval mutableInterval1 = new MutableInterval((ReadableInstant) null, days0);
      assertEquals(1583255017906L, mutableInterval0.getStartMillis());
      assertEquals(1583255017969L, mutableInterval0.getEndMillis());
  }
}
