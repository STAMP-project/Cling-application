/*

 * Tue Mar 03 16:57:23 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn((Chronology) null).when(chronology0).withUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay(chronology0);
      yearMonthDay0.toString();
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-3366L));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      boolean boolean0 = monthDay0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(10080L, (Chronology) gregorianChronology0);
      int[] intArray0 = localDateTime0.getValues();
      assertEquals(4, intArray0.length);
  }
}
