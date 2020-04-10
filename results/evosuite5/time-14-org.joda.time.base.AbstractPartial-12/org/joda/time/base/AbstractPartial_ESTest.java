/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:34:45 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPartial_ESTest extends AbstractPartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      String string0 = localDateTime0.toString((DateTimeFormatter) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      String string0 = localDateTime0.toString(dateTimeFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      boolean boolean0 = localDateTime0.isEqual(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.isEqual((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = localDateTime0.isEqual(localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) buddhistChronology0);
      LocalDate localDate1 = localDate0.withDayOfMonth(1);
      boolean boolean0 = localDate1.isBefore(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
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
  public void test07()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 1);
      boolean boolean0 = localTime1.isAfter(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      boolean boolean0 = localDateTime0.isAfter(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.isAfter((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = new LocalDate((Chronology) buddhistChronology0);
      int int0 = localDate0.compareTo((ReadablePartial) localDate1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = new LocalDate(localDateTime0, buddhistChronology0);
      LocalDate localDate1 = new LocalDate(1, 1, 1);
      boolean boolean0 = localDate0.isBefore(localDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) localTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        yearMonth0.isAfter(localDateTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      LocalDate localDate1 = LocalDate.now();
      boolean boolean0 = localDate0.equals(localDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalDate localDate0 = new LocalDate();
      boolean boolean0 = localDate0.equals(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Partial partial0 = new Partial(localDate0);
      boolean boolean0 = localDate0.equals(partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      Date date0 = localDateTime0.toDate();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      boolean boolean0 = localDate0.equals(date0);
      assertFalse(boolean0);
      assertEquals("Mon Feb 14 21:21:21 GMT 2557", date0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      MonthDay monthDay1 = monthDay0.plusDays(0);
      assertSame(monthDay0, monthDay1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Partial partial0 = new Partial();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      // Undeclared exception!
      try { 
        partial0.withFieldAdded(durationFieldType0, 73152320);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'days' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      // Undeclared exception!
      try { 
        yearMonth0.property(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'weekOfWeekyear' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) buddhistChronology0);
      String string0 = yearMonth0.toString("[Ka#");
      assertEquals("[\uFFFD\uFFFD#", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2557, 2, 14, 76881320}, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeField[] dateTimeFieldArray0 = localDate0.getFields();
      assertEquals(3, dateTimeFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = localDate0.getFieldTypes();
      assertEquals(3, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      String string0 = yearMonth0.toString();
      assertEquals("2014-02", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(1, 1);
      Partial partial0 = new Partial(yearMonth0);
      int int0 = yearMonth0.compareTo(partial0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime((ReadableInstant) null);
      assertEquals(18527862081320L, dateTime0.getMillis());
  }
}
