/*

 * Tue Mar 03 17:10:55 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      boolean boolean0 = hours0.THREE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      int int0 = hours0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      int int0 = hours0.FIVE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      int int0 = hours0.ONE.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, hours0.getHours());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.EIGHT.equals(hours0);
      assertFalse(boolean0);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.days(157);
      Hours hours0 = days0.toStandardHours();
      boolean boolean0 = hours0.TWO.equals(days0);
      assertFalse(boolean0);
      assertEquals(3768, hours0.getHours());
      assertEquals(157, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Hours hours0 = Hours.FIVE;
      // Undeclared exception!
      try { 
        hours0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Weeks weeks0 = seconds0.toStandardWeeks();
      Hours hours0 = Hours.standardHoursIn(weeks0);
      Hours hours1 = hours0.minus((-3562));
      Hours hours2 = hours1.dividedBy(516);
      assertEquals(6, hours2.getHours());
      assertEquals(0, hours0.getHours());
      assertEquals(3562, hours1.getHours());
      assertEquals(1, hours2.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
      
      Period period0 = new Period();
      Hours hours2 = Hours.standardHoursIn(period0);
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
      
      Period period0 = new Period();
      Hours hours2 = Hours.standardHoursIn(period0);
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Minutes minutes0 = hours0.toStandardMinutes();
      Hours hours1 = Hours.standardHoursIn(minutes0);
      assertEquals(5, hours1.getHours());
      assertEquals(300, minutes0.getMinutes());
      assertSame(hours1, hours0);
      
      Date date0 = new Date(78);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Hours hours2 = Hours.hoursBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Hours hours3 = Hours.standardHoursIn(hours2);
      assertEquals(0, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Period period0 = hours0.toPeriod();
      Hours hours1 = Hours.standardHoursIn(period0);
      assertSame(hours1, hours0);
  }
}
