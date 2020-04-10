/*

 * Tue Mar 03 14:44:43 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Skewness;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
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
      Variance variance0 = new Variance(true, (SecondMoment) null);
      variance0.increment(1.0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      // Undeclared exception!
      try { 
        fourthMoment0.incrementAll((double[]) null);
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
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[3];
      variance0.incrementAll(doubleArray0);
      boolean boolean0 = fourthMoment0.equals(variance0);
      assertEquals(3L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double[] doubleArray0 = new double[0];
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[6];
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(6L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance();
      boolean boolean0 = fourthMoment0.equals(variance0);
      assertTrue(boolean0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(secondMoment0).getN();
      doReturn(0.0).when(secondMoment0).getResult();
      double[] doubleArray0 = new double[3];
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      sumOfSquares0.incrementAll(doubleArray0);
      boolean boolean0 = sumOfSquares0.equals(secondMoment0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[6];
      double double0 = variance0.evaluate(doubleArray0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance(true, fourthMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Skewness skewness0 = new Skewness();
      // Undeclared exception!
      try { 
        skewness0.evaluate((double[]) null);
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
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double[] doubleArray0 = new double[2];
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
