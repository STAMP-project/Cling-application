/*

 * Tue Mar 03 17:57:54 GMT 2020
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
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-26));
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583258269866L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) iSOChronology0);
      assertEquals(1583258269501L, dateTime1.getMillis());
      assertEquals(3, localDate0.size());
  }
}
