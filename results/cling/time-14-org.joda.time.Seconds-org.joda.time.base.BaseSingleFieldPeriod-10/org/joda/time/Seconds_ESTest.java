/*

 * Tue Mar 03 16:47:27 GMT 2020
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
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Object object0 = new Object();
      boolean boolean0 = seconds0.ZERO.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.ZERO;
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds2, seconds0);
      
      Seconds seconds3 = Seconds.standardSecondsIn(seconds1);
      assertEquals(0, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.MAX_VALUE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = seconds0.TWO.plus(6538);
      assertEquals(6540, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds2.getSeconds());
      assertEquals(1, seconds2.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1L, 1L);
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      boolean boolean0 = seconds0.ZERO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = LocalTime.parse("", dateTimeFormatter0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(1, seconds1.size());
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      Days days0 = seconds0.toStandardDays();
      Seconds.standardSecondsIn(days0);
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
  @Ignore
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Days days0 = Days.daysBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Seconds seconds1 = days0.toStandardSeconds();
      Seconds.standardSecondsIn(seconds1);
      assertEquals(1583254033138L, mutableDateTime0.getMillis());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds0, seconds2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Weeks weeks0 = seconds0.toStandardWeeks();
      Seconds seconds1 = Seconds.standardSecondsIn(weeks0);
      Seconds seconds2 = seconds1.plus(3);
      Seconds seconds3 = seconds2.minus(seconds0);
      assertEquals(1, seconds3.size());
      assertEquals(0, weeks0.getWeeks());
      assertEquals(1, seconds3.getSeconds());
      assertEquals(3, seconds2.getSeconds());
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds1.equals(seconds0);
      assertFalse(seconds0.equals((Object)seconds1));
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      MutablePeriod mutablePeriod0 = seconds0.TWO.toMutablePeriod();
      boolean boolean0 = seconds0.MIN_VALUE.equals(mutablePeriod0);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
      assertFalse(boolean0);
      assertEquals(1, seconds0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.ONE.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(1, int0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(Integer.MIN_VALUE, seconds0.getSeconds());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("lT=YrP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"lT=YrP\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}
