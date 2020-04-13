/*

 * Tue Mar 03 16:54:10 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology(islamicChronology0, islamicChronology0, 1);
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[Europe/Amsterdam,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      String string0 = copticChronology0.toString();
      assertEquals("CopticChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = mock(IslamicChronology.LeapYearPatternType.class, new ViolatedAssumptionAnswer());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      assertNotNull(islamicChronology0);
      
      boolean boolean0 = islamicChronology0.isLeapYear(2559);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getDaysInYear(896);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      int int0 = julianChronology0.getDaysInYear(30);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.setYear((-347L), 89);
      assertEquals((-39802492800347L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(gregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.plusYears(709);
      YearMonth yearMonth2 = yearMonth1.minusMonths(2097152);
      assertEquals(7, yearMonth2.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekOfWeekyear(86054416431L, 2383);
      assertEquals(50, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = mock(IslamicChronology.LeapYearPatternType.class, new ViolatedAssumptionAnswer());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology0.getDayOfMonth(2559);
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekyear((-3503));
      assertEquals(1389, int0);
  }
}
