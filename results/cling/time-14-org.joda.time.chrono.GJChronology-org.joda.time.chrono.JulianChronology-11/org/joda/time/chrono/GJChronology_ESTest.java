/*

 * Tue Mar 03 17:41:08 GMT 2020
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
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gJChronology0.assemble(assembledChronology_Fields0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime(2585L, (Chronology) julianChronology0);
      dateTime0.withTimeAtStartOfDay();
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0, 2084);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 2084
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      DateTime dateTime0 = new DateTime(2585L, (Chronology) julianChronology0);
      dateTime0.withTimeAtStartOfDay();
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0, 2084);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 2084
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(174, 4, 14, 12, 4, 14, 4);
      assertEquals((-56667384917996L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JulianChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null, 3249);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 3249
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(355);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 1583190000000L, 6);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[+355:00,cutover=2020-03-02T23:00:00.000Z,mdfw=6]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) iSOChronology0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      assertEquals(1583257252886L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime(31557600008L, (Chronology) julianChronology0);
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertEquals(31536000000L, dateTime1.getMillis());
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      DateTime dateTime0 = new DateTime((-2583L), (Chronology) julianChronology0);
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertEquals((-3600000L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 3);
      long long0 = gJChronology0.getDateTimeMillis(828, 7, 7, 11, 0, 5, 11);
      assertEquals(1583257248840L, mutableDateTime0.getMillis());
      assertEquals((-36021417566989L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("$z7u`").when(dateTimeZone0).getID();
      MutableDateTime mutableDateTime0 = new MutableDateTime(62035200000L, dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 2);
      try { 
        gJChronology0.getDateTimeMillis(0, 5, 5, 1014);
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
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(355);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, 1583190000000L, 6);
      String string0 = gJChronology1.toString();
      assertEquals("GJChronology[+355:00,cutover=2020-03-02T23:00:00.000Z,mdfw=6]", string0);
  }
}
