/*

 * Tue Mar 03 17:40:26 GMT 2020
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
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null, 1);
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      julianChronology0.withZone((DateTimeZone) null);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, 1583193600000L, 30);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 30
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=1970-01-01T00:00:00.001Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("America/Indiana/Indianapolis").when(dateTimeZone0).getID();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null, 4);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      julianChronology0.withZone((DateTimeZone) null);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, 5506991625600000L, 897);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 897
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null).when(dateTimeZone0).toString();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone1);
      assertNotNull(julianChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("o2", (String) null).when(dateTimeZone0).getID();
      DateTime dateTime0 = DateTime.now();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      assertEquals(1583257214943L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.gregorianToJulianByYear(5506877491200000L);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, 5506991625600000L, 897);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 897
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((long) 0, (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        dateMidnight0.withYear(0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(7, 7, 7, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-61930311572000L), dateMidnight0.getMillis());
  }
}
