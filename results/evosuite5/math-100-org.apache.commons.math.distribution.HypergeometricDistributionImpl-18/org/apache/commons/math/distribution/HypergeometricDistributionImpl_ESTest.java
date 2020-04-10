/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:26:12 GMT 2019
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2476, 1508, 1508);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(2476);
      assertEquals(2476, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1508, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1508, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1453, 1453, 2);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability((-2249));
      assertEquals(1.0, double0, 0.01);
      assertEquals(1453, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1453, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1453, 1453, 2);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(2);
      assertEquals(1453, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1453, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size must be non-negative.
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size must be positive.
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1682, (-1098), 1508);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes must be non-negative.
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1749, 1749, 1236);
      double double0 = hypergeometricDistributionImpl0.probability(3088);
      assertEquals(1749, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1236, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1749, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2476, 1508, 1508);
      double double0 = hypergeometricDistributionImpl0.probability(1508);
      assertEquals(1508, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
      assertEquals(2476, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1508, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1749, 1749, 1236);
      hypergeometricDistributionImpl0.setPopulationSize(834);
      double double0 = hypergeometricDistributionImpl0.probability(1749);
      assertEquals(834, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2476, 1508, 1508);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((-1), 3724);
      assertEquals(1508, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1508, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(2476, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 0, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size must be less than or equal to population size
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(211, 2134, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes must be less than or equal to population size
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2729, 1508, 1508);
      // Undeclared exception!
      hypergeometricDistributionImpl0.inverseCumulativeProbability(0.0);
  }
}
