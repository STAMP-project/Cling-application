/*

 * Tue Mar 03 17:40:19 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate("w^cwLAcm}", julianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"w^cwLAcm}\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("8i?{Nb)fS#1Zq,zj+v", "ZjC Ua").when(dateTimeZone0).getID();
      JulianChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-1839));
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone1, 10800000L, 175);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 175
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null, 4);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 4);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("w^cjLAcm}", "w^cjLAcm}").when(dateTimeZone0).getID();
      GJChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        JulianChronology.getInstance((DateTimeZone) null, 659);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 659
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("NoYears", "NoYears", "NoYears", "NoYears", "7ek`#: `Ld,%Pim$z").when(dateTimeZone0).getID();
      doReturn("", (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 3796L, 1);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      GJChronology.getInstance(dateTimeZone1, (long) 1, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[7ek`#: `Ld,%Pim$z,cutover=1970-01-01T00:00:03.796Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      assertEquals(1583257204262L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      JulianChronology.getInstance((DateTimeZone) null, 4);
      DateTime dateTime0 = new DateTime(4, 4, 4, 4, 4, gJChronology0);
      assertEquals((-62033026532000L), dateTime0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0);
      String string0 = gJChronology0.toString();
      assertEquals(1583257195568L, dateTime0.getMillis());
      assertEquals("GJChronology[UTC,cutover=2020-03-03T17:39:55.568Z]", string0);
  }
}
