/*

 * Tue Mar 03 17:56:44 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime(15778800000L, (DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime(15778800000L, (DateTimeZone) fixedDateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) julianChronology0);
      assertNotSame(dateTime1, dateTime0);
  }
}
