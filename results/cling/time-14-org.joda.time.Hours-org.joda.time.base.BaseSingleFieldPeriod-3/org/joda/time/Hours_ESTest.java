/*

 * Tue Mar 03 17:10:32 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      int int0 = hours0.FOUR.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, int0);
      assertEquals(3, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period(275L, (Chronology) buddhistChronology0);
      Hours hours0 = Hours.standardHoursIn(period0);
      Hours hours1 = hours0.minus(141);
      assertEquals(0, hours0.getHours());
      assertEquals((-141), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period(275L, (Chronology) buddhistChronology0);
      Hours hours0 = Hours.standardHoursIn(period0);
      Hours hours1 = Hours.FIVE;
      Hours hours2 = hours0.plus(hours1);
      assertSame(hours2, hours1);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period(275L, (Chronology) buddhistChronology0);
      Hours hours0 = Hours.standardHoursIn(period0);
      assertEquals(0, hours0.getHours());
      
      Hours hours1 = Hours.hours(1);
      assertEquals(1, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      boolean boolean0 = hours0.SIX.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      int int0 = hours0.FIVE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      int int0 = hours0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.ZERO.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(0, int0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.TWO.equals(hours0);
      assertEquals(3, hours0.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = hours0.plus(hours0);
      assertEquals(8, hours1.getHours());
      assertEquals(4, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Minutes minutes0 = hours0.ZERO.toStandardMinutes();
      boolean boolean0 = hours0.FOUR.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Months months0 = Months.NINE;
      // Undeclared exception!
      try { 
        hours0.THREE.compareTo((BaseSingleFieldPeriod) months0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Hours cannot be compared to class org.joda.time.Months
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.minutes(396);
      Hours hours0 = Hours.standardHoursIn(period0);
      assertEquals(6, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period(275L, (Chronology) buddhistChronology0);
      Hours hours0 = Hours.standardHoursIn(period0);
      Hours hours1 = hours0.THREE.multipliedBy(1);
      assertEquals(0, hours0.getHours());
      assertEquals(3, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
      
      Period period0 = Period.minutes(17);
      Weeks weeks0 = period0.toStandardWeeks();
      Hours hours2 = Hours.standardHoursIn(weeks0);
      assertEquals(0, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.hours(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.hours(2);
      Weeks weeks0 = hours0.toStandardWeeks();
      Hours hours1 = Hours.standardHoursIn(weeks0);
      assertEquals(2, hours0.getHours());
      assertEquals(0, hours1.getHours());
      assertEquals(1, hours1.size());
  }
}
