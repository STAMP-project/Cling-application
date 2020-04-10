/*

 * Tue Mar 03 17:55:54 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[15];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 17);
      partial0.getFormatter();
      // Undeclared exception!
      try { 
        LocalDate.parse("]@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"]@\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[15];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      int[] intArray0 = new int[2];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      partial0.getFormatter();
      LocalDate localDate0 = LocalDate.parse("2563-03-03");
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      partial0.getFormatter();
      LocalDate localDate0 = LocalDate.parse("0001-01-01");
      assertEquals(3, localDate0.size());
  }
}
