/*

 * Tue Mar 03 17:49:27 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
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
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.halfdayOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      long long0 = dateTimeField0.add((-3599488L), 10000L);
      assertEquals(431992800512L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = new Locale("IET", "IET");
      String string0 = dateTimeZone0.getName((-2296L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      String string0 = dateTimeZone0.getShortName(7742720L, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      dateTimeZone0.isStandardOffset(1);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(6886799125L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Denver");
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getRangeDurationField();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.add((long) 1, 1);
      assertEquals(31536000001L, long0);
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(gJMonthOfYearDateTimeField0, dateTimeZone0, durationField0, zonedChronology_ZonedDurationField0, durationField0);
      long long1 = zonedChronology_ZonedDateTimeField0.add(3740288L, 2071L);
      assertEquals(5028048140288L, long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(31083597720000L, false);
      assertEquals(31083597720000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.halfdayOfDay();
      long long0 = dateTimeField0.add(43200001L, 43200001L);
      assertEquals(1866240082800001L, long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Denver");
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      LocalDate localDate0 = new LocalDate((long) 1);
      LocalDate localDate1 = localDate0.plusMonths(1);
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      dateTimeZone0.getName((long) 1);
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.halfdayOfDay();
      long long0 = dateTimeField0.add((long) 1, 43200001L);
      assertEquals(1866240039600001L, long0);
      
      Locale locale0 = Locale.CHINA;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000000000000000000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTime dateTime0 = new DateTime(9223372036854775807L, (Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertEquals(9223372036854775807L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.isStandardOffset(43200001L);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.halfdays();
      durationField0.add(43200001L, 1);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(86400001L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.halfdays();
      durationField0.add((long) 1, 1);
      DateTime dateTime0 = new DateTime(1L, (Chronology) copticChronology0);
      LocalDate localDate0 = dateTime0.toLocalDate();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      LocalDate localDate0 = new LocalDate((long) 1);
      LocalDate localDate1 = localDate0.plusWeeks(1);
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+00:00", string0);
      
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      long long0 = dateTimeField0.add((-1198L), (-1198L));
      assertEquals((-37805440773198L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      dateTimeZone0.getName((long) 1);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(43200001L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDate.parse("7");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }
}
