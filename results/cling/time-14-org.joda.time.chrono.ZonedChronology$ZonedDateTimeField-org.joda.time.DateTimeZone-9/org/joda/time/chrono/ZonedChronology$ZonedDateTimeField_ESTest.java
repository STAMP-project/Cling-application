/*

 * Tue Mar 03 17:49:02 GMT 2020
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
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.isStandardOffset(1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(43200000L, false);
      assertEquals(43200000L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1968L);
      assertEquals(1968L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("PacWNifc/Apia");
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundHalfFloor(3600000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.monthOfYear();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+00:00:00.001", string0);
      
      long long0 = dateTimeField0.add((-853L), (long) (-851));
      assertEquals((-2064611972853L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      long long0 = zonedChronology_ZonedDateTimeField0.add((-1715L), (-1715L));
      assertEquals((-54120179973715L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:01", string0);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withUTC();
      LocalDate localDate0 = new LocalDate((long) 1, chronology0);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.monthOfYear();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) 1);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      long long0 = dateTimeField0.add(3410L, 3410L);
      assertEquals(8278498803410L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = Locale.ITALY;
      dateTimeZone0.getShortName((long) 1, locale0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.plusYears(1);
      assertEquals(1614726000000L, dateMidnight1.getMillis());
      
      DateMidnight dateMidnight2 = dateMidnight0.withYearOfEra(1);
      assertEquals((-62130327572000L), dateMidnight2.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 52, dateTimeZone1);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals(3660000, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getOffset((ReadableInstant) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) fixedDateTimeZone0);
      fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) fixedDateTimeZone0);
      fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      dateTimeZone0.getName(24L, locale0);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      LocalDate localDate1 = localDate0.plusWeeks(1);
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone1.getName(816L);
      assertEquals("+01:01", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      Locale locale0 = Locale.ITALY;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getOffset((ReadableInstant) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals((-3659999L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      localTime0.withMillisOfDay(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((long) 1, (Chronology) copticChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight2 = dateMidnight1.withZoneRetainFields(dateTimeZone0);
      assertNotSame(dateMidnight2, dateMidnight1);
      assertEquals((-31539600000L), dateMidnight2.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      LocalDateTime.now();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.plusDays(30);
      assertEquals(1585778400000L, dateMidnight1.getMillis());
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.withMillisOfDay(1);
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicWeekyearDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      Locale locale0 = Locale.CANADA_FRENCH;
      String string0 = dateTimeZone0.getName(1L, locale0);
      assertEquals("+01:00", string0);
      
      long long0 = zonedChronology_ZonedDateTimeField0.set((long) 1, 1470);
      assertEquals((-6816093571999L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.monthOfYear();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ITALY;
      String string0 = fixedDateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+00:00", string0);
      
      long long0 = dateTimeField0.add(3410L, 3410L);
      assertEquals(8278498803410L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName(816L);
      assertEquals("+01:01", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.plusDays(30);
      assertEquals(1585778400000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.monthOfYear();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals(3660000, int0);
      
      long long0 = dateTimeField0.add((-1767L), (-855L));
      assertEquals((-2074979973767L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.halfdayOfDay();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      assertEquals(1172000, int0);
      
      long long0 = dateTimeField0.add((long) 1, (long) 1172000);
      assertEquals(50630396400001L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      Locale locale0 = Locale.CANADA_FRENCH;
      String string0 = dateTimeZone0.getName(5969792L, locale0);
      assertEquals("+01:00", string0);
  }
}
