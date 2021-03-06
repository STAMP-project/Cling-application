/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:25:59 GMT 2019
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, 2008, 0);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(2008);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(2008, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2008, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, 2008, 2008);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability((-1348));
      assertEquals(2008, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(2008, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2008, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, 0, 0);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(0);
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1.0, double0, 0.01);
      assertEquals(2008, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, (-212), (-1507));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, 0, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.setPopulationSize((-1117));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, (-212), 2008);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, 0, 0);
      double double0 = hypergeometricDistributionImpl0.probability(1);
      assertEquals(2008, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1123, 1123, 1123);
      hypergeometricDistributionImpl0.setNumberOfSuccesses(1);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((-1.0), (double) 1);
      assertEquals(1, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(4258, 875, 2008);
      // Undeclared exception!
      hypergeometricDistributionImpl0.cumulativeProbability(1, 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-776), (-776), 1871);
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-1), 294, 294);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2782, 2782, 1871);
      int int0 = hypergeometricDistributionImpl0.getDomainUpperBound(2782);
      assertEquals(1871, int0);
      assertEquals(2782, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2782, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(4258, 875, 2008);
      double double0 = hypergeometricDistributionImpl0.probability(0.0);
      assertEquals(5.921154453883726E-287, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(2008, 2008, 2008);
      double double0 = hypergeometricDistributionImpl0.probability(0.0);
      assertEquals(2008, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(2008, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2008, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1123, 1123, 1123);
      int int0 = hypergeometricDistributionImpl0.getDomainLowerBound(1.0);
      assertEquals(1123, int0);
  }
}
