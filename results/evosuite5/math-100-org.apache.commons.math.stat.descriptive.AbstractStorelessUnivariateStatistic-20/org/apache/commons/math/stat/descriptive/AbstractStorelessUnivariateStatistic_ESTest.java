/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:43:24 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStorelessUnivariateStatistic_ESTest extends AbstractStorelessUnivariateStatistic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      fourthMoment0.incrementAll(doubleArray0);
      FourthMoment fourthMoment1 = new FourthMoment();
      boolean boolean0 = fourthMoment1.equals(fourthMoment0);
      assertEquals(5L, fourthMoment0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      FourthMoment fourthMoment1 = new FourthMoment();
      assertTrue(fourthMoment1.equals((Object)fourthMoment0));
      
      fourthMoment0.increment(0.0);
      boolean boolean0 = fourthMoment1.equals(fourthMoment0);
      assertFalse(fourthMoment1.equals((Object)fourthMoment0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      FourthMoment fourthMoment1 = new FourthMoment();
      boolean boolean0 = fourthMoment1.equals(fourthMoment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      Object object0 = new Object();
      boolean boolean0 = thirdMoment0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[1];
      fourthMoment0.incrementAll(doubleArray0, 0, 0);
      assertEquals(0L, fourthMoment0.getN());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
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
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(0.0, thirdMoment0.getResult(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double double0 = thirdMoment0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
  public void test9()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      fourthMoment0.hashCode();
  }
}
