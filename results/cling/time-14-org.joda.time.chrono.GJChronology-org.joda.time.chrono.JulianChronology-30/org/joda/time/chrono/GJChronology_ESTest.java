/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 00:53:14 GMT 2019
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
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(28);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(28);
      GJChronology.getInstance(dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(28);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("w_|/-O4XVCd|u$iC6", "w_|/-O4XVCd|u$iC6").when(dateTimeZone0).getID();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      long long0 = gJChronology0.gregorianToJulianByYear(63158400000L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(64281600000L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-749));
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      dateMidnight0.withZoneRetainFields(dateTimeZone0);
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (long) (-749), (-749));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -749
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(11, 11, 11, 11, 11, 11, 11);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-61793068100989L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1912));
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      long long0 = gJChronology0.gregorianToJulianByYear(63158400000L);
      assertEquals(1566089589998L, mutableDateTime0.getMillis());
      assertEquals(64281600000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      dateMidnight0.toDateTime((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      DateTime dateTime0 = dateMidnight0.toDateTime((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3279);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone1, (long) 3279, 1);
      String string0 = gJChronology0.toString();
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("GJChronology[+00:00:03.279,cutover=1970-01-01T00:00:03.279Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(59);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      DateTimeZone.forOffsetMillis((-720));
      JulianChronology.getInstance(dateTimeZone0);
      gJChronology0.getGregorianCutover();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }
}
