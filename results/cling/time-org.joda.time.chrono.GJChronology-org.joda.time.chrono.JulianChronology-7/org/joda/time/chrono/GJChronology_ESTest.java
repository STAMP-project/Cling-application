/*

 * Tue Mar 03 17:41:57 GMT 2020
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
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("ReadablePartial objects must have the same set of fields", "ReadablePartial objects must have the same set of fields").when(dateTimeZone0).getID();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) gJChronology0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      assertEquals(1583257293226L, mutableDateTime0.getMillis());
      
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeZone1).getID();
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone1, (ReadableInstant) null, 3);
      assertEquals(3, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      JulianChronology.getInstance((DateTimeZone) null);
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0);
      assertEquals(1583257284062L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology(gJChronology0, (Object) null, (-539));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -539
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((long) 100);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateMidnight0);
      DateMidnight dateMidnight1 = new DateMidnight(100, 7, 3, gJChronology0);
      assertEquals((-58995735572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) fixedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) mutableDateTime0, 2);
      GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight((-3333), 2, 29, gJChronology0);
      assertEquals(1583257279630L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("ReadablePartial objects must have the same set of fields", "ReadablePartial objects must have the same set of fields", "").when(dateTimeZone0).getID();
      doReturn("", "ReadablePartial objects must have the same set of fields", (String) null).when(dateTimeZone0).toString();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) gJChronology0);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      String string0 = gJChronology1.toString();
      assertEquals(1583257273208L, mutableDateTime0.getMillis());
      assertEquals("GJChronology[,cutover=2020-03-03T17:41:13.208Z]", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      // Undeclared exception!
      try { 
        gJChronology0.gregorianToJulianByYear((-62164281599993L));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("ReadablePartial objects must have the same set of fields", "ReadablePartial objects must have the same set of fields").when(dateTimeZone0).getID();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) gJChronology0);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      long long0 = gJChronology1.gregorianToJulianByYear((-2318L));
      assertEquals(1583257267491L, mutableDateTime0.getMillis());
      assertEquals(1123197682L, long0);
  }
}
