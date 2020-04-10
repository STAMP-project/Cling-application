/*

 * Tue Mar 03 14:43:39 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.equals("I_");
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance(fourthMoment0);
      double[] doubleArray0 = new double[1];
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      GeometricMean geometricMean0 = new GeometricMean(sumOfLogs0);
      // Undeclared exception!
      try { 
        geometricMean0.incrementAll((double[]) null);
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
      double[] doubleArray0 = new double[4];
      Variance variance0 = new Variance(false);
      variance0.incrementAll(doubleArray0);
      variance0.hashCode();
      assertEquals(4L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment(0.0);
      Sum sum0 = new Sum();
      boolean boolean0 = sum0.equals(variance0);
      assertEquals(1L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[17];
      fourthMoment0.incrementAll(doubleArray0, 2, 0);
      assertEquals(0L, fourthMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      boolean boolean0 = secondMoment0.equals(sumOfLogs0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance();
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn((-287L)).when(secondMoment0).getN();
      Variance variance1 = new Variance(secondMoment0);
      variance1.equals(variance0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance1.getResult(), 0.01);
      assertTrue(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      variance0.incrementAll(doubleArray0);
      variance0.hashCode();
      assertEquals(0.0, variance0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance(fourthMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[0];
      double double0 = secondMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
