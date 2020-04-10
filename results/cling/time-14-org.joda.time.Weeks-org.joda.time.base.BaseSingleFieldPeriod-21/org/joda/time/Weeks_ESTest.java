/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 23:51:44 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1000000000000L, 1000000000000L);
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks0.getWeeks());
      
      Weeks weeks1 = Weeks.MAX_VALUE;
      Weeks weeks2 = Weeks.standardWeeksIn(weeks1);
      assertSame(weeks2, weeks1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1000000000000L, 1000000000000L);
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
      assertEquals(1, weeks1.size());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) islamicChronology0);
      Weeks weeks2 = Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertSame(weeks2, weeks0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1000000000000L, 1000000000000L);
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.TWO;
      Weeks weeks3 = Weeks.standardWeeksIn(weeks2);
      assertSame(weeks3, weeks2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.ONE;
      Weeks weeks2 = Weeks.standardWeeksIn(weeks1);
      assertSame(weeks2, weeks1);
      
      Weeks weeks3 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks3.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1000000000000L, 1000000000000L);
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.MAX_VALUE;
      Weeks weeks3 = weeks2.dividedBy((-611));
      assertEquals((-3514703), weeks3.getWeeks());
      assertEquals(1, weeks3.size());
      assertEquals(Integer.MAX_VALUE, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.weeks(3);
      assertEquals(3, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks2.getWeeks());
      assertEquals(1, weeks2.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Weeks weeks1 = Weeks.weeks(10125000);
      int int0 = weeks1.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(10125000, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = Seconds.ZERO;
      // Undeclared exception!
      try { 
        weeks0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) seconds0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Weeks cannot be compared to class org.joda.time.Seconds
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      int int0 = weeks0.THREE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals((-1), int0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.ONE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(0, int0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = weeks0.minus(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
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
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("yyyy-MM-dd'T'HH:mm:ss.SSS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"yyyy-MM-dd'T'HH:mm:ss.SSS\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.ONE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      boolean boolean0 = weeks0.MIN_VALUE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = weeks0.plus((-368));
      Hours hours0 = weeks1.toStandardHours();
      Weeks weeks2 = hours0.toStandardWeeks();
      boolean boolean0 = weeks2.equals(weeks1);
      assertEquals(0, weeks0.getWeeks());
      assertTrue(boolean0);
      assertFalse(weeks2.equals((Object)weeks0));
      assertEquals((-368), weeks2.getWeeks());
      assertFalse(weeks0.equals((Object)weeks2));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.ONE;
      boolean boolean0 = weeks0.equals(weeks1);
      assertEquals(1, weeks1.getWeeks());
      assertFalse(boolean0);
      assertEquals(0, weeks0.getWeeks());
      assertFalse(weeks1.equals((Object)weeks0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Minutes minutes0 = weeks0.toStandardMinutes();
      boolean boolean0 = weeks0.TWO.equals(minutes0);
      assertEquals(10080, minutes0.getMinutes());
      assertFalse(boolean0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      boolean boolean0 = weeks0.MIN_VALUE.equals((Object) null);
      assertFalse(boolean0);
  }
}
