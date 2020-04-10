/*

 * Tue Mar 03 14:44:13 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Product product0 = new Product();
      Object object0 = new Object();
      boolean boolean0 = product0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.increment(0.0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
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
      Variance variance0 = new Variance();
      FourthMoment fourthMoment0 = new FourthMoment();
      variance0.moment = (SecondMoment) fourthMoment0;
      variance0.increment(2090.0538489572);
      Product product0 = new Product();
      boolean boolean0 = fourthMoment0.equals(product0);
      assertEquals(0.0, fourthMoment0.getResult(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(true, secondMoment0);
      FourthMoment fourthMoment0 = new FourthMoment();
      variance0.moment = (SecondMoment) fourthMoment0;
      double[] doubleArray0 = new double[7];
      fourthMoment0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment(0.0);
      variance0.hashCode();
      assertEquals(1L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment((-1661.67714636));
      variance0.increment(0.0);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(690292.7346837783, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      double[] doubleArray0 = new double[0];
      sumOfLogs0.incrementAll(doubleArray0);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      GeometricMean geometricMean0 = new GeometricMean(sumOfLogs0);
      Kurtosis kurtosis0 = new Kurtosis();
      boolean boolean0 = geometricMean0.equals(kurtosis0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(1219L).when(secondMoment0).getN();
      Variance variance0 = new Variance(secondMoment0);
      Variance variance1 = new Variance(true);
      boolean boolean0 = variance1.equals(variance0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertTrue(variance0.isBiasCorrected());
      assertTrue(variance1.isBiasCorrected());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Variance variance0 = new Variance();
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[1];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
