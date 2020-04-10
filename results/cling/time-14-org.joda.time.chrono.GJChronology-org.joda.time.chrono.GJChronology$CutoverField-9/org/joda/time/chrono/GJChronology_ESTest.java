/*

 * Tue Mar 03 17:36:54 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(28, 28, 28, 28, 28, 10, 10);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 28 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(1963, 1963, 1963, 1);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1963 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(1482, 1482, 1482, 91);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1482 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-62135769599999L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Chronology chronology0 = gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertNotSame(chronology0, gJChronology0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 1L, 4);
      YearMonth yearMonth0 = new YearMonth(1L, (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        yearMonth0.toInterval();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified date does not exist
         //
         verifyException("org.joda.time.chrono.GJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      doReturn((String) null, (String) null, (String) null).when(dateTimeZone0).getID();
      // Undeclared exception!
      try { 
        BuddhistChronology.getInstance(dateTimeZone0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -543 for year is not supported: Illegal instant due to time zone offset transition: -0543-12-26T00:00:00.000 (null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((long) 4, (Chronology) gJChronology0);
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2674800000L, interval0.getEndMillis());
  }
}
