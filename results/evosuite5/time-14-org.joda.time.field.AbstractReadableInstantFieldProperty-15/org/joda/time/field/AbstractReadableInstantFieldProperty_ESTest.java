/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:29:46 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractReadableInstantFieldProperty_ESTest extends AbstractReadableInstantFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekyear();
      LocalDateTime.Property localDateTime_Property1 = localDateTime0.weekyear();
      boolean boolean0 = localDateTime_Property1.equals(localDateTime_Property0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.year();
      LocalDateTime.Property localDateTime_Property1 = localDateTime0.yearOfEra();
      boolean boolean0 = localDateTime_Property1.equals(localDateTime_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekOfWeekyear();
      LocalDateTime.Property localDateTime_Property1 = localDateTime0.secondOfMinute();
      boolean boolean0 = localDateTime_Property1.equals(localDateTime_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      boolean boolean0 = localDateTime_Property0.equals(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekyear();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.weekyear();
      boolean boolean0 = localDateTime_Property0.equals(dateMidnight_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(355, "");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(mockGregorianCalendar0);
      LocalDate localDate1 = localDate0.plusYears(355);
      LocalDate.Property localDate_Property0 = localDate1.centuryOfEra();
      int int0 = localDate_Property0.compareTo((ReadablePartial) localDate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      int int0 = localDate_Property0.compareTo((ReadablePartial) localDate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfWeek();
      // Undeclared exception!
      try { 
        localDate_Property0.compareTo((ReadablePartial) null);
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
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDate localDate0 = new LocalDate((long) 1);
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      int int0 = localDate_Property0.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfSecond();
      DateTime dateTime0 = new DateTime(30585600000L);
      int int0 = localDateTime_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfYear();
      int int0 = dateMidnight_Property0.compareTo((ReadableInstant) dateMidnight0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfYear();
      // Undeclared exception!
      try { 
        dateMidnight_Property0.compareTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      DateTime dateTime0 = new DateTime();
      int int0 = localDateTime_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfWeek();
      long long0 = dateMidnight_Property0.getDifferenceAsLong((ReadableInstant) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfYear();
      long long0 = dateMidnight_Property0.getDifferenceAsLong(dateMidnight0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.year();
      int int0 = dateMidnight_Property0.getDifference((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.year();
      int int0 = dateMidnight_Property0.getDifference(dateMidnight0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      LocalDateTime localDateTime1 = localDateTime_Property0.withMinimumValue();
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfYear();
      DurationField durationField0 = dateMidnight_Property0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      long long0 = localDate_Property0.remainder();
      assertEquals((-1763424000000L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      localDateTime_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.year();
      DurationField durationField0 = dateMidnight_Property0.getLeapDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfWeek();
      Interval interval0 = localDate_Property0.toInterval();
      assertEquals(1392336000000L, interval0.getStartMillis());
      assertEquals(1392422400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfYear();
      int int0 = dateMidnight_Property0.getMaximumValueOverall();
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfYear();
      String string0 = localDate_Property0.getAsShortText();
      assertEquals("45", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      int int0 = localDate_Property0.getMaximumShortTextLength((Locale) null);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      String string0 = mutableDateTime_Property0.getAsText();
      assertEquals("76881", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.yearOfEra();
      int int0 = dateMidnight_Property0.getMinimumValueOverall();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      DurationField durationField0 = localDateTime_Property0.getDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.year();
      Locale locale0 = Locale.CHINA;
      int int0 = dateMidnight_Property0.getMaximumTextLength(locale0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      int int0 = localDate_Property0.getLeapAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) julianChronology0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfWeek();
      String string0 = dateMidnight_Property0.toString();
      assertEquals("Property[dayOfWeek]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      String string0 = mutableDateTime_Property0.getAsString();
      assertEquals("76881", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfYear();
      boolean boolean0 = dateTime_Property0.isLeap();
      assertFalse(boolean0);
  }
}
