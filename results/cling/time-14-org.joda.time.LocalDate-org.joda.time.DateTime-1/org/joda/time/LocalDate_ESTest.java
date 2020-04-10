/*

 * Tue Mar 03 17:54:38 GMT 2020
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
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-95));
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583258072209L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-95));
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) gJChronology0);
      assertEquals(1583258071912L, dateTime1.getMillis());
  }
}
