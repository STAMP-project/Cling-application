/*

 * Tue Mar 03 17:41:22 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      GJChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        JulianChronology.getInstance((DateTimeZone) null, 35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 35
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      Instant instant0 = new Instant((Object) null);
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) instant0);
      assertEquals(1583257270774L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("8Kaic:C{R*;5N", "8Kaic:C{R*;5N").when(dateTimeZone0).getID();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone1).getID();
      gJChronology0.julianToGregorianByYear((-3174L));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone1);
      DateTime dateTime0 = DateTime.now((Chronology) gregorianChronology0);
      GJChronology.getInstance(dateTimeZone1, (ReadableInstant) dateTime0);
      assertEquals(1583257264715L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 1468L, 6);
      long long0 = gJChronology0.getDateTimeMillis(6, 6, 6, 6, 6, 6, 6);
      assertEquals((-61964504005994L), long0);
      assertEquals(6, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) instant0);
      String string0 = gJChronology0.toString();
      assertEquals(1583257258845L, instant0.getMillis());
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2020-03-03T17:40:58.845Z]", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      long long0 = gJChronology0.gregorianToJulianByYear((-79301721598223L));
      assertEquals((-79270703998223L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.gregorianToJulianByYear((-79271567820013L));
      assertEquals((-79240550220013L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }
}
