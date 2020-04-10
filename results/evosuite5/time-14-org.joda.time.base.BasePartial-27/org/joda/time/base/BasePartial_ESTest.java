/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:41:20 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.MonthDay;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePartial_ESTest extends BasePartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) copticChronology0);
      assertEquals(7, monthDay0.getDayOfMonth());
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
      YearMonth yearMonth0 = new YearMonth(751L);
      assertEquals(1, YearMonth.MONTH_OF_YEAR);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      YearMonth yearMonth0 = null;
      try {
        yearMonth0 = new YearMonth(2061, 2061);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2061 for monthOfYear must not be larger than 12
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(gregorianChronology0);
      assertEquals(14, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      int int0 = monthDay0.getDayOfMonth();
      assertEquals(14, int0);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.withYear(0);
      assertEquals(2, yearMonth1.getMonthOfYear());
  }
}
