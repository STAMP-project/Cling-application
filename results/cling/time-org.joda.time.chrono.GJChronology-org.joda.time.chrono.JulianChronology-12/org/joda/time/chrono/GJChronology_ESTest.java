/*

 * Tue Mar 03 17:41:06 GMT 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("389;?uA5;w&mZI", "").when(dateTimeZone1).getID();
      JulianChronology.getInstance(dateTimeZone1);
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, (-2911));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -2911
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      Chronology chronology0 = gJChronology0.withZone(dateTimeZone0);
      try { 
        chronology0.getDateTimeMillis(0, 3, 11, 2, 1, 0, 0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology.getInstanceUTC();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.chrono.GJChronology$LinkedDurationField", "org.joda.time.chrono.GJChronology$LinkedDurationField").when(dateTimeZone0).getID();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      assertNotNull(julianChronology0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0, 5);
      long long0 = gJChronology0.getDateTimeMillis(1, 3, 4, 1, 0, 4, 5);
      assertEquals(1583257251833L, mutableDateTime0.getMillis());
      assertEquals((-62130410367995L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0, 5);
      gJChronology0.toString();
      long long0 = gJChronology0.getDateTimeMillis(1, 3, 4, 1, 0, 4, 5);
      assertEquals(1583257248704L, mutableDateTime0.getMillis());
      assertEquals((-62130410367995L), long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.gregorianToJulianByYear((-79266369538032L));
      assertEquals((-79235351938032L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 5);
      assertEquals(1583257242897L, mutableDateTime0.getMillis());
  }
}
