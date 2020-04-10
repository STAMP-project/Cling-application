/*

 * Tue Mar 03 14:44:12 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FirstMoment;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Skewness;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Variance variance0 = new Variance();
      Object object0 = new Object();
      variance0.equals(object0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.increment(159.391);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Skewness skewness0 = new Skewness();
      // Undeclared exception!
      try { 
        skewness0.incrementAll((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input values array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Product product0 = new Product();
      double[] doubleArray0 = new double[1];
      product0.incrementAll(doubleArray0);
      assertEquals(1L, product0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance(true);
      variance0.increment(Double.NaN);
      variance0.increment(Double.NaN);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double[] doubleArray0 = new double[0];
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance(false);
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance1 = new Variance(secondMoment0);
      variance0.increment(0L);
      boolean boolean0 = variance0.equals(variance1);
      assertEquals(1L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Product product0 = new Product();
      double[] doubleArray0 = new double[2];
      product0.incrementAll(doubleArray0, 0, 0);
      assertEquals(0L, product0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance();
      FirstMoment firstMoment0 = new FirstMoment();
      Mean mean0 = new Mean(firstMoment0);
      boolean boolean0 = variance0.equals(mean0);
      assertTrue(variance0.isBiasCorrected());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance();
      Variance variance1 = new Variance(false);
      variance1.increment(Double.NaN);
      variance1.increment(Double.NaN);
      boolean boolean0 = variance0.equals(variance1);
      assertEquals(2L, variance1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Variance variance0 = new Variance(false, (SecondMoment) null);
      double[] doubleArray0 = new double[8];
      double double0 = variance0.evaluate(doubleArray0, 1, 1);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sum sum0 = new Sum();
      // Undeclared exception!
      try { 
        sum0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[2];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
