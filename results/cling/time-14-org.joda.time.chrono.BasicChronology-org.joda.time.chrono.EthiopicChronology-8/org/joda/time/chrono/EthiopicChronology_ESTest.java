/*

 * Tue Mar 03 16:49:21 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EthiopicChronology_ESTest extends EthiopicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      JulianChronology julianChronology0 = new JulianChronology(lenientChronology0, "StrictChronology[", 1);
      String string0 = julianChronology0.toString();
      assertEquals("JulianChronology[Europe/Amsterdam,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      String string0 = gregorianChronology0.toString();
      assertEquals("GregorianChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getDaysInYear(1787);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }
}
