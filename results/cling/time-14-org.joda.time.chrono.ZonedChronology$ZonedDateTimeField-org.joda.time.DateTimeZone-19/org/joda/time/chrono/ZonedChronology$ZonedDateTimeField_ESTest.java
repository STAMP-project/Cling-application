/*

 * Tue Mar 03 17:50:22 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(45);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(45, int0);
      assertEquals("+00:00:00.045", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Months months0 = Months.THREE;
      long long0 = copticChronology0.add((ReadablePeriod) months0, 869L, (-1500));
      assertEquals((-10924067971131L), long0);
      
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      long long1 = dateTimeField0.add(63509376L, 63509376L);
      assertEquals(38410470664709376L, long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getName((long) 1, (Locale) null);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      String string0 = fixedDateTimeZone0.getName((long) 1, (Locale) null);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
      boolean boolean0 = dateTimeZone0.isStandardOffset((-2147483648L));
      assertTrue(boolean0);
      assertEquals("+00:19:32", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) copticChronology0);
      localDate0.withYearOfEra(677);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getTimeZone("America/New_York");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal(29954944L);
      assertEquals((-18000000), int0);
      
      DateTimeField dateTimeField0 = copticChronology0.yearOfCentury();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor(29954944L);
      assertEquals((-9666000000L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.adjustOffset(1, false);
      assertEquals(1L, long0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(69L, true);
      assertEquals((-3599931L), long0);
      
      String string0 = dateTimeZone0.getName((-3599931L), (Locale) null);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 3608960L);
      assertEquals(3668960L, long0);
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-78));
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(3602048L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(2434L, false);
      assertEquals((-3597566L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      long long0 = dateTimeField0.add((long) 1, 2147483280);
      assertEquals(1298797887740400001L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      long long0 = dateTimeZone1.convertLocalToUTC((-763L), false);
      assertEquals((-3600763L), long0);
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("America/New_York");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.getOffsetFromLocal((-1L));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("America/New_York");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.getOffsetFromLocal(1);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      dateTimeZone0.getName(5840768L, locale0);
      LocalTime localTime0 = new LocalTime(9627392L);
      LocalTime localTime1 = localTime0.withHourOfDay(1);
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2146656738);
      String string0 = dateTimeZone0.getName((long) 2146656738, (Locale) null);
      assertEquals("+596:17:36.738", string0);
      
      long long0 = dateTimeField0.add((long) 2146656738, (long) 2146656738);
      assertEquals(1298297997285456738L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.TAIWAN;
      fixedDateTimeZone0.getShortName((long) 1, locale0);
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal(1);
      assertEquals(3600000, int0);
      
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.add((long) 1, 10000L);
      assertEquals(6047996400001L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(1);
      assertEquals(3600000, int0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      dateTimeZone0.getShortName((long) 1, locale0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+00:00:00.001", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.TAIWAN;
      String string0 = fixedDateTimeZone0.getShortName((-3599999L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.isStandardOffset(1);
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      Months months0 = Months.THREE;
      long long0 = copticChronology0.add((ReadablePeriod) months0, 869L, (-1744));
      assertEquals((-12699587971131L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Months months0 = Months.THREE;
      copticChronology0.add((ReadablePeriod) months0, 869L, (-1500));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeField0.add(2147483647L, 2050L);
      assertEquals(1241983883647L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeField0.add((long) 1, 759);
      assertEquals(459039600001L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Months months0 = Months.THREE;
      long long0 = copticChronology0.add((ReadablePeriod) months0, (long) 1, (-1500));
      assertEquals((-10924067971999L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long1 = dateTimeZone0.convertLocalToUTC(0L, false);
      assertEquals((-3600000L), long1);
  }
}
