import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics3.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics3.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics10.getKurtosisImpl();
        long long13 = descriptiveStatistics10.getN();
        double[] doubleArray14 = descriptiveStatistics10.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics10.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics10.getMinImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic16);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics0.getKurtosisImpl();
        java.lang.String str20 = descriptiveStatistics0.toString();
        long long21 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str20, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic22);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue((double) 0);
        int int6 = descriptiveStatistics0.getWindowSize();
        double double7 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics0.getMeanImpl();
        double double9 = descriptiveStatistics0.getMax();
        descriptiveStatistics0.setWindowSize((int) (short) 1);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        double double14 = descriptiveStatistics12.getMin();
        double double15 = descriptiveStatistics12.getMax();
        double double16 = descriptiveStatistics12.getMean();
        double double17 = descriptiveStatistics12.getGeometricMean();
        long long18 = descriptiveStatistics12.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics12.getMeanImpl();
        descriptiveStatistics0.setSumImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics21.getKurtosisImpl();
        long long24 = descriptiveStatistics21.getN();
        descriptiveStatistics21.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics21.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics28.getKurtosisImpl();
        long long31 = descriptiveStatistics28.getN();
        double[] doubleArray32 = descriptiveStatistics28.getValues();
        descriptiveStatistics28.addValue(1.0d);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics28.getSumImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics36 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics36.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics36.getKurtosisImpl();
        long long39 = descriptiveStatistics36.getN();
        descriptiveStatistics36.addValue((double) 0);
        int int42 = descriptiveStatistics36.getWindowSize();
        double double43 = descriptiveStatistics36.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics36.getMeanImpl();
        double double45 = descriptiveStatistics36.getKurtosis();
        double double47 = descriptiveStatistics36.getPercentile((double) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        double double50 = descriptiveStatistics48.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics48.getSkewnessImpl();
        descriptiveStatistics36.setMaxImpl(univariateStatistic51);
        descriptiveStatistics28.setSkewnessImpl(univariateStatistic51);
        descriptiveStatistics21.setMaxImpl(univariateStatistic51);
        double double55 = descriptiveStatistics21.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics56 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics56.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics56.getKurtosisImpl();
        double[] doubleArray59 = descriptiveStatistics56.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics56.getVarianceImpl();
        double double61 = descriptiveStatistics56.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics56.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics64 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double65 = descriptiveStatistics64.getStandardDeviation();
        long long66 = descriptiveStatistics64.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic67 = descriptiveStatistics64.getSkewnessImpl();
        java.lang.String str68 = descriptiveStatistics64.toString();
        double double69 = descriptiveStatistics64.getVariance();
        descriptiveStatistics64.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic72 = descriptiveStatistics64.getGeometricMeanImpl();
        descriptiveStatistics56.setMeanImpl(univariateStatistic72);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics56.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic75 = descriptiveStatistics56.getGeometricMeanImpl();
        descriptiveStatistics21.setSumsqImpl(univariateStatistic75);
        descriptiveStatistics0.setMeanImpl(univariateStatistic75);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(descriptiveStatistics36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(descriptiveStatistics56);
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str68, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(univariateStatistic72);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertNotNull(univariateStatistic75);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double double4 = descriptiveStatistics0.getMin();
        double double5 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getSkewnessImpl();
        double double7 = descriptiveStatistics0.getMax();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getMinImpl();
        descriptiveStatistics0.clear();
        long long8 = descriptiveStatistics0.getN();
        double double9 = descriptiveStatistics0.getMax();
        double double10 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double13 = descriptiveStatistics12.getStandardDeviation();
        double double14 = descriptiveStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics12.getSumImpl();
        double double16 = descriptiveStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics20.getSumsqImpl();
        descriptiveStatistics18.setKurtosisImpl(univariateStatistic21);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics18.getKurtosisImpl();
        double[] doubleArray27 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double28 = univariateStatistic23.evaluate(doubleArray27);
        descriptiveStatistics17.setMaxImpl(univariateStatistic23);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics17.getSumsqImpl();
        double double31 = descriptiveStatistics17.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics17.getSkewnessImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic32);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics34.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics34.getKurtosisImpl();
        long long37 = descriptiveStatistics34.getN();
        double[] doubleArray38 = descriptiveStatistics34.getValues();
        int int39 = descriptiveStatistics34.getWindowSize();
        double double40 = descriptiveStatistics34.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics34.getSkewnessImpl();
        long long42 = descriptiveStatistics34.getN();
        double double43 = descriptiveStatistics34.getMean();
        double double44 = descriptiveStatistics34.getMin();
        double double45 = descriptiveStatistics34.getStandardDeviation();
        double double46 = descriptiveStatistics34.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics34.getMeanImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic47);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic47);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic50 = descriptiveStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.0d + "'", double28 == 2.0d);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(descriptiveStatistics34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(univariateStatistic50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double1 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics2.getKurtosisImpl();
        long long5 = descriptiveStatistics2.getN();
        descriptiveStatistics2.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        descriptiveStatistics8.setKurtosisImpl(univariateStatistic11);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        descriptiveStatistics13.setKurtosisImpl(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics13.getKurtosisImpl();
        descriptiveStatistics8.setMaxImpl(univariateStatistic18);
        double double20 = descriptiveStatistics8.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics8.getMinImpl();
        descriptiveStatistics2.setMinImpl(univariateStatistic21);
        descriptiveStatistics0.setMeanImpl(univariateStatistic21);
        double double24 = descriptiveStatistics0.getSum();
        double double25 = descriptiveStatistics0.getMean();
        descriptiveStatistics0.clear();
        double double27 = descriptiveStatistics0.getMin();
        java.lang.Class<?> wildcardClass28 = descriptiveStatistics0.getClass();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 0);
        double double5 = resizableDoubleArray0.addElementRolling((double) 0.0f);
        resizableDoubleArray0.setElement((int) (byte) 10, (double) (short) -1);
        float float9 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        int int11 = resizableDoubleArray0.getExpansionMode();
        double double13 = resizableDoubleArray0.addElementRolling((double) 1);
        int int14 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', 2.0f, (float) 100);
        int int4 = resizableDoubleArray3.getExpansionMode();
        double[] doubleArray5 = resizableDoubleArray3.getElements();
        resizableDoubleArray3.contract();
        double double8 = resizableDoubleArray3.addElementRolling((double) 0.0f);
        resizableDoubleArray3.contract();
        double double11 = resizableDoubleArray3.addElementRolling((double) 100L);
        float float12 = resizableDoubleArray3.getExpansionFactor();
        resizableDoubleArray3.setContractionCriteria(52.0f);
        double double16 = resizableDoubleArray3.addElementRolling((double) 1);
        resizableDoubleArray3.addElement(10201.0d);
        double double20 = resizableDoubleArray3.addElementRolling((double) 'a');
        resizableDoubleArray3.addElement((double) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10201.0d + "'", double20 == 10201.0d);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', (float) (byte) 10);
        int int3 = resizableDoubleArray2.start();
        resizableDoubleArray2.discardFrontElements((int) (short) 0);
        double double7 = resizableDoubleArray2.addElementRolling(5.4999999999999964d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.setExpansionMode((int) (short) 1);
        int int4 = resizableDoubleArray0.getNumElements();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria((float) '#');
        resizableDoubleArray0.clear();
        int int9 = resizableDoubleArray0.getNumElements();
        double double11 = resizableDoubleArray0.addElementRolling(153.0d);
        resizableDoubleArray0.setNumElements(92);
        double double15 = resizableDoubleArray0.addElementRolling(97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 10);
        int int4 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) (-1L));
        double[] doubleArray7 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) 0L);
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0]");
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        java.lang.String str2 = descriptiveStatistics0.toString();
        double double3 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics0.getSumsqImpl();
        double double5 = descriptiveStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str2, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        double[] doubleArray5 = resizableDoubleArray0.getElements();
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.getNumElements();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        int int10 = resizableDoubleArray0.getNumElements();
        int int11 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics7.getKurtosisImpl();
        long long10 = descriptiveStatistics7.getN();
        descriptiveStatistics7.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics7.getSkewnessImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic13);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics0.getVarianceImpl();
        java.lang.String str16 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        double double18 = descriptiveStatistics0.getMax();
        descriptiveStatistics0.setWindowSize(31);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double23 = descriptiveStatistics22.getStandardDeviation();
        long long24 = descriptiveStatistics22.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics22.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics22.getSumsqImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic26);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str16, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        int int3 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) (short) 10, (double) 100L);
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        double double9 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.discardFrontElements((int) (short) 0);
        float float12 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 0, 0.0d);
        int int16 = resizableDoubleArray0.getNumElements();
        double double18 = resizableDoubleArray0.addElementRolling((double) (short) 0);
        double[] doubleArray19 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0]");
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.addElement(2.0d);
        float float7 = resizableDoubleArray0.getContractionCriteria();
        double double9 = resizableDoubleArray0.addElementRolling((double) 10);
        resizableDoubleArray0.clear();
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setContractionCriteria((float) 35);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = resizableDoubleArray0.getElement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.5f + "'", float7 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics6.getKurtosisImpl();
        long long9 = descriptiveStatistics6.getN();
        double double10 = descriptiveStatistics6.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        descriptiveStatistics11.setKurtosisImpl(univariateStatistic14);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics16.getKurtosisImpl();
        descriptiveStatistics11.setMaxImpl(univariateStatistic21);
        descriptiveStatistics6.setSumImpl(univariateStatistic21);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic21);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics0.getPercentileImpl();
        double double26 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(univariateStatistic27);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) '4');
        int int3 = resizableDoubleArray2.start();
        float float4 = resizableDoubleArray2.getExpansionFactor();
        int int5 = resizableDoubleArray2.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 52.0f + "'", float4 == 52.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        descriptiveStatistics5.setKurtosisImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics5.getKurtosisImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic10);
        double double12 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics0.getMinImpl();
        descriptiveStatistics0.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        descriptiveStatistics16.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics16.getMinImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic22);
        double double24 = descriptiveStatistics0.getVariance();
        double double25 = descriptiveStatistics0.getMean();
        descriptiveStatistics0.setWindowSize(3);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        descriptiveStatistics29.setWindowSize((int) ' ');
        double double32 = descriptiveStatistics29.getStandardDeviation();
        double double33 = descriptiveStatistics29.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics29.getSumImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str36 = descriptiveStatistics35.toString();
        descriptiveStatistics35.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics35.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics35.getSumsqImpl();
        double double41 = descriptiveStatistics35.getPercentile(Double.NaN);
        double double42 = descriptiveStatistics35.getKurtosis();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics43 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str44 = descriptiveStatistics43.toString();
        double double45 = descriptiveStatistics43.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics46 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics46.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        descriptiveStatistics46.setKurtosisImpl(univariateStatistic49);
        descriptiveStatistics43.setSkewnessImpl(univariateStatistic49);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics53 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double54 = descriptiveStatistics53.getStandardDeviation();
        long long55 = descriptiveStatistics53.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics53.getMinImpl();
        descriptiveStatistics43.setKurtosisImpl(univariateStatistic56);
        descriptiveStatistics35.setMinImpl(univariateStatistic56);
        descriptiveStatistics29.setKurtosisImpl(univariateStatistic56);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics29.getPercentileImpl();
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray61 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float62 = resizableDoubleArray61.getExpansionFactor();
        resizableDoubleArray61.clear();
        resizableDoubleArray61.setNumElements((int) ' ');
        float float66 = resizableDoubleArray61.getContractionCriteria();
        double[] doubleArray67 = resizableDoubleArray61.getValues();
        double double68 = univariateStatistic60.evaluate(doubleArray67);
        descriptiveStatistics0.setMinImpl(univariateStatistic60);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str36, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(descriptiveStatistics43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str44, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(descriptiveStatistics46);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 2.0f + "'", float62 == 2.0f);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 2.5f + "'", float66 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue((double) 0);
        int int6 = descriptiveStatistics0.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getGeometricMeanImpl();
        descriptiveStatistics0.clear();
        long long9 = descriptiveStatistics0.getN();
        long long10 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        descriptiveStatistics11.setKurtosisImpl(univariateStatistic14);
        descriptiveStatistics11.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics11.getSumsqImpl();
        double double18 = descriptiveStatistics11.getSkewness();
        double double19 = descriptiveStatistics11.getMax();
        double double20 = descriptiveStatistics11.getVariance();
        java.lang.Class<?> wildcardClass21 = descriptiveStatistics11.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass21);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        descriptiveStatistics22.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str26 = descriptiveStatistics25.toString();
        descriptiveStatistics25.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics25.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double32 = descriptiveStatistics31.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics31.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double36 = descriptiveStatistics35.getStandardDeviation();
        long long37 = descriptiveStatistics35.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics35.getMinImpl();
        descriptiveStatistics31.setMaxImpl(univariateStatistic38);
        double double40 = descriptiveStatistics31.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics31.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics31.getMeanImpl();
        descriptiveStatistics25.setGeometricMeanImpl(univariateStatistic42);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics25.getGeometricMeanImpl();
        descriptiveStatistics22.setMaxImpl(univariateStatistic44);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics46 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str47 = descriptiveStatistics46.toString();
        descriptiveStatistics46.clear();
        double double49 = descriptiveStatistics46.getMean();
        double double50 = descriptiveStatistics46.getSkewness();
        long long51 = descriptiveStatistics46.getN();
        double double52 = descriptiveStatistics46.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics46.getSkewnessImpl();
        descriptiveStatistics22.setSumImpl(univariateStatistic53);
        descriptiveStatistics0.setMinImpl(univariateStatistic53);
        double[] doubleArray56 = descriptiveStatistics0.getValues();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str26, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(descriptiveStatistics46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str47, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        descriptiveStatistics0.addValue((double) (byte) 1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = null;
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic8);
        double[] doubleArray10 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        descriptiveStatistics11.setKurtosisImpl(univariateStatistic14);
        descriptiveStatistics11.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics17.getKurtosisImpl();
        long long20 = descriptiveStatistics17.getN();
        double double21 = descriptiveStatistics17.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getSumsqImpl();
        descriptiveStatistics22.setKurtosisImpl(univariateStatistic25);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getSumsqImpl();
        descriptiveStatistics27.setKurtosisImpl(univariateStatistic30);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics27.getKurtosisImpl();
        descriptiveStatistics22.setMaxImpl(univariateStatistic32);
        descriptiveStatistics17.setSumImpl(univariateStatistic32);
        descriptiveStatistics11.setSumsqImpl(univariateStatistic32);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics36 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str37 = descriptiveStatistics36.toString();
        descriptiveStatistics36.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics36.getGeometricMeanImpl();
        double double40 = descriptiveStatistics36.getMax();
        double double41 = descriptiveStatistics36.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics36.getVarianceImpl();
        descriptiveStatistics11.setMeanImpl(univariateStatistic42);
        double double44 = descriptiveStatistics11.getMean();
        double double45 = descriptiveStatistics11.getMean();
        double double46 = descriptiveStatistics11.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics47 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics47.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics47.getKurtosisImpl();
        double[] doubleArray50 = descriptiveStatistics47.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics47.getVarianceImpl();
        double double52 = descriptiveStatistics47.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics47.getGeometricMeanImpl();
        descriptiveStatistics11.setMaxImpl(univariateStatistic53);
        double double55 = descriptiveStatistics0.apply(univariateStatistic53);
        double double56 = descriptiveStatistics0.getSum();
        double double57 = descriptiveStatistics0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double59 = descriptiveStatistics0.getPercentile(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal quantile value: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(descriptiveStatistics36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str37, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(descriptiveStatistics47);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        descriptiveStatistics0.clear();
        double double11 = descriptiveStatistics0.getSum();
        double double12 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str14 = descriptiveStatistics13.toString();
        double double15 = descriptiveStatistics13.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        descriptiveStatistics13.setSkewnessImpl(univariateStatistic19);
        double double22 = descriptiveStatistics13.getStandardDeviation();
        descriptiveStatistics13.clear();
        descriptiveStatistics13.setWindowSize((int) (short) -1);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics26.getKurtosisImpl();
        long long29 = descriptiveStatistics26.getN();
        descriptiveStatistics26.addValue((double) 0);
        int int32 = descriptiveStatistics26.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics26.getGeometricMeanImpl();
        descriptiveStatistics13.setVarianceImpl(univariateStatistic33);
        descriptiveStatistics0.setSumImpl(univariateStatistic33);
        double double36 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        descriptiveStatistics37.setKurtosisImpl(univariateStatistic40);
        descriptiveStatistics37.clear();
        double double43 = descriptiveStatistics37.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics37.getVarianceImpl();
        double double45 = descriptiveStatistics37.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics37.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics37.getMinImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic47);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double51 = descriptiveStatistics50.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics50.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics50.getKurtosisImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic53);
        double double55 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics0.getKurtosisImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str14, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(univariateStatistic56);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        double double6 = descriptiveStatistics0.getVariance();
        double double7 = descriptiveStatistics0.getMax();
        double double8 = descriptiveStatistics0.getKurtosis();
        double[] doubleArray9 = descriptiveStatistics0.getValues();
        double double10 = descriptiveStatistics0.getMean();
        java.lang.String str11 = descriptiveStatistics0.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics0.getSkewnessImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str11, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic12);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        descriptiveStatistics1.setKurtosisImpl(univariateStatistic4);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics1.getKurtosisImpl();
        double[] doubleArray10 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double11 = univariateStatistic6.evaluate(doubleArray10);
        descriptiveStatistics0.setMaxImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics13.getKurtosisImpl();
        long long16 = descriptiveStatistics13.getN();
        double[] doubleArray17 = descriptiveStatistics13.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics13.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics13.getMeanImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getKurtosisImpl();
        long long25 = descriptiveStatistics22.getN();
        descriptiveStatistics22.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics22.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics22.getPercentileImpl();
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic29);
        double[] doubleArray31 = descriptiveStatistics0.getSortedValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics0.getMeanImpl();
        double[] doubleArray33 = descriptiveStatistics0.getValues();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(descriptiveStatistics1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getMinImpl();
        double double7 = descriptiveStatistics0.getMax();
        descriptiveStatistics0.addValue((double) (short) 1);
        double double10 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSumImpl();
        double double12 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        double double5 = descriptiveStatistics0.getVariance();
        double double6 = descriptiveStatistics0.getVariance();
        descriptiveStatistics0.clear();
        double double8 = descriptiveStatistics0.getSumsq();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        int int3 = resizableDoubleArray1.getNumElements();
        int int4 = resizableDoubleArray1.getNumElements();
        resizableDoubleArray1.setElement((int) '#', (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        descriptiveStatistics5.setKurtosisImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics5.getKurtosisImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic10);
        double double12 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics0.getMinImpl();
        descriptiveStatistics0.setWindowSize((int) (short) 100);
        java.lang.String str16 = descriptiveStatistics0.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double19 = descriptiveStatistics18.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics18.getGeometricMeanImpl();
        double double21 = descriptiveStatistics18.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getKurtosisImpl();
        long long25 = descriptiveStatistics22.getN();
        descriptiveStatistics22.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics22.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics22.getPercentileImpl();
        descriptiveStatistics18.setSumsqImpl(univariateStatistic29);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double32 = descriptiveStatistics31.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics33.getKurtosisImpl();
        long long36 = descriptiveStatistics33.getN();
        descriptiveStatistics33.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics41 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics41.getSumsqImpl();
        descriptiveStatistics39.setKurtosisImpl(univariateStatistic42);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics44.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics46 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics46.getSumsqImpl();
        descriptiveStatistics44.setKurtosisImpl(univariateStatistic47);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics44.getKurtosisImpl();
        descriptiveStatistics39.setMaxImpl(univariateStatistic49);
        double double51 = descriptiveStatistics39.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics39.getMinImpl();
        descriptiveStatistics33.setMinImpl(univariateStatistic52);
        descriptiveStatistics31.setMeanImpl(univariateStatistic52);
        descriptiveStatistics18.setMaxImpl(univariateStatistic52);
        descriptiveStatistics0.setMaxImpl(univariateStatistic52);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics59 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double60 = descriptiveStatistics59.getStandardDeviation();
        long long61 = descriptiveStatistics59.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics59.getSkewnessImpl();
        java.lang.String str63 = descriptiveStatistics59.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics65 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics65.getKurtosisImpl();
        descriptiveStatistics59.setMeanImpl(univariateStatistic66);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics68 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics68.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics70 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic71 = descriptiveStatistics70.getSumsqImpl();
        descriptiveStatistics68.setKurtosisImpl(univariateStatistic71);
        descriptiveStatistics68.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics68.getGeometricMeanImpl();
        descriptiveStatistics59.setKurtosisImpl(univariateStatistic74);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics76 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str77 = descriptiveStatistics76.toString();
        double double78 = descriptiveStatistics76.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics79 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic80 = descriptiveStatistics79.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics81 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic82 = descriptiveStatistics81.getSumsqImpl();
        descriptiveStatistics79.setKurtosisImpl(univariateStatistic82);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic84 = descriptiveStatistics79.getKurtosisImpl();
        double double85 = descriptiveStatistics76.apply(univariateStatistic84);
        double double86 = descriptiveStatistics76.getSumsq();
        double double87 = descriptiveStatistics76.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics88 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic89 = descriptiveStatistics88.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics90 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic91 = descriptiveStatistics90.getSumsqImpl();
        descriptiveStatistics88.setKurtosisImpl(univariateStatistic91);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic93 = descriptiveStatistics88.getKurtosisImpl();
        descriptiveStatistics76.setSumsqImpl(univariateStatistic93);
        double double95 = descriptiveStatistics59.apply(univariateStatistic93);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic96 = descriptiveStatistics59.getSumImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic96);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic98 = descriptiveStatistics0.getSumsqImpl();
        double double99 = descriptiveStatistics0.getSkewness();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str16, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(descriptiveStatistics44);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(descriptiveStatistics46);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str63, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic66);
        org.junit.Assert.assertNotNull(descriptiveStatistics68);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertNotNull(descriptiveStatistics70);
        org.junit.Assert.assertNotNull(univariateStatistic71);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertNotNull(descriptiveStatistics76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str77, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(descriptiveStatistics79);
        org.junit.Assert.assertNotNull(univariateStatistic80);
        org.junit.Assert.assertNotNull(descriptiveStatistics81);
        org.junit.Assert.assertNotNull(univariateStatistic82);
        org.junit.Assert.assertNotNull(univariateStatistic84);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertNotNull(descriptiveStatistics88);
        org.junit.Assert.assertNotNull(univariateStatistic89);
        org.junit.Assert.assertNotNull(descriptiveStatistics90);
        org.junit.Assert.assertNotNull(univariateStatistic91);
        org.junit.Assert.assertNotNull(univariateStatistic93);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertNotNull(univariateStatistic96);
        org.junit.Assert.assertNotNull(univariateStatistic98);
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getVariance();
        double double11 = descriptiveStatistics0.getSum();
        double double12 = descriptiveStatistics0.getMax();
        java.lang.String str13 = descriptiveStatistics0.toString();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str13, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        double double6 = descriptiveStatistics1.getVariance();
        descriptiveStatistics1.setWindowSize((int) (short) 100);
        descriptiveStatistics1.setWindowSize((int) (short) -1);
        double double11 = descriptiveStatistics1.getStandardDeviation();
        java.lang.String str12 = descriptiveStatistics1.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics1.getGeometricMeanImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str12, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic13);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        descriptiveStatistics0.setWindowSize((int) (short) 1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics0.getKurtosisImpl();
        double double14 = descriptiveStatistics0.getPercentile((double) 10);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics0.getPercentileImpl();
        double[] doubleArray16 = descriptiveStatistics0.getSortedValues();
        int int17 = descriptiveStatistics0.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics0.getSumsqImpl();
        descriptiveStatistics0.setWindowSize((int) (byte) -1);
        double double21 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getKurtosisImpl();
        long long25 = descriptiveStatistics22.getN();
        double[] doubleArray26 = descriptiveStatistics22.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics22.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = null;
        descriptiveStatistics22.setSkewnessImpl(univariateStatistic28);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = null;
        descriptiveStatistics22.setGeometricMeanImpl(univariateStatistic30);
        double double32 = descriptiveStatistics22.getSumsq();
        double double33 = descriptiveStatistics22.getSumsq();
        descriptiveStatistics22.addValue(32.0d);
        descriptiveStatistics22.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics22.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics41 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics41.getSumsqImpl();
        descriptiveStatistics39.setKurtosisImpl(univariateStatistic42);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics39.getKurtosisImpl();
        double[] doubleArray48 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double49 = univariateStatistic44.evaluate(doubleArray48);
        descriptiveStatistics38.setMaxImpl(univariateStatistic44);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics52 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        descriptiveStatistics52.setWindowSize((int) ' ');
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics57 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics57.getSumsqImpl();
        descriptiveStatistics55.setKurtosisImpl(univariateStatistic58);
        descriptiveStatistics55.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics55.getSkewnessImpl();
        descriptiveStatistics52.setSumsqImpl(univariateStatistic61);
        descriptiveStatistics38.setMeanImpl(univariateStatistic61);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics65 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double66 = descriptiveStatistics65.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic67 = descriptiveStatistics65.getGeometricMeanImpl();
        descriptiveStatistics38.setMinImpl(univariateStatistic67);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics38.getSumImpl();
        descriptiveStatistics22.setGeometricMeanImpl(univariateStatistic69);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics71 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        int int72 = descriptiveStatistics71.getWindowSize();
        double double73 = descriptiveStatistics71.getMean();
        long long74 = descriptiveStatistics71.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic75 = descriptiveStatistics71.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics76 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str77 = descriptiveStatistics76.toString();
        double double78 = descriptiveStatistics76.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics79 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic80 = descriptiveStatistics79.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics81 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic82 = descriptiveStatistics81.getSumsqImpl();
        descriptiveStatistics79.setKurtosisImpl(univariateStatistic82);
        descriptiveStatistics76.setSkewnessImpl(univariateStatistic82);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic85 = null;
        descriptiveStatistics76.setGeometricMeanImpl(univariateStatistic85);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic87 = descriptiveStatistics76.getPercentileImpl();
        descriptiveStatistics71.setSumsqImpl(univariateStatistic87);
        descriptiveStatistics22.setMeanImpl(univariateStatistic87);
        descriptiveStatistics0.setMeanImpl(univariateStatistic87);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2.0d + "'", double49 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(descriptiveStatistics57);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(univariateStatistic67);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertNotNull(descriptiveStatistics71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic75);
        org.junit.Assert.assertNotNull(descriptiveStatistics76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str77, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(descriptiveStatistics79);
        org.junit.Assert.assertNotNull(univariateStatistic80);
        org.junit.Assert.assertNotNull(descriptiveStatistics81);
        org.junit.Assert.assertNotNull(univariateStatistic82);
        org.junit.Assert.assertNotNull(univariateStatistic87);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics10.getKurtosisImpl();
        long long13 = descriptiveStatistics10.getN();
        double[] doubleArray14 = descriptiveStatistics10.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics10.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics10.getMinImpl();
        descriptiveStatistics0.setMinImpl(univariateStatistic16);
        double double18 = descriptiveStatistics0.getStandardDeviation();
        double double19 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        descriptiveStatistics21.setKurtosisImpl(univariateStatistic24);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        descriptiveStatistics26.setKurtosisImpl(univariateStatistic29);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics26.getKurtosisImpl();
        descriptiveStatistics21.setMaxImpl(univariateStatistic31);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        descriptiveStatistics33.setKurtosisImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics33.getKurtosisImpl();
        descriptiveStatistics21.setGeometricMeanImpl(univariateStatistic38);
        double double40 = descriptiveStatistics21.getMin();
        double[] doubleArray41 = descriptiveStatistics21.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics21.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics21.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str45 = descriptiveStatistics44.toString();
        descriptiveStatistics44.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics44.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics44.getSumsqImpl();
        double double50 = descriptiveStatistics44.getPercentile(Double.NaN);
        double double51 = descriptiveStatistics44.getKurtosis();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics52 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics53 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics53.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        descriptiveStatistics53.setKurtosisImpl(univariateStatistic56);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics53.getKurtosisImpl();
        double[] doubleArray62 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double63 = univariateStatistic58.evaluate(doubleArray62);
        descriptiveStatistics52.setMaxImpl(univariateStatistic58);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics65 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics65.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic67 = descriptiveStatistics65.getKurtosisImpl();
        long long68 = descriptiveStatistics65.getN();
        double[] doubleArray69 = descriptiveStatistics65.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic70 = descriptiveStatistics65.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic71 = descriptiveStatistics65.getMeanImpl();
        descriptiveStatistics52.setGeometricMeanImpl(univariateStatistic71);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic73 = descriptiveStatistics52.getSumsqImpl();
        double double74 = descriptiveStatistics44.apply(univariateStatistic73);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic75 = descriptiveStatistics44.getGeometricMeanImpl();
        descriptiveStatistics21.setSkewnessImpl(univariateStatistic75);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic75);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic78 = descriptiveStatistics0.getPercentileImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertNotNull(descriptiveStatistics44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str45, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(descriptiveStatistics52);
        org.junit.Assert.assertNotNull(descriptiveStatistics53);
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2.0d + "'", double63 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics65);
        org.junit.Assert.assertNotNull(univariateStatistic66);
        org.junit.Assert.assertNotNull(univariateStatistic67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic70);
        org.junit.Assert.assertNotNull(univariateStatistic71);
        org.junit.Assert.assertNotNull(univariateStatistic73);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(univariateStatistic75);
        org.junit.Assert.assertNotNull(univariateStatistic78);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getSumsqImpl();
        double double8 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics0.getSumsqImpl();
        double[] doubleArray10 = descriptiveStatistics0.getSortedValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSkewnessImpl();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics0.getGeometricMeanImpl();
        double double14 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics15.getKurtosisImpl();
        double[] doubleArray18 = descriptiveStatistics15.getValues();
        double double19 = descriptiveStatistics15.getVariance();
        double double20 = descriptiveStatistics15.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str22 = descriptiveStatistics21.toString();
        double double23 = descriptiveStatistics21.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        descriptiveStatistics24.setKurtosisImpl(univariateStatistic27);
        descriptiveStatistics21.setSkewnessImpl(univariateStatistic27);
        double double30 = descriptiveStatistics21.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics31.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics31.getKurtosisImpl();
        long long34 = descriptiveStatistics31.getN();
        double[] doubleArray35 = descriptiveStatistics31.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics31.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics31.getMinImpl();
        descriptiveStatistics21.setMinImpl(univariateStatistic37);
        descriptiveStatistics15.setMeanImpl(univariateStatistic37);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics15.getSumsqImpl();
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray41 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int42 = resizableDoubleArray41.getExpansionMode();
        int int43 = resizableDoubleArray41.getNumElements();
        double[] doubleArray44 = resizableDoubleArray41.getValues();
        double double46 = resizableDoubleArray41.addElementRolling((double) (-1));
        double[] doubleArray47 = resizableDoubleArray41.getElements();
        double[] doubleArray48 = resizableDoubleArray41.getElements();
        double double49 = univariateStatistic40.evaluate(doubleArray48);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic40);
        double double51 = descriptiveStatistics0.getSum();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str22, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(descriptiveStatistics31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement(0, (double) 0.0f);
        resizableDoubleArray0.clear();
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getMinImpl();
        long long7 = descriptiveStatistics0.getN();
        int int8 = descriptiveStatistics0.getWindowSize();
        double double9 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics0.getMeanImpl();
        double double11 = descriptiveStatistics0.getMax();
        double[] doubleArray12 = descriptiveStatistics0.getValues();
        int int13 = descriptiveStatistics0.getWindowSize();
        double double14 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str16 = descriptiveStatistics15.toString();
        double double17 = descriptiveStatistics15.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics20.getSumsqImpl();
        descriptiveStatistics18.setKurtosisImpl(univariateStatistic21);
        descriptiveStatistics15.setSkewnessImpl(univariateStatistic21);
        double double24 = descriptiveStatistics15.getStandardDeviation();
        descriptiveStatistics15.clear();
        double double26 = descriptiveStatistics15.getSum();
        double double27 = descriptiveStatistics15.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str29 = descriptiveStatistics28.toString();
        double double30 = descriptiveStatistics28.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics31.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        descriptiveStatistics31.setKurtosisImpl(univariateStatistic34);
        descriptiveStatistics28.setSkewnessImpl(univariateStatistic34);
        double double37 = descriptiveStatistics28.getStandardDeviation();
        descriptiveStatistics28.clear();
        descriptiveStatistics28.setWindowSize((int) (short) -1);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics41 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics41.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics41.getKurtosisImpl();
        long long44 = descriptiveStatistics41.getN();
        descriptiveStatistics41.addValue((double) 0);
        int int47 = descriptiveStatistics41.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics41.getGeometricMeanImpl();
        descriptiveStatistics28.setVarianceImpl(univariateStatistic48);
        descriptiveStatistics15.setSumImpl(univariateStatistic48);
        double double51 = descriptiveStatistics15.getMin();
        double double52 = descriptiveStatistics15.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics53 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str54 = descriptiveStatistics53.toString();
        descriptiveStatistics53.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics53.getGeometricMeanImpl();
        descriptiveStatistics15.setSkewnessImpl(univariateStatistic56);
        double double58 = descriptiveStatistics15.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics59 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics59.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics59.getKurtosisImpl();
        long long62 = descriptiveStatistics59.getN();
        descriptiveStatistics59.addValue((double) 0);
        int int65 = descriptiveStatistics59.getWindowSize();
        double double66 = descriptiveStatistics59.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic67 = descriptiveStatistics59.getMeanImpl();
        double double68 = descriptiveStatistics59.getKurtosis();
        double double70 = descriptiveStatistics59.getPercentile((double) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics71 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic72 = descriptiveStatistics71.getSumsqImpl();
        double double73 = descriptiveStatistics71.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics71.getSkewnessImpl();
        descriptiveStatistics59.setMaxImpl(univariateStatistic74);
        long long76 = descriptiveStatistics59.getN();
        double double77 = descriptiveStatistics59.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic78 = descriptiveStatistics59.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics80 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) 1);
        double double81 = descriptiveStatistics80.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics82 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic83 = descriptiveStatistics82.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic84 = descriptiveStatistics82.getKurtosisImpl();
        descriptiveStatistics80.setMinImpl(univariateStatistic84);
        descriptiveStatistics59.setVarianceImpl(univariateStatistic84);
        double double87 = descriptiveStatistics59.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics88 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic89 = descriptiveStatistics88.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic90 = descriptiveStatistics88.getKurtosisImpl();
        long long91 = descriptiveStatistics88.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic92 = descriptiveStatistics88.getPercentileImpl();
        descriptiveStatistics59.setSkewnessImpl(univariateStatistic92);
        descriptiveStatistics15.setMeanImpl(univariateStatistic92);
        descriptiveStatistics0.setMeanImpl(univariateStatistic92);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str16, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str29, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(descriptiveStatistics31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(descriptiveStatistics41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(descriptiveStatistics53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str54, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(descriptiveStatistics59);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic67);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics71);
        org.junit.Assert.assertNotNull(univariateStatistic72);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic78);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(descriptiveStatistics82);
        org.junit.Assert.assertNotNull(univariateStatistic83);
        org.junit.Assert.assertNotNull(univariateStatistic84);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics88);
        org.junit.Assert.assertNotNull(univariateStatistic89);
        org.junit.Assert.assertNotNull(univariateStatistic90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic92);
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        descriptiveStatistics5.setKurtosisImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics5.getKurtosisImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic10);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics12.getKurtosisImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic17);
        double double19 = descriptiveStatistics0.getMin();
        double[] doubleArray20 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics0.getMinImpl();
        double double23 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics0.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics0.getSumsqImpl();
        double[] doubleArray26 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics0.getSumsqImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic27);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics4 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics4.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics4.getKurtosisImpl();
        double double7 = descriptiveStatistics4.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double9 = descriptiveStatistics8.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics8.getSumImpl();
        descriptiveStatistics4.setMinImpl(univariateStatistic10);
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic10);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics13.getKurtosisImpl();
        double[] doubleArray16 = descriptiveStatistics13.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics13.getVarianceImpl();
        double double18 = descriptiveStatistics13.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics13.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double22 = descriptiveStatistics21.getStandardDeviation();
        long long23 = descriptiveStatistics21.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics21.getSkewnessImpl();
        java.lang.String str25 = descriptiveStatistics21.toString();
        double double26 = descriptiveStatistics21.getVariance();
        descriptiveStatistics21.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics21.getGeometricMeanImpl();
        descriptiveStatistics13.setMeanImpl(univariateStatistic29);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics13.getSumsqImpl();
        double double32 = descriptiveStatistics13.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str34 = descriptiveStatistics33.toString();
        double double35 = descriptiveStatistics33.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics36 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics36.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        descriptiveStatistics36.setKurtosisImpl(univariateStatistic39);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics36.getKurtosisImpl();
        double double42 = descriptiveStatistics33.apply(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double45 = descriptiveStatistics44.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics44.getGeometricMeanImpl();
        descriptiveStatistics33.setMeanImpl(univariateStatistic46);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics33.getSumImpl();
        double[] doubleArray49 = descriptiveStatistics33.getSortedValues();
        long long50 = descriptiveStatistics33.getN();
        double double51 = descriptiveStatistics33.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics33.getKurtosisImpl();
        double double53 = descriptiveStatistics13.apply(univariateStatistic52);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics13.getPercentileImpl();
        descriptiveStatistics0.setMinImpl(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics4);
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str25, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str34, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(descriptiveStatistics36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(univariateStatistic54);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSumImpl();
        double double12 = descriptiveStatistics0.getMin();
        double[] doubleArray13 = descriptiveStatistics0.getSortedValues();
        double double14 = descriptiveStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics0.getSkewnessImpl();
        double double16 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics0.getPercentileImpl();
        double double19 = descriptiveStatistics0.getPercentile((double) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics0.getGeometricMeanImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(univariateStatistic20);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        double double5 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getPercentileImpl();
        double double7 = descriptiveStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics0.getPercentileImpl();
        double double10 = descriptiveStatistics0.getMean();
        double double11 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics0.getGeometricMeanImpl();
        double double4 = descriptiveStatistics0.getMax();
        double[] doubleArray5 = descriptiveStatistics0.getSortedValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics(10);
        double double9 = descriptiveStatistics8.getMean();
        double double10 = descriptiveStatistics8.getVariance();
        double double11 = descriptiveStatistics8.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str13 = descriptiveStatistics12.toString();
        descriptiveStatistics12.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics12.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics17.getKurtosisImpl();
        long long20 = descriptiveStatistics17.getN();
        double double21 = descriptiveStatistics17.getMax();
        double double22 = descriptiveStatistics17.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double24 = descriptiveStatistics23.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics23.getMinImpl();
        descriptiveStatistics17.setSumImpl(univariateStatistic25);
        descriptiveStatistics12.setSumImpl(univariateStatistic25);
        double double28 = descriptiveStatistics12.getVariance();
        double double29 = descriptiveStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics30.getKurtosisImpl();
        long long33 = descriptiveStatistics30.getN();
        double[] doubleArray34 = descriptiveStatistics30.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics30.getSumImpl();
        double double36 = descriptiveStatistics30.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics30.getSumImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic37);
        double[] doubleArray39 = descriptiveStatistics12.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics12.getGeometricMeanImpl();
        double double41 = descriptiveStatistics12.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics12.getMeanImpl();
        descriptiveStatistics8.setMaxImpl(univariateStatistic42);
        double double44 = descriptiveStatistics8.getVariance();
        double double45 = descriptiveStatistics8.getMin();
        double double46 = descriptiveStatistics8.getStandardDeviation();
        double[] doubleArray47 = descriptiveStatistics8.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double50 = univariateStatistic6.evaluate(doubleArray47, 11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str13, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 0);
        double double5 = resizableDoubleArray0.addElementRolling((double) 0.0f);
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setNumElements((int) '4');
        double double10 = resizableDoubleArray0.addElementRolling((double) (byte) -1);
        resizableDoubleArray0.setElement((int) '4', (double) '4');
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        double[] doubleArray5 = descriptiveStatistics0.getValues();
        double double6 = descriptiveStatistics0.getSumsq();
        double double7 = descriptiveStatistics0.getMin();
        double double8 = descriptiveStatistics0.getKurtosis();
        double double9 = descriptiveStatistics0.getStandardDeviation();
        long long10 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue(35.5d);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.setElement(0, (double) 100.0f);
        int int6 = resizableDoubleArray1.start();
        double[] doubleArray7 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.setElement(32, 33.0d);
        resizableDoubleArray1.setElement(35, 100.00000000000004d);
        int int14 = resizableDoubleArray1.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        double double4 = descriptiveStatistics1.getMin();
        long long5 = descriptiveStatistics1.getN();
        double double6 = descriptiveStatistics1.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics1.getSkewnessImpl();
        descriptiveStatistics1.addValue(52.0d);
        java.lang.String str11 = descriptiveStatistics1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DescriptiveStatistics:\nn: 1\nmin: 52.0\nmax: 52.0\nmean: 52.0\nstd dev: 0.0\nmedian: 52.0\nskewness: NaN\nkurtosis: NaN\n" + "'", str11, "DescriptiveStatistics:\nn: 1\nmin: 52.0\nmax: 52.0\nmean: 52.0\nstd dev: 0.0\nmedian: 52.0\nskewness: NaN\nkurtosis: NaN\n");
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(32, (float) 10, (float) 32);
        float float4 = resizableDoubleArray3.getContractionCriteria();
        int int5 = resizableDoubleArray3.getExpansionMode();
        float float6 = resizableDoubleArray3.getContractionCriteria();
        double double8 = resizableDoubleArray3.addElementRolling((double) (short) 10);
        resizableDoubleArray3.addElement((double) 10L);
        double[] doubleArray11 = resizableDoubleArray3.getElements();
        resizableDoubleArray3.clear();
        double[] doubleArray13 = resizableDoubleArray3.getValues();
        int int14 = resizableDoubleArray3.start();
        int int15 = resizableDoubleArray3.getNumElements();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.setElement(0, (double) 100.0f);
        int int6 = resizableDoubleArray1.start();
        int int7 = resizableDoubleArray1.getNumElements();
        resizableDoubleArray1.contract();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        double double2 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics0.getVarianceImpl();
        double double4 = descriptiveStatistics0.getMin();
        double[] doubleArray5 = descriptiveStatistics0.getSortedValues();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.setElement(1, (double) 100.0f);
        float float7 = resizableDoubleArray0.getExpansionFactor();
        double double9 = resizableDoubleArray0.getElement(1);
        resizableDoubleArray0.addElement((double) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        double double5 = resizableDoubleArray0.addElementRolling((double) (-1));
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(100);
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        double[] doubleArray2 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) 100);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        resizableDoubleArray0.setNumElements((int) (byte) 1);
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) 0L);
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0]");
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) ' ');
        int int3 = resizableDoubleArray2.getNumElements();
        int int4 = resizableDoubleArray2.getExpansionMode();
        resizableDoubleArray2.addElement((double) 0);
        resizableDoubleArray2.addElement(53.0d);
        resizableDoubleArray2.setElement((int) ' ', 52.5d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', 2.0f, (float) 100);
        int int4 = resizableDoubleArray3.getExpansionMode();
        int int5 = resizableDoubleArray3.getExpansionMode();
        resizableDoubleArray3.contract();
        float float7 = resizableDoubleArray3.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue((double) 0);
        int int6 = descriptiveStatistics0.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getGeometricMeanImpl();
        double double8 = descriptiveStatistics0.getGeometricMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = descriptiveStatistics0.getElement(55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 55 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getVarianceImpl();
        double double3 = descriptiveStatistics1.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics4 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics4.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        descriptiveStatistics4.setKurtosisImpl(univariateStatistic7);
        double[] doubleArray9 = descriptiveStatistics4.getValues();
        double double10 = descriptiveStatistics4.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics4.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double14 = descriptiveStatistics13.getStandardDeviation();
        long long15 = descriptiveStatistics13.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics13.getSkewnessImpl();
        java.lang.String str17 = descriptiveStatistics13.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getKurtosisImpl();
        descriptiveStatistics13.setMeanImpl(univariateStatistic20);
        double double22 = descriptiveStatistics13.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str24 = descriptiveStatistics23.toString();
        descriptiveStatistics23.addValue((double) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics23.getKurtosisImpl();
        descriptiveStatistics13.setGeometricMeanImpl(univariateStatistic27);
        descriptiveStatistics4.setKurtosisImpl(univariateStatistic27);
        descriptiveStatistics1.setMinImpl(univariateStatistic27);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics1.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics1.getKurtosisImpl();
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(descriptiveStatistics4);
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str17, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str24, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.setElement(1, (double) 100.0f);
        float float7 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) '4');
        resizableDoubleArray0.setElement((int) '#', (double) 100.0f);
        double double14 = resizableDoubleArray0.getElement(34);
        resizableDoubleArray0.addElement(10.5d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        descriptiveStatistics1.setKurtosisImpl(univariateStatistic4);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics1.getKurtosisImpl();
        double[] doubleArray10 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double11 = univariateStatistic6.evaluate(doubleArray10);
        descriptiveStatistics0.setMaxImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics13.getKurtosisImpl();
        long long16 = descriptiveStatistics13.getN();
        double[] doubleArray17 = descriptiveStatistics13.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics13.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics13.getMeanImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getSumsqImpl();
        descriptiveStatistics22.setKurtosisImpl(univariateStatistic25);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics22.getKurtosisImpl();
        double double28 = descriptiveStatistics22.getStandardDeviation();
        double double29 = descriptiveStatistics22.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics22.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double33 = descriptiveStatistics32.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics32.getGeometricMeanImpl();
        double double35 = descriptiveStatistics32.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics36 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics36.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics36.getKurtosisImpl();
        double[] doubleArray39 = descriptiveStatistics36.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics36.getVarianceImpl();
        descriptiveStatistics32.setSumsqImpl(univariateStatistic40);
        double double42 = descriptiveStatistics22.apply(univariateStatistic40);
        descriptiveStatistics0.setVarianceImpl(univariateStatistic40);
        double double44 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics46 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double47 = descriptiveStatistics46.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics46.getGeometricMeanImpl();
        double double49 = descriptiveStatistics46.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics50.getKurtosisImpl();
        double[] doubleArray53 = descriptiveStatistics50.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics50.getVarianceImpl();
        descriptiveStatistics46.setSumsqImpl(univariateStatistic54);
        double double56 = descriptiveStatistics0.apply(univariateStatistic54);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics0.getMeanImpl();
        double double58 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic59 = descriptiveStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(descriptiveStatistics1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(descriptiveStatistics36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(univariateStatistic59);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics3.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics3.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics10.getKurtosisImpl();
        long long13 = descriptiveStatistics10.getN();
        double[] doubleArray14 = descriptiveStatistics10.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics10.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics10.getMinImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic16);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str21 = descriptiveStatistics20.toString();
        double double22 = descriptiveStatistics20.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        descriptiveStatistics23.setKurtosisImpl(univariateStatistic26);
        descriptiveStatistics20.setSkewnessImpl(univariateStatistic26);
        double double29 = descriptiveStatistics20.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double32 = descriptiveStatistics31.getStandardDeviation();
        long long33 = descriptiveStatistics31.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics31.getMinImpl();
        descriptiveStatistics20.setVarianceImpl(univariateStatistic34);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics20.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        descriptiveStatistics37.setKurtosisImpl(univariateStatistic40);
        descriptiveStatistics37.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics43 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics43.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics43.getKurtosisImpl();
        long long46 = descriptiveStatistics43.getN();
        double double47 = descriptiveStatistics43.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        descriptiveStatistics48.setKurtosisImpl(univariateStatistic51);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics53 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics53.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        descriptiveStatistics53.setKurtosisImpl(univariateStatistic56);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics53.getKurtosisImpl();
        descriptiveStatistics48.setMaxImpl(univariateStatistic58);
        descriptiveStatistics43.setSumImpl(univariateStatistic58);
        descriptiveStatistics37.setSumsqImpl(univariateStatistic58);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics62 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str63 = descriptiveStatistics62.toString();
        descriptiveStatistics62.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic65 = descriptiveStatistics62.getGeometricMeanImpl();
        double double66 = descriptiveStatistics62.getMax();
        double double67 = descriptiveStatistics62.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic68 = descriptiveStatistics62.getVarianceImpl();
        descriptiveStatistics37.setMeanImpl(univariateStatistic68);
        descriptiveStatistics20.setSumImpl(univariateStatistic68);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic71 = descriptiveStatistics20.getKurtosisImpl();
        double double72 = descriptiveStatistics20.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic73 = descriptiveStatistics20.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics20.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics76 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics77 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic78 = descriptiveStatistics77.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic79 = descriptiveStatistics77.getKurtosisImpl();
        long long80 = descriptiveStatistics77.getN();
        double[] doubleArray81 = descriptiveStatistics77.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic82 = descriptiveStatistics77.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic83 = descriptiveStatistics77.getMeanImpl();
        descriptiveStatistics76.setSumsqImpl(univariateStatistic83);
        double double86 = descriptiveStatistics76.getPercentile((double) 2);
        double double87 = descriptiveStatistics76.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic88 = descriptiveStatistics76.getMeanImpl();
        descriptiveStatistics20.setKurtosisImpl(univariateStatistic88);
        double double90 = descriptiveStatistics0.apply(univariateStatistic88);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str21, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics43);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(descriptiveStatistics53);
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(descriptiveStatistics62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str63, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic65);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(univariateStatistic68);
        org.junit.Assert.assertNotNull(univariateStatistic71);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(univariateStatistic73);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertNotNull(descriptiveStatistics77);
        org.junit.Assert.assertNotNull(univariateStatistic78);
        org.junit.Assert.assertNotNull(univariateStatistic79);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic82);
        org.junit.Assert.assertNotNull(univariateStatistic83);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertNotNull(univariateStatistic88);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        double double5 = resizableDoubleArray0.addElementRolling((double) (-1));
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) '4');
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        int int11 = resizableDoubleArray0.getNumElements();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 0);
        double double5 = resizableDoubleArray0.addElementRolling((double) 0.0f);
        int int6 = resizableDoubleArray0.start();
        double double8 = resizableDoubleArray0.addElementRolling((double) (short) 100);
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setElement(101, (double) 0L);
        int int13 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) (byte) 1);
        double double17 = resizableDoubleArray0.addElementRolling(2705.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setElement((-1), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getMinImpl();
        double double5 = descriptiveStatistics1.getMax();
        java.lang.String str6 = descriptiveStatistics1.toString();
        long long7 = descriptiveStatistics1.getN();
        double double8 = descriptiveStatistics1.getVariance();
        double double9 = descriptiveStatistics1.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics1.getSkewnessImpl();
        double double11 = descriptiveStatistics1.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            descriptiveStatistics1.setWindowSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: window size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str6, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) 90);
        int int3 = resizableDoubleArray2.getExpansionMode();
        resizableDoubleArray2.contract();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = null;
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic9);
        double double11 = descriptiveStatistics0.getSumsq();
        double double12 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics0.getMaxImpl();
        double[] doubleArray15 = descriptiveStatistics0.getSortedValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        descriptiveStatistics0.clear();
        double double11 = descriptiveStatistics0.getSum();
        double double12 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str14 = descriptiveStatistics13.toString();
        double double15 = descriptiveStatistics13.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        descriptiveStatistics13.setSkewnessImpl(univariateStatistic19);
        double double22 = descriptiveStatistics13.getStandardDeviation();
        descriptiveStatistics13.clear();
        descriptiveStatistics13.setWindowSize((int) (short) -1);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics26.getKurtosisImpl();
        long long29 = descriptiveStatistics26.getN();
        descriptiveStatistics26.addValue((double) 0);
        int int32 = descriptiveStatistics26.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics26.getGeometricMeanImpl();
        descriptiveStatistics13.setVarianceImpl(univariateStatistic33);
        descriptiveStatistics0.setSumImpl(univariateStatistic33);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        descriptiveStatistics37.setKurtosisImpl(univariateStatistic40);
        descriptiveStatistics37.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics37.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics37.getSumsqImpl();
        double double45 = descriptiveStatistics37.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics37.getSumsqImpl();
        double[] doubleArray47 = descriptiveStatistics37.getSortedValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics37.getSkewnessImpl();
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic48);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str51 = descriptiveStatistics50.toString();
        double double52 = descriptiveStatistics50.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics53 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics53.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        descriptiveStatistics53.setKurtosisImpl(univariateStatistic56);
        descriptiveStatistics50.setSkewnessImpl(univariateStatistic56);
        double double59 = descriptiveStatistics50.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics61 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double62 = descriptiveStatistics61.getStandardDeviation();
        long long63 = descriptiveStatistics61.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics61.getMinImpl();
        descriptiveStatistics50.setVarianceImpl(univariateStatistic64);
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray66 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int67 = resizableDoubleArray66.start();
        resizableDoubleArray66.addElement((double) (byte) 0);
        resizableDoubleArray66.contract();
        resizableDoubleArray66.clear();
        int int72 = resizableDoubleArray66.getExpansionMode();
        resizableDoubleArray66.clear();
        resizableDoubleArray66.addElement(1.0d);
        double[] doubleArray76 = resizableDoubleArray66.getValues();
        double double77 = univariateStatistic64.evaluate(doubleArray76);
        double double78 = descriptiveStatistics0.apply(univariateStatistic64);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic79 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic80 = descriptiveStatistics0.getSumImpl();
        double double81 = descriptiveStatistics0.getMean();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str14, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str51, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(descriptiveStatistics53);
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(univariateStatistic79);
        org.junit.Assert.assertNotNull(univariateStatistic80);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        double[] doubleArray5 = descriptiveStatistics0.getValues();
        double double6 = descriptiveStatistics0.getSumsq();
        java.lang.String str7 = descriptiveStatistics0.toString();
        double double8 = descriptiveStatistics0.getVariance();
        java.lang.Class<?> wildcardClass9 = descriptiveStatistics0.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass9);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass9);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass9);
        double double13 = descriptiveStatistics12.getMin();
        double double14 = descriptiveStatistics12.getGeometricMean();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str7, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 0);
        double double5 = resizableDoubleArray0.addElementRolling((double) 0.0f);
        int int6 = resizableDoubleArray0.start();
        double double8 = resizableDoubleArray0.addElementRolling((double) (short) 100);
        int int9 = resizableDoubleArray0.getExpansionMode();
        int int10 = resizableDoubleArray0.start();
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        int int13 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, 2.5f, 32.0f);
        double[] doubleArray4 = resizableDoubleArray3.getValues();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        double[] doubleArray5 = resizableDoubleArray0.getElements();
        int int6 = resizableDoubleArray0.getNumElements();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 1.0f);
        resizableDoubleArray0.addElement(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics10.getKurtosisImpl();
        long long13 = descriptiveStatistics10.getN();
        descriptiveStatistics10.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics10.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        descriptiveStatistics17.setKurtosisImpl(univariateStatistic20);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics17.getKurtosisImpl();
        double[] doubleArray26 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double27 = univariateStatistic22.evaluate(doubleArray26);
        descriptiveStatistics10.setSkewnessImpl(univariateStatistic22);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics10.getGeometricMeanImpl();
        descriptiveStatistics0.setMinImpl(univariateStatistic29);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics0.getSkewnessImpl();
        double double33 = descriptiveStatistics0.getMax();
        double double34 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.0d + "'", double27 == 2.0d);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        double[] doubleArray3 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics0.getVarianceImpl();
        double double5 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double9 = descriptiveStatistics8.getStandardDeviation();
        long long10 = descriptiveStatistics8.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics8.getSkewnessImpl();
        java.lang.String str12 = descriptiveStatistics8.toString();
        double double13 = descriptiveStatistics8.getVariance();
        descriptiveStatistics8.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics8.getGeometricMeanImpl();
        descriptiveStatistics0.setMeanImpl(univariateStatistic16);
        long long18 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics19.getKurtosisImpl();
        long long22 = descriptiveStatistics19.getN();
        double[] doubleArray23 = descriptiveStatistics19.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics19.getSumImpl();
        double double25 = descriptiveStatistics19.getVariance();
        double double26 = descriptiveStatistics19.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getSumsqImpl();
        descriptiveStatistics27.setKurtosisImpl(univariateStatistic30);
        descriptiveStatistics27.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics27.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics34.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics34.getKurtosisImpl();
        long long37 = descriptiveStatistics34.getN();
        descriptiveStatistics34.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics34.getSkewnessImpl();
        descriptiveStatistics27.setSumsqImpl(univariateStatistic40);
        double double42 = descriptiveStatistics27.getStandardDeviation();
        double double43 = descriptiveStatistics27.getSum();
        double double44 = descriptiveStatistics27.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics45 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str46 = descriptiveStatistics45.toString();
        double double47 = descriptiveStatistics45.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        descriptiveStatistics48.setKurtosisImpl(univariateStatistic51);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics48.getKurtosisImpl();
        double double54 = descriptiveStatistics45.apply(univariateStatistic53);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics56 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double57 = descriptiveStatistics56.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics56.getGeometricMeanImpl();
        descriptiveStatistics45.setMeanImpl(univariateStatistic58);
        descriptiveStatistics27.setSkewnessImpl(univariateStatistic58);
        descriptiveStatistics19.setSumImpl(univariateStatistic58);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics19.getGeometricMeanImpl();
        double double63 = descriptiveStatistics0.apply(univariateStatistic62);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str12, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(descriptiveStatistics34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(descriptiveStatistics45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str46, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getNumElements();
        int int5 = resizableDoubleArray0.getExpansionMode();
        double double7 = resizableDoubleArray0.addElementRolling((double) 11);
        resizableDoubleArray0.clear();
        double double10 = resizableDoubleArray0.addElementRolling((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        double double6 = descriptiveStatistics0.getStandardDeviation();
        double double7 = descriptiveStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics0.getVarianceImpl();
        double double9 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str11 = descriptiveStatistics10.toString();
        double double12 = descriptiveStatistics10.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        descriptiveStatistics13.setKurtosisImpl(univariateStatistic16);
        descriptiveStatistics10.setSkewnessImpl(univariateStatistic16);
        double double19 = descriptiveStatistics10.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double22 = descriptiveStatistics21.getStandardDeviation();
        long long23 = descriptiveStatistics21.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics21.getMinImpl();
        descriptiveStatistics10.setVarianceImpl(univariateStatistic24);
        int int26 = descriptiveStatistics10.getWindowSize();
        java.lang.String str27 = descriptiveStatistics10.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double30 = descriptiveStatistics29.getStandardDeviation();
        long long31 = descriptiveStatistics29.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics29.getMinImpl();
        double double33 = descriptiveStatistics29.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        descriptiveStatistics35.setKurtosisImpl(univariateStatistic38);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics35.getKurtosisImpl();
        double[] doubleArray44 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double45 = univariateStatistic40.evaluate(doubleArray44);
        descriptiveStatistics34.setMaxImpl(univariateStatistic40);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics47 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics47.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics47.getKurtosisImpl();
        long long50 = descriptiveStatistics47.getN();
        double[] doubleArray51 = descriptiveStatistics47.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics47.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics47.getMeanImpl();
        descriptiveStatistics34.setGeometricMeanImpl(univariateStatistic53);
        descriptiveStatistics29.setGeometricMeanImpl(univariateStatistic53);
        descriptiveStatistics10.setSumImpl(univariateStatistic53);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics10.getGeometricMeanImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic57);
        // The following exception was thrown during execution in test generation
        try {
            double double60 = descriptiveStatistics0.getPercentile(1024.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal quantile value: 1024.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str11, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str27, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(descriptiveStatistics34);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 2.0d + "'", double45 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics47);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertNotNull(univariateStatistic57);
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = null;
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = null;
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic8);
        double double10 = descriptiveStatistics0.getSumsq();
        double double11 = descriptiveStatistics0.getSumsq();
        descriptiveStatistics0.addValue(32.0d);
        double double14 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        descriptiveStatistics15.setKurtosisImpl(univariateStatistic18);
        descriptiveStatistics15.clear();
        int int21 = descriptiveStatistics15.getWindowSize();
        double double22 = descriptiveStatistics15.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getVarianceImpl();
        double double26 = descriptiveStatistics24.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double28 = descriptiveStatistics27.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double31 = descriptiveStatistics30.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics30.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double35 = descriptiveStatistics34.getStandardDeviation();
        long long36 = descriptiveStatistics34.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics34.getMinImpl();
        descriptiveStatistics30.setMaxImpl(univariateStatistic37);
        descriptiveStatistics27.setMinImpl(univariateStatistic37);
        descriptiveStatistics24.setSumImpl(univariateStatistic37);
        descriptiveStatistics15.setSkewnessImpl(univariateStatistic37);
        descriptiveStatistics0.setMaxImpl(univariateStatistic37);
        int int43 = descriptiveStatistics0.getWindowSize();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics44.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics44.getKurtosisImpl();
        long long47 = descriptiveStatistics44.getN();
        double[] doubleArray48 = descriptiveStatistics44.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics44.getSumImpl();
        double double50 = descriptiveStatistics44.getVariance();
        double double51 = descriptiveStatistics44.getMin();
        descriptiveStatistics44.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics53 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str54 = descriptiveStatistics53.toString();
        double double55 = descriptiveStatistics53.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics56 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics56.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics58 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic59 = descriptiveStatistics58.getSumsqImpl();
        descriptiveStatistics56.setKurtosisImpl(univariateStatistic59);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics56.getKurtosisImpl();
        double double62 = descriptiveStatistics53.apply(univariateStatistic61);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics64 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double65 = descriptiveStatistics64.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics64.getGeometricMeanImpl();
        descriptiveStatistics53.setMeanImpl(univariateStatistic66);
        descriptiveStatistics44.setSkewnessImpl(univariateStatistic66);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic66);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(descriptiveStatistics44);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(descriptiveStatistics53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str54, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(descriptiveStatistics56);
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertNotNull(descriptiveStatistics58);
        org.junit.Assert.assertNotNull(univariateStatistic59);
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(univariateStatistic66);
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        int int3 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) (short) 10, (double) 100L);
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        double double9 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.discardFrontElements((int) (short) 0);
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.addElementRolling((double) (short) 1);
        resizableDoubleArray0.setNumElements(10);
        int int17 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 100.00000000000004, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        java.lang.String str6 = descriptiveStatistics1.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics7.getKurtosisImpl();
        double[] doubleArray10 = descriptiveStatistics7.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics11.getKurtosisImpl();
        long long14 = descriptiveStatistics11.getN();
        double[] doubleArray15 = descriptiveStatistics11.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics11.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics11.getMinImpl();
        double double18 = descriptiveStatistics11.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str20 = descriptiveStatistics19.toString();
        double double21 = descriptiveStatistics19.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getSumsqImpl();
        descriptiveStatistics22.setKurtosisImpl(univariateStatistic25);
        descriptiveStatistics19.setSkewnessImpl(univariateStatistic25);
        double double28 = descriptiveStatistics19.getStandardDeviation();
        descriptiveStatistics19.clear();
        double double30 = descriptiveStatistics19.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics19.getGeometricMeanImpl();
        descriptiveStatistics11.setGeometricMeanImpl(univariateStatistic31);
        descriptiveStatistics7.setSumsqImpl(univariateStatistic31);
        descriptiveStatistics1.setMaxImpl(univariateStatistic31);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str36 = descriptiveStatistics35.toString();
        double double37 = descriptiveStatistics35.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics40.getSumsqImpl();
        descriptiveStatistics38.setKurtosisImpl(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics38.getKurtosisImpl();
        double double44 = descriptiveStatistics35.apply(univariateStatistic43);
        double double45 = descriptiveStatistics35.getVariance();
        java.lang.Class<?> wildcardClass46 = descriptiveStatistics35.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics47 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass46);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass46);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumImpl();
        descriptiveStatistics1.setGeometricMeanImpl(univariateStatistic49);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str6, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str20, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str36, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(descriptiveStatistics47);
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 0);
        double double5 = resizableDoubleArray0.addElementRolling((double) 10L);
        int int6 = resizableDoubleArray0.getNumElements();
        double double8 = resizableDoubleArray0.addElementRolling((double) 101);
        resizableDoubleArray0.setExpansionMode(0);
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        double[] doubleArray14 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[101.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[101.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[101.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[101.0]");
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        double double5 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics10.getKurtosisImpl();
        long long13 = descriptiveStatistics10.getN();
        double[] doubleArray14 = descriptiveStatistics10.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics10.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics10.getMinImpl();
        double double17 = descriptiveStatistics8.apply(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics20.getSumsqImpl();
        descriptiveStatistics18.setKurtosisImpl(univariateStatistic21);
        descriptiveStatistics18.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics18.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics25.getKurtosisImpl();
        long long28 = descriptiveStatistics25.getN();
        descriptiveStatistics25.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics25.getSkewnessImpl();
        descriptiveStatistics18.setSumsqImpl(univariateStatistic31);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics18.getVarianceImpl();
        descriptiveStatistics8.setVarianceImpl(univariateStatistic33);
        double double35 = descriptiveStatistics8.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics8.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics8.getMeanImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic37);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics41 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics41.getSumsqImpl();
        descriptiveStatistics39.setKurtosisImpl(univariateStatistic42);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics39.getKurtosisImpl();
        double double45 = descriptiveStatistics39.getStandardDeviation();
        double double46 = descriptiveStatistics39.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics39.getPercentileImpl();
        double[] doubleArray53 = new double[] { 2, (byte) 1, 52.0d, 0L, 100.0d };
        double double54 = univariateStatistic47.evaluate(doubleArray53);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = univariateStatistic37.evaluate(doubleArray53, 4, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[2.0, 1.0, 52.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2.0d + "'", double54 == 2.0d);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 0);
        double double5 = resizableDoubleArray0.addElementRolling((double) 0.0f);
        resizableDoubleArray0.setElement((int) (byte) 10, (double) (short) -1);
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        int int11 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements(0);
        int int14 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        float float16 = resizableDoubleArray0.getExpansionFactor();
        float float17 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = null;
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic9);
        double double11 = descriptiveStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double15 = descriptiveStatistics14.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics16.getKurtosisImpl();
        long long19 = descriptiveStatistics16.getN();
        descriptiveStatistics16.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getSumsqImpl();
        descriptiveStatistics22.setKurtosisImpl(univariateStatistic25);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getSumsqImpl();
        descriptiveStatistics27.setKurtosisImpl(univariateStatistic30);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics27.getKurtosisImpl();
        descriptiveStatistics22.setMaxImpl(univariateStatistic32);
        double double34 = descriptiveStatistics22.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics22.getMinImpl();
        descriptiveStatistics16.setMinImpl(univariateStatistic35);
        descriptiveStatistics14.setMeanImpl(univariateStatistic35);
        descriptiveStatistics0.setVarianceImpl(univariateStatistic35);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double41 = descriptiveStatistics40.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics40.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double45 = descriptiveStatistics44.getStandardDeviation();
        long long46 = descriptiveStatistics44.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics44.getMinImpl();
        descriptiveStatistics40.setMaxImpl(univariateStatistic47);
        double double49 = descriptiveStatistics40.getMax();
        double double51 = descriptiveStatistics40.getPercentile(Double.NaN);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics52 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str53 = descriptiveStatistics52.toString();
        double double54 = descriptiveStatistics52.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics57 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics57.getSumsqImpl();
        descriptiveStatistics55.setKurtosisImpl(univariateStatistic58);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics55.getKurtosisImpl();
        double double61 = descriptiveStatistics52.apply(univariateStatistic60);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics62 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str63 = descriptiveStatistics62.toString();
        descriptiveStatistics62.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic65 = descriptiveStatistics62.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics62.getSumsqImpl();
        descriptiveStatistics52.setMeanImpl(univariateStatistic66);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic68 = descriptiveStatistics52.getSkewnessImpl();
        descriptiveStatistics40.setSumsqImpl(univariateStatistic68);
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic68);
        double double71 = descriptiveStatistics0.getStandardDeviation();
        double double72 = descriptiveStatistics0.getMean();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(descriptiveStatistics52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str53, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(descriptiveStatistics57);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(descriptiveStatistics62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str63, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic65);
        org.junit.Assert.assertNotNull(univariateStatistic66);
        org.junit.Assert.assertNotNull(univariateStatistic68);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(34, 10.0f);
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        descriptiveStatistics5.setKurtosisImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics5.getKurtosisImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic10);
        double double12 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str14 = descriptiveStatistics13.toString();
        double double15 = descriptiveStatistics13.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics16.getKurtosisImpl();
        double double22 = descriptiveStatistics13.apply(univariateStatistic21);
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic21);
        double double24 = descriptiveStatistics0.getMin();
        double double25 = descriptiveStatistics0.getMean();
        descriptiveStatistics0.addValue((double) (short) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics28.getKurtosisImpl();
        long long31 = descriptiveStatistics28.getN();
        double double32 = descriptiveStatistics28.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        descriptiveStatistics33.setKurtosisImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics40.getSumsqImpl();
        descriptiveStatistics38.setKurtosisImpl(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics38.getKurtosisImpl();
        descriptiveStatistics33.setMaxImpl(univariateStatistic43);
        descriptiveStatistics28.setSumImpl(univariateStatistic43);
        double double46 = descriptiveStatistics28.getSkewness();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics47 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double48 = descriptiveStatistics47.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics47.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str51 = descriptiveStatistics50.toString();
        descriptiveStatistics50.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics50.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics50.getSumsqImpl();
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray55 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int56 = resizableDoubleArray55.start();
        resizableDoubleArray55.addElement((double) 10);
        int int59 = resizableDoubleArray55.getExpansionMode();
        resizableDoubleArray55.addElement((double) (-1L));
        double[] doubleArray62 = resizableDoubleArray55.getElements();
        double double65 = univariateStatistic54.evaluate(doubleArray62, (int) (byte) 1, 1);
        double double66 = descriptiveStatistics47.apply(univariateStatistic54);
        double double67 = descriptiveStatistics47.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics68 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics68.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic70 = descriptiveStatistics68.getKurtosisImpl();
        long long71 = descriptiveStatistics68.getN();
        descriptiveStatistics68.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics68.getVarianceImpl();
        int int75 = descriptiveStatistics68.getWindowSize();
        double double76 = descriptiveStatistics68.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic77 = descriptiveStatistics68.getMaxImpl();
        double double78 = descriptiveStatistics47.apply(univariateStatistic77);
        descriptiveStatistics28.setMeanImpl(univariateStatistic77);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic80 = descriptiveStatistics28.getVarianceImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic80);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic82 = descriptiveStatistics0.getPercentileImpl();
        double double83 = descriptiveStatistics0.getVariance();
        double double84 = descriptiveStatistics0.getSum();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str14, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(descriptiveStatistics47);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str51, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(descriptiveStatistics68);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertNotNull(univariateStatistic70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic77);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(univariateStatistic80);
        org.junit.Assert.assertNotNull(univariateStatistic82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) 100L);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.addElement(32.5d);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        descriptiveStatistics5.setKurtosisImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics5.getKurtosisImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic10);
        double double12 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str14 = descriptiveStatistics13.toString();
        double double15 = descriptiveStatistics13.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics16.getKurtosisImpl();
        double double22 = descriptiveStatistics13.apply(univariateStatistic21);
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic21);
        double double24 = descriptiveStatistics0.getMin();
        double double25 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        descriptiveStatistics26.setKurtosisImpl(univariateStatistic29);
        descriptiveStatistics26.clear();
        double double32 = descriptiveStatistics26.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics26.getVarianceImpl();
        double double34 = descriptiveStatistics26.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics26.getVarianceImpl();
        long long36 = descriptiveStatistics26.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics37.getKurtosisImpl();
        long long40 = descriptiveStatistics37.getN();
        descriptiveStatistics37.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics43 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics43.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics45 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics45.getSumsqImpl();
        descriptiveStatistics43.setKurtosisImpl(univariateStatistic46);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        descriptiveStatistics48.setKurtosisImpl(univariateStatistic51);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics48.getKurtosisImpl();
        descriptiveStatistics43.setMaxImpl(univariateStatistic53);
        double double55 = descriptiveStatistics43.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics43.getMinImpl();
        descriptiveStatistics37.setMinImpl(univariateStatistic56);
        double double58 = descriptiveStatistics37.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics59 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics59.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics61 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics61.getSumsqImpl();
        descriptiveStatistics59.setKurtosisImpl(univariateStatistic62);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics64 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic65 = descriptiveStatistics64.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics66 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic67 = descriptiveStatistics66.getSumsqImpl();
        descriptiveStatistics64.setKurtosisImpl(univariateStatistic67);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics64.getKurtosisImpl();
        descriptiveStatistics59.setMaxImpl(univariateStatistic69);
        double double71 = descriptiveStatistics59.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic72 = descriptiveStatistics59.getMinImpl();
        descriptiveStatistics59.setWindowSize((int) (short) 100);
        java.lang.String str75 = descriptiveStatistics59.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic76 = descriptiveStatistics59.getSumsqImpl();
        descriptiveStatistics37.setVarianceImpl(univariateStatistic76);
        descriptiveStatistics26.setMaxImpl(univariateStatistic76);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic79 = descriptiveStatistics26.getMinImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic79);
        double[] doubleArray81 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic82 = descriptiveStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str14, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics43);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(descriptiveStatistics45);
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics59);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertNotNull(descriptiveStatistics61);
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertNotNull(descriptiveStatistics64);
        org.junit.Assert.assertNotNull(univariateStatistic65);
        org.junit.Assert.assertNotNull(descriptiveStatistics66);
        org.junit.Assert.assertNotNull(univariateStatistic67);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(univariateStatistic72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str75, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic76);
        org.junit.Assert.assertNotNull(univariateStatistic79);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic82);
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getSumsqImpl();
        double double8 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str10 = descriptiveStatistics9.toString();
        double double11 = descriptiveStatistics9.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics12.getKurtosisImpl();
        double double18 = descriptiveStatistics9.apply(univariateStatistic17);
        double double19 = descriptiveStatistics9.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics9.getSumImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic20);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str23 = descriptiveStatistics22.toString();
        double double24 = descriptiveStatistics22.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        descriptiveStatistics25.setKurtosisImpl(univariateStatistic28);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics25.getKurtosisImpl();
        double double31 = descriptiveStatistics22.apply(univariateStatistic30);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic30);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics34.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics36 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics36.getSumsqImpl();
        descriptiveStatistics34.setKurtosisImpl(univariateStatistic37);
        descriptiveStatistics34.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics34.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics41 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics41.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics41.getKurtosisImpl();
        long long44 = descriptiveStatistics41.getN();
        descriptiveStatistics41.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics41.getSkewnessImpl();
        descriptiveStatistics34.setSumsqImpl(univariateStatistic47);
        double double49 = descriptiveStatistics34.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics50.getKurtosisImpl();
        long long53 = descriptiveStatistics50.getN();
        descriptiveStatistics50.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics50.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics57 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics57.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics59 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics59.getSumsqImpl();
        descriptiveStatistics57.setKurtosisImpl(univariateStatistic60);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics57.getKurtosisImpl();
        double[] doubleArray66 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double67 = univariateStatistic62.evaluate(doubleArray66);
        descriptiveStatistics50.setSkewnessImpl(univariateStatistic62);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics50.getSkewnessImpl();
        descriptiveStatistics34.setGeometricMeanImpl(univariateStatistic69);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic71 = descriptiveStatistics34.getSumImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics72 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic73 = descriptiveStatistics72.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics74 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic75 = descriptiveStatistics74.getSumsqImpl();
        descriptiveStatistics72.setKurtosisImpl(univariateStatistic75);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic77 = descriptiveStatistics72.getKurtosisImpl();
        double double78 = descriptiveStatistics72.getStandardDeviation();
        double double79 = descriptiveStatistics72.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic80 = descriptiveStatistics72.getPercentileImpl();
        descriptiveStatistics34.setGeometricMeanImpl(univariateStatistic80);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic80);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic83 = descriptiveStatistics0.getMaxImpl();
        descriptiveStatistics0.setWindowSize(102);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics87 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double88 = descriptiveStatistics87.getStandardDeviation();
        long long89 = descriptiveStatistics87.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic90 = descriptiveStatistics87.getKurtosisImpl();
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic90);
        descriptiveStatistics0.addValue((double) 93);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str10, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str23, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(descriptiveStatistics34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(descriptiveStatistics36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(descriptiveStatistics57);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(descriptiveStatistics59);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 2.0d + "'", double67 == 2.0d);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertNotNull(univariateStatistic71);
        org.junit.Assert.assertNotNull(descriptiveStatistics72);
        org.junit.Assert.assertNotNull(univariateStatistic73);
        org.junit.Assert.assertNotNull(descriptiveStatistics74);
        org.junit.Assert.assertNotNull(univariateStatistic75);
        org.junit.Assert.assertNotNull(univariateStatistic77);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(univariateStatistic80);
        org.junit.Assert.assertNotNull(univariateStatistic83);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic90);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, 10.0f, (float) (short) 10, 0);
        double double6 = resizableDoubleArray4.addElementRolling((double) 91.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        descriptiveStatistics0.clear();
        double double11 = descriptiveStatistics0.getSum();
        double double12 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str14 = descriptiveStatistics13.toString();
        double double15 = descriptiveStatistics13.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        descriptiveStatistics13.setSkewnessImpl(univariateStatistic19);
        double double22 = descriptiveStatistics13.getStandardDeviation();
        descriptiveStatistics13.clear();
        descriptiveStatistics13.setWindowSize((int) (short) -1);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics26.getKurtosisImpl();
        long long29 = descriptiveStatistics26.getN();
        descriptiveStatistics26.addValue((double) 0);
        int int32 = descriptiveStatistics26.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics26.getGeometricMeanImpl();
        descriptiveStatistics13.setVarianceImpl(univariateStatistic33);
        descriptiveStatistics0.setSumImpl(univariateStatistic33);
        double double36 = descriptiveStatistics0.getMin();
        double double37 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 10);
        double double40 = descriptiveStatistics39.getStandardDeviation();
        double double41 = descriptiveStatistics39.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics39.getMinImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic42);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics0.getSumImpl();
        double double46 = descriptiveStatistics0.getStandardDeviation();
        double double47 = descriptiveStatistics0.getSum();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str14, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getPercentileImpl();
        double double7 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(univariateStatistic8);
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 2);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.addElement((double) 103);
        float float6 = resizableDoubleArray2.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue((double) 0);
        int int6 = descriptiveStatistics0.getWindowSize();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getSumsqImpl();
        descriptiveStatistics7.setKurtosisImpl(univariateStatistic10);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics12.getKurtosisImpl();
        descriptiveStatistics7.setMaxImpl(univariateStatistic17);
        double double19 = descriptiveStatistics7.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics7.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics7.getVarianceImpl();
        descriptiveStatistics0.setMeanImpl(univariateStatistic21);
        java.lang.Class<?> wildcardClass23 = descriptiveStatistics0.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass23);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass23);
        double double27 = descriptiveStatistics25.getPercentile((double) (byte) 100);
        double double28 = descriptiveStatistics25.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics25.getSumImpl();
        double double30 = descriptiveStatistics25.getSum();
        double double31 = descriptiveStatistics25.getMax();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double12 = descriptiveStatistics11.getStandardDeviation();
        long long13 = descriptiveStatistics11.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics11.getMinImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic14);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        descriptiveStatistics17.setKurtosisImpl(univariateStatistic20);
        descriptiveStatistics17.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics23.getKurtosisImpl();
        long long26 = descriptiveStatistics23.getN();
        double double27 = descriptiveStatistics23.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        descriptiveStatistics28.setKurtosisImpl(univariateStatistic31);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        descriptiveStatistics33.setKurtosisImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics33.getKurtosisImpl();
        descriptiveStatistics28.setMaxImpl(univariateStatistic38);
        descriptiveStatistics23.setSumImpl(univariateStatistic38);
        descriptiveStatistics17.setSumsqImpl(univariateStatistic38);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics42 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str43 = descriptiveStatistics42.toString();
        descriptiveStatistics42.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics42.getGeometricMeanImpl();
        double double46 = descriptiveStatistics42.getMax();
        double double47 = descriptiveStatistics42.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics42.getVarianceImpl();
        descriptiveStatistics17.setMeanImpl(univariateStatistic48);
        descriptiveStatistics0.setSumImpl(univariateStatistic48);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics0.getKurtosisImpl();
        double double53 = descriptiveStatistics0.getPercentile((double) '#');
        double double54 = descriptiveStatistics0.getSkewness();
        double[] doubleArray55 = descriptiveStatistics0.getValues();
        double double56 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics0.getSkewnessImpl();
        descriptiveStatistics0.addValue(51.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(descriptiveStatistics42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str43, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(univariateStatistic57);
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        descriptiveStatistics6.setKurtosisImpl(univariateStatistic9);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        descriptiveStatistics11.setKurtosisImpl(univariateStatistic14);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics11.getKurtosisImpl();
        descriptiveStatistics6.setMaxImpl(univariateStatistic16);
        double double18 = descriptiveStatistics6.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics6.getMinImpl();
        descriptiveStatistics0.setMinImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str23 = descriptiveStatistics22.toString();
        descriptiveStatistics22.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics22.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics27.getKurtosisImpl();
        long long30 = descriptiveStatistics27.getN();
        double double31 = descriptiveStatistics27.getMax();
        double double32 = descriptiveStatistics27.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double34 = descriptiveStatistics33.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics33.getMinImpl();
        descriptiveStatistics27.setSumImpl(univariateStatistic35);
        descriptiveStatistics22.setSumImpl(univariateStatistic35);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics40.getSumsqImpl();
        descriptiveStatistics38.setKurtosisImpl(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics43 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics43.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics45 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics45.getSumsqImpl();
        descriptiveStatistics43.setKurtosisImpl(univariateStatistic46);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics43.getKurtosisImpl();
        descriptiveStatistics38.setMaxImpl(univariateStatistic48);
        double double50 = descriptiveStatistics22.apply(univariateStatistic48);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics52 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double53 = descriptiveStatistics52.getStandardDeviation();
        double double54 = descriptiveStatistics52.getVariance();
        double double55 = descriptiveStatistics52.getSum();
        long long56 = descriptiveStatistics52.getN();
        int int57 = descriptiveStatistics52.getWindowSize();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics58 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic59 = descriptiveStatistics58.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics60 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics60.getSumsqImpl();
        descriptiveStatistics58.setKurtosisImpl(univariateStatistic61);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics63 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics63.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics65 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics65.getSumsqImpl();
        descriptiveStatistics63.setKurtosisImpl(univariateStatistic66);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic68 = descriptiveStatistics63.getKurtosisImpl();
        descriptiveStatistics58.setMaxImpl(univariateStatistic68);
        double double70 = descriptiveStatistics58.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics71 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str72 = descriptiveStatistics71.toString();
        double double73 = descriptiveStatistics71.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics74 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic75 = descriptiveStatistics74.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics76 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic77 = descriptiveStatistics76.getSumsqImpl();
        descriptiveStatistics74.setKurtosisImpl(univariateStatistic77);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic79 = descriptiveStatistics74.getKurtosisImpl();
        double double80 = descriptiveStatistics71.apply(univariateStatistic79);
        descriptiveStatistics58.setGeometricMeanImpl(univariateStatistic79);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic82 = descriptiveStatistics58.getPercentileImpl();
        descriptiveStatistics52.setSumImpl(univariateStatistic82);
        descriptiveStatistics22.setPercentileImpl(univariateStatistic82);
        double double85 = descriptiveStatistics22.getKurtosis();
        double double86 = descriptiveStatistics22.getStandardDeviation();
        java.lang.Class<?> wildcardClass87 = descriptiveStatistics22.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics88 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass87);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic89 = descriptiveStatistics88.getSkewnessImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic89);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str23, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(descriptiveStatistics43);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(descriptiveStatistics45);
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(descriptiveStatistics58);
        org.junit.Assert.assertNotNull(univariateStatistic59);
        org.junit.Assert.assertNotNull(descriptiveStatistics60);
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertNotNull(descriptiveStatistics63);
        org.junit.Assert.assertNotNull(univariateStatistic64);
        org.junit.Assert.assertNotNull(descriptiveStatistics65);
        org.junit.Assert.assertNotNull(univariateStatistic66);
        org.junit.Assert.assertNotNull(univariateStatistic68);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(descriptiveStatistics71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str72, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(descriptiveStatistics74);
        org.junit.Assert.assertNotNull(univariateStatistic75);
        org.junit.Assert.assertNotNull(descriptiveStatistics76);
        org.junit.Assert.assertNotNull(univariateStatistic77);
        org.junit.Assert.assertNotNull(univariateStatistic79);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(univariateStatistic82);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(descriptiveStatistics88);
        org.junit.Assert.assertNotNull(univariateStatistic89);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getKurtosisImpl();
        java.lang.String str6 = descriptiveStatistics0.toString();
        double double7 = descriptiveStatistics0.getMin();
        double double8 = descriptiveStatistics0.getSkewness();
        double double9 = descriptiveStatistics0.getSum();
        double double10 = descriptiveStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str6, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSumImpl();
        double double12 = descriptiveStatistics0.getMin();
        double[] doubleArray13 = descriptiveStatistics0.getSortedValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        descriptiveStatistics14.setKurtosisImpl(univariateStatistic17);
        descriptiveStatistics14.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics14.getPercentileImpl();
        double double21 = descriptiveStatistics14.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getKurtosisImpl();
        double[] doubleArray25 = descriptiveStatistics22.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics22.getVarianceImpl();
        double double27 = descriptiveStatistics14.apply(univariateStatistic26);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic26);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double31 = descriptiveStatistics30.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics30.getGeometricMeanImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic32);
        double double34 = descriptiveStatistics0.getStandardDeviation();
        double[] doubleArray35 = descriptiveStatistics0.getValues();
        double double36 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics0.getSumsqImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(univariateStatistic37);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double2 = descriptiveStatistics1.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics1.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double6 = descriptiveStatistics5.getStandardDeviation();
        long long7 = descriptiveStatistics5.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics5.getMinImpl();
        descriptiveStatistics1.setMaxImpl(univariateStatistic8);
        double double10 = descriptiveStatistics1.getMax();
        double double11 = descriptiveStatistics1.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics12.getKurtosisImpl();
        double[] doubleArray15 = descriptiveStatistics12.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics12.getVarianceImpl();
        double double17 = descriptiveStatistics12.getGeometricMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str19 = descriptiveStatistics18.toString();
        double double20 = descriptiveStatistics18.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        descriptiveStatistics21.setKurtosisImpl(univariateStatistic24);
        descriptiveStatistics18.setSkewnessImpl(univariateStatistic24);
        double double27 = descriptiveStatistics18.getStandardDeviation();
        descriptiveStatistics18.clear();
        double double29 = descriptiveStatistics18.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics32.getSumsqImpl();
        descriptiveStatistics30.setKurtosisImpl(univariateStatistic33);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        descriptiveStatistics35.setKurtosisImpl(univariateStatistic38);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics35.getKurtosisImpl();
        descriptiveStatistics30.setMaxImpl(univariateStatistic40);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics42 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics42.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics44.getSumsqImpl();
        descriptiveStatistics42.setKurtosisImpl(univariateStatistic45);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics42.getKurtosisImpl();
        descriptiveStatistics30.setGeometricMeanImpl(univariateStatistic47);
        descriptiveStatistics18.setSumImpl(univariateStatistic47);
        descriptiveStatistics12.setMinImpl(univariateStatistic47);
        double double51 = descriptiveStatistics12.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics52 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics52.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics54 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic55 = descriptiveStatistics54.getSumsqImpl();
        descriptiveStatistics52.setKurtosisImpl(univariateStatistic55);
        descriptiveStatistics52.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics52.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic59 = descriptiveStatistics52.getSumsqImpl();
        double double60 = descriptiveStatistics52.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics52.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics62 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic63 = descriptiveStatistics62.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics62.getKurtosisImpl();
        double[] doubleArray65 = descriptiveStatistics62.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics66 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic67 = descriptiveStatistics66.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics68 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics68.getSumsqImpl();
        descriptiveStatistics66.setKurtosisImpl(univariateStatistic69);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic71 = descriptiveStatistics66.getKurtosisImpl();
        double[] doubleArray75 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double76 = univariateStatistic71.evaluate(doubleArray75);
        descriptiveStatistics62.setMaxImpl(univariateStatistic71);
        descriptiveStatistics52.setMaxImpl(univariateStatistic71);
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic71);
        descriptiveStatistics1.setSkewnessImpl(univariateStatistic71);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic81 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics82 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic83 = descriptiveStatistics82.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics84 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic85 = descriptiveStatistics84.getSumsqImpl();
        descriptiveStatistics82.setKurtosisImpl(univariateStatistic85);
        double double87 = descriptiveStatistics82.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic88 = descriptiveStatistics82.getSumsqImpl();
        descriptiveStatistics1.setMinImpl(univariateStatistic88);
        double double90 = descriptiveStatistics1.getStandardDeviation();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str19, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertNotNull(descriptiveStatistics44);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(descriptiveStatistics52);
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertNotNull(descriptiveStatistics54);
        org.junit.Assert.assertNotNull(univariateStatistic55);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(univariateStatistic59);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertNotNull(descriptiveStatistics62);
        org.junit.Assert.assertNotNull(univariateStatistic63);
        org.junit.Assert.assertNotNull(univariateStatistic64);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics66);
        org.junit.Assert.assertNotNull(univariateStatistic67);
        org.junit.Assert.assertNotNull(descriptiveStatistics68);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertNotNull(univariateStatistic71);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 2.0d + "'", double76 == 2.0d);
        org.junit.Assert.assertNotNull(univariateStatistic81);
        org.junit.Assert.assertNotNull(descriptiveStatistics82);
        org.junit.Assert.assertNotNull(univariateStatistic83);
        org.junit.Assert.assertNotNull(descriptiveStatistics84);
        org.junit.Assert.assertNotNull(univariateStatistic85);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertNotNull(univariateStatistic88);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 10);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        double double3 = descriptiveStatistics1.getKurtosis();
        double double4 = descriptiveStatistics1.getMax();
        double double5 = descriptiveStatistics1.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics1.getSkewnessImpl();
        descriptiveStatistics1.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = descriptiveStatistics1.getElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic6);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 1);
        double double2 = descriptiveStatistics1.getMax();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getVarianceImpl();
        double double5 = descriptiveStatistics1.getMean();
        double double6 = descriptiveStatistics1.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics0.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics5.getKurtosisImpl();
        long long8 = descriptiveStatistics5.getN();
        double double9 = descriptiveStatistics5.getMax();
        double double10 = descriptiveStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double12 = descriptiveStatistics11.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics11.getMinImpl();
        descriptiveStatistics5.setSumImpl(univariateStatistic13);
        descriptiveStatistics0.setSumImpl(univariateStatistic13);
        double double16 = descriptiveStatistics0.getVariance();
        double double17 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics18.getKurtosisImpl();
        long long21 = descriptiveStatistics18.getN();
        double[] doubleArray22 = descriptiveStatistics18.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics18.getSumImpl();
        double double24 = descriptiveStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics18.getSumImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic25);
        double[] doubleArray27 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics0.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics0.getGeometricMeanImpl();
        double double30 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        descriptiveStatistics0.setWindowSize((int) (byte) -1);
        long long3 = descriptiveStatistics0.getN();
        double double4 = descriptiveStatistics0.getMean();
        double double5 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 1);
        double double8 = descriptiveStatistics7.getMax();
        long long9 = descriptiveStatistics7.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics7.getVarianceImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic10);
        double double12 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        descriptiveStatistics14.setKurtosisImpl(univariateStatistic17);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics21.getSumsqImpl();
        descriptiveStatistics19.setKurtosisImpl(univariateStatistic22);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics19.getKurtosisImpl();
        descriptiveStatistics14.setMaxImpl(univariateStatistic24);
        double double26 = descriptiveStatistics14.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics14.getMinImpl();
        double double28 = descriptiveStatistics14.getMin();
        double double29 = descriptiveStatistics14.getMax();
        double double30 = descriptiveStatistics14.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        descriptiveStatistics31.setWindowSize((int) (byte) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics31.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics31.getMaxImpl();
        descriptiveStatistics14.setSkewnessImpl(univariateStatistic35);
        descriptiveStatistics0.setMeanImpl(univariateStatistic35);
        double double38 = descriptiveStatistics0.getKurtosis();
        double double39 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(descriptiveStatistics31);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics(11);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str4 = descriptiveStatistics3.toString();
        double double5 = descriptiveStatistics3.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        descriptiveStatistics6.setKurtosisImpl(univariateStatistic9);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics6.getKurtosisImpl();
        double double12 = descriptiveStatistics3.apply(univariateStatistic11);
        double double13 = descriptiveStatistics3.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics3.getSumImpl();
        double double15 = descriptiveStatistics3.getMin();
        double[] doubleArray16 = descriptiveStatistics3.getSortedValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        descriptiveStatistics17.setKurtosisImpl(univariateStatistic20);
        descriptiveStatistics17.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics17.getPercentileImpl();
        double double24 = descriptiveStatistics17.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics25.getKurtosisImpl();
        double[] doubleArray28 = descriptiveStatistics25.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics25.getVarianceImpl();
        double double30 = descriptiveStatistics17.apply(univariateStatistic29);
        descriptiveStatistics3.setSumsqImpl(univariateStatistic29);
        long long32 = descriptiveStatistics3.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double34 = descriptiveStatistics33.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics33.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics33.getKurtosisImpl();
        descriptiveStatistics3.setMeanImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics38.getKurtosisImpl();
        long long41 = descriptiveStatistics38.getN();
        double[] doubleArray42 = descriptiveStatistics38.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics38.getSumImpl();
        double double44 = descriptiveStatistics38.getVariance();
        double double45 = descriptiveStatistics38.getMax();
        double double46 = descriptiveStatistics38.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics38.getSkewnessImpl();
        descriptiveStatistics3.setMaxImpl(univariateStatistic47);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics49 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic50 = descriptiveStatistics49.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics49.getKurtosisImpl();
        double[] doubleArray52 = descriptiveStatistics49.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics49.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = null;
        descriptiveStatistics49.setMaxImpl(univariateStatistic54);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics49.getSumsqImpl();
        double double57 = descriptiveStatistics3.apply(univariateStatistic56);
        descriptiveStatistics1.setGeometricMeanImpl(univariateStatistic56);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic59 = descriptiveStatistics1.getVarianceImpl();
        java.lang.String str60 = descriptiveStatistics1.toString();
        double double61 = descriptiveStatistics1.getSkewness();
        long long62 = descriptiveStatistics1.getN();
        double double63 = descriptiveStatistics1.getMean();
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str4, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(descriptiveStatistics49);
        org.junit.Assert.assertNotNull(univariateStatistic50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(univariateStatistic59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str60, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        double[] doubleArray3 = descriptiveStatistics0.getValues();
        long long4 = descriptiveStatistics0.getN();
        double double5 = descriptiveStatistics0.getMin();
        long long6 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getSkewnessImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic7);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        double[] doubleArray3 = descriptiveStatistics0.getValues();
        long long4 = descriptiveStatistics0.getN();
        double[] doubleArray5 = descriptiveStatistics0.getSortedValues();
        double double6 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = null;
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic7);
        double double9 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics10.getKurtosisImpl();
        long long13 = descriptiveStatistics10.getN();
        descriptiveStatistics10.addValue((double) 0);
        int int16 = descriptiveStatistics10.getWindowSize();
        double double17 = descriptiveStatistics10.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics10.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics20.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        descriptiveStatistics20.setKurtosisImpl(univariateStatistic23);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics20.getKurtosisImpl();
        double[] doubleArray29 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double30 = univariateStatistic25.evaluate(doubleArray29);
        descriptiveStatistics19.setMaxImpl(univariateStatistic25);
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray32 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int33 = resizableDoubleArray32.getExpansionMode();
        resizableDoubleArray32.addElement(0.0d);
        int int36 = resizableDoubleArray32.getExpansionMode();
        float float37 = resizableDoubleArray32.getContractionCriteria();
        resizableDoubleArray32.setNumElements(10);
        double[] doubleArray40 = resizableDoubleArray32.getElements();
        double double41 = univariateStatistic25.evaluate(doubleArray40);
        double double42 = univariateStatistic18.evaluate(doubleArray40);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic18);
        long long44 = descriptiveStatistics0.getN();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.0d + "'", double30 == 2.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 2.5f + "'", float37 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = null;
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic9);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getPercentileImpl();
        double double12 = descriptiveStatistics0.getStandardDeviation();
        int int13 = descriptiveStatistics0.getWindowSize();
        descriptiveStatistics0.setWindowSize(102);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        descriptiveStatistics16.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics16.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics16.getSumsqImpl();
        double double24 = descriptiveStatistics16.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str26 = descriptiveStatistics25.toString();
        double double27 = descriptiveStatistics25.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        descriptiveStatistics28.setKurtosisImpl(univariateStatistic31);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics28.getKurtosisImpl();
        double double34 = descriptiveStatistics25.apply(univariateStatistic33);
        double double35 = descriptiveStatistics25.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics25.getSumImpl();
        descriptiveStatistics16.setGeometricMeanImpl(univariateStatistic36);
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray38 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int39 = resizableDoubleArray38.start();
        resizableDoubleArray38.addElement((double) 10);
        double[] doubleArray42 = resizableDoubleArray38.getElements();
        double double43 = univariateStatistic36.evaluate(doubleArray42);
        double double44 = descriptiveStatistics0.apply(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str26, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        double[] doubleArray3 = descriptiveStatistics0.getValues();
        double double4 = descriptiveStatistics0.getVariance();
        double double5 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str7 = descriptiveStatistics6.toString();
        double double8 = descriptiveStatistics6.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        descriptiveStatistics9.setKurtosisImpl(univariateStatistic12);
        descriptiveStatistics6.setSkewnessImpl(univariateStatistic12);
        double double15 = descriptiveStatistics6.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics16.getKurtosisImpl();
        long long19 = descriptiveStatistics16.getN();
        double[] doubleArray20 = descriptiveStatistics16.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics16.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics16.getMinImpl();
        descriptiveStatistics6.setMinImpl(univariateStatistic22);
        descriptiveStatistics0.setMeanImpl(univariateStatistic22);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics0.getSumsqImpl();
        double double26 = descriptiveStatistics0.getSum();
        double double27 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        descriptiveStatistics28.setKurtosisImpl(univariateStatistic31);
        descriptiveStatistics28.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics28.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics28.getSumsqImpl();
        double double36 = descriptiveStatistics28.getMax();
        descriptiveStatistics28.setWindowSize((int) (short) 10);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double[] doubleArray41 = descriptiveStatistics40.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics40.getSumsqImpl();
        descriptiveStatistics28.setMeanImpl(univariateStatistic42);
        double double44 = descriptiveStatistics0.apply(univariateStatistic42);
        double double45 = descriptiveStatistics0.getKurtosis();
        double double46 = descriptiveStatistics0.getStandardDeviation();
        double[] doubleArray47 = descriptiveStatistics0.getSortedValues();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str7, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) (byte) 0);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray5 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 102);
        double double9 = resizableDoubleArray0.addElementRolling(31.0d);
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 102.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[102.0, 31.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(34, 2.5f, (float) '#');
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 10);
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getNumElements();
        float float8 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double2 = descriptiveStatistics1.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics1.getGeometricMeanImpl();
        double double4 = descriptiveStatistics1.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics1.getMinImpl();
        double double6 = descriptiveStatistics1.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics1.getSumsqImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(univariateStatistic7);
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(14, (float) 14);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(91, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.util.ResizableDoubleArray cannot be cast to org.apache.commons.math.stat.descriptive.DescriptiveStatistics");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        descriptiveStatistics0.clear();
        descriptiveStatistics0.addValue((double) (short) 10);
        double[] doubleArray13 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics14.getKurtosisImpl();
        long long17 = descriptiveStatistics14.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics18.getKurtosisImpl();
        double double21 = descriptiveStatistics18.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double23 = descriptiveStatistics22.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getSumImpl();
        descriptiveStatistics18.setMinImpl(univariateStatistic24);
        descriptiveStatistics14.setGeometricMeanImpl(univariateStatistic24);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic24);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        descriptiveStatistics29.setWindowSize((int) ' ');
        double double32 = descriptiveStatistics29.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics29.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics29.getMaxImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics29.getSumImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic35);
        double double37 = descriptiveStatistics0.getSum();
        double[] doubleArray38 = descriptiveStatistics0.getSortedValues();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0]");
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        double double5 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double8 = descriptiveStatistics7.getStandardDeviation();
        long long9 = descriptiveStatistics7.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics7.getKurtosisImpl();
        descriptiveStatistics0.setSumImpl(univariateStatistic10);
        double double12 = descriptiveStatistics0.getMin();
        descriptiveStatistics0.setWindowSize(103);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(univariateStatistic15);
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str4 = descriptiveStatistics3.toString();
        double double5 = descriptiveStatistics3.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        descriptiveStatistics6.setKurtosisImpl(univariateStatistic9);
        descriptiveStatistics3.setSkewnessImpl(univariateStatistic9);
        double double12 = descriptiveStatistics3.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double15 = descriptiveStatistics14.getStandardDeviation();
        long long16 = descriptiveStatistics14.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics14.getMinImpl();
        descriptiveStatistics3.setVarianceImpl(univariateStatistic17);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics3.getMeanImpl();
        descriptiveStatistics0.setMeanImpl(univariateStatistic19);
        int int21 = descriptiveStatistics0.getWindowSize();
        double double22 = descriptiveStatistics0.getGeometricMean();
        double double23 = descriptiveStatistics0.getSumsq();
        long long24 = descriptiveStatistics0.getN();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str4, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray5 = resizableDoubleArray0.getElements();
        float float6 = resizableDoubleArray0.getExpansionFactor();
        double double8 = resizableDoubleArray0.addElementRolling(11224.999999999996d);
        resizableDoubleArray0.setContractionCriteria(54.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(90, 11.5f, 52.0f);
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, 97.0f, (float) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int7 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.discardFrontElements((int) (byte) 10);
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements(0);
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 99);
        double double17 = resizableDoubleArray0.addElementRolling(16.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 90 + "'", int13 == 90);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) (short) 100);
        resizableDoubleArray2.addElement(Double.NaN);
        resizableDoubleArray2.clear();
        int int6 = resizableDoubleArray2.getNumElements();
        double double8 = resizableDoubleArray2.addElementRolling(153.0d);
        resizableDoubleArray2.setExpansionFactor((float) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getNumElements();
        int int5 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) (short) 0, 32.0d);
        int int10 = resizableDoubleArray0.getNumElements();
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(Double.NaN);
        float float14 = resizableDoubleArray0.getContractionCriteria();
        int int15 = resizableDoubleArray0.start();
        double double17 = resizableDoubleArray0.getElement((int) (byte) 0);
        resizableDoubleArray0.setElement((int) (byte) 100, 2705.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', 32.5f, (float) (short) 100);
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics6.getKurtosisImpl();
        long long9 = descriptiveStatistics6.getN();
        double double10 = descriptiveStatistics6.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        descriptiveStatistics11.setKurtosisImpl(univariateStatistic14);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics16.getKurtosisImpl();
        descriptiveStatistics11.setMaxImpl(univariateStatistic21);
        descriptiveStatistics6.setSumImpl(univariateStatistic21);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic21);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str26 = descriptiveStatistics25.toString();
        descriptiveStatistics25.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics25.getGeometricMeanImpl();
        double double29 = descriptiveStatistics25.getMax();
        double double30 = descriptiveStatistics25.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics25.getVarianceImpl();
        descriptiveStatistics0.setMeanImpl(univariateStatistic31);
        double double33 = descriptiveStatistics0.getVariance();
        double double34 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics36 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str37 = descriptiveStatistics36.toString();
        double double38 = descriptiveStatistics36.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics41 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics41.getSumsqImpl();
        descriptiveStatistics39.setKurtosisImpl(univariateStatistic42);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics39.getKurtosisImpl();
        double double45 = descriptiveStatistics36.apply(univariateStatistic44);
        double double46 = descriptiveStatistics36.getSumsq();
        java.lang.String str47 = descriptiveStatistics36.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        descriptiveStatistics48.setKurtosisImpl(univariateStatistic51);
        descriptiveStatistics36.setMaxImpl(univariateStatistic51);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics36.getVarianceImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic54);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics56 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics56.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics56.getKurtosisImpl();
        long long59 = descriptiveStatistics56.getN();
        double[] doubleArray60 = descriptiveStatistics56.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics56.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics56.getMinImpl();
        long long63 = descriptiveStatistics56.getN();
        double double64 = descriptiveStatistics56.getStandardDeviation();
        double double65 = descriptiveStatistics56.getSum();
        double double66 = descriptiveStatistics56.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic67 = descriptiveStatistics56.getVarianceImpl();
        long long68 = descriptiveStatistics56.getN();
        java.lang.String str69 = descriptiveStatistics56.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic70 = descriptiveStatistics56.getMinImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic70);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str26, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(descriptiveStatistics36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str37, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str47, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics56);
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(univariateStatistic67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str69, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic70);
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 10);
        int int4 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.setExpansionMode((int) (short) 0);
        int int12 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.clear();
        int int15 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        int int3 = resizableDoubleArray1.getNumElements();
        int int4 = resizableDoubleArray1.getNumElements();
        resizableDoubleArray1.clear();
        int int6 = resizableDoubleArray1.start();
        resizableDoubleArray1.clear();
        int int8 = resizableDoubleArray1.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionMode(37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.discardFrontElements((int) (byte) 100);
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        float float10 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setContractionCriteria((float) 100L);
        float float13 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setNumElements(90);
        resizableDoubleArray0.discardFrontElements((int) (short) 0);
        double[] doubleArray19 = resizableDoubleArray0.getElements();
        double double21 = resizableDoubleArray0.addElementRolling((double) 93);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement(0, (double) 0.0f);
        resizableDoubleArray0.clear();
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.addElement((double) 3);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getExpansionMode();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        int int7 = resizableDoubleArray0.getNumElements();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setElement((int) 'a', (double) ' ');
        double[] doubleArray12 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(97);
        int int15 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 32.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double1 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getSkewnessImpl();
        descriptiveStatistics0.setWindowSize((int) (byte) 10);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics5.getKurtosisImpl();
        long long8 = descriptiveStatistics5.getN();
        descriptiveStatistics5.addValue((double) 0);
        int int11 = descriptiveStatistics5.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics5.getMinImpl();
        double double13 = descriptiveStatistics0.apply(univariateStatistic12);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics15.getKurtosisImpl();
        long long18 = descriptiveStatistics15.getN();
        double[] doubleArray19 = descriptiveStatistics15.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics15.getSumImpl();
        double double21 = descriptiveStatistics15.getStandardDeviation();
        double double22 = descriptiveStatistics15.getVariance();
        descriptiveStatistics15.addValue(100.0d);
        double double25 = descriptiveStatistics15.getSkewness();
        double double26 = descriptiveStatistics15.getSkewness();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getSumsqImpl();
        descriptiveStatistics27.setKurtosisImpl(univariateStatistic30);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics32.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics34.getSumsqImpl();
        descriptiveStatistics32.setKurtosisImpl(univariateStatistic35);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics32.getKurtosisImpl();
        descriptiveStatistics27.setMaxImpl(univariateStatistic37);
        double double39 = descriptiveStatistics27.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics27.getMinImpl();
        descriptiveStatistics27.setWindowSize((int) (short) 100);
        java.lang.String str43 = descriptiveStatistics27.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics27.getMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics45 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str46 = descriptiveStatistics45.toString();
        double double47 = descriptiveStatistics45.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        descriptiveStatistics48.setKurtosisImpl(univariateStatistic51);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics48.getKurtosisImpl();
        double double54 = descriptiveStatistics45.apply(univariateStatistic53);
        double double55 = descriptiveStatistics45.getVariance();
        double double56 = descriptiveStatistics45.getSum();
        double double57 = descriptiveStatistics45.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics45.getSumImpl();
        double double59 = descriptiveStatistics27.apply(univariateStatistic58);
        descriptiveStatistics15.setGeometricMeanImpl(univariateStatistic58);
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic58);
        double double62 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic63 = descriptiveStatistics0.getSumImpl();
        double double64 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic65 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics66 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str67 = descriptiveStatistics66.toString();
        double double68 = descriptiveStatistics66.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics69 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic70 = descriptiveStatistics69.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics71 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic72 = descriptiveStatistics71.getSumsqImpl();
        descriptiveStatistics69.setKurtosisImpl(univariateStatistic72);
        descriptiveStatistics66.setSkewnessImpl(univariateStatistic72);
        double double75 = descriptiveStatistics66.getStandardDeviation();
        descriptiveStatistics66.clear();
        descriptiveStatistics66.addValue((double) (short) 10);
        double double79 = descriptiveStatistics66.getMax();
        double double80 = descriptiveStatistics66.getMean();
        double double81 = descriptiveStatistics66.getStandardDeviation();
        java.lang.String str82 = descriptiveStatistics66.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic83 = descriptiveStatistics66.getMeanImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic83);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(descriptiveStatistics34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str43, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(descriptiveStatistics45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str46, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(univariateStatistic63);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(univariateStatistic65);
        org.junit.Assert.assertNotNull(descriptiveStatistics66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str67, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(descriptiveStatistics69);
        org.junit.Assert.assertNotNull(univariateStatistic70);
        org.junit.Assert.assertNotNull(descriptiveStatistics71);
        org.junit.Assert.assertNotNull(univariateStatistic72);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "DescriptiveStatistics:\nn: 1\nmin: 10.0\nmax: 10.0\nmean: 10.0\nstd dev: 0.0\nmedian: 10.0\nskewness: 100.0\nkurtosis: NaN\n" + "'", str82, "DescriptiveStatistics:\nn: 1\nmin: 10.0\nmax: 10.0\nmean: 10.0\nstd dev: 0.0\nmedian: 10.0\nskewness: 100.0\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic83);
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 0);
        double double5 = resizableDoubleArray0.addElementRolling((double) 0.0f);
        resizableDoubleArray0.setElement((int) (byte) 10, (double) (short) -1);
        resizableDoubleArray0.setElement((int) (byte) 1, 0.0d);
        double double13 = resizableDoubleArray0.getElement(10);
        float float14 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray15 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, -1.0]");
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        double double6 = descriptiveStatistics1.getVariance();
        descriptiveStatistics1.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        descriptiveStatistics9.setKurtosisImpl(univariateStatistic12);
        descriptiveStatistics1.setSkewnessImpl(univariateStatistic12);
        java.lang.Class<?> wildcardClass15 = descriptiveStatistics1.getClass();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance((java.lang.Class) wildcardClass15);
        double[] doubleArray17 = descriptiveStatistics16.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics16.getSkewnessImpl();
        double double19 = descriptiveStatistics16.getVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double2 = descriptiveStatistics1.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics1.getGeometricMeanImpl();
        double double4 = descriptiveStatistics1.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics5.getKurtosisImpl();
        long long8 = descriptiveStatistics5.getN();
        double[] doubleArray9 = descriptiveStatistics5.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics5.getSumImpl();
        descriptiveStatistics1.setSkewnessImpl(univariateStatistic10);
        descriptiveStatistics1.clear();
        double double13 = descriptiveStatistics1.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics14.getKurtosisImpl();
        long long17 = descriptiveStatistics14.getN();
        double[] doubleArray18 = descriptiveStatistics14.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics14.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics14.getMinImpl();
        double double21 = descriptiveStatistics14.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = null;
        descriptiveStatistics14.setSumImpl(univariateStatistic22);
        descriptiveStatistics14.setWindowSize((int) (byte) 1);
        java.lang.String str26 = descriptiveStatistics14.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str28 = descriptiveStatistics27.toString();
        double double29 = descriptiveStatistics27.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics32.getSumsqImpl();
        descriptiveStatistics30.setKurtosisImpl(univariateStatistic33);
        descriptiveStatistics27.setSkewnessImpl(univariateStatistic33);
        double double36 = descriptiveStatistics27.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics37.getKurtosisImpl();
        long long40 = descriptiveStatistics37.getN();
        double[] doubleArray41 = descriptiveStatistics37.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics37.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics37.getMinImpl();
        descriptiveStatistics27.setMinImpl(univariateStatistic43);
        descriptiveStatistics14.setSkewnessImpl(univariateStatistic43);
        double double46 = descriptiveStatistics1.apply(univariateStatistic43);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics1.getSkewnessImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str26, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str28, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(univariateStatistic47);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        double double6 = descriptiveStatistics0.getStandardDeviation();
        double double7 = descriptiveStatistics0.getVariance();
        descriptiveStatistics0.addValue(100.0d);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics0.getKurtosisImpl();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics0.getMaxImpl();
        double double13 = descriptiveStatistics0.getMin();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, 0.0f, (float) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics0.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics5.getKurtosisImpl();
        long long8 = descriptiveStatistics5.getN();
        double double9 = descriptiveStatistics5.getMax();
        double double10 = descriptiveStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double12 = descriptiveStatistics11.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics11.getMinImpl();
        descriptiveStatistics5.setSumImpl(univariateStatistic13);
        descriptiveStatistics0.setSumImpl(univariateStatistic13);
        double double16 = descriptiveStatistics0.getVariance();
        double double17 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics18.getKurtosisImpl();
        long long21 = descriptiveStatistics18.getN();
        double[] doubleArray22 = descriptiveStatistics18.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics18.getSumImpl();
        double double24 = descriptiveStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics18.getSumImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic25);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double29 = descriptiveStatistics28.getStandardDeviation();
        long long30 = descriptiveStatistics28.getN();
        double double31 = descriptiveStatistics28.getMin();
        double double32 = descriptiveStatistics28.getMax();
        double double33 = descriptiveStatistics28.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getKurtosisImpl();
        descriptiveStatistics28.setSkewnessImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics28.getGeometricMeanImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic38);
        double double40 = descriptiveStatistics0.getSum();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getPercentileImpl();
        double double8 = descriptiveStatistics0.getMean();
        int int9 = descriptiveStatistics0.getWindowSize();
        long long10 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getGeometricMeanImpl();
        double double12 = descriptiveStatistics0.getKurtosis();
        double[] doubleArray13 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str15 = descriptiveStatistics14.toString();
        double double16 = descriptiveStatistics14.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        descriptiveStatistics17.setKurtosisImpl(univariateStatistic20);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics17.getKurtosisImpl();
        double double23 = descriptiveStatistics14.apply(univariateStatistic22);
        double double24 = descriptiveStatistics14.getSumsq();
        double double25 = descriptiveStatistics14.getMean();
        double double26 = descriptiveStatistics14.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics14.getSumImpl();
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray29 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10);
        double[] doubleArray30 = resizableDoubleArray29.getValues();
        resizableDoubleArray29.setExpansionMode(0);
        double[] doubleArray33 = resizableDoubleArray29.getElements();
        double double34 = univariateStatistic27.evaluate(doubleArray33);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic27);
        double double36 = descriptiveStatistics0.getSum();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str15, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getKurtosisImpl();
        descriptiveStatistics1.setMeanImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics1.getGeometricMeanImpl();
        double double11 = descriptiveStatistics1.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics1.getSumImpl();
        double double13 = descriptiveStatistics1.getSumsq();
        double double14 = descriptiveStatistics1.getSumsq();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        double double17 = descriptiveStatistics15.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics15.getVarianceImpl();
        descriptiveStatistics1.setGeometricMeanImpl(univariateStatistic18);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double21 = descriptiveStatistics20.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getKurtosisImpl();
        long long25 = descriptiveStatistics22.getN();
        descriptiveStatistics22.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        descriptiveStatistics28.setKurtosisImpl(univariateStatistic31);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        descriptiveStatistics33.setKurtosisImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics33.getKurtosisImpl();
        descriptiveStatistics28.setMaxImpl(univariateStatistic38);
        double double40 = descriptiveStatistics28.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics28.getMinImpl();
        descriptiveStatistics22.setMinImpl(univariateStatistic41);
        descriptiveStatistics20.setMeanImpl(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics20.getSumImpl();
        descriptiveStatistics1.setMinImpl(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(univariateStatistic44);
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSumImpl();
        double double12 = descriptiveStatistics0.getMin();
        double[] doubleArray13 = descriptiveStatistics0.getSortedValues();
        double double14 = descriptiveStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics0.getSkewnessImpl();
        double double16 = descriptiveStatistics0.getSum();
        double double17 = descriptiveStatistics0.getKurtosis();
        double double18 = descriptiveStatistics0.getSum();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double double4 = descriptiveStatistics0.getMax();
        double double5 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double7 = descriptiveStatistics6.getMin();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics6.getMinImpl();
        descriptiveStatistics0.setSumImpl(univariateStatistic8);
        descriptiveStatistics0.addValue((double) 0);
        double double12 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = null;
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic13);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics0.getMinImpl();
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray17 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4');
        int int18 = resizableDoubleArray17.getNumElements();
        int int19 = resizableDoubleArray17.getNumElements();
        resizableDoubleArray17.setElement(33, 11224.999999999996d);
        double[] doubleArray23 = resizableDoubleArray17.getElements();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = univariateStatistic15.evaluate(doubleArray23, 90, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 11224.999999999996]");
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) (byte) 0);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        int int6 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement(1.0d);
        int int10 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) 1);
        float float13 = resizableDoubleArray0.getExpansionFactor();
        int int14 = resizableDoubleArray0.getExpansionMode();
        int int15 = resizableDoubleArray0.getExpansionMode();
        int int16 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10);
        int int2 = resizableDoubleArray1.getExpansionMode();
        int int3 = resizableDoubleArray1.start();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling(10.0d);
        double double8 = resizableDoubleArray1.addElementRolling((double) 2.0f);
        resizableDoubleArray1.contract();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (short) 10, 10.0f);
        resizableDoubleArray3.setElement((int) (byte) 100, 10.0d);
        int int7 = resizableDoubleArray3.start();
        resizableDoubleArray3.clear();
        double[] doubleArray9 = resizableDoubleArray3.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = resizableDoubleArray3.getElement(14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 14 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        descriptiveStatistics5.setKurtosisImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics5.getKurtosisImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic10);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics12.getKurtosisImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic17);
        double double19 = descriptiveStatistics0.getMin();
        double[] doubleArray20 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        descriptiveStatistics21.setWindowSize((int) (byte) -1);
        int int24 = descriptiveStatistics21.getWindowSize();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        descriptiveStatistics25.setKurtosisImpl(univariateStatistic28);
        descriptiveStatistics21.setGeometricMeanImpl(univariateStatistic28);
        double double31 = descriptiveStatistics0.apply(univariateStatistic28);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics0.getMaxImpl();
        double double33 = descriptiveStatistics0.getMean();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        double double5 = descriptiveStatistics0.getMean();
        descriptiveStatistics0.addValue((double) (byte) 10);
        long long8 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics9.getKurtosisImpl();
        long long12 = descriptiveStatistics9.getN();
        double[] doubleArray13 = descriptiveStatistics9.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics9.getSumImpl();
        descriptiveStatistics9.addValue((double) (byte) 1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = null;
        descriptiveStatistics9.setSkewnessImpl(univariateStatistic17);
        double[] doubleArray19 = descriptiveStatistics9.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics9.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics9.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics9.getSumImpl();
        double double23 = descriptiveStatistics0.apply(univariateStatistic22);
        double double24 = descriptiveStatistics0.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics26.getKurtosisImpl();
        long long29 = descriptiveStatistics26.getN();
        descriptiveStatistics26.addValue((double) 0);
        int int32 = descriptiveStatistics26.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics26.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics26.getSumImpl();
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray35 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int36 = resizableDoubleArray35.start();
        resizableDoubleArray35.addElement((double) 10);
        int int39 = resizableDoubleArray35.getExpansionMode();
        resizableDoubleArray35.clear();
        int int41 = resizableDoubleArray35.getNumElements();
        int int42 = resizableDoubleArray35.getExpansionMode();
        resizableDoubleArray35.addElement((double) 100.0f);
        double[] doubleArray45 = resizableDoubleArray35.getElements();
        double double46 = univariateStatistic34.evaluate(doubleArray45);
        descriptiveStatistics0.setMeanImpl(univariateStatistic34);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics10.getKurtosisImpl();
        long long13 = descriptiveStatistics10.getN();
        double[] doubleArray14 = descriptiveStatistics10.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics10.getSumImpl();
        double double16 = descriptiveStatistics10.getVariance();
        double double17 = descriptiveStatistics10.getMax();
        double double18 = descriptiveStatistics10.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics10.getSkewnessImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics0.getMinImpl();
        double double22 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double2 = descriptiveStatistics1.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics1.getGeometricMeanImpl();
        double double4 = descriptiveStatistics1.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics1.getMinImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        descriptiveStatistics6.setKurtosisImpl(univariateStatistic9);
        descriptiveStatistics6.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics6.getPercentileImpl();
        double double13 = descriptiveStatistics6.getStandardDeviation();
        descriptiveStatistics6.setWindowSize((int) (byte) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics6.getSkewnessImpl();
        descriptiveStatistics1.setSumsqImpl(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics1.getMaxImpl();
        double double19 = descriptiveStatistics1.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) (byte) 0);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) 'a');
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        int int9 = resizableDoubleArray0.getNumElements();
        int int10 = resizableDoubleArray0.getNumElements();
        int int11 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        int int13 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray14 = resizableDoubleArray0.getElements();
        double[] doubleArray15 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        double[] doubleArray2 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) 100);
        resizableDoubleArray0.setExpansionFactor(35.5f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        descriptiveStatistics0.setWindowSize((int) (byte) -1);
        long long3 = descriptiveStatistics0.getN();
        double double4 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        double double6 = descriptiveStatistics0.getMin();
        double double7 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics0.getMeanImpl();
        long long9 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic10);
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, 35.5f);
        int int3 = resizableDoubleArray2.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.discardFrontElements(90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        double double3 = descriptiveStatistics0.getMax();
        double double4 = descriptiveStatistics0.getGeometricMean();
        double double5 = descriptiveStatistics0.getMean();
        double[] doubleArray6 = descriptiveStatistics0.getSortedValues();
        double double7 = descriptiveStatistics0.getSkewness();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics7.getKurtosisImpl();
        long long10 = descriptiveStatistics7.getN();
        descriptiveStatistics7.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics7.getSkewnessImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic13);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics0.getVarianceImpl();
        java.lang.String str16 = descriptiveStatistics0.toString();
        double double17 = descriptiveStatistics0.getMin();
        double double18 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str16, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getSumsq();
        double double11 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics12.getKurtosisImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic17);
        long long19 = descriptiveStatistics0.getN();
        double double20 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics0.getSumImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(univariateStatistic21);
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        int int3 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) (short) 10, (double) 100L);
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        float float8 = resizableDoubleArray0.getContractionCriteria();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 0L);
        resizableDoubleArray0.clear();
        resizableDoubleArray0.clear();
        float float14 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        descriptiveStatistics0.setWindowSize((int) (byte) -1);
        long long3 = descriptiveStatistics0.getN();
        double double4 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str6 = descriptiveStatistics5.toString();
        double double7 = descriptiveStatistics5.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        descriptiveStatistics8.setKurtosisImpl(univariateStatistic11);
        descriptiveStatistics5.setSkewnessImpl(univariateStatistic11);
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic11);
        double double15 = descriptiveStatistics0.getGeometricMean();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics0.getSumImpl();
        descriptiveStatistics0.clear();
        double double20 = descriptiveStatistics0.getVariance();
        double[] doubleArray21 = descriptiveStatistics0.getValues();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str6, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(101, 2.5f, (float) 90, (int) (short) 1);
        int int5 = resizableDoubleArray4.getExpansionMode();
        double[] doubleArray6 = resizableDoubleArray4.getElements();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        double double6 = descriptiveStatistics1.getVariance();
        descriptiveStatistics1.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        descriptiveStatistics9.setKurtosisImpl(univariateStatistic12);
        descriptiveStatistics1.setSkewnessImpl(univariateStatistic12);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        descriptiveStatistics15.setKurtosisImpl(univariateStatistic18);
        descriptiveStatistics15.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics15.getSkewnessImpl();
        descriptiveStatistics1.setVarianceImpl(univariateStatistic21);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics1.getSkewnessImpl();
        double double24 = descriptiveStatistics1.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics1.getSumImpl();
        double double26 = descriptiveStatistics1.getSumsq();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getSumsqImpl();
        descriptiveStatistics27.setKurtosisImpl(univariateStatistic30);
        descriptiveStatistics27.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics33.getKurtosisImpl();
        long long36 = descriptiveStatistics33.getN();
        double double37 = descriptiveStatistics33.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics40.getSumsqImpl();
        descriptiveStatistics38.setKurtosisImpl(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics43 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics43.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics45 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics45.getSumsqImpl();
        descriptiveStatistics43.setKurtosisImpl(univariateStatistic46);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics43.getKurtosisImpl();
        descriptiveStatistics38.setMaxImpl(univariateStatistic48);
        descriptiveStatistics33.setSumImpl(univariateStatistic48);
        descriptiveStatistics27.setSumsqImpl(univariateStatistic48);
        double double52 = descriptiveStatistics27.getSumsq();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics53 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics53.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        descriptiveStatistics53.setKurtosisImpl(univariateStatistic56);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics58 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic59 = descriptiveStatistics58.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics60 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics60.getSumsqImpl();
        descriptiveStatistics58.setKurtosisImpl(univariateStatistic61);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic63 = descriptiveStatistics58.getKurtosisImpl();
        descriptiveStatistics53.setMaxImpl(univariateStatistic63);
        double double65 = descriptiveStatistics53.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics53.getMinImpl();
        descriptiveStatistics53.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics69 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic70 = descriptiveStatistics69.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics71 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic72 = descriptiveStatistics71.getSumsqImpl();
        descriptiveStatistics69.setKurtosisImpl(univariateStatistic72);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics69.getKurtosisImpl();
        double double75 = descriptiveStatistics69.getStandardDeviation();
        double double76 = descriptiveStatistics69.getSum();
        int int77 = descriptiveStatistics69.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic78 = descriptiveStatistics69.getMaxImpl();
        descriptiveStatistics53.setSkewnessImpl(univariateStatistic78);
        java.lang.String str80 = descriptiveStatistics53.toString();
        double double81 = descriptiveStatistics53.getMean();
        double[] doubleArray82 = descriptiveStatistics53.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic83 = descriptiveStatistics53.getVarianceImpl();
        descriptiveStatistics27.setSkewnessImpl(univariateStatistic83);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics86 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((-1));
        double double87 = descriptiveStatistics86.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic88 = descriptiveStatistics86.getMaxImpl();
        descriptiveStatistics27.setSkewnessImpl(univariateStatistic88);
        double double90 = descriptiveStatistics1.apply(univariateStatistic88);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(descriptiveStatistics43);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertNotNull(descriptiveStatistics45);
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(descriptiveStatistics53);
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(descriptiveStatistics58);
        org.junit.Assert.assertNotNull(univariateStatistic59);
        org.junit.Assert.assertNotNull(descriptiveStatistics60);
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertNotNull(univariateStatistic63);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(univariateStatistic66);
        org.junit.Assert.assertNotNull(descriptiveStatistics69);
        org.junit.Assert.assertNotNull(univariateStatistic70);
        org.junit.Assert.assertNotNull(descriptiveStatistics71);
        org.junit.Assert.assertNotNull(univariateStatistic72);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str80, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic83);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertNotNull(univariateStatistic88);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        int int3 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) (short) 10, (double) 100L);
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        float float9 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0]");
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        double double6 = descriptiveStatistics1.getVariance();
        descriptiveStatistics1.setWindowSize((int) (short) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        descriptiveStatistics9.setKurtosisImpl(univariateStatistic12);
        descriptiveStatistics1.setSkewnessImpl(univariateStatistic12);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        descriptiveStatistics15.setKurtosisImpl(univariateStatistic18);
        descriptiveStatistics15.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics15.getSkewnessImpl();
        descriptiveStatistics1.setVarianceImpl(univariateStatistic21);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics1.getSumImpl();
        double double24 = descriptiveStatistics1.getStandardDeviation();
        double double25 = descriptiveStatistics1.getVariance();
        double double26 = descriptiveStatistics1.getVariance();
        double double27 = descriptiveStatistics1.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics1.getKurtosisImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(univariateStatistic28);
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) (byte) 0);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        int int6 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        float float8 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.discardFrontElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int10 = resizableDoubleArray0.getNumElements();
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) 1);
        double double15 = resizableDoubleArray0.addElementRolling(1090.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements(0);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setContractionCriteria((float) 101);
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.setExpansionMode((int) (short) 1);
        int int4 = resizableDoubleArray0.getNumElements();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria((float) '#');
        resizableDoubleArray0.clear();
        int int9 = resizableDoubleArray0.getNumElements();
        double double11 = resizableDoubleArray0.addElementRolling(153.0d);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSumImpl();
        double double12 = descriptiveStatistics0.getMin();
        double[] doubleArray13 = descriptiveStatistics0.getSortedValues();
        double double14 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str16 = descriptiveStatistics15.toString();
        descriptiveStatistics15.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str19 = descriptiveStatistics18.toString();
        double double20 = descriptiveStatistics18.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        descriptiveStatistics21.setKurtosisImpl(univariateStatistic24);
        descriptiveStatistics18.setSkewnessImpl(univariateStatistic24);
        double double27 = descriptiveStatistics18.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double30 = descriptiveStatistics29.getStandardDeviation();
        long long31 = descriptiveStatistics29.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics29.getMinImpl();
        descriptiveStatistics18.setVarianceImpl(univariateStatistic32);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics18.getMeanImpl();
        descriptiveStatistics15.setMeanImpl(univariateStatistic34);
        int int36 = descriptiveStatistics15.getWindowSize();
        int int37 = descriptiveStatistics15.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics15.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics15.getGeometricMeanImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic39);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = null;
        descriptiveStatistics0.setSumsqImpl(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics0.getVarianceImpl();
        double double44 = descriptiveStatistics0.getMean();
        double double45 = descriptiveStatistics0.getStandardDeviation();
        double double46 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics47 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics47.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics47.getKurtosisImpl();
        long long50 = descriptiveStatistics47.getN();
        double[] doubleArray51 = descriptiveStatistics47.getValues();
        double double52 = descriptiveStatistics47.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics47.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics47.getVarianceImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str16, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str19, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(descriptiveStatistics47);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertNotNull(univariateStatistic54);
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        int int3 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) (short) 10, (double) 100L);
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        double double9 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.discardFrontElements((int) (short) 0);
        float float12 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        float float14 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        double double17 = resizableDoubleArray0.addElementRolling(100.0d);
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) (byte) 0);
        int int4 = resizableDoubleArray0.getExpansionMode();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        double double4 = descriptiveStatistics1.getMin();
        long long5 = descriptiveStatistics1.getN();
        double double6 = descriptiveStatistics1.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics1.getSkewnessImpl();
        double double9 = descriptiveStatistics1.getMin();
        double double10 = descriptiveStatistics1.getSumsq();
        double double11 = descriptiveStatistics1.getSum();
        int int12 = descriptiveStatistics1.getWindowSize();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str4 = descriptiveStatistics3.toString();
        double double5 = descriptiveStatistics3.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics6 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        descriptiveStatistics6.setKurtosisImpl(univariateStatistic9);
        descriptiveStatistics3.setSkewnessImpl(univariateStatistic9);
        double double12 = descriptiveStatistics3.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double15 = descriptiveStatistics14.getStandardDeviation();
        long long16 = descriptiveStatistics14.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics14.getMinImpl();
        descriptiveStatistics3.setVarianceImpl(univariateStatistic17);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics3.getMeanImpl();
        descriptiveStatistics0.setMeanImpl(univariateStatistic19);
        int int21 = descriptiveStatistics0.getWindowSize();
        double double22 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        descriptiveStatistics23.setKurtosisImpl(univariateStatistic26);
        descriptiveStatistics23.clear();
        int int29 = descriptiveStatistics23.getWindowSize();
        double double30 = descriptiveStatistics23.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics23.getMeanImpl();
        descriptiveStatistics0.setSumImpl(univariateStatistic31);
        descriptiveStatistics0.addValue(6.25d);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        descriptiveStatistics35.setKurtosisImpl(univariateStatistic38);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics40.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics42 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics42.getSumsqImpl();
        descriptiveStatistics40.setKurtosisImpl(univariateStatistic43);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics40.getKurtosisImpl();
        descriptiveStatistics35.setMaxImpl(univariateStatistic45);
        double double47 = descriptiveStatistics35.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics35.getMinImpl();
        double double49 = descriptiveStatistics35.getMin();
        long long50 = descriptiveStatistics35.getN();
        double double51 = descriptiveStatistics35.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics35.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics35.getGeometricMeanImpl();
        descriptiveStatistics0.setMeanImpl(univariateStatistic53);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str4, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(descriptiveStatistics6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(descriptiveStatistics42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertNotNull(univariateStatistic53);
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics0.getGeometricMeanImpl();
        double double4 = descriptiveStatistics0.getMax();
        double double5 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getPercentileImpl();
        double double8 = descriptiveStatistics0.getSum();
        long long9 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str11 = descriptiveStatistics10.toString();
        double double12 = descriptiveStatistics10.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        descriptiveStatistics13.setKurtosisImpl(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics13.getKurtosisImpl();
        double double19 = descriptiveStatistics10.apply(univariateStatistic18);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str21 = descriptiveStatistics20.toString();
        descriptiveStatistics20.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics20.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics20.getSumsqImpl();
        descriptiveStatistics10.setMeanImpl(univariateStatistic24);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        descriptiveStatistics26.setKurtosisImpl(univariateStatistic29);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics31.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        descriptiveStatistics31.setKurtosisImpl(univariateStatistic34);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics31.getKurtosisImpl();
        descriptiveStatistics26.setMaxImpl(univariateStatistic36);
        double double38 = descriptiveStatistics26.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics26.getMinImpl();
        descriptiveStatistics26.setWindowSize((int) (short) 100);
        java.lang.String str42 = descriptiveStatistics26.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics26.getVarianceImpl();
        descriptiveStatistics10.setGeometricMeanImpl(univariateStatistic43);
        double double45 = descriptiveStatistics10.getSum();
        double double46 = descriptiveStatistics10.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics10.getVarianceImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic48);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic50 = descriptiveStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics51 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        descriptiveStatistics51.setWindowSize((int) (byte) -1);
        long long54 = descriptiveStatistics51.getN();
        double double55 = descriptiveStatistics51.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics51.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics51.getSumsqImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic57);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str11, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str21, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str42, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertNotNull(univariateStatistic50);
        org.junit.Assert.assertNotNull(descriptiveStatistics51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(univariateStatistic57);
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getGeometricMeanImpl();
        java.lang.String str7 = descriptiveStatistics0.toString();
        double double8 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str7, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        double double5 = descriptiveStatistics0.getMean();
        descriptiveStatistics0.addValue((double) (byte) 10);
        double double8 = descriptiveStatistics0.getMean();
        double double9 = descriptiveStatistics0.getMean();
        double double10 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str13 = descriptiveStatistics12.toString();
        double double14 = descriptiveStatistics12.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        descriptiveStatistics15.setKurtosisImpl(univariateStatistic18);
        descriptiveStatistics12.setSkewnessImpl(univariateStatistic18);
        double double21 = descriptiveStatistics12.getStandardDeviation();
        descriptiveStatistics12.setWindowSize((int) (short) 1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics12.getKurtosisImpl();
        double double25 = descriptiveStatistics0.apply(univariateStatistic24);
        double double26 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = null;
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic27);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray30 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int31 = resizableDoubleArray30.getExpansionMode();
        int int32 = resizableDoubleArray30.getNumElements();
        double[] doubleArray33 = resizableDoubleArray30.getElements();
        float float34 = resizableDoubleArray30.getExpansionFactor();
        int int35 = resizableDoubleArray30.getNumElements();
        resizableDoubleArray30.contract();
        resizableDoubleArray30.clear();
        resizableDoubleArray30.addElement(625.0d);
        resizableDoubleArray30.contract();
        double[] doubleArray41 = resizableDoubleArray30.getValues();
        double double42 = univariateStatistic29.evaluate(doubleArray41);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.000000000000002d + "'", double10 == 10.000000000000002d);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str13, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 2.0f + "'", float34 == 2.0f);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[625.0, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSumImpl();
        double double12 = descriptiveStatistics0.getMin();
        double[] doubleArray13 = descriptiveStatistics0.getSortedValues();
        double[] doubleArray14 = descriptiveStatistics0.getSortedValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double17 = descriptiveStatistics16.getStandardDeviation();
        long long18 = descriptiveStatistics16.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics16.getSkewnessImpl();
        java.lang.String str20 = descriptiveStatistics16.toString();
        double double21 = descriptiveStatistics16.getVariance();
        descriptiveStatistics16.setWindowSize((int) '4');
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics16.getMaxImpl();
        descriptiveStatistics16.addValue((-1.0d));
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double29 = descriptiveStatistics28.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics28.getGeometricMeanImpl();
        double double31 = descriptiveStatistics28.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics32.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics32.getKurtosisImpl();
        double[] doubleArray35 = descriptiveStatistics32.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics32.getVarianceImpl();
        descriptiveStatistics28.setSumsqImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics38.getKurtosisImpl();
        long long41 = descriptiveStatistics38.getN();
        descriptiveStatistics38.addValue((double) 0);
        int int44 = descriptiveStatistics38.getWindowSize();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics38.getGeometricMeanImpl();
        descriptiveStatistics28.setKurtosisImpl(univariateStatistic45);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics28.getVarianceImpl();
        descriptiveStatistics16.setSkewnessImpl(univariateStatistic47);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic47);
        long long50 = descriptiveStatistics0.getN();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str20, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic6);
        double double9 = descriptiveStatistics0.getStandardDeviation();
        descriptiveStatistics0.setWindowSize((int) (short) 1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics0.getKurtosisImpl();
        double double14 = descriptiveStatistics0.getPercentile((double) 10);
        double double15 = descriptiveStatistics0.getGeometricMean();
        double double16 = descriptiveStatistics0.getSum();
        double double17 = descriptiveStatistics0.getSkewness();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 10);
        double double20 = descriptiveStatistics19.getStandardDeviation();
        double[] doubleArray21 = descriptiveStatistics19.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics24.getKurtosisImpl();
        long long27 = descriptiveStatistics24.getN();
        double[] doubleArray28 = descriptiveStatistics24.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics24.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics24.getMinImpl();
        double double31 = descriptiveStatistics22.apply(univariateStatistic30);
        descriptiveStatistics19.setSumsqImpl(univariateStatistic30);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        double double35 = descriptiveStatistics33.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics33.getMinImpl();
        descriptiveStatistics19.setSkewnessImpl(univariateStatistic36);
        long long38 = descriptiveStatistics19.getN();
        double double39 = descriptiveStatistics19.getMax();
        long long40 = descriptiveStatistics19.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics19.getMeanImpl();
        descriptiveStatistics0.setMaxImpl(univariateStatistic41);
        java.lang.String str43 = descriptiveStatistics0.toString();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str43, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.setElement(1, (double) 100.0f);
        float float7 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) '4');
        double double11 = resizableDoubleArray0.addElementRolling(100.0d);
        resizableDoubleArray0.setExpansionFactor(2.5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = null;
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics0.getMinImpl();
        double double9 = descriptiveStatistics0.getMean();
        double double10 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getGeometricMeanImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(11);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        float float3 = resizableDoubleArray1.getContractionCriteria();
        float float4 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray5 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.setElement(98, (double) 2);
        resizableDoubleArray1.addElement(97.0d);
        resizableDoubleArray1.addElement(1.2600062499999993E8d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.5f + "'", float3 == 2.5f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getNumElements();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements((int) (byte) 1);
        float float8 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) 32.0f);
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) 91);
        resizableDoubleArray0.setExpansionMode(0);
        resizableDoubleArray0.addElement(5.4999999999999964d);
        resizableDoubleArray0.setNumElements(32);
        double[] doubleArray20 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 91.0, 5.4999999999999964, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 1);
        double double2 = descriptiveStatistics1.getMin();
        double double4 = descriptiveStatistics1.getPercentile((double) (short) 100);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str6 = descriptiveStatistics5.toString();
        double double7 = descriptiveStatistics5.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        descriptiveStatistics8.setKurtosisImpl(univariateStatistic11);
        descriptiveStatistics5.setSkewnessImpl(univariateStatistic11);
        double double14 = descriptiveStatistics5.getStandardDeviation();
        descriptiveStatistics5.clear();
        double double16 = descriptiveStatistics5.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        descriptiveStatistics17.setKurtosisImpl(univariateStatistic20);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics24 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics24.getSumsqImpl();
        descriptiveStatistics22.setKurtosisImpl(univariateStatistic25);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics22.getKurtosisImpl();
        descriptiveStatistics17.setMaxImpl(univariateStatistic27);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics31.getSumsqImpl();
        descriptiveStatistics29.setKurtosisImpl(univariateStatistic32);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics29.getKurtosisImpl();
        descriptiveStatistics17.setGeometricMeanImpl(univariateStatistic34);
        descriptiveStatistics5.setSumImpl(univariateStatistic34);
        descriptiveStatistics5.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics5.getPercentileImpl();
        descriptiveStatistics1.setGeometricMeanImpl(univariateStatistic38);
        descriptiveStatistics1.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics1.getGeometricMeanImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str6, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(descriptiveStatistics24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(descriptiveStatistics31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic41);
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        descriptiveStatistics1.setKurtosisImpl(univariateStatistic4);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics1.getKurtosisImpl();
        double[] doubleArray10 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double11 = univariateStatistic6.evaluate(doubleArray10);
        descriptiveStatistics0.setMaxImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics13.getKurtosisImpl();
        long long16 = descriptiveStatistics13.getN();
        double[] doubleArray17 = descriptiveStatistics13.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics13.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics13.getMeanImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics21.getKurtosisImpl();
        long long24 = descriptiveStatistics21.getN();
        double double25 = descriptiveStatistics21.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        descriptiveStatistics26.setKurtosisImpl(univariateStatistic29);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics31 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics31.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics33 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics33.getSumsqImpl();
        descriptiveStatistics31.setKurtosisImpl(univariateStatistic34);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics31.getKurtosisImpl();
        descriptiveStatistics26.setMaxImpl(univariateStatistic36);
        descriptiveStatistics21.setSumImpl(univariateStatistic36);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic36);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics0.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics0.getPercentileImpl();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics0.getSumImpl();
        double double44 = descriptiveStatistics0.getSkewness();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(descriptiveStatistics1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertNotNull(descriptiveStatistics33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        descriptiveStatistics0.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getSumsqImpl();
        descriptiveStatistics7.setKurtosisImpl(univariateStatistic10);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics7.getKurtosisImpl();
        double[] doubleArray16 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double17 = univariateStatistic12.evaluate(doubleArray16);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic12);
        double double19 = descriptiveStatistics0.getMin();
        double double20 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double23 = descriptiveStatistics22.getStandardDeviation();
        long long24 = descriptiveStatistics22.getN();
        double double25 = descriptiveStatistics22.getMin();
        double double26 = descriptiveStatistics22.getMax();
        double double27 = descriptiveStatistics22.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getKurtosisImpl();
        descriptiveStatistics22.setSkewnessImpl(univariateStatistic30);
        double[] doubleArray32 = descriptiveStatistics22.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics22.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics22.getKurtosisImpl();
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic34);
        double[] doubleArray36 = descriptiveStatistics0.getValues();
        double double37 = descriptiveStatistics0.getSkewness();
        double double38 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics41 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic42 = descriptiveStatistics41.getSumsqImpl();
        descriptiveStatistics39.setKurtosisImpl(univariateStatistic42);
        descriptiveStatistics39.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics39.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics39.getMeanImpl();
        int int47 = descriptiveStatistics39.getWindowSize();
        double double48 = descriptiveStatistics39.getVariance();
        double[] doubleArray49 = descriptiveStatistics39.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics51 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) 1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics51.getKurtosisImpl();
        descriptiveStatistics39.setMaxImpl(univariateStatistic52);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics39.getMinImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic54);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(descriptiveStatistics7);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0d + "'", double17 == 2.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics41);
        org.junit.Assert.assertNotNull(univariateStatistic42);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertNotNull(univariateStatistic54);
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getPercentileImpl();
        double double7 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics8.getKurtosisImpl();
        double[] doubleArray11 = descriptiveStatistics8.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics8.getVarianceImpl();
        double double13 = descriptiveStatistics0.apply(univariateStatistic12);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = null;
        descriptiveStatistics0.setMeanImpl(univariateStatistic14);
        double double16 = descriptiveStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double19 = descriptiveStatistics18.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics18.getGeometricMeanImpl();
        double double21 = descriptiveStatistics18.getMean();
        double double22 = descriptiveStatistics18.getMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics18.getMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics18.getKurtosisImpl();
        descriptiveStatistics0.setSumImpl(univariateStatistic24);
        double double26 = descriptiveStatistics0.getVariance();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement(0, (double) 0.0f);
        resizableDoubleArray0.clear();
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.addElement((double) 3);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float12 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        double double5 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double8 = descriptiveStatistics7.getStandardDeviation();
        long long9 = descriptiveStatistics7.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics7.getKurtosisImpl();
        descriptiveStatistics0.setSumImpl(univariateStatistic10);
        double double12 = descriptiveStatistics0.getMin();
        double double14 = descriptiveStatistics0.getPercentile((double) 1L);
        double double15 = descriptiveStatistics0.getMean();
        long long16 = descriptiveStatistics0.getN();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        descriptiveStatistics0.setWindowSize((int) (byte) -1);
        long long3 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics0.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        int int6 = descriptiveStatistics5.getWindowSize();
        double double7 = descriptiveStatistics5.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics8.getKurtosisImpl();
        descriptiveStatistics5.setGeometricMeanImpl(univariateStatistic10);
        descriptiveStatistics0.setSkewnessImpl(univariateStatistic10);
        double double13 = descriptiveStatistics0.getStandardDeviation();
        double[] doubleArray14 = descriptiveStatistics0.getValues();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double1 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics2.getKurtosisImpl();
        long long5 = descriptiveStatistics2.getN();
        descriptiveStatistics2.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        descriptiveStatistics8.setKurtosisImpl(univariateStatistic11);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        descriptiveStatistics13.setKurtosisImpl(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics13.getKurtosisImpl();
        descriptiveStatistics8.setMaxImpl(univariateStatistic18);
        double double20 = descriptiveStatistics8.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics8.getMinImpl();
        descriptiveStatistics2.setMinImpl(univariateStatistic21);
        descriptiveStatistics0.setMeanImpl(univariateStatistic21);
        double double24 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        descriptiveStatistics25.setKurtosisImpl(univariateStatistic28);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics25.getKurtosisImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic30);
        double double32 = descriptiveStatistics0.getVariance();
        double double33 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics0.getKurtosisImpl();
        double double35 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics0.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        double[] doubleArray3 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics0.getVarianceImpl();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getGeometricMeanImpl();
        double double7 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 10);
        double double10 = descriptiveStatistics9.getMean();
        double[] doubleArray11 = descriptiveStatistics9.getSortedValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics9.getMaxImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        descriptiveStatistics13.setKurtosisImpl(univariateStatistic16);
        descriptiveStatistics13.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double20 = descriptiveStatistics19.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics21.getKurtosisImpl();
        long long24 = descriptiveStatistics21.getN();
        descriptiveStatistics21.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics27.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics29.getSumsqImpl();
        descriptiveStatistics27.setKurtosisImpl(univariateStatistic30);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics32.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic35 = descriptiveStatistics34.getSumsqImpl();
        descriptiveStatistics32.setKurtosisImpl(univariateStatistic35);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics32.getKurtosisImpl();
        descriptiveStatistics27.setMaxImpl(univariateStatistic37);
        double double39 = descriptiveStatistics27.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics27.getMinImpl();
        descriptiveStatistics21.setMinImpl(univariateStatistic40);
        descriptiveStatistics19.setMeanImpl(univariateStatistic40);
        double double43 = descriptiveStatistics19.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics44.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics46 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics46.getSumsqImpl();
        descriptiveStatistics44.setKurtosisImpl(univariateStatistic47);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics44.getKurtosisImpl();
        descriptiveStatistics19.setKurtosisImpl(univariateStatistic49);
        double double51 = descriptiveStatistics13.apply(univariateStatistic49);
        descriptiveStatistics9.setMaxImpl(univariateStatistic49);
        descriptiveStatistics0.setVarianceImpl(univariateStatistic49);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics0.getVarianceImpl();
        int int55 = descriptiveStatistics0.getWindowSize();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(descriptiveStatistics21);
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(descriptiveStatistics34);
        org.junit.Assert.assertNotNull(univariateStatistic35);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(descriptiveStatistics44);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(descriptiveStatistics46);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        descriptiveStatistics1.setWindowSize((int) ' ');
        double double4 = descriptiveStatistics1.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics1.getSumsqImpl();
        double double6 = descriptiveStatistics1.getSum();
        double double7 = descriptiveStatistics1.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        descriptiveStatistics8.setKurtosisImpl(univariateStatistic11);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics15 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics15.getSumsqImpl();
        descriptiveStatistics13.setKurtosisImpl(univariateStatistic16);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics13.getKurtosisImpl();
        descriptiveStatistics8.setMaxImpl(univariateStatistic18);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics20 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics20.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        descriptiveStatistics20.setKurtosisImpl(univariateStatistic23);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics20.getKurtosisImpl();
        descriptiveStatistics8.setGeometricMeanImpl(univariateStatistic25);
        double double27 = descriptiveStatistics8.getMin();
        double double28 = descriptiveStatistics8.getGeometricMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics29 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str30 = descriptiveStatistics29.toString();
        java.lang.String str31 = descriptiveStatistics29.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics32.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics32.getKurtosisImpl();
        long long35 = descriptiveStatistics32.getN();
        descriptiveStatistics32.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics32.getSkewnessImpl();
        descriptiveStatistics29.setSumsqImpl(univariateStatistic38);
        double double40 = descriptiveStatistics29.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics29.getSkewnessImpl();
        double double42 = descriptiveStatistics8.apply(univariateStatistic41);
        descriptiveStatistics1.setVarianceImpl(univariateStatistic41);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics45 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double46 = descriptiveStatistics45.getStandardDeviation();
        double double47 = descriptiveStatistics45.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics45.getSumImpl();
        double double49 = descriptiveStatistics45.getVariance();
        double[] doubleArray50 = descriptiveStatistics45.getValues();
        descriptiveStatistics45.setWindowSize(11);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic53 = descriptiveStatistics45.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics54 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str55 = descriptiveStatistics54.toString();
        descriptiveStatistics54.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics54.getGeometricMeanImpl();
        double double58 = descriptiveStatistics54.getKurtosis();
        java.lang.String str59 = descriptiveStatistics54.toString();
        double double60 = descriptiveStatistics54.getSum();
        long long61 = descriptiveStatistics54.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics62 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic63 = descriptiveStatistics62.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics62.getKurtosisImpl();
        long long65 = descriptiveStatistics62.getN();
        descriptiveStatistics62.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic68 = descriptiveStatistics62.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics69 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic70 = descriptiveStatistics69.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics71 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic72 = descriptiveStatistics71.getSumsqImpl();
        descriptiveStatistics69.setKurtosisImpl(univariateStatistic72);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics69.getKurtosisImpl();
        double[] doubleArray78 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double79 = univariateStatistic74.evaluate(doubleArray78);
        descriptiveStatistics62.setSkewnessImpl(univariateStatistic74);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic81 = descriptiveStatistics62.getSkewnessImpl();
        double double82 = descriptiveStatistics62.getSum();
        long long83 = descriptiveStatistics62.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic84 = descriptiveStatistics62.getMaxImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic85 = descriptiveStatistics62.getSumImpl();
        descriptiveStatistics54.setKurtosisImpl(univariateStatistic85);
        descriptiveStatistics45.setVarianceImpl(univariateStatistic85);
        double double88 = descriptiveStatistics1.apply(univariateStatistic85);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(descriptiveStatistics8);
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics20);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(descriptiveStatistics29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str30, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str31, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic53);
        org.junit.Assert.assertNotNull(descriptiveStatistics54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str55, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str59, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics62);
        org.junit.Assert.assertNotNull(univariateStatistic63);
        org.junit.Assert.assertNotNull(univariateStatistic64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic68);
        org.junit.Assert.assertNotNull(descriptiveStatistics69);
        org.junit.Assert.assertNotNull(univariateStatistic70);
        org.junit.Assert.assertNotNull(descriptiveStatistics71);
        org.junit.Assert.assertNotNull(univariateStatistic72);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2.0d + "'", double79 == 2.0d);
        org.junit.Assert.assertNotNull(univariateStatistic81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertNotNull(univariateStatistic84);
        org.junit.Assert.assertNotNull(univariateStatistic85);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double6 = descriptiveStatistics5.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics8 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double9 = descriptiveStatistics8.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics8.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double13 = descriptiveStatistics12.getStandardDeviation();
        long long14 = descriptiveStatistics12.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics12.getMinImpl();
        descriptiveStatistics8.setMaxImpl(univariateStatistic15);
        descriptiveStatistics5.setMinImpl(univariateStatistic15);
        descriptiveStatistics1.setSumImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics1.getMaxImpl();
        double double20 = descriptiveStatistics1.getVariance();
        double[] doubleArray21 = descriptiveStatistics1.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic22 = descriptiveStatistics1.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        descriptiveStatistics23.setKurtosisImpl(univariateStatistic26);
        descriptiveStatistics23.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics23.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics23.getSumsqImpl();
        double double31 = descriptiveStatistics23.getVariance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str33 = descriptiveStatistics32.toString();
        double double34 = descriptiveStatistics32.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        descriptiveStatistics35.setKurtosisImpl(univariateStatistic38);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics35.getKurtosisImpl();
        double double41 = descriptiveStatistics32.apply(univariateStatistic40);
        double double42 = descriptiveStatistics32.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics32.getSumImpl();
        descriptiveStatistics23.setGeometricMeanImpl(univariateStatistic43);
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray45 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int46 = resizableDoubleArray45.start();
        resizableDoubleArray45.addElement((double) 10);
        double[] doubleArray49 = resizableDoubleArray45.getElements();
        double double50 = univariateStatistic43.evaluate(doubleArray49);
        descriptiveStatistics1.setMeanImpl(univariateStatistic43);
        double double52 = descriptiveStatistics1.getGeometricMean();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic22);
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str33, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getSumsq();
        double double11 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics12.getKurtosisImpl();
        descriptiveStatistics0.setSumsqImpl(univariateStatistic17);
        double double19 = descriptiveStatistics0.getSkewness();
        double double20 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str23 = descriptiveStatistics22.toString();
        java.lang.String str24 = descriptiveStatistics22.toString();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics25 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics25.getKurtosisImpl();
        long long28 = descriptiveStatistics25.getN();
        descriptiveStatistics25.addValue((double) 0);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics25.getSkewnessImpl();
        descriptiveStatistics22.setSumsqImpl(univariateStatistic31);
        double double33 = descriptiveStatistics22.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics22.getSkewnessImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic34);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str23, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str24, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(descriptiveStatistics25);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(univariateStatistic34);
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics0.getKurtosisImpl();
        long long3 = descriptiveStatistics0.getN();
        double[] doubleArray4 = descriptiveStatistics0.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic5 = descriptiveStatistics0.getSumImpl();
        double double6 = descriptiveStatistics0.getVariance();
        double double7 = descriptiveStatistics0.getMax();
        double double8 = descriptiveStatistics0.getKurtosis();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic9 = descriptiveStatistics0.getSkewnessImpl();
        long long10 = descriptiveStatistics0.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double13 = descriptiveStatistics12.getStandardDeviation();
        long long14 = descriptiveStatistics12.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics12.getKurtosisImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        double double17 = descriptiveStatistics16.getSum();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double20 = descriptiveStatistics19.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics19.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double24 = descriptiveStatistics23.getStandardDeviation();
        long long25 = descriptiveStatistics23.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics23.getMinImpl();
        descriptiveStatistics19.setMaxImpl(univariateStatistic26);
        descriptiveStatistics16.setMinImpl(univariateStatistic26);
        descriptiveStatistics12.setSumImpl(univariateStatistic26);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics12.getMaxImpl();
        double double31 = descriptiveStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics12.getGeometricMeanImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic32);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double36 = descriptiveStatistics35.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics35.getGeometricMeanImpl();
        double double38 = descriptiveStatistics35.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics39.getKurtosisImpl();
        long long42 = descriptiveStatistics39.getN();
        double[] doubleArray43 = descriptiveStatistics39.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics39.getSumImpl();
        descriptiveStatistics35.setSkewnessImpl(univariateStatistic44);
        descriptiveStatistics35.clear();
        double double47 = descriptiveStatistics35.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic50 = descriptiveStatistics48.getKurtosisImpl();
        long long51 = descriptiveStatistics48.getN();
        descriptiveStatistics48.addValue((double) 0);
        int int54 = descriptiveStatistics48.getWindowSize();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics57 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics57.getSumsqImpl();
        descriptiveStatistics55.setKurtosisImpl(univariateStatistic58);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics60 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic61 = descriptiveStatistics60.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics62 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic63 = descriptiveStatistics62.getSumsqImpl();
        descriptiveStatistics60.setKurtosisImpl(univariateStatistic63);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic65 = descriptiveStatistics60.getKurtosisImpl();
        descriptiveStatistics55.setMaxImpl(univariateStatistic65);
        double double67 = descriptiveStatistics55.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic68 = descriptiveStatistics55.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics55.getVarianceImpl();
        descriptiveStatistics48.setMeanImpl(univariateStatistic69);
        descriptiveStatistics35.setMaxImpl(univariateStatistic69);
        double double72 = descriptiveStatistics35.getSumsq();
        long long73 = descriptiveStatistics35.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics35.getMaxImpl();
        double double75 = descriptiveStatistics35.getSumsq();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics77 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double78 = descriptiveStatistics77.getStandardDeviation();
        long long79 = descriptiveStatistics77.getN();
        double double80 = descriptiveStatistics77.getMin();
        double double81 = descriptiveStatistics77.getMax();
        double double82 = descriptiveStatistics77.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics84 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic85 = descriptiveStatistics84.getKurtosisImpl();
        descriptiveStatistics77.setSkewnessImpl(univariateStatistic85);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic87 = descriptiveStatistics77.getGeometricMeanImpl();
        double double88 = descriptiveStatistics77.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic89 = descriptiveStatistics77.getKurtosisImpl();
        descriptiveStatistics35.setMaxImpl(univariateStatistic89);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic89);
        long long92 = descriptiveStatistics0.getN();
        double double93 = descriptiveStatistics0.getSkewness();
        int int94 = descriptiveStatistics0.getWindowSize();
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(univariateStatistic9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(univariateStatistic50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(descriptiveStatistics57);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(descriptiveStatistics60);
        org.junit.Assert.assertNotNull(univariateStatistic61);
        org.junit.Assert.assertNotNull(descriptiveStatistics62);
        org.junit.Assert.assertNotNull(univariateStatistic63);
        org.junit.Assert.assertNotNull(univariateStatistic65);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(univariateStatistic68);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(univariateStatistic85);
        org.junit.Assert.assertNotNull(univariateStatistic87);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertNotNull(univariateStatistic89);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        double double6 = descriptiveStatistics1.getVariance();
        descriptiveStatistics1.setWindowSize((int) (short) 100);
        descriptiveStatistics1.setWindowSize((int) (short) -1);
        double double11 = descriptiveStatistics1.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        descriptiveStatistics12.setKurtosisImpl(univariateStatistic15);
        double double17 = descriptiveStatistics12.getMean();
        descriptiveStatistics12.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double22 = descriptiveStatistics21.getStandardDeviation();
        long long23 = descriptiveStatistics21.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics21.getMinImpl();
        descriptiveStatistics12.setSkewnessImpl(univariateStatistic24);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics26 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics26.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        descriptiveStatistics26.setKurtosisImpl(univariateStatistic29);
        descriptiveStatistics26.clear();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics32 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic33 = descriptiveStatistics32.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic34 = descriptiveStatistics32.getKurtosisImpl();
        long long35 = descriptiveStatistics32.getN();
        double double36 = descriptiveStatistics32.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics39 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic40 = descriptiveStatistics39.getSumsqImpl();
        descriptiveStatistics37.setKurtosisImpl(univariateStatistic40);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics42 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics42.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics44 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics44.getSumsqImpl();
        descriptiveStatistics42.setKurtosisImpl(univariateStatistic45);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics42.getKurtosisImpl();
        descriptiveStatistics37.setMaxImpl(univariateStatistic47);
        descriptiveStatistics32.setSumImpl(univariateStatistic47);
        descriptiveStatistics26.setSumsqImpl(univariateStatistic47);
        double double51 = descriptiveStatistics26.getSumsq();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics52 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str53 = descriptiveStatistics52.toString();
        double double54 = descriptiveStatistics52.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic56 = descriptiveStatistics55.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics57 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics57.getSumsqImpl();
        descriptiveStatistics55.setKurtosisImpl(univariateStatistic58);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics55.getKurtosisImpl();
        double double61 = descriptiveStatistics52.apply(univariateStatistic60);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics62 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str63 = descriptiveStatistics62.toString();
        descriptiveStatistics62.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic65 = descriptiveStatistics62.getGeometricMeanImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic66 = descriptiveStatistics62.getSumsqImpl();
        descriptiveStatistics52.setMeanImpl(univariateStatistic66);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics68 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics68.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics70 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic71 = descriptiveStatistics70.getSumsqImpl();
        descriptiveStatistics68.setKurtosisImpl(univariateStatistic71);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics73 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic74 = descriptiveStatistics73.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics75 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic76 = descriptiveStatistics75.getSumsqImpl();
        descriptiveStatistics73.setKurtosisImpl(univariateStatistic76);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic78 = descriptiveStatistics73.getKurtosisImpl();
        descriptiveStatistics68.setMaxImpl(univariateStatistic78);
        double double80 = descriptiveStatistics68.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic81 = descriptiveStatistics68.getMinImpl();
        descriptiveStatistics68.setWindowSize((int) (short) 100);
        java.lang.String str84 = descriptiveStatistics68.toString();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic85 = descriptiveStatistics68.getVarianceImpl();
        descriptiveStatistics52.setGeometricMeanImpl(univariateStatistic85);
        descriptiveStatistics26.setSumsqImpl(univariateStatistic85);
        descriptiveStatistics12.setSkewnessImpl(univariateStatistic85);
        descriptiveStatistics1.setSumsqImpl(univariateStatistic85);
        double double90 = descriptiveStatistics1.getKurtosis();
        double double91 = descriptiveStatistics1.getGeometricMean();
        java.lang.Class<?> wildcardClass92 = descriptiveStatistics1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(descriptiveStatistics26);
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(descriptiveStatistics32);
        org.junit.Assert.assertNotNull(univariateStatistic33);
        org.junit.Assert.assertNotNull(univariateStatistic34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(descriptiveStatistics39);
        org.junit.Assert.assertNotNull(univariateStatistic40);
        org.junit.Assert.assertNotNull(descriptiveStatistics42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertNotNull(descriptiveStatistics44);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(descriptiveStatistics52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str53, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(descriptiveStatistics55);
        org.junit.Assert.assertNotNull(univariateStatistic56);
        org.junit.Assert.assertNotNull(descriptiveStatistics57);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(descriptiveStatistics62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str63, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic65);
        org.junit.Assert.assertNotNull(univariateStatistic66);
        org.junit.Assert.assertNotNull(descriptiveStatistics68);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertNotNull(descriptiveStatistics70);
        org.junit.Assert.assertNotNull(univariateStatistic71);
        org.junit.Assert.assertNotNull(descriptiveStatistics73);
        org.junit.Assert.assertNotNull(univariateStatistic74);
        org.junit.Assert.assertNotNull(descriptiveStatistics75);
        org.junit.Assert.assertNotNull(univariateStatistic76);
        org.junit.Assert.assertNotNull(univariateStatistic78);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(univariateStatistic81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str84, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic85);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        int int3 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) (short) 10, (double) 100L);
        resizableDoubleArray0.setElement(32, (double) 100.0f);
        resizableDoubleArray0.contract();
        double double12 = resizableDoubleArray0.addElementRolling(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        int int2 = resizableDoubleArray0.getNumElements();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        double double5 = resizableDoubleArray0.addElementRolling((double) (-1));
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(100);
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.discardFrontElements((int) ' ');
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.addElementRolling((double) 103);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 68 + "'", int12 == 68);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        double double6 = descriptiveStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic7 = descriptiveStatistics0.getSkewnessImpl();
        double double8 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics10 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics10.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        descriptiveStatistics10.setKurtosisImpl(univariateStatistic13);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics10.getKurtosisImpl();
        double[] doubleArray19 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double20 = univariateStatistic15.evaluate(doubleArray19);
        descriptiveStatistics9.setMaxImpl(univariateStatistic15);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getKurtosisImpl();
        long long25 = descriptiveStatistics22.getN();
        double[] doubleArray26 = descriptiveStatistics22.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic27 = descriptiveStatistics22.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics22.getMeanImpl();
        descriptiveStatistics9.setGeometricMeanImpl(univariateStatistic28);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic31 = descriptiveStatistics30.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics30.getKurtosisImpl();
        long long33 = descriptiveStatistics30.getN();
        double double34 = descriptiveStatistics30.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics35 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic36 = descriptiveStatistics35.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic38 = descriptiveStatistics37.getSumsqImpl();
        descriptiveStatistics35.setKurtosisImpl(univariateStatistic38);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics40.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics42 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics42.getSumsqImpl();
        descriptiveStatistics40.setKurtosisImpl(univariateStatistic43);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic45 = descriptiveStatistics40.getKurtosisImpl();
        descriptiveStatistics35.setMaxImpl(univariateStatistic45);
        descriptiveStatistics30.setSumImpl(univariateStatistic45);
        descriptiveStatistics9.setSkewnessImpl(univariateStatistic45);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics9.getSkewnessImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic50 = descriptiveStatistics9.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics51 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str52 = descriptiveStatistics51.toString();
        double double53 = descriptiveStatistics51.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics54 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic55 = descriptiveStatistics54.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics56 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic57 = descriptiveStatistics56.getSumsqImpl();
        descriptiveStatistics54.setKurtosisImpl(univariateStatistic57);
        descriptiveStatistics51.setSkewnessImpl(univariateStatistic57);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics61 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double62 = descriptiveStatistics61.getStandardDeviation();
        long long63 = descriptiveStatistics61.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics61.getMinImpl();
        descriptiveStatistics51.setKurtosisImpl(univariateStatistic64);
        double double66 = descriptiveStatistics9.apply(univariateStatistic64);
        descriptiveStatistics0.setVarianceImpl(univariateStatistic64);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics68 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic69 = descriptiveStatistics68.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic70 = descriptiveStatistics68.getKurtosisImpl();
        long long71 = descriptiveStatistics68.getN();
        double[] doubleArray72 = descriptiveStatistics68.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic73 = descriptiveStatistics68.getSumImpl();
        double double74 = descriptiveStatistics68.getStandardDeviation();
        double double75 = descriptiveStatistics68.getVariance();
        descriptiveStatistics68.addValue(100.0d);
        double double78 = descriptiveStatistics68.getSkewness();
        long long79 = descriptiveStatistics68.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic80 = descriptiveStatistics68.getMeanImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic80);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(univariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(descriptiveStatistics9);
        org.junit.Assert.assertNotNull(descriptiveStatistics10);
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic27);
        org.junit.Assert.assertNotNull(univariateStatistic28);
        org.junit.Assert.assertNotNull(descriptiveStatistics30);
        org.junit.Assert.assertNotNull(univariateStatistic31);
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(descriptiveStatistics35);
        org.junit.Assert.assertNotNull(univariateStatistic36);
        org.junit.Assert.assertNotNull(descriptiveStatistics37);
        org.junit.Assert.assertNotNull(univariateStatistic38);
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(descriptiveStatistics42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertNotNull(univariateStatistic45);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(univariateStatistic50);
        org.junit.Assert.assertNotNull(descriptiveStatistics51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str52, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(descriptiveStatistics54);
        org.junit.Assert.assertNotNull(univariateStatistic55);
        org.junit.Assert.assertNotNull(descriptiveStatistics56);
        org.junit.Assert.assertNotNull(univariateStatistic57);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic64);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(descriptiveStatistics68);
        org.junit.Assert.assertNotNull(univariateStatistic69);
        org.junit.Assert.assertNotNull(univariateStatistic70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic73);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertNotNull(univariateStatistic80);
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic1 = descriptiveStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics2 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics2.getSumsqImpl();
        descriptiveStatistics0.setKurtosisImpl(univariateStatistic3);
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics0.getSumsqImpl();
        double double7 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 10);
        double double10 = descriptiveStatistics9.getStandardDeviation();
        double[] doubleArray11 = descriptiveStatistics9.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics12 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic13 = descriptiveStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics14.getKurtosisImpl();
        long long17 = descriptiveStatistics14.getN();
        double[] doubleArray18 = descriptiveStatistics14.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics14.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics14.getMinImpl();
        double double21 = descriptiveStatistics12.apply(univariateStatistic20);
        descriptiveStatistics9.setSumsqImpl(univariateStatistic20);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics23 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics23.getSumsqImpl();
        double double25 = descriptiveStatistics23.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics23.getMinImpl();
        descriptiveStatistics9.setSkewnessImpl(univariateStatistic26);
        long long28 = descriptiveStatistics9.getN();
        double double29 = descriptiveStatistics9.getMax();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics9.getMaxImpl();
        descriptiveStatistics0.setSumImpl(univariateStatistic30);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(univariateStatistic1);
        org.junit.Assert.assertNotNull(descriptiveStatistics2);
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics12);
        org.junit.Assert.assertNotNull(univariateStatistic13);
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(univariateStatistic30);
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        double double2 = descriptiveStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics5 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics5.getSumsqImpl();
        descriptiveStatistics3.setKurtosisImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics3.getKurtosisImpl();
        double double9 = descriptiveStatistics0.apply(univariateStatistic8);
        double double10 = descriptiveStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic11 = descriptiveStatistics0.getSumImpl();
        double double12 = descriptiveStatistics0.getMin();
        double[] doubleArray13 = descriptiveStatistics0.getSortedValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        descriptiveStatistics14.setKurtosisImpl(univariateStatistic17);
        descriptiveStatistics14.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics14.getPercentileImpl();
        double double21 = descriptiveStatistics14.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics22 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics22.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics22.getKurtosisImpl();
        double[] doubleArray25 = descriptiveStatistics22.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics22.getVarianceImpl();
        double double27 = descriptiveStatistics14.apply(univariateStatistic26);
        descriptiveStatistics0.setSumsqImpl(univariateStatistic26);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics30 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double31 = descriptiveStatistics30.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic32 = descriptiveStatistics30.getGeometricMeanImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic32);
        java.lang.String str34 = descriptiveStatistics0.toString();
        double double35 = descriptiveStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics36 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic37 = descriptiveStatistics36.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics38 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic39 = descriptiveStatistics38.getSumsqImpl();
        descriptiveStatistics36.setKurtosisImpl(univariateStatistic39);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics36.getKurtosisImpl();
        double double42 = descriptiveStatistics36.getStandardDeviation();
        double double43 = descriptiveStatistics36.getSum();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics36.getPercentileImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics46 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double47 = descriptiveStatistics46.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics46.getGeometricMeanImpl();
        double double49 = descriptiveStatistics46.getMean();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics50 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic51 = descriptiveStatistics50.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics50.getKurtosisImpl();
        double[] doubleArray53 = descriptiveStatistics50.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics50.getVarianceImpl();
        descriptiveStatistics46.setSumsqImpl(univariateStatistic54);
        double double56 = descriptiveStatistics36.apply(univariateStatistic54);
        long long57 = descriptiveStatistics36.getN();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics58 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics59 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics59.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics61 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics61.getSumsqImpl();
        descriptiveStatistics59.setKurtosisImpl(univariateStatistic62);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics59.getKurtosisImpl();
        double[] doubleArray68 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double69 = univariateStatistic64.evaluate(doubleArray68);
        descriptiveStatistics58.setMaxImpl(univariateStatistic64);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics72 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        descriptiveStatistics72.setWindowSize((int) ' ');
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics75 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic76 = descriptiveStatistics75.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics77 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic78 = descriptiveStatistics77.getSumsqImpl();
        descriptiveStatistics75.setKurtosisImpl(univariateStatistic78);
        descriptiveStatistics75.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic81 = descriptiveStatistics75.getSkewnessImpl();
        descriptiveStatistics72.setSumsqImpl(univariateStatistic81);
        descriptiveStatistics58.setMeanImpl(univariateStatistic81);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics85 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double86 = descriptiveStatistics85.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic87 = descriptiveStatistics85.getGeometricMeanImpl();
        descriptiveStatistics58.setMinImpl(univariateStatistic87);
        descriptiveStatistics36.setSkewnessImpl(univariateStatistic87);
        descriptiveStatistics0.setMaxImpl(univariateStatistic87);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics91 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic92 = descriptiveStatistics91.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics93 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic94 = descriptiveStatistics93.getSumsqImpl();
        descriptiveStatistics91.setKurtosisImpl(univariateStatistic94);
        descriptiveStatistics91.clear();
        long long97 = descriptiveStatistics91.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic98 = descriptiveStatistics91.getSumsqImpl();
        double double99 = descriptiveStatistics0.apply(univariateStatistic98);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(descriptiveStatistics5);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(univariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(descriptiveStatistics22);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(univariateStatistic32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str34, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(descriptiveStatistics36);
        org.junit.Assert.assertNotNull(univariateStatistic37);
        org.junit.Assert.assertNotNull(descriptiveStatistics38);
        org.junit.Assert.assertNotNull(univariateStatistic39);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(descriptiveStatistics50);
        org.junit.Assert.assertNotNull(univariateStatistic51);
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(descriptiveStatistics58);
        org.junit.Assert.assertNotNull(descriptiveStatistics59);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertNotNull(descriptiveStatistics61);
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertNotNull(univariateStatistic64);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2.0d + "'", double69 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics75);
        org.junit.Assert.assertNotNull(univariateStatistic76);
        org.junit.Assert.assertNotNull(descriptiveStatistics77);
        org.junit.Assert.assertNotNull(univariateStatistic78);
        org.junit.Assert.assertNotNull(univariateStatistic81);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(univariateStatistic87);
        org.junit.Assert.assertNotNull(descriptiveStatistics91);
        org.junit.Assert.assertNotNull(univariateStatistic92);
        org.junit.Assert.assertNotNull(descriptiveStatistics93);
        org.junit.Assert.assertNotNull(univariateStatistic94);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic98);
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str1 = descriptiveStatistics0.toString();
        descriptiveStatistics0.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic3 = descriptiveStatistics0.getGeometricMeanImpl();
        double double4 = descriptiveStatistics0.getMax();
        double double5 = descriptiveStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics7 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic8 = descriptiveStatistics7.getKurtosisImpl();
        descriptiveStatistics0.setVarianceImpl(univariateStatistic8);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics0.getSkewnessImpl();
        double[] doubleArray11 = descriptiveStatistics0.getValues();
        descriptiveStatistics0.addValue((double) 91);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic15 = descriptiveStatistics14.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic16 = descriptiveStatistics14.getKurtosisImpl();
        long long17 = descriptiveStatistics14.getN();
        double[] doubleArray18 = descriptiveStatistics14.getValues();
        double double19 = descriptiveStatistics14.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics21 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double22 = descriptiveStatistics21.getStandardDeviation();
        long long23 = descriptiveStatistics21.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics21.getKurtosisImpl();
        descriptiveStatistics14.setSumImpl(univariateStatistic24);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic26 = descriptiveStatistics14.getMaxImpl();
        double double27 = descriptiveStatistics14.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic28 = descriptiveStatistics14.getMaxImpl();
        descriptiveStatistics0.setGeometricMeanImpl(univariateStatistic28);
        descriptiveStatistics0.addValue(5.4999999999999964d);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str1, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(univariateStatistic8);
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics14);
        org.junit.Assert.assertNotNull(univariateStatistic15);
        org.junit.Assert.assertNotNull(univariateStatistic16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(univariateStatistic26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(univariateStatistic28);
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getNumElements();
        int int5 = resizableDoubleArray0.getExpansionMode();
        int int6 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 2.5f);
        float float9 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement(3940225.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 2.5]");
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double2 = descriptiveStatistics1.getStandardDeviation();
        long long3 = descriptiveStatistics1.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics1.getSkewnessImpl();
        java.lang.String str5 = descriptiveStatistics1.toString();
        descriptiveStatistics1.addValue(2.0d);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics9 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 100);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic10 = descriptiveStatistics9.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics11 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic12 = descriptiveStatistics11.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics13 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic14 = descriptiveStatistics13.getSumsqImpl();
        descriptiveStatistics11.setKurtosisImpl(univariateStatistic14);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics16 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic17 = descriptiveStatistics16.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics18 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic19 = descriptiveStatistics18.getSumsqImpl();
        descriptiveStatistics16.setKurtosisImpl(univariateStatistic19);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic21 = descriptiveStatistics16.getKurtosisImpl();
        descriptiveStatistics11.setMaxImpl(univariateStatistic21);
        double double23 = descriptiveStatistics11.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic24 = descriptiveStatistics11.getMinImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic25 = descriptiveStatistics11.getVarianceImpl();
        descriptiveStatistics9.setMinImpl(univariateStatistic25);
        descriptiveStatistics1.setSumsqImpl(univariateStatistic25);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics28 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics28.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic30 = descriptiveStatistics28.getKurtosisImpl();
        long long31 = descriptiveStatistics28.getN();
        double[] doubleArray32 = descriptiveStatistics28.getValues();
        int int33 = descriptiveStatistics28.getWindowSize();
        double double34 = descriptiveStatistics28.getMax();
        double[] doubleArray35 = descriptiveStatistics28.getSortedValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics37 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) 10);
        double double38 = descriptiveStatistics37.getStandardDeviation();
        double[] doubleArray39 = descriptiveStatistics37.getValues();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic41 = descriptiveStatistics40.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics42 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics42.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic44 = descriptiveStatistics42.getKurtosisImpl();
        long long45 = descriptiveStatistics42.getN();
        double[] doubleArray46 = descriptiveStatistics42.getValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic47 = descriptiveStatistics42.getSumImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic48 = descriptiveStatistics42.getMinImpl();
        double double49 = descriptiveStatistics40.apply(univariateStatistic48);
        descriptiveStatistics37.setSumsqImpl(univariateStatistic48);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics51 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic52 = descriptiveStatistics51.getSumsqImpl();
        double double53 = descriptiveStatistics51.getVariance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic54 = descriptiveStatistics51.getMinImpl();
        descriptiveStatistics37.setSkewnessImpl(univariateStatistic54);
        descriptiveStatistics28.setSkewnessImpl(univariateStatistic54);
        descriptiveStatistics1.setMinImpl(univariateStatistic54);
        java.lang.String str58 = descriptiveStatistics1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str5, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic10);
        org.junit.Assert.assertNotNull(descriptiveStatistics11);
        org.junit.Assert.assertNotNull(univariateStatistic12);
        org.junit.Assert.assertNotNull(descriptiveStatistics13);
        org.junit.Assert.assertNotNull(univariateStatistic14);
        org.junit.Assert.assertNotNull(descriptiveStatistics16);
        org.junit.Assert.assertNotNull(univariateStatistic17);
        org.junit.Assert.assertNotNull(descriptiveStatistics18);
        org.junit.Assert.assertNotNull(univariateStatistic19);
        org.junit.Assert.assertNotNull(univariateStatistic21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(univariateStatistic24);
        org.junit.Assert.assertNotNull(univariateStatistic25);
        org.junit.Assert.assertNotNull(descriptiveStatistics28);
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertNotNull(univariateStatistic30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertNotNull(univariateStatistic41);
        org.junit.Assert.assertNotNull(descriptiveStatistics42);
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertNotNull(univariateStatistic44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic47);
        org.junit.Assert.assertNotNull(univariateStatistic48);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(descriptiveStatistics51);
        org.junit.Assert.assertNotNull(univariateStatistic52);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(univariateStatistic54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "DescriptiveStatistics:\nn: 1\nmin: 2.0\nmax: 2.0\nmean: 2.0\nstd dev: 0.0\nmedian: 2.0\nskewness: NaN\nkurtosis: NaN\n" + "'", str58, "DescriptiveStatistics:\nn: 1\nmin: 2.0\nmax: 2.0\nmean: 2.0\nstd dev: 0.0\nmedian: 2.0\nskewness: NaN\nkurtosis: NaN\n");
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(0.0d);
        int int4 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray5 = resizableDoubleArray0.getElements();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement(103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 103 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics0 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics1 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic2 = descriptiveStatistics1.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics3 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic4 = descriptiveStatistics3.getSumsqImpl();
        descriptiveStatistics1.setKurtosisImpl(univariateStatistic4);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic6 = descriptiveStatistics1.getKurtosisImpl();
        double[] doubleArray10 = new double[] { (short) 1, (byte) 0, (-1.0f) };
        double double11 = univariateStatistic6.evaluate(doubleArray10);
        descriptiveStatistics0.setMaxImpl(univariateStatistic6);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics14 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        descriptiveStatistics14.setWindowSize((int) ' ');
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics17 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic18 = descriptiveStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics19 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic20 = descriptiveStatistics19.getSumsqImpl();
        descriptiveStatistics17.setKurtosisImpl(univariateStatistic20);
        descriptiveStatistics17.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic23 = descriptiveStatistics17.getSkewnessImpl();
        descriptiveStatistics14.setSumsqImpl(univariateStatistic23);
        descriptiveStatistics0.setMeanImpl(univariateStatistic23);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics27 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (byte) -1);
        double double28 = descriptiveStatistics27.getGeometricMean();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic29 = descriptiveStatistics27.getGeometricMeanImpl();
        descriptiveStatistics0.setMinImpl(univariateStatistic29);
        double double31 = descriptiveStatistics0.getGeometricMean();
        double double32 = descriptiveStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics34 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double35 = descriptiveStatistics34.getStandardDeviation();
        double double36 = descriptiveStatistics34.getVariance();
        double double37 = descriptiveStatistics34.getSum();
        double double39 = descriptiveStatistics34.getPercentile(2.0d);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics40 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        java.lang.String str41 = descriptiveStatistics40.toString();
        descriptiveStatistics40.clear();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic43 = descriptiveStatistics40.getGeometricMeanImpl();
        double double44 = descriptiveStatistics40.getMax();
        double[] doubleArray45 = descriptiveStatistics40.getSortedValues();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic46 = descriptiveStatistics40.getMaxImpl();
        double double47 = descriptiveStatistics34.apply(univariateStatistic46);
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics48 = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic49 = descriptiveStatistics48.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic50 = descriptiveStatistics48.getKurtosisImpl();
        long long51 = descriptiveStatistics48.getN();
        double[] doubleArray52 = descriptiveStatistics48.getValues();
        double double53 = descriptiveStatistics48.getMax();
        org.apache.commons.math.stat.descriptive.DescriptiveStatistics descriptiveStatistics55 = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics((int) (short) -1);
        double double56 = descriptiveStatistics55.getStandardDeviation();
        long long57 = descriptiveStatistics55.getN();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic58 = descriptiveStatistics55.getKurtosisImpl();
        descriptiveStatistics48.setSumImpl(univariateStatistic58);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic60 = descriptiveStatistics48.getMaxImpl();
        descriptiveStatistics34.setVarianceImpl(univariateStatistic60);
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic62 = descriptiveStatistics34.getMaxImpl();
        double double63 = descriptiveStatistics34.getSkewness();
        org.apache.commons.math.stat.descriptive.UnivariateStatistic univariateStatistic64 = descriptiveStatistics34.getSumsqImpl();
        descriptiveStatistics0.setMinImpl(univariateStatistic64);
        org.junit.Assert.assertNotNull(descriptiveStatistics0);
        org.junit.Assert.assertNotNull(descriptiveStatistics1);
        org.junit.Assert.assertNotNull(univariateStatistic2);
        org.junit.Assert.assertNotNull(descriptiveStatistics3);
        org.junit.Assert.assertNotNull(univariateStatistic4);
        org.junit.Assert.assertNotNull(univariateStatistic6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(descriptiveStatistics17);
        org.junit.Assert.assertNotNull(univariateStatistic18);
        org.junit.Assert.assertNotNull(descriptiveStatistics19);
        org.junit.Assert.assertNotNull(univariateStatistic20);
        org.junit.Assert.assertNotNull(univariateStatistic23);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(univariateStatistic29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(descriptiveStatistics40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n" + "'", str41, "DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n");
        org.junit.Assert.assertNotNull(univariateStatistic43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(univariateStatistic46);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(descriptiveStatistics48);
        org.junit.Assert.assertNotNull(univariateStatistic49);
        org.junit.Assert.assertNotNull(univariateStatistic50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(univariateStatistic58);
        org.junit.Assert.assertNotNull(univariateStatistic60);
        org.junit.Assert.assertNotNull(univariateStatistic62);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(univariateStatistic64);
    }
}

