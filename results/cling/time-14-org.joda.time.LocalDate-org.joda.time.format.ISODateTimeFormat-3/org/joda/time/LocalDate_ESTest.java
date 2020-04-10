/*

 * Tue Mar 03 17:54:51 GMT 2020
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
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      Partial partial0 = new Partial(ethiopicChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      Partial partial0 = new Partial(ethiopicChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Object) null);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[13];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[4] = dateTimeFieldType1;
      int[] intArray0 = new int[5];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.toString();
      // Undeclared exception!
      try { 
        LocalDate.parse("---.001");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"---.001\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Object) null);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      Partial partial0 = new Partial(ethiopicChronology0, dateTimeFieldTypeArray0, (int[]) null);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      partial0.getFormatter();
      // Undeclared exception!
      try { 
        LocalDate.parse("6-x4'Z:r@1Cn5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"6-x4'Z:r@1Cn5\" is malformed at \"-x4'Z:r@1Cn5\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}
