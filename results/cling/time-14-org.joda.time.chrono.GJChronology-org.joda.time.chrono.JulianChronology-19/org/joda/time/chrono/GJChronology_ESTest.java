/*

 * Tue Mar 03 17:42:22 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JulianChronology.getInstance((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null, 2);
      assertEquals(2, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology.getInstanceUTC();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology(gJChronology0, fixedDateTimeZone0, 31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 31
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-312));
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      try { 
        gJChronology0.getDateTimeMillis(0, 5, 2, 52);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      gJChronology0.assemble(assembledChronology_Fields0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-312));
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null, 2);
      assertNotSame(gJChronology1, gJChronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = new DateTime(11, 11, 11, 11, 11, 11, gJChronology0);
      assertEquals((-61793066929000L), dateTime0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-312));
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 3);
      String string0 = gJChronology0.toString();
      assertEquals(1583257310987L, mutableDateTime0.getMillis());
      assertEquals("GJChronology[-00:00:00.312,cutover=2020-03-03T17:41:50.987Z,mdfw=3]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      long long0 = gJChronology0.gregorianToJulianByYear((-79271564340000L));
      assertEquals((-79240546740000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.gregorianToJulianByYear((-79271564340000L));
      assertEquals((-79240546740000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-312));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null, 2);
      try { 
        gJChronology0.getDateTimeMillis(0, 5, 2, 52);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }
}
