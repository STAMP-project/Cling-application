/*

 * Tue Mar 03 17:04:31 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Minutes;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Locale locale0 = Locale.CANADA;
      String string0 = yearMonthDay0.toString((String) null, locale0);
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Locale locale0 = Locale.ITALY;
      try { 
        yearMonthDay0.toString("subtrahend", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(date0).getDate();
      doReturn(0).when(date0).getMonth();
      doReturn(0).when(date0).getYear();
      // Undeclared exception!
      try { 
        YearMonthDay.fromDateFields(date0);
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
  @Ignore
  public void test4()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString("k'C*T8Q>");
      assertEquals(2020, yearMonthDay0.getYear());
      assertEquals("\uFFFDC*T8Q>", string0);
      assertEquals(3, yearMonthDay0.getDayOfMonth());
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Minutes minutes0 = Minutes.MIN_VALUE;
      YearMonthDay yearMonthDay1 = yearMonthDay0.plus(minutes0);
      assertTrue(yearMonthDay1.equals((Object)yearMonthDay0));
      assertEquals(3, yearMonthDay1.getDayOfMonth());
      assertEquals(3, yearMonthDay1.size());
      assertEquals(2020, yearMonthDay1.getYear());
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plus((ReadablePeriod) null);
      assertEquals(2020, yearMonthDay1.getYear());
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay1.getDayOfMonth());
  }
}
