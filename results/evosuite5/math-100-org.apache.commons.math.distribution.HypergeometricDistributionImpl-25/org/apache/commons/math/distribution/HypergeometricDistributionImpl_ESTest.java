/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 10:19:22 GMT 2019
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
  public void test00()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1506, 1506, 1506);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(2098);
      assertEquals(1506, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1506, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1506, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 0);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability((-73));
      assertEquals(1.0, double0, 0.01);
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(2, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2681, (-3301), (-3301));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size must be non-negative.
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, (-1933), (-1933));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size must be positive.
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.setNumberOfSuccesses((-73));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes must be non-negative.
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(348, 2, 2);
      double double0 = hypergeometricDistributionImpl0.probability(1);
      assertEquals(0.011461128225476704, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1556, 0, 2);
      double double0 = hypergeometricDistributionImpl0.probability(2);
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1556, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1506, 1506, 1506);
      double double0 = hypergeometricDistributionImpl0.probability(669);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1506, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1506, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1506, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(348, 2, 2);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(348, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 0, 214);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size must be less than or equal to population size
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-2631), 1689, 1689);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes must be less than or equal to population size
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1556, 0, 2);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(0);
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(1556, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1556, 0, 2);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(1556, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals((-1), int0);
  }
}
