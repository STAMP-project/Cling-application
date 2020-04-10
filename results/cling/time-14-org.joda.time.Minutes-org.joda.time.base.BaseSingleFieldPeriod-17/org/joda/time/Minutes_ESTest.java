/*

 * Tue Mar 03 17:11:25 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      minutes0.plus(minutes0);
      assertEquals(1583255471274L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Minutes minutes0 = Minutes.standardMinutesIn(seconds0);
      Minutes minutes1 = Minutes.ONE;
      Minutes minutes2 = minutes0.minus(minutes1);
      assertEquals((-1), minutes2.getMinutes());
      assertEquals(1, minutes2.size());
      assertEquals(1, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Weeks weeks0 = Weeks.ZERO;
      // Undeclared exception!
      try { 
        minutes0.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Object object0 = new Object();
      boolean boolean0 = minutes0.MIN_VALUE.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      MutablePeriod mutablePeriod0 = minutes0.ONE.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertEquals(1, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Weeks weeks0 = minutes0.toStandardWeeks();
      Minutes.standardMinutesIn(weeks0);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      boolean boolean0 = minutes0.ONE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Weeks weeks0 = minutes0.toStandardWeeks();
      Minutes.standardMinutesIn(weeks0);
      assertEquals(1583255468939L, dateTime0.getMillis());
      
      Minutes minutes1 = Minutes.MAX_VALUE;
      Minutes minutes2 = Minutes.standardMinutesIn(minutes1);
      assertSame(minutes1, minutes2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.ONE;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes1);
      assertEquals(1, minutes1.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((-3414L));
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds0 = Seconds.standardSecondsIn(minutes0);
      assertEquals(1, seconds0.size());
      assertEquals(0, minutes0.getMinutes());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      int int0 = minutes0.TWO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, int0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.ZERO.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Minutes minutes0 = Minutes.standardMinutesIn(seconds0);
      assertEquals(0, minutes0.getMinutes());
      
      Minutes minutes1 = Minutes.minutes(2);
      assertEquals(1, minutes1.size());
      assertEquals(2, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) null);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      int int0 = minutes0.MAX_VALUE.get(durationFieldType0);
      assertEquals(0, minutes0.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.MAX_VALUE.equals(minutes0);
      assertEquals(0, minutes0.getMinutes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Days days0 = Days.FIVE;
      boolean boolean0 = minutes0.MAX_VALUE.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      Minutes minutes2 = minutes0.dividedBy(1150);
      Minutes minutes3 = Minutes.standardMinutesIn(minutes2);
      assertSame(minutes0, minutes1);
      assertEquals(0, minutes3.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("X;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"X;\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes.standardMinutesIn(minutes0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      Date date0 = gregorianCalendar0.getGregorianChange();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      Minutes.minutesBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals("java.util.GregorianCalendar[time=1583255403354,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=10,SECOND=3,MILLISECOND=354,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }
}
