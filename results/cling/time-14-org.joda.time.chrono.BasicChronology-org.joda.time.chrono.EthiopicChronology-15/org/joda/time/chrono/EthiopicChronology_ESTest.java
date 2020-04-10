/*

 * Tue Mar 03 16:50:09 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EthiopicChronology_ESTest extends EthiopicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null, 1);
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[Europe/Amsterdam,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInYear(1615);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInYear((-140));
      assertEquals(365, int0);
  }
}
