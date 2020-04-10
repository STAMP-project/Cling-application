/*

 * Tue Mar 03 17:49:03 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-53174531971999L), long0);
      
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(4294967295L);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset(1, false);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      long long0 = dateTimeZone0.convertLocalToUTC(785L, true);
      assertEquals((-212399215L), long0);
      
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getName((-906L), locale0);
      assertEquals("+59:00", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1L));
      assertEquals((-3600000L), long0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName(1);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeField0.set(3125L, 1);
      assertEquals((-53174531968875L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset((-1485L));
      assertTrue(boolean0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-53174531971999L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.CANADA_FRENCH;
      fixedDateTimeZone0.getShortName((-3600000L), locale0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withWeekOfWeekyear(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-53174531971999L), long0);
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.plusDays(2147483288);
      assertEquals(185544139269600000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getOffset((ReadableInstant) null);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateMidnight dateMidnight0 = DateMidnight.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Hours hours0 = Hours.TWO;
      localDateTime0.minus((ReadablePeriod) hours0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals(3660000, int0);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Period period0 = Period.weeks(1);
      int[] intArray0 = copticChronology0.get((ReadablePeriod) period0, 1750L, (long) 1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, (-1), (-749)}, intArray0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.CANADA;
      String string0 = fixedDateTimeZone0.getName((-1389L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      long long0 = fixedDateTimeZone0.convertLocalToUTC(3600000L, true);
      assertEquals(3600000L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withDayOfYear(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((-53174531971999L));
      assertNotNull(string0);
      assertEquals("+00:19:32", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:01", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(242L, true);
      assertEquals((-3659758L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getShortName((-1L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583189940000L, dateMidnight0.getMillis());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3659999L), long0);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withWeekOfWeekyear(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withDayOfYear(1);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.plusDays(2147483288);
      assertEquals(185544139269600000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(513);
      assertEquals((-14605661972000L), dateMidnight1.getMillis());
      
      TimeZone timeZone0 = TimeZone.getTimeZone("org.joda.time.LocalDateTime");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDate.now((Chronology) copticChronology0);
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime.now();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      long long0 = dateTimeField0.set(3680480L, 1);
      assertEquals((-53174528291520L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName(1);
      assertEquals("+01:00", string0);
      
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      localDateTime0.plusSeconds(8);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(513);
      assertEquals((-14605661972000L), dateMidnight1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(513, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-1846859999L), long0);
      assertEquals("+513:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(3660000, int0);
      assertEquals("+01:01", dateTimeZone0.toString());
      
      long long0 = dateTimeField0.set((-9680400000L), 1);
      assertEquals((-53184212372000L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfEra();
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-53174531971999L), long0);
      
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) copticChronology0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }
}
