/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:29:33 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractReadableInstantFieldProperty_ESTest extends AbstractReadableInstantFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.minuteOfHour();
      LocalDateTime.Property localDateTime_Property1 = localDateTime0.minuteOfHour();
      boolean boolean0 = localDateTime_Property0.equals(localDateTime_Property1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withMillis(1072L);
      LocalTime localTime0 = new LocalTime(dateMidnight0);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      DateTime dateTime0 = dateMidnight1.toDateTime((Chronology) islamicChronology0);
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.minuteOfHour();
      boolean boolean0 = localDateTime_Property0.equals(localTime_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfDay();
      boolean boolean0 = localTime_Property0.equals(localDateTime_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.weekOfWeekyear();
      Object object0 = new Object();
      boolean boolean0 = localDate_Property0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withMillis(1072L);
      LocalTime localTime0 = new LocalTime(dateMidnight0);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      DateTime dateTime0 = dateMidnight1.toDateTime((Chronology) islamicChronology0);
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.minuteOfHour();
      boolean boolean0 = localDateTime_Property0.equals(localTime_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(93);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight1.yearOfCentury();
      int int0 = dateMidnight_Property0.compareTo((ReadablePartial) localDate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(128);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight1.weekOfWeekyear();
      int int0 = dateMidnight_Property0.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight((DateTimeZone) fixedDateTimeZone0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.weekOfWeekyear();
      // Undeclared exception!
      try { 
        dateMidnight_Property0.compareTo((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime_Property0.setCopy(76);
      int int0 = dateTime_Property0.compareTo((ReadableInstant) dateTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-216L));
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      int int0 = dateTime_Property0.compareTo((ReadableInstant) dateTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      // Undeclared exception!
      try { 
        dateTime_Property0.compareTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.weekOfWeekyear();
      int int0 = dateMidnight_Property0.compareTo((ReadableInstant) dateMidnight0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = LocalTime.parse("", dateTimeFormatter0);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      long long0 = localTime_Property0.getDifferenceAsLong((ReadableInstant) null);
      assertEquals((-1392409281L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1, dateTimeZone0);
      LocalTime localTime0 = new LocalTime(dateMidnight0);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      long long0 = localTime_Property0.getDifferenceAsLong(dateMidnight0);
      assertEquals(17259888L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      int int0 = dateMidnight_Property0.getDifference((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.monthOfYear();
      int int0 = dateMidnight_Property0.getDifference(dateMidnight0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.weekOfWeekyear();
      LocalDate localDate1 = localDate_Property0.withMinimumValue();
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-1L));
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      DurationField durationField0 = localTime_Property0.getRangeDurationField();
      assertEquals("hours", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      long long0 = dateTime_Property0.remainder();
      assertEquals(320L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      dateTime_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.monthOfYear();
      DurationField durationField0 = dateMidnight_Property0.getLeapDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) buddhistChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      Interval interval0 = localTime_Property0.toInterval();
      assertEquals(76881320L, interval0.getStartMillis());
      assertEquals(76881321L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekyear();
      int int0 = localDateTime_Property0.getMaximumValueOverall();
      assertEquals(292278993, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight(31083663600000L, (DateTimeZone) fixedDateTimeZone0);
      MutableDateTime mutableDateTime0 = dateMidnight0.toMutableDateTime((DateTimeZone) fixedDateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.property(dateTimeFieldType0);
      String string0 = mutableDateTime_Property0.getAsString();
      assertEquals("2955", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfSecond();
      String string0 = dateTime_Property0.getAsShortText();
      assertEquals("320", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      int int0 = localTime_Property0.getMaximumShortTextLength((Locale) null);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfDay();
      String string0 = localDateTime_Property0.getAsText();
      assertEquals("76881320", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfWeek();
      int int0 = dateMidnight_Property0.getMinimumValueOverall();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekOfWeekyear();
      DurationField durationField0 = localDateTime_Property0.getDurationField();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = DateMidnight.now((DateTimeZone) fixedDateTimeZone0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.weekOfWeekyear();
      Locale locale0 = Locale.GERMAN;
      int int0 = dateMidnight_Property0.getMaximumTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.weekOfWeekyear();
      int int0 = localDate_Property0.getLeapAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfYear();
      String string0 = dateMidnight_Property0.toString();
      assertEquals("Property[dayOfYear]", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      int int0 = localDateTime_Property0.compareTo((ReadablePartial) localDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.dayOfWeek();
      boolean boolean0 = localDate_Property0.isLeap();
      assertFalse(boolean0);
  }
}
