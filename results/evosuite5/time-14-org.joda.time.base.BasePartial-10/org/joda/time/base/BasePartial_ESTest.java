/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:19:52 GMT 2019
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
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePartial_ESTest extends BasePartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      assertEquals(2, yearMonth0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay((Object) dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.tz.CachedDateTimeZone
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) (-1422));
      assertEquals(1, YearMonth.MONTH_OF_YEAR);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay(116, 116);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 116 for monthOfYear must not be larger than 12
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(gJChronology0);
      assertEquals(14, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      yearMonth0.toInterval();
      assertEquals(2014, yearMonth0.getYear());
      assertEquals(2, yearMonth0.getMonthOfYear());
  }
}
