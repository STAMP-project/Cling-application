/*

 * Tue Mar 03 17:57:04 GMT 2020
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
import org.joda.time.Instant;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583258218397L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) buddhistChronology0);
      assertEquals(1583258218355L, dateTime1.getMillis());
  }
}
