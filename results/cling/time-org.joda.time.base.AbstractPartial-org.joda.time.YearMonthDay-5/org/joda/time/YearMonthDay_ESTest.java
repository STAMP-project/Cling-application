/*

 * Tue Mar 03 16:57:20 GMT 2020
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
  public void test0()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Object) null);
      int[] intArray0 = localDate0.getValues();
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(2360L);
      String string0 = yearMonthDay0.toString();
      assertEquals("1970-01-01", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      yearMonthDay0.isSupported(dateTimeFieldType0);
      assertEquals(2020, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(3, yearMonthDay0.getMonthOfYear());
  }
}
