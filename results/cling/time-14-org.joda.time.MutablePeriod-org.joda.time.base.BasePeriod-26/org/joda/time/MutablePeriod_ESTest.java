/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:22:53 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePeriod;
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
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(1536, 1536, 1536, 1536, 1536, 1536, 1536, 1536, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setMonths(292272992);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0, periodType0);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMillis(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod0.set((DurationFieldType) null, 65535);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Duration duration0 = new Duration((-1L));
      mutablePeriod0.add((ReadableDuration) duration0);
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
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Days days0 = Days.FOUR;
      mutablePeriod0.add((ReadablePeriod) days0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addMillis(277);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Hours hours0 = Hours.THREE;
      mutablePeriod0.addMinutes(0);
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
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Days days0 = Days.FOUR;
      mutablePeriod0.mergePeriod(days0);
      Duration duration0 = Duration.millis((-306L));
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(0L, duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      Minutes minutes0 = Minutes.ZERO;
      PeriodType periodType0 = minutes0.getPeriodType();
      MutablePeriod mutablePeriod1 = new MutablePeriod(periodType0);
      Hours hours0 = Hours.EIGHT;
      // Undeclared exception!
      try { 
        mutablePeriod1.add((ReadablePeriod) hours0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
