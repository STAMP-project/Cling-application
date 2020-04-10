/*

 * Tue Mar 03 17:25:44 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1);
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDateTime0);
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
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = Seconds.ONE;
      boolean boolean0 = weeks0.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Weeks weeks1 = Weeks.ZERO;
      Weeks weeks2 = weeks0.plus(weeks1);
      assertEquals(1, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Weeks weeks0 = Weeks.standardWeeksIn(hours0);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(8, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Weeks weeks1 = Weeks.MIN_VALUE;
      int int0 = weeks1.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, weeks0.getWeeks());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.days(306783378);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      assertEquals(43826196, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      boolean boolean0 = weeks0.TWO.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      int int0 = weeks0.THREE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      int int0 = weeks0.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(0, int0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((DateTime) null).when(readableInterval0).getEnd();
      doReturn((DateTime) null).when(readableInterval0).getStart();
      // Undeclared exception!
      try { 
        Weeks.weeksIn(readableInterval0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      boolean boolean0 = weeks0.ZERO.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      MutablePeriod mutablePeriod0 = weeks0.TWO.toMutablePeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(mutablePeriod0);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
      assertEquals(2, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Seconds seconds0 = Seconds.standardSecondsIn(weeks0);
      assertEquals(0, seconds0.getSeconds());
      
      Weeks weeks1 = Weeks.THREE;
      Weeks weeks2 = weeks0.plus(weeks1);
      assertSame(weeks2, weeks1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      int int0 = weeks0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      boolean boolean0 = weeks0.THREE.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("ReadableInstant objects must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ReadableInstant objects must not...\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Chronology) null);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(569L);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Period period0 = weeks0.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertSame(weeks1, weeks0);
  }
}
