/*

 * Tue Mar 03 14:43:43 GMT 2020
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
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      variance0.equals((Object) null);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(true, secondMoment0);
      double[] doubleArray0 = new double[2];
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Variance variance0 = new Variance(true);
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
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Mean mean0 = new Mean();
      mean0.incrementAll(doubleArray0);
      Kurtosis kurtosis0 = new Kurtosis();
      boolean boolean0 = kurtosis0.equals(mean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Kurtosis kurtosis0 = new Kurtosis();
      double double0 = kurtosis0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment(24.6150674637232);
      variance0.hashCode();
      assertEquals(1L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Variance variance0 = new Variance(false);
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(6L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      boolean boolean0 = sumOfSquares0.equals(fourthMoment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn((-1500L)).when(secondMoment0).getN();
      Variance variance0 = new Variance(secondMoment0);
      FourthMoment fourthMoment0 = new FourthMoment();
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      variance0.equals(kurtosis0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(true, secondMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Max max0 = new Max();
      // Undeclared exception!
      try { 
        max0.evaluate((double[]) null);
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
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[5];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
