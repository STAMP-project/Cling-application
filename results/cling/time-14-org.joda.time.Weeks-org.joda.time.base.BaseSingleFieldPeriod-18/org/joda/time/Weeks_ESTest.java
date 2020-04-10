/*

 * Tue Mar 03 17:26:46 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Hours hours0 = weeks0.toStandardHours();
      boolean boolean0 = weeks0.TWO.equals(hours0);
      assertFalse(boolean0);
      assertEquals(336, hours0.getHours());
      assertEquals(2, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.ZERO;
      Weeks weeks2 = weeks0.plus(weeks1);
      assertEquals(Integer.MAX_VALUE, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Weeks weeks0 = Weeks.standardWeeksIn(hours0);
      assertEquals(1, weeks0.size());
      assertEquals(8, hours0.getHours());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.MIN_VALUE;
      int int0 = weeks1.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = weeks0.TWO.equals(weeks0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      int int0 = weeks0.THREE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      int int0 = weeks0.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = weeks0.MAX_VALUE.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(weeks0);
      assertEquals(0, seconds0.getSeconds());
      
      Weeks weeks1 = Weeks.MAX_VALUE;
      Weeks weeks2 = weeks0.plus(weeks1);
      assertEquals(1, weeks2.size());
      assertSame(weeks2, weeks1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.weeks(2);
      assertEquals(2, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks2.getWeeks());
      assertEquals(1, weeks2.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      int int0 = weeks0.MIN_VALUE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addHours(646);
      Weeks weeks0 = Weeks.standardWeeksIn(mutablePeriod0);
      Weeks weeks1 = weeks0.negated();
      assertEquals((-3), weeks1.getWeeks());
      assertEquals(3, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Object object0 = new Object();
      boolean boolean0 = weeks0.ZERO.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("org.joda.time.chrono.AssembledChronology");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.chrono.AssembledCh...\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Weeks weeks0 = Weeks.standardWeeksIn(mutablePeriod0);
      assertEquals(0, weeks0.getWeeks());
      
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      Weeks weeks1 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Weeks.standardWeeksIn(mutablePeriod0);
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Weeks weeks0 = Weeks.standardWeeksIn(mutablePeriod0);
      assertEquals(0, weeks0.getWeeks());
      
      Weeks weeks1 = Weeks.weeks(1);
      assertEquals(1, weeks1.getWeeks());
  }
}
