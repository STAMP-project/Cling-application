/*

 * Tue Mar 03 16:50:26 GMT 2020
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
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BasicYearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      try { 
        iSOChronology0.getDateTimeMillis(168, 6, 3559, 3559, 168, 3559, 168);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 3559 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      long long0 = iSOChronology0.getDateTimeMillis((long) 5, 5, 5, 5, 1);
      assertEquals(14705001L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      LocalDate localDate0 = new LocalDate((Object) null, buddhistChronology0);
      AssembledChronology.Fields assembledChronology_Fields1 = new AssembledChronology.Fields();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-67));
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = iSOChronology1.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone1, islamicChronology_LeapYearPatternType0);
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(islamicChronology0);
      iSOChronology0.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology0, iSOChronology1);
  }
}
