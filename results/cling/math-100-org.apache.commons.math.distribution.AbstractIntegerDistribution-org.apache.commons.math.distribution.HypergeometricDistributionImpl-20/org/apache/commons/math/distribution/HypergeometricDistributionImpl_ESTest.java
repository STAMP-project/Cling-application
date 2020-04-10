/*

 * Tue Mar 03 14:48:23 GMT 2020
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(11, 11, 11);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability((-1));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-1031), 0, 0);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 2);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.cumulativeProbability(2, 1);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 2);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((double) 2, (double) 2);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 2);
      double double0 = hypergeometricDistributionImpl0.probability(0);
      assertEquals(2, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2809.37976);
      double double0 = poissonDistributionImpl0.probability((-0.43941921045883636));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PascalDistributionImpl pascalDistributionImpl0 = new PascalDistributionImpl(1, 1);
      // Undeclared exception!
      try { 
        pascalDistributionImpl0.inverseCumulativeProbability(1389.0);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(Integer.MAX_VALUE, 0, 0);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(0);
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(Integer.MAX_VALUE, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals((-1), int0);
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
  }
}
