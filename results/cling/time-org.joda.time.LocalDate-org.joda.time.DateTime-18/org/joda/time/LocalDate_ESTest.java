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
import org.joda.time.LocalTime;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      assertEquals(1583258256044L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTime dateTime0 = localDate0.toDateTime((LocalTime) null);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) lenientChronology0);
      assertEquals(3, localDate0.size());
      assertEquals(1583258255681L, dateTime1.getMillis());
  }
}
