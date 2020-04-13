/*

 * Tue Mar 03 17:39:46 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) gJChronology0);
      LocalDate localDate1 = localDate0.withWeekyear((-518));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone1 = instant0.getZone();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      // Undeclared exception!
      try { 
        gJChronology0.set(yearMonth0, 1585785597810L);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 3 for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now((Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.minusMonths((-518));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(5, monthDay1.getMonthOfYear());
      assertEquals(3, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(1, 0, 1, 0, 0, 1, 0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone1 = instant0.getZone();
      YearMonth yearMonth0 = new YearMonth(dateTimeZone1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      long long0 = gJChronology0.set(yearMonth0, (-2190L));
      assertEquals(1583257174587L, instant0.getMillis());
      assertEquals(1584575997810L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(292272984, 292272984, 292272984, 292272984);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 292272984 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = gJChronology0.getGregorianCutover();
      LocalDateTime localDateTime0 = new LocalDateTime(instant0, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(4, 4, 4, 4);
      assertEquals((-62033039999996L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }
}
