/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:37:00 GMT 2019
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 2);
      hypergeometricDistributionImpl0.setPopulationSize(1993);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(0);
      assertEquals(1993, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1.0000000000034228, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(982, 982, 0);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(982);
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(982, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(982, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 2);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability((-1));
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2161, 1900, (-887));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-1), (-1), (-1));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1350, (-1), 1350);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(982, 982, 0);
      double double0 = hypergeometricDistributionImpl0.probability(0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(982, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(982, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 2);
      double double0 = hypergeometricDistributionImpl0.probability(2096);
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(982, 982, 0);
      double double0 = hypergeometricDistributionImpl0.probability((-1.0));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(982, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(982, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2, 2, 2);
      hypergeometricDistributionImpl0.setPopulationSize(1866);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(0.0);
      assertEquals(1866, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0.9978569519754149, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-1384), (-1384), 0);
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 1, 637);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(982, 982, 0);
      int int0 = hypergeometricDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(982, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals((-1), int0);
      assertEquals(982, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
  }
}
