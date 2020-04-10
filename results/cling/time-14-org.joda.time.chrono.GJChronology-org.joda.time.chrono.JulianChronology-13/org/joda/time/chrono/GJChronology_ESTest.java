/*

 * Tue Mar 03 17:41:16 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 91);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 91
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("s;", "s;").when(dateTimeZone0).getID();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Joul(6,9Q([Bw*=;6", ">2Zj23+OyPkHKmLp`{").when(dateTimeZone0).getID();
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, 63342091L, 3);
      assertEquals(3, gJChronology1.getMinimumDaysInFirstWeek());
      
      long long0 = gJChronology0.gregorianToJulianByYear(10800000L);
      assertEquals(1134000000L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      assertNotNull(julianChronology0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(292272992);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone1);
      long long0 = gJChronology0.gregorianToJulianByYear(292272992);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1415472992L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 29, 2, 29, 2, 2);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 7, 7);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=1970-01-01T00:00:00.007Z,mdfw=7]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      assertEquals(1583260865576L, dateTime0.getMillis());
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(4, 4, 4, 4, 4, 4, 4);
      assertEquals((-62033026527996L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      String string0 = gJChronology0.toString();
      assertEquals(1583257260351L, dateTime0.getMillis());
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2020-03-03T17:41:00.351Z]", string0);
  }
}
