/*

 * Tue Mar 03 14:44:59 GMT 2020
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
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      boolean boolean0 = thirdMoment0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      Variance variance0 = new Variance(false, secondMoment0);
      variance0.increment(0);
      assertFalse(variance0.isBiasCorrected());
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
      Variance variance0 = new Variance();
      variance0.increment(4.435960203505978);
      Product product0 = new Product();
      boolean boolean0 = product0.equals(variance0);
      assertEquals(1L, variance0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment((-1.0));
      variance0.increment((-1.0));
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
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
      double[] doubleArray0 = new double[2];
      Variance variance0 = new Variance(false);
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
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
      Variance variance0 = new Variance();
      FourthMoment fourthMoment0 = new FourthMoment();
      boolean boolean0 = fourthMoment0.equals(variance0);
      assertTrue(boolean0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondMoment secondMoment0 = mock(SecondMoment.class, new ViolatedAssumptionAnswer());
      doReturn((-9223372036854775777L)).when(secondMoment0).getN();
      Variance variance0 = new Variance(false, secondMoment0);
      Variance variance1 = new Variance();
      variance0.equals(variance1);
      assertEquals(Double.NaN, variance1.getResult(), 0.01);
      assertTrue(variance1.isBiasCorrected());
      assertFalse(variance0.isBiasCorrected());
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
      double[] doubleArray0 = new double[1];
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
