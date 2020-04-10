/*

 * Tue Mar 03 17:57:09 GMT 2020
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
import org.joda.time.LocalDate;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = localDate0.toDateTimeAtMidnight();
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583190000000L, dateTime1.getMillis());
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = localDate0.toDateTimeAtMidnight();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) gregorianChronology0);
      assertEquals(1583190000000L, dateTime1.getMillis());
      assertNotSame(dateTime1, dateTime0);
  }
}
