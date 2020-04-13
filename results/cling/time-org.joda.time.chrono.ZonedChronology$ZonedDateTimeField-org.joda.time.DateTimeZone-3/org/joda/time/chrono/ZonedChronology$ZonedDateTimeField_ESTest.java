/*

 * Tue Mar 03 17:48:03 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) null);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      long long0 = dateTimeField0.add((long) 1, (-267L));
      assertEquals((-8425898371999L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getName((long) 1, (Locale) null);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getName((long) 1, (Locale) null);
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate localDate1 = localDate0.withWeekOfWeekyear(1);
      assertNotSame(localDate1, localDate0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset((-436));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertEquals(1583257666116L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      long long0 = dateTimeField0.add((long) 1, 10800000L);
      assertEquals(340822080342000001L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusMonths(1);
      Locale locale0 = Locale.JAPAN;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName(3608960L, locale0);
      assertEquals("+01:01", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+00:00:00.001", string0);
      
      long long0 = dateTimeField0.add((-643L), (-643L));
      assertEquals((-20291555972643L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      LocalDate localDate0 = new LocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) null);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      long long0 = dateTimeField0.add((long) (-436), (long) (-436));
      assertEquals((-13759111172436L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.withWeekOfWeekyear(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583257662271L, dateTime0.getMillis());
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(766580400002L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      dateTimeZone0.getShortName((long) 1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withYearOfCentury(1);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.toDateMidnight((DateTimeZone) null);
      LocalDate localDate1 = localDate0.minusMonths((-436));
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      LocalDate localDate1 = localDate0.withYearOfEra(1);
      DateMidnight dateMidnight0 = localDate1.toDateMidnight();
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-62130327572000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName(3602048L, (Locale) null);
      assertEquals("+00:00", string0);
      
      long long0 = dateTimeField0.addWrapField((long) 0, 2147483094);
      assertEquals(6017528830402800000L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      String string0 = dateTimeZone0.getShortName(1L);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      DateTimeField dateTimeField0 = copticChronology0.year();
      long long0 = dateTimeField0.roundFloor(30962844000000L);
      assertEquals(30948300000000L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime((DateTimeZone) fixedDateTimeZone0);
      fixedDateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583257649633L, dateTime0.getMillis());
      
      long long0 = dateTimeField0.addWrapField((long) 0, 2147483094);
      assertEquals(6017528830402800000L, long0);
  }
}
