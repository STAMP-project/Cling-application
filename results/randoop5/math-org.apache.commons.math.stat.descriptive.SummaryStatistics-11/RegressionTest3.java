import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        long long2 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double4 = summaryStatistics3.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics3.getSumImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic5);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics7.getMaxImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic9);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics0.getSumImpl();
        double double12 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double16 = summaryStatistics15.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double18 = summaryStatistics17.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics17.getSumImpl();
        summaryStatistics15.setVarianceImpl(storelessUnivariateStatistic19);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics15.getMeanImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic21);
        double double23 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(summaryStatistics7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        long long3 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        double double5 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumImpl();
        double double3 = summaryStatistics0.getStandardDeviation();
        double double4 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        long long6 = summaryStatistics0.getN();
        double double7 = summaryStatistics0.getMean();
        double double8 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getMaxImpl();
        double double3 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        double double2 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getGeoMeanImpl();
        double double6 = summaryStatistics0.getVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getMin();
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getMin();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        double double2 = summaryStatistics0.getSumsq();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        long long3 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics4.getSumImpl();
        double double7 = summaryStatistics4.getStandardDeviation();
        double double8 = summaryStatistics4.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics9.getVarianceImpl();
        double double11 = summaryStatistics9.getMin();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double15 = summaryStatistics14.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = null;
        summaryStatistics14.setMeanImpl(storelessUnivariateStatistic16);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics18.getVarianceImpl();
        summaryStatistics14.setMeanImpl(storelessUnivariateStatistic19);
        summaryStatistics12.setGeoMeanImpl(storelessUnivariateStatistic19);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double23 = summaryStatistics22.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = null;
        summaryStatistics22.setMeanImpl(storelessUnivariateStatistic24);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics26.getVarianceImpl();
        summaryStatistics22.setMeanImpl(storelessUnivariateStatistic27);
        summaryStatistics12.setSumsqImpl(storelessUnivariateStatistic27);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = summaryStatistics30.getSumLogImpl();
        summaryStatistics12.setMinImpl(storelessUnivariateStatistic31);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double36 = summaryStatistics35.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = null;
        summaryStatistics35.setMeanImpl(storelessUnivariateStatistic37);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics39.getVarianceImpl();
        summaryStatistics35.setMeanImpl(storelessUnivariateStatistic40);
        summaryStatistics33.setGeoMeanImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double44 = summaryStatistics43.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic45 = null;
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic45);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = summaryStatistics47.getVarianceImpl();
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic48);
        summaryStatistics33.setSumsqImpl(storelessUnivariateStatistic48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics51 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic52 = summaryStatistics51.getSumLogImpl();
        summaryStatistics33.setMinImpl(storelessUnivariateStatistic52);
        double double54 = summaryStatistics33.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic55 = summaryStatistics33.getSumsqImpl();
        summaryStatistics12.setMaxImpl(storelessUnivariateStatistic55);
        summaryStatistics9.setGeoMeanImpl(storelessUnivariateStatistic55);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics58 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double59 = summaryStatistics58.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics60 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double61 = summaryStatistics60.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic62 = null;
        summaryStatistics60.setMeanImpl(storelessUnivariateStatistic62);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics64 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic65 = summaryStatistics64.getVarianceImpl();
        summaryStatistics60.setMeanImpl(storelessUnivariateStatistic65);
        summaryStatistics58.setGeoMeanImpl(storelessUnivariateStatistic65);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics68 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic69 = summaryStatistics68.getSumLogImpl();
        summaryStatistics58.setVarianceImpl(storelessUnivariateStatistic69);
        double double71 = summaryStatistics58.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic72 = summaryStatistics58.getMinImpl();
        summaryStatistics9.setMaxImpl(storelessUnivariateStatistic72);
        summaryStatistics4.setMaxImpl(storelessUnivariateStatistic72);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic72);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic76 = summaryStatistics0.getMaxImpl();
        double double77 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics78 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double79 = summaryStatistics78.getMean();
        double double80 = summaryStatistics78.getMin();
        double double81 = summaryStatistics78.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic82 = summaryStatistics78.getMeanImpl();
        double double83 = summaryStatistics78.getSum();
        double double84 = summaryStatistics78.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic85 = summaryStatistics78.getSumLogImpl();
        boolean boolean86 = summaryStatistics0.equals((java.lang.Object) summaryStatistics78);
        double double87 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(summaryStatistics9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(summaryStatistics18);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(summaryStatistics26);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertNotNull(summaryStatistics30);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic31);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(summaryStatistics39);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(summaryStatistics47);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic48);
        org.junit.Assert.assertNotNull(summaryStatistics51);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic52);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic55);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(summaryStatistics64);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic65);
        org.junit.Assert.assertNotNull(summaryStatistics68);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic69);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic72);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic76);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic82);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = null;
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic4);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getVarianceImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = null;
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic12);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics14.getVarianceImpl();
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic15);
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic15);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics18.getSumLogImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic19);
        java.lang.String str21 = summaryStatistics0.toString();
        double double22 = summaryStatistics0.getSumsq();
        double double23 = summaryStatistics0.getVariance();
        double double24 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(summaryStatistics14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(summaryStatistics18);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str21, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = null;
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic4);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getVarianceImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic7);
        double double10 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics11.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics11.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics11.getVarianceImpl();
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic14);
        summaryStatistics0.addValue(512.0d);
        summaryStatistics0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(summaryStatistics11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = null;
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic4);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getVarianceImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = null;
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic12);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics14.getVarianceImpl();
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic15);
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic15);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics18.getSumLogImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic19);
        double double21 = summaryStatistics0.getStandardDeviation();
        summaryStatistics0.addValue((double) 10L);
        double double24 = summaryStatistics0.getMin();
        double double25 = summaryStatistics0.getSum();
        double double26 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics0.getSumsqImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(summaryStatistics14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(summaryStatistics18);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.302585092994046d + "'", double24 == 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        double double2 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.addValue((double) 1L);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getSumLogImpl();
        double double8 = summaryStatistics6.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics6.getSummary();
        long long10 = summaryStatistics6.getN();
        double double11 = summaryStatistics6.getSumsq();
        summaryStatistics6.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics6.getSumLogImpl();
        double double14 = summaryStatistics6.getMin();
        long long15 = summaryStatistics6.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics6.getMinImpl();
        boolean boolean17 = summaryStatistics0.equals((java.lang.Object) summaryStatistics6);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(statisticalSummary9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getMean();
        double double7 = summaryStatistics5.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics5.getMeanImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic8);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics10.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics10.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics10.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics14.getVarianceImpl();
        summaryStatistics14.clear();
        summaryStatistics14.clear();
        double double18 = summaryStatistics14.getSumsq();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary19 = summaryStatistics14.getSummary();
        boolean boolean20 = summaryStatistics10.equals((java.lang.Object) summaryStatistics14);
        long long21 = summaryStatistics14.getN();
        double double22 = summaryStatistics14.getSum();
        boolean boolean23 = summaryStatistics0.equals((java.lang.Object) summaryStatistics14);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics14.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double26 = summaryStatistics25.getVariance();
        long long27 = summaryStatistics25.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = summaryStatistics28.getSumImpl();
        summaryStatistics25.setMeanImpl(storelessUnivariateStatistic30);
        double double32 = summaryStatistics25.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double36 = summaryStatistics35.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = null;
        summaryStatistics35.setMeanImpl(storelessUnivariateStatistic37);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics39.getVarianceImpl();
        summaryStatistics35.setMeanImpl(storelessUnivariateStatistic40);
        summaryStatistics33.setGeoMeanImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double44 = summaryStatistics43.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic45 = null;
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic45);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = summaryStatistics47.getVarianceImpl();
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic48);
        summaryStatistics33.setSumsqImpl(storelessUnivariateStatistic48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics51 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic52 = summaryStatistics51.getSumLogImpl();
        summaryStatistics33.setMinImpl(storelessUnivariateStatistic52);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics54 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double55 = summaryStatistics54.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics56 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double57 = summaryStatistics56.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = null;
        summaryStatistics56.setMeanImpl(storelessUnivariateStatistic58);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics60 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic61 = summaryStatistics60.getVarianceImpl();
        summaryStatistics56.setMeanImpl(storelessUnivariateStatistic61);
        summaryStatistics54.setGeoMeanImpl(storelessUnivariateStatistic61);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics64 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double65 = summaryStatistics64.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic66 = null;
        summaryStatistics64.setMeanImpl(storelessUnivariateStatistic66);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics68 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic69 = summaryStatistics68.getVarianceImpl();
        summaryStatistics64.setMeanImpl(storelessUnivariateStatistic69);
        summaryStatistics54.setSumsqImpl(storelessUnivariateStatistic69);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics72 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic73 = summaryStatistics72.getSumLogImpl();
        summaryStatistics54.setMinImpl(storelessUnivariateStatistic73);
        double double75 = summaryStatistics54.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic76 = summaryStatistics54.getSumsqImpl();
        summaryStatistics33.setMaxImpl(storelessUnivariateStatistic76);
        summaryStatistics25.setSumsqImpl(storelessUnivariateStatistic76);
        java.lang.Class<?> wildcardClass79 = summaryStatistics25.getClass();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics80 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass79);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics81 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic82 = summaryStatistics81.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic83 = summaryStatistics81.getMaxImpl();
        boolean boolean84 = summaryStatistics80.equals((java.lang.Object) summaryStatistics81);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic85 = summaryStatistics80.getMinImpl();
        summaryStatistics14.setVarianceImpl(storelessUnivariateStatistic85);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(statisticalSummary3);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(summaryStatistics10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertNotNull(summaryStatistics14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(statisticalSummary19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(summaryStatistics39);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(summaryStatistics47);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic48);
        org.junit.Assert.assertNotNull(summaryStatistics51);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic52);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(summaryStatistics60);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic61);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(summaryStatistics68);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic69);
        org.junit.Assert.assertNotNull(summaryStatistics72);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic73);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic76);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(summaryStatistics80);
        org.junit.Assert.assertNotNull(summaryStatistics81);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic82);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic85);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getMax();
        double double5 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumsqImpl();
        double double7 = summaryStatistics0.getMax();
        double double8 = summaryStatistics0.getMin();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics4.setMeanImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getVarianceImpl();
        summaryStatistics4.setMeanImpl(storelessUnivariateStatistic9);
        summaryStatistics2.setGeoMeanImpl(storelessUnivariateStatistic9);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = null;
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics16.getVarianceImpl();
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic17);
        summaryStatistics2.setSumsqImpl(storelessUnivariateStatistic17);
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic17);
        long long21 = summaryStatistics0.getN();
        double double22 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double25 = summaryStatistics24.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double27 = summaryStatistics26.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic28 = null;
        summaryStatistics26.setMeanImpl(storelessUnivariateStatistic28);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = summaryStatistics30.getVarianceImpl();
        summaryStatistics26.setMeanImpl(storelessUnivariateStatistic31);
        summaryStatistics24.setGeoMeanImpl(storelessUnivariateStatistic31);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = summaryStatistics34.getSumLogImpl();
        summaryStatistics24.setVarianceImpl(storelessUnivariateStatistic35);
        double double37 = summaryStatistics24.getMean();
        double double38 = summaryStatistics24.getSumOfLogs();
        java.lang.Class<?> wildcardClass39 = summaryStatistics24.getClass();
        boolean boolean40 = summaryStatistics0.equals((java.lang.Object) wildcardClass39);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double42 = summaryStatistics41.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double44 = summaryStatistics43.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic45 = null;
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic45);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = summaryStatistics47.getVarianceImpl();
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic48);
        summaryStatistics41.setGeoMeanImpl(storelessUnivariateStatistic48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics51 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double52 = summaryStatistics51.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic53 = null;
        summaryStatistics51.setMeanImpl(storelessUnivariateStatistic53);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics55 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic56 = summaryStatistics55.getVarianceImpl();
        summaryStatistics51.setMeanImpl(storelessUnivariateStatistic56);
        summaryStatistics41.setSumsqImpl(storelessUnivariateStatistic56);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics59 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic60 = summaryStatistics59.getSumLogImpl();
        summaryStatistics41.setMinImpl(storelessUnivariateStatistic60);
        double double62 = summaryStatistics41.getStandardDeviation();
        double double63 = summaryStatistics41.getMin();
        double double64 = summaryStatistics41.getMax();
        double double65 = summaryStatistics41.getSumsq();
        boolean boolean66 = summaryStatistics0.equals((java.lang.Object) summaryStatistics41);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(summaryStatistics8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(summaryStatistics16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(summaryStatistics30);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic31);
        org.junit.Assert.assertNotNull(summaryStatistics34);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic35);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(summaryStatistics47);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(summaryStatistics55);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic56);
        org.junit.Assert.assertNotNull(summaryStatistics59);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic60);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = null;
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic2);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = null;
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic5);
        double double7 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMeanImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(storelessUnivariateStatistic8);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        long long4 = summaryStatistics2.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics5.getSumImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics9.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics9.getMaxImpl();
        summaryStatistics2.setVarianceImpl(storelessUnivariateStatistic11);
        long long13 = summaryStatistics2.getN();
        java.lang.String str14 = summaryStatistics2.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics2.getSumImpl();
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertNotNull(summaryStatistics9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str14, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMaxImpl();
        summaryStatistics0.addValue((double) (byte) 0);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getStandardDeviation();
        double double4 = summaryStatistics0.getGeometricMean();
        summaryStatistics0.addValue((double) 10L);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getVarianceImpl();
        summaryStatistics8.clear();
        summaryStatistics8.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics8.getSumImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double14 = summaryStatistics13.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics13.getSumImpl();
        double double16 = summaryStatistics13.getStandardDeviation();
        double double17 = summaryStatistics13.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double19 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = null;
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getVarianceImpl();
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic25);
        summaryStatistics18.setGeoMeanImpl(storelessUnivariateStatistic25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = null;
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic30);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics32.getVarianceImpl();
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic33);
        summaryStatistics18.setSumsqImpl(storelessUnivariateStatistic33);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = summaryStatistics36.getSumLogImpl();
        summaryStatistics18.setMinImpl(storelessUnivariateStatistic37);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double40 = summaryStatistics39.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double42 = summaryStatistics41.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = null;
        summaryStatistics41.setMeanImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics45.getVarianceImpl();
        summaryStatistics41.setMeanImpl(storelessUnivariateStatistic46);
        summaryStatistics39.setGeoMeanImpl(storelessUnivariateStatistic46);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double50 = summaryStatistics49.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic51 = null;
        summaryStatistics49.setMeanImpl(storelessUnivariateStatistic51);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics53 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic54 = summaryStatistics53.getVarianceImpl();
        summaryStatistics49.setMeanImpl(storelessUnivariateStatistic54);
        summaryStatistics39.setSumsqImpl(storelessUnivariateStatistic54);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics57 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = summaryStatistics57.getSumLogImpl();
        summaryStatistics39.setMinImpl(storelessUnivariateStatistic58);
        double double60 = summaryStatistics39.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic61 = summaryStatistics39.getSumsqImpl();
        summaryStatistics18.setMaxImpl(storelessUnivariateStatistic61);
        summaryStatistics13.setSumsqImpl(storelessUnivariateStatistic61);
        summaryStatistics8.setSumLogImpl(storelessUnivariateStatistic61);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary65 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic66 = summaryStatistics8.getGeoMeanImpl();
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.setMinImpl(storelessUnivariateStatistic66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementations must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertNotNull(summaryStatistics8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(summaryStatistics24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(summaryStatistics32);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic33);
        org.junit.Assert.assertNotNull(summaryStatistics36);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic37);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(summaryStatistics45);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic46);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(summaryStatistics53);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic54);
        org.junit.Assert.assertNotNull(summaryStatistics57);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic58);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic61);
        org.junit.Assert.assertNotNull(statisticalSummary65);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic66);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        long long2 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double4 = summaryStatistics3.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics3.getSumImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic5);
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double9 = summaryStatistics8.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = null;
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic12);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics14.getVarianceImpl();
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic15);
        summaryStatistics8.setGeoMeanImpl(storelessUnivariateStatistic15);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double19 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = null;
        summaryStatistics18.setMeanImpl(storelessUnivariateStatistic20);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics22.getVarianceImpl();
        summaryStatistics18.setMeanImpl(storelessUnivariateStatistic23);
        summaryStatistics8.setSumsqImpl(storelessUnivariateStatistic23);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics26.getSumLogImpl();
        summaryStatistics8.setMinImpl(storelessUnivariateStatistic27);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double30 = summaryStatistics29.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double32 = summaryStatistics31.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = null;
        summaryStatistics31.setMeanImpl(storelessUnivariateStatistic33);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic36 = summaryStatistics35.getVarianceImpl();
        summaryStatistics31.setMeanImpl(storelessUnivariateStatistic36);
        summaryStatistics29.setGeoMeanImpl(storelessUnivariateStatistic36);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double40 = summaryStatistics39.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = null;
        summaryStatistics39.setMeanImpl(storelessUnivariateStatistic41);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic44 = summaryStatistics43.getVarianceImpl();
        summaryStatistics39.setMeanImpl(storelessUnivariateStatistic44);
        summaryStatistics29.setSumsqImpl(storelessUnivariateStatistic44);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = summaryStatistics47.getSumLogImpl();
        summaryStatistics29.setMinImpl(storelessUnivariateStatistic48);
        double double50 = summaryStatistics29.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic51 = summaryStatistics29.getSumsqImpl();
        summaryStatistics8.setMaxImpl(storelessUnivariateStatistic51);
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic51);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic54 = summaryStatistics0.getMaxImpl();
        double double55 = summaryStatistics0.getSumOfLogs();
        summaryStatistics0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(summaryStatistics14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(summaryStatistics22);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertNotNull(summaryStatistics26);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(summaryStatistics35);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic36);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(summaryStatistics43);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic44);
        org.junit.Assert.assertNotNull(summaryStatistics47);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic51);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic54);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        double double3 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double7 = summaryStatistics6.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = null;
        summaryStatistics6.setMeanImpl(storelessUnivariateStatistic8);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics10.getVarianceImpl();
        summaryStatistics6.setMeanImpl(storelessUnivariateStatistic11);
        summaryStatistics4.setGeoMeanImpl(storelessUnivariateStatistic11);
        summaryStatistics4.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics4.getMeanImpl();
        summaryStatistics4.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics17.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double20 = summaryStatistics19.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double22 = summaryStatistics21.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = null;
        summaryStatistics21.setMeanImpl(storelessUnivariateStatistic23);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics25.getVarianceImpl();
        summaryStatistics21.setMeanImpl(storelessUnivariateStatistic26);
        summaryStatistics19.setGeoMeanImpl(storelessUnivariateStatistic26);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double30 = summaryStatistics29.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = null;
        summaryStatistics29.setMeanImpl(storelessUnivariateStatistic31);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic34 = summaryStatistics33.getVarianceImpl();
        summaryStatistics29.setMeanImpl(storelessUnivariateStatistic34);
        summaryStatistics19.setSumsqImpl(storelessUnivariateStatistic34);
        summaryStatistics17.setSumImpl(storelessUnivariateStatistic34);
        double double38 = summaryStatistics17.getMean();
        boolean boolean39 = summaryStatistics4.equals((java.lang.Object) double38);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics4.getSumsqImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic40);
        double double42 = summaryStatistics0.getMin();
        double double43 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(summaryStatistics10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(summaryStatistics17);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(summaryStatistics25);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic26);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(summaryStatistics33);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic34);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumImpl();
        double double3 = summaryStatistics0.getStandardDeviation();
        double double4 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getGeoMeanImpl();
        double double7 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getSumLogImpl();
        double double10 = summaryStatistics8.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = summaryStatistics8.getSummary();
        long long12 = summaryStatistics8.getN();
        double double13 = summaryStatistics8.getSumsq();
        summaryStatistics8.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics8.getSumLogImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic15);
        double double17 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double19 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = null;
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getVarianceImpl();
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic25);
        summaryStatistics18.setGeoMeanImpl(storelessUnivariateStatistic25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = null;
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic30);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics32.getVarianceImpl();
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic33);
        summaryStatistics18.setSumsqImpl(storelessUnivariateStatistic33);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = summaryStatistics36.getSumLogImpl();
        summaryStatistics18.setMinImpl(storelessUnivariateStatistic37);
        double double39 = summaryStatistics18.getStandardDeviation();
        double double40 = summaryStatistics18.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics18.getVarianceImpl();
        double double42 = summaryStatistics18.getVariance();
        double double43 = summaryStatistics18.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double45 = summaryStatistics44.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double47 = summaryStatistics46.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = null;
        summaryStatistics46.setMeanImpl(storelessUnivariateStatistic48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics50 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic51 = summaryStatistics50.getVarianceImpl();
        summaryStatistics46.setMeanImpl(storelessUnivariateStatistic51);
        summaryStatistics44.setGeoMeanImpl(storelessUnivariateStatistic51);
        summaryStatistics44.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics55 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic56 = summaryStatistics55.getSumLogImpl();
        double double57 = summaryStatistics55.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary58 = summaryStatistics55.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic59 = summaryStatistics55.getMinImpl();
        summaryStatistics44.setMaxImpl(storelessUnivariateStatistic59);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic61 = summaryStatistics44.getVarianceImpl();
        summaryStatistics18.setMeanImpl(storelessUnivariateStatistic61);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic63 = summaryStatistics18.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic64 = summaryStatistics18.getSumsqImpl();
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic64);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(summaryStatistics8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(statisticalSummary11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(summaryStatistics24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(summaryStatistics32);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic33);
        org.junit.Assert.assertNotNull(summaryStatistics36);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic37);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(summaryStatistics50);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic51);
        org.junit.Assert.assertNotNull(summaryStatistics55);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic56);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(statisticalSummary58);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic59);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic61);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic63);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic64);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = null;
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic4);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getVarianceImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.clear();
        double double11 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics0.getGeoMeanImpl();
        double double13 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double4 = summaryStatistics3.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = null;
        summaryStatistics5.setMeanImpl(storelessUnivariateStatistic7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics9.getVarianceImpl();
        summaryStatistics5.setMeanImpl(storelessUnivariateStatistic10);
        summaryStatistics3.setGeoMeanImpl(storelessUnivariateStatistic10);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double14 = summaryStatistics13.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = null;
        summaryStatistics13.setMeanImpl(storelessUnivariateStatistic15);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics17.getVarianceImpl();
        summaryStatistics13.setMeanImpl(storelessUnivariateStatistic18);
        summaryStatistics3.setSumsqImpl(storelessUnivariateStatistic18);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics21.getSumLogImpl();
        summaryStatistics3.setMinImpl(storelessUnivariateStatistic22);
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic22);
        double double25 = summaryStatistics0.getSumOfLogs();
        summaryStatistics0.clear();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(summaryStatistics9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(summaryStatistics17);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic18);
        org.junit.Assert.assertNotNull(summaryStatistics21);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics0.getSummary();
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMinImpl();
        summaryStatistics0.clear();
        java.lang.String str8 = summaryStatistics0.toString();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(statisticalSummary3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str8, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getMinImpl();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getVarianceImpl();
        long long5 = summaryStatistics0.getN();
        double double6 = summaryStatistics0.getMax();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumImpl();
        double double3 = summaryStatistics0.getStandardDeviation();
        double double4 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getGeoMeanImpl();
        double double7 = summaryStatistics0.getMax();
        double double8 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getSumLogImpl();
        double double11 = summaryStatistics0.getMax();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics4.setMeanImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getVarianceImpl();
        summaryStatistics4.setMeanImpl(storelessUnivariateStatistic9);
        summaryStatistics2.setGeoMeanImpl(storelessUnivariateStatistic9);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = null;
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics16.getVarianceImpl();
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic17);
        summaryStatistics2.setSumsqImpl(storelessUnivariateStatistic17);
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic17);
        long long21 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics22.getVarianceImpl();
        summaryStatistics22.clear();
        summaryStatistics22.addValue(0.0d);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary27 = summaryStatistics22.getSummary();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary28 = summaryStatistics22.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics22.getSumsqImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic29);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double32 = summaryStatistics31.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics31.getSumImpl();
        double double34 = summaryStatistics31.getStandardDeviation();
        double double35 = summaryStatistics31.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double37 = summaryStatistics36.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double39 = summaryStatistics38.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = null;
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics42 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = summaryStatistics42.getVarianceImpl();
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic43);
        summaryStatistics36.setGeoMeanImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double47 = summaryStatistics46.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = null;
        summaryStatistics46.setMeanImpl(storelessUnivariateStatistic48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics50 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic51 = summaryStatistics50.getVarianceImpl();
        summaryStatistics46.setMeanImpl(storelessUnivariateStatistic51);
        summaryStatistics36.setSumsqImpl(storelessUnivariateStatistic51);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics54 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic55 = summaryStatistics54.getSumLogImpl();
        summaryStatistics36.setMinImpl(storelessUnivariateStatistic55);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics57 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double58 = summaryStatistics57.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics59 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double60 = summaryStatistics59.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic61 = null;
        summaryStatistics59.setMeanImpl(storelessUnivariateStatistic61);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics63 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic64 = summaryStatistics63.getVarianceImpl();
        summaryStatistics59.setMeanImpl(storelessUnivariateStatistic64);
        summaryStatistics57.setGeoMeanImpl(storelessUnivariateStatistic64);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics67 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double68 = summaryStatistics67.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic69 = null;
        summaryStatistics67.setMeanImpl(storelessUnivariateStatistic69);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics71 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic72 = summaryStatistics71.getVarianceImpl();
        summaryStatistics67.setMeanImpl(storelessUnivariateStatistic72);
        summaryStatistics57.setSumsqImpl(storelessUnivariateStatistic72);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics75 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic76 = summaryStatistics75.getSumLogImpl();
        summaryStatistics57.setMinImpl(storelessUnivariateStatistic76);
        double double78 = summaryStatistics57.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic79 = summaryStatistics57.getSumsqImpl();
        summaryStatistics36.setMaxImpl(storelessUnivariateStatistic79);
        summaryStatistics31.setSumsqImpl(storelessUnivariateStatistic79);
        summaryStatistics31.addValue((double) 1.0f);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic84 = summaryStatistics31.getGeoMeanImpl();
        summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic84);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(summaryStatistics8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(summaryStatistics16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(summaryStatistics22);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertNotNull(statisticalSummary27);
        org.junit.Assert.assertNotNull(statisticalSummary28);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(summaryStatistics42);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(summaryStatistics50);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic51);
        org.junit.Assert.assertNotNull(summaryStatistics54);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic55);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(summaryStatistics63);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic64);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(summaryStatistics71);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic72);
        org.junit.Assert.assertNotNull(summaryStatistics75);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic76);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic79);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic84);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        double double2 = summaryStatistics0.getMean();
        long long3 = summaryStatistics0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        long long3 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics4.getSumImpl();
        double double7 = summaryStatistics4.getStandardDeviation();
        double double8 = summaryStatistics4.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics9.getVarianceImpl();
        double double11 = summaryStatistics9.getMin();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double15 = summaryStatistics14.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = null;
        summaryStatistics14.setMeanImpl(storelessUnivariateStatistic16);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics18.getVarianceImpl();
        summaryStatistics14.setMeanImpl(storelessUnivariateStatistic19);
        summaryStatistics12.setGeoMeanImpl(storelessUnivariateStatistic19);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double23 = summaryStatistics22.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = null;
        summaryStatistics22.setMeanImpl(storelessUnivariateStatistic24);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics26.getVarianceImpl();
        summaryStatistics22.setMeanImpl(storelessUnivariateStatistic27);
        summaryStatistics12.setSumsqImpl(storelessUnivariateStatistic27);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = summaryStatistics30.getSumLogImpl();
        summaryStatistics12.setMinImpl(storelessUnivariateStatistic31);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double36 = summaryStatistics35.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = null;
        summaryStatistics35.setMeanImpl(storelessUnivariateStatistic37);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics39.getVarianceImpl();
        summaryStatistics35.setMeanImpl(storelessUnivariateStatistic40);
        summaryStatistics33.setGeoMeanImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double44 = summaryStatistics43.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic45 = null;
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic45);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = summaryStatistics47.getVarianceImpl();
        summaryStatistics43.setMeanImpl(storelessUnivariateStatistic48);
        summaryStatistics33.setSumsqImpl(storelessUnivariateStatistic48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics51 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic52 = summaryStatistics51.getSumLogImpl();
        summaryStatistics33.setMinImpl(storelessUnivariateStatistic52);
        double double54 = summaryStatistics33.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic55 = summaryStatistics33.getSumsqImpl();
        summaryStatistics12.setMaxImpl(storelessUnivariateStatistic55);
        summaryStatistics9.setGeoMeanImpl(storelessUnivariateStatistic55);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics58 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double59 = summaryStatistics58.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics60 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double61 = summaryStatistics60.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic62 = null;
        summaryStatistics60.setMeanImpl(storelessUnivariateStatistic62);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics64 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic65 = summaryStatistics64.getVarianceImpl();
        summaryStatistics60.setMeanImpl(storelessUnivariateStatistic65);
        summaryStatistics58.setGeoMeanImpl(storelessUnivariateStatistic65);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics68 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic69 = summaryStatistics68.getSumLogImpl();
        summaryStatistics58.setVarianceImpl(storelessUnivariateStatistic69);
        double double71 = summaryStatistics58.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic72 = summaryStatistics58.getMinImpl();
        summaryStatistics9.setMaxImpl(storelessUnivariateStatistic72);
        summaryStatistics4.setMaxImpl(storelessUnivariateStatistic72);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic72);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics76 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double77 = summaryStatistics76.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics78 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double79 = summaryStatistics78.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic80 = null;
        summaryStatistics78.setMeanImpl(storelessUnivariateStatistic80);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics82 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic83 = summaryStatistics82.getVarianceImpl();
        summaryStatistics78.setMeanImpl(storelessUnivariateStatistic83);
        summaryStatistics76.setGeoMeanImpl(storelessUnivariateStatistic83);
        summaryStatistics76.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics87 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic88 = summaryStatistics87.getSumLogImpl();
        double double89 = summaryStatistics87.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary90 = summaryStatistics87.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic91 = summaryStatistics87.getMinImpl();
        summaryStatistics76.setMaxImpl(storelessUnivariateStatistic91);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic93 = summaryStatistics76.getVarianceImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic93);
        summaryStatistics0.addValue((double) (short) 1);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(summaryStatistics9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(summaryStatistics18);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(summaryStatistics26);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertNotNull(summaryStatistics30);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic31);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(summaryStatistics39);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(summaryStatistics47);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic48);
        org.junit.Assert.assertNotNull(summaryStatistics51);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic52);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic55);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(summaryStatistics64);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic65);
        org.junit.Assert.assertNotNull(summaryStatistics68);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic69);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic72);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(summaryStatistics82);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic83);
        org.junit.Assert.assertNotNull(summaryStatistics87);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic88);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertNotNull(statisticalSummary90);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic91);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic93);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = null;
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic4);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getVarianceImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics11.getSumLogImpl();
        double double13 = summaryStatistics11.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = summaryStatistics11.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics11.getMinImpl();
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic15);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double19 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = null;
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getVarianceImpl();
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic25);
        summaryStatistics18.setGeoMeanImpl(storelessUnivariateStatistic25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = null;
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic30);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics32.getVarianceImpl();
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic33);
        summaryStatistics18.setSumsqImpl(storelessUnivariateStatistic33);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = summaryStatistics36.getSumLogImpl();
        summaryStatistics18.setMinImpl(storelessUnivariateStatistic37);
        double double39 = summaryStatistics18.getStandardDeviation();
        double double40 = summaryStatistics18.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics18.getMeanImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic41);
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double45 = summaryStatistics44.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics44.getSumImpl();
        double double47 = summaryStatistics44.getStandardDeviation();
        double double48 = summaryStatistics44.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic49 = summaryStatistics44.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic50 = summaryStatistics44.getGeoMeanImpl();
        double double51 = summaryStatistics44.getMax();
        java.lang.Class<?> wildcardClass52 = summaryStatistics44.getClass();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics53 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass52);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics54 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass52);
        boolean boolean55 = summaryStatistics0.equals((java.lang.Object) summaryStatistics54);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertNotNull(summaryStatistics11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(statisticalSummary14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(summaryStatistics24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(summaryStatistics32);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic33);
        org.junit.Assert.assertNotNull(summaryStatistics36);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic37);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic41);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic46);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic49);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(summaryStatistics53);
        org.junit.Assert.assertNotNull(summaryStatistics54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        summaryStatistics0.clear();
        double double4 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumImpl();
        double double3 = summaryStatistics0.getStandardDeviation();
        summaryStatistics0.addValue((double) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        java.lang.Class<?> wildcardClass2 = summaryStatistics0.getClass();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass2);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass2);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass2);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass2);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass2);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics8.getMaxImpl();
        double double11 = summaryStatistics8.getGeometricMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics8.getMinImpl();
        java.lang.String str13 = summaryStatistics8.toString();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double15 = summaryStatistics14.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double17 = summaryStatistics16.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double19 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = null;
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getVarianceImpl();
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic25);
        summaryStatistics18.setGeoMeanImpl(storelessUnivariateStatistic25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = null;
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic30);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics32.getVarianceImpl();
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic33);
        summaryStatistics18.setSumsqImpl(storelessUnivariateStatistic33);
        summaryStatistics16.setMinImpl(storelessUnivariateStatistic33);
        summaryStatistics14.setMeanImpl(storelessUnivariateStatistic33);
        double double38 = summaryStatistics14.getSum();
        double double39 = summaryStatistics14.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics14.getVarianceImpl();
        summaryStatistics8.setMaxImpl(storelessUnivariateStatistic40);
        boolean boolean42 = summaryStatistics7.equals((java.lang.Object) storelessUnivariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(summaryStatistics3);
        org.junit.Assert.assertNotNull(summaryStatistics4);
        org.junit.Assert.assertNotNull(summaryStatistics5);
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(summaryStatistics7);
        org.junit.Assert.assertNotNull(summaryStatistics8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str13, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(summaryStatistics24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(summaryStatistics32);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        long long2 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double4 = summaryStatistics3.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics3.getSumImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic5);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics7.getMaxImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic9);
        long long11 = summaryStatistics0.getN();
        java.lang.String str12 = summaryStatistics0.toString();
        double double13 = summaryStatistics0.getSumsq();
        double double14 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getSumLogImpl();
        double double16 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getSumsqImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(summaryStatistics7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str12, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        summaryStatistics0.addValue(0.0d);
        double double5 = summaryStatistics0.getSum();
        double double6 = summaryStatistics0.getSum();
        summaryStatistics0.addValue((double) (-1L));
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getMaxImpl();
        double double10 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7071067811865476d + "'", double10 == 0.7071067811865476d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        double double3 = summaryStatistics0.getGeometricMean();
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        double double5 = summaryStatistics0.getVariance();
        double double6 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getVariance();
        long long9 = summaryStatistics7.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics10.getSumImpl();
        summaryStatistics7.setMeanImpl(storelessUnivariateStatistic12);
        double double14 = summaryStatistics7.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double16 = summaryStatistics15.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double18 = summaryStatistics17.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = null;
        summaryStatistics17.setMeanImpl(storelessUnivariateStatistic19);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics21.getVarianceImpl();
        summaryStatistics17.setMeanImpl(storelessUnivariateStatistic22);
        summaryStatistics15.setGeoMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double26 = summaryStatistics25.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = null;
        summaryStatistics25.setMeanImpl(storelessUnivariateStatistic27);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = summaryStatistics29.getVarianceImpl();
        summaryStatistics25.setMeanImpl(storelessUnivariateStatistic30);
        summaryStatistics15.setSumsqImpl(storelessUnivariateStatistic30);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic34 = summaryStatistics33.getSumLogImpl();
        summaryStatistics15.setMinImpl(storelessUnivariateStatistic34);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double37 = summaryStatistics36.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double39 = summaryStatistics38.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = null;
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics42 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = summaryStatistics42.getVarianceImpl();
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic43);
        summaryStatistics36.setGeoMeanImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double47 = summaryStatistics46.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = null;
        summaryStatistics46.setMeanImpl(storelessUnivariateStatistic48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics50 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic51 = summaryStatistics50.getVarianceImpl();
        summaryStatistics46.setMeanImpl(storelessUnivariateStatistic51);
        summaryStatistics36.setSumsqImpl(storelessUnivariateStatistic51);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics54 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic55 = summaryStatistics54.getSumLogImpl();
        summaryStatistics36.setMinImpl(storelessUnivariateStatistic55);
        double double57 = summaryStatistics36.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = summaryStatistics36.getSumsqImpl();
        summaryStatistics15.setMaxImpl(storelessUnivariateStatistic58);
        summaryStatistics7.setSumsqImpl(storelessUnivariateStatistic58);
        java.lang.Class<?> wildcardClass61 = summaryStatistics7.getClass();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics62 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass61);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics63 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic64 = summaryStatistics63.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic65 = summaryStatistics63.getMaxImpl();
        boolean boolean66 = summaryStatistics62.equals((java.lang.Object) summaryStatistics63);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic67 = summaryStatistics62.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic68 = summaryStatistics62.getMaxImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics69 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double70 = summaryStatistics69.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic71 = summaryStatistics69.getSumImpl();
        double double72 = summaryStatistics69.getStandardDeviation();
        double double73 = summaryStatistics69.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic74 = summaryStatistics69.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic75 = summaryStatistics69.getGeoMeanImpl();
        double double76 = summaryStatistics69.getMax();
        double double77 = summaryStatistics69.getMax();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic78 = summaryStatistics69.getMeanImpl();
        summaryStatistics62.setSumImpl(storelessUnivariateStatistic78);
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic78);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(summaryStatistics21);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(summaryStatistics29);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic30);
        org.junit.Assert.assertNotNull(summaryStatistics33);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic34);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(summaryStatistics42);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(summaryStatistics50);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic51);
        org.junit.Assert.assertNotNull(summaryStatistics54);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic55);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(summaryStatistics62);
        org.junit.Assert.assertNotNull(summaryStatistics63);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic64);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic67);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic68);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic71);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic74);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic75);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic78);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics5.getSumImpl();
        double double8 = summaryStatistics5.getStandardDeviation();
        double double9 = summaryStatistics5.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = null;
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics16.getVarianceImpl();
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic17);
        summaryStatistics10.setGeoMeanImpl(storelessUnivariateStatistic17);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = null;
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getVarianceImpl();
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic25);
        summaryStatistics10.setSumsqImpl(storelessUnivariateStatistic25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics28.getSumLogImpl();
        summaryStatistics10.setMinImpl(storelessUnivariateStatistic29);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double32 = summaryStatistics31.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = null;
        summaryStatistics33.setMeanImpl(storelessUnivariateStatistic35);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics37 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic38 = summaryStatistics37.getVarianceImpl();
        summaryStatistics33.setMeanImpl(storelessUnivariateStatistic38);
        summaryStatistics31.setGeoMeanImpl(storelessUnivariateStatistic38);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double42 = summaryStatistics41.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = null;
        summaryStatistics41.setMeanImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics45.getVarianceImpl();
        summaryStatistics41.setMeanImpl(storelessUnivariateStatistic46);
        summaryStatistics31.setSumsqImpl(storelessUnivariateStatistic46);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic50 = summaryStatistics49.getSumLogImpl();
        summaryStatistics31.setMinImpl(storelessUnivariateStatistic50);
        double double52 = summaryStatistics31.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic53 = summaryStatistics31.getSumsqImpl();
        summaryStatistics10.setMaxImpl(storelessUnivariateStatistic53);
        summaryStatistics5.setSumsqImpl(storelessUnivariateStatistic53);
        summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic53);
        double double57 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary58 = summaryStatistics0.getSummary();
        double double59 = summaryStatistics0.getMean();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(summaryStatistics16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(summaryStatistics24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertNotNull(summaryStatistics28);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(summaryStatistics37);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(summaryStatistics45);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic46);
        org.junit.Assert.assertNotNull(summaryStatistics49);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic50);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic53);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(statisticalSummary58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = null;
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic4);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getVarianceImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = null;
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic12);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics14.getVarianceImpl();
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic15);
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic15);
        double double18 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics0.getSumImpl();
        summaryStatistics0.clear();
        java.lang.String str21 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics0.getMaxImpl();
        java.lang.String str24 = summaryStatistics0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(summaryStatistics14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str21, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str24, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumImpl();
        double double3 = summaryStatistics0.getStandardDeviation();
        double double4 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getSumsqImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = null;
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic4);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getVarianceImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic7);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = null;
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic12);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics14.getVarianceImpl();
        summaryStatistics10.setMeanImpl(storelessUnivariateStatistic15);
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic15);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics18.getSumLogImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic19);
        java.lang.String str21 = summaryStatistics0.toString();
        java.lang.String str22 = summaryStatistics0.toString();
        summaryStatistics0.clear();
        summaryStatistics0.clear();
        double double25 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics26.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double31 = summaryStatistics30.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic32 = null;
        summaryStatistics30.setMeanImpl(storelessUnivariateStatistic32);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = summaryStatistics34.getVarianceImpl();
        summaryStatistics30.setMeanImpl(storelessUnivariateStatistic35);
        summaryStatistics28.setGeoMeanImpl(storelessUnivariateStatistic35);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double39 = summaryStatistics38.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = null;
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics42 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = summaryStatistics42.getVarianceImpl();
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic43);
        summaryStatistics28.setSumsqImpl(storelessUnivariateStatistic43);
        summaryStatistics26.setSumImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic47 = summaryStatistics26.getSumLogImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic47);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double50 = summaryStatistics49.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic51 = summaryStatistics49.getSumImpl();
        double double52 = summaryStatistics49.getStandardDeviation();
        double double53 = summaryStatistics49.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic54 = summaryStatistics49.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic55 = summaryStatistics49.getVarianceImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic55);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic57 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = summaryStatistics0.getMinImpl();
        summaryStatistics0.addValue(0.0d);
        summaryStatistics0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(summaryStatistics14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(summaryStatistics18);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str21, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str22, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(summaryStatistics26);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(summaryStatistics34);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic35);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(summaryStatistics42);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic43);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic47);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic51);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic54);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic55);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic57);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic58);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = null;
        summaryStatistics7.setMeanImpl(storelessUnivariateStatistic9);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics11.getVarianceImpl();
        summaryStatistics7.setMeanImpl(storelessUnivariateStatistic12);
        summaryStatistics5.setGeoMeanImpl(storelessUnivariateStatistic12);
        double double15 = summaryStatistics5.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double17 = summaryStatistics16.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double19 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = null;
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getVarianceImpl();
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic25);
        summaryStatistics18.setGeoMeanImpl(storelessUnivariateStatistic25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = null;
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic30);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics32.getVarianceImpl();
        summaryStatistics28.setMeanImpl(storelessUnivariateStatistic33);
        summaryStatistics18.setSumsqImpl(storelessUnivariateStatistic33);
        summaryStatistics16.setMinImpl(storelessUnivariateStatistic33);
        summaryStatistics5.setSumImpl(storelessUnivariateStatistic33);
        summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic33);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic39 = summaryStatistics0.getMinImpl();
        long long40 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics0.getGeoMeanImpl();
        double double42 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(statisticalSummary3);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(summaryStatistics11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(summaryStatistics24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(summaryStatistics32);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic33);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = null;
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic2);
        double double4 = summaryStatistics0.getVariance();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getGeoMeanImpl();
        double double5 = summaryStatistics0.getMax();
        java.lang.String str6 = summaryStatistics0.toString();
        double double7 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getSumImpl();
        java.lang.String str9 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = null;
        summaryStatistics0.setSumImpl(storelessUnivariateStatistic10);
        java.lang.String str12 = summaryStatistics0.toString();
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str6, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str9, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str12, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getStandardDeviation();
        double double4 = summaryStatistics0.getGeometricMean();
        summaryStatistics0.addValue((double) 10L);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getVarianceImpl();
        long long8 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getGeoMeanImpl();
        double double5 = summaryStatistics0.getMax();
        long long6 = summaryStatistics0.getN();
        double double7 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = null;
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic8);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double3 = summaryStatistics2.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics4.setMeanImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getVarianceImpl();
        summaryStatistics4.setMeanImpl(storelessUnivariateStatistic9);
        summaryStatistics2.setGeoMeanImpl(storelessUnivariateStatistic9);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = null;
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics16.getVarianceImpl();
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic17);
        summaryStatistics2.setSumsqImpl(storelessUnivariateStatistic17);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics20.getSumLogImpl();
        summaryStatistics2.setMinImpl(storelessUnivariateStatistic21);
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic21);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double25 = summaryStatistics24.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double27 = summaryStatistics26.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double29 = summaryStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double31 = summaryStatistics30.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic32 = null;
        summaryStatistics30.setMeanImpl(storelessUnivariateStatistic32);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = summaryStatistics34.getVarianceImpl();
        summaryStatistics30.setMeanImpl(storelessUnivariateStatistic35);
        summaryStatistics28.setGeoMeanImpl(storelessUnivariateStatistic35);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double39 = summaryStatistics38.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = null;
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics42 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = summaryStatistics42.getVarianceImpl();
        summaryStatistics38.setMeanImpl(storelessUnivariateStatistic43);
        summaryStatistics28.setSumsqImpl(storelessUnivariateStatistic43);
        summaryStatistics26.setMinImpl(storelessUnivariateStatistic43);
        summaryStatistics24.setMeanImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics48 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double49 = summaryStatistics48.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic50 = summaryStatistics48.getSumImpl();
        double double51 = summaryStatistics48.getStandardDeviation();
        double double52 = summaryStatistics48.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic53 = summaryStatistics48.getMeanImpl();
        summaryStatistics24.setGeoMeanImpl(storelessUnivariateStatistic53);
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic53);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics56 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic57 = summaryStatistics56.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = summaryStatistics56.getMeanImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic58);
        java.lang.String str60 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic61 = summaryStatistics0.getSumLogImpl();
        java.lang.String str62 = summaryStatistics0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(summaryStatistics8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(summaryStatistics16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertNotNull(summaryStatistics20);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(summaryStatistics34);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic35);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(summaryStatistics42);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic53);
        org.junit.Assert.assertNotNull(summaryStatistics56);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic57);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str60, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str62, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = null;
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic2);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = null;
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic5);
        double double7 = summaryStatistics0.getSumsq();
        double double8 = summaryStatistics0.getGeometricMean();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getVarianceImpl();
        summaryStatistics0.clear();
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics5.getSumImpl();
        double double8 = summaryStatistics5.getStandardDeviation();
        double double9 = summaryStatistics5.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = null;
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics16.getVarianceImpl();
        summaryStatistics12.setMeanImpl(storelessUnivariateStatistic17);
        summaryStatistics10.setGeoMeanImpl(storelessUnivariateStatistic17);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = null;
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getVarianceImpl();
        summaryStatistics20.setMeanImpl(storelessUnivariateStatistic25);
        summaryStatistics10.setSumsqImpl(storelessUnivariateStatistic25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics28.getSumLogImpl();
        summaryStatistics10.setMinImpl(storelessUnivariateStatistic29);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double32 = summaryStatistics31.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = null;
        summaryStatistics33.setMeanImpl(storelessUnivariateStatistic35);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics37 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic38 = summaryStatistics37.getVarianceImpl();
        summaryStatistics33.setMeanImpl(storelessUnivariateStatistic38);
        summaryStatistics31.setGeoMeanImpl(storelessUnivariateStatistic38);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double42 = summaryStatistics41.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = null;
        summaryStatistics41.setMeanImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics45.getVarianceImpl();
        summaryStatistics41.setMeanImpl(storelessUnivariateStatistic46);
        summaryStatistics31.setSumsqImpl(storelessUnivariateStatistic46);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic50 = summaryStatistics49.getSumLogImpl();
        summaryStatistics31.setMinImpl(storelessUnivariateStatistic50);
        double double52 = summaryStatistics31.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic53 = summaryStatistics31.getSumsqImpl();
        summaryStatistics10.setMaxImpl(storelessUnivariateStatistic53);
        summaryStatistics5.setSumsqImpl(storelessUnivariateStatistic53);
        summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic53);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic57 = summaryStatistics0.getMinImpl();
        double double58 = summaryStatistics0.getGeometricMean();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(summaryStatistics16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(summaryStatistics24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertNotNull(summaryStatistics28);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(summaryStatistics37);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(summaryStatistics45);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic46);
        org.junit.Assert.assertNotNull(summaryStatistics49);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic50);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic53);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic57);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double5 = summaryStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics4.getSumImpl();
        double double7 = summaryStatistics4.getStandardDeviation();
        double double8 = summaryStatistics4.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double10 = summaryStatistics9.getVariance();
        long long11 = summaryStatistics9.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics12.getSumImpl();
        summaryStatistics9.setMeanImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double17 = summaryStatistics16.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double19 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = null;
        summaryStatistics18.setMeanImpl(storelessUnivariateStatistic20);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics22.getVarianceImpl();
        summaryStatistics18.setMeanImpl(storelessUnivariateStatistic23);
        summaryStatistics16.setGeoMeanImpl(storelessUnivariateStatistic23);
        summaryStatistics9.setVarianceImpl(storelessUnivariateStatistic23);
        summaryStatistics4.setSumsqImpl(storelessUnivariateStatistic23);
        double double28 = summaryStatistics4.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics4.getGeoMeanImpl();
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic29);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = summaryStatistics0.getSumsqImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(summaryStatistics22);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic29);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic31);
    }
}

