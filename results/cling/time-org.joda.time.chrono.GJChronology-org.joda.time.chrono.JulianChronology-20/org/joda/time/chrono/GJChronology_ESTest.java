/*

 * Tue Mar 03 17:41:50 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("4k;'a;0<", "").when(dateTimeZone0).getID();
      gJChronology0.withZone(dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(543);
      LocalDate localDate0 = new LocalDate(instant0, julianChronology0);
      localDate0.toInterval(dateTimeZone0);
      GJChronology.getInstance(dateTimeZone1, (ReadableInstant) instant0);
      assertEquals(1583257295326L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(543);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      String string0 = gJChronology0.toString();
      assertEquals(1583257292528L, instant0.getMillis());
      assertEquals("GJChronology[+00:00:00.543,cutover=2020-03-03T17:41:32.528Z]", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JulianChronology.getInstance((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      gJChronology0.toString();
      int int0 = 43;
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (long) 1, 43);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 43
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("");
      gJChronology0.julianToGregorianByYear((-1386L));
      long long0 = 1L;
      gJChronology0.julianToGregorianByWeekyear(62035199993L);
      GJChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) mutableDateTime0, 1869);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1869
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 38, 1);
      assertEquals((-62135767073999L), long0);
      
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withFields((ReadablePartial) null);
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      Instant instant1 = instant0.plus(1983L);
      instant1.getZone();
      DateMidnight.now();
      Hours hours0 = Hours.EIGHT;
      dateMidnight1.toInstant();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1337);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      instant0.isBefore((long) 1);
      zonedChronology0.withUTC();
      LocalDate localDate0 = new LocalDate((Object) null, julianChronology0);
      localDate0.toInterval(dateTimeZone0);
      DateTimeZone dateTimeZone1 = zonedChronology0.getZone();
      GJChronology.getInstance(dateTimeZone1, (ReadableInstant) dateMidnight0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withZoneRetainFields(dateTimeZone0);
      Instant instant1 = dateMidnight1.toInstant();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDate localDate0 = new LocalDate(instant1, julianChronology0);
      localDate0.toInterval(dateTimeZone0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant1);
      assertEquals(1583257282741L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        gJChronology0.gregorianToJulianByYear((-62166096000000L));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }
}
