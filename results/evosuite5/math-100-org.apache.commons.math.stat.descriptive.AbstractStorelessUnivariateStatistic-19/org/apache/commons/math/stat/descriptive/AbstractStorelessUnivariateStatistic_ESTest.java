/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:43:24 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStorelessUnivariateStatistic_ESTest extends AbstractStorelessUnivariateStatistic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = Double.NaN;
      Sum sum0 = new Sum();
      sum0.incrementAll(doubleArray0);
      Product product0 = new Product();
      boolean boolean0 = product0.equals(sum0);
      assertEquals(1L, sum0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sum sum0 = new Sum();
      Product product0 = new Product();
      boolean boolean0 = product0.equals(sum0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mean mean0 = new Mean();
      boolean boolean0 = mean0.equals(">`F7c^:7xzIJ?OZh");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Sum sum0 = new Sum();
      sum0.incrementAll(doubleArray0);
      Product product0 = new Product();
      boolean boolean0 = product0.equals(sum0);
      assertEquals(0.0, sum0.getResult(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Sum sum0 = new Sum();
      // Undeclared exception!
      try { 
        sum0.incrementAll((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input values array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[0];
      sum0.incrementAll(doubleArray0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      // Undeclared exception!
      try { 
        fourthMoment0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(2L, fourthMoment0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.hashCode();
  }
}
