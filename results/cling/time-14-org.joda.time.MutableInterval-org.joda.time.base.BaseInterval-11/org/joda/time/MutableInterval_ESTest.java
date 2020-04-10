/*

 * Tue Mar 03 17:04:36 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.Weeks;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      ReadableInstant readableInstant0 = mock(ReadableInstant.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInstant0).getChronology();
      doReturn(0L).when(readableInstant0).getMillis();
      MutableInterval mutableInterval0 = new MutableInterval(weeks0, readableInstant0);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(readableDuration0).getMillis();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      MutableInterval mutableInterval0 = new MutableInterval(readableDuration0, dateMidnight0);
      assertEquals(1583190000000L, mutableInterval0.getEndMillis());
      
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, gregorianChronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
      assertEquals(1583190000000L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("bI;-w%$uwmH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: bI;-w%$uwmH
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, mutablePeriod0);
      assertEquals(1583255068271L, mutableInterval0.getEndMillis());
  }
}
