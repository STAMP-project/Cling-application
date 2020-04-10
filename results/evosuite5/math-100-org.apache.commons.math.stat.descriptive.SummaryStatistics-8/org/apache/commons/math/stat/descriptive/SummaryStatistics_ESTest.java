/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:55:38 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Skewness;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SummaryStatistics_ESTest extends SummaryStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      Variance variance0 = new Variance();
      summaryStatisticsImpl0.addValue((-1338.82038115554));
      // Undeclared exception!
      try { 
        summaryStatisticsImpl0.setMeanImpl(variance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Implementations must be configured before values are added.
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      Variance variance0 = new Variance();
      variance0.increment((-3034.8261544686006));
      summaryStatisticsImpl1.setSumsqImpl(variance0);
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      summaryStatisticsImpl1.addValue(Double.NaN);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertEquals(1L, summaryStatisticsImpl1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      ThirdMoment thirdMoment0 = new ThirdMoment();
      thirdMoment0.increment((-2581.6099372));
      summaryStatisticsImpl1.setMinImpl(thirdMoment0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertFalse(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[2];
      secondMoment0.evaluate(doubleArray0);
      summaryStatisticsImpl1.setMeanImpl(secondMoment0);
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertFalse(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue((-1783.958138248));
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertEquals(1L, summaryStatisticsImpl0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue(1.0);
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertEquals(1L, summaryStatisticsImpl0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      FourthMoment fourthMoment0 = new FourthMoment();
      Mean mean0 = new Mean(fourthMoment0);
      boolean boolean0 = summaryStatistics0.equals(mean0);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      Skewness skewness0 = new Skewness((ThirdMoment) null);
      summaryStatisticsImpl0.setVarianceImpl(skewness0);
      summaryStatisticsImpl0.clear();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.setMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatisticsImpl0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.clear();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      Sum sum0 = new Sum();
      double[] doubleArray0 = new double[5];
      sum0.incrementAll(doubleArray0);
      summaryStatisticsImpl1.setVarianceImpl(sum0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.addValue(Double.NaN);
      summaryStatistics0.addValue(Double.NaN);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(2L, summaryStatistics0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.addValue(Double.NaN);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      summaryStatisticsImpl1.setMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Kurtosis kurtosis0 = new Kurtosis();
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.setVarianceImpl(kurtosis0);
      summaryStatistics0.addValue(3371.1478);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.setMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatisticsImpl0.addValue(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getGeoMeanImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getSumsqImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMeanImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getMaxImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMinImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StatisticalSummary statisticalSummary0 = summaryStatisticsImpl0.getSummary();
      assertEquals(0L, statisticalSummary0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Skewness skewness0 = new Skewness();
      summaryStatistics0.setMaxImpl(skewness0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getSumImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getSumLogImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      summaryStatisticsImpl0.setSumLogImpl(sumOfSquares0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      String string0 = summaryStatisticsImpl0.toString();
      assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.hashCode();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      FourthMoment fourthMoment0 = new FourthMoment();
      Mean mean0 = new Mean(fourthMoment0);
      summaryStatistics0.setSumImpl(mean0);
      fourthMoment0.increment(1178.1648);
      SummaryStatistics summaryStatistics1 = SummaryStatistics.newInstance();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Kurtosis kurtosis0 = new Kurtosis();
      summaryStatistics0.setGeoMeanImpl(kurtosis0);
      summaryStatistics0.addValue(Double.NaN);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatisticsImpl0.getVarianceImpl();
      summaryStatisticsImpl0.setMeanImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertEquals(0L, summaryStatisticsImpl1.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      try { 
        SummaryStatistics.newInstance(class0);
        fail("Expecting exception: InstantiationException");
      
      } catch(InstantiationException e) {
      }
  }
}
