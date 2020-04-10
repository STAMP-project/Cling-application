/*

 * Tue Mar 03 17:55:19 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate localDate1 = new LocalDate(localDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(5);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      Partial partial0 = new Partial(dateTimeFieldType0, 5, islamicChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[4] = dateTimeFieldType1;
      Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(5);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      Partial partial0 = new Partial(dateTimeFieldType0, 5, islamicChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      dateTimeFieldTypeArray0[6] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[7] = dateTimeFieldType1;
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, (int[]) null);
      partial0.getFormatter();
      // Undeclared exception!
      try { 
        LocalDate.parse("XK");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"XK\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = new LocalDate(localDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 128, buddhistChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = new LocalDate(localDate0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(5, 5);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 5);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }
}
