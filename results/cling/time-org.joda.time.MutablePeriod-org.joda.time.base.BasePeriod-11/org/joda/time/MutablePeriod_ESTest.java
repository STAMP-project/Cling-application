/*

 * Tue Mar 03 16:58:25 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePeriod;
import org.joda.time.Years;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutablePeriod_ESTest extends MutablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      mutablePeriod0.setYears(901);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(1275L).when(readableDuration0).getMillis();
      mutablePeriod0.add(readableDuration0);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      // Undeclared exception!
      try { 
        mutablePeriod0.add(durationFieldType0, 1417);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMinutes(0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMillis(1621);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(3, 3, 3, 3, 3, 3, 3, 3);
      MutablePeriod mutablePeriod1 = mutablePeriod0.toMutablePeriod();
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn((-1926L)).when(readableDuration0).getMillis();
      mutablePeriod0.add(readableDuration0);
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
  public void test7()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(2492L).when(readableDuration0).getMillis();
      PeriodType periodType0 = PeriodType.seconds();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      MutablePeriod mutablePeriod1 = new MutablePeriod(2492L, periodType0, (Chronology) copticChronology0);
      mutablePeriod1.addMillis(0);
      mutablePeriod0.add(readableDuration0);
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
  public void test8()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Period period0 = new Period(2502L, 2502L);
      mutablePeriod0.mergePeriod(period0);
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod1 = new MutablePeriod(2502L, periodType0);
      Hours hours0 = Hours.SIX;
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

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod1 = new MutablePeriod(periodType0);
      Years years0 = Years.THREE;
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
}
