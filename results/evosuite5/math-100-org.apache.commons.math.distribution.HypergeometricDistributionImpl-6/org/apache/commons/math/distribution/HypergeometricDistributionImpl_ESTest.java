/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:36:47 GMT 2019
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 0);
      hypergeometricDistributionImpl0.setSampleSize(2590);
      hypergeometricDistributionImpl0.setPopulationSize(3518);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(0);
      assertEquals(3518, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1.0000000000001603, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1346, 1346, 1346);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(2530);
      assertEquals(1346, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1346, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1346, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1346, 0, 0);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability((-1));
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1346, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(640, (-1), (-1));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(331, (-1), 0);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1346, 1346, 1346);
      hypergeometricDistributionImpl0.probability(1445);
      assertEquals(1346, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1346, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1346, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 0, 0);
      double double0 = hypergeometricDistributionImpl0.probability(0);
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1346, 1346, 1346);
      double double0 = hypergeometricDistributionImpl0.probability((-1848));
      assertEquals(1346, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1346, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1346, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(677, 1, 1);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(0);
      assertEquals(0.9985228951255541, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 0);
      hypergeometricDistributionImpl0.setSampleSize(2590);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(1);
      assertEquals(2590, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2072, 2072, 2668);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size must be less than or equal to population size
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-3317), 677, 2761);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes must be less than or equal to population size
         //
         verifyException("org.apache.commons.math.distribution.HypergeometricDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(211, 211, 211);
      int int0 = hypergeometricDistributionImpl0.getDomainUpperBound(0.0);
      assertEquals(211, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(211, int0);
      assertEquals(211, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(211, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 0);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(1);
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1.0, double0, 0.01);
      assertEquals(1, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(4330, 1, 771);
      int int0 = hypergeometricDistributionImpl0.getDomainLowerBound(1);
      assertEquals(4330, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(771, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0, int0);
  }
}
