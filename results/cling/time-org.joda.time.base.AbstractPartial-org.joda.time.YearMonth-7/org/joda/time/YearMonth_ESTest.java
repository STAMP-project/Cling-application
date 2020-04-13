/*

 * Tue Mar 03 17:00:36 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Period;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      // Undeclared exception!
      try { 
        yearMonth0.withField(dateTimeFieldType0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'hourOfHalfday' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      Date date0 = gregorianCalendar0.getTime();
      YearMonth yearMonth0 = YearMonth.fromDateFields(date0);
      String string0 = yearMonth0.toString();
      assertEquals("Tue Mar 03 18:00:06 CET 2020", date0.toString());
      assertEquals("2020-03", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period();
      YearMonth yearMonth1 = yearMonth0.minus(period0);
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(2020, yearMonth1.getYear());
      assertEquals(2, yearMonth1.size());
      assertEquals(3, yearMonth1.getMonthOfYear());
  }
}
