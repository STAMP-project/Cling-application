/*

 * Tue Mar 03 16:59:03 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) gJChronology0);
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3, 64736892}, intArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      yearMonthDay0.isSupported(dateTimeFieldType0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(2020, yearMonthDay0.getYear());
      assertEquals(3, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2020-03-03", string0);
  }
}
