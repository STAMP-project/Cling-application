/*

 * Tue Mar 03 14:47:41 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.HypergeometricDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HypergeometricDistributionImpl_ESTest extends HypergeometricDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1471, 1471, 1471);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability((-823.1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0 and 1.0 (inclusive)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 1234, 1234);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes must be less than or equal to population size
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(634, 0, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.cumulativeProbability(634, (-2137274478));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint must be less than or equal to upper endpoint
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1471, 19, 1471);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((double) 19, 209.34852276424513);
      assertEquals(1471, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(19, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1471, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1471, 19, 1471);
      double double0 = hypergeometricDistributionImpl0.probability(410);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1471, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1471, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(19, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1471, 19, 1471);
      hypergeometricDistributionImpl0.probability(209.34852276424513);
      assertEquals(19, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1471, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1471, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1471, 2, 1471);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability(1471);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0 and 1.0 (inclusive)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1471, 21, 1471);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(1471, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(20, int0);
  }
}
