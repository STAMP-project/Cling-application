/*

 * Tue Mar 03 17:03:33 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Hours;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Locale locale0 = Locale.FRANCE;
      String string0 = yearMonthDay0.toString((String) null, locale0);
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Locale locale0 = Locale.KOREA;
      try { 
        yearMonthDay0.toString("The provider doesn't support UTC", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(0, 1, 2);
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString((String) null);
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString("Z");
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2020, yearMonthDay0.getYear());
      assertEquals("", string0);
      assertEquals(3, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Hours hours0 = Hours.THREE;
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(hours0);
      assertTrue(yearMonthDay1.equals((Object)yearMonthDay0));
      assertEquals(3, yearMonthDay1.getMonthOfYear());
      assertEquals(2020, yearMonthDay1.getYear());
      assertEquals(3, yearMonthDay1.size());
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus((ReadablePeriod) null);
      assertEquals(2020, yearMonthDay1.getYear());
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay1.getMonthOfYear());
  }
}
