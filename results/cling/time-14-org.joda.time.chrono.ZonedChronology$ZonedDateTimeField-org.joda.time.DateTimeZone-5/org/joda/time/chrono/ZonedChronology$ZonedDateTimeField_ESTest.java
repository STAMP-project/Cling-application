/*

 * Tue Mar 03 17:48:49 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      long long0 = dateTimeField0.roundCeiling((-3599999L));
      assertEquals(463701600000L, long0);
      
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getName((long) 1, (Locale) null);
      LocalDate localDate0 = new LocalDate((long) 1, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(1);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.plusMonths(1);
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null);
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals((-62135594310999L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      String string0 = dateTimeZone0.getName(3600L, (Locale) null);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("$;I$m*rDK*");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DurationField durationField0 = copticChronology0.halfdays();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundFloor(1020L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeField0.roundFloor(1);
      assertEquals((-2692052372000L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      boolean boolean0 = dateTimeZone1.isStandardOffset(1);
      assertTrue(boolean0);
      assertEquals("+01:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      long long0 = dateTimeField0.roundCeiling(1);
      assertEquals(463701600000L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
      
      long long0 = dateTimeField0.roundFloor((-1982L));
      assertEquals((-2692052372000L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      long long0 = dateTimeField0.roundCeiling(331L);
      assertEquals(463701600000L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusMonths(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getShortName((long) 1);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      LocalDate localDate0 = LocalDate.now();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      long long0 = dateTimeField0.roundCeiling(331L);
      assertEquals(463701600000L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withYear(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(848);
      LocalDate localDate1 = localDate0.withCenturyOfEra(848);
      DateTime dateTime0 = localDate1.toDateTimeAtStartOfDay();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(2614498815600000L, dateTime0.getMillis());
      assertEquals(848, int0);
      assertEquals("+00:00:00.848", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      Date date0 = new Date(1847L);
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withYear(1);
      Locale locale0 = Locale.ITALY;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName(68L, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName((-215L), locale0);
      assertEquals("+01:01", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getShortName((-3599999L));
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      DateTime dateTime0 = new DateTime((-3599999L), (Chronology) copticChronology0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(9223372036854775807L);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(1);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusMonths(3600);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(12, 1, 12);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.plusMonths(12);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeField0.roundCeiling(331L);
      assertEquals(463701600000L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getShortName((long) 1);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      long long0 = dateTimeField0.roundCeiling(1);
      assertEquals(463701600000L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getName((long) 1, locale0);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.plusMonths(2);
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      DurationField durationField0 = copticChronology0.months();
      dateTimeZone0.getOffset((ReadableInstant) null);
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundFloor((-3599999L));
      assertEquals((-2692052372000L), long0);
  }
}
