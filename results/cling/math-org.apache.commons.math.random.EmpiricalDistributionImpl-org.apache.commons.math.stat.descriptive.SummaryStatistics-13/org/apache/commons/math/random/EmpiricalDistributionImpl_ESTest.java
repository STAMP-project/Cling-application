/*

 * Tue Mar 03 15:50:36 GMT 2020
 */

package org.apache.commons.math.random;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.apache.commons.math.random.EmpiricalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmpiricalDistributionImpl_ESTest extends EmpiricalDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-2977.2408371611878);
      empiricalDistributionImpl0.load(doubleArray0);
      double double0 = empiricalDistributionImpl0.getNextValue();
      assertEquals(1000, empiricalDistributionImpl0.getBinCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      double[] doubleArray0 = new double[2];
      empiricalDistributionImpl0.load(doubleArray0);
      empiricalDistributionImpl0.load(doubleArray0);
      assertEquals(1000, empiricalDistributionImpl0.getBinCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      double[] doubleArray0 = new double[2];
      empiricalDistributionImpl0.load(doubleArray0);
      double double0 = empiricalDistributionImpl0.getNextValue();
      assertEquals(0.0, double0, 0.01);
  }
}
