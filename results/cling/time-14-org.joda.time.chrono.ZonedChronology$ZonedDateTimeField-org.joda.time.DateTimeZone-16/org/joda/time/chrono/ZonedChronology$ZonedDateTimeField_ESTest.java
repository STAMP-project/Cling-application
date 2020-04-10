/*

 * Tue Mar 03 17:50:01 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate(1, 1, 1, copticChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-53184212372000L), dateMidnight0.getMillis());
      
      long long0 = copticChronology0.set(localDate0, (-2394L));
      assertEquals((-53184208774394L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1312L, false);
      assertEquals((-3598688L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(3235L, (Chronology) buddhistChronology0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset(3749504L, false);
      assertEquals(3749504L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2156);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(1, 1);
      long long0 = copticChronology0.set(yearMonth0, 1);
      assertEquals((-53182307971999L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName((long) 0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1312L, false);
      assertEquals((-3598688L), long0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(1572137999999L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.weekyear();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1572137999999L);
      assertFalse(boolean0);
      
      long long0 = dateTimeField0.add(1572137999999L, (long) 1);
      assertEquals(1604195999999L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusMonths(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName((long) 0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(1, 1);
      long long0 = copticChronology0.set(yearMonth0, 1);
      assertEquals((-53182307971999L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((-53182307971999L));
      assertEquals("+00:19:32", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withWeekyear(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusMinutes(67);
      DateTime dateTime0 = localDateTime1.toDateTime();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583253754254L, dateTime0.getMillis());
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      Locale locale0 = Locale.FRENCH;
      String string0 = dateTimeZone0.getName((-1742L), locale0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(2161L, false);
      assertEquals((-3597839L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = Locale.ROOT;
      String string0 = dateTimeZone0.getShortName(256L, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(256L, false);
      assertEquals((-3599744L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2234);
      boolean boolean0 = dateTimeZone0.isStandardOffset(2234);
      assertTrue(boolean0);
      assertEquals("+00:00:02.234", dateTimeZone0.toString());
      
      LocalDate localDate0 = new LocalDate((long) 2234);
      Interval interval0 = localDate0.toInterval();
      assertEquals(82800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.isStandardOffset(1572137999999L);
      LocalDate localDate0 = new LocalDate();
      LocalDate localDate1 = localDate0.plusMonths(1);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 1);
      Interval interval0 = localDate0.toInterval();
      assertEquals(82800000L, interval0.getEndMillis());
      
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate localDate1 = localDate0.plusMonths((-79608345));
      DateMidnight dateMidnight0 = localDate1.toDateMidnight();
      assertEquals((-209348143661972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 1);
      Interval interval0 = localDate0.toInterval();
      assertEquals(82800000L, interval0.getEndMillis());
      
      Locale locale0 = Locale.JAPAN;
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      String string0 = dateTimeZone0.getName(1492L, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      YearMonth yearMonth0 = new YearMonth(1, 1);
      long long0 = copticChronology0.set(yearMonth0, 1963L);
      assertEquals((-53182307970037L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(1312L, true);
      assertEquals((-3598688L), long0);
      
      LocalDate localDate0 = new LocalDate((-3598688L));
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) 1);
      assertNotNull(string0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1442);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals("+00:00:01.442", dateTimeZone0.toString());
      assertEquals((-1441L), long0);
  }
}
