/*

 * Tue Mar 03 16:59:50 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalTime;
import org.joda.time.YearMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2020-03-03", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(611, 611, 611, 1970, 611, 1970);
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      int[] intArray0 = localTime0.getValues();
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      yearMonthDay0.isSupported(dateTimeFieldType0);
      assertEquals(2020, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
  }
}
