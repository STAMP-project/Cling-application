/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:19:07 GMT 2019
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
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setHours((-263));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setHours(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setWeeks((-1420));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.TWO;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
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
  public void test08()  throws Throwable  {
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 4);
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
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.addMonths(0);
      Weeks weeks0 = Weeks.THREE;
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) weeks0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.mergePeriod(mutablePeriod0);
      Weeks weeks0 = Weeks.MIN_VALUE;
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) weeks0);
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
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      Weeks weeks0 = Weeks.TWO;
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) weeks0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
