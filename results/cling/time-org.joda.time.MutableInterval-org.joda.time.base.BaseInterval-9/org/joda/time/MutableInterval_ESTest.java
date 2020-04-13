/*

 * Tue Mar 03 17:04:17 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.Years;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Years years0 = Years.ONE;
      MutableInterval mutableInterval0 = new MutableInterval(years0, (ReadableInstant) null);
      assertEquals(1551632649038L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, zonedChronology0);
      assertFalse(mutableInterval1.equals((Object)mutableInterval0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: W
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Minutes minutes0 = Minutes.minutes(2766);
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, minutes0);
      assertEquals(1583255048611L, mutableInterval0.getStartMillis());
  }
}
