/*

 * Tue Mar 03 17:03:55 GMT 2020
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
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Months months0 = Months.THREE;
      MutableInterval mutableInterval0 = new MutableInterval(months0, (ReadableInstant) null);
      assertEquals(1575392628412L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1079L), 0L);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, chronology0);
      assertEquals(0L, mutableInterval1.getEndMillis());
      assertEquals((-1079L), mutableInterval0.getStartMillis());
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Interval interval0 = Interval.parse((String) null);
      assertEquals(1583255027869L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Instant instant0 = new Instant();
      Years years0 = Years.MAX_VALUE;
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval(instant0, years0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2020 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
