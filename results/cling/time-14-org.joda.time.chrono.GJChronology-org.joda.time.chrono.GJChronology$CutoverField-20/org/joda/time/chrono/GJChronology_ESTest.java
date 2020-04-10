/*

 * Tue Mar 03 17:39:44 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(957, 957, 957, 957, 957, 957, 1501);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 957 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.withYear(1);
      assertEquals(3, yearMonth1.getMonthOfYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis((-764), (-764), (-764), (-764));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -764 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(2, 2, 2, 2);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62101468799998L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1585692000000L, interval0.getEndMillis());
  }
}
