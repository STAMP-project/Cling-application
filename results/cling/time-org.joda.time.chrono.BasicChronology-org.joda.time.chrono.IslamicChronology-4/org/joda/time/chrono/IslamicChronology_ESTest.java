/*

 * Tue Mar 03 16:55:27 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      String string0 = islamicChronology0.toString();
      assertEquals("IslamicChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0, 4);
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      long long0 = islamicChronology0.setYear(4, 445);
      assertEquals(1583254512778L, dateTime0.getMillis());
      assertEquals((-28902700799996L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = mock(IslamicChronology.LeapYearPatternType.class, new ViolatedAssumptionAnswer());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getDaysInYear(1887);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInYear((-1746));
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.setYear((-2263L), 13);
      assertEquals((-42129417602263L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) buddhistChronology0);
      long long0 = buddhistChronology0.set(localDate0, 22);
      assertEquals(1583193600022L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekOfWeekyear(2592000000L, 2424);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (DateTimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0, 4);
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = new IslamicChronology(gJChronology0, object0, islamicChronology_LeapYearPatternType0);
      IslamicChronology islamicChronology1 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology0.LEAP_YEAR_15_BASED);
      Chronology chronology0 = islamicChronology1.withZone((DateTimeZone) null);
      assertEquals(1583254503662L, dateTime0.getMillis());
      assertSame(islamicChronology1, chronology0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getWeekyear(25055999987L);
      assertEquals(1970, int0);
  }
}
