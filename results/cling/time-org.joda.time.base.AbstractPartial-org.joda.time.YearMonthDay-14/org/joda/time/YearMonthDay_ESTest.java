/*

 * Tue Mar 03 16:58:23 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(3, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.getDayOfMonth());
      assertEquals(3, yearMonthDay0.size());
      
      LocalDate localDate0 = yearMonthDay0.toLocalDate();
      int[] intArray0 = localDate0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay(chronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      yearMonthDay0.isSupported(dateTimeFieldType0);
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) 0);
      String string0 = yearMonthDay0.toString();
      assertEquals("1970-01-01", string0);
  }
}
