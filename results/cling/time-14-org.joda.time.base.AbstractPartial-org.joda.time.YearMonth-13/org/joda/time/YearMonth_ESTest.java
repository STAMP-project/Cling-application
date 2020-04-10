/*

 * Tue Mar 03 17:00:29 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeFieldType0).toString();
      // Undeclared exception!
      try { 
        yearMonth0.withField(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'null' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      assertEquals(3, yearMonth0.getMonthOfYear());
      
      YearMonth yearMonth1 = new YearMonth(yearMonth0);
      assertEquals(2020, yearMonth1.getYear());
      assertEquals(2, yearMonth1.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) buddhistChronology0);
      Weeks weeks0 = Weeks.THREE;
      Minutes minutes0 = weeks0.toStandardMinutes();
      YearMonth yearMonth1 = yearMonth0.minus(minutes0);
      assertEquals(3, yearMonth1.getMonthOfYear());
      assertNotSame(yearMonth1, yearMonth0);
      assertEquals(2, yearMonth1.size());
      assertEquals(2563, yearMonth1.getYear());
  }
}
