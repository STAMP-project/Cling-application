/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:19:49 GMT 2019
 */

package org.apache.commons.math.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.TDistributionImpl;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StatisticalSummaryValues;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl;
import org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics;
import org.apache.commons.math.stat.inference.TTestImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TTestImpl_ESTest extends TTestImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[0];
      try { 
        tTestImpl0.t(Double.NaN, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[14];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      tTestImpl0.t((-303.5155160492), doubleArray0);
      try { 
        tTestImpl0.pairedT(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[14];
      tTestImpl0.t(Double.NaN, doubleArray0);
      double[] doubleArray1 = new double[0];
      try { 
        tTestImpl0.pairedT(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.t(3689.34104361021, doubleArray0);
      try { 
        tTestImpl0.pairedT((double[]) null, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      double[] doubleArray1 = new double[0];
      try { 
        tTestImpl0.t(Double.NaN, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[14];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
      tTestImpl0.t((-4507.2), doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, (-4507.2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -4507.2
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.t(1454.0692705571184, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 1157.119904601062);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1157.119904601062
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      try { 
        tTestImpl0.tTest((StatisticalSummary) descriptiveStatistics0, (StatisticalSummary) descriptiveStatistics0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, 335.6936, 2551L, 335.6936, 335.6936, 335.6936);
      double double0 = tTestImpl0.tTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.tTest((double[]) null, (double[]) null, 356.9113);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 356.9113
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      try { 
        tTestImpl0.tTest((StatisticalSummary) descriptiveStatistics0, (StatisticalSummary) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues((-74.717973172172), (-74.717973172172), 441L, (-74.717973172172), (-74.717973172172), (-74.717973172172));
      double double0 = tTestImpl0.t((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) descriptiveStatisticsImpl0, (StatisticalSummary) descriptiveStatisticsImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TDistributionImpl tDistributionImpl0 = new TDistributionImpl(1.7976931348623157E308);
      TTestImpl tTestImpl0 = new TTestImpl(tDistributionImpl0);
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(1.7976931348623157E308, 1.7976931348623157E308, 35L, 0.0, 14.136097974741746, 1.7976931348623157E308);
      double double0 = tTestImpl0.homoscedasticTTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(68.0, tDistributionImpl0.getDegreesOfFreedom(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      try { 
        tTestImpl0.homoscedasticTTest(doubleArray0, doubleArray0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[14];
      boolean boolean0 = tTestImpl0.homoscedasticTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics(26);
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) synchronizedDescriptiveStatistics0, (StatisticalSummary) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.t((double[]) null, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[1];
      try { 
        tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[14];
      boolean boolean0 = tTestImpl0.tTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.tTest((double[]) null, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, 335.6936, 2551L, 335.6936, 335.6936, 335.6936);
      boolean boolean0 = tTestImpl0.tTest(Double.NaN, (StatisticalSummary) statisticalSummaryValues0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.tTest((-1.0), (StatisticalSummary) null, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -1.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      try { 
        tTestImpl0.tTest((-803.706606516), (StatisticalSummary) summaryStatistics0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.tTest(1.7976931348623157E308, (StatisticalSummary) synchronizedSummaryStatistics0, 1.7976931348623157E308);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1.7976931348623157E308
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues((-2543.18399), (-2543.18399), 1384L, 2285.2846361714137, 4.0, 2285.2846361714137);
      double double0 = tTestImpl0.homoscedasticT((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedT(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[0];
      try { 
        tTestImpl0.pairedT(doubleArray1, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      double double1 = tTestImpl0.pairedT(doubleArray0, doubleArray0);
      assertEquals(double1, double0, 0.01);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.homoscedasticT(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[24];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedT((double[]) null, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) summaryStatisticsImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[24];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.homoscedasticT((double[]) null, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, (-2927.7099186759633));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -2927.7099186759633
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 307.031735);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 307.031735
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      try { 
        tTestImpl0.homoscedasticT(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) summaryStatisticsImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[24];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      try { 
        tTestImpl0.homoscedasticT((double[]) null, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }
}
