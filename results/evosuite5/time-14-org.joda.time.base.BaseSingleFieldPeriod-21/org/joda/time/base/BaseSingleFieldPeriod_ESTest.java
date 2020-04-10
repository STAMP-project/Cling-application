/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:22:06 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Years years0 = Years.yearsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Years years1 = Years.ONE;
      int int0 = years0.compareTo((BaseSingleFieldPeriod) years1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      Years years1 = Years.THREE;
      int int0 = years1.compareTo((BaseSingleFieldPeriod) years0);
      assertEquals(3, years1.getYears());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Weeks weeks0 = Weeks.MAX_VALUE;
      // Undeclared exception!
      try { 
        days0.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Days cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Years years0 = Years.MIN_VALUE;
      boolean boolean0 = weeks0.equals(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      YearMonth yearMonth0 = new YearMonth();
      boolean boolean0 = years0.equals(yearMonth0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Years years0 = Years.ONE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(years0);
      boolean boolean0 = years0.equals(mutablePeriod0);
      assertTrue(boolean0);
      assertEquals(1, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = Years.ONE;
      boolean boolean0 = years0.equals(years1);
      assertEquals(1, years1.getYears());
      assertFalse(boolean0);
      assertFalse(years1.equals((Object)years0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.FIVE;
      DurationFieldType durationFieldType0 = days0.getFieldType();
      boolean boolean0 = days0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      boolean boolean0 = days0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.SEVEN;
      DurationFieldType durationFieldType0 = days0.getFieldType();
      int int0 = days0.get(durationFieldType0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      int int0 = hours0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      // Undeclared exception!
      try { 
        years0.getValue(1403);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 1403
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      // Undeclared exception!
      try { 
        days0.getFieldType((-220));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -220
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Months months0 = Months.NINE;
      // Undeclared exception!
      try { 
        Seconds.standardSecondsIn(months0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as months is not precise in the period P9M
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Years years0 = Years.ZERO;
      assertEquals(0, years0.getYears());
      
      Hours hours0 = Hours.standardHoursIn(years0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.standardWeeksIn((ReadablePeriod) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Weeks weeks0 = Weeks.standardWeeksIn(hours0);
      assertEquals(8, hours0.getHours());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadablePartial) localDate0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadablePartial) localDateTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      Days days0 = Days.daysBetween((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadableInstant) dateTime0, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Years years0 = Years.years((-1074));
      assertEquals((-1074), years0.getYears());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Years years0 = Years.ONE;
      years0.toMutablePeriod();
      assertEquals(1, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Months months0 = Months.ELEVEN;
      months0.toPeriod();
      assertEquals(11, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      days0.hashCode();
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Years years0 = Years.yearsBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      int int0 = years0.compareTo((BaseSingleFieldPeriod) years0);
      assertEquals(0, int0);
      assertEquals(0, years0.getYears());
  }
}
