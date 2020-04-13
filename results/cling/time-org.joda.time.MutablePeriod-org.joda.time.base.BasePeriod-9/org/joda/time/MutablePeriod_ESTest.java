/*

 * Tue Mar 03 16:58:17 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Instant;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Instant instant0 = Instant.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(instant0, (ReadableInstant) null);
      mutablePeriod0.setWeeks(32);
      assertEquals(1583254687155L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(seconds0);
      mutablePeriod0.add((ReadablePeriod) seconds0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addYears((-1216));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      PeriodType periodType0 = seconds0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2017L, 2017L, periodType0);
      mutablePeriod0.setMinutes(0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(seconds0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMillis((-2559));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Months months0 = Months.ZERO;
      mutablePeriod0.setPeriod((ReadablePeriod) months0);
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      Seconds seconds0 = Seconds.ONE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.addSeconds(0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) seconds0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Years years0 = Years.THREE;
      Instant instant0 = Instant.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(instant0, (ReadableInstant) null);
      mutablePeriod0.mergePeriod(years0);
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod1 = new MutablePeriod(32, 0L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod1.add((ReadablePeriod) years0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(22L, 1L, periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      Seconds seconds0 = Seconds.TWO;
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) seconds0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
