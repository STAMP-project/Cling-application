/*

 * Tue Mar 03 17:26:18 GMT 2020
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
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(2043L);
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
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Hours hours0 = Hours.FOUR;
      boolean boolean0 = weeks0.TWO.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Weeks weeks0 = Weeks.weeksBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      weeks0.minus(0);
      assertEquals(1583256367038L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Weeks weeks0 = Weeks.standardWeeksIn(hours0);
      assertEquals(0, weeks0.getWeeks());
      assertEquals(4, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.THREE;
      int int0 = weeks1.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(3, weeks1.getWeeks());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period(1313, 1313, 1313, 1313);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      assertEquals(7, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      boolean boolean0 = weeks0.ZERO.equals(weeks0);
      assertFalse(boolean0);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      int int0 = weeks0.THREE.compareTo((BaseSingleFieldPeriod) weeks0);
      assertEquals(1, int0);
      assertEquals(0, weeks0.getWeeks());
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
      Weeks weeks0 = Weeks.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      boolean boolean0 = weeks0.THREE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
      
      Weeks weeks2 = Weeks.weeks(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, weeks2.getWeeks());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Period period0 = weeks0.TWO.toPeriod();
      Weeks weeks1 = Weeks.standardWeeksIn(period0);
      assertEquals(2, weeks1.getWeeks());
      assertEquals(3, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Weeks weeks0 = Weeks.weeksBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      weeks1.plus(3);
      assertEquals(1583256364977L, mutableDateTime0.getMillis());
      assertSame(weeks0, weeks1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = weeks0.MIN_VALUE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Object object0 = new Object();
      boolean boolean0 = weeks0.THREE.equals(object0);
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
        Weeks.parseWeeks("nCE9536F5`(!}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"nCE9536F5`(!}\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertEquals(1, weeks1.size());
      assertEquals(0, weeks1.getWeeks());
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      Weeks weeks2 = Weeks.weeksBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      assertSame(weeks2, weeks0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Weeks weeks1 = Weeks.ONE;
      Weeks weeks2 = weeks0.TWO.minus(weeks1);
      assertSame(weeks2, weeks1);
      
      Weeks weeks3 = Weeks.standardWeeksIn(weeks0);
      assertEquals(0, weeks3.getWeeks());
      assertEquals(1, weeks3.size());
  }
}
