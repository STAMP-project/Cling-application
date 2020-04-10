/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:48:13 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AssembledChronology_ESTest extends AssembledChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, (Object) null, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(lenientChronology0);
      try { 
        strictChronology0.getDateTimeMillis((long) 1, 59, 59, 59, 59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 59 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
      assertEquals(3661001L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      long long0 = iSOChronology0.getDateTimeMillis(2, 2, 2, 2, 2, 2, 2);
      assertEquals((-62101289849998L), long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(buddhistChronology0);
      long long0 = strictChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-79271569171999L), long0);
  }
}
