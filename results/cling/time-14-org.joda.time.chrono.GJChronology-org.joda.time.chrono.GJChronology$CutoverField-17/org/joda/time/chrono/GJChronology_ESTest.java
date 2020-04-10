/*

 * Tue Mar 03 17:39:14 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(501);
      assertEquals(6, yearMonth1.getMonthOfYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1978, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(1364, 1364, 1364, 1364, 1364, 1364, (-295));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1364 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) gJChronology0);
      localDateTime0.withDate(4, 4, 4);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(2, 2, 2, 484);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62101469971516L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }
}
