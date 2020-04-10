/*

 * Tue Mar 03 17:50:22 GMT 2020
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
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfCentury();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-2682371971999L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((-857L), dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257807502L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("/{");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundHalfEven(4582L);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1590962400000L);
      assertFalse(boolean0);
      
      long long0 = dateTimeField0.add((-1174L), (-984));
      assertEquals((-31052675973174L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      String string0 = dateTimeZone0.getName(10800000L);
      assertEquals("+00:00:00.001", string0);
      
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-2682371971999L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName(343L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) copticChronology0);
      dateMidnight0.toLocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      String string0 = dateTimeZone0.getName((-3599999L));
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName(343L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(343L, true);
      assertEquals((-3599657L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      boolean boolean0 = dateTimeZone0.isStandardOffset((-3598L));
      assertTrue(boolean0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583190000000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Days days0 = Days.FOUR;
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) copticChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.plus((ReadablePeriod) days0);
      LocalDate localDate0 = dateMidnight1.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals(1583535600000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(1682);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      DateTimeField dateTimeField0 = copticChronology0.era();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(copticChronology0, dateTimeField0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(skipUndoDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(1);
      assertEquals(9223372036843975807L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.ENGLISH;
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+01:00", string0);
      
      DateTimeField dateTimeField0 = copticChronology0.year();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.set((-2771L), 2);
      assertEquals((-53142995974771L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      String string0 = dateTimeZone0.getName(10800000L);
      assertEquals("+00:00:00.001", string0);
      
      LocalDate localDate0 = new LocalDate(10800000L, dateTimeZone0);
      localDate0.minusWeeks(1);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.PRC;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Days days0 = Days.FOUR;
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) copticChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.plus((ReadablePeriod) days0);
      assertEquals(1583535600000L, dateMidnight1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.PRC;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }
}
