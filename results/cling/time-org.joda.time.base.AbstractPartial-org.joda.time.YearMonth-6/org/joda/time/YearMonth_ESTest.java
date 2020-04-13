/*

 * Tue Mar 03 17:01:19 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      // Undeclared exception!
      try { 
        yearMonth0.withField(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'yearOfEra' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      String string0 = yearMonth0.toString();
      assertEquals("1970-01", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      GregorianCalendar gregorianCalendar0 = dateMidnight0.toGregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      Period period0 = new Period(0, 0, 0, (-289), 0, 0, 0, 1);
      YearMonth yearMonth1 = yearMonth0.minus(period0);
      assertEquals(2020, yearMonth1.getYear());
      assertEquals(3, yearMonth1.getMonthOfYear());
      assertEquals(2, yearMonth1.size());
      assertNotSame(yearMonth1, yearMonth0);
  }
}
