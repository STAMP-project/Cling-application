/*

 * Tue Mar 03 17:40:30 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Interval must not be null", "Interval must not be null").when(dateTimeZone0).getID();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JulianChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null, 12825000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 12825000
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("YearWeekDay", "X").when(dateTimeZone0).getID();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(0);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone1, (ReadableInstant) null, 3);
      assertNotSame(gJChronology1, gJChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, "GJ", "org.joda.time.MutableDateTime").when(dateTimeZone0).toString();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      String string0 = gJChronology0.toString();
      assertEquals(1583257207262L, dateTime0.getMillis());
      assertEquals("GJChronology[null,cutover=2020-03-03T17:40:07.262Z]", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null).when(dateTimeZone0).getID();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      gJChronology0.getDateTimeMillis(39, 10, 10, 10, 39, 10, 10);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      assertEquals(1583257193785L, mutableDateTime0.getMillis());
  }
}
