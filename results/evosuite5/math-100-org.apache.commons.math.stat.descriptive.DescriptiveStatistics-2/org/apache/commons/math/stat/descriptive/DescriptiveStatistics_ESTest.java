/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:16:10 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.FirstMoment;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DescriptiveStatistics_ESTest extends DescriptiveStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = null;
      try {
        descriptiveStatistics0 = new DescriptiveStatistics((-2117237398));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // window size must be positive.
         //
         verifyException("org.apache.commons.math.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      descriptiveStatisticsImpl0.addValue((-1));
      double double0 = descriptiveStatisticsImpl0.getStandardDeviation();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      double double0 = descriptiveStatisticsImpl0.getStandardDeviation();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(1);
      descriptiveStatistics0.addValue(Double.NaN);
      descriptiveStatistics0.addValue(Double.NaN);
      assertEquals(1, descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.windowSize = (-647);
      descriptiveStatisticsImpl0.addValue(1);
      assertEquals((-1), DescriptiveStatistics.INFINITE_WINDOW);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue((-135.2));
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
      
      descriptiveStatistics0.setWindowSize(1);
      assertEquals(1, descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getVarianceImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      Median median0 = new Median();
      descriptiveStatisticsImpl0.setMaxImpl(median0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      SecondMoment secondMoment0 = new SecondMoment();
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.setPercentileImpl(secondMoment0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Percentile implementation does not support setQuantile
         //
         verifyException("org.apache.commons.math.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getGeometricMean();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getKurtosisImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      descriptiveStatistics0.setMeanImpl(sumOfLogs0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      UnivariateStatistic univariateStatistic0 = descriptiveStatisticsImpl0.getMaxImpl();
      descriptiveStatisticsImpl0.setSumImpl(univariateStatistic0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.setSkewnessImpl((UnivariateStatistic) null);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getMinImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getSumImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.setVarianceImpl((UnivariateStatistic) null);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSkewnessImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      UnivariateStatistic univariateStatistic0 = descriptiveStatisticsImpl0.getMeanImpl();
      descriptiveStatisticsImpl0.setMinImpl(univariateStatistic0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getPercentileImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSumsq();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      Median median0 = new Median();
      descriptiveStatisticsImpl0.setGeometricMeanImpl(median0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      try { 
        DescriptiveStatistics.newInstance(class0);
        fail("Expecting exception: InstantiationException");
      
      } catch(InstantiationException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getGeometricMeanImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.clear();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      UnivariateStatistic univariateStatistic0 = descriptiveStatistics0.getSumsqImpl();
      descriptiveStatistics0.setSumsqImpl(univariateStatistic0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSum();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      FirstMoment firstMoment0 = new FirstMoment();
      descriptiveStatisticsImpl0.setKurtosisImpl(firstMoment0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      int int0 = descriptiveStatistics0.getWindowSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
      assertEquals(1, descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSortedValues();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }
}
