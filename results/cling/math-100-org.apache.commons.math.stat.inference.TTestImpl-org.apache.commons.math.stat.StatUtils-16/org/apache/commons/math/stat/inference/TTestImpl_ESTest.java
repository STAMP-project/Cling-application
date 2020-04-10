/*

 * Tue Mar 03 15:44:30 GMT 2020
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
import org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl;
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
      SynchronizedSummaryStatistics synchronizedSummaryStatistics0 = new SynchronizedSummaryStatistics();
      try { 
        tTestImpl0.tTest((-388.15), (StatisticalSummary) synchronizedSummaryStatistics0);
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(2941.040259736).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[8];
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues((-639.5260777720199), 559.6, 2L, (-639.5260777720199), 559.6, 0.5);
      boolean boolean0 = tTestImpl0.tTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0, 0.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(2941.0402597364714).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[9];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, 2L, 2L, Double.NaN, (-1745.85277), Double.NaN);
      boolean boolean0 = tTestImpl0.tTest(2.1743961811521265E-4, (StatisticalSummary) statisticalSummaryValues0, 2.1743961811521265E-4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.t((-1.0), doubleArray0);
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
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 1533.3688768);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 1533.3688768
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      try { 
        tTestImpl0.homoscedasticTTest((double[]) null, (double[]) null, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[10];
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
      try { 
        tTestImpl0.tTest((double[]) null, (double[]) null, 6.079671329609731);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 6.079671329609731
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      SynchronizedDescriptiveStatistics synchronizedDescriptiveStatistics0 = new SynchronizedDescriptiveStatistics();
      try { 
        tTestImpl0.tTest(4.0, (StatisticalSummary) synchronizedDescriptiveStatistics0, 4.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 4.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      boolean boolean0 = tTestImpl0.homoscedasticTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      boolean boolean0 = tTestImpl0.tTest(doubleArray0, doubleArray0, 3.6899182659531625E-6);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[9];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
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
  public void test16()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
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
  public void test17()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      try { 
        tTestImpl0.t(Double.NaN, (StatisticalSummary) summaryStatistics0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[2];
      tTestImpl0.t((-2904.814), doubleArray0);
      try { 
        tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: Infinity
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(488.97286388935).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[9];
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
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[18];
      tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
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
  public void test23()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      try { 
        tTestImpl0.tTest((-3201.15932908), (StatisticalSummary) descriptiveStatistics0, (double) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -1.0
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[9];
      tTestImpl0.pairedT(doubleArray0, doubleArray0);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      try { 
        tTestImpl0.t(2941.0402597364714, (StatisticalSummary) descriptiveStatisticsImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data for t statistic
         //
         verifyException("org.apache.commons.math.stat.inference.TTestImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      TTestImpl tTestImpl0 = new TTestImpl();
      tTestImpl0.t(1.0, doubleArray0);
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
  public void test27()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
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
  public void test28()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[4];
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(2941.0402597364714).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[9];
      tTestImpl0.pairedTTest(doubleArray0, doubleArray0, 0.5);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      try { 
        tTestImpl0.t(2941.0402597364714, (StatisticalSummary) descriptiveStatisticsImpl0);
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
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
      tTestImpl0.t(660.1987007613917, doubleArray0);
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
  public void test33()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[10];
      boolean boolean0 = tTestImpl0.pairedTTest(doubleArray0, doubleArray0, Double.NaN);
      assertFalse(boolean0);
      
      double double0 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[10];
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
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[10];
      double double0 = tTestImpl0.pairedT(doubleArray0, doubleArray0);
      double double1 = tTestImpl0.homoscedasticT(doubleArray0, doubleArray0);
      assertEquals(double1, double0, 0.01);
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[9];
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
      double[] doubleArray0 = new double[9];
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
      TDistribution tDistribution0 = mock(TDistribution.class, new ViolatedAssumptionAnswer());
      doReturn(2941.0402597364714).when(tDistribution0).cumulativeProbability(anyDouble() , anyDouble());
      TTestImpl tTestImpl0 = new TTestImpl(tDistribution0);
      double[] doubleArray0 = new double[9];
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
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      try { 
        tTestImpl0.homoscedasticTTest((StatisticalSummary) summaryStatisticsImpl0, (StatisticalSummary) summaryStatisticsImpl0);
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(3.6899182659531625E-6, Double.NaN, 3060L, 3.6899182659531625E-6, 3.6899182659531625E-6, 50.0);
      double double0 = tTestImpl0.homoscedasticTTest((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[3];
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
      double[] doubleArray0 = new double[7];
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
      TTestImpl tTestImpl0 = new TTestImpl();
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, Double.NaN, 2L, Double.NaN, Double.NaN, Double.NaN);
      double double0 = tTestImpl0.homoscedasticT((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TTestImpl tTestImpl0 = new TTestImpl();
      double[] doubleArray0 = new double[7];
      tTestImpl0.t(660.1987007613917, doubleArray0);
      double[] doubleArray1 = new double[1];
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
      StatisticalSummaryValues statisticalSummaryValues0 = new StatisticalSummaryValues(Double.NaN, Double.NaN, 2L, Double.NaN, Double.NaN, 2L);
      double double0 = tTestImpl0.t((StatisticalSummary) statisticalSummaryValues0, (StatisticalSummary) statisticalSummaryValues0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
