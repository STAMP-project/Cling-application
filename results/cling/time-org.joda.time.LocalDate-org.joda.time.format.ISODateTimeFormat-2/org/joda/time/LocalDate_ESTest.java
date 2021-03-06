/*

 * Tue Mar 03 17:54:48 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, (int[]) null);
      partial0.getFormatter();
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate(partial0, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'year' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      int[] intArray0 = new int[13];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[10];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[9] = dateTimeFieldType1;
      int[] intArray0 = new int[12];
      Partial partial0 = new Partial(gJChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(gJChronology0, dateTimeFieldTypeArray0, intArray0);
      partial0.getFormatter();
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate(partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'year' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[10];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      int[] intArray0 = new int[13];
      Partial partial0 = new Partial(gJChronology0, dateTimeFieldTypeArray0, intArray0);
      partial0.getFormatter();
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate("9s`*i>^[FP", gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"9s`*i>^[FP\" is malformed at \"s`*i>^[FP\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }
}
