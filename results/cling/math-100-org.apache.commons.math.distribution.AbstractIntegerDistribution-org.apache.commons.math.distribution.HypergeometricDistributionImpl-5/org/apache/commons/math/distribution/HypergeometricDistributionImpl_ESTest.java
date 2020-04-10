/*

 * Tue Mar 03 14:47:35 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.HypergeometricDistributionImpl;
import org.apache.commons.math.distribution.PascalDistributionImpl;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HypergeometricDistributionImpl_ESTest extends HypergeometricDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(825, 1, 410);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability((-3181.78));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 2668, 0);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(432, 432, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.cumulativeProbability(432, 0);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 1);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((-2635.871432), (double) 1);
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2167);
      double double0 = poissonDistributionImpl0.probability((double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(Double.NaN);
      double double0 = poissonDistributionImpl0.probability(Double.NaN);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PascalDistributionImpl pascalDistributionImpl0 = new PascalDistributionImpl(0, 0);
      // Undeclared exception!
      try { 
        pascalDistributionImpl0.inverseCumulativeProbability(2393.096709080894);
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
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(0);
      assertEquals(0, int0);
  }
}
