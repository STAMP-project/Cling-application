/*

 * Tue Mar 03 16:58:27 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int[] intArray0 = localTime0.getValues();
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) julianChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      boolean boolean0 = monthDay0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) 1, (Chronology) ethiopicChronology0);
      String string0 = yearMonthDay0.toString();
      assertEquals("1962-04-23", string0);
  }
}
