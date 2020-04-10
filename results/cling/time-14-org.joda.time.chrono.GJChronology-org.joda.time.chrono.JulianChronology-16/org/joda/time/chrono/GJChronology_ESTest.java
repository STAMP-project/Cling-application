/*

 * Tue Mar 03 17:41:19 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology.getInstance();
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null, 1);
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      dateMidnight0.withYearOfEra(23);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateMidnight0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      LocalDate localDate0 = new LocalDate(364L, (Chronology) julianChronology0);
      localDate0.toDateTimeAtStartOfDay();
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      assertEquals(1583257269353L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulianChronology.getInstance((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-62135765938999L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      
      LocalDate localDate0 = new LocalDate(364L, (Chronology) julianChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals((-3600000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      DateTime dateTime0 = new DateTime((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      long long0 = gJChronology0.getDateTimeMillis(1838, 1, 23, 23, 23, 1, 1);
      assertEquals(1583257264025L, dateTime0.getMillis());
      assertEquals((-4162496190999L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      DateTime dateTime0 = new DateTime((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      String string0 = gJChronology0.toString();
      assertEquals(1583257257270L, dateTime0.getMillis());
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2020-03-03T17:40:57.270Z]", string0);
  }
}
