/*

 * Tue Mar 03 14:44:36 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Min min0 = new Min();
      boolean boolean0 = min0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(false, fourthMoment0);
      standardDeviation0.increment(653.221565641715);
      assertFalse(standardDeviation0.isBiasCorrected());
      assertEquals(Double.NaN, standardDeviation0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Variance variance0 = new Variance();
      double double0 = variance0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.incrementAll((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input values array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.setBiasCorrected(false);
      variance0.increment((-3217.390056859));
      variance0.increment(4358.460118156553);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(1.4348376468570799E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double[] doubleArray0 = new double[3];
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment((-1242.7650235));
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      boolean boolean0 = sumOfSquares0.equals(variance0);
      assertEquals(1L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment((-3217.390056859));
      variance0.increment(4358.460118156553);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(2.8696752937141597E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Max max0 = new Max();
      double[] doubleArray0 = new double[0];
      max0.incrementAll(doubleArray0);
      assertEquals(Double.NaN, max0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      Max max0 = new Max();
      boolean boolean0 = thirdMoment0.equals(max0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      fourthMoment0.increment(Double.POSITIVE_INFINITY);
      boolean boolean0 = fourthMoment0.equals(thirdMoment0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(secondMoment0);
      standardDeviation0.clear();
      assertTrue(standardDeviation0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GeometricMean geometricMean0 = new GeometricMean();
      // Undeclared exception!
      try { 
        geometricMean0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double[] doubleArray0 = new double[0];
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
