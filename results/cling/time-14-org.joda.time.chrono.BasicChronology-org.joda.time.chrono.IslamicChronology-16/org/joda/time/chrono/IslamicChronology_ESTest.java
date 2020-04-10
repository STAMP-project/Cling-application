/*

 * Tue Mar 03 16:56:35 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      String string0 = julianChronology0.toString();
      assertEquals("JulianChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      int int0 = gregorianChronology0.getDaysInYear(4);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1, 1);
      LocalDateTime localDateTime1 = localDateTime0.minusDays(1);
      // Undeclared exception!
      try { 
        localDateTime1.withDate(1, 1031, 1);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1031 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateMidnight dateMidnight1 = dateMidnight0.withField(dateTimeFieldType0, 1);
      assertNotSame(dateMidnight1, dateMidnight0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekOfWeekyear((-42496790399999L), 23);
      assertEquals(50, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Instant instant0 = Instant.now();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      assertNotNull(gJChronology0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekyear(208483197736L);
      assertEquals(1396, int0);
  }
}
