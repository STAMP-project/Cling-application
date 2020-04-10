/*

 * Tue Mar 03 15:42:40 GMT 2020
 */

package org.apache.commons.math.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.TDistribution;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StatisticalSummaryValues;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics;
import org.apache.commons.math.stat.inference.TTestImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TTestImpl_ESTest extends TTestImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      try { 
        tTestImpl0.tTest(8.44182E-5, (StatisticalSummary) descriptiveStatisticsImpl0);
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
      double[] doubleArray0 = new double[7];
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
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
  public void test03()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      try { 
        tTestImpl0.tTest((StatisticalSummary) descriptiveStatisticsImpl0, (StatisticalSummary) descriptiveStatisticsImpl0);
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues((-1379.643), (-1379.643), 1933L, (-1379.643), (-1379.643), 3317.8423615706);
      double double0 = tTestImpl0.tTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
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
  public void test06()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(1581.08506, (-1.0), 181L, 537.83, Double.NaN, (-1.0));
      boolean boolean0 = tTestImpl0.tTest((double) 3249L, (StatisticalSummary) statisticalSummaryValues0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.t((-1070.2), doubleArray0);
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
      double[] doubleArray0 = new double[2];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 2191.94913979);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2191.94913979
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.homoscedasticTTest((double[]) null, (double[]) null, 22.268362115721295);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 22.268362115721295
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
      double[] doubleArray0 = new double[0];
      try { 
        tTestImpl0.tTest(doubleArray0, doubleArray0, 1687.77887404);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1687.77887404
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.tTest(1295.9668, (StatisticalSummary) synchronizedSummaryStatistics0, 1295.9668);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1295.9668
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[6];
      boolean boolean0 = tTestImpl0.homoscedasticTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[6];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      try { 
        tTestImpl0.t(8.441822398385275E-5, (StatisticalSummary) null);
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
      double[] doubleArray0 = new double[7];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      double[] doubleArray1 = new double[1];
      try { 
        tTestImpl0.t(8.441822398385275E-5, doubleArray1);
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      try { 
        tTestImpl0.t(57.702675967, (StatisticalSummary) summaryStatistics0);
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
      double[] doubleArray0 = new double[2];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.t(2329.808, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 2329.808);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2329.808
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(57.702675967).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(57.702675967).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
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
      double[] doubleArray0 = new double[7];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, (-1639.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -1639.7
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[6];
      boolean boolean0 = tTestImpl0.tTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(57.702675967).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
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
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.tTest((-822.618498650293), (StatisticalSummary) synchronizedSummaryStatistics0, (-1899.7009394952));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -1899.7009394952
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[6];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) descriptiveStatisticsImpl0);
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
      double[] doubleArray0 = new double[0];
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
      double[] doubleArray0 = new double[2];
      tTestImpl0.t(0.5, doubleArray0);
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(57.702675967).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      try { 
        tTestImpl0.t(0.0, (StatisticalSummary) null);
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
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
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(1537.8432426733552, 1537.8432426733552, 454L, 1537.8432426733552, 454L, 1537.8432426733552);
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) null);
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
  public void test32()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[4];
      tTestImpl0.t((-2095.3293854), doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, (-2095.3293854));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -2095.3293854
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[6];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      try { 
        tTestImpl0.t(8.441822398385275E-5, (StatisticalSummary) descriptiveStatistics0);
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
      double[] doubleArray0 = new double[6];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[1];
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      double double1 = tTestImpl0.pairedT(doubleArray0, doubleArray0);
      assertEquals(double1, double0, 0.01);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[3];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[1];
      try { 
        tTestImpl0.t(57.7, doubleArray1);
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(57.7).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[3];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 8.441822398385275E-5);
      double[] doubleArray1 = new double[1];
      try { 
        tTestImpl0.t(57.7, doubleArray1);
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
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) synchronizedDescriptiveStatistics0, (StatisticalSummary) synchronizedDescriptiveStatistics0);
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(1537.8432426733552, 1537.8432426733552, 454L, 1537.8432426733552, 454L, 1537.8432426733552);
      double double0 = tTestImpl0.homoscedasticTTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      try { 
        tTestImpl0.t(0.0, (StatisticalSummary) null);
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(2146771262);
      try { 
        tTestImpl0.tTest((StatisticalSummary) descriptiveStatisticsImpl0, (StatisticalSummary) null);
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[7];
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(1.0, 1.0, 3891L, 3891L, 1.0, 1129.99616);
      double double0 = tTestImpl0.homoscedasticT((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[8];
      tTestImpl0.t(8.441822398385275E-5, doubleArray0);
      double[] doubleArray1 = new double[1];
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
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(8.441822398385275E-5, 8.441822398385275E-5, 1989L, 8.441822398385275E-5, 1989L, 1989L);
      double double0 = tTestImpl0.t((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(0.0, double0, 0.01);
  }
}
