/*

 * Tue Mar 03 17:00:06 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      // Undeclared exception!
      try { 
        yearMonth0.withField(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'millisOfDay' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      String string0 = yearMonth0.toString();
      assertEquals("2020-03", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(719L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 2);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Period period0 = new Period(4L, (Chronology) buddhistChronology0);
      YearMonth yearMonth1 = yearMonth0.withPeriodAdded(period0, 1);
      assertEquals(2, yearMonth1.size());
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(1970, yearMonth1.getYear());
      assertEquals(1, yearMonth1.getMonthOfYear());
  }
}
