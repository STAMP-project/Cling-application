/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:54:23 GMT 2019
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
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
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
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.addValue(10.0);
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumImpl();
      // Undeclared exception!
      try { 
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic0);
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
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      mean0.incrementAll(doubleArray0);
      summaryStatistics0.setVarianceImpl(mean0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SumOfSquares sumOfSquares0 = summaryStatisticsImpl0.sumsq;
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      sumOfSquares0.increment(0.0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      sumOfSquares0.increment((-3482.606951524));
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      assertTrue(summaryStatistics0.equals((Object)summaryStatisticsImpl0));
      
      summaryStatisticsImpl0.setSumImpl(sumOfSquares0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      summaryStatistics1.n = 1747L;
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(1747L, summaryStatistics1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SumOfSquares sumOfSquares0 = summaryStatisticsImpl0.sumsq;
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.setMinImpl(sumOfSquares0);
      sumOfSquares0.increment((-383.307316283));
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      FourthMoment fourthMoment0 = new FourthMoment();
      summaryStatistics0.secondMoment = (SecondMoment) fourthMoment0;
      fourthMoment0.increment(644.9627);
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SumOfSquares sumOfSquares0 = summaryStatistics0.sumsq;
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      summaryStatistics1.setSumLogImpl(sumOfSquares0);
      summaryStatistics1.addValue(6.0);
      summaryStatistics0.clear();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(1L, summaryStatistics1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      summaryStatisticsImpl1.addValue(3348.538389242236);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertEquals(1L, summaryStatisticsImpl1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      boolean boolean0 = summaryStatistics0.equals("#-f04`-");
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Variance variance0 = new Variance();
      summaryStatistics0.variance = variance0;
      variance0.increment(0.0);
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      summaryStatistics0.setMeanImpl(sumOfSquares0);
      summaryStatistics0.addValue(800.233456558);
      assertEquals(1L, summaryStatistics0.getN());
      
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue(870.0);
      summaryStatisticsImpl0.addValue(0.0);
      double double0 = summaryStatisticsImpl0.getStandardDeviation();
      assertEquals(2L, summaryStatisticsImpl0.getN());
      assertEquals(615.1828996322963, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Sum sum0 = summaryStatistics0.sum;
      summaryStatistics0.setGeoMeanImpl(sum0);
      summaryStatistics0.addValue(Double.NaN);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      GeometricMean geometricMean0 = new GeometricMean();
      summaryStatisticsImpl0.setVarianceImpl(geometricMean0);
      summaryStatisticsImpl0.addValue(870.0);
      summaryStatisticsImpl0.addValue(0.0);
      double double0 = summaryStatisticsImpl0.getStandardDeviation();
      assertEquals(2L, summaryStatisticsImpl0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      summaryStatistics0.setMeanImpl(sumOfSquares0);
      summaryStatistics0.addValue(800.233456558);
      summaryStatistics0.toString();
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumsqImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getMeanImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getMaxImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getMinImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      StatisticalSummary statisticalSummary0 = summaryStatistics0.getSummary();
      assertEquals(0L, statisticalSummary0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Kurtosis kurtosis0 = new Kurtosis();
      summaryStatistics0.setMaxImpl(kurtosis0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumLogImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getGeoMeanImpl();
      summaryStatisticsImpl0.setSumLogImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      String string0 = summaryStatistics0.toString();
      assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.hashCode();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatisticsImpl0.getVarianceImpl();
      summaryStatisticsImpl0.setMeanImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertTrue(boolean0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        SummaryStatistics.newInstance(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.math.stat.descriptive.SummaryStatistics
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }
}
