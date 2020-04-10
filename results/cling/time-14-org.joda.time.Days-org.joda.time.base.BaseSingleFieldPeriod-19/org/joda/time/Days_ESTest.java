/*

 * Tue Mar 03 17:07:27 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.FOUR;
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      boolean boolean0 = days0.TWO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.SIX;
      Days days1 = days0.FOUR.plus(3);
      assertEquals(7, days1.getDays());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
      Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals("java.util.GregorianCalendar[time=1583255220939,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=7,SECOND=0,MILLISECOND=939,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.millis((-1053));
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.days(6);
      assertEquals(6, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 1);
      Days days0 = Days.standardDaysIn(period1);
      Days days1 = days0.plus(1);
      assertEquals(2, days1.getDays());
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.FIVE;
      int int0 = days0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.days((-3514));
      Days days1 = days0.minus(days0);
      int int0 = days1.ZERO.compareTo((BaseSingleFieldPeriod) days1);
      assertEquals(0, int0);
      assertEquals((-3514), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.days((-3514));
      int int0 = days0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals((-3514), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      int int0 = days0.SEVEN.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Seconds seconds0 = hours0.toStandardSeconds();
      Days days0 = Days.standardDaysIn(seconds0);
      Days days1 = Days.THREE;
      Days days2 = days0.plus(days1);
      assertSame(days2, days1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = Days.TWO;
      boolean boolean0 = days0.equals(days1);
      assertEquals(2, days1.getDays());
      assertFalse(boolean0);
      assertFalse(days1.equals((Object)days0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.millis((-1053));
      Days days0 = Days.MAX_VALUE;
      boolean boolean0 = days0.FIVE.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.minutes((-1053));
      Days days0 = Days.standardDaysIn(period0);
      Days days1 = Days.FOUR;
      Days days2 = days0.plus(days1);
      assertSame(days2, days1);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.millis((-1053));
      Days days0 = Days.standardDaysIn(period0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.FIVE;
      Days days2 = Days.standardDaysIn(days1);
      assertSame(days2, days1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Days days0 = Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, days0.getDays());
  }
}
