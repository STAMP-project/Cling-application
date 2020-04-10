/*

 * Tue Mar 03 17:57:40 GMT 2020
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
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      DateTime dateTime0 = new DateTime(3, 3, 3, 3, 3, 3, dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) islamicChronology0);
      assertNotSame(dateTime1, dateTime0);
      assertEquals(1583190000000L, dateTime1.getMillis());
  }
}
