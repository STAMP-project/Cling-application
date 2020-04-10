/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:18:38 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.YearMonth;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePartial_ESTest extends BasePartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = YearMonth.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(2, yearMonth0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay("DRI3+DH_-va<Sw,8OTA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"DRI3+DH_-va<Sw,8OTA\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-1685L));
      assertEquals(1, YearMonth.MONTH_OF_YEAR);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth();
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields(islamicChronology0);
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.minusMonths(1);
      assertEquals(14, monthDay0.getDayOfMonth());
      assertEquals(1, monthDay1.getMonthOfYear());
  }
}
