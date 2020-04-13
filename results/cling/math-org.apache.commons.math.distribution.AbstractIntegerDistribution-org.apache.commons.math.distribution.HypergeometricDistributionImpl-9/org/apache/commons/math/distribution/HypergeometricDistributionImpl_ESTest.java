/*

 * Tue Mar 03 14:47:51 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BinomialDistributionImpl;
import org.apache.commons.math.distribution.HypergeometricDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HypergeometricDistributionImpl_ESTest extends HypergeometricDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 0, 1);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability((-104.69372151919));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 26, (-3378));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(342, 342, 342);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.cumulativeProbability(342, 274);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(3033, 3033, 3033);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(754.0, (double) 3033);
      assertEquals(3033, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(3033, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(3033, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1573, 27, 1573);
      double double0 = hypergeometricDistributionImpl0.probability(0.0);
      assertEquals(27, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1573, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1573, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 0);
      hypergeometricDistributionImpl0.probability(754.31870458);
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BinomialDistributionImpl binomialDistributionImpl0 = new BinomialDistributionImpl(2, 1.0);
      // Undeclared exception!
      try { 
        binomialDistributionImpl0.inverseCumulativeProbability(2);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 1);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(1);
      assertEquals(1, int0);
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2, hypergeometricDistributionImpl0.getPopulationSize());
  }
}
