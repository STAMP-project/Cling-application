/*

 * Tue Mar 03 17:50:14 GMT 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertEquals(1583257799875L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("kjAlbrPzClC2R8;YIp:");
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundHalfCeiling(1566L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000L);
      assertTrue(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 23, true);
      assertEquals((-3599977L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 1);
      Locale locale0 = Locale.ROOT;
      String string0 = dateTimeZone0.getName((long) 4, locale0);
      assertEquals("+04:01", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusYears(1);
      assertEquals(1551635397146L, dateTime1.getMillis());
      
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1585692000000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 3600000);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getName((long) 1, (Locale) null);
      LocalTime localTime0 = LocalTime.now((Chronology) copticChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      String string0 = dateTimeZone0.getName(2389L, (Locale) null);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1172000, true);
      assertEquals((-2428000L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      Interval interval0 = localDate0.toInterval();
      assertEquals((-62135511572000L), interval0.getEndMillis());
      
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.plusMonths(1);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      dateMidnight0.plusMonths(1);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = new Locale("org.joda.time.chrono.GJMonthOfYearDateTimeField", "org.joda.time.chrono.GJMonthOfYearDateTimeField", "org.joda.time.chrono.GJMonthOfYearDateTimeField");
      String string0 = fixedDateTimeZone0.getShortName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      Interval interval0 = localDate0.toInterval();
      assertEquals((-62135511572000L), interval0.getEndMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 1, (Locale) null);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.plusMonths(1);
      assertEquals(1585864800000L, dateMidnight1.getMillis());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(212400000, int0);
      assertEquals("+59:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(1);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight1);
      assertEquals(1172000, int0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals((-62130327572000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      String string0 = dateTimeZone0.getName((-3599999L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }
}
