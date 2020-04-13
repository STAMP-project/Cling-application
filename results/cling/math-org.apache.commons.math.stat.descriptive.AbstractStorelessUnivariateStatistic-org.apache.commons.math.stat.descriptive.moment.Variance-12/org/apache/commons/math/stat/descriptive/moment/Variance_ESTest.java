/*

 * Tue Mar 03 14:44:12 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(true, secondMoment0);
      Object object0 = new Object();
      variance0.equals(object0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance(true, fourthMoment0);
      variance0.increment(0L);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(false, secondMoment0);
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
      Min min0 = new Min();
      double[] doubleArray0 = new double[5];
      min0.incrementAll(doubleArray0);
      assertEquals(5, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(secondMoment0).getResult();
      SecondMoment secondMoment1 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(true, secondMoment1);
      boolean boolean0 = variance0.equals(secondMoment0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment((-1077.8067));
      variance0.increment(1594.59830043668);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(3570874.2431794857, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondMoment secondMoment0 = new SecondMoment();
      double double0 = secondMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(true);
      variance0.increment(2.0);
      double double0 = variance0.getResult();
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment((-1077.8067));
      variance0.increment(1594.59830043668);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(1785437.1215897428, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      variance0.incrementAll(doubleArray0, 0, 0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(secondMoment0).getN();
      Variance variance0 = new Variance(true, secondMoment0);
      FourthMoment fourthMoment0 = new FourthMoment();
      boolean boolean0 = variance0.equals(fourthMoment0);
      assertTrue(boolean0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn((-1169L)).when(secondMoment0).getN();
      Variance variance0 = new Variance(true, secondMoment0);
      GeometricMean geometricMean0 = new GeometricMean();
      boolean boolean0 = geometricMean0.equals(variance0);
      assertTrue(boolean0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance(true, fourthMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      // Undeclared exception!
      try { 
        thirdMoment0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[9];
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
