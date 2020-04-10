/*

 * Tue Mar 03 14:44:40 GMT 2020
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
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
      Mean mean0 = new Mean();
      boolean boolean0 = mean0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(secondMoment0);
      variance0.increment((-836.7));
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      // Undeclared exception!
      try { 
        thirdMoment0.incrementAll((double[]) null);
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
      double[] doubleArray0 = new double[3];
      variance0.incrementAll(doubleArray0);
      assertEquals(3L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double[] doubleArray0 = new double[8];
      thirdMoment0.evaluate(doubleArray0, 4, 4);
      thirdMoment0.equals(variance0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment(0.0);
      variance0.increment(0L);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment((-182.15228791586125));
      double double0 = variance0.getResult();
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[3];
      variance0.incrementAll(doubleArray0, 0, 0);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance();
      Sum sum0 = new Sum();
      boolean boolean0 = variance0.equals(sum0);
      assertTrue(boolean0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      secondMoment0.n = (-3550L);
      Mean mean0 = new Mean();
      variance0.equals(mean0);
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
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      // Undeclared exception!
      try { 
        sumOfLogs0.evaluate((double[]) null);
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
      double[] doubleArray0 = new double[0];
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
