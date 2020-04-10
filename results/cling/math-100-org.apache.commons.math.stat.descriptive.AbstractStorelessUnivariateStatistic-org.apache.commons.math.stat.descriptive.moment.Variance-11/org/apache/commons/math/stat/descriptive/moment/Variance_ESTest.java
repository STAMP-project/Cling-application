/*

 * Tue Mar 03 14:44:05 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
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
      variance0.increment(0L);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.setBiasCorrected(false);
      FourthMoment fourthMoment0 = new FourthMoment();
      variance0.moment = (SecondMoment) fourthMoment0;
      double[] doubleArray0 = new double[9];
      fourthMoment0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(0.0, variance0.getResult(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[9];
      double double0 = secondMoment0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment(1.0);
      Mean mean0 = new Mean();
      boolean boolean0 = variance0.equals(mean0);
      assertEquals(1L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      FourthMoment fourthMoment0 = new FourthMoment();
      variance0.moment = (SecondMoment) fourthMoment0;
      double[] doubleArray0 = new double[9];
      fourthMoment0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(0.0, variance0.getResult(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Variance variance0 = new Variance(true);
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation();
      Mean mean0 = new Mean(fourthMoment0);
      boolean boolean0 = standardDeviation0.equals(mean0);
      assertTrue(boolean0);
      assertTrue(standardDeviation0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(3287L).when(secondMoment0).getN();
      Variance variance0 = new Variance(true, secondMoment0);
      ThirdMoment thirdMoment0 = new ThirdMoment();
      variance0.equals(thirdMoment0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Mean mean0 = new Mean(fourthMoment0);
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null);
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
      double[] doubleArray0 = new double[5];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
