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
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10L);
        double double14 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, 0, (int) (byte) 0);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double16 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double19 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3, 0, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.641588833612779d + "'", double9 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 27.0d + "'", double11 == 27.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 27.0d + "'", double15 == 27.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 21.0d + "'", double16 == 21.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray0, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11, (int) (byte) 1, (int) (byte) 0);
        double double19 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double22 = org.apache.commons.math.stat.StatUtils.max(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray11, (int) (short) 10, (int) (short) 0, 5.32d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 21.0d + "'", double14 == 21.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-4.0d) + "'", double15 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.605170185988092d + "'", double19 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 21.0d + "'", double20 == 21.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3, (int) (byte) 0, (int) (byte) 1);
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double[] doubleArray17 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double18 = org.apache.commons.math.stat.StatUtils.mean(doubleArray17);
        double double20 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray17, (double) 100.0f);
        double[] doubleArray24 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double25 = org.apache.commons.math.stat.StatUtils.mean(doubleArray24);
        double double26 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray24);
        double double27 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray24);
        double double28 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray17, doubleArray24);
        double[] doubleArray32 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double33 = org.apache.commons.math.stat.StatUtils.mean(doubleArray32);
        double double34 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray32);
        double double35 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray17, doubleArray32);
        double double36 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray32);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        double double43 = org.apache.commons.math.stat.StatUtils.max(doubleArray40, 0, 0);
        double double44 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray40);
        double[] doubleArray48 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double49 = org.apache.commons.math.stat.StatUtils.mean(doubleArray48);
        double double50 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray48);
        double double51 = org.apache.commons.math.stat.StatUtils.sum(doubleArray48);
        double double52 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray40, doubleArray48);
        double double53 = org.apache.commons.math.stat.StatUtils.sum(doubleArray40);
        double double56 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray40, (int) (short) 1, (int) (short) 0);
        double double57 = org.apache.commons.math.stat.StatUtils.product(doubleArray40);
        double double58 = org.apache.commons.math.stat.StatUtils.max(doubleArray40);
        double double59 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray32, doubleArray40);
        double double60 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray32);
        double double63 = org.apache.commons.math.stat.StatUtils.max(doubleArray32, 0, 0);
        double double64 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray32);
        double double66 = org.apache.commons.math.stat.StatUtils.variance(doubleArray32, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.641588833612779d + "'", double8 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.000000000000002d + "'", double11 == 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.0d + "'", double18 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.0d + "'", double25 == 7.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.641588833612779d + "'", double26 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.605170185988092d + "'", double27 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 7.0d + "'", double33 == 7.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.641588833612779d + "'", double34 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.641588833612779d + "'", double36 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 101.0d + "'", double44 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.641588833612779d + "'", double50 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 21.0d + "'", double51 == 21.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-4.0d) + "'", double52 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 9.0d + "'", double53 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-0.0d) + "'", double57 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 12.0d + "'", double59 == 12.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4.641588833612779d + "'", double64 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 27.0d + "'", double66 == 27.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        double double15 = org.apache.commons.math.stat.StatUtils.max(doubleArray12, 0, 0);
        double double16 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray12);
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray20);
        double double23 = org.apache.commons.math.stat.StatUtils.sum(doubleArray20);
        double double24 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray12, doubleArray20);
        double double25 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray20);
        double double28 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (short) 1, (int) (byte) 0);
        double double29 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 21.0d + "'", double8 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 101.0d + "'", double16 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 21.0d + "'", double23 == 21.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double double15 = org.apache.commons.math.stat.StatUtils.min(doubleArray10);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.sum(doubleArray19);
        double double23 = org.apache.commons.math.stat.StatUtils.sum(doubleArray19);
        double double24 = org.apache.commons.math.stat.StatUtils.min(doubleArray19);
        double[] doubleArray28 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double29 = org.apache.commons.math.stat.StatUtils.mean(doubleArray28);
        double double31 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray28, (double) 100.0f);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray28, doubleArray35);
        double[] doubleArray43 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double44 = org.apache.commons.math.stat.StatUtils.mean(doubleArray43);
        double double45 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray43);
        double double46 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray28, doubleArray43);
        double double47 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray43);
        double double48 = org.apache.commons.math.stat.StatUtils.variance(doubleArray43);
        double double49 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray19, doubleArray43);
        double double50 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray43);
        double double51 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray43);
        double double53 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray10, doubleArray43, (double) 0.0f);
        double double54 = org.apache.commons.math.stat.StatUtils.max(doubleArray10);
        double double57 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10, 0, (int) (byte) 0);
        double double58 = org.apache.commons.math.stat.StatUtils.sum(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 21.0d + "'", double22 == 21.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 21.0d + "'", double23 == 21.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7.0d + "'", double29 == 7.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.605170185988092d + "'", double38 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 7.0d + "'", double44 == 7.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.641588833612779d + "'", double45 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4.641588833612779d + "'", double47 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 27.0d + "'", double48 == 27.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.641588833612779d + "'", double50 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.605170185988092d + "'", double51 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 21.0d + "'", double58 == 21.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10L);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.641588833612779d + "'", double9 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 27.0d + "'", double11 == 27.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (-1L), 0, 10L };
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray11, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, (double) 10);
        double double18 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double19 = org.apache.commons.math.stat.StatUtils.max(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        java.lang.Class<?> wildcardClass21 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 101.0d + "'", double15 == 101.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 37.0d + "'", double17 == 37.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        double double15 = org.apache.commons.math.stat.StatUtils.max(doubleArray12, 0, 0);
        double double16 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray12);
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray20);
        double double23 = org.apache.commons.math.stat.StatUtils.sum(doubleArray20);
        double double24 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray12, doubleArray20);
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray12);
        double double27 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray12, 0.0d);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.sum(doubleArray31);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        double double41 = org.apache.commons.math.stat.StatUtils.max(doubleArray38, 0, 0);
        double double43 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, 21.0d);
        double double45 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray31, doubleArray38, 4.605170185988092d);
        double double46 = org.apache.commons.math.stat.StatUtils.mean(doubleArray38);
        double double47 = org.apache.commons.math.stat.StatUtils.max(doubleArray38);
        double double48 = org.apache.commons.math.stat.StatUtils.sum(doubleArray38);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double54 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray52);
        double double56 = org.apache.commons.math.stat.StatUtils.max(doubleArray52);
        double double59 = org.apache.commons.math.stat.StatUtils.sum(doubleArray52, (int) (short) 1, 0);
        double double62 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray52, (int) (short) 0, (int) (byte) 0);
        double double64 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray38, doubleArray52, (double) '#');
        double double65 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray52);
        double[] doubleArray69 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double70 = org.apache.commons.math.stat.StatUtils.mean(doubleArray69);
        double double71 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray69);
        double double72 = org.apache.commons.math.stat.StatUtils.sum(doubleArray69);
        double double73 = org.apache.commons.math.stat.StatUtils.sum(doubleArray69);
        double double74 = org.apache.commons.math.stat.StatUtils.min(doubleArray69);
        double double75 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray69);
        double double76 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray69);
        double[] doubleArray80 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double81 = org.apache.commons.math.stat.StatUtils.mean(doubleArray80);
        double double82 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray80);
        double double83 = org.apache.commons.math.stat.StatUtils.sum(doubleArray80);
        double[] doubleArray87 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double88 = org.apache.commons.math.stat.StatUtils.mean(doubleArray87);
        double double89 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray87);
        double double90 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray87);
        double double91 = org.apache.commons.math.stat.StatUtils.max(doubleArray87);
        double double93 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray80, doubleArray87, (double) '#');
        double double94 = org.apache.commons.math.stat.StatUtils.min(doubleArray80);
        double double95 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray80);
        double double96 = org.apache.commons.math.stat.StatUtils.mean(doubleArray80);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 101.0d + "'", double16 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 21.0d + "'", double23 == 21.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.0d + "'", double25 == 9.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 127.0d + "'", double27 == 127.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 21.0d + "'", double34 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 37.0d + "'", double43 == 37.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 127.00000000000001d + "'", double45 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 3.0d + "'", double46 == 3.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 9.0d + "'", double48 == 9.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.0d + "'", double53 == 7.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4.641588833612779d + "'", double54 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.605170185988092d + "'", double55 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 127.0d + "'", double64 == 127.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 7.0d + "'", double70 == 7.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4.641588833612779d + "'", double71 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 21.0d + "'", double72 == 21.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 21.0d + "'", double73 == 21.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 201.0d + "'", double75 == 201.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 7.0d + "'", double81 == 7.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 4.641588833612779d + "'", double82 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 21.0d + "'", double83 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 7.0d + "'", double88 == 7.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 4.641588833612779d + "'", double89 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 4.605170185988092d + "'", double90 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 7.0d + "'", double96 == 7.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10);
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double14 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double15 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray13);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double18 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray13);
        double double19 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double20 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double21 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double[] doubleArray25 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double26 = org.apache.commons.math.stat.StatUtils.mean(doubleArray25);
        double double27 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray25);
        double double28 = org.apache.commons.math.stat.StatUtils.sum(doubleArray25);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        double double35 = org.apache.commons.math.stat.StatUtils.max(doubleArray32, 0, 0);
        double double37 = org.apache.commons.math.stat.StatUtils.variance(doubleArray32, 21.0d);
        double double39 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray25, doubleArray32, 4.605170185988092d);
        double double40 = org.apache.commons.math.stat.StatUtils.mean(doubleArray32);
        double double41 = org.apache.commons.math.stat.StatUtils.max(doubleArray32);
        double[] doubleArray45 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double46 = org.apache.commons.math.stat.StatUtils.mean(doubleArray45);
        double double48 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray45, (double) 100.0f);
        double double49 = org.apache.commons.math.stat.StatUtils.mean(doubleArray45);
        double[] doubleArray53 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double54 = org.apache.commons.math.stat.StatUtils.mean(doubleArray53);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray53, 27.0d);
        double double58 = org.apache.commons.math.stat.StatUtils.variance(doubleArray53, (double) (byte) 10);
        double double59 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray45, doubleArray53);
        double double62 = org.apache.commons.math.stat.StatUtils.variance(doubleArray45, (int) (short) 0, (int) (byte) 0);
        double double63 = org.apache.commons.math.stat.StatUtils.product(doubleArray45);
        double double65 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray32, doubleArray45, 127.0d);
        double double67 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray32, (double) ' ');
        double double69 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray32, 0.0d);
        double[] doubleArray70 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double71 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray32, doubleArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 37.0d + "'", double20 == 37.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 7.0d + "'", double26 == 7.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.641588833612779d + "'", double27 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 21.0d + "'", double28 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 37.0d + "'", double37 == 37.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 127.00000000000001d + "'", double39 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 3.0d + "'", double40 == 3.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 7.0d + "'", double46 == 7.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 7.0d + "'", double54 == 7.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 27.0d + "'", double58 == 27.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 127.0d + "'", double65 == 127.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-0.72d) + "'", double67 == (-0.72d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray18);
        double double22 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        double double29 = org.apache.commons.math.stat.StatUtils.max(doubleArray26, 0, 0);
        double double30 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray26);
        double[] doubleArray34 = new double[] { (-1L), 0, 10L };
        double double37 = org.apache.commons.math.stat.StatUtils.max(doubleArray34, 0, 0);
        double double38 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray34);
        double double40 = org.apache.commons.math.stat.StatUtils.variance(doubleArray34, (double) 10);
        double double41 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray26, doubleArray34);
        double double42 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray34);
        double double43 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray34);
        double[] doubleArray47 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double48 = org.apache.commons.math.stat.StatUtils.mean(doubleArray47);
        double double50 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray47, (double) 100.0f);
        double double51 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
        double double52 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray18, doubleArray47);
        double double53 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray47);
        double double54 = org.apache.commons.math.stat.StatUtils.min(doubleArray47);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = org.apache.commons.math.stat.StatUtils.mean(doubleArray47, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.0d + "'", double22 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 101.0d + "'", double30 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 101.0d + "'", double38 == 101.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 37.0d + "'", double40 == 37.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 101.0d + "'", double42 == 101.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.0d + "'", double43 == 4.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 7.0d + "'", double48 == 7.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 27.0d + "'", double51 == 27.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.605170185988092d + "'", double53 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.641588833612779d + "'", double8 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.605170185988092d + "'", double9 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 27.0d + "'", double11 == 27.0d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10);
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double14 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double15 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray13);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double18 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray10 = new double[] { (-1L), 0, 10L };
        double double13 = org.apache.commons.math.stat.StatUtils.max(doubleArray10, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10, 21.0d);
        double double17 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray10, 4.605170185988092d);
        double double18 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double19 = org.apache.commons.math.stat.StatUtils.max(doubleArray10);
        double[] doubleArray23 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double double25 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray23);
        double double26 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray23);
        double double27 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23);
        double double28 = org.apache.commons.math.stat.StatUtils.min(doubleArray23);
        double[] doubleArray32 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double33 = org.apache.commons.math.stat.StatUtils.mean(doubleArray32);
        double double35 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray32, (double) 100.0f);
        double[] doubleArray39 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double40 = org.apache.commons.math.stat.StatUtils.mean(doubleArray39);
        double double41 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray39);
        double double42 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray39);
        double double43 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray32, doubleArray39);
        double[] doubleArray47 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double48 = org.apache.commons.math.stat.StatUtils.mean(doubleArray47);
        double double49 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double50 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray32, doubleArray47);
        double double51 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double52 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
        double double53 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray23, doubleArray47);
        double double54 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray23);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23, 0.0d);
        double double57 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray10, doubleArray23);
        double double58 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double59 = org.apache.commons.math.stat.StatUtils.product(doubleArray10);
        double double60 = org.apache.commons.math.stat.StatUtils.product(doubleArray10);
        double[] doubleArray64 = new double[] { (-1L), 0, 10L };
        double double67 = org.apache.commons.math.stat.StatUtils.max(doubleArray64, 0, 0);
        double double69 = org.apache.commons.math.stat.StatUtils.variance(doubleArray64, 0.0d);
        double[] doubleArray73 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double74 = org.apache.commons.math.stat.StatUtils.mean(doubleArray73);
        double double75 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray73);
        double double76 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray73);
        double double77 = org.apache.commons.math.stat.StatUtils.max(doubleArray73);
        double double79 = org.apache.commons.math.stat.StatUtils.variance(doubleArray73, (-0.0d));
        double double80 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray64, doubleArray73);
        double double81 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray10, doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 37.0d + "'", double15 == 37.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 127.00000000000001d + "'", double17 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.641588833612779d + "'", double25 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.605170185988092d + "'", double26 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 27.0d + "'", double27 == 27.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 7.0d + "'", double33 == 7.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 7.0d + "'", double40 == 7.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.641588833612779d + "'", double41 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.605170185988092d + "'", double42 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 7.0d + "'", double48 == 7.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.641588833612779d + "'", double49 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.641588833612779d + "'", double51 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 27.0d + "'", double52 == 27.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 201.0d + "'", double54 == 201.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-12.0d) + "'", double57 == (-12.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-0.0d) + "'", double59 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-0.0d) + "'", double60 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 37.0d + "'", double69 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 7.0d + "'", double74 == 7.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 4.641588833612779d + "'", double75 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.605170185988092d + "'", double76 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 27.0d + "'", double79 == 27.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-4.0d) + "'", double80 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 201.0d + "'", double8 == 201.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10);
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double14 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double15 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray13);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double18 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray13);
        double double19 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double20 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double23 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, (int) (short) 0);
        double double24 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double25 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 37.0d + "'", double20 == 37.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.0d) + "'", double25 == (-0.0d));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11, (int) (byte) 1, (int) (byte) 0);
        double double19 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = org.apache.commons.math.stat.StatUtils.max(doubleArray11, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 21.0d + "'", double14 == 21.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-4.0d) + "'", double15 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 201.0d + "'", double19 == 201.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray18);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double23 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double24 = org.apache.commons.math.stat.StatUtils.min(doubleArray18);
        double double26 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray18, (double) 100L);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        double double33 = org.apache.commons.math.stat.StatUtils.max(doubleArray30, 0, 0);
        double double34 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray30);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray30, (double) 10);
        double double37 = org.apache.commons.math.stat.StatUtils.min(doubleArray30);
        double double38 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray18, doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray18, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.641588833612779d + "'", double23 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 101.0d + "'", double34 == 101.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 37.0d + "'", double36 == 37.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 12.0d + "'", double38 == 12.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        double double16 = org.apache.commons.math.stat.StatUtils.max(doubleArray13, 0, 0);
        double double17 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray13);
        double double19 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13, (double) 10);
        double[] doubleArray23 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double double25 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray23);
        double double26 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray23);
        double double27 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23);
        double double28 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray13, doubleArray23);
        double[] doubleArray32 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double33 = org.apache.commons.math.stat.StatUtils.mean(doubleArray32);
        double double34 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray13, doubleArray32);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        double double41 = org.apache.commons.math.stat.StatUtils.max(doubleArray38, 0, 0);
        double double42 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray38);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        double double49 = org.apache.commons.math.stat.StatUtils.max(doubleArray46, 0, 0);
        double double50 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray46);
        double double52 = org.apache.commons.math.stat.StatUtils.variance(doubleArray46, (double) 10);
        double double53 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray38, doubleArray46);
        double double54 = org.apache.commons.math.stat.StatUtils.max(doubleArray46);
        double double55 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray46);
        double double56 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray13, doubleArray46);
        double[] doubleArray60 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double61 = org.apache.commons.math.stat.StatUtils.mean(doubleArray60);
        double double63 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray60, (double) 100.0f);
        double[] doubleArray67 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double68 = org.apache.commons.math.stat.StatUtils.mean(doubleArray67);
        double double69 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray67);
        double double70 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray67);
        double double71 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray60, doubleArray67);
        double[] doubleArray75 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double76 = org.apache.commons.math.stat.StatUtils.mean(doubleArray75);
        double double77 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray75);
        double double78 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray60, doubleArray75);
        double double79 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray75);
        double double80 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray13, doubleArray75);
        double double81 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray75);
        double double83 = org.apache.commons.math.stat.StatUtils.variance(doubleArray75, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double86 = org.apache.commons.math.stat.StatUtils.sum(doubleArray75, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.641588833612779d + "'", double8 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.605170185988092d + "'", double9 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 37.0d + "'", double19 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.641588833612779d + "'", double25 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.605170185988092d + "'", double26 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 27.0d + "'", double27 == 27.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-4.0d) + "'", double28 == (-4.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 7.0d + "'", double33 == 7.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-12.0d) + "'", double34 == (-12.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 101.0d + "'", double42 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 101.0d + "'", double50 == 101.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 37.0d + "'", double52 == 37.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 101.0d + "'", double55 == 101.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 7.0d + "'", double61 == 7.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 7.0d + "'", double68 == 7.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4.641588833612779d + "'", double69 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 4.605170185988092d + "'", double70 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 7.0d + "'", double76 == 7.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.641588833612779d + "'", double77 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 4.641588833612779d + "'", double79 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-12.0d) + "'", double80 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 27.0d + "'", double83 == 27.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double double7 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, 27.0d);
        double double16 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, (double) (byte) 10);
        double double17 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double double19 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double21 = org.apache.commons.math.stat.StatUtils.min(doubleArray11);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        double double28 = org.apache.commons.math.stat.StatUtils.max(doubleArray25, 0, 0);
        double double29 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray25);
        double double31 = org.apache.commons.math.stat.StatUtils.variance(doubleArray25, (double) 10);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.variance(doubleArray35);
        double double40 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray25, doubleArray35);
        double double41 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray25);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray25);
        double double43 = org.apache.commons.math.stat.StatUtils.min(doubleArray25);
        double double45 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray11, doubleArray25, 4.605170185988092d);
        double double46 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray25);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = org.apache.commons.math.stat.StatUtils.min(doubleArray25, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 27.0d + "'", double14 == 27.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 27.0d + "'", double16 == 27.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.605170185988092d + "'", double18 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.605170185988092d + "'", double19 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 101.0d + "'", double29 == 101.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 37.0d + "'", double31 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.605170185988092d + "'", double38 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 27.0d + "'", double39 == 27.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-4.0d) + "'", double40 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 37.0d + "'", double42 == 37.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 127.00000000000001d + "'", double45 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 101.0d + "'", double46 == 101.0d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3, (int) (short) 0, (int) (byte) 0);
        double double14 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double15 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.641588833612779d + "'", double14 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double19 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3, (int) (short) 1, (int) (short) 0);
        double double20 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double21 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray25 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double26 = org.apache.commons.math.stat.StatUtils.mean(doubleArray25);
        double double28 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray25, (double) 100.0f);
        double[] doubleArray32 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double33 = org.apache.commons.math.stat.StatUtils.mean(doubleArray32);
        double double34 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray32);
        double double35 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray32);
        double double36 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray25, doubleArray32);
        double[] doubleArray40 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double41 = org.apache.commons.math.stat.StatUtils.mean(doubleArray40);
        double double42 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray40);
        double double43 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray25, doubleArray40);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        double double50 = org.apache.commons.math.stat.StatUtils.max(doubleArray47, 0, 0);
        double double51 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray47);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        double double58 = org.apache.commons.math.stat.StatUtils.max(doubleArray55, 0, 0);
        double double59 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray55);
        double double61 = org.apache.commons.math.stat.StatUtils.variance(doubleArray55, (double) 10);
        double double62 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray47, doubleArray55);
        double double64 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray25, doubleArray47, 100.0d);
        double double65 = org.apache.commons.math.stat.StatUtils.variance(doubleArray25);
        double double66 = org.apache.commons.math.stat.StatUtils.sum(doubleArray25);
        double double67 = org.apache.commons.math.stat.StatUtils.variance(doubleArray25);
        double double68 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray25);
        double double69 = org.apache.commons.math.stat.StatUtils.min(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 21.0d + "'", double14 == 21.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-4.0d) + "'", double15 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 37.0d + "'", double21 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 7.0d + "'", double26 == 7.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 7.0d + "'", double33 == 7.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.641588833612779d + "'", double34 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.605170185988092d + "'", double35 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 7.0d + "'", double41 == 7.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.641588833612779d + "'", double42 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 101.0d + "'", double51 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 101.0d + "'", double59 == 101.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 37.0d + "'", double61 == 37.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 127.0d + "'", double64 == 127.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 27.0d + "'", double65 == 27.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 21.0d + "'", double66 == 21.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 27.0d + "'", double67 == 27.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-4.0d) + "'", double68 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double17 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double[] doubleArray21 = new double[] { (-1L), 0, 10L };
        double double24 = org.apache.commons.math.stat.StatUtils.max(doubleArray21, 0, 0);
        double double25 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray21);
        double double27 = org.apache.commons.math.stat.StatUtils.variance(doubleArray21, (double) 10);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray31);
        double double35 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31);
        double double36 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray21, doubleArray31);
        double[] doubleArray40 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double41 = org.apache.commons.math.stat.StatUtils.mean(doubleArray40);
        double double42 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray21, doubleArray40);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        double double49 = org.apache.commons.math.stat.StatUtils.max(doubleArray46, 0, 0);
        double double50 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray46);
        double[] doubleArray54 = new double[] { (-1L), 0, 10L };
        double double57 = org.apache.commons.math.stat.StatUtils.max(doubleArray54, 0, 0);
        double double58 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray54);
        double double60 = org.apache.commons.math.stat.StatUtils.variance(doubleArray54, (double) 10);
        double double61 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray46, doubleArray54);
        double double62 = org.apache.commons.math.stat.StatUtils.max(doubleArray54);
        double double63 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray54);
        double double64 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray21, doubleArray54);
        double double66 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray54, (double) 100);
        double double67 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double71 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (int) 'a', 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 21.0d + "'", double14 == 21.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-4.0d) + "'", double15 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 101.0d + "'", double25 == 101.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 37.0d + "'", double27 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.605170185988092d + "'", double34 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 27.0d + "'", double35 == 27.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-4.0d) + "'", double36 == (-4.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 7.0d + "'", double41 == 7.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-12.0d) + "'", double42 == (-12.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 101.0d + "'", double50 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 101.0d + "'", double58 == 101.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 37.0d + "'", double60 == 37.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 101.0d + "'", double63 == 101.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 37.0d + "'", double67 == 37.0d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (short) 1);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (byte) 1, (int) (byte) 0);
        double double12 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        double double21 = org.apache.commons.math.stat.StatUtils.max(doubleArray18, 0, 0);
        double double22 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray18);
        double[] doubleArray26 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double27 = org.apache.commons.math.stat.StatUtils.mean(doubleArray26);
        double double28 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray26);
        double double29 = org.apache.commons.math.stat.StatUtils.sum(doubleArray26);
        double double30 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray26);
        double double33 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray26, (int) (byte) 1, (int) (byte) 0);
        double double34 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray26);
        double double35 = org.apache.commons.math.stat.StatUtils.min(doubleArray26);
        double double37 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray10, doubleArray26, 1.7200000000000006d);
        double double38 = org.apache.commons.math.stat.StatUtils.min(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = org.apache.commons.math.stat.StatUtils.min(doubleArray10, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 101.0d + "'", double22 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.0d + "'", double27 == 7.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.641588833612779d + "'", double28 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 21.0d + "'", double29 == 21.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-4.0d) + "'", double30 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.605170185988092d + "'", double34 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray18);
        double double24 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3, 0, 0);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        double double31 = org.apache.commons.math.stat.StatUtils.max(doubleArray28, 0, 0);
        double double32 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray28);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        double double39 = org.apache.commons.math.stat.StatUtils.max(doubleArray36, 0, 0);
        double double40 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray36);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray36, (double) 10);
        double double43 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray28, doubleArray36);
        double double44 = org.apache.commons.math.stat.StatUtils.variance(doubleArray28);
        double double45 = org.apache.commons.math.stat.StatUtils.mean(doubleArray28);
        double double48 = org.apache.commons.math.stat.StatUtils.max(doubleArray28, 0, 0);
        double double49 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray28);
        double double51 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray28, (double) (short) 1);
        double double52 = org.apache.commons.math.stat.StatUtils.sum(doubleArray28);
        double double54 = org.apache.commons.math.stat.StatUtils.variance(doubleArray28, 27.0d);
        double double55 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 101.0d + "'", double32 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 101.0d + "'", double40 == 101.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 37.0d + "'", double42 == 37.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 37.0d + "'", double44 == 37.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 3.0d + "'", double45 == 3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 101.0d + "'", double49 == 101.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 127.0d + "'", double51 == 127.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 9.0d + "'", double52 == 9.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 37.0d + "'", double54 == 37.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10);
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double14 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double15 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray13);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double18 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray13);
        double double19 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double20 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double21 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray24 = new double[] { 10.0f, 0.0f };
        double double27 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input arrays must have the same (positive) length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 37.0d + "'", double21 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray20);
        double double23 = org.apache.commons.math.stat.StatUtils.sum(doubleArray20);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray27, 21.0d);
        double double34 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray20, doubleArray27, 4.605170185988092d);
        double double35 = org.apache.commons.math.stat.StatUtils.mean(doubleArray27);
        double double36 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray27);
        double double38 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray10, doubleArray27, (-0.52d));
        double double39 = org.apache.commons.math.stat.StatUtils.max(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 21.0d + "'", double23 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 37.0d + "'", double32 == 37.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 127.00000000000001d + "'", double34 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 3.0d + "'", double35 == 3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 127.00000000000001d + "'", double38 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        double double16 = org.apache.commons.math.stat.StatUtils.max(doubleArray13, 0, 0);
        double double17 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray13);
        double double18 = org.apache.commons.math.stat.StatUtils.min(doubleArray13);
        double double19 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double20 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double22 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray13, (double) 100.0f);
        double double23 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray13);
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 37.0d + "'", double19 == 37.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 37.0d + "'", double20 == 37.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.0d + "'", double24 == 3.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double[] doubleArray5 = new double[] { '#', 10.0f, 'a', 12.0d, 37.0d };
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray5);
        double double7 = org.apache.commons.math.stat.StatUtils.min(doubleArray5);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray5, (double) 10.0f);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray5);
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray5, (int) (short) 10, (int) (short) 10, (-3.552713678800501E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 10.0, 97.0, 12.0, 37.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 191.0d + "'", double6 == 191.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1237.7d + "'", double9 == 1237.7d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 191.0d + "'", double10 == 191.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 38.2d + "'", double11 == 38.2d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        double double15 = org.apache.commons.math.stat.StatUtils.max(doubleArray12, 0, 0);
        double double16 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray12);
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray20);
        double double23 = org.apache.commons.math.stat.StatUtils.sum(doubleArray20);
        double double24 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray12, doubleArray20);
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray12);
        double double27 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray12, 0.0d);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.sum(doubleArray31);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        double double41 = org.apache.commons.math.stat.StatUtils.max(doubleArray38, 0, 0);
        double double43 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, 21.0d);
        double double45 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray31, doubleArray38, 4.605170185988092d);
        double double46 = org.apache.commons.math.stat.StatUtils.mean(doubleArray38);
        double double47 = org.apache.commons.math.stat.StatUtils.max(doubleArray38);
        double double48 = org.apache.commons.math.stat.StatUtils.sum(doubleArray38);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double54 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray52);
        double double56 = org.apache.commons.math.stat.StatUtils.max(doubleArray52);
        double double59 = org.apache.commons.math.stat.StatUtils.sum(doubleArray52, (int) (short) 1, 0);
        double double62 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray52, (int) (short) 0, (int) (byte) 0);
        double double64 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray38, doubleArray52, (double) '#');
        double double65 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray52);
        double[] doubleArray69 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double70 = org.apache.commons.math.stat.StatUtils.mean(doubleArray69);
        double double71 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray69);
        double double72 = org.apache.commons.math.stat.StatUtils.sum(doubleArray69);
        double double73 = org.apache.commons.math.stat.StatUtils.sum(doubleArray69);
        double double74 = org.apache.commons.math.stat.StatUtils.min(doubleArray69);
        double double75 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray69);
        double double76 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray69);
        double double77 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray69);
        double double78 = org.apache.commons.math.stat.StatUtils.min(doubleArray69);
        double double80 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray69, (double) (short) 1);
        double double81 = org.apache.commons.math.stat.StatUtils.max(doubleArray69);
        double double82 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 101.0d + "'", double16 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 21.0d + "'", double23 == 21.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.0d + "'", double25 == 9.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 127.0d + "'", double27 == 127.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 21.0d + "'", double34 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 37.0d + "'", double43 == 37.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 127.00000000000001d + "'", double45 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 3.0d + "'", double46 == 3.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 9.0d + "'", double48 == 9.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.0d + "'", double53 == 7.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4.641588833612779d + "'", double54 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.605170185988092d + "'", double55 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 127.0d + "'", double64 == 127.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 7.0d + "'", double70 == 7.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4.641588833612779d + "'", double71 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 21.0d + "'", double72 == 21.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 21.0d + "'", double73 == 21.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 201.0d + "'", double75 == 201.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.605170185988092d + "'", double77 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 201.0d + "'", double82 == 201.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double double7 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, 27.0d);
        double double16 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, (double) (byte) 10);
        double double17 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double[] doubleArray22 = new double[] { (-1L), 0, 10L };
        double double25 = org.apache.commons.math.stat.StatUtils.max(doubleArray22, 0, 0);
        double double27 = org.apache.commons.math.stat.StatUtils.variance(doubleArray22, 21.0d);
        double double28 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray11, doubleArray22);
        double double29 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        double double30 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 27.0d + "'", double14 == 27.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 27.0d + "'", double16 == 27.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.605170185988092d + "'", double18 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 37.0d + "'", double27 == 37.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 12.0d + "'", double28 == 12.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 201.0d + "'", double29 == 201.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 27.0d + "'", double30 == 27.0d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray16 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double17 = org.apache.commons.math.stat.StatUtils.mean(doubleArray16);
        double double18 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray16);
        double double19 = org.apache.commons.math.stat.StatUtils.sum(doubleArray16);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray16);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        double double27 = org.apache.commons.math.stat.StatUtils.max(doubleArray24, 0, 0);
        double double28 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray24);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        double double35 = org.apache.commons.math.stat.StatUtils.max(doubleArray32, 0, 0);
        double double36 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray32);
        double double38 = org.apache.commons.math.stat.StatUtils.variance(doubleArray32, (double) 10);
        double double39 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray24, doubleArray32);
        double double40 = org.apache.commons.math.stat.StatUtils.variance(doubleArray24);
        double double42 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray16, doubleArray24, 3.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray24);
        double double44 = org.apache.commons.math.stat.StatUtils.product(doubleArray24);
        double[] doubleArray48 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double49 = org.apache.commons.math.stat.StatUtils.mean(doubleArray48);
        double double50 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray48);
        double double51 = org.apache.commons.math.stat.StatUtils.sum(doubleArray48);
        double double52 = org.apache.commons.math.stat.StatUtils.sum(doubleArray48);
        double double53 = org.apache.commons.math.stat.StatUtils.sum(doubleArray48);
        double double54 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray48);
        double double55 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray24, doubleArray48);
        double double56 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray48);
        double double57 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double58 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double61 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.0d + "'", double17 == 7.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.641588833612779d + "'", double18 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 21.0d + "'", double19 == 21.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 101.0d + "'", double28 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 101.0d + "'", double36 == 101.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 37.0d + "'", double38 == 37.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 37.0d + "'", double40 == 37.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 127.0d + "'", double42 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.0d) + "'", double44 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.641588833612779d + "'", double50 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 21.0d + "'", double51 == 21.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 21.0d + "'", double52 == 21.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 21.0d + "'", double53 == 21.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 201.0d + "'", double54 == 201.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-12.0d) + "'", double55 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.605170185988092d + "'", double57 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 27.0d + "'", double58 == 27.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double[] doubleArray5 = new double[] { '#', 10.0f, 'a', 12.0d, 37.0d };
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray5);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray5);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray5, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 10.0, 97.0, 12.0, 37.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 191.0d + "'", double6 == 191.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 12247.0d + "'", double7 == 12247.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.267451525600872d + "'", double8 == 27.267451525600872d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        double double15 = org.apache.commons.math.stat.StatUtils.max(doubleArray12, 0, 0);
        double double16 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray12);
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray20);
        double double23 = org.apache.commons.math.stat.StatUtils.sum(doubleArray20);
        double double24 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray12, doubleArray20);
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray12);
        double double27 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray12, 0.0d);
        double double28 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12);
        double double31 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12, 1, (int) (byte) 1);
        double double32 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray12);
        double double33 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 101.0d + "'", double16 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 21.0d + "'", double23 == 21.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.0d + "'", double25 == 9.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 127.0d + "'", double27 == 127.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 37.0d + "'", double28 == 37.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 101.0d + "'", double32 == 101.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 37.0d + "'", double33 == 37.0d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray18);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        double double28 = org.apache.commons.math.stat.StatUtils.max(doubleArray25, 0, 0);
        double double29 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray25);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        double double36 = org.apache.commons.math.stat.StatUtils.max(doubleArray33, 0, 0);
        double double37 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray33);
        double double39 = org.apache.commons.math.stat.StatUtils.variance(doubleArray33, (double) 10);
        double double40 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray25, doubleArray33);
        double double42 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray25, 100.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double44 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double45 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double48 = org.apache.commons.math.stat.StatUtils.min(doubleArray3, (int) (byte) 0, 0);
        double double49 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double53 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (int) '#', (int) (byte) 0, Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 101.0d + "'", double29 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 101.0d + "'", double37 == 101.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 37.0d + "'", double39 == 37.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 127.0d + "'", double42 == 127.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 27.0d + "'", double43 == 27.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 21.0d + "'", double44 == 21.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 27.0d + "'", double45 == 27.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.605170185988092d + "'", double49 == 4.605170185988092d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double[] doubleArray12 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double13 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12);
        double double15 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray12, (double) 100.0f);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray19);
        double double23 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray12, doubleArray19);
        double[] doubleArray27 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double28 = org.apache.commons.math.stat.StatUtils.mean(doubleArray27);
        double double29 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray27);
        double double30 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray12, doubleArray27);
        double double31 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray27);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray27);
        double double33 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray27);
        double double36 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 0, (int) (byte) 1);
        double double38 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) ' ');
        double[] doubleArray42 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double43 = org.apache.commons.math.stat.StatUtils.mean(doubleArray42);
        double double45 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray42, (double) 100.0f);
        double[] doubleArray49 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double50 = org.apache.commons.math.stat.StatUtils.mean(doubleArray49);
        double double51 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray49);
        double double52 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray49);
        double double53 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray42, doubleArray49);
        double[] doubleArray57 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double58 = org.apache.commons.math.stat.StatUtils.mean(doubleArray57);
        double double59 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray57);
        double double60 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray42, doubleArray57);
        double double61 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray57);
        double double62 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray57);
        double[] doubleArray66 = new double[] { (-1L), 0, 10L };
        double double69 = org.apache.commons.math.stat.StatUtils.max(doubleArray66, 0, 0);
        double double70 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray66);
        double[] doubleArray74 = new double[] { (-1L), 0, 10L };
        double double77 = org.apache.commons.math.stat.StatUtils.max(doubleArray74, 0, 0);
        double double78 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray74);
        double double80 = org.apache.commons.math.stat.StatUtils.variance(doubleArray74, (double) 10);
        double double81 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray66, doubleArray74);
        double double82 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray74);
        double double85 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray74, 1, (int) (short) 0);
        double double87 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray57, doubleArray74, 101.0d);
        double double88 = org.apache.commons.math.stat.StatUtils.max(doubleArray57);
        double double89 = org.apache.commons.math.stat.StatUtils.sum(doubleArray57);
        double double91 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray57, (double) '4');
        double double92 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.0d + "'", double13 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.605170185988092d + "'", double22 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.0d + "'", double28 == 7.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.641588833612779d + "'", double29 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.641588833612779d + "'", double31 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 27.0d + "'", double32 == 27.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.5200000000000005d + "'", double38 == 3.5200000000000005d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 7.0d + "'", double43 == 7.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 7.0d + "'", double50 == 7.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.641588833612779d + "'", double51 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.605170185988092d + "'", double52 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.0d + "'", double58 == 7.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.641588833612779d + "'", double59 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4.641588833612779d + "'", double61 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 4.641588833612779d + "'", double62 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 101.0d + "'", double70 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 101.0d + "'", double78 == 101.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 37.0d + "'", double80 == 37.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 127.0d + "'", double87 == 127.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 21.0d + "'", double89 == 21.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray18);
        double double22 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double23 = org.apache.commons.math.stat.StatUtils.sum(doubleArray18);
        double double24 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.0d + "'", double22 == 7.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 21.0d + "'", double23 == 21.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 27.0d + "'", double24 == 27.0d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10L);
        double double14 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.641588833612779d + "'", double9 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 27.0d + "'", double11 == 27.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray10 = new double[] { (-1L), 0, 10L };
        double double13 = org.apache.commons.math.stat.StatUtils.max(doubleArray10, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10, 21.0d);
        double double17 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray10, 4.605170185988092d);
        double double18 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double19 = org.apache.commons.math.stat.StatUtils.max(doubleArray10);
        double double20 = org.apache.commons.math.stat.StatUtils.sum(doubleArray10);
        double[] doubleArray24 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double25 = org.apache.commons.math.stat.StatUtils.mean(doubleArray24);
        double double26 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray24);
        double double27 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray24);
        double double28 = org.apache.commons.math.stat.StatUtils.variance(doubleArray24);
        double double29 = org.apache.commons.math.stat.StatUtils.min(doubleArray24);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        double double36 = org.apache.commons.math.stat.StatUtils.max(doubleArray33, 0, 0);
        double double37 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray33);
        double[] doubleArray41 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double42 = org.apache.commons.math.stat.StatUtils.mean(doubleArray41);
        double double43 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray41);
        double double44 = org.apache.commons.math.stat.StatUtils.sum(doubleArray41);
        double double45 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray33, doubleArray41);
        double double46 = org.apache.commons.math.stat.StatUtils.sum(doubleArray33);
        double double48 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray24, doubleArray33, 0.0d);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double54 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.sum(doubleArray52);
        double[] doubleArray59 = new double[] { (-1L), 0, 10L };
        double double62 = org.apache.commons.math.stat.StatUtils.max(doubleArray59, 0, 0);
        double double64 = org.apache.commons.math.stat.StatUtils.variance(doubleArray59, 21.0d);
        double double66 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray52, doubleArray59, 4.605170185988092d);
        double double67 = org.apache.commons.math.stat.StatUtils.mean(doubleArray59);
        double double68 = org.apache.commons.math.stat.StatUtils.max(doubleArray59);
        double double69 = org.apache.commons.math.stat.StatUtils.sum(doubleArray59);
        double[] doubleArray73 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double74 = org.apache.commons.math.stat.StatUtils.mean(doubleArray73);
        double double75 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray73);
        double double76 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray73);
        double double77 = org.apache.commons.math.stat.StatUtils.max(doubleArray73);
        double double80 = org.apache.commons.math.stat.StatUtils.sum(doubleArray73, (int) (short) 1, 0);
        double double83 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray73, (int) (short) 0, (int) (byte) 0);
        double double85 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray59, doubleArray73, (double) '#');
        double double86 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray24, doubleArray73);
        double double88 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray10, doubleArray24, 27.00000000000003d);
        // The following exception was thrown during execution in test generation
        try {
            double double91 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 37.0d + "'", double15 == 37.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 127.00000000000001d + "'", double17 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.0d + "'", double20 == 9.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.0d + "'", double25 == 7.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.641588833612779d + "'", double26 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.605170185988092d + "'", double27 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 27.0d + "'", double28 == 27.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 101.0d + "'", double37 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 7.0d + "'", double42 == 7.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.641588833612779d + "'", double43 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 21.0d + "'", double44 == 21.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-4.0d) + "'", double45 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 9.0d + "'", double46 == 9.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 127.0d + "'", double48 == 127.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.0d + "'", double53 == 7.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4.641588833612779d + "'", double54 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 21.0d + "'", double55 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 37.0d + "'", double64 == 37.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 127.00000000000001d + "'", double66 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 3.0d + "'", double67 == 3.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 9.0d + "'", double69 == 9.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 7.0d + "'", double74 == 7.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 4.641588833612779d + "'", double75 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.605170185988092d + "'", double76 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 127.0d + "'", double85 == 127.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 127.0d + "'", double88 == 127.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        double double18 = org.apache.commons.math.stat.StatUtils.max(doubleArray15, 0, 0);
        double double19 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray15);
        double[] doubleArray23 = new double[] { (-1L), 0, 10L };
        double double26 = org.apache.commons.math.stat.StatUtils.max(doubleArray23, 0, 0);
        double double27 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray23);
        double double29 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23, (double) 10);
        double double30 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray15, doubleArray23);
        double double31 = org.apache.commons.math.stat.StatUtils.variance(doubleArray15);
        double double32 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray15);
        double[] doubleArray36 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double37 = org.apache.commons.math.stat.StatUtils.mean(doubleArray36);
        double double38 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray36);
        double double39 = org.apache.commons.math.stat.StatUtils.sum(doubleArray36);
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray36);
        double[] doubleArray44 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double45 = org.apache.commons.math.stat.StatUtils.mean(doubleArray44);
        double double47 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray44, (double) 100.0f);
        double double48 = org.apache.commons.math.stat.StatUtils.mean(doubleArray44);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52, 27.0d);
        double double57 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52, (double) (byte) 10);
        double double58 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray44, doubleArray52);
        double double60 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray36, doubleArray44, (double) (short) 1);
        double double61 = org.apache.commons.math.stat.StatUtils.sum(doubleArray44);
        double double63 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray44, 0.0d);
        double[] doubleArray67 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double68 = org.apache.commons.math.stat.StatUtils.mean(doubleArray67);
        double double69 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray67);
        double double70 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray67);
        double double71 = org.apache.commons.math.stat.StatUtils.variance(doubleArray67);
        double[] doubleArray75 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double76 = org.apache.commons.math.stat.StatUtils.mean(doubleArray75);
        double double77 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray67, doubleArray75);
        double double78 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray75);
        double double79 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 101.0d + "'", double19 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 101.0d + "'", double27 == 101.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 37.0d + "'", double29 == 37.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 37.0d + "'", double31 == 37.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 7.0d + "'", double37 == 7.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.641588833612779d + "'", double38 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 21.0d + "'", double39 == 21.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 7.0d + "'", double45 == 7.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 7.0d + "'", double48 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.0d + "'", double53 == 7.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 27.0d + "'", double55 == 27.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 27.0d + "'", double57 == 27.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 21.0d + "'", double61 == 21.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 7.0d + "'", double68 == 7.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4.641588833612779d + "'", double69 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 4.605170185988092d + "'", double70 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 27.0d + "'", double71 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 7.0d + "'", double76 == 7.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 21.0d + "'", double79 == 21.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (-1L), 0, 10L };
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray11, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, (double) 10);
        double double18 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double19 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double22 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.00000000000003d, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 101.0d + "'", double15 == 101.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 37.0d + "'", double17 == 37.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 37.0d + "'", double19 == 37.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray18);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        double double28 = org.apache.commons.math.stat.StatUtils.max(doubleArray25, 0, 0);
        double double29 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray25);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        double double36 = org.apache.commons.math.stat.StatUtils.max(doubleArray33, 0, 0);
        double double37 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray33);
        double double39 = org.apache.commons.math.stat.StatUtils.variance(doubleArray33, (double) 10);
        double double40 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray25, doubleArray33);
        double double42 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray25, 100.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double44 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray48 = new double[] { (-1L), 0, 10L };
        double double51 = org.apache.commons.math.stat.StatUtils.max(doubleArray48, 0, 0);
        double double52 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray48);
        double[] doubleArray56 = new double[] { (-1L), 0, 10L };
        double double59 = org.apache.commons.math.stat.StatUtils.max(doubleArray56, 0, 0);
        double double60 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray56);
        double double62 = org.apache.commons.math.stat.StatUtils.variance(doubleArray56, (double) 10);
        double double63 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray48, doubleArray56);
        double double64 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray56);
        double double65 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double66 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double67 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double68 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 101.0d + "'", double29 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 101.0d + "'", double37 == 101.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 37.0d + "'", double39 == 37.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 127.0d + "'", double42 == 127.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 21.0d + "'", double44 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 101.0d + "'", double52 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 101.0d + "'", double60 == 101.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 37.0d + "'", double62 == 37.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 12.0d + "'", double64 == 12.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 7.0d + "'", double65 == 7.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 27.0d + "'", double66 == 27.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 27.0d + "'", double67 == 27.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (short) 1);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (byte) 1, (int) (byte) 0);
        double double13 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (-1.0f));
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 27.0d + "'", double13 == 27.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double17 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray21 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double22 = org.apache.commons.math.stat.StatUtils.mean(doubleArray21);
        double double24 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray21, (double) 100.0f);
        double double25 = org.apache.commons.math.stat.StatUtils.mean(doubleArray21);
        double[] doubleArray29 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double30 = org.apache.commons.math.stat.StatUtils.mean(doubleArray29);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray29, 27.0d);
        double double34 = org.apache.commons.math.stat.StatUtils.variance(doubleArray29, (double) (byte) 10);
        double double35 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray21, doubleArray29);
        double double36 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray29);
        double double37 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray29);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray29);
        double double39 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 21.0d + "'", double14 == 21.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-4.0d) + "'", double15 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.0d + "'", double17 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.0d + "'", double22 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.0d + "'", double25 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7.0d + "'", double30 == 7.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 27.0d + "'", double32 == 27.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 27.0d + "'", double34 == 27.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.605170185988092d + "'", double36 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.605170185988092d + "'", double37 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-4.0d) + "'", double38 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 37.0d + "'", double39 == 37.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double[] doubleArray12 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double13 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12);
        double double15 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray12, (double) 100.0f);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray19);
        double double23 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray12, doubleArray19);
        double[] doubleArray27 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double28 = org.apache.commons.math.stat.StatUtils.mean(doubleArray27);
        double double29 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray27);
        double double30 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray12, doubleArray27);
        double double31 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray27);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray27);
        double double33 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray27);
        double double34 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) '#');
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double38 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray42 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double43 = org.apache.commons.math.stat.StatUtils.mean(doubleArray42);
        double double45 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray42, (double) 100.0f);
        double[] doubleArray49 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double50 = org.apache.commons.math.stat.StatUtils.mean(doubleArray49);
        double double51 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray49);
        double double52 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray49);
        double double53 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray42, doubleArray49);
        double[] doubleArray57 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double58 = org.apache.commons.math.stat.StatUtils.mean(doubleArray57);
        double double59 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray57);
        double double60 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray42, doubleArray57);
        double double61 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray57);
        double double62 = org.apache.commons.math.stat.StatUtils.variance(doubleArray57);
        double double63 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray57);
        double double64 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray57);
        double double65 = org.apache.commons.math.stat.StatUtils.sum(doubleArray57);
        java.lang.Class<?> wildcardClass66 = doubleArray57.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.0d + "'", double13 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.605170185988092d + "'", double22 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.0d + "'", double28 == 7.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.641588833612779d + "'", double29 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.641588833612779d + "'", double31 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 27.0d + "'", double32 == 27.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 27.0d + "'", double36 == 27.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 21.0d + "'", double38 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 7.0d + "'", double43 == 7.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 7.0d + "'", double50 == 7.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.641588833612779d + "'", double51 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.605170185988092d + "'", double52 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.0d + "'", double58 == 7.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.641588833612779d + "'", double59 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4.641588833612779d + "'", double61 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 27.0d + "'", double62 == 27.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4.605170185988092d + "'", double64 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 21.0d + "'", double65 == 21.0d);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double19 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3, (int) (short) 1, (int) (short) 0);
        double double20 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double22 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 10.0d);
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double25 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.00000000000003d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 21.0d + "'", double14 == 21.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-4.0d) + "'", double15 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 37.0d + "'", double22 == 37.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.0d + "'", double23 == 3.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 36.999999999999886d + "'", double25 == 36.999999999999886d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray18);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray18);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        double double29 = org.apache.commons.math.stat.StatUtils.max(doubleArray26, 0, 0);
        double double30 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray26);
        double[] doubleArray34 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double35 = org.apache.commons.math.stat.StatUtils.mean(doubleArray34);
        double double36 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray34);
        double double37 = org.apache.commons.math.stat.StatUtils.sum(doubleArray34);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray26, doubleArray34);
        double double39 = org.apache.commons.math.stat.StatUtils.sum(doubleArray26);
        double double42 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray26, (int) (short) 1, (int) (short) 0);
        double double43 = org.apache.commons.math.stat.StatUtils.product(doubleArray26);
        double double44 = org.apache.commons.math.stat.StatUtils.max(doubleArray26);
        double double45 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray18, doubleArray26);
        double[] doubleArray49 = new double[] { (-1L), 0, 10L };
        double double52 = org.apache.commons.math.stat.StatUtils.max(doubleArray49, 0, 0);
        double double53 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray49);
        double[] doubleArray57 = new double[] { (-1L), 0, 10L };
        double double60 = org.apache.commons.math.stat.StatUtils.max(doubleArray57, 0, 0);
        double double61 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray57);
        double double63 = org.apache.commons.math.stat.StatUtils.variance(doubleArray57, (double) 10);
        double double64 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray49, doubleArray57);
        double double65 = org.apache.commons.math.stat.StatUtils.variance(doubleArray49);
        double double67 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray26, doubleArray49, Double.NaN);
        double double68 = org.apache.commons.math.stat.StatUtils.variance(doubleArray49);
        double double70 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray49, (double) 100);
        double double71 = org.apache.commons.math.stat.StatUtils.variance(doubleArray49);
        double double72 = org.apache.commons.math.stat.StatUtils.sum(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 101.0d + "'", double30 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 7.0d + "'", double35 == 7.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.641588833612779d + "'", double36 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 21.0d + "'", double37 == 21.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-4.0d) + "'", double38 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 9.0d + "'", double39 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.0d) + "'", double43 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 12.0d + "'", double45 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 101.0d + "'", double53 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 101.0d + "'", double61 == 101.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 37.0d + "'", double63 == 37.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 37.0d + "'", double65 == 37.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 37.0d + "'", double68 == 37.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 37.0d + "'", double71 == 37.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 9.0d + "'", double72 == 9.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 1);
        double double12 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 37.0d + "'", double11 == 37.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double[] doubleArray9 = new double[] { (-1L), 0, 10L };
        double double12 = org.apache.commons.math.stat.StatUtils.max(doubleArray9, 0, 0);
        double double13 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray9);
        double[] doubleArray17 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double18 = org.apache.commons.math.stat.StatUtils.mean(doubleArray17);
        double double19 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray17);
        double double20 = org.apache.commons.math.stat.StatUtils.sum(doubleArray17);
        double double21 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray9, doubleArray17);
        double double22 = org.apache.commons.math.stat.StatUtils.max(doubleArray17);
        double double23 = org.apache.commons.math.stat.StatUtils.max(doubleArray17);
        double[] doubleArray27 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double28 = org.apache.commons.math.stat.StatUtils.mean(doubleArray27);
        double double30 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray27, (double) 100.0f);
        double double31 = org.apache.commons.math.stat.StatUtils.mean(doubleArray27);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.variance(doubleArray35, 27.0d);
        double double40 = org.apache.commons.math.stat.StatUtils.variance(doubleArray35, (double) (byte) 10);
        double double41 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray27, doubleArray35);
        double double42 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray17, doubleArray35);
        double double43 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray17);
        double double44 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.0d + "'", double18 == 7.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.641588833612779d + "'", double19 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 21.0d + "'", double20 == 21.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-4.0d) + "'", double21 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.0d + "'", double28 == 7.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 7.0d + "'", double31 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 27.0d + "'", double38 == 27.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 27.0d + "'", double40 == 27.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 201.0d + "'", double43 == 201.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }
}

