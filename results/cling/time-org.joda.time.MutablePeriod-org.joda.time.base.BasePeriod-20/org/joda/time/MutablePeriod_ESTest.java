/*

 * Tue Mar 03 16:58:57 GMT 2020
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
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1L));
      mutablePeriod0.setMillis(23118750);
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
      MutablePeriod mutablePeriod0 = new MutablePeriod((-3251), (-3251), (-3251), (-3251), (-3251), (-3251), (-3251), (-3251));
      Hours hours0 = Hours.ONE;
      Duration duration0 = hours0.toStandardDuration();
      mutablePeriod0.add((ReadableDuration) duration0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      // Undeclared exception!
      try { 
        mutablePeriod0.add(durationFieldType0, (-3251));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setDays(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMillis(65535);
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
      Seconds seconds0 = Seconds.seconds(65533);
      MutablePeriod mutablePeriod0 = new MutablePeriod(seconds0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Months months0 = Months.FOUR;
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(months0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Years years0 = Years.ZERO;
      Period period0 = years0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.THREE;
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
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, (-3251));
      Hours hours0 = Hours.ONE;
      Duration duration0 = hours0.toStandardDuration();
      mutablePeriod0.add((ReadableDuration) duration0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      mutablePeriod0.add(durationFieldType0, 0);
      assertEquals("weekyears", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Years years0 = Years.ZERO;
      mutablePeriod0.mergePeriod(years0);
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod1 = new MutablePeriod(periodType0);
      Period period0 = new Period(Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        mutablePeriod1.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      mutablePeriod0.add((-1L));
  }
}
