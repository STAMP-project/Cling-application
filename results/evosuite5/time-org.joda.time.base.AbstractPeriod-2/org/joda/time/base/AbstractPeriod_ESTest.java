/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:04:09 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-4033), (-4033), 1006, 91);
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("PT-4033H-4033M1006.091S", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      String string0 = mutablePeriod0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(29, 90, 0, 1810);
      mutablePeriod0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period0 = new Period(2794L, 2794L, periodType0);
      Months months0 = Months.TWELVE;
      boolean boolean0 = period0.equals(months0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      MutablePeriod mutablePeriod1 = periodFormatter0.parseMutablePeriod("");
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Years years0 = Years.ONE;
      PeriodType periodType0 = years0.getPeriodType();
      Period period0 = new Period(1006, 2794L, periodType0);
      Minutes minutes0 = hours0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      boolean boolean0 = period0.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      boolean boolean0 = mutablePeriod0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.days(44);
      Hours hours0 = Hours.SEVEN;
      boolean boolean0 = period0.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Weeks weeks0 = hours0.toStandardWeeks();
      Months months0 = Months.MAX_VALUE;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      Hours hours1 = weeks0.toStandardHours();
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod(hours1, periodType0);
      int int0 = mutablePeriod0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(91, 91, 91, (-4033), (-4033), 1006, (-4033), 91);
      DurationFieldType[] durationFieldTypeArray0 = mutablePeriod0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      boolean boolean0 = mutablePeriod0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("", periodFormatter0);
      assertNotNull(mutablePeriod0);
  }
}
