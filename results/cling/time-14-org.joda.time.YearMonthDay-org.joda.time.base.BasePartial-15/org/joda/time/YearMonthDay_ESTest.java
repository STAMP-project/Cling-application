/*

 * Tue Mar 03 17:04:15 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      Locale locale0 = Locale.JAPAN;
      String string0 = yearMonthDay0.toString((String) null, locale0);
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Locale locale0 = Locale.GERMAN;
      try { 
        yearMonthDay0.toString("gE1EoJ}$L?[\"^", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString((String) null);
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.toString("96kNrpH'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonthDay0, (ReadablePartial) yearMonthDay0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus(minutes0);
      assertTrue(yearMonthDay1.equals((Object)yearMonthDay0));
      assertEquals(2020, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay0.getMonthOfYear());
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus((ReadablePeriod) null);
      assertEquals(3, yearMonthDay1.getDayOfMonth());
      assertEquals(3, yearMonthDay1.size());
      assertEquals(2020, yearMonthDay1.getYear());
  }
}
