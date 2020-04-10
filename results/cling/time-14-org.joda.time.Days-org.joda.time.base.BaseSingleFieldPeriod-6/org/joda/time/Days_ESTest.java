/*

 * Tue Mar 03 17:06:53 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      boolean boolean0 = days0.isSupported((DurationFieldType) null);
      assertEquals(0, days0.getDays());
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
      LocalDate localDate0 = LocalDate.now();
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
      Days days0 = Days.TWO;
      int int0 = days0.THREE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(2, days0.getDays());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Days days0 = Days.TWO;
      DateMidnight dateMidnight0 = new DateMidnight();
      Instant instant0 = Instant.now();
      Days days1 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) dateMidnight0);
      Days.standardDaysIn(days1);
      assertEquals(1583255196342L, instant0.getMillis());
      
      Days days2 = days0.plus(days0);
      assertEquals(4, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = days0.plus(days0);
      assertSame(days0, days1);
      assertEquals(4, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.ONE;
      Days days2 = days0.minus(days1);
      assertEquals(2, days2.getDays());
      
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("P6D");
      Days days3 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(6, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = Days.days(5);
      assertEquals(5, days1.getDays());
      
      Days days2 = Days.standardDaysIn(days0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.FIVE;
      int int0 = days0.ONE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(5, days0.getDays());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.ONE;
      int int0 = days0.ONE.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.FIVE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      int int0 = days0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.days(1);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.SIX;
      Days days1 = Days.THREE;
      Days days2 = days0.minus(days1);
      assertSame(days2, days1);
      
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("P6D");
      Days days3 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(6, days3.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.MAX_VALUE.equals(days0);
      assertFalse(boolean0);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.THREE;
      Weeks weeks0 = Weeks.TWO;
      boolean boolean0 = days0.MIN_VALUE.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(7L, (Chronology) ethiopicChronology0);
      Days days0 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(0, days0.getDays());
      
      Days days1 = Days.days(1);
      assertEquals(1, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      Days days0 = Days.daysBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      Days days1 = days0.ZERO.plus((-504));
      assertEquals((-504), days1.getDays());
      assertEquals(0, days0.getDays());
  }
}
