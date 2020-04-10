/*

 * Tue Mar 03 14:43:28 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
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
      Min min0 = new Min();
      Object object0 = new Object();
      boolean boolean0 = min0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.increment(986.7);
      assertTrue(variance0.isBiasCorrected());
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
      Variance variance0 = new Variance();
      variance0.increment(Double.NaN);
      Min min0 = new Min();
      boolean boolean0 = variance0.equals(min0);
      assertEquals(1L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment(280.2);
      variance0.increment(295.46166614173);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(116.4592267108142, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[0];
      double double0 = fourthMoment0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[2];
      secondMoment0.incrementAll(doubleArray0);
      Variance variance0 = new Variance(false, secondMoment0);
      double double0 = variance0.getResult();
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[0];
      fourthMoment0.incrementAll(doubleArray0);
      assertEquals(Double.NaN, fourthMoment0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment((-3531.2788810536));
      Min min0 = new Min();
      min0.increment(0.0);
      boolean boolean0 = variance0.equals(min0);
      assertEquals(1L, variance0.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(secondMoment0).getN();
      Variance variance0 = new Variance(secondMoment0);
      Max max0 = new Max();
      variance0.equals(max0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[5];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      FourthMoment fourthMoment0 = new FourthMoment();
      double double0 = fourthMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
