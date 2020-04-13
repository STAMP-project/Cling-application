/*

 * Tue Mar 03 17:12:46 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.negated();
      assertEquals(5, hours0.getHours());
      assertEquals((-5), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      boolean boolean0 = hours0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      int int0 = hours0.SIX.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(5, hours0.getHours());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      boolean boolean0 = hours0.ONE.equals(hours0);
      assertEquals(8, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Seconds seconds0 = hours0.toStandardSeconds();
      boolean boolean0 = hours0.TWO.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(5, hours0.getHours());
      assertEquals(18000, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Days days0 = Days.FOUR;
      // Undeclared exception!
      try { 
        hours0.SEVEN.compareTo((BaseSingleFieldPeriod) days0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Days
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Period period0 = new Period(3600000L, (Chronology) ethiopicChronology0);
      Hours hours0 = Hours.standardHoursIn(period0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = hours0.plus(3);
      assertEquals(3, hours1.getHours());
      
      Hours hours2 = Hours.standardHoursIn(hours0);
      assertEquals(0, hours2.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      Weeks weeks0 = hours0.toStandardWeeks();
      Hours hours2 = Hours.standardHoursIn(weeks0);
      assertSame(hours0, hours1);
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      Hours hours1 = Hours.standardHoursIn(mutablePeriod0);
      assertSame(hours1, hours0);
  }
}
