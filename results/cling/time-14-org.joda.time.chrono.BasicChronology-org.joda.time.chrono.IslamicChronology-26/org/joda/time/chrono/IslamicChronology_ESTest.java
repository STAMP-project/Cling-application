/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:03:10 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Object object0 = new Object();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, object0, 1);
      String string0 = julianChronology0.toString();
      assertEquals("JulianChronology[Europe/Amsterdam,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getDaysInYear((-2368));
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getDaysInYear(1787);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekOfWeekyear(842L, 1391);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      IslamicChronology islamicChronology1 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology0.LEAP_YEAR_HABASH_AL_HASIB);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0);
      assertNotNull(gJChronology0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getWeekyear(1);
      assertEquals(1969, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.setYear((-292269337), (-292269337));
      assertEquals((-8948534409105069337L), long0);
  }
}
