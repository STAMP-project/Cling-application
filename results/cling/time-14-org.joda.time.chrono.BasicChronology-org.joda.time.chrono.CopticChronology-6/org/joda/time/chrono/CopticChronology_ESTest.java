/*

 * Tue Mar 03 17:14:17 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInYear(1611);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getWeekyear(1);
      assertEquals(1686, int0);
  }
}
