/*

 * Tue Mar 03 16:58:21 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalTime;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalTime localTime0 = new LocalTime(0L, (Chronology) ethiopicChronology0);
      int[] intArray0 = localTime0.getValues();
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay(0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      yearMonthDay0.isSupported(dateTimeFieldType0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(1, yearMonthDay0.getMonthOfYear());
      assertEquals(1970, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2020-03-03", string0);
  }
}
