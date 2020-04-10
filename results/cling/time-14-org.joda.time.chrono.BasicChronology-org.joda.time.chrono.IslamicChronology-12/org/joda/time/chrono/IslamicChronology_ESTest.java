/*

 * Tue Mar 03 16:55:01 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = islamicChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      String string0 = gregorianChronology0.toString();
      assertEquals("GregorianChronology[UTC,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      String string0 = islamicChronology0.toString();
      assertEquals("IslamicChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInYear((-292269337));
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInYear(25);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(2629746000L);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      Period period0 = new Period(4294771200000L, 1, periodType0, iSOChronology0);
      Period period1 = period0.withDays(1);
      DateMidnight dateMidnight1 = dateMidnight0.plus((ReadablePeriod) period1);
      YearMonth yearMonth0 = new YearMonth((Chronology) iSOChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      DateMidnight dateMidnight2 = dateMidnight1.withFields(localDate0);
      assertNotSame(dateMidnight1, dateMidnight2);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      Period period0 = new Period(4294771200000L, 1, periodType0, iSOChronology0);
      YearMonth yearMonth0 = new YearMonth((Chronology) iSOChronology0);
      YearMonth yearMonth1 = yearMonth0.plus(period0);
      assertEquals(2, yearMonth1.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekOfWeekyear(31083597720000L, 2731);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekyear(1);
      assertEquals(1389, int0);
  }
}
