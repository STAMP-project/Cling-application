/*

 * Tue Mar 03 16:57:45 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) copticChronology0);
      String string0 = yearMonthDay0.toString();
      assertEquals("1736-06-24", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      int[] intArray0 = localDate0.getValues();
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      yearMonthDay0.isSupported(dateTimeFieldType0);
      assertEquals(3, yearMonthDay0.getDayOfMonth());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2020, yearMonthDay0.getYear());
  }
}
