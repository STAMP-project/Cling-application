/*

 * Tue Mar 03 14:48:24 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.HypergeometricDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HypergeometricDistributionImpl_ESTest extends HypergeometricDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1291, 1291, 1291);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.inverseCumulativeProbability((-2723.917086));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-408), 2355, 0);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1539, 1, 1);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.cumulativeProbability(1539, 1);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1291, 1291, 1291);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((-1.0), (double) 929);
      assertEquals(1291, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1291, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1291, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1539, 1, 1);
      double double0 = hypergeometricDistributionImpl0.probability(1539);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1539, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2811, 2811, 2811);
      hypergeometricDistributionImpl0.probability(2.1743961811521265E-4);
      assertEquals(2811, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2811, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2811, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1422.4966727631122, normalDistributionImpl0);
      // Undeclared exception!
      try { 
        poissonDistributionImpl0.inverseCumulativeProbability(6252);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1539, 1, 1);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(1);
      assertEquals(1539, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1, int0);
      assertEquals(1, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }
}
