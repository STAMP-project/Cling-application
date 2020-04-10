/*

 * Tue Mar 03 16:51:58 GMT 2020
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
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis(1, 18, 1, 18, 1, 18, 18);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 18 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-79271567999999L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, fixedDateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
      assertEquals(3661000L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, fixedDateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(10L, 1, 1970, 1970, 1970);
      assertEquals(123771970L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, fixedDateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone((DateTimeZone) null);
      boolean boolean0 = zonedChronology0.equals(chronology0);
      assertFalse(boolean0);
  }
}
