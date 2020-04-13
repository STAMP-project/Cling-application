/*

 * Tue Mar 03 17:57:29 GMT 2020
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
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTime dateTime0 = new DateTime(185542586064000000L);
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTime dateTime0 = new DateTime((DateTimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) copticChronology0);
      assertEquals(1583258243999L, dateTime1.getMillis());
  }
}
