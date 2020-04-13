/*

 * Tue Mar 03 15:47:19 GMT 2020
 */

package org.apache.commons.math.random;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.random.EmpiricalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmpiricalDistributionImpl_ESTest extends EmpiricalDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      assertFalse(empiricalDistributionImpl0.isLoaded());
      
      double[] doubleArray0 = new double[1];
      empiricalDistributionImpl0.load(doubleArray0);
      assertTrue(empiricalDistributionImpl0.isLoaded());
      
      double double0 = empiricalDistributionImpl0.getNextValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      assertFalse(empiricalDistributionImpl0.isLoaded());
      
      double[] doubleArray0 = new double[0];
      empiricalDistributionImpl0.load(doubleArray0);
      empiricalDistributionImpl0.load(doubleArray0);
      assertTrue(empiricalDistributionImpl0.isLoaded());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      double[] doubleArray0 = new double[9];
      empiricalDistributionImpl0.load(doubleArray0);
      double double0 = empiricalDistributionImpl0.getNextValue();
      assertEquals(0.0, double0, 0.01);
  }
}
