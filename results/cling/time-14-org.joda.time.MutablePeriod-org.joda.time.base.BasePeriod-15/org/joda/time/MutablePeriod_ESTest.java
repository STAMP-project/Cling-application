/*

 * Tue Mar 03 16:58:34 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(529, 529, 529, 529);
      mutablePeriod0.setSeconds(529);
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
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setDays(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setWeeks(1654);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(542L);
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod1 = new MutablePeriod(periodType0);
      mutablePeriod1.addMinutes(0);
      // Undeclared exception!
      try { 
        mutablePeriod1.add((ReadablePeriod) mutablePeriod0);
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
      Seconds seconds0 = Seconds.THREE;
      Period period0 = seconds0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Period period0 = Period.months(0);
      mutablePeriod0.setPeriod((ReadablePeriod) period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(542L);
      Days days0 = Days.MAX_VALUE;
      days0.toMutablePeriod();
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
      Days days0 = Days.TWO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 1906);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(542L, 542L);
      mutablePeriod0.mergePeriod(mutablePeriod0);
      Weeks weeks0 = Weeks.THREE;
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod1 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod1.add((ReadablePeriod) weeks0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(542L, 542L);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      Weeks weeks0 = Weeks.THREE;
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod1 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod1.add((ReadablePeriod) weeks0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
