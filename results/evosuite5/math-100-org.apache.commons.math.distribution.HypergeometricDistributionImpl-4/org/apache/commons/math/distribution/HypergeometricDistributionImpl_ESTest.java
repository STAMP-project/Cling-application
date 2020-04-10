/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:36:40 GMT 2019
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(2);
      assertEquals(9.038910702816678E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1968, 1968, 1968);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(1255);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1968, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1968, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1968, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      double double0 = hypergeometricDistributionImpl0.upperCumulativeProbability(1488);
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1488, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, (-902), (-902));
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl((-1936), (-1936), (-1936));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1, 1, 1);
      // Undeclared exception!
      try { 
        hypergeometricDistributionImpl0.setNumberOfSuccesses((-2999));
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      double double0 = hypergeometricDistributionImpl0.probability(762);
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1488, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      hypergeometricDistributionImpl0.probability((-1889));
      assertEquals(1488, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(178, 178, 46);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(2280);
      assertEquals(178, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(1.0, double0, 0.01);
      assertEquals(178, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(46, hypergeometricDistributionImpl0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability((-8));
      assertEquals(0.0, double0, 0.01);
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(1488, hypergeometricDistributionImpl0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      double double0 = hypergeometricDistributionImpl0.cumulativeProbability(1);
      assertEquals(0.9999990961089142, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = null;
      try {
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(101, 101, 3005);
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
        hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(0, 2, 0);
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
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      int int0 = hypergeometricDistributionImpl0.getDomainUpperBound(2);
      assertEquals(1488, hypergeometricDistributionImpl0.getPopulationSize());
      assertEquals(2, hypergeometricDistributionImpl0.getSampleSize());
      assertEquals(2, hypergeometricDistributionImpl0.getNumberOfSuccesses());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(1488, 2, 2);
      double double0 = hypergeometricDistributionImpl0.probability(0);
      assertEquals(0.9973127318480371, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HypergeometricDistributionImpl hypergeometricDistributionImpl0 = new HypergeometricDistributionImpl(15, 15, 15);
      int int0 = hypergeometricDistributionImpl0.getDomainLowerBound((-999.1692637129396));
      assertEquals(15, int0);
  }
}
