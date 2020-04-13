/*

 * Tue Mar 03 17:48:45 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC(3740544L, false);
      assertEquals(80544L, long0);
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals("+01:01", dateTimeZone0.getID());
      assertEquals((-3659999L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusYears(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset((-365L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.adjustOffset(292, false);
      assertEquals(292L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1, 1, 1);
      copticChronology0.get((ReadablePeriod) mutablePeriod0, 3604096L, 3118611599999L);
      Date date0 = new Date(3118611599000L);
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      LocalDate localDate1 = localDate0.minusWeeks(1);
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-4818L));
      assertEquals((-3604818L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1);
      int[] intArray0 = copticChronology0.get((ReadablePeriod) mutablePeriod0, (long) 1, 3118611599999L);
      assertArrayEquals(new int[] {98, 10, 3, 4, 1, 59, 59, 998}, intArray0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((-2521L), true);
      assertEquals((-3602521L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+00:00:00.001", string0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(10800000L, true);
      assertEquals(10799999L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      boolean boolean0 = dateTimeZone0.isStandardOffset(795L);
      assertTrue(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(4097L, true);
      assertEquals((-3595903L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset((-365L));
      assertTrue(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((-365L), true);
      assertEquals((-3600365L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2145434521));
      Locale locale0 = Locale.US;
      dateTimeZone0.getName((long) (-2145434521), locale0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(21859200000L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.JAPAN;
      String string0 = fixedDateTimeZone0.getName((-730L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      long long0 = fixedDateTimeZone0.convertLocalToUTC(31449600000L, true);
      assertEquals(31449600000L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1);
      int[] intArray0 = copticChronology0.get((ReadablePeriod) mutablePeriod0, 3604096L, 3118611599999L);
      assertArrayEquals(new int[] {98, 10, 3, 4, 0, 59, 55, 903}, intArray0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1073741824, true);
      assertEquals(1070141824L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.withDayOfYear(1);
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getShortName((long) 1);
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.minusYears(665);
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 1);
      localDate0.minusYears(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(2340L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone1.getName((-3599999L), locale0);
      assertEquals("+00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      String string0 = dateTimeZone0.getShortName((-3599999L));
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1);
      copticChronology0.get((ReadablePeriod) mutablePeriod0, 3604096L, 3118611599999L);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      LocalDate localDate0 = dateMidnight0.toLocalDate();
      localDate0.minusWeeks(1);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1, 1, 1);
      int[] intArray0 = copticChronology0.get((ReadablePeriod) mutablePeriod0, 578L, 3118611599999L);
      assertArrayEquals(new int[] {98, 10, 3, 4, 1, 59, 59, 421}, intArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone1.convertLocalToUTC(18399604097L, false);
      assertEquals(18399604096L, long0);
      assertEquals("+00:00:00.001", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getName((-3599999L), locale0);
      assertEquals("+00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1);
      int[] intArray0 = copticChronology0.get((ReadablePeriod) mutablePeriod0, (long) 1, 3118611599999L);
      assertArrayEquals(new int[] {98, 10, 3, 4, 1, 59, 59, 998}, intArray0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(19);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals("+19:00", dateTimeZone0.toString());
      assertEquals((-68399999L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 3600000, false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      String string0 = dateTimeZone0.getName((-3599999L));
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }
}
