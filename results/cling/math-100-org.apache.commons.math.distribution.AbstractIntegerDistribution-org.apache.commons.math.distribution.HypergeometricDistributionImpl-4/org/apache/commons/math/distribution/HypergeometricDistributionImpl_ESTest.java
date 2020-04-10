/*

 * Tue Mar 03 14:47:32 GMT 2020
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
      BinomialDistributionImpl binomialDistributionImpl0 = new BinomialDistributionImpl(Integer.MAX_VALUE, 1.0);
      // Undeclared exception!
      try { 
        binomialDistributionImpl0.inverseCumulativeProbability((-1239));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-1), 0, (-1));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1088, 1088, 1088);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.cumulativeProbability(1073741824, (-561));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1325, 1325, 1325);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(1325, 1325);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BinomialDistributionImpl binomialDistributionImpl0 = new BinomialDistributionImpl(2, 0.0);
      double double0 = binomialDistributionImpl0.probability(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2145562821, 2145562821, 2145562821);
      hypergeometricDistributionImpl0.probability(1591.8216);
      assertEquals(2145562821, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2145562821, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2145562821, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(82, 82, 82);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability(82);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(405, 0, 405);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(0);
      assertEquals(405, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals((-1), int0);
      assertEquals(405, hypergeometricDistributionImpl0.getPopulationSize());
  }
}
