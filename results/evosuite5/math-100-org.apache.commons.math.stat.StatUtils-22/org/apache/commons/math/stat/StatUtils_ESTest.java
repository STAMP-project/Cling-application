/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:13:05 GMT 2019
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.StatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StatUtils_ESTest extends StatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = StatUtils.varianceDifference(doubleArray0, doubleArray0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      try { 
        StatUtils.varianceDifference(doubleArray1, doubleArray0, 1434.00434511237);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input array lengths must be equal and at least 2.
         //
         verifyException("org.apache.commons.math.stat.StatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      try { 
        StatUtils.varianceDifference(doubleArray0, doubleArray0, 3367.974);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input array lengths must be equal and at least 2.
         //
         verifyException("org.apache.commons.math.stat.StatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      try { 
        StatUtils.sumDifference(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input arrays must have the same (positive) length.
         //
         verifyException("org.apache.commons.math.stat.StatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[6];
      try { 
        StatUtils.sumDifference(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input arrays must have the same (positive) length.
         //
         verifyException("org.apache.commons.math.stat.StatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        StatUtils.mean(doubleArray0, (-225), (-4304));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position cannot be negative
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = StatUtils.sum(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        StatUtils.max(doubleArray0, 0, 836);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // begin + length > values.length
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        StatUtils.product(doubleArray0, (-3451), (-3451));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position cannot be negative
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = StatUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = StatUtils.sumLog(doubleArray0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        StatUtils.sumSq(doubleArray0, 5057, 5057);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // begin + length > values.length
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = StatUtils.geometricMean(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        StatUtils.sum(doubleArray0, (-1), 1684);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position cannot be negative
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = StatUtils.mean(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        StatUtils.min(doubleArray0, (-5191), 1668);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position cannot be negative
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        StatUtils.sumLog(doubleArray0, 4, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // begin + length > values.length
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = StatUtils.sumSq(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        StatUtils.variance(doubleArray0, (-464.98943726124696), (-1259), 2619);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position cannot be negative
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        StatUtils.variance(doubleArray0, 1792, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // begin + length > values.length
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = StatUtils.product(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        StatUtils.percentile(doubleArray0, (-1704.8415504173288));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid quantile value: -1704.8415504173288
         //
         verifyException("org.apache.commons.math.stat.descriptive.rank.Percentile", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        StatUtils.geometricMean(doubleArray0, 874, 1169);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // begin + length > values.length
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = StatUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        StatUtils.percentile(doubleArray0, (-545), (-545), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position cannot be negative
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = StatUtils.variance(doubleArray0, (-2548.5669140008));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = StatUtils.variance(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = StatUtils.meanDifference(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
