/*

 * Tue Mar 03 17:36:52 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        dateTime0.withDate((-10), (-10), (-10));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -10 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = DateTime.now((Chronology) gJChronology0);
      GJChronology gJChronology1 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        gJChronology1.set(localDateTime0, (-9223372036854775808L));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 3 for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(83, 83, 83, 83, 83, 83, 83);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 83 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) gJChronology0);
      long long0 = gJChronology0.set(localDateTime0, (-9223372036854775808L));
      assertEquals(1583256999601L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
      assertNotSame(gJChronology1, gJChronology0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(8, 8, 8, 8);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-61895924371992L), long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(86397977);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1585692000000L, interval0.getEndMillis());
  }
}
