/*

 * Tue Mar 03 16:59:15 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      assertEquals(3, yearMonthDay0.getDayOfMonth());
      assertEquals(3, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      
      LocalDate localDate0 = yearMonthDay0.toLocalDate();
      int[] intArray0 = localDate0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3}, intArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      yearMonthDay0.isSupported((DateTimeFieldType) null);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2020, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay0.getMonthOfYear());
  }
}
