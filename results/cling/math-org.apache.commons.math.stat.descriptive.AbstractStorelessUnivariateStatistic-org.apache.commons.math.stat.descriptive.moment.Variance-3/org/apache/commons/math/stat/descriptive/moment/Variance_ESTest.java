/*

 * Tue Mar 03 14:43:21 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.equals((Object) null);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      variance0.increment(0.0);
      assertEquals(0L, variance0.getN());
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      // Undeclared exception!
      try { 
        sumOfSquares0.incrementAll((double[]) null);
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
      Variance variance0 = new Variance(false);
      FourthMoment fourthMoment0 = new FourthMoment();
      variance0.increment(2322.0);
      boolean boolean0 = fourthMoment0.equals(variance0);
      assertEquals(1L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment(3.0);
      variance0.increment(Double.NaN);
      SecondMoment secondMoment0 = new SecondMoment();
      boolean boolean0 = variance0.equals(secondMoment0);
      assertEquals(2L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[0];
      double double0 = secondMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      variance0.incrementAll(doubleArray0, 0, 0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance();
      Sum sum0 = new Sum();
      boolean boolean0 = variance0.equals(sum0);
      assertTrue(variance0.isBiasCorrected());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = Double.NaN;
      variance0.incrementAll(doubleArray0);
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      boolean boolean0 = variance0.equals(sumOfSquares0);
      assertEquals(7L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      double double0 = variance0.evaluate(doubleArray0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(fourthMoment0);
      double[] doubleArray0 = new double[10];
      double double0 = standardDeviation0.evaluate(doubleArray0, 1073741824, 1073741824);
      assertTrue(standardDeviation0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      // Undeclared exception!
      try { 
        sumOfLogs0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[1];
      double double0 = secondMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
