/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:34:22 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPartial_ESTest extends AbstractPartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Partial partial0 = new Partial();
      String string0 = partial0.toString((DateTimeFormatter) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      boolean boolean0 = localDateTime0.isEqual(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        localDate0.isEqual((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMillis(1);
      boolean boolean0 = localDateTime0.isBefore(localDateTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        localDate0.isBefore((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      boolean boolean0 = localDateTime0.isBefore(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        localDate0.isAfter((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      LocalDate localDate1 = localDate0.withWeekyear(1);
      Partial partial0 = new Partial(localDate1);
      boolean boolean0 = partial0.isAfter(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Partial partial0 = new Partial(localDate0);
      LocalDate localDate1 = new LocalDate(0L);
      boolean boolean0 = partial0.isAfter(localDate1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        partial0.isAfter(localDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Partial partial0 = new Partial(localDate0);
      boolean boolean0 = partial0.isEqual(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.compareTo((ReadablePartial) localDateTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial();
      boolean boolean0 = partial0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      boolean boolean0 = localDate0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial(localDate0);
      boolean boolean0 = partial0.equals(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial(localDate0);
      LocalDate localDate1 = localDate0.withWeekyear((-3340));
      boolean boolean0 = partial0.equals(localDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Partial partial0 = new Partial();
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      // Undeclared exception!
      try { 
        partial0.withFieldAdded(durationFieldType0, 387);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'eras' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial(localDate0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      String string0 = partial0.toString(dateTimeFormatter0);
      assertEquals("2014-02-14", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      boolean boolean0 = partial0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2014, 2, 14, 76881320}, intArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeField[] dateTimeFieldArray0 = localDate0.getFields();
      assertEquals(3, dateTimeFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = localDate0.getFieldTypes();
      assertEquals(3, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) buddhistChronology0);
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime(yearMonth0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfMonth' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.plusDays(1);
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      DateTime dateTime0 = new DateTime((long) 1, (Chronology) islamicChronology0);
      DateTime dateTime1 = localDateTime0.toDateTime(dateTime0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }
}
