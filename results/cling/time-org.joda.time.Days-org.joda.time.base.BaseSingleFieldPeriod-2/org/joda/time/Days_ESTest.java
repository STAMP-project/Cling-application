/*

 * Tue Mar 03 17:06:46 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.SIX;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      boolean boolean0 = days0.THREE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      int int0 = days0.TWO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      Days days0 = Days.FIVE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
      
      Days days2 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days3 = Days.standardDaysIn(days2);
      assertEquals(0, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      Days days0 = Days.standardDaysIn(mutablePeriod0);
      Days days1 = Days.TWO;
      Days days2 = days0.plus(days1);
      assertEquals(0, days0.getDays());
      assertSame(days2, days1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.days(1320);
      assertEquals(1, days0.size());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      Days days1 = Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Days days2 = Days.standardDaysIn(days1);
      int int0 = days0.ZERO.compareTo((BaseSingleFieldPeriod) days2);
      assertEquals(0, int0);
      assertEquals(1320, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.days(1320);
      int int0 = days0.ZERO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals((-1), int0);
      assertEquals(1320, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.THREE;
      int int0 = days0.MAX_VALUE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.minus((-6));
      assertEquals(6, days1.getDays());
      
      Days days2 = Days.standardDaysIn(days0);
      assertEquals(1, days2.size());
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.ONE;
      Duration duration0 = days0.toStandardDuration();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 7);
      Period period0 = duration0.toPeriod((Chronology) copticChronology0);
      Days days1 = Days.standardDaysIn(period0);
      assertEquals(86400000L, duration0.getMillis());
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Period period0 = new Period(117, (-40), (-1042), (-1042));
      Days days1 = Days.standardDaysIn(period0);
      Days days2 = days0.SEVEN.minus(days1);
      assertEquals(4, days1.getDays());
      assertEquals(3, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.THREE;
      boolean boolean0 = days0.SIX.equals(days0);
      assertFalse(boolean0);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Period period0 = Period.ZERO;
      boolean boolean0 = days0.TWO.equals(period0);
      assertFalse(boolean0);
  }
}
