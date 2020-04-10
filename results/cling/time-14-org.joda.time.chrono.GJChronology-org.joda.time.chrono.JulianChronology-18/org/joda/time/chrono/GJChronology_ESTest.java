/*

 * Tue Mar 03 17:42:25 GMT 2020
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      assertSame(gJChronology1, gJChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("*<@apm/n{OU", "*<@apm/n{OU").when(dateTimeZone0).getID();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      Instant instant0 = new Instant();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) instant0);
      assertEquals(1583257332305L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(0, 4, 4, 3123);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology.getInstance();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null, (String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null).when(dateTimeZone0).toString();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone1);
      assertNotNull(julianChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, gJChronology0);
      assertEquals((-62135770772000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 1);
      String string0 = gJChronology0.toString();
      assertEquals(1583257323339L, mutableDateTime0.getMillis());
      assertEquals("GJChronology[null,cutover=2020-03-03T17:42:03.339Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 1);
      long long0 = gJChronology0.julianToGregorianByYear(1);
      assertEquals(1583257317570L, mutableDateTime0.getMillis());
      assertEquals((-1123199999L), long0);
  }
}
