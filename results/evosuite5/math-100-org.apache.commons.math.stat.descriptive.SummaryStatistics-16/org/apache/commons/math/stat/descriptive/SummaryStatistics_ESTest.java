/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:46:03 GMT 2019
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
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SummaryStatistics_ESTest extends SummaryStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue((-2632.436022586));
      SecondMoment secondMoment0 = new SecondMoment();
      // Undeclared exception!
      try { 
        summaryStatisticsImpl0.setSumImpl(secondMoment0);
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
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SecondMoment secondMoment0 = summaryStatistics0.secondMoment;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = Double.NaN;
      secondMoment0.incrementAll(doubleArray0);
      SummaryStatistics summaryStatistics1 = SummaryStatistics.newInstance();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      SecondMoment secondMoment0 = new SecondMoment();
      secondMoment0.increment(2417.5543);
      summaryStatisticsImpl1.setSumsqImpl(secondMoment0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      SummaryStatistics summaryStatistics1 = SummaryStatistics.newInstance();
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      
      double[] doubleArray0 = new double[2];
      Sum sum0 = summaryStatistics1.sum;
      sum0.incrementAll(doubleArray0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.n = 1140L;
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertEquals(1140L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance(fourthMoment0);
      fourthMoment0.increment(1.0);
      summaryStatisticsImpl0.setMinImpl(variance0);
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatisticsImpl1.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      ThirdMoment thirdMoment0 = new ThirdMoment();
      thirdMoment0.increment((-1.0));
      summaryStatisticsImpl1.secondMoment = (SecondMoment) thirdMoment0;
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      summaryStatisticsImpl1.addValue((-2569.5969514));
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertEquals(1L, summaryStatisticsImpl1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue(1280.7154407953);
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertEquals(1L, summaryStatisticsImpl0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SecondMoment secondMoment0 = summaryStatistics0.secondMoment;
      Mean mean0 = new Mean(secondMoment0);
      boolean boolean0 = summaryStatistics0.equals(mean0);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(false, thirdMoment0);
      double[] doubleArray0 = new double[8];
      thirdMoment0.evaluate(doubleArray0);
      summaryStatistics0.setVarianceImpl(standardDeviation0);
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      SecondMoment secondMoment0 = summaryStatistics0.secondMoment;
      Mean mean0 = new Mean(secondMoment0);
      double[] doubleArray0 = new double[10];
      secondMoment0.evaluate(doubleArray0);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      summaryStatistics1.setMeanImpl(mean0);
      summaryStatistics1.clear();
      assertEquals(0L, summaryStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(false, thirdMoment0);
      double[] doubleArray0 = new double[8];
      thirdMoment0.evaluate(doubleArray0);
      summaryStatistics0.setVarianceImpl(standardDeviation0);
      StatisticalSummary statisticalSummary0 = summaryStatistics0.getSummary();
      assertEquals(0.0, statisticalSummary0.getVariance(), 0.01);
      assertEquals(0L, statisticalSummary0.getN());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.addValue(0.0);
      summaryStatistics0.addValue(6.0);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(2L, summaryStatistics0.getN());
      assertEquals(4.242640687119285, double0, 0.01);
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
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumImpl();
      summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
      summaryStatistics0.addValue(4298.839);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.addValue(Double.NaN);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getGeoMeanImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getSumsqImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
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
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getMinImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getVarianceImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      Sum sum0 = new Sum();
      summaryStatisticsImpl0.setMaxImpl(sum0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(false, thirdMoment0);
      summaryStatistics0.setVarianceImpl(standardDeviation0);
      summaryStatistics0.addValue(Double.NaN);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Sum sum0 = new Sum();
      summaryStatistics0.setGeoMeanImpl(sum0);
      summaryStatistics0.addValue(Double.POSITIVE_INFINITY);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      StandardDeviation standardDeviation0 = new StandardDeviation(false, thirdMoment0);
      summaryStatistics0.setSumLogImpl(standardDeviation0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      String string0 = summaryStatistics0.toString();
      assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatisticsImpl0.getSumLogImpl();
      summaryStatisticsImpl0.setSumImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertEquals(0L, summaryStatistics0.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<GeometricMean> class0 = GeometricMean.class;
      // Undeclared exception!
      try { 
        SummaryStatistics.newInstance(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math.stat.descriptive.moment.GeometricMean cannot be cast to org.apache.commons.math.stat.descriptive.SummaryStatistics
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }
}
