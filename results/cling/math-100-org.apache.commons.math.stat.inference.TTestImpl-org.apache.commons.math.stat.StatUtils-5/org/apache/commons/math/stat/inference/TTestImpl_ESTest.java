/*

 * Tue Mar 03 15:43:11 GMT 2020
 */

package org.apache.commons.math.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StatisticalSummaryValues;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl;
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      try { 
        tTestImpl0.tTest((-1282.38105670858), (StatisticalSummary) descriptiveStatisticsImpl0);
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
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1731.0;
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray1, doubleArray0, 0.5);
      assertTrue(boolean0);
      
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray1);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1731.0;
      tTestImpl0.pairedTTest(doubleArray1, doubleArray0, 0.5);
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
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
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
  public void test04()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, Double.NaN, 1520L, 1520L, Double.NaN, (-570.318921983));
      double double0 = tTestImpl0.tTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1731.0;
      tTestImpl0.pairedTTest(doubleArray1, doubleArray0, 0.5);
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
  public void test06()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, Double.NaN, 420L, (-283.49), Double.NaN, (-283.49));
      boolean boolean0 = tTestImpl0.tTest(Double.NaN, (StatisticalSummary) statisticalSummaryValues0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.t(218.996488555, doubleArray0);
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
      double[] doubleArray0 = new double[4];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 282.259);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 282.259
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.homoscedasticTTest((double[]) null, (double[]) null, 562.1919627383505);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 562.1919627383505
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
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
        tTestImpl0.tTest(doubleArray0, doubleArray0, 2433.6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2433.6
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      try { 
        tTestImpl0.tTest(2003.2377930860348, (StatisticalSummary) summaryStatisticsImpl0, 2003.2377930860348);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2003.2377930860348
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      boolean boolean0 = tTestImpl0.homoscedasticTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1731.0;
      tTestImpl0.pairedTTest(doubleArray1, doubleArray0, 0.5);
      try { 
        tTestImpl0.t(1731.0, (StatisticalSummary) null);
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
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1731.0;
      tTestImpl0.pairedTTest(doubleArray1, doubleArray0, 0.5);
      double[] doubleArray2 = new double[1];
      try { 
        tTestImpl0.t((-1.0), doubleArray2);
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
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1731.0;
      tTestImpl0.pairedTTest(doubleArray1, doubleArray0, 0.5);
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
  public void test17()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.t(Double.NaN, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 282.259);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 282.259
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[5];
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
  public void test20()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, (-1111.5484768568));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -1111.5484768568
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
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
      double[] doubleArray0 = new double[20];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
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
  public void test24()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      try { 
        tTestImpl0.tTest((-2400.0), (StatisticalSummary) summaryStatistics0, (-2400.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -2400.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) descriptiveStatistics0);
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
  public void test27()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.t(Double.NaN, doubleArray0);
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
  public void test28()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
      try { 
        tTestImpl0.t(1731.0, (StatisticalSummary) null);
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
      double[] doubleArray0 = new double[4];
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
  public void test30()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) summaryStatisticsImpl0, (StatisticalSummary) null);
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
      double[] doubleArray0 = new double[3];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
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
      double[] doubleArray0 = new double[20];
      tTestImpl0.t((-2457.850699939213), doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -1.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
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
  public void test35()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      double double0 = tTestImpl0.pairedT(doubleArray0, doubleArray0);
      double double1 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      assertEquals(double1, double0, 0.01);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[5];
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
      double[] doubleArray0 = new double[3];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[1];
      try { 
        tTestImpl0.t((-1.0), doubleArray1);
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
      double[] doubleArray0 = new double[3];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
      double[] doubleArray1 = new double[1];
      try { 
        tTestImpl0.t((-1.0), doubleArray1);
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
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
  public void test40()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(355.67354321, 1346.00711991813, 3L, 1346.00711991813, (-3432.1062415), (-3432.1062415));
      double double0 = tTestImpl0.homoscedasticTTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.t(1731.0, (StatisticalSummary) null);
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
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      try { 
        tTestImpl0.tTest((StatisticalSummary) summaryStatistics0, (StatisticalSummary) null);
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
      double[] doubleArray0 = new double[9];
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
  public void test44()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, (-448.37889), 1363L, Double.NaN, Double.NaN, Double.NaN);
      double double0 = tTestImpl0.homoscedasticT((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.t(Double.NaN, doubleArray0);
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
  public void test46()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, Double.NaN, 420L, (-283.49), Double.NaN, (-2153.9766699229644));
      double double0 = tTestImpl0.t((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
