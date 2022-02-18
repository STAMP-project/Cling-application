import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max16 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long17 = max16.getN();
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max16);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = summaryStatistics0.getSumImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic20);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        double double6 = summaryStatistics0.getSum();
        double double7 = summaryStatistics0.getSumsq();
        double double8 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean9.increment((-42.0d));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(9.619275968248924E151d);
        double double3 = sumOfSquares0.getResult();
        double[] doubleArray5 = new double[] { 1.0d };
        sumOfSquares0.incrementAll(doubleArray5);
        long long7 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        long long9 = sumOfSquares0.getN();
        double double10 = sumOfSquares0.getResult();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.253047015333127E303d + "'", double3 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        secondMoment0.increment((double) (-231965898L));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Min min3 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min3.increment(0.0d);
        min3.increment(0.0d);
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean10 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment9);
        org.apache.commons.math.stat.descriptive.summary.Sum sum11 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray18 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double19 = sum11.evaluate(doubleArray18);
        double[] doubleArray26 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double29 = sum11.evaluate(doubleArray26, 0, 0);
        double double32 = mean10.evaluate(doubleArray26, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance33.clear();
        double double35 = variance33.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs38 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean39 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs38);
        org.apache.commons.math.stat.descriptive.rank.Max max40 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long41 = max40.getN();
        geometricMean39.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max40);
        org.apache.commons.math.stat.descriptive.summary.Sum sum43 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray50 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double51 = sum43.evaluate(doubleArray50);
        geometricMean39.incrementAll(doubleArray50);
        double double53 = max36.evaluate(doubleArray50);
        double double54 = variance33.evaluate(doubleArray50);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean56 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment55);
        org.apache.commons.math.stat.descriptive.summary.Sum sum57 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray64 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double65 = sum57.evaluate(doubleArray64);
        double[] doubleArray72 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double75 = sum57.evaluate(doubleArray72, 0, 0);
        double double78 = mean56.evaluate(doubleArray72, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs79 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean80 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs79);
        org.apache.commons.math.stat.descriptive.rank.Max max81 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long82 = max81.getN();
        geometricMean80.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max81);
        org.apache.commons.math.stat.descriptive.summary.Sum sum84 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray91 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double92 = sum84.evaluate(doubleArray91);
        geometricMean80.incrementAll(doubleArray91);
        boolean boolean94 = org.apache.commons.math.util.MathUtils.equals(doubleArray72, doubleArray91);
        double double95 = variance33.evaluate(doubleArray91);
        boolean boolean96 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray91);
        geometricMean2.incrementAll(doubleArray26);
        long long98 = geometricMean2.getN();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 310.0d + "'", double19 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 310.0d + "'", double51 == 310.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2817.0666666666666d + "'", double54 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 310.0d + "'", double65 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 310.0d + "'", double92 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 2817.0666666666666d + "'", double95 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 8L + "'", long98 == 8L);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        sumOfSquares0.increment(11013.232920103324d);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs5);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares7 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares7.increment(9.619275968248924E151d);
        double double10 = sumOfSquares7.getResult();
        double[] doubleArray12 = new double[] { 1.0d };
        sumOfSquares7.incrementAll(doubleArray12);
        sumOfLogs5.incrementAll(doubleArray12);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum20 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum20.clear();
        summaryStatistics19.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum20);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics19.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics24.getMeanImpl();
        double double26 = summaryStatistics24.getSum();
        double double27 = summaryStatistics24.getGeometricMean();
        double double28 = summaryStatistics24.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics24.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = summaryStatistics24.getSumImpl();
        summaryStatistics19.setSumImpl(storelessUnivariateStatistic30);
        boolean boolean32 = variance18.equals((java.lang.Object) summaryStatistics19);
        double double33 = variance18.getResult();
        variance18.increment((double) 100L);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs38 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean39 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs38);
        org.apache.commons.math.stat.descriptive.rank.Max max40 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long41 = max40.getN();
        geometricMean39.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max40);
        org.apache.commons.math.stat.descriptive.summary.Sum sum43 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray50 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double51 = sum43.evaluate(doubleArray50);
        geometricMean39.incrementAll(doubleArray50);
        double double53 = max36.evaluate(doubleArray50);
        double double54 = variance18.evaluate(doubleArray50);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray50);
        // The following exception was thrown during execution in test generation
        try {
            double double58 = sumOfSquares0.evaluate(doubleArray12, 1072693279, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.253047015333127E303d + "'", double10 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1072693279 + "'", int15 == 1072693279);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1072693279 + "'", int16 == 1072693279);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic29);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 310.0d + "'", double51 == 310.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2817.0666666666666d + "'", double54 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs3 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean4 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment5);
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray14 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double15 = sum7.evaluate(doubleArray14);
        double[] doubleArray22 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double25 = sum7.evaluate(doubleArray22, 0, 0);
        double double28 = mean6.evaluate(doubleArray22, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance29.clear();
        double double31 = variance29.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max32 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long33 = max32.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs34);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max36);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray46 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double47 = sum39.evaluate(doubleArray46);
        geometricMean35.incrementAll(doubleArray46);
        double double49 = max32.evaluate(doubleArray46);
        double double50 = variance29.evaluate(doubleArray46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean52 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment51);
        org.apache.commons.math.stat.descriptive.summary.Sum sum53 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray60 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double61 = sum53.evaluate(doubleArray60);
        double[] doubleArray68 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double71 = sum53.evaluate(doubleArray68, 0, 0);
        double double74 = mean52.evaluate(doubleArray68, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs75 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean76 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs75);
        org.apache.commons.math.stat.descriptive.rank.Max max77 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long78 = max77.getN();
        geometricMean76.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max77);
        org.apache.commons.math.stat.descriptive.summary.Sum sum80 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray87 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double88 = sum80.evaluate(doubleArray87);
        geometricMean76.incrementAll(doubleArray87);
        boolean boolean90 = org.apache.commons.math.util.MathUtils.equals(doubleArray68, doubleArray87);
        double double91 = variance29.evaluate(doubleArray87);
        boolean boolean92 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray87);
        double double93 = sumOfLogs3.evaluate(doubleArray87);
        mean1.incrementAll(doubleArray87);
        long long95 = mean1.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 310.0d + "'", double15 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 310.0d + "'", double47 == 310.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2817.0666666666666d + "'", double50 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 310.0d + "'", double61 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 310.0d + "'", double88 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 2817.0666666666666d + "'", double91 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        long long12 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getMin();
        double double11 = summaryStatistics0.getVariance();
        summaryStatistics0.clear();
        boolean boolean14 = summaryStatistics0.equals((java.lang.Object) 0.0f);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMaxImpl();
        double double16 = summaryStatistics0.getMin();
        double double17 = summaryStatistics0.getGeometricMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1078558720, 1072693269, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1071382528));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        sumOfSquares0.increment(11013.232920103324d);
        sumOfSquares0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        int int1 = org.apache.commons.math.util.MathUtils.hash(2.7674309681687084d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1728584535) + "'", int1 == (-1728584535));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        double double1 = max0.getResult();
        max0.clear();
        max0.increment((double) (byte) 10);
        long long5 = max0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long9 = secondMoment8.getN();
        secondMoment8.increment((double) (-1));
        summaryStatistics6.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment8);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean14 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment13);
        double double15 = mean14.getResult();
        mean14.clear();
        summaryStatistics6.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean14);
        org.apache.commons.math.stat.descriptive.summary.Sum sum18 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray25 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double26 = sum18.evaluate(doubleArray25);
        double[] doubleArray33 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double36 = sum18.evaluate(doubleArray33, 0, 0);
        int int37 = org.apache.commons.math.util.MathUtils.hash(doubleArray33);
        double double40 = mean14.evaluate(doubleArray33, 0, (int) (short) 0);
        max0.incrementAll(doubleArray33, 1104152832, 1104152832);
        long long44 = max0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 310.0d + "'", double26 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2050442118 + "'", int37 == 2050442118);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 121457019200L, (double) 2601);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2145701919999998E11d + "'", double2 == 1.2145701919999998E11d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.summary.Sum sum17 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray24 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double25 = sum17.evaluate(doubleArray24);
        double[] doubleArray32 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double35 = sum17.evaluate(doubleArray32, 0, 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum36 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray43 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double44 = sum36.evaluate(doubleArray43);
        double[] doubleArray51 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double54 = sum36.evaluate(doubleArray51, 0, 0);
        int int55 = org.apache.commons.math.util.MathUtils.hash(doubleArray51);
        double double58 = sum17.evaluate(doubleArray51, (int) (byte) 0, (int) (short) 1);
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum17);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics60 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic61 = summaryStatistics60.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment62 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long63 = secondMoment62.getN();
        secondMoment62.increment((double) (-1));
        summaryStatistics60.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment62);
        org.apache.commons.math.stat.descriptive.moment.Variance variance67 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment62);
        org.apache.commons.math.stat.descriptive.summary.Sum sum68 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray75 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double76 = sum68.evaluate(doubleArray75);
        double[] doubleArray83 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double86 = sum68.evaluate(doubleArray83, 0, 0);
        int int87 = org.apache.commons.math.util.MathUtils.hash(doubleArray83);
        double double88 = variance67.evaluate(doubleArray83);
        boolean boolean90 = variance67.equals((java.lang.Object) 990);
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance67);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 310.0d + "'", double25 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 310.0d + "'", double44 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2050442118 + "'", int55 == 2050442118);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 310.0d + "'", double76 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2050442118 + "'", int87 == 2050442118);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 14635.2d + "'", double88 == 14635.2d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long6 = sum5.getN();
        sum5.increment(35.0d);
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        long long10 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics11.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long14 = secondMoment13.getN();
        secondMoment13.increment((double) (-1));
        summaryStatistics11.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment13);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean19 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment18);
        double double20 = mean19.getResult();
        mean19.clear();
        summaryStatistics11.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean19);
        org.apache.commons.math.stat.descriptive.rank.Max max23 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long24 = max23.getN();
        summaryStatistics11.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max23);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max23);
        long long27 = max23.getN();
        max23.increment(1.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMax();
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics5.getMeanImpl();
        summaryStatistics5.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics8.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance15.clear();
        summaryStatistics8.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        summaryStatistics5.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        variance15.clear();
        variance15.clear();
        boolean boolean21 = variance15.isBiasCorrected();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        boolean boolean23 = variance15.isBiasCorrected();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        long long3 = sumOfLogs0.getN();
        sumOfLogs0.increment(3.7108092200000006E8d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double7 = secondMoment6.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max8 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long9 = max8.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs10 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs10);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        geometricMean11.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray22 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double23 = sum15.evaluate(doubleArray22);
        geometricMean11.incrementAll(doubleArray22);
        double double25 = max8.evaluate(doubleArray22);
        secondMoment6.incrementAll(doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = sumOfLogs0.evaluate(doubleArray22, (-231965925), 290);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 310.0d + "'", double23 == 310.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        double double7 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMaxImpl();
        double double9 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int int1 = org.apache.commons.math.util.MathUtils.hash(1.730777995336729E7d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2117107591 + "'", int1 == 2117107591);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1635884154, (-35));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getSumsqImpl();
        double double16 = summaryStatistics0.getMax();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        double double6 = summaryStatistics0.getSum();
        double double7 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum2 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum2.clear();
        summaryStatistics1.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum2);
        long long5 = summaryStatistics1.getN();
        java.lang.String str6 = summaryStatistics1.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long8 = variance7.getN();
        summaryStatistics1.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance7);
        double double10 = summaryStatistics1.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long12 = secondMoment11.getN();
        secondMoment11.increment((double) (-1));
        summaryStatistics1.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment11);
        geometricMean0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment11);
        secondMoment11.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean18 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment11);
        mean18.increment(7.930067261567154E14d);
        mean18.increment((double) 33L);
        double double23 = mean18.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str6, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMean();
        double double4 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMinImpl();
        long long6 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        org.apache.commons.math.stat.descriptive.rank.Max max9 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long10 = max9.getN();
        geometricMean8.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max9);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean12 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean12.increment((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean16 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment15);
        mean16.clear();
        double[] doubleArray23 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean16.incrementAll(doubleArray23, (int) (short) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum27 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray34 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double35 = sum27.evaluate(doubleArray34);
        double[] doubleArray42 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double45 = sum27.evaluate(doubleArray42, 0, 0);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray42);
        double double49 = geometricMean12.evaluate(doubleArray23, 0, (int) (short) 1);
        boolean boolean51 = geometricMean12.equals((java.lang.Object) (-368574463));
        double double52 = geometricMean12.getResult();
        boolean boolean53 = max9.equals((java.lang.Object) geometricMean12);
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean12);
        double double55 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary56 = summaryStatistics0.getSummary();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 310.0d + "'", double35 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2.0d + "'", double49 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.000000000000002d + "'", double52 == 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(statisticalSummary56);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(statisticalSummary6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getMeanImpl();
        java.lang.String str18 = summaryStatistics0.toString();
        double double19 = summaryStatistics0.getSumOfLogs();
        double double20 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str18, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMeanImpl();
        double double16 = summaryStatistics0.getVariance();
        double double17 = summaryStatistics0.getMean();
        double double18 = summaryStatistics0.getVariance();
        long long19 = summaryStatistics0.getN();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (short) 100, (long) 3190);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 319000L + "'", long2 == 319000L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 971883398);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMeanImpl();
        double double16 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.summary.Sum sum17 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum17.clear();
        sum17.clear();
        double double20 = sum17.getResult();
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum17);
        double double22 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max17 = new org.apache.commons.math.stat.descriptive.rank.Max();
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max17);
        double double19 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getVarianceImpl();
        double double10 = summaryStatistics0.getVariance();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        double[] doubleArray15 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double18 = sum0.evaluate(doubleArray15, 0, 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum19 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray26 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double27 = sum19.evaluate(doubleArray26);
        double[] doubleArray34 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double37 = sum19.evaluate(doubleArray34, 0, 0);
        int int38 = org.apache.commons.math.util.MathUtils.hash(doubleArray34);
        double double41 = sum0.evaluate(doubleArray34, (int) (byte) 0, (int) (short) 1);
        sum0.increment(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 310.0d + "'", double27 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2050442118 + "'", int38 == 2050442118);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getVariance();
        double double3 = summaryStatistics0.getSumsq();
        double double4 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getMin();
        double double11 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary12 = summaryStatistics0.getSummary();
        double double13 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(statisticalSummary12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        double double1 = max0.getResult();
        max0.clear();
        max0.increment((double) (byte) 10);
        long long5 = max0.getN();
        max0.increment(8.065817517094494E67d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance8.clear();
        double double10 = variance8.getResult();
        long long11 = variance8.getN();
        variance8.increment((double) 35);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs14 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean15 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs14);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares16.increment(9.619275968248924E151d);
        double double19 = sumOfSquares16.getResult();
        double[] doubleArray21 = new double[] { 1.0d };
        sumOfSquares16.incrementAll(doubleArray21);
        sumOfLogs14.incrementAll(doubleArray21);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        int int25 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double double26 = variance8.evaluate(doubleArray21);
        max0.incrementAll(doubleArray21);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9.253047015333127E303d + "'", double19 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1072693279 + "'", int24 == 1072693279);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1072693279 + "'", int25 == 1072693279);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-888836577));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long6 = sum5.getN();
        sum5.increment(35.0d);
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        long long10 = sum5.getN();
        long long11 = sum5.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics12.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = summaryStatistics12.getSummary();
        double double15 = summaryStatistics12.getSum();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs16 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean17 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs16);
        org.apache.commons.math.stat.descriptive.rank.Max max18 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long19 = max18.getN();
        geometricMean17.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max18);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = geometricMean17.getSumLogImpl();
        geometricMean17.clear();
        geometricMean17.clear();
        summaryStatistics12.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean17);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs25 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean26 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs25);
        org.apache.commons.math.stat.descriptive.rank.Max max27 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long28 = max27.getN();
        geometricMean26.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max27);
        long long30 = geometricMean26.getN();
        geometricMean26.increment((double) 3190);
        summaryStatistics12.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean26);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance35.clear();
        long long37 = variance35.getN();
        variance35.increment((double) 110L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean41 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment40);
        mean41.clear();
        mean41.increment(30.482323362278656d);
        double double45 = mean41.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance47.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean51 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment50);
        mean51.clear();
        double[] doubleArray58 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean51.incrementAll(doubleArray58, (int) (short) 1, (int) (byte) 0);
        double double62 = variance47.evaluate(doubleArray58);
        mean41.incrementAll(doubleArray58);
        variance35.incrementAll(doubleArray58);
        double double65 = geometricMean26.evaluate(doubleArray58);
        // The following exception was thrown during execution in test generation
        try {
            double double68 = sum5.evaluate(doubleArray58, 927863700, 1104152832);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertNotNull(statisticalSummary14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic21);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2806.7d + "'", double62 == 2806.7d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 5.925821078368351E8d + "'", double65 == 5.925821078368351E8d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        sum0.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment5);
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray14 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double15 = sum7.evaluate(doubleArray14);
        double[] doubleArray22 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double25 = sum7.evaluate(doubleArray22, 0, 0);
        double double28 = mean6.evaluate(doubleArray22, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs29 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean30 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs29);
        org.apache.commons.math.stat.descriptive.rank.Max max31 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long32 = max31.getN();
        geometricMean30.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max31);
        org.apache.commons.math.stat.descriptive.summary.Sum sum34 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray41 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double42 = sum34.evaluate(doubleArray41);
        geometricMean30.incrementAll(doubleArray41);
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray41);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean46 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment45);
        org.apache.commons.math.stat.descriptive.summary.Sum sum47 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray54 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double55 = sum47.evaluate(doubleArray54);
        double[] doubleArray62 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double65 = sum47.evaluate(doubleArray62, 0, 0);
        double double68 = mean46.evaluate(doubleArray62, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs69 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean70 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs69);
        org.apache.commons.math.stat.descriptive.rank.Max max71 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long72 = max71.getN();
        geometricMean70.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max71);
        org.apache.commons.math.stat.descriptive.summary.Sum sum74 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray81 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double82 = sum74.evaluate(doubleArray81);
        geometricMean70.incrementAll(doubleArray81);
        boolean boolean84 = org.apache.commons.math.util.MathUtils.equals(doubleArray62, doubleArray81);
        boolean boolean85 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray62);
        sum0.incrementAll(doubleArray62);
        sum0.clear();
        long long88 = sum0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 310.0d + "'", double15 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 310.0d + "'", double42 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 310.0d + "'", double55 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 310.0d + "'", double82 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        double double1 = max0.getResult();
        max0.clear();
        max0.clear();
        max0.clear();
        max0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Mean mean10 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        secondMoment7.increment((double) 1076101120);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean15 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment14);
        mean15.clear();
        double[] doubleArray22 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean15.incrementAll(doubleArray22, (int) (short) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum26 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray33 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double34 = sum26.evaluate(doubleArray33);
        double[] doubleArray41 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double44 = sum26.evaluate(doubleArray41, 0, 0);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray41);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic47 = summaryStatistics46.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long49 = secondMoment48.getN();
        secondMoment48.increment((double) (-1));
        summaryStatistics46.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment48);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment53 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean54 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment53);
        double double55 = mean54.getResult();
        mean54.clear();
        summaryStatistics46.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean54);
        org.apache.commons.math.stat.descriptive.summary.Sum sum58 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray65 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double66 = sum58.evaluate(doubleArray65);
        double[] doubleArray73 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double76 = sum58.evaluate(doubleArray73, 0, 0);
        int int77 = org.apache.commons.math.util.MathUtils.hash(doubleArray73);
        double double80 = mean54.evaluate(doubleArray73, 0, (int) (short) 0);
        boolean boolean81 = org.apache.commons.math.util.MathUtils.equals(doubleArray41, doubleArray73);
        double double83 = variance13.evaluate(doubleArray41, (double) 101L);
        // The following exception was thrown during execution in test generation
        try {
            double double86 = max0.evaluate(doubleArray41, (-51), 1072693269);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 310.0d + "'", double34 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 310.0d + "'", double66 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2050442118 + "'", int77 == 2050442118);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 12196.0d + "'", double83 == 12196.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max16 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long17 = max16.getN();
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max16);
        double double19 = summaryStatistics0.getMean();
        long long20 = summaryStatistics0.getN();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        mean1.clear();
        double double4 = mean1.getResult();
        mean1.increment(0.0d);
        long long7 = mean1.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares3 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares3.increment(9.619275968248924E151d);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares3);
        sumOfSquares3.increment((double) 1076101120);
        long long9 = sumOfSquares3.getN();
        long long10 = sumOfSquares3.getN();
        sumOfSquares3.clear();
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = sumOfSquares3.evaluate(doubleArray12, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(3.7108092200000006E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 971883398, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32072152134L + "'", long2 == 32072152134L);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 0L, (double) (-231965898L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.increment(0.0d);
        min0.increment(0.0d);
        min0.increment(441.4701300810326d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(927863700, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 927863665 + "'", int2 == 927863665);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum6);
        double double16 = summaryStatistics0.getMean();
        double double17 = summaryStatistics0.getMax();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics3.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long6 = secondMoment5.getN();
        secondMoment5.increment((double) (-1));
        summaryStatistics3.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment5);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        double double12 = mean11.getResult();
        mean11.clear();
        summaryStatistics3.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean11);
        double double15 = summaryStatistics3.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum16.clear();
        sum16.clear();
        summaryStatistics3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum16);
        long long20 = sum16.getN();
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum16);
        java.lang.String str22 = summaryStatistics0.toString();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str22, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        double double1 = min0.getResult();
        min0.increment(310.0d);
        min0.increment(0.0d);
        long long6 = min0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(9.619275968248924E151d);
        long long3 = sumOfSquares0.getN();
        long long4 = sumOfSquares0.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1635884154);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares2 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares2.increment(9.619275968248924E151d);
        double double5 = sumOfSquares2.getResult();
        double[] doubleArray7 = new double[] { 1.0d };
        sumOfSquares2.incrementAll(doubleArray7);
        sumOfLogs0.incrementAll(doubleArray7);
        sumOfLogs0.increment((double) (-1));
        sumOfLogs0.clear();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean13 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        geometricMean13.increment((double) 110L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.253047015333127E303d + "'", double5 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getMin();
        double double11 = summaryStatistics0.getVariance();
        summaryStatistics0.clear();
        boolean boolean14 = summaryStatistics0.equals((java.lang.Object) 0.0f);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMaxImpl();
        double double16 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean18 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment17);
        mean18.clear();
        mean18.increment(30.482323362278656d);
        mean18.clear();
        boolean boolean23 = summaryStatistics0.equals((java.lang.Object) mean18);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-27L), 32072152134L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-865948107618L) + "'", long2 == (-865948107618L));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(9.619275968248924E151d);
        double double3 = sumOfSquares0.getResult();
        double[] doubleArray5 = new double[] { 1.0d };
        sumOfSquares0.incrementAll(doubleArray5);
        double double7 = sumOfSquares0.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares8 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares8.increment(9.619275968248924E151d);
        double double11 = sumOfSquares8.getResult();
        double[] doubleArray13 = new double[] { 1.0d };
        sumOfSquares8.incrementAll(doubleArray13);
        long long15 = sumOfSquares8.getN();
        sumOfSquares8.clear();
        long long17 = sumOfSquares8.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs18 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean19 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs18);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares20 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares20.increment(9.619275968248924E151d);
        double double23 = sumOfSquares20.getResult();
        double[] doubleArray25 = new double[] { 1.0d };
        sumOfSquares20.incrementAll(doubleArray25);
        sumOfLogs18.incrementAll(doubleArray25);
        sumOfSquares8.incrementAll(doubleArray25);
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = sumOfSquares0.evaluate(doubleArray25, 1072693279, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.253047015333127E303d + "'", double3 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.253047015333127E303d + "'", double7 == 9.253047015333127E303d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.253047015333127E303d + "'", double11 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 9.253047015333127E303d + "'", double23 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1072693279 + "'", int29 == 1072693279);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 0L, 52.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean(firstMoment0);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        double double6 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance9);
        variance9.clear();
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max12.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean16 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment15);
        org.apache.commons.math.stat.descriptive.summary.Sum sum17 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray24 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double25 = sum17.evaluate(doubleArray24);
        double[] doubleArray32 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double35 = sum17.evaluate(doubleArray32, 0, 0);
        double double38 = mean16.evaluate(doubleArray32, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs39 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean40 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs39);
        org.apache.commons.math.stat.descriptive.rank.Max max41 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long42 = max41.getN();
        geometricMean40.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max41);
        org.apache.commons.math.stat.descriptive.summary.Sum sum44 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray51 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double52 = sum44.evaluate(doubleArray51);
        geometricMean40.incrementAll(doubleArray51);
        boolean boolean54 = org.apache.commons.math.util.MathUtils.equals(doubleArray32, doubleArray51);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean56 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment55);
        org.apache.commons.math.stat.descriptive.summary.Sum sum57 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray64 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double65 = sum57.evaluate(doubleArray64);
        double[] doubleArray72 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double75 = sum57.evaluate(doubleArray72, 0, 0);
        double double78 = mean56.evaluate(doubleArray72, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs79 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean80 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs79);
        org.apache.commons.math.stat.descriptive.rank.Max max81 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long82 = max81.getN();
        geometricMean80.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max81);
        org.apache.commons.math.stat.descriptive.summary.Sum sum84 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray91 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double92 = sum84.evaluate(doubleArray91);
        geometricMean80.incrementAll(doubleArray91);
        boolean boolean94 = org.apache.commons.math.util.MathUtils.equals(doubleArray72, doubleArray91);
        boolean boolean95 = org.apache.commons.math.util.MathUtils.equals(doubleArray32, doubleArray72);
        double double96 = max12.evaluate(doubleArray72);
        // The following exception was thrown during execution in test generation
        try {
            variance9.incrementAll(doubleArray72, 100, 990);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 310.0d + "'", double25 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 310.0d + "'", double52 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 310.0d + "'", double65 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 310.0d + "'", double92 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 310.0d + "'", double96 == 310.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(145, 1072693283);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long9 = secondMoment8.getN();
        secondMoment8.increment((double) (-1));
        summaryStatistics6.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment8);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean14 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment13);
        double double15 = mean14.getResult();
        mean14.clear();
        summaryStatistics6.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean14);
        double double18 = summaryStatistics6.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics6.getGeoMeanImpl();
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic19);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics21.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics21.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean26 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment25);
        mean26.clear();
        mean26.increment(30.482323362278656d);
        summaryStatistics21.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean26);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = summaryStatistics21.getGeoMeanImpl();
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic31);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic24);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic31);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Min min3 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min3.increment(0.0d);
        min3.increment(0.0d);
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean10 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment9);
        org.apache.commons.math.stat.descriptive.summary.Sum sum11 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray18 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double19 = sum11.evaluate(doubleArray18);
        double[] doubleArray26 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double29 = sum11.evaluate(doubleArray26, 0, 0);
        double double32 = mean10.evaluate(doubleArray26, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance33.clear();
        double double35 = variance33.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs38 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean39 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs38);
        org.apache.commons.math.stat.descriptive.rank.Max max40 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long41 = max40.getN();
        geometricMean39.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max40);
        org.apache.commons.math.stat.descriptive.summary.Sum sum43 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray50 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double51 = sum43.evaluate(doubleArray50);
        geometricMean39.incrementAll(doubleArray50);
        double double53 = max36.evaluate(doubleArray50);
        double double54 = variance33.evaluate(doubleArray50);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean56 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment55);
        org.apache.commons.math.stat.descriptive.summary.Sum sum57 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray64 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double65 = sum57.evaluate(doubleArray64);
        double[] doubleArray72 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double75 = sum57.evaluate(doubleArray72, 0, 0);
        double double78 = mean56.evaluate(doubleArray72, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs79 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean80 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs79);
        org.apache.commons.math.stat.descriptive.rank.Max max81 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long82 = max81.getN();
        geometricMean80.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max81);
        org.apache.commons.math.stat.descriptive.summary.Sum sum84 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray91 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double92 = sum84.evaluate(doubleArray91);
        geometricMean80.incrementAll(doubleArray91);
        boolean boolean94 = org.apache.commons.math.util.MathUtils.equals(doubleArray72, doubleArray91);
        double double95 = variance33.evaluate(doubleArray91);
        boolean boolean96 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray91);
        geometricMean2.incrementAll(doubleArray26);
        geometricMean2.increment(1.5430806348152437d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 310.0d + "'", double19 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 310.0d + "'", double51 == 310.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2817.0666666666666d + "'", double54 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 310.0d + "'", double65 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 310.0d + "'", double92 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 2817.0666666666666d + "'", double95 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long1 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum4.clear();
        summaryStatistics3.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum4);
        long long7 = summaryStatistics3.getN();
        java.lang.String str8 = summaryStatistics3.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long10 = variance9.getN();
        summaryStatistics3.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance9);
        long long12 = variance9.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares13 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares13.increment(9.619275968248924E151d);
        double double16 = sumOfSquares13.getResult();
        double[] doubleArray18 = new double[] { 1.0d };
        sumOfSquares13.incrementAll(doubleArray18);
        double double21 = variance9.evaluate(doubleArray18, 14085.333333333332d);
        double double22 = secondMoment0.evaluate(doubleArray18);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str8, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.253047015333127E303d + "'", double16 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum6);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getSumImpl();
        summaryStatistics0.addValue((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 35L, (double) 87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        double double6 = summaryStatistics0.getMax();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares17 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double18 = sumOfSquares17.getResult();
        double double19 = sumOfSquares17.getResult();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares17);
        double double21 = summaryStatistics0.getSumsq();
        summaryStatistics0.clear();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int int1 = org.apache.commons.math.util.MathUtils.sign(927863665);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long6 = sum5.getN();
        sum5.increment(35.0d);
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        long long10 = sum5.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum11 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray18 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double19 = sum11.evaluate(doubleArray18);
        double[] doubleArray26 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double29 = sum11.evaluate(doubleArray26, 0, 0);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = sum5.evaluate(doubleArray26, 2, 1095479168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 310.0d + "'", double19 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2050442118 + "'", int30 == 2050442118);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance9.clear();
        long long11 = variance9.getN();
        variance9.increment((double) 110L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean15 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment14);
        mean15.clear();
        mean15.increment(30.482323362278656d);
        double double19 = mean15.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance21.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean25 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment24);
        mean25.clear();
        double[] doubleArray32 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean25.incrementAll(doubleArray32, (int) (short) 1, (int) (byte) 0);
        double double36 = variance21.evaluate(doubleArray32);
        mean15.incrementAll(doubleArray32);
        variance9.incrementAll(doubleArray32);
        summaryStatistics0.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance9);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics40 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum41 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum41.clear();
        summaryStatistics40.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum41);
        long long44 = summaryStatistics40.getN();
        double double45 = summaryStatistics40.getSum();
        org.apache.commons.math.stat.descriptive.summary.Sum sum46 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray53 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double54 = sum46.evaluate(doubleArray53);
        summaryStatistics40.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum46);
        long long56 = sum46.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics57 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum58 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum58.clear();
        summaryStatistics57.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum58);
        long long61 = summaryStatistics57.getN();
        java.lang.String str62 = summaryStatistics57.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long64 = variance63.getN();
        summaryStatistics57.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance63);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs66 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean67 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs66);
        org.apache.commons.math.stat.descriptive.rank.Max max68 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long69 = max68.getN();
        geometricMean67.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max68);
        org.apache.commons.math.stat.descriptive.summary.Sum sum71 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray78 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double79 = sum71.evaluate(doubleArray78);
        geometricMean67.incrementAll(doubleArray78);
        int int81 = org.apache.commons.math.util.MathUtils.hash(doubleArray78);
        double double82 = variance63.evaluate(doubleArray78);
        double double83 = sum46.evaluate(doubleArray78);
        double double84 = variance9.evaluate(doubleArray78);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2806.7d + "'", double36 == 2806.7d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 310.0d + "'", double54 == 310.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str62, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 310.0d + "'", double79 == 310.0d);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1635884154) + "'", int81 == (-1635884154));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 2817.0666666666666d + "'", double82 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 310.0d + "'", double83 == 310.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 2347.5555555555557d + "'", double84 == 2347.5555555555557d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        double[] doubleArray15 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double18 = sum0.evaluate(doubleArray15, 0, 0);
        sum0.increment((double) 371080922);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        long long5 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(statisticalSummary6);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 971883398);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        java.lang.Class<?> wildcardClass9 = summaryStatistics0.getClass();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass9);
        double double11 = summaryStatistics10.getMax();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs12 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double13 = sumOfLogs12.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean14 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs12);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean15 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs12);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = geometricMean15.getSumLogImpl();
        summaryStatistics10.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean15);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs18 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double19 = sumOfLogs18.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean20 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs18);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean21 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs18);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = geometricMean21.getSumLogImpl();
        long long23 = geometricMean21.getN();
        geometricMean21.increment((double) Float.NaN);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics26.getMeanImpl();
        summaryStatistics26.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = summaryStatistics29.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long32 = secondMoment31.getN();
        secondMoment31.increment((double) (-1));
        summaryStatistics29.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment31);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance36.clear();
        summaryStatistics29.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance36);
        summaryStatistics26.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance36);
        double double40 = variance36.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs41 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean42 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs41);
        org.apache.commons.math.stat.descriptive.rank.Max max43 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long44 = max43.getN();
        geometricMean42.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max43);
        org.apache.commons.math.stat.descriptive.summary.Sum sum46 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray53 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double54 = sum46.evaluate(doubleArray53);
        geometricMean42.incrementAll(doubleArray53);
        int int56 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        int int57 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        double double58 = variance36.evaluate(doubleArray53);
        geometricMean21.incrementAll(doubleArray53);
        // The following exception was thrown during execution in test generation
        try {
            double double62 = geometricMean15.evaluate(doubleArray53, 577371932, (-231965925));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(summaryStatistics10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 310.0d + "'", double54 == 310.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1635884154) + "'", int56 == (-1635884154));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1635884154) + "'", int57 == (-1635884154));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 2817.0666666666666d + "'", double58 == 2817.0666666666666d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        summaryStatistics0.addValue(1.730777995336729E7d);
        double double8 = summaryStatistics0.getGeometricMean();
        double double9 = summaryStatistics0.getMean();
        double double10 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean12 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment11);
        double double13 = mean12.getResult();
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementations must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.730777995336729E7d + "'", double8 == 1.730777995336729E7d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.730777995336729E7d + "'", double9 == 1.730777995336729E7d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.730777995336729E7d + "'", double10 == 1.730777995336729E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMax();
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics5.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long8 = secondMoment7.getN();
        secondMoment7.increment((double) (-1));
        summaryStatistics5.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean13 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment12);
        double double14 = mean13.getResult();
        mean13.clear();
        summaryStatistics5.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean13);
        org.apache.commons.math.stat.descriptive.rank.Max max17 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long18 = max17.getN();
        summaryStatistics5.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max17);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = summaryStatistics5.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics5.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.summary.Sum sum22 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray29 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double30 = sum22.evaluate(doubleArray29);
        double[] doubleArray37 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double40 = sum22.evaluate(doubleArray37, 0, 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum41 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray48 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double49 = sum41.evaluate(doubleArray48);
        double[] doubleArray56 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double59 = sum41.evaluate(doubleArray56, 0, 0);
        int int60 = org.apache.commons.math.util.MathUtils.hash(doubleArray56);
        double double63 = sum22.evaluate(doubleArray56, (int) (byte) 0, (int) (short) 1);
        summaryStatistics5.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum22);
        summaryStatistics0.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum22);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs66 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean67 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs66);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean68 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs66);
        org.apache.commons.math.stat.descriptive.summary.Sum sum69 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray76 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double77 = sum69.evaluate(doubleArray76);
        double double78 = sumOfLogs66.evaluate(doubleArray76);
        double double79 = sumOfLogs66.getResult();
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs66);
        sumOfLogs66.increment((double) 32);
        sumOfLogs66.clear();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic20);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic21);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 310.0d + "'", double30 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 310.0d + "'", double49 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2050442118 + "'", int60 == 2050442118);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 310.0d + "'", double77 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumImpl();
        long long7 = summaryStatistics0.getN();
        double double8 = summaryStatistics0.getMin();
        double double9 = summaryStatistics0.getGeometricMean();
        double double10 = summaryStatistics0.getMean();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum2 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray9 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double10 = sum2.evaluate(doubleArray9);
        double[] doubleArray17 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double20 = sum2.evaluate(doubleArray17, 0, 0);
        double double23 = mean1.evaluate(doubleArray17, 1, (int) (byte) 1);
        mean1.increment((double) 10L);
        mean1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean28 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment27);
        org.apache.commons.math.stat.descriptive.summary.Sum sum29 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray36 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double37 = sum29.evaluate(doubleArray36);
        double[] doubleArray44 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double47 = sum29.evaluate(doubleArray44, 0, 0);
        double double50 = mean28.evaluate(doubleArray44, 1, (int) (byte) 1);
        double double53 = mean1.evaluate(doubleArray44, 0, 0);
        mean1.increment((double) 2050442118);
        double double56 = mean1.getResult();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 310.0d + "'", double10 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 310.0d + "'", double37 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        double double1 = min0.getResult();
        min0.increment(310.0d);
        long long4 = min0.getN();
        min0.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares6.increment(9.619275968248924E151d);
        double double9 = sumOfSquares6.getResult();
        double[] doubleArray11 = new double[] { 1.0d };
        sumOfSquares6.incrementAll(doubleArray11);
        long long13 = sumOfSquares6.getN();
        sumOfSquares6.clear();
        long long15 = sumOfSquares6.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs16 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean17 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs16);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares18 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares18.increment(9.619275968248924E151d);
        double double21 = sumOfSquares18.getResult();
        double[] doubleArray23 = new double[] { 1.0d };
        sumOfSquares18.incrementAll(doubleArray23);
        sumOfLogs16.incrementAll(doubleArray23);
        sumOfSquares6.incrementAll(doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = min0.evaluate(doubleArray23, 3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.253047015333127E303d + "'", double9 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.253047015333127E303d + "'", double21 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Min min3 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min3.increment(0.0d);
        min3.increment(0.0d);
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = geometricMean2.getSumLogImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(5100, (-51));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        double double12 = sumOfLogs0.evaluate(doubleArray10);
        sumOfLogs0.clear();
        double double14 = sumOfLogs0.getResult();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum4.clear();
        summaryStatistics3.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum4);
        long long7 = summaryStatistics3.getN();
        java.lang.String str8 = summaryStatistics3.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long10 = variance9.getN();
        summaryStatistics3.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance9);
        double double12 = summaryStatistics3.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long14 = secondMoment13.getN();
        secondMoment13.increment((double) (-1));
        summaryStatistics3.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment13);
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment13);
        secondMoment13.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean20 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment13);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment13);
        double double22 = secondMoment13.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment13);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str8, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = summaryStatistics0.getSummary();
        double double8 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(statisticalSummary7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-3191L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        double double9 = sum0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance11.increment(0.6476398521807292d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance14.clear();
        double double16 = variance14.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max17 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long18 = max17.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs19 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean20 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs19);
        org.apache.commons.math.stat.descriptive.rank.Max max21 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long22 = max21.getN();
        geometricMean20.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max21);
        org.apache.commons.math.stat.descriptive.summary.Sum sum24 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray31 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double32 = sum24.evaluate(doubleArray31);
        geometricMean20.incrementAll(doubleArray31);
        double double34 = max17.evaluate(doubleArray31);
        double double35 = variance14.evaluate(doubleArray31);
        double double36 = variance11.evaluate(doubleArray31);
        double double37 = sum0.evaluate(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 310.0d + "'", double32 == 310.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2817.0666666666666d + "'", double35 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2347.5555555555557d + "'", double36 == 2347.5555555555557d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 310.0d + "'", double37 == 310.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics4.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics4.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics4.getSumsqImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic7);
        double double9 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment3);
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment3);
        double double6 = summaryStatistics0.getStandardDeviation();
        double double7 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean8.increment((-42.0d));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean8);
        long long12 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        long long3 = variance1.getN();
        variance1.setBiasCorrected(false);
        double double6 = variance1.getResult();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares3 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares3.increment(9.619275968248924E151d);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares3);
        long long7 = sumOfSquares3.getN();
        java.lang.Class<?> wildcardClass8 = sumOfSquares3.getClass();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-368574453));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 2050438918, (long) (-1071382528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 979056390L + "'", long2 == 979056390L);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getSumImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.increment(0.0d);
        double double3 = min0.getResult();
        min0.increment((-1.2181642514249999E288d));
        min0.clear();
        double double7 = min0.getResult();
        double double8 = min0.getResult();
        min0.increment((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray12 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double13 = sum5.evaluate(doubleArray12);
        geometricMean1.incrementAll(doubleArray12);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = geometricMean1.getSumLogImpl();
        long long16 = geometricMean1.getN();
        double double17 = geometricMean1.getResult();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = geometricMean1.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = geometricMean1.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics20.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long23 = secondMoment22.getN();
        secondMoment22.increment((double) (-1));
        summaryStatistics20.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment22);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment22);
        org.apache.commons.math.stat.descriptive.summary.Sum sum28 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray35 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double36 = sum28.evaluate(doubleArray35);
        double[] doubleArray43 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double46 = sum28.evaluate(doubleArray43, 0, 0);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double double48 = variance27.evaluate(doubleArray43);
        double double49 = storelessUnivariateStatistic19.evaluate(doubleArray43);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 310.0d + "'", double13 == 310.0d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 6L + "'", long16 == 6L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.730777995336729E7d + "'", double17 == 1.730777995336729E7d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic18);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 310.0d + "'", double36 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2050442118 + "'", int47 == 2050442118);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 14635.2d + "'", double48 == 14635.2d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 310.0d + "'", double49 == 310.0d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        double double6 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double8 = sumOfLogs7.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean10 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = geometricMean10.getSumLogImpl();
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean10);
        double double13 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs14 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean15 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs14);
        org.apache.commons.math.stat.descriptive.rank.Max max16 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long17 = max16.getN();
        geometricMean15.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max16);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = geometricMean15.getSumLogImpl();
        geometricMean15.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs21 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean22 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs21);
        geometricMean15.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum25 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum25.clear();
        summaryStatistics24.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum25);
        long long28 = summaryStatistics24.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum29 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long30 = sum29.getN();
        sum29.increment(35.0d);
        summaryStatistics24.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum29);
        long long34 = summaryStatistics24.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = summaryStatistics24.getGeoMeanImpl();
        boolean boolean36 = geometricMean22.equals((java.lang.Object) summaryStatistics24);
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean22);
        summaryStatistics0.addValue((double) (-1L));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        sumOfLogs7.clear();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        sumOfLogs7.increment((double) 87);
        sumOfLogs7.clear();
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs7);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(971883398);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.914099705972848E10d + "'", double1 == 1.914099705972848E10d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics3.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long6 = secondMoment5.getN();
        secondMoment5.increment((double) (-1));
        summaryStatistics3.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment5);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance10.clear();
        summaryStatistics3.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance10);
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics0.getGeoMeanImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        mean1.clear();
        mean1.clear();
        double double5 = mean1.getResult();
        double double6 = mean1.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        long long7 = summaryStatistics0.getN();
        double double8 = summaryStatistics0.getVariance();
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean12 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs11);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares13 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares13.increment(9.619275968248924E151d);
        double double16 = sumOfSquares13.getResult();
        double[] doubleArray18 = new double[] { 1.0d };
        sumOfSquares13.incrementAll(doubleArray18);
        sumOfLogs11.incrementAll(doubleArray18);
        sumOfLogs11.increment((double) (-1));
        sumOfLogs11.increment((double) 35);
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs11);
        double double26 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.253047015333127E303d + "'", double16 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getVariance();
        double double4 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean2 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment1);
        secondMoment1.increment(1.730777995336729E7d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance5.clear();
        double double7 = variance5.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max8 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long9 = max8.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs10 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs10);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        geometricMean11.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray22 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double23 = sum15.evaluate(doubleArray22);
        geometricMean11.incrementAll(doubleArray22);
        double double25 = max8.evaluate(doubleArray22);
        double double26 = variance5.evaluate(doubleArray22);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean28 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment27);
        org.apache.commons.math.stat.descriptive.summary.Sum sum29 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray36 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double37 = sum29.evaluate(doubleArray36);
        double[] doubleArray44 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double47 = sum29.evaluate(doubleArray44, 0, 0);
        double double50 = mean28.evaluate(doubleArray44, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs51 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean52 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs51);
        org.apache.commons.math.stat.descriptive.rank.Max max53 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long54 = max53.getN();
        geometricMean52.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max53);
        org.apache.commons.math.stat.descriptive.summary.Sum sum56 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray63 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double64 = sum56.evaluate(doubleArray63);
        geometricMean52.incrementAll(doubleArray63);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray63);
        double double67 = variance5.evaluate(doubleArray63);
        secondMoment1.incrementAll(doubleArray63);
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long70 = secondMoment1.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 310.0d + "'", double23 == 310.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2817.0666666666666d + "'", double26 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 310.0d + "'", double37 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 310.0d + "'", double64 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 2817.0666666666666d + "'", double67 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 7L + "'", long70 == 7L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) '4', (-1728584535));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1728584587 + "'", int2 == 1728584587);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        double double12 = summaryStatistics0.getSumOfLogs();
        double double13 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getGeoMeanImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum3.clear();
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        long long6 = summaryStatistics2.getN();
        java.lang.String str7 = summaryStatistics2.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long9 = variance8.getN();
        summaryStatistics2.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance8);
        double double11 = summaryStatistics2.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long13 = secondMoment12.getN();
        secondMoment12.increment((double) (-1));
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment12);
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment12);
        secondMoment12.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean19 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment12);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment12);
        double double21 = secondMoment12.getResult();
        long long22 = secondMoment12.getN();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str7, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 100, (long) 1104152832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110415283200L + "'", long2 == 110415283200L);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getVarianceImpl();
        double double10 = summaryStatistics0.getVariance();
        double double11 = summaryStatistics0.getMin();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-368574453));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.increment(0.0d);
        min0.increment(0.0d);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares5 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares5.increment(9.619275968248924E151d);
        double double8 = sumOfSquares5.getResult();
        double[] doubleArray10 = new double[] { 1.0d };
        sumOfSquares5.incrementAll(doubleArray10);
        boolean boolean12 = min0.equals((java.lang.Object) sumOfSquares5);
        long long13 = min0.getN();
        double double14 = min0.getResult();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.253047015333127E303d + "'", double8 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        long long3 = sumOfLogs0.getN();
        sumOfLogs0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Mean mean9 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment6);
        secondMoment6.increment((double) 1076101120);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment6);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean14 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment13);
        mean14.clear();
        double[] doubleArray21 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean14.incrementAll(doubleArray21, (int) (short) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum25 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray32 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double33 = sum25.evaluate(doubleArray32);
        double[] doubleArray40 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double43 = sum25.evaluate(doubleArray40, 0, 0);
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray40);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics45.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long48 = secondMoment47.getN();
        secondMoment47.increment((double) (-1));
        summaryStatistics45.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment47);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean53 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment52);
        double double54 = mean53.getResult();
        mean53.clear();
        summaryStatistics45.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean53);
        org.apache.commons.math.stat.descriptive.summary.Sum sum57 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray64 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double65 = sum57.evaluate(doubleArray64);
        double[] doubleArray72 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double75 = sum57.evaluate(doubleArray72, 0, 0);
        int int76 = org.apache.commons.math.util.MathUtils.hash(doubleArray72);
        double double79 = mean53.evaluate(doubleArray72, 0, (int) (short) 0);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray72);
        double double82 = variance12.evaluate(doubleArray40, (double) 101L);
        double double83 = sumOfLogs0.evaluate(doubleArray40);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 310.0d + "'", double33 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 310.0d + "'", double65 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2050442118 + "'", int76 == 2050442118);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 12196.0d + "'", double82 == 12196.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        summaryStatistics0.addValue((double) 1072693279);
        long long8 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics5.getMeanImpl();
        double double7 = summaryStatistics5.getSum();
        double double8 = summaryStatistics5.getGeometricMean();
        double double9 = summaryStatistics5.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics5.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics5.getSumImpl();
        summaryStatistics0.setSumImpl(storelessUnivariateStatistic11);
        double double13 = summaryStatistics0.getSumOfLogs();
        double double14 = summaryStatistics0.getMean();
        double double15 = summaryStatistics0.getVariance();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        double double12 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max14 = new org.apache.commons.math.stat.descriptive.rank.Max();
        double double15 = max14.getResult();
        max14.clear();
        double double17 = max14.getResult();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max14);
        long long19 = max14.getN();
        max14.clear();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMeanImpl();
        double double16 = summaryStatistics0.getStandardDeviation();
        double double17 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.increment(2817.0666666666666d);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum5.clear();
        summaryStatistics4.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics4.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics9.getMeanImpl();
        double double11 = summaryStatistics9.getSum();
        double double12 = summaryStatistics9.getGeometricMean();
        double double13 = summaryStatistics9.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics9.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics9.getSumImpl();
        summaryStatistics4.setSumImpl(storelessUnivariateStatistic15);
        double double17 = summaryStatistics4.getSumOfLogs();
        double double18 = summaryStatistics4.getMean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean19 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean19.increment(9.253047015333127E303d);
        double double22 = mean19.getResult();
        summaryStatistics4.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean19);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs24 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double25 = sumOfLogs24.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance27.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean31 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment30);
        mean31.clear();
        double[] doubleArray38 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean31.incrementAll(doubleArray38, (int) (short) 1, (int) (byte) 0);
        double double42 = variance27.evaluate(doubleArray38);
        double double43 = sumOfLogs24.evaluate(doubleArray38);
        boolean boolean44 = summaryStatistics4.equals((java.lang.Object) doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = mean1.evaluate(doubleArray38, 1095479168, 167);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.253047015333127E303d + "'", double22 == 9.253047015333127E303d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2806.7d + "'", double42 == 2806.7d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-51), 1104152832);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1104152781 + "'", int2 == 1104152781);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        long long3 = geometricMean2.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs4 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean5 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs4);
        double double6 = sumOfLogs4.getResult();
        double double7 = sumOfLogs4.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs4);
        sumOfLogs4.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics10.getMeanImpl();
        double double12 = summaryStatistics10.getSum();
        long long13 = summaryStatistics10.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics10.getSumLogImpl();
        boolean boolean15 = sumOfLogs4.equals((java.lang.Object) storelessUnivariateStatistic14);
        sumOfLogs4.clear();
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs4);
        org.apache.commons.math.stat.descriptive.rank.Min min18 = new org.apache.commons.math.stat.descriptive.rank.Min();
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1104154720, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1104154720L + "'", long2 == 1104154720L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        double double2 = org.apache.commons.math.util.MathUtils.round((-2.6602412030089932E11d), 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.6602412030089932E11d) + "'", double2 == (-2.6602412030089932E11d));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(371080922, 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-316200L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1104152781);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(101.0d, (double) 3190);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.00000000000001d + "'", double2 == 101.00000000000001d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) -1, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        sum0.increment(35.0d);
        double double4 = sum0.getResult();
        sum0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        double double3 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        double double5 = summaryStatistics0.getVariance();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 2117107591, (-35), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(2L, (long) 1078558720);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1078558722L + "'", long2 == 1078558722L);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment3);
        secondMoment3.increment(1.730777995336729E7d);
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment3);
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment3);
        double double6 = summaryStatistics0.getStandardDeviation();
        double double7 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean8.increment((-42.0d));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean8);
        long long12 = geometricMean8.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(515.8908245878225d, 4.127134385045092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.952814706276058d + "'", double2 == 6.952814706276058d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean5 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment4);
        mean5.clear();
        mean5.increment(30.482323362278656d);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean5);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getGeoMeanImpl();
        double double11 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getMin();
        double double11 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        double double14 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean16 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment15);
        summaryStatistics12.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment15);
        double double18 = summaryStatistics12.getStandardDeviation();
        double double19 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean20 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean20.increment((-42.0d));
        summaryStatistics12.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean20);
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean20);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean25 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum27 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum27.clear();
        summaryStatistics26.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum27);
        long long30 = summaryStatistics26.getN();
        java.lang.String str31 = summaryStatistics26.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long33 = variance32.getN();
        summaryStatistics26.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance32);
        double double35 = summaryStatistics26.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long37 = secondMoment36.getN();
        secondMoment36.increment((double) (-1));
        summaryStatistics26.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment36);
        geometricMean25.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment36);
        long long42 = geometricMean25.getN();
        double double43 = geometricMean25.getResult();
        long long44 = geometricMean25.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean25);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(summaryStatistics12);
        org.junit.Assert.assertNotNull(statisticalSummary13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str31, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 2050438918, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMean();
        double double4 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(statisticalSummary5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics4.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics4.getSummary();
        double double7 = summaryStatistics4.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics4.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum10.clear();
        summaryStatistics9.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics9.getMeanImpl();
        summaryStatistics4.setGeoMeanImpl(storelessUnivariateStatistic13);
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic13);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs17 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean18 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs17);
        org.apache.commons.math.stat.descriptive.rank.Max max19 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long20 = max19.getN();
        geometricMean18.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max19);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = geometricMean18.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics23.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long26 = secondMoment25.getN();
        secondMoment25.increment((double) (-1));
        summaryStatistics23.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment25);
        geometricMean18.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment25);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment25);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs32 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double33 = sumOfLogs32.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance35.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean39 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment38);
        mean39.clear();
        double[] doubleArray46 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean39.incrementAll(doubleArray46, (int) (short) 1, (int) (byte) 0);
        double double50 = variance35.evaluate(doubleArray46);
        double double51 = sumOfLogs32.evaluate(doubleArray46);
        double double52 = variance31.evaluate(doubleArray46);
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance31);
        long long54 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic55 = summaryStatistics0.getSumLogImpl();
        double double56 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2806.7d + "'", double50 == 2806.7d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2245.3599999999997d + "'", double52 == 2245.3599999999997d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic55);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance5.clear();
        double double7 = variance5.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max8 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long9 = max8.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs10 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs10);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        geometricMean11.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray22 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double23 = sum15.evaluate(doubleArray22);
        geometricMean11.incrementAll(doubleArray22);
        double double25 = max8.evaluate(doubleArray22);
        double double26 = variance5.evaluate(doubleArray22);
        long long27 = variance5.getN();
        variance5.increment((double) (-51));
        org.apache.commons.math.stat.descriptive.summary.Sum sum30 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray37 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double38 = sum30.evaluate(doubleArray37);
        double[] doubleArray45 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double48 = sum30.evaluate(doubleArray45, 0, 0);
        int int49 = org.apache.commons.math.util.MathUtils.hash(doubleArray45);
        double double53 = variance5.evaluate(doubleArray45, 35.0d, 0, 0);
        double double55 = variance4.evaluate(doubleArray45, 310.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double58 = mean1.evaluate(doubleArray45, (int) (byte) 1, 971883398);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 310.0d + "'", double23 == 310.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2817.0666666666666d + "'", double26 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 310.0d + "'", double38 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2050442118 + "'", int49 == 2050442118);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 12196.0d + "'", double55 == 12196.0d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares17 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double18 = sumOfSquares17.getResult();
        double double19 = sumOfSquares17.getResult();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares17);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs22 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean23 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs22);
        org.apache.commons.math.stat.descriptive.rank.Max max24 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long25 = max24.getN();
        geometricMean23.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max24);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = geometricMean23.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics28.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long31 = secondMoment30.getN();
        secondMoment30.increment((double) (-1));
        summaryStatistics28.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment30);
        geometricMean23.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment30);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment30);
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum38 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long39 = sum38.getN();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum38);
        sum38.clear();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        double double1 = min0.getResult();
        long long2 = min0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(51);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5511187532874088E66d + "'", double1 == 1.5511187532874088E66d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getSumLogImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getSumLogImpl();
        double double16 = summaryStatistics0.getMean();
        double double17 = summaryStatistics0.getMax();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs3 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean4 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment5);
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray14 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double15 = sum7.evaluate(doubleArray14);
        double[] doubleArray22 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double25 = sum7.evaluate(doubleArray22, 0, 0);
        double double28 = mean6.evaluate(doubleArray22, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance29.clear();
        double double31 = variance29.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max32 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long33 = max32.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs34);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max36);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray46 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double47 = sum39.evaluate(doubleArray46);
        geometricMean35.incrementAll(doubleArray46);
        double double49 = max32.evaluate(doubleArray46);
        double double50 = variance29.evaluate(doubleArray46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean52 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment51);
        org.apache.commons.math.stat.descriptive.summary.Sum sum53 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray60 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double61 = sum53.evaluate(doubleArray60);
        double[] doubleArray68 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double71 = sum53.evaluate(doubleArray68, 0, 0);
        double double74 = mean52.evaluate(doubleArray68, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs75 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean76 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs75);
        org.apache.commons.math.stat.descriptive.rank.Max max77 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long78 = max77.getN();
        geometricMean76.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max77);
        org.apache.commons.math.stat.descriptive.summary.Sum sum80 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray87 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double88 = sum80.evaluate(doubleArray87);
        geometricMean76.incrementAll(doubleArray87);
        boolean boolean90 = org.apache.commons.math.util.MathUtils.equals(doubleArray68, doubleArray87);
        double double91 = variance29.evaluate(doubleArray87);
        boolean boolean92 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray87);
        double double93 = sumOfLogs3.evaluate(doubleArray87);
        mean1.incrementAll(doubleArray87);
        double double95 = mean1.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 310.0d + "'", double15 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 310.0d + "'", double47 == 310.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2817.0666666666666d + "'", double50 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 310.0d + "'", double61 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 310.0d + "'", double88 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 2817.0666666666666d + "'", double91 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue(Double.isNaN(double95));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        double double2 = org.apache.commons.math.util.MathUtils.round(8.655154728220069E12d, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.655154728220069E12d + "'", double2 == 8.655154728220069E12d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 2601, (int) (byte) 0, (-51));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        long long15 = max12.getN();
        max12.increment((double) (short) 100);
        double double18 = max12.getResult();
        double double19 = max12.getResult();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        double double9 = mean8.getResult();
        mean8.clear();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean8);
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        summaryStatistics0.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max12);
        long long15 = max12.getN();
        long long16 = max12.getN();
        long long17 = max12.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean19 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment18);
        mean19.clear();
        double[] doubleArray26 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean19.incrementAll(doubleArray26, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = max12.evaluate(doubleArray26, 1635884154, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[2.0, -42.0, 1.0, 32.0, 101.0]");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics0.getSumLogImpl();
        double double12 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        boolean boolean2 = variance0.isBiasCorrected();
        variance0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        double double3 = sumOfLogs0.getResult();
        sumOfLogs0.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        sumOfLogs0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumImpl();
        double double7 = summaryStatistics0.getMin();
        java.lang.String str8 = summaryStatistics0.toString();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str8, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1104154720, 167);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (-2L));
        double double11 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares3 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares3.increment(9.619275968248924E151d);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares3);
        sumOfSquares3.increment((double) 1076101120);
        long long9 = sumOfSquares3.getN();
        long long10 = sumOfSquares3.getN();
        long long11 = sumOfSquares3.getN();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        double double1 = min0.getResult();
        min0.increment(310.0d);
        long long4 = min0.getN();
        min0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance6.clear();
        double double8 = variance6.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max9 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long10 = max9.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean12 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs11);
        org.apache.commons.math.stat.descriptive.rank.Max max13 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long14 = max13.getN();
        geometricMean12.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max13);
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray23 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double24 = sum16.evaluate(doubleArray23);
        geometricMean12.incrementAll(doubleArray23);
        double double26 = max9.evaluate(doubleArray23);
        double double27 = variance6.evaluate(doubleArray23);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean29 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment28);
        org.apache.commons.math.stat.descriptive.summary.Sum sum30 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray37 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double38 = sum30.evaluate(doubleArray37);
        double[] doubleArray45 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double48 = sum30.evaluate(doubleArray45, 0, 0);
        double double51 = mean29.evaluate(doubleArray45, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs52 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean53 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs52);
        org.apache.commons.math.stat.descriptive.rank.Max max54 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long55 = max54.getN();
        geometricMean53.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max54);
        org.apache.commons.math.stat.descriptive.summary.Sum sum57 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray64 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double65 = sum57.evaluate(doubleArray64);
        geometricMean53.incrementAll(doubleArray64);
        boolean boolean67 = org.apache.commons.math.util.MathUtils.equals(doubleArray45, doubleArray64);
        double double68 = variance6.evaluate(doubleArray64);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares69 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares69.increment(9.619275968248924E151d);
        double double72 = sumOfSquares69.getResult();
        double[] doubleArray74 = new double[] { 1.0d };
        sumOfSquares69.incrementAll(doubleArray74);
        double double76 = variance6.evaluate(doubleArray74);
        // The following exception was thrown during execution in test generation
        try {
            double double79 = min0.evaluate(doubleArray74, 1076101130, 1552271548);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1076101130");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 310.0d + "'", double24 == 310.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2817.0666666666666d + "'", double27 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 310.0d + "'", double38 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 310.0d + "'", double65 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 2817.0666666666666d + "'", double68 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 9.253047015333127E303d + "'", double72 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        double double3 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance5.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean9 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment8);
        mean9.clear();
        double[] doubleArray16 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean9.incrementAll(doubleArray16, (int) (short) 1, (int) (byte) 0);
        double double20 = variance5.evaluate(doubleArray16);
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        mean1.incrementAll(doubleArray16);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2806.7d + "'", double20 == 2806.7d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-231965925) + "'", int21 == (-231965925));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        long long9 = variance6.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance10.clear();
        double double12 = variance10.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max13 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long14 = max13.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs15 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean16 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs15);
        org.apache.commons.math.stat.descriptive.rank.Max max17 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long18 = max17.getN();
        geometricMean16.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max17);
        org.apache.commons.math.stat.descriptive.summary.Sum sum20 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray27 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double28 = sum20.evaluate(doubleArray27);
        geometricMean16.incrementAll(doubleArray27);
        double double30 = max13.evaluate(doubleArray27);
        double double31 = variance10.evaluate(doubleArray27);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean33 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment32);
        org.apache.commons.math.stat.descriptive.summary.Sum sum34 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray41 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double42 = sum34.evaluate(doubleArray41);
        double[] doubleArray49 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double52 = sum34.evaluate(doubleArray49, 0, 0);
        double double55 = mean33.evaluate(doubleArray49, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs56 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean57 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs56);
        org.apache.commons.math.stat.descriptive.rank.Max max58 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long59 = max58.getN();
        geometricMean57.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max58);
        org.apache.commons.math.stat.descriptive.summary.Sum sum61 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray68 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double69 = sum61.evaluate(doubleArray68);
        geometricMean57.incrementAll(doubleArray68);
        boolean boolean71 = org.apache.commons.math.util.MathUtils.equals(doubleArray49, doubleArray68);
        double double72 = variance10.evaluate(doubleArray68);
        org.apache.commons.math.stat.descriptive.summary.Sum sum73 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray80 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double81 = sum73.evaluate(doubleArray80);
        double[] doubleArray88 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double91 = sum73.evaluate(doubleArray88, 0, 0);
        double double93 = variance10.evaluate(doubleArray88, (double) 35);
        int int94 = org.apache.commons.math.util.MathUtils.hash(doubleArray88);
        double double96 = variance6.evaluate(doubleArray88, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 310.0d + "'", double28 == 310.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2817.0666666666666d + "'", double31 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 310.0d + "'", double42 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 310.0d + "'", double69 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 2817.0666666666666d + "'", double72 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 310.0d + "'", double81 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 14635.2d + "'", double93 == 14635.2d);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 2050442118 + "'", int94 == 2050442118);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 14635.2d + "'", double96 == 14635.2d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance12.clear();
        long long14 = variance12.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum16.clear();
        summaryStatistics15.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum16);
        long long19 = summaryStatistics15.getN();
        java.lang.String str20 = summaryStatistics15.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long22 = variance21.getN();
        summaryStatistics15.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance21);
        double double24 = summaryStatistics15.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long26 = secondMoment25.getN();
        secondMoment25.increment((double) (-1));
        summaryStatistics15.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment25);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic30 = summaryStatistics15.getMeanImpl();
        boolean boolean31 = variance12.equals((java.lang.Object) storelessUnivariateStatistic30);
        boolean boolean32 = summaryStatistics0.equals((java.lang.Object) storelessUnivariateStatistic30);
        double double33 = storelessUnivariateStatistic30.getResult();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str20, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(87);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum2 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum2.clear();
        summaryStatistics1.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum2);
        long long5 = summaryStatistics1.getN();
        java.lang.String str6 = summaryStatistics1.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long8 = variance7.getN();
        summaryStatistics1.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance7);
        double double10 = summaryStatistics1.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long12 = secondMoment11.getN();
        secondMoment11.increment((double) (-1));
        summaryStatistics1.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment11);
        geometricMean0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment11);
        secondMoment11.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean18 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        secondMoment11.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        boolean boolean22 = variance21.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str6, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long1 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) 1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.increment(2817.0666666666666d);
        mean1.clear();
        long long5 = mean1.getN();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1074790400));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = geometricMean3.getSumLogImpl();
        long long5 = geometricMean3.getN();
        geometricMean3.increment((double) Float.NaN);
        geometricMean3.increment((double) 1L);
        long long10 = geometricMean3.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(577371932, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 577371932L + "'", long2 == 577371932L);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        long long3 = statisticalSummary2.getN();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        double double9 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getMeanImpl();
        double double16 = summaryStatistics0.getVariance();
        double double17 = summaryStatistics0.getVariance();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs7);
        double double9 = summaryStatistics0.getSumsq();
        java.lang.String str10 = summaryStatistics0.toString();
        java.lang.Class<?> wildcardClass11 = summaryStatistics0.getClass();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str10, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) '#', (double) 42L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.283185307179586d + "'", double2 == 41.283185307179586d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1635884154, 2601);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37324.17178930049d + "'", double2 == 37324.17178930049d);
    }
}

