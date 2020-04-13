/*

 * Tue Mar 03 17:04:04 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Locale locale0 = Locale.PRC;
      String string0 = yearMonthDay0.toString((String) null, locale0);
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Locale locale0 = Locale.FRANCE;
      try { 
        yearMonthDay0.toString("org.joda.time.YearMonthDay", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay(1, 2, 0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for dayOfMonth must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString((String) null);
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.toString("j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Period period0 = Period.weeks(1);
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(period0);
      assertTrue(yearMonthDay1.equals((Object)yearMonthDay0));
      assertEquals(2020, yearMonthDay1.getYear());
      assertNotSame(yearMonthDay1, yearMonthDay0);
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus((ReadablePeriod) null);
      assertEquals(2020, yearMonthDay1.getYear());
      assertEquals(3, yearMonthDay1.getDayOfMonth());
      assertEquals(3, yearMonthDay1.size());
  }
}
