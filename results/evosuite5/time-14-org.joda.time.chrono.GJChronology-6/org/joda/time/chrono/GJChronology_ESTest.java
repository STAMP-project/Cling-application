/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:59:03 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = Period.years(4);
      long long0 = gJChronology0.add((ReadablePeriod) period0, (-62041161599999L), 4);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-61536239999999L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = Period.years((-5077));
      long long0 = gJChronology0.add((ReadablePeriod) period0, (long) (-5077), (-5077));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(813409754227194923L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((-62032852555996L), (-1495L), gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((-4270), (-62041161600000L), gJChronology0);
      long long0 = gJChronology0.add((ReadablePeriod) period0, (-62041161600000L), (-4270));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(264852901159699100L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = new Period(1392409281320L, (-12219638400031L), gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.minusMonths(1);
      assertEquals(1, monthDay1.getMonthOfYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(14, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) gJChronology0);
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((-1246L), (Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.withMonthOfYear(2);
      assertEquals(28, monthDay1.getDayOfMonth());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((-12219638400000L));
      // Undeclared exception!
      try { 
        gJChronology0.set(localDate0, (-12219638400000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 11 for dayOfMonth is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((-12219638400031L));
      // Undeclared exception!
      try { 
        gJChronology0.set(localDate0, (-12219638400031L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 11 for dayOfMonth is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(4, 4, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((long) (-4262), (Chronology) gJChronology0);
      Period period0 = new Period();
      YearMonth yearMonth1 = yearMonth0.withPeriodAdded(period0, (-4262));
      assertEquals(1, yearMonth1.getMonthOfYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (-476L), 4);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC,cutover=1969-12-31T23:59:59.524Z]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(4, 4, 4, 4, 4, 4, 4);
      assertEquals((-62033026527996L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 29, 2, 29, 2, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 35, 2, 35, 2, 35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 35 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis((-309), (-309), (-309), (-309), (-309), (-309), (-309));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -309 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(4, 4, 4, 4);
      assertEquals((-62033041171996L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(2190, 7, 7, 2190);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(6958735202190L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertNotSame(gJChronology1, gJChronology0);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (-60430665600000L), 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC,cutover=0055-01-11,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (-12219292800000L), 1189);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1189
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Months months0 = Months.TWO;
      long long0 = gJChronology0.add((ReadablePeriod) months0, (long) (-4916), (-4916));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-25855113604916L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((long) (-4260), (-4260), (-4260), (-4260), (-4260));
      assertEquals((-15682264260L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.plusDays(1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(15, monthDay1.getDayOfMonth());
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(gJChronology0);
      LocalDateTime localDateTime0 = new LocalDateTime(3600000L, (Chronology) strictChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(3600000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Integer integer0 = new Integer((-53));
      gJChronology0.equals(integer0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      gJChronology0.hashCode();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = new Period((-263105928601204269L), (-12219292800000L), gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gJChronology0.assemble(assembledChronology_Fields0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 557, gJChronology0);
      assertEquals(1, partial0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.julianToGregorianByWeekyear(3596440L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-1206003560L), long0);
  }
}
