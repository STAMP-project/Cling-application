/*

 * Tue Mar 03 16:58:51 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setMillis((-883));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Hours hours0 = Hours.THREE;
      mutablePeriod0.add((ReadablePeriod) hours0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, (-3582));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMillis(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      MutablePeriod mutablePeriod0 = new MutablePeriod(hours0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMillis(59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      Hours hours0 = Hours.THREE;
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(hours0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      MutablePeriod mutablePeriod1 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.mergePeriod(mutablePeriod1);
      assertNotSame(mutablePeriod1, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Hours hours0 = Hours.THREE;
      mutablePeriod0.add((ReadablePeriod) hours0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Hours hours0 = Hours.MAX_VALUE;
      mutablePeriod0.addWeeks(0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) hours0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2332L), (-2332L));
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod1 = new MutablePeriod(periodType0);
      Period period0 = Period.minutes(3195);
      // Undeclared exception!
      try { 
        mutablePeriod1.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.mergePeriod(mutablePeriod0);
      Months months0 = Months.SIX;
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) months0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
