/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:29:42 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.YearMonth;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2019, 8, 18, 1780958}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      String string0 = yearMonth0.toString();
      assertEquals("2019-08", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      yearMonthDay0.isSupported(dateTimeFieldType0);
      assertEquals(8, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2019, yearMonthDay0.getYear());
  }
}
