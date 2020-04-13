/*

 * Tue Mar 03 14:43:32 GMT 2020
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
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;
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
      ThirdMoment thirdMoment0 = new ThirdMoment();
      Variance variance0 = new Variance(true, thirdMoment0);
      variance0.increment((-1671.4535226147204));
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Max max0 = new Max();
      // Undeclared exception!
      try { 
        max0.incrementAll((double[]) null);
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
      variance0.increment(0.0);
      GeometricMean geometricMean0 = new GeometricMean();
      geometricMean0.setSumLogImpl(variance0);
      geometricMean0.increment(0.0);
      boolean boolean0 = variance0.equals(geometricMean0);
      assertEquals(2L, geometricMean0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment((-899.0));
      variance0.hashCode();
      assertEquals(1L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Variance variance0 = new Variance();
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(3L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[0];
      variance0.incrementAll(doubleArray0, 0, 0);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      Variance variance0 = new Variance(true, thirdMoment0);
      Min min0 = new Min();
      boolean boolean0 = variance0.equals(min0);
      assertTrue(boolean0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance(true);
      variance0.clear();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1433.9228099280256;
      doubleArray0[1] = (-908.1236);
      doubleArray0[2] = (-908.1236);
      doubleArray0[3] = (-908.1236);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-908.1236);
      doubleArray0[6] = (-908.1236);
      variance0.incrementAll(doubleArray0);
      variance0.increment((-908.1236));
      variance0.increment(0.0);
      variance0.increment(0.0);
      boolean boolean0 = variance0.isBiasCorrected();
      assertEquals(10L, variance0.getN());
      
      Variance variance1 = new Variance();
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(7L).when(secondMoment0).getN();
      Variance variance2 = new Variance(false, secondMoment0);
      boolean boolean1 = variance1.equals(variance2);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
