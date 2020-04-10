/*

 * Tue Mar 03 17:26:23 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(12740625);
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Days days0 = weeks0.THREE.toStandardDays();
      boolean boolean0 = weeks0.MIN_VALUE.equals(days0);
      assertFalse(boolean0);
      assertEquals(21, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) ethiopicChronology0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Weeks weeks1 = weeks0.minus(weeks0);
      assertEquals(0, weeks1.getWeeks());
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(584);
      boolean boolean0 = weeks0.ZERO.equals(weeks0);
      assertEquals(584, weeks0.getWeeks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      int int0 = weeks0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      boolean boolean0 = weeks0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.days(1475);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      Weeks weeks1 = weeks0.dividedBy(97);
      assertEquals(210, weeks0.getWeeks());
      assertEquals(2, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.hours(543);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      assertEquals(3, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = weeks0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      MutablePeriod mutablePeriod0 = weeks0.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      boolean boolean0 = weeks0.TWO.equals(" is not precise in the period ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Weeks weeks0 = Weeks.standardWeeksIn(seconds0);
      Locale locale0 = new Locale("", "$VALUES");
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
      Weeks weeks1 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals("java.util.GregorianCalendar[time=1583256331787,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=25,SECOND=31,MILLISECOND=787,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      Weeks weeks2 = weeks0.minus(weeks0);
      Days.standardDaysIn(weeks2);
      assertSame(weeks2, weeks1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) ethiopicChronology0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(1);
      assertEquals(1, weeks0.getWeeks());
      
      Seconds seconds0 = Seconds.ZERO;
      Weeks weeks1 = Weeks.standardWeeksIn(seconds0);
      assertEquals(0, weeks1.getWeeks());
      assertEquals(1, weeks1.size());
  }
}
