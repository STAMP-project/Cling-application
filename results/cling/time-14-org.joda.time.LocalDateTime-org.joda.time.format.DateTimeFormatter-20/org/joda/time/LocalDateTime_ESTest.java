/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 21:04:09 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Partial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(12, 0, 2);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("yxrUQ9<0?U]RZe-").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      try { 
        LocalDateTime.parse("F", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"F\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = LocalDateTime.parse("1969-12-31T23:59:58.480");
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Days days0 = Days.days(1);
      LocalDateTime localDateTime1 = localDateTime0.withPeriodAdded(days0, 0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Minutes minutes0 = Minutes.MIN_VALUE;
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadablePeriod) minutes0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusYears(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusYears(2042);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Date date0 = new Date(0L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      LocalDateTime localDateTime1 = localDateTime0.withFieldAdded(durationFieldType0, 1);
      boolean boolean0 = localDateTime1.isAfter(localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalDateTime localDateTime1 = LocalDateTime.now((Chronology) gregorianChronology0);
      boolean boolean0 = localDateTime1.isAfter(localDateTime0);
      assertEquals(4, localDateTime1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(2147483054);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("G").when(dateTimeParser0).toString();
      doReturn(1233).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalDateTime localDateTime0 = LocalDateTime.parse("yearOfCentury", dateTimeFormatter0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Jan 01 00:00:00 CET 1970", date0.toString());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      String string0 = localDateTime0.toString();
      assertEquals("2019-08-13T23:02:26.877", string0);
      assertEquals(4, localDateTime0.size());
      
      LocalDateTime localDateTime1 = LocalDateTime.parse("2019-08-13T23:02:18.652");
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toString();
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withChronology(islamicChronology0);
      // Undeclared exception!
      try { 
        LocalDateTime.parse("2019-08-13T23:02:18.696", dateTimeFormatter1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"2019-08-13T23:02:18.696\" is malformed at \"T23:02:18.696\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.parse("2019-08-13T23:02:18.737");
      boolean boolean0 = localDateTime0.isSupported((DateTimeFieldType) null);
      assertFalse(boolean0);
  }
}
