/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:36:11 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
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
      MonthDay monthDay0 = MonthDay.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      YearMonth yearMonth0 = null;
      try {
        yearMonth0 = new YearMonth(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(0L);
      assertEquals(1970, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.parse("");
      assertEquals(2, monthDay0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth();
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields(islamicChronology0);
      assertEquals(2, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      int int0 = yearMonth0.getMonthOfYear();
      assertEquals(2, int0);
      assertEquals(2014, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.withYear(1);
      assertEquals(2, yearMonth1.getMonthOfYear());
  }
}
