/*

 * Tue Mar 03 14:47:19 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.HypergeometricDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.apache.commons.math.distribution.PascalDistributionImpl;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HypergeometricDistributionImpl_ESTest extends HypergeometricDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PascalDistributionImpl pascalDistributionImpl0 = new PascalDistributionImpl(968, 0);
      // Undeclared exception!
      try { 
        pascalDistributionImpl0.inverseCumulativeProbability((-584.8573740663));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-543), 0, 0);
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
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(308.66888563, normalDistributionImpl0);
      // Undeclared exception!
      try { 
        poissonDistributionImpl0.cumulativeProbability((-1), (-905));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(804, 804, 804);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(804, 804);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2147483641, 2147483641, 2147483641);
      double double0 = hypergeometricDistributionImpl0.probability((double) 2147483641);
      assertEquals(1.0, double0, 0.01);
      assertEquals(2147483641, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
      hypergeometricDistributionImpl0.probability((-930.5450967197519));
      assertEquals(Integer.MAX_VALUE, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(Integer.MAX_VALUE, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(Integer.MAX_VALUE, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(41, 41, 41);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability(41);
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
      assertEquals(1, int0);
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
  }
}
