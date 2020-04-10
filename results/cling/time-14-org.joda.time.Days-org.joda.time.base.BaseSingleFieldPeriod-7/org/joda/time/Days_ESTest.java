/*

 * Tue Mar 03 17:06:50 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      boolean boolean0 = days0.FOUR.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.days(2);
      assertEquals(2, days2.getDays());
      assertEquals(1, days2.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(753).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("D");
      Days days0 = Days.daysBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Days days1 = Days.standardDaysIn(days0);
      Days days2 = days0.plus(3);
      assertEquals(1, days2.size());
      assertEquals(3, days2.getDays());
      assertSame(days0, days1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Days days0 = Days.daysBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Weeks.standardWeeksIn(days0);
      assertEquals(1583255194286L, dateTime0.getMillis());
      
      Days days1 = Days.days(6);
      assertEquals(6, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(0, days1.getDays());
      
      Days days2 = Days.days(5);
      assertEquals(5, days2.getDays());
      assertEquals(1, days2.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.THREE;
      int int0 = days0.TWO.compareTo((BaseSingleFieldPeriod) days1);
      assertEquals((-1), int0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SIX;
      int int0 = days0.SIX.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(0, int0);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      int int0 = days0.TWO.compareTo((BaseSingleFieldPeriod) days0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      int int0 = days0.TWO.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(41, 41, 41, (-3274));
      Days days0 = Days.standardDaysIn(mutablePeriod0);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.ONE;
      boolean boolean0 = days0.FOUR.equals(days0);
      assertEquals(1, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Days days1 = Days.standardDaysIn(mutablePeriod0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Days days0 = Days.standardDaysIn(hours0);
      boolean boolean0 = days0.MAX_VALUE.equals(hours0);
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
      assertEquals(1, days0.size());
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(753).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("D");
      Days days0 = Days.daysBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Days days1 = days0.plus(604800);
      assertEquals(0, days0.getDays());
      assertEquals(604800, days1.getDays());
  }
}
