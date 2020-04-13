/*

 * Tue Mar 03 14:43:42 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.equals((Object) null);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[12];
      SecondMoment secondMoment0 = new SecondMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(secondMoment0);
      standardDeviation0.incrementAll(doubleArray0);
      assertTrue(standardDeviation0.isBiasCorrected());
      assertEquals(Double.NaN, standardDeviation0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(secondMoment0);
      // Undeclared exception!
      try { 
        standardDeviation0.incrementAll((double[]) null);
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
      double[] doubleArray0 = new double[7];
      FourthMoment fourthMoment0 = new FourthMoment();
      FourthMoment fourthMoment1 = new FourthMoment();
      fourthMoment1.incrementAll(doubleArray0);
      boolean boolean0 = fourthMoment0.equals(fourthMoment1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[6];
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(6L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment(0.0);
      double double0 = variance0.getResult();
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[6];
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(6L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.incrementAll(doubleArray0, 0, 0);
      assertEquals(Double.NaN, fourthMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GeometricMean geometricMean0 = new GeometricMean();
      SecondMoment secondMoment0 = new SecondMoment();
      boolean boolean0 = secondMoment0.equals(geometricMean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(9218868437227405312L).when(secondMoment0).getN();
      Variance variance0 = new Variance(true, secondMoment0);
      Variance variance1 = new Variance(true);
      variance1.equals(variance0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertTrue(variance1.isBiasCorrected());
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      StandardDeviation standardDeviation0 = new StandardDeviation();
      double double0 = standardDeviation0.evaluate(doubleArray0);
      assertTrue(standardDeviation0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
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
  public void test14()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[2];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
