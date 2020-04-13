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
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      long long0 = gJChronology0.gregorianToJulianByYear(30962844000000L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(30964572000000L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      lenientChronology0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null, 2147483620);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 2147483620
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      lenientChronology0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null, 2147483620);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 2147483620
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(3, 2, 2, gJChronology0);
      assertEquals((-62069933972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1881));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 3);
      assertEquals(3, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 7);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 7);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, lenientChronology0);
      assertTrue(chronology0.equals((Object)lenientChronology0));
      
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      Chronology chronology0 = lenientChronology0.withZone(dateTimeZone0);
      assertFalse(chronology0.equals((Object)lenientChronology0));
      
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((Object) null, (DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateMidnight0);
      DateMidnight dateMidnight1 = new DateMidnight(11, 11, 11, gJChronology0);
      assertEquals((-61793108372000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(0, 1, 1, 2);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone1, (long) 4, 2);
      gJChronology0.toString();
      long long0 = gJChronology0.julianToGregorianByYear(2645423257168421L);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals(2645367874768421L, long0);
  }
}
