/*

 * Tue Mar 03 15:44:17 GMT 2020
 */

package org.apache.commons.math.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.TDistribution;
import org.apache.commons.math.distribution.TDistributionImpl;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StatisticalSummaryValues;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
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
      TTestImpl tTestImpl0 = new TTestImpl();
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      try { 
        tTestImpl0.tTest(22.707912037936126, (StatisticalSummary) descriptiveStatistics0);
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
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.5;
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray1, 0.5);
      assertTrue(boolean0);
      
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray1);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.5;
      tTestImpl0.pairedTTest(doubleArray0, doubleArray1, 0.5);
      try { 
        tTestImpl0.homoscedasticT(doubleArray1, (double[]) null);
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
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      try { 
        tTestImpl0.tTest((StatisticalSummary) synchronizedDescriptiveStatistics0, (StatisticalSummary) synchronizedDescriptiveStatistics0);
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
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(17.5, 17.5, 254L, 4.0, 4.0, 4.0);
      double double0 = tTestImpl0.tTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.5;
      tTestImpl0.pairedTTest(doubleArray0, doubleArray1, 0.5);
      try { 
        tTestImpl0.homoscedasticT((double[]) null, doubleArray1);
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues((-295.1038678), (-883.914649866861), 2L, Double.NaN, Double.NaN, 3931.3603712859863);
      boolean boolean0 = tTestImpl0.tTest(Double.NaN, (StatisticalSummary) statisticalSummaryValues0, 0.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.t((-785.6648441329058), doubleArray0);
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
  public void test08()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.homoscedasticTTest((double[]) null, (double[]) null, 614.37665);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 614.37665
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[6];
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
  public void test11()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      try { 
        tTestImpl0.tTest(doubleArray0, doubleArray0, 11.259600089814422);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 11.259600089814422
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.tTest(1.0, (StatisticalSummary) synchronizedSummaryStatistics0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      TTestImpl tTestImpl0 = new TTestImpl();
      boolean boolean0 = tTestImpl0.homoscedasticTTest(doubleArray0, doubleArray0, 0.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.5;
      tTestImpl0.pairedTTest(doubleArray0, doubleArray1, 0.5);
      try { 
        tTestImpl0.t(0.5, (StatisticalSummary) null);
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
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.5;
      tTestImpl0.pairedTTest(doubleArray0, doubleArray1, 0.5);
      double[] doubleArray2 = new double[0];
      try { 
        tTestImpl0.t(0.5, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.5;
      tTestImpl0.pairedTTest(doubleArray0, doubleArray1, 0.5);
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(2142135416);
      try { 
        tTestImpl0.t((double) (-1), (StatisticalSummary) descriptiveStatistics0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      tTestImpl0.t(Double.NaN, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 382.76986075);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 382.76986075
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
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
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, (-185.288208835));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -185.288208835
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      boolean boolean0 = tTestImpl0.tTest(doubleArray0, doubleArray0, 1.0E-15);
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
      double[] doubleArray0 = new double[2];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
      try { 
        tTestImpl0.homoscedasticT((double[]) null, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.tTest((-3054.845022), (StatisticalSummary) synchronizedSummaryStatistics0, (-3054.845022));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -3054.845022
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) synchronizedSummaryStatistics0);
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
      double[] doubleArray0 = new double[0];
      TTestImpl tTestImpl0 = new TTestImpl();
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
  public void test27()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.t(Double.NaN, doubleArray0);
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
  public void test28()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
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
  public void test29()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
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
  public void test30()  throws Throwable  {
      TDistributionImpl tDistributionImpl0 = new TDistributionImpl(271.37707144015735);
      TTestImpl tTestImpl0 = new TTestImpl(tDistributionImpl0);
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) summaryStatistics0, (StatisticalSummary) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) synchronizedSummaryStatistics0);
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
  public void test33()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[15];
      tTestImpl0.t(3264.696120504, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -Infinity
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
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
  public void test35()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      double double0 = tTestImpl0.pairedT(doubleArray0, doubleArray0);
      double double1 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      assertEquals(double1, double0, 0.01);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
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
  public void test37()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[5];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[0];
      try { 
        tTestImpl0.t(0.5, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
      double[] doubleArray1 = new double[0];
      try { 
        tTestImpl0.t(0.5, doubleArray1);
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
      TTestImpl tTestImpl0 = new TTestImpl();
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) descriptiveStatistics0, (StatisticalSummary) descriptiveStatistics0);
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, Double.NaN, 1395L, (-327.51515638144036), (-327.51515638144036), (-3169.66645797467));
      double double0 = tTestImpl0.homoscedasticTTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
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
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.homoscedasticT((double[]) null, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TDistributionImpl tDistributionImpl0 = new TDistributionImpl(1955.712);
      TTestImpl tTestImpl0 = new TTestImpl(tDistributionImpl0);
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(1955.712, 1955.712, 959L, 1311.9338222422246, 1311.9338222422246, 1311.9338222422246);
      double double0 = tTestImpl0.homoscedasticT((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[6];
      tTestImpl0.t(4.0, doubleArray0);
      double[] doubleArray1 = new double[0];
      try { 
        tTestImpl0.pairedT(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl((TDistribution) null);
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues((-1803.5506), (-1803.5506), 2903L, (-1803.5506), 2903L, 2903L);
      double double0 = tTestImpl0.t((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
