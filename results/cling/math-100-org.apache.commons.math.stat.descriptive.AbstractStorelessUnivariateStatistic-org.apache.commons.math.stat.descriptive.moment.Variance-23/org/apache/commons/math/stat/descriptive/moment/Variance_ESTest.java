/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 10:10:33 GMT 2019
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Mean mean0 = new Mean();
      boolean boolean0 = mean0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StandardDeviation standardDeviation0 = new StandardDeviation(false);
      Max max0 = new Max();
      boolean boolean0 = standardDeviation0.equals(max0);
      assertTrue(boolean0);
      assertFalse(standardDeviation0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.clear();
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(false, fourthMoment0);
      standardDeviation0.clear();
      assertFalse(standardDeviation0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Kurtosis kurtosis0 = new Kurtosis();
      double double0 = kurtosis0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment(0.0);
      Product product0 = new Product();
      boolean boolean0 = product0.equals(variance0);
      assertEquals(0.0, variance0.getResult(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(4306L).when(secondMoment0).getN();
      Variance variance0 = new Variance(secondMoment0);
      FourthMoment fourthMoment0 = new FourthMoment();
      variance0.equals(fourthMoment0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Variance variance0 = new Variance(false);
      variance0.incrementAll(doubleArray0);
      variance0.hashCode();
      assertEquals(4L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      // Undeclared exception!
      try { 
        secondMoment0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[1];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[0];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mean mean0 = new Mean();
      // Undeclared exception!
      try { 
        mean0.incrementAll((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input values array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
  }
}
