/*

 * Tue Mar 03 17:55:14 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTime dateTime0 = new DateTime((DateTimeZone) null);
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      assertEquals(1583258107361L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = new LocalTime((-4667L), (Chronology) null);
      DateTime dateTime0 = localTime0.toDateTimeToday((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) null);
      assertNotSame(dateTime1, dateTime0);
  }
}
