/*

 * Tue Mar 03 17:12:48 GMT 2020
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
import org.joda.time.MonthDay;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((long) (-1791));
      String string0 = timeOfDay0.toString();
      assertEquals("T23:59:58.209", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = new TimeOfDay(0L, (Chronology) iSOChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      timeOfDay0.MIDNIGHT.isSupported(dateTimeFieldType0);
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
      LocalDate localDate0 = monthDay0.toLocalDate((-1922));
      int[] intArray0 = localDate0.getValues();
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) islamicChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 1796);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfYear' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }
}
