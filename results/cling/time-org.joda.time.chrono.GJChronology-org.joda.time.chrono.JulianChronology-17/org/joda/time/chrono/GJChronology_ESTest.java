/*

 * Tue Mar 03 17:41:53 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(5, 3, 5, 5, 2, 4, 5);
      assertEquals((-62004079047995L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null, (DateTimeZone) null);
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (-12219292800000L), (-2497));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -2497
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JulianChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(44);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(44);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology(gJChronology0, arrayList0, 44);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 44
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      julianChronology0.withZone((DateTimeZone) null);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0);
      assertEquals(1583257283390L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("=,uV9lQj/8*", (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).getID();
      DateTime dateTime0 = new DateTime(63640525L);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      lenientChronology0.withZone(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) gJChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(2060);
      assertEquals((-63392803200000L), dateMidnight1.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone1);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 5);
      assertEquals(1583257275880L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      julianChronology0.withZone((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0);
      long long0 = gJChronology0.getDateTimeMillis(5, 3, 5, 5, 2, 4, 5);
      assertEquals(1583257272727L, mutableDateTime0.getMillis());
      assertEquals((-62004079047995L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (long) 1, 1);
      try { 
        gJChronology0.getDateTimeMillis(0, 5, 4, 4, 30, 5, 5);
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
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      LocalDate localDate0 = LocalDate.now((Chronology) julianChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateMidnight0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2020-03-02T23:00:00.000Z]", string0);
  }
}
