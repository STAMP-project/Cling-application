/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:54:54 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.Skewness;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DescriptiveStatistics_ESTest extends DescriptiveStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue((-1));
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
      
      descriptiveStatistics0.setWindowSize(1);
      assertEquals(1, descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = null;
      try {
        descriptiveStatistics0 = new DescriptiveStatistics((-232));
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
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue((-1));
      double double0 = descriptiveStatistics0.getStandardDeviation();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
      
      descriptiveStatistics0.setWindowSize(1);
      descriptiveStatistics0.addValue((-1));
      descriptiveStatistics0.addValue(1.0E-19);
      assertEquals(1, descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.windowSize = (-350);
      descriptiveStatisticsImpl0.addValue(0.0);
      assertEquals((-350), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getVarianceImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue((-1));
      descriptiveStatistics0.addValue((-1));
      double double0 = descriptiveStatistics0.getStandardDeviation();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      Min min0 = new Min();
      descriptiveStatistics0.setMaxImpl(min0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getGeometricMean();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getKurtosisImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      Mean mean0 = new Mean();
      descriptiveStatistics0.setMeanImpl(mean0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      Skewness skewness0 = new Skewness();
      descriptiveStatisticsImpl0.setSkewnessImpl(skewness0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      UnivariateStatistic univariateStatistic0 = descriptiveStatisticsImpl0.getMeanImpl();
      descriptiveStatisticsImpl0.setSumImpl(univariateStatistic0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSumsqImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getMinImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getSumImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      FourthMoment fourthMoment0 = new FourthMoment();
      descriptiveStatistics0.setVarianceImpl(fourthMoment0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      UnivariateStatistic univariateStatistic0 = descriptiveStatisticsImpl0.getSkewnessImpl();
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.setPercentileImpl(univariateStatistic0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Percentile implementation does not support setQuantile
         //
         verifyException("org.apache.commons.math.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getMaxImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      GeometricMean geometricMean0 = new GeometricMean();
      descriptiveStatisticsImpl0.setMinImpl(geometricMean0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getPercentileImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getSumsq();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      descriptiveStatistics0.setGeometricMeanImpl(thirdMoment0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
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
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getGeometricMeanImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.clear();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.setSumsqImpl((UnivariateStatistic) null);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getSum();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      GeometricMean geometricMean0 = new GeometricMean();
      descriptiveStatistics0.setKurtosisImpl(geometricMean0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      int int0 = descriptiveStatistics0.getWindowSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      String string0 = descriptiveStatistics0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSortedValues();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }
}
