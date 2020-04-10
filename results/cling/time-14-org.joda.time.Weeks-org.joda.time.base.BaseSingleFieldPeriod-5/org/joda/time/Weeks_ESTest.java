/*

 * Tue Mar 03 17:23:38 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      LocalDate localDate0 = monthDay0.toLocalDate(1);
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Weeks weeks0 = Weeks.THREE;
      boolean boolean0 = weeks0.TWO.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = weeks0.minus(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Weeks weeks0 = Weeks.standardWeeksIn(hours0);
      Weeks weeks1 = weeks0.minus(401);
      assertEquals((-401), weeks1.getWeeks());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      boolean boolean0 = weeks0.ONE.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(3, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      int int0 = weeks0.MAX_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(3, weeks0.getWeeks());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      int int0 = weeks0.MIN_VALUE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeksIn(mutableInterval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      boolean boolean0 = weeks0.THREE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      Weeks weeks2 = Weeks.TWO;
      Weeks weeks3 = weeks0.plus(weeks2);
      assertSame(weeks3, weeks2);
      assertSame(weeks0, weeks1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Weeks weeks1 = Weeks.THREE;
      Weeks weeks2 = Weeks.standardWeeksIn(weeks1);
      assertSame(weeks2, weeks1);
      
      Weeks weeks3 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks3.getWeeks());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      int int0 = weeks0.MIN_VALUE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      MutablePeriod mutablePeriod0 = weeks0.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      boolean boolean0 = weeks0.ONE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("Tl2yU7");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Tl2yU7\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDate localDate0 = new LocalDate(86400000L, dateTimeZone0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
      assertEquals(1, weeks1.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      Weeks weeks2 = Weeks.ONE;
      Weeks weeks3 = weeks0.plus(weeks2);
      assertEquals(1, weeks3.size());
      assertSame(weeks0, weeks1);
      assertSame(weeks3, weeks2);
  }
}
