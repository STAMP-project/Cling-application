/*

 * Tue Mar 03 14:48:12 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BinomialDistributionImpl;
import org.apache.commons.math.distribution.HypergeometricDistributionImpl;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HypergeometricDistributionImpl_ESTest extends HypergeometricDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BinomialDistributionImpl binomialDistributionImpl0 = new BinomialDistributionImpl(15, 1.0);
      // Undeclared exception!
      try { 
        binomialDistributionImpl0.inverseCumulativeProbability((-187.9825742754));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 2883, 0);
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
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(5394.0);
      // Undeclared exception!
      try { 
        poissonDistributionImpl0.cumulativeProbability((-548), (-1567));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(14, 14, 14);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((double) 14, (double) 14);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(759, 759, 759);
      double double0 = hypergeometricDistributionImpl0.probability(759);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 1);
      hypergeometricDistributionImpl0.probability(5394.033801143);
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BinomialDistributionImpl binomialDistributionImpl0 = new BinomialDistributionImpl(1, 1);
      // Undeclared exception!
      try { 
        binomialDistributionImpl0.inverseCumulativeProbability(759);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(759, 759, 759);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(759, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(759, int0);
  }
}
