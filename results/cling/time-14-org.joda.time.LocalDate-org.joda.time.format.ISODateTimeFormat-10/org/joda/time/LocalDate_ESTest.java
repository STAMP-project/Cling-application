/*

 * Tue Mar 03 17:55:51 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, (int[]) null);
      partial0.getFormatter();
      assertEquals(1583258138364L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 14);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType1;
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, (int[]) null);
      partial0.getFormatter();
      assertEquals(1583258136631L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, (int[]) null);
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
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.getFormatter();
      // Undeclared exception!
      try { 
        LocalDate.parse("Parsing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Parsing not supported\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, (int[]) null);
      partial0.getFormatter();
      assertEquals(1583258132003L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, (int[]) null);
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
}
