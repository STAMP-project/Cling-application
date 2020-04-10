/*

 * Tue Mar 03 16:51:07 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2671);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2671);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      buddhistChronology0.getDateTimeMillis(2671, 5, 1, 5);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(355, 2);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis((-1114L), 355, 355, (-2066), 2);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 355 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology((Chronology) null, (Object) null, 5);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2375);
      ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null);
      assertEquals(4, localDateTime0.size());
  }
}
