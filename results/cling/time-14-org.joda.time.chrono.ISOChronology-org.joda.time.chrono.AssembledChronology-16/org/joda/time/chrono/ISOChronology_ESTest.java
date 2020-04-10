/*

 * Tue Mar 03 16:50:50 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology.getInstance();
      LocalTime localTime0 = null;
      try {
        localTime0 = new LocalTime(490, 132, 365);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 490 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate((-1471), 5, 47, buddhistChronology0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 47 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      LocalTime localTime0 = new LocalTime((-599), 0, 0, (-248), lenientChronology0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0, 1);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) mutableDateTime0, 1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
  }
}
