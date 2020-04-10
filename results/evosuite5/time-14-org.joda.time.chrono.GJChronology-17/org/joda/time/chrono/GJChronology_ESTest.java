/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:42:52 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DurationField durationField0 = gJChronology0.centuries();
      long long0 = durationField0.getDifferenceAsLong((-79268889602488L), (-79268889602488L));
      assertEquals(0L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DurationField durationField0 = gJChronology0.centuries();
      long long0 = durationField0.getDifferenceAsLong(294L, 34L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DurationField durationField0 = gJChronology0.centuries();
      long long0 = durationField0.getDifferenceAsLong((-79268889602488L), (-2992L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-25L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      Interval interval0 = new Interval((-12219292800000L), (-12219292800000L), gJChronology0);
      Months months0 = Months.monthsIn(interval0);
      assertEquals(0, months0.getMonths());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Interval interval0 = new Interval(1392336000001L, 1392336000001L, gJChronology0);
      Months months0 = Months.monthsIn(interval0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Interval interval0 = new Interval((-62067416216997L), 3, gJChronology0);
      Months months0 = Months.monthsIn(interval0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(23601, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Months months0 = Months.EIGHT;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.add((ReadablePeriod) months0, (-62067416216997L), 1);
      assertEquals((-62046248216997L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Years years0 = Years.ONE;
      long long0 = buddhistChronology0.add((ReadablePeriod) years0, (long) (-2468), (-2468));
      assertEquals((-77851495174468L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2447));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 2, 2);
      YearMonth yearMonth0 = new YearMonth((long) 2, (Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.minusYears((-2447));
      assertEquals(2, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(4416, yearMonth1.getYear());
      assertEquals(12, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 2551440384L, 1);
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) gJChronology0);
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(2674800000L, interval0.getEndMillis());
      assertEquals((-1558800000L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      YearMonth yearMonth0 = YearMonth.now((Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.minusYears(1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2013, yearMonth1.getYear());
      assertEquals(2, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      LocalDate localDate0 = new LocalDate(2261L, (Chronology) gJChronology0);
      LocalDate localDate1 = new LocalDate(localDate0, gJChronology0);
      assertTrue(localDate1.equals((Object)localDate0));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-696));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 31083663600000L, 1);
      YearMonth yearMonth0 = new YearMonth(31083663600000L, (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        yearMonth0.toInterval();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2954 for year is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 1392339599995L, 2);
      LocalDate localDate0 = LocalDate.now((Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        localDate0.toDateTimeAtCurrentTime((DateTimeZone) fixedDateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for dayOfMonth is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      YearMonth yearMonth1 = yearMonth0.plus(mutablePeriod0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.assemble((AssembledChronology.Fields) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2447));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 2, 2);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[-00:00:02.447,cutover=1970-01-01T00:00:00.002Z,mdfw=2]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 0L, 2);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=1970-01-01,mdfw=2]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(3, 3, 3, 3, 3, 3, 3);
      assertEquals((-62067416216997L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, (-3204), (-3204), 2, 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3204 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 29, 2, 2, 2, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(1082, 1082, 1082, 0, 1082, 2, (-149));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1082 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) gJChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(3, 3, 3, 3);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62067428371997L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) gJChronology0);
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2674800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (-12219292800000L), (-3));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -3
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Months months0 = Months.ONE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.add((ReadablePeriod) months0, (-12219292802483L), 1);
      assertEquals((-12217478402483L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Months months0 = Months.ONE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      int[] intArray0 = buddhistChronology0.get((ReadablePeriod) months0, 0L, (-12219292802483L));
      assertArrayEquals(new int[] {(-4646)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((-12219292800000L), (Chronology) gJChronology0);
      LocalDate localDate1 = null;
      try {
        localDate1 = new LocalDate(localDate0, gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 15 for dayOfMonth must not be larger than 4
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2466));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 3, 3);
      MonthDay monthDay0 = new MonthDay((long) 0, (Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.plusDays((-551));
      assertEquals(18, monthDay0.getDayOfMonth());
      assertEquals(3, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(15, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      YearMonth yearMonth0 = new YearMonth((long) 6, (Chronology) lenientChronology0);
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(2674800000L, interval0.getEndMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      gJChronology0.equals(gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.hashCode();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.julianToGregorianByWeekyear(1165L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-1209598835L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 31536000000L, 6);
      YearMonth yearMonth0 = new YearMonth(31536000000L, (Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1);
      assertEquals(1970, yearMonth1.getYear());
      assertEquals(12, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate(instant0, gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified date does not exist
         //
         verifyException("org.joda.time.chrono.GJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DurationField durationField0 = gJChronology0.weekyears();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getDifferenceAsLong(86400000L, (-62068646318680L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1966L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((-12219292799987L), (Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.minusYears(1);
      assertEquals(1581, yearMonth1.getYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(10, yearMonth1.getMonthOfYear());
  }
}
