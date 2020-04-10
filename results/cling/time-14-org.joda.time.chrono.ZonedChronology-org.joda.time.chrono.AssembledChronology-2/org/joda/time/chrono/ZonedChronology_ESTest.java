/*

 * Tue Mar 03 16:51:27 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis(1, 2593, 2593, 1);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 2593 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone1);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, fixedDateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
      assertEquals(61001L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      zonedChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((long) 1, 2147482994, 1, 1, 2147482994);
      assertEquals(7730940925943994L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }
}
