/*

 * Tue Mar 03 16:49:21 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.MAX_VALUE;
      int int0 = seconds0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) seconds1);
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L, (Chronology) islamicChronology0);
      MonthDay monthDay0 = new MonthDay((Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.ONE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = Seconds.ZERO;
      Seconds seconds2 = seconds0.minus(seconds1);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(Integer.MAX_VALUE, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      int int0 = seconds0.THREE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(hours0);
      Seconds seconds1 = seconds0.minus((-1567));
      assertEquals(1567, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.millis(2266);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      assertEquals(2, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.millis(3623L);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      boolean boolean0 = seconds0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals("java.util.GregorianCalendar[time=1583254113716,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=48,SECOND=33,MILLISECOND=716,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(10000000000L);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      Seconds seconds2 = seconds1.minus(seconds0);
      assertSame(seconds1, seconds0);
      assertEquals(0, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(hours0);
      Seconds seconds1 = seconds0.minus((-1));
      assertEquals(0, seconds0.getSeconds());
      assertEquals(1, seconds1.getSeconds());
      assertEquals(1, seconds1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Period period0 = seconds0.MAX_VALUE.toPeriod();
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertEquals(Integer.MAX_VALUE, seconds1.getSeconds());
      assertEquals(3, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      boolean boolean0 = seconds0.MAX_VALUE.equals(seconds0);
      assertEquals(1, seconds0.getSeconds());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.MAX_VALUE.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("@[l&iM5xQUMJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"@[l&iM5xQUMJ\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
