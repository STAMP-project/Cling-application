/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:54:49 GMT 2019
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
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Skewness;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SummaryStatistics_ESTest extends SummaryStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue(671.0);
      // Undeclared exception!
      try { 
        summaryStatisticsImpl0.setMeanImpl((StorelessUnivariateStatistic) null);
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
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
      summaryStatisticsImpl1.setGeoMeanImpl(storelessUnivariateStatistic0);
      summaryStatisticsImpl1.addValue(6.283185307179586);
      assertEquals(1L, summaryStatisticsImpl1.getN());
      
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl0.equals((Object)summaryStatistics0));
      
      Product product0 = new Product();
      product0.increment(2.0);
      summaryStatisticsImpl0.setSumImpl(product0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.n = 3451L;
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertEquals(3451L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatisticsImpl0.getMinImpl();
      double[] doubleArray0 = new double[1];
      storelessUnivariateStatistic0.incrementAll(doubleArray0);
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertEquals(0L, summaryStatisticsImpl1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double[] doubleArray0 = new double[7];
      thirdMoment0.evaluate(doubleArray0);
      summaryStatisticsImpl0.secondMoment = (SecondMoment) thirdMoment0;
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatisticsImpl1.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatistics0.addValue((-4.9E-324));
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertEquals(1L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      summaryStatisticsImpl1.addValue(6.283185307179586);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertEquals(1L, summaryStatisticsImpl1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Object object0 = new Object();
      boolean boolean0 = summaryStatistics0.equals(object0);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.setVarianceImpl((StorelessUnivariateStatistic) null);
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
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Min min0 = new Min();
      double[] doubleArray0 = new double[2];
      summaryStatistics0.setMeanImpl(min0);
      min0.incrementAll(doubleArray0);
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      assertTrue(summaryStatistics0.equals((Object)summaryStatisticsImpl0));
      
      Min min0 = new Min();
      min0.increment((-923.1113960803));
      summaryStatistics0.setVarianceImpl(min0);
      boolean boolean0 = summaryStatistics0.equals(summaryStatisticsImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.addValue((-3378.8803981637016));
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.n = 1925L;
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1925L, summaryStatistics0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      FourthMoment fourthMoment0 = new FourthMoment();
      summaryStatisticsImpl0.setMeanImpl(fourthMoment0);
      summaryStatisticsImpl0.addValue((-53.2717328380531));
      assertEquals(1L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      Min min0 = summaryStatistics0.min;
      summaryStatistics0.setMinImpl(min0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getGeoMeanImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getMeanImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMaxImpl();
      summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic0);
      summaryStatistics0.addValue(0.0);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getVarianceImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StatisticalSummary statisticalSummary0 = summaryStatisticsImpl0.getSummary();
      assertEquals(0L, statisticalSummary0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      Skewness skewness0 = new Skewness();
      summaryStatisticsImpl0.setMaxImpl(skewness0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getSumImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      summaryStatistics0.getSumLogImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Min min0 = new Min();
      summaryStatistics0.setSumLogImpl(min0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      String string0 = summaryStatisticsImpl0.toString();
      assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Product product0 = new Product();
      summaryStatistics0.setSumsqImpl(product0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.setMeanImpl((StorelessUnivariateStatistic) null);
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
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
  public void test29()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertEquals(0L, summaryStatisticsImpl1.getN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      try { 
        SummaryStatistics.newInstance(class0);
        fail("Expecting exception: InstantiationException");
      
      } catch(InstantiationException e) {
      }
  }
}
