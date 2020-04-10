/*

 * Tue Mar 03 17:48:30 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ROOT;
      fixedDateTimeZone0.getName(228L, locale0);
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.isStandardOffset((-61216L));
      LocalDate localDate0 = new LocalDate(0L);
      LocalDate localDate1 = localDate0.withWeekyear(1);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(20);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+00:00:00.020", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1406));
      long long0 = dateTimeZone0.adjustOffset(1, true);
      assertEquals("-00:00:01.406", dateTimeZone0.toString());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 408);
      assertEquals((-3599592L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("+01:00");
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundFloor(8250112L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:01", string0);
      
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      localDate0.withCenturyOfEra(17);
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName((long) 1970);
      LocalDate localDate0 = new LocalDate(725L);
      LocalDate localDate1 = localDate0.plusWeeks(1970);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset((ReadableInstant) null);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.minusDays(16);
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      LocalDate localDate0 = new LocalDate((Object) null);
      LocalDate localDate1 = localDate0.minusDays(1);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      LocalDate.now(dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583189940000L, dateMidnight0.getMillis());
      assertEquals("+01:01", dateTimeZone0.getID());
      assertEquals(3660000, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.set((-19786202372627L), 1970);
      assertEquals((-627L), long0);
      
      String string0 = dateTimeZone0.getShortName((long) 1970);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      boolean boolean0 = dateTimeZone0.isStandardOffset((-61216L));
      assertTrue(boolean0);
      
      LocalDate localDate0 = new LocalDate(0L);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals((-3600000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(3025443590290799988L);
      assertFalse(boolean0);
      
      LocalDate localDate0 = new LocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      dateMidnight0.minusDays(2);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.minusDays(2147172823);
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.add((-627L), (-627L));
      assertEquals((-19786202372627L), long0);
      
      String string0 = dateTimeZone0.getShortName((long) 1970);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:01", string0);
      
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      LocalDate localDate0 = new LocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset((ReadableInstant) null);
      LocalDate localDate0 = new LocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add(4087L, 4087L);
      assertEquals(9922086004087L, long0);
  }
}
