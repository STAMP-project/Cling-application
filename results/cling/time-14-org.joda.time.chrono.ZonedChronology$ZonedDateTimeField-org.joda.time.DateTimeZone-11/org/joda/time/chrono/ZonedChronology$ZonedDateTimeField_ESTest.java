/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:57:20 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJEraDateTimeField;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset((ReadableInstant) null);
      long long0 = dateTimeZone0.convertLocalToUTC(5706624L, true);
      assertEquals(2106624L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      long long0 = fixedDateTimeZone0.convertLocalToUTC(10800000L, true);
      assertEquals(10800000L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight(dateTimeZone0);
      assertEquals(1565647200000L, dateMidnight0.getMillis());
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 1, (-93));
      assertEquals((-2934746371999L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.withWeekyear(1);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName(5097600000L);
      assertEquals("+01:00", string0);
      
      DurationField durationField0 = copticChronology0.years();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(1553993999999L);
      assertEquals(1553994000000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTime dateTime0 = new DateTime((long) 0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(0L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundFloor((-62135597972000L));
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1900L, true);
      assertEquals((-3598100L), long0);
      
      String string0 = dateTimeZone0.getName((-3598100L), (Locale) null);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1903L, false);
      assertEquals((-3598097L), long0);
      
      String string0 = dateTimeZone0.getShortName(30617280288L);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2696);
      String string0 = dateTimeZone0.getName(1301L, locale0);
      assertEquals("+00:00:02.696", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(1150L, true);
      assertEquals((-1546L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset((ReadableInstant) null);
      long long0 = dateTimeZone0.convertLocalToUTC(604800L, true);
      assertEquals((-2995200L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1903L, false);
      assertEquals((-3598097L), long0);
      
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1565647200000L, dateMidnight0.getMillis());
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(672);
      assertEquals((-19640621972000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      LocalDate localDate0 = LocalDate.now();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1565647200000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1903L, false);
      assertEquals((-3598097L), long0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(1903L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getShortName(3608989L);
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusHours((-2609));
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2696);
      String string0 = dateTimeZone0.getName(1275L, locale0);
      assertEquals("+00:00:02.696", string0);
      
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      localDate0.minusDays(1507);
      assertEquals("+00:00:02.696", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      dateMidnight0.toLocalDate();
      fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = LocalDate.now();
      localDate0.withMonthOfYear(1);
      String string0 = dateTimeZone0.getName(262038272L, (Locale) null);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.minusYears(1);
      DateMidnight dateMidnight0 = localDate1.toDateMidnight();
      assertEquals(1534111200000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      dateTimeZone0.isStandardOffset(28173056L);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(1094L);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2714);
      String string0 = dateTimeZone0.getName(1275L, locale0);
      assertEquals("+00:00:02.714", string0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyear();
      long long0 = dateTimeField0.set(1275L, 45);
      assertEquals((-51785997570725L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(7200000, int0);
      
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      LocalDate localDate1 = localDate0.withMonthOfYear(1);
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getName(428401280L, (Locale) null);
      assertEquals("+01:00", string0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyear();
      long long0 = dateTimeField0.roundFloor(10000000000000000L);
      assertEquals(9999993970800000L, long0);
  }
}
