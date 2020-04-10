/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:15:21 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.MonthDay;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePartial_ESTest extends BasePartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) gregorianChronology0);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay(object0);
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
      assertEquals(2, yearMonth0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay((-1504), (-1504));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1504 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields(gregorianChronology0);
      assertEquals(2, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.minusMonths(1);
      assertEquals(14, monthDay0.getDayOfMonth());
      assertEquals(1, monthDay1.getMonthOfYear());
  }
}
