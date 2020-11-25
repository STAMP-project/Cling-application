import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics(1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getMaxImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics1.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics4 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics4.getKurtosisImpl();
        java.lang.String str6 = descriptiveStatistics4.toString();
        double double7 = descriptiveStatistics4.getSum();
        double double8 = descriptiveStatistics4.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getKurtosisImpl();
        double double11 = descriptiveStatistics9.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics9.getKurtosisImpl();
        descriptiveStatistics4.setMinImpl(univariateStatistic12);
        java.lang.Class<?> wildcardClass14 = descriptiveStatistics4.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass14);
        double double16 = descriptiveStatistics15.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics15.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getVarianceImpl();
        descriptiveStatistics15.setKurtosisImpl(univariateStatistic19);
        descriptiveStatistics1.setKurtosisImpl(univariateStatistic19);
        double double22 = descriptiveStatistics1.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics1.getSumsqImpl();
        java.lang.String str24 = descriptiveStatistics1.toString();
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str6, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str24, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getKurtosisImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic3);
        double double5 = descriptiveStatistics0.getMax();
        double double6 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getSumsqImpl();
        double double8 = descriptiveStatistics0.getMax();
        double double9 = descriptiveStatistics0.getSumsq();
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) 10);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics4 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics4.getKurtosisImpl();
        java.lang.String str6 = descriptiveStatistics4.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getKurtosisImpl();
        double double9 = descriptiveStatistics7.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics7.getKurtosisImpl();
        descriptiveStatistics4.setVarianceImpl(univariateStatistic10);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics4.getPercentileImpl();
        double double13 = descriptiveStatistics4.getGeometricMean();
        descriptiveStatistics4.setWindowSize((int) '4');
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics4.getPercentileImpl();
        double double17 = descriptiveStatistics4.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getKurtosisImpl();
        java.lang.String str20 = descriptiveStatistics18.toString();
        double double21 = descriptiveStatistics18.getSum();
        long long22 = descriptiveStatistics18.getN();
        java.lang.String str23 = descriptiveStatistics18.toString();
        int int24 = descriptiveStatistics18.getWindowSize();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getKurtosisImpl();
        java.lang.String str27 = descriptiveStatistics25.toString();
        double double28 = descriptiveStatistics25.getSum();
        long long29 = descriptiveStatistics25.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getKurtosisImpl();
        java.lang.String str32 = descriptiveStatistics30.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getKurtosisImpl();
        double double35 = descriptiveStatistics33.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics33.getKurtosisImpl();
        descriptiveStatistics30.setVarianceImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics30.getPercentileImpl();
        descriptiveStatistics25.setGeometricMeanImpl(univariateStatistic38);
        double double40 = descriptiveStatistics18.apply(univariateStatistic38);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics42 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics42.getKurtosisImpl();
        double double44 = descriptiveStatistics42.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics42.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics42.getSumImpl();
        descriptiveStatistics18.setMaxImpl(univariateStatistic46);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics18.getMinImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics49 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic50 = descriptiveStatistics49.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics51 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics51.getKurtosisImpl();
        descriptiveStatistics49.setSumsqImpl(univariateStatistic52);
        double double54 = descriptiveStatistics49.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic55 = descriptiveStatistics49.getSkewnessImpl();
        descriptiveStatistics18.setVarianceImpl(univariateStatistic55);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics18.getVarianceImpl();
        descriptiveStatistics4.setKurtosisImpl(univariateStatistic57);
        double double59 = descriptiveStatistics4.getKurtosis();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics60 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics60.getKurtosisImpl();
        java.lang.String str62 = descriptiveStatistics60.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics63 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics63.getKurtosisImpl();
        double double65 = descriptiveStatistics63.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics63.getKurtosisImpl();
        descriptiveStatistics60.setVarianceImpl(univariateStatistic66);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic68 = descriptiveStatistics60.getMeanImpl();
        double double69 = descriptiveStatistics60.getStandardDeviation();
        double double70 = descriptiveStatistics60.getVariance();
        java.lang.Class<?> wildcardClass71 = descriptiveStatistics60.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics72 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass71);
        double[] doubleArray73 = descriptiveStatistics72.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics72.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic75 = descriptiveStatistics72.getSumImpl();
        descriptiveStatistics4.setSumImpl(univariateStatistic75);
        descriptiveStatistics1.setSumImpl(univariateStatistic75);
        long long78 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics79 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic80 = descriptiveStatistics79.getKurtosisImpl();
        java.lang.String str81 = descriptiveStatistics79.toString();
        double double82 = descriptiveStatistics79.getSum();
        double double83 = descriptiveStatistics79.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics84 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic85 = descriptiveStatistics84.getKurtosisImpl();
        double double86 = descriptiveStatistics84.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic87 = descriptiveStatistics84.getKurtosisImpl();
        descriptiveStatistics79.setMinImpl(univariateStatistic87);
        java.lang.Class<?> wildcardClass89 = descriptiveStatistics79.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics90 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass89);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic91 = descriptiveStatistics90.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic92 = descriptiveStatistics90.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic93 = descriptiveStatistics90.getPercentileImpl();
        descriptiveStatistics1.setPercentileImpl(univariateStatistic93);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str6, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str20, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str23, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str27, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str32, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(univariateStatistic50);
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(univariateStatistic55);
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str62, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic64);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(univariateStatistic66);
        org.junit.Assert.assertNotNull(univariateStatistic68);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(descriptiveStatistics72);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertNotNull(univariateStatistic75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str81, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertNotNull(univariateStatistic85);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(univariateStatistic87);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(descriptiveStatistics90);
        org.junit.Assert.assertNotNull(univariateStatistic91);
        org.junit.Assert.assertNotNull(univariateStatistic92);
        org.junit.Assert.assertNotNull(univariateStatistic93);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getKurtosisImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getPercentileImpl();
        double double6 = descriptiveStatistics0.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getVarianceImpl();
        double double8 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getKurtosisImpl();
        java.lang.String str13 = descriptiveStatistics11.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics11.getSkewnessImpl();
        descriptiveStatistics9.setSkewnessImpl(univariateStatistic14);
        double double16 = descriptiveStatistics9.getSumsq();
        long long17 = descriptiveStatistics9.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics9.getMeanImpl();
        double double19 = descriptiveStatistics9.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics9.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic20);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getKurtosisImpl();
        descriptiveStatistics22.setSumsqImpl(univariateStatistic25);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics22.getPercentileImpl();
        double double28 = descriptiveStatistics22.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) 10);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics30.getSumsqImpl();
        descriptiveStatistics22.setSumImpl(univariateStatistic32);
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic32);
        double double35 = descriptiveStatistics0.getMin();
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str13, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getKurtosisImpl();
        java.lang.String str2 = descriptiveStatistics0.toString();
        double double3 = descriptiveStatistics0.getSum();
        long long4 = descriptiveStatistics0.getN();
        java.lang.String str5 = descriptiveStatistics0.toString();
        int int6 = descriptiveStatistics0.getWindowSize();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getKurtosisImpl();
        java.lang.String str9 = descriptiveStatistics7.toString();
        double double10 = descriptiveStatistics7.getSum();
        long long11 = descriptiveStatistics7.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getKurtosisImpl();
        java.lang.String str14 = descriptiveStatistics12.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getKurtosisImpl();
        double double17 = descriptiveStatistics15.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics15.getKurtosisImpl();
        descriptiveStatistics12.setVarianceImpl(univariateStatistic18);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics12.getPercentileImpl();
        descriptiveStatistics7.setGeometricMeanImpl(univariateStatistic20);
        double double22 = descriptiveStatistics0.apply(univariateStatistic20);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getKurtosisImpl();
        double double26 = descriptiveStatistics24.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics24.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics24.getSumImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic28);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics31.getKurtosisImpl();
        java.lang.String str33 = descriptiveStatistics31.toString();
        double double34 = descriptiveStatistics31.getSum();
        double double35 = descriptiveStatistics31.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics31.getGeometricMeanImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic36);
        descriptiveStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics0.getSumsqImpl();
        double double41 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics0.getPercentileImpl();
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str2, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str9, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str14, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str33, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.000000000000002d + "'", double41 == 10.000000000000002d);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getVarianceImpl();
        double double2 = descriptiveStatistics0.getSum();
        double double3 = descriptiveStatistics0.getStandardDeviation();
        descriptiveStatistics0.setWindowSize((int) (byte) 100);
        double double6 = descriptiveStatistics0.getMin();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getKurtosisImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic3);
        double double5 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getVarianceImpl();
        descriptiveStatistics0.addValue(0.0d);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics1.getMaxImpl();
        descriptiveStatistics1.clear();
        double double6 = descriptiveStatistics1.getPercentile((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getKurtosisImpl();
        java.lang.String str2 = descriptiveStatistics0.toString();
        double double3 = descriptiveStatistics0.getSum();
        double double4 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getKurtosisImpl();
        double double7 = descriptiveStatistics5.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics5.getKurtosisImpl();
        descriptiveStatistics0.setMinImpl(univariateStatistic8);
        double double10 = descriptiveStatistics0.getKurtosis();
        double double11 = descriptiveStatistics0.getMean();
        descriptiveStatistics0.setWindowSize(1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics0.getGeometricMeanImpl();
        double double15 = descriptiveStatistics0.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics0.getVarianceImpl();
        descriptiveStatistics0.addValue((double) (byte) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getKurtosisImpl();
        java.lang.String str21 = descriptiveStatistics19.toString();
        double double22 = descriptiveStatistics19.getSum();
        long long23 = descriptiveStatistics19.getN();
        double double24 = descriptiveStatistics19.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics19.getMaxImpl();
        descriptiveStatistics19.clear();
        double[] doubleArray27 = descriptiveStatistics19.getValues();
        double double28 = descriptiveStatistics19.getStandardDeviation();
        double double29 = descriptiveStatistics19.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics19.getSumsqImpl();
        double double31 = descriptiveStatistics0.apply(univariateStatistic30);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str2, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str21, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }
}

