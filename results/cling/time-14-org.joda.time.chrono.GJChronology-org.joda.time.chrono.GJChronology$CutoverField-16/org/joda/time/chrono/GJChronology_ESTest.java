/*

 * Tue Mar 03 17:39:23 GMT 2020
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
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
      LocalDate localDate1 = localDate0.withYear((-1128));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(748L, (Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.minusDays((-129));
      assertEquals(10, monthDay1.getDayOfMonth());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(20, 20, 20, 20, 20, 20, 20);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 20 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime();
      long long0 = gJChronology0.set(localDateTime0, (-91050566400000L));
      assertEquals(1583260752620L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(811, 2060, 811, 811);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 2060 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Object) null, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null, 25);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 25
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(748L, (Chronology) gJChronology0);
      monthDay0.toLocalDate((-129));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1, monthDay0.getDayOfMonth());
  }
}
