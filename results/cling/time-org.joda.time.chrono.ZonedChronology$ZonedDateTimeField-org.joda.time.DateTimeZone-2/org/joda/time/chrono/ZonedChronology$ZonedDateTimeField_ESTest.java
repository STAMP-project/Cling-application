/*

 * Tue Mar 03 17:48:08 GMT 2020
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJYearOfEraDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-2713735171999L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withDayOfWeek(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.JAPANESE;
      String string0 = fixedDateTimeZone0.getName((long) 638, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withDayOfWeek(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(100000000000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2255);
      long long0 = dateTimeZone0.adjustOffset(2255, false);
      assertEquals("+00:00:02.255", dateTimeZone0.toString());
      assertEquals(2255L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("+hX;\"k%f</{%Py}$W");
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(basicSingleEraDateTimeField0, ethiopicChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundFloor(1);
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName(9577216L, (Locale) null);
      assertEquals("+01:01", string0);
      
      long long0 = dateTimeField0.add((long) 1, 9577216L);
      assertEquals(302233952156400001L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset((-3599999L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000000000000000L);
      assertFalse(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(3601L, true);
      assertEquals((-3596399L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(100000000000L);
      assertTrue(boolean0);
      
      long long0 = dateTimeField0.addWrapField((long) 1, 638);
      assertEquals((-1956525571999L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000000000000000L);
      assertFalse(boolean0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-2713735171999L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      String string0 = dateTimeZone0.getName(1583189999972L);
      assertEquals("+00:00:00.001", string0);
      
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, gJChronology0);
      localDateTime0.minusMillis(22);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) 1, (Locale) null);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      long long0 = dateTimeField0.roundFloor(1583189999972L);
      assertEquals(1567980000000L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withDayOfWeek(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      String string0 = dateTimeZone0.getShortName((-61566481172000L));
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateMidnight dateMidnight0 = new DateMidnight((long) 1, (Chronology) copticChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.minusWeeks(1);
      assertEquals((-608400000L), dateMidnight1.getMillis());
      
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-2713735171999L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583257661744L, dateTime0.getMillis());
      
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, gJChronology0);
      localDateTime0.minusMillis(22);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusDays(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) 1, (Locale) null);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(494, 1);
      String string0 = dateTimeZone0.getName(1021L);
      assertEquals("+494:01", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-1778459999L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.isStandardOffset(1000000000000000L);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.withDayOfWeek(1);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((-9939600000L), (Chronology) copticChronology0);
      dateMidnight0.minusYears(1);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.minusDays(1);
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withDayOfWeek(1);
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.UK;
      String string0 = fixedDateTimeZone0.getName((long) 1, locale0);
      assertEquals("+00:00", string0);
      
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-2713735171999L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeField0.addWrapField((long) 1, 3266);
      assertEquals((-1072912771999L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(494, 1);
      String string0 = dateTimeZone0.getName(1021L);
      assertEquals("+494:01", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) 1, (Chronology) buddhistChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.minusWeeks(1);
      assertEquals((-608400000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }
}
