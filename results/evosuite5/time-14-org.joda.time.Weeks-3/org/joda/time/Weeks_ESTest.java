/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:54:45 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.MutableInterval;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.THREE;
      boolean boolean0 = weeks0.isLessThan(weeks1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = weeks0.isLessThan((Weeks) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = weeks0.isLessThan((Weeks) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = weeks0.isLessThan(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.ZERO;
      boolean boolean0 = weeks0.isGreaterThan(weeks1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      boolean boolean0 = weeks0.isGreaterThan((Weeks) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = weeks0.isGreaterThan((Weeks) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = weeks0.isGreaterThan(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = weeks0.ONE.dividedBy(1);
      assertEquals(1, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = weeks0.TWO.dividedBy(7540);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Weeks weeks1 = weeks0.plus((Weeks) null);
      assertEquals(1, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      // Undeclared exception!
      try { 
        weeks0.plus(weeks0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = weeks0.minus(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      Weeks weeks1 = weeks0.minus((Weeks) null);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks("P");
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(3);
      assertEquals(3, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, weeks0);
      Weeks weeks1 = Weeks.weeksIn(mutableInterval0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Hours hours0 = weeks0.toStandardHours();
      assertEquals(336, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      String string0 = weeks0.MIN_VALUE.toString();
      assertEquals("P-2147483648W", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      // Undeclared exception!
      try { 
        weeks0.MIN_VALUE.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 604800
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      // Undeclared exception!
      try { 
        weeks0.toStandardDays();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 7
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      // Undeclared exception!
      try { 
        weeks0.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Weeks weeks0 = Weeks.standardWeeksIn((ReadablePeriod) null);
      int int0 = weeks0.getWeeks();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Weeks weeks0 = Weeks.standardWeeksIn(days0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      PeriodType periodType0 = weeks0.THREE.getPeriodType();
      assertEquals("Weeks", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      // Undeclared exception!
      try { 
        weeks0.MIN_VALUE.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 10080
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = weeks0.ONE.multipliedBy(2780);
      assertEquals(2780, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Instant instant0 = new Instant();
      Weeks weeks0 = Weeks.weeksBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Duration duration0 = weeks0.toStandardDuration();
      assertEquals(0L, duration0.getStandardSeconds());
  }
}
