/*

 * Tue Mar 03 14:47:56 GMT 2020
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(433, 433, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability((-368.7));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-3439), Integer.MAX_VALUE, Integer.MAX_VALUE);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.cumulativeProbability((-2698.2882418319), (-2698.2882418319));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(433, 433, 0);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(433, 433);
      assertEquals(433, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(433, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 1);
      double double0 = hypergeometricDistributionImpl0.probability(0);
      assertEquals(1, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 1);
      hypergeometricDistributionImpl0.probability((-2991.42941));
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability(2);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 1);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(1);
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1, int0);
  }
}
