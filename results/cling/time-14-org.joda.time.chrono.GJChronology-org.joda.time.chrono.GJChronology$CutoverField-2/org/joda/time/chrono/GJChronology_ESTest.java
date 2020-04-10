/*

 * Tue Mar 03 17:35:52 GMT 2020
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
import org.joda.time.Days;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-79271565510999L), long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(1529, (-504), 1529, (-504), 1529, (-2964), (-504));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -504 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.getDateTimeMillis(167L, 1, 1, 1, 1);
      assertEquals(61001L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = Instant.now();
      Days days0 = Days.SEVEN;
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime((Chronology) buddhistChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      MonthDay monthDay0 = new MonthDay((Chronology) gJChronology0);
      monthDay0.plus(days0);
      assertEquals(1583256935749L, mutableDateTime0.getMillis());
      assertEquals(1583256935749L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(2, 2, 2, 2);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62101469971998L), long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(2615625, 1, 8, 509);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(82478986038000509L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }
}
