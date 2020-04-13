/*

 * Tue Mar 03 16:47:09 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals("java.util.GregorianCalendar[time=1583254007184,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=46,SECOND=47,MILLISECOND=184,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.ONE;
      Seconds seconds3 = seconds2.plus(1073741824);
      Seconds seconds4 = seconds3.minus(1073741824);
      assertSame(seconds4, seconds2);
      assertEquals(1073741825, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      boolean boolean0 = seconds0.equals(localDate0);
      assertFalse(boolean0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      int int0 = seconds0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Duration duration0 = hours0.toStandardDuration();
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = hours0.toStandardSeconds();
      boolean boolean0 = seconds1.equals(seconds0);
      assertTrue(boolean0);
      assertEquals(10800, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.TWO;
      Seconds seconds3 = seconds2.plus(1073741824);
      Seconds seconds4 = seconds3.minus(1073741824);
      assertSame(seconds4, seconds2);
      assertEquals(1073741826, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Hours hours0 = Hours.THREE;
      Duration duration0 = hours0.toStandardDuration();
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime((DateTimeZone) null);
      Interval interval0 = duration0.toIntervalFrom(dateTime0);
      Seconds.secondsIn(interval0);
      assertEquals(1583254004170L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      boolean boolean0 = seconds0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds.standardSecondsIn(seconds0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(569, (-28181250), (-28181250));
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds0.getSeconds());
      
      Seconds seconds1 = Seconds.THREE;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      assertSame(seconds2, seconds1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      Seconds seconds2 = seconds0.plus(Integer.MAX_VALUE);
      assertSame(seconds0, seconds1);
      assertEquals(Integer.MAX_VALUE, seconds2.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.THREE;
      boolean boolean0 = seconds1.equals(seconds0);
      assertFalse(boolean0);
      assertEquals(3, seconds1.getSeconds());
      assertFalse(seconds0.equals((Object)seconds1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Hours hours0 = Hours.THREE;
      boolean boolean0 = seconds0.equals(hours0);
      assertFalse(boolean0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      int int0 = seconds0.ONE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, seconds0.getSeconds());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      int int0 = seconds0.ZERO.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals((-1), int0);
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("n`]'d##F}v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"n`]'d##F}v\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
