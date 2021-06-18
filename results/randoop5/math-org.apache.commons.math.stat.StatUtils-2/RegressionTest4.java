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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        double double18 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double21 = org.apache.commons.math.stat.StatUtils.min(doubleArray3, (int) (short) 1, (int) (short) 0);
        double double22 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) 'a', 0);
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double double7 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, 27.0d);
        double double16 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, (double) (byte) 10);
        double double17 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double24 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray22);
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray22);
        double double26 = org.apache.commons.math.stat.StatUtils.max(doubleArray22);
        double[] doubleArray30 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double31 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double double33 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray30, (double) 100.0f);
        double double34 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double[] doubleArray38 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double39 = org.apache.commons.math.stat.StatUtils.mean(doubleArray38);
        double double41 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, 27.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, (double) (byte) 10);
        double double44 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray30, doubleArray38);
        double double46 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray22, doubleArray30, (double) (short) 1);
        double[] doubleArray50 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double51 = org.apache.commons.math.stat.StatUtils.mean(doubleArray50);
        double double52 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray50);
        double double53 = org.apache.commons.math.stat.StatUtils.sum(doubleArray50);
        double double54 = org.apache.commons.math.stat.StatUtils.max(doubleArray50);
        double double56 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray50, (double) (byte) 100);
        double[] doubleArray60 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double61 = org.apache.commons.math.stat.StatUtils.mean(doubleArray60);
        double double62 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray60);
        double double63 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray60);
        double double64 = org.apache.commons.math.stat.StatUtils.variance(doubleArray60);
        double double66 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray50, doubleArray60, 37.0d);
        double double67 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray30, doubleArray60);
        double double68 = org.apache.commons.math.stat.StatUtils.sum(doubleArray60);
        double double69 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray60);
        double double70 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 21.0d + "'", double18 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.641588833612779d + "'", double24 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 21.0d + "'", double25 == 21.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 7.0d + "'", double31 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 7.0d + "'", double34 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 7.0d + "'", double39 == 7.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 27.0d + "'", double41 == 27.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 27.0d + "'", double43 == 27.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 7.0d + "'", double51 == 7.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.641588833612779d + "'", double52 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 21.0d + "'", double53 == 21.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 7.0d + "'", double61 == 7.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 4.641588833612779d + "'", double62 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.605170185988092d + "'", double63 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 27.0d + "'", double64 == 27.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 21.0d + "'", double68 == 21.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        double double26 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray23, (double) 100.0f);
        double double27 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, 27.0d);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, (double) (byte) 10);
        double double37 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray23, doubleArray31);
        double double40 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23, (int) (short) 0, (int) (byte) 0);
        double double41 = org.apache.commons.math.stat.StatUtils.product(doubleArray23);
        double double43 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray10, doubleArray23, 127.0d);
        double double44 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray23);
        double double46 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23, 38.2d);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.0d + "'", double27 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 27.0d + "'", double34 == 27.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 27.0d + "'", double36 == 27.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 127.0d + "'", double43 == 127.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.605170185988092d + "'", double44 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 27.000000000000227d + "'", double46 == 27.000000000000227d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double[] doubleArray28 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double29 = org.apache.commons.math.stat.StatUtils.mean(doubleArray28);
        double double30 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28);
        double double31 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray28);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28);
        double double34 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28);
        double double37 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28, (int) (short) 1, 0);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray28);
        double double39 = org.apache.commons.math.stat.StatUtils.min(doubleArray28);
        double double40 = org.apache.commons.math.stat.StatUtils.mean(doubleArray28);
        double[] doubleArray44 = new double[] { (-1L), 0, 10L };
        double double47 = org.apache.commons.math.stat.StatUtils.max(doubleArray44, 0, 0);
        double double48 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray44);
        double double50 = org.apache.commons.math.stat.StatUtils.variance(doubleArray44, (double) 10);
        double[] doubleArray54 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double55 = org.apache.commons.math.stat.StatUtils.mean(doubleArray54);
        double double56 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray54);
        double double57 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray54);
        double double58 = org.apache.commons.math.stat.StatUtils.variance(doubleArray54);
        double double59 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray44, doubleArray54);
        double[] doubleArray63 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double64 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double double65 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray63);
        double double66 = org.apache.commons.math.stat.StatUtils.sum(doubleArray63);
        double double67 = org.apache.commons.math.stat.StatUtils.max(doubleArray63);
        double double69 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray63, (double) (byte) 100);
        double[] doubleArray73 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double74 = org.apache.commons.math.stat.StatUtils.mean(doubleArray73);
        double double75 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray73);
        double double76 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray73);
        double double77 = org.apache.commons.math.stat.StatUtils.variance(doubleArray73);
        double double79 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray63, doubleArray73, 37.0d);
        double double80 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray54, doubleArray73);
        double double82 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray28, doubleArray73, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double85 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray28, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7.0d + "'", double29 == 7.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.641588833612779d + "'", double30 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.605170185988092d + "'", double31 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 27.0d + "'", double32 == 27.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.605170185988092d + "'", double34 == 4.605170185988092d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 7.0d + "'", double40 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 101.0d + "'", double48 == 101.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 37.0d + "'", double50 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 7.0d + "'", double55 == 7.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.641588833612779d + "'", double56 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.605170185988092d + "'", double57 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 27.0d + "'", double58 == 27.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-4.0d) + "'", double59 == (-4.0d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 7.0d + "'", double64 == 7.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4.641588833612779d + "'", double65 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 21.0d + "'", double66 == 21.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 7.0d + "'", double74 == 7.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 4.641588833612779d + "'", double75 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.605170185988092d + "'", double76 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 27.0d + "'", double77 == 27.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        double double22 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11, (int) (byte) 1, (int) (short) 1);
        double double23 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double24 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.641588833612779d + "'", double23 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 201.0d + "'", double24 == 201.0d);
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
        // The following exception was thrown during execution in test generation
        try {
            double double60 = org.apache.commons.math.stat.StatUtils.max(doubleArray23, (int) '4', (int) (short) 100);
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
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        double double29 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12, (double) 1L);
        double[] doubleArray33 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double34 = org.apache.commons.math.stat.StatUtils.mean(doubleArray33);
        double double36 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray33, (double) 100.0f);
        double[] doubleArray40 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double41 = org.apache.commons.math.stat.StatUtils.mean(doubleArray40);
        double double42 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray40);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray40);
        double double44 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray33, doubleArray40);
        double[] doubleArray48 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double49 = org.apache.commons.math.stat.StatUtils.mean(doubleArray48);
        double double50 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray48);
        double double51 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray33, doubleArray48);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        double double58 = org.apache.commons.math.stat.StatUtils.max(doubleArray55, 0, 0);
        double double59 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray55);
        double[] doubleArray63 = new double[] { (-1L), 0, 10L };
        double double66 = org.apache.commons.math.stat.StatUtils.max(doubleArray63, 0, 0);
        double double67 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray63);
        double double69 = org.apache.commons.math.stat.StatUtils.variance(doubleArray63, (double) 10);
        double double70 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray55, doubleArray63);
        double double72 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray33, doubleArray55, 100.0d);
        double double73 = org.apache.commons.math.stat.StatUtils.variance(doubleArray33);
        double double74 = org.apache.commons.math.stat.StatUtils.sum(doubleArray33);
        double double75 = org.apache.commons.math.stat.StatUtils.variance(doubleArray33);
        double double78 = org.apache.commons.math.stat.StatUtils.min(doubleArray33, (int) (byte) 0, 0);
        double double79 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray33);
        double double80 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray12, doubleArray33);
        // The following exception was thrown during execution in test generation
        try {
            double double83 = org.apache.commons.math.stat.StatUtils.min(doubleArray12, 0, (int) '#');
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 37.0d + "'", double29 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 7.0d + "'", double34 == 7.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 7.0d + "'", double41 == 7.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.641588833612779d + "'", double42 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.605170185988092d + "'", double43 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.641588833612779d + "'", double50 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 101.0d + "'", double59 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 101.0d + "'", double67 == 101.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 37.0d + "'", double69 == 37.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 127.0d + "'", double72 == 127.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 27.0d + "'", double73 == 27.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 21.0d + "'", double74 == 21.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 27.0d + "'", double75 == 27.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 4.605170185988092d + "'", double79 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-4.0d) + "'", double80 == (-4.0d));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double[] doubleArray12 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double13 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12, 27.0d);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12, (double) (byte) 10);
        double double18 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray12);
        double double20 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12, (double) 10L);
        double double23 = org.apache.commons.math.stat.StatUtils.product(doubleArray12, 0, (int) (byte) 0);
        double double24 = org.apache.commons.math.stat.StatUtils.variance(doubleArray12);
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray12);
        double double28 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray12, 0, 0);
        double double29 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray12);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 27.0d + "'", double15 == 27.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.641588833612779d + "'", double18 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 27.0d + "'", double20 == 27.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 27.0d + "'", double24 == 27.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 21.0d + "'", double25 == 21.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double[] doubleArray11 = new double[] { (-1L), 0, 10L };
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray11, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        double[] doubleArray19 = new double[] { (-1L), 0, 10L };
        double double22 = org.apache.commons.math.stat.StatUtils.max(doubleArray19, 0, 0);
        double double23 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray19);
        double double25 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19, (double) 10);
        double double26 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray11, doubleArray19);
        double double27 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11);
        double double29 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray11, 3.0d);
        double double30 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double31 = org.apache.commons.math.stat.StatUtils.min(doubleArray11);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        double double39 = org.apache.commons.math.stat.StatUtils.max(doubleArray36, 0, 0);
        double double40 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray36);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray36, (double) 10);
        double[] doubleArray46 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double47 = org.apache.commons.math.stat.StatUtils.mean(doubleArray46);
        double double48 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray46);
        double double49 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray46);
        double double50 = org.apache.commons.math.stat.StatUtils.variance(doubleArray46);
        double double51 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray36, doubleArray46);
        double[] doubleArray55 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double56 = org.apache.commons.math.stat.StatUtils.mean(doubleArray55);
        double double57 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray36, doubleArray55);
        double double59 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray11, doubleArray36, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.641588833612779d + "'", double7 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 101.0d + "'", double15 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 37.0d + "'", double25 == 37.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 37.0d + "'", double27 == 37.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 127.0d + "'", double29 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 37.0d + "'", double32 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 101.0d + "'", double40 == 101.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 37.0d + "'", double42 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 7.0d + "'", double47 == 7.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4.641588833612779d + "'", double48 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.605170185988092d + "'", double49 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 27.0d + "'", double50 == 27.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-4.0d) + "'", double51 == (-4.0d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 7.0d + "'", double56 == 7.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-12.0d) + "'", double57 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double12 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double15 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (byte) 0, 1);
        double double17 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 21.0d + "'", double7 == 21.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 201.0d + "'", double9 == 201.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.0d + "'", double10 == 7.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        double double19 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.min(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.math.stat.StatUtils.max(doubleArray11, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.641588833612779d + "'", double19 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        // The following exception was thrown during execution in test generation
        try {
            double double82 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10L);
        double[] doubleArray15 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray15);
        double double18 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray15, (double) 100.0f);
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double24 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray22);
        double double25 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray22);
        double double26 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray15, doubleArray22);
        double[] doubleArray30 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double31 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double double32 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray30);
        double double33 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray15, doubleArray30);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray37, 0, 0);
        double double41 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray37);
        double[] doubleArray45 = new double[] { (-1L), 0, 10L };
        double double48 = org.apache.commons.math.stat.StatUtils.max(doubleArray45, 0, 0);
        double double49 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray45);
        double double51 = org.apache.commons.math.stat.StatUtils.variance(doubleArray45, (double) 10);
        double double52 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray37, doubleArray45);
        double double54 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray15, doubleArray37, 100.0d);
        double double55 = org.apache.commons.math.stat.StatUtils.variance(doubleArray15);
        double[] doubleArray59 = new double[] { (-1L), 0, 10L };
        double double62 = org.apache.commons.math.stat.StatUtils.max(doubleArray59, 0, 0);
        double double63 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray59);
        double[] doubleArray67 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double68 = org.apache.commons.math.stat.StatUtils.mean(doubleArray67);
        double double69 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray67);
        double double70 = org.apache.commons.math.stat.StatUtils.sum(doubleArray67);
        double double71 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray59, doubleArray67);
        double double72 = org.apache.commons.math.stat.StatUtils.sum(doubleArray59);
        double double75 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray59, (int) (short) 1, (int) (short) 0);
        double double76 = org.apache.commons.math.stat.StatUtils.product(doubleArray59);
        double double78 = org.apache.commons.math.stat.StatUtils.variance(doubleArray59, (double) (byte) 10);
        double double80 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray15, doubleArray59, 0.0d);
        double double81 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray59);
        double double82 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray59);
        double double83 = org.apache.commons.math.stat.StatUtils.mean(doubleArray59);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.641588833612779d + "'", double9 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 27.0d + "'", double11 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.641588833612779d + "'", double24 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.605170185988092d + "'", double25 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 7.0d + "'", double31 == 7.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.641588833612779d + "'", double32 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 101.0d + "'", double41 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 101.0d + "'", double49 == 101.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 37.0d + "'", double51 == 37.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 127.0d + "'", double54 == 127.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 27.0d + "'", double55 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 101.0d + "'", double63 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 7.0d + "'", double68 == 7.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4.641588833612779d + "'", double69 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 21.0d + "'", double70 == 21.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-4.0d) + "'", double71 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 9.0d + "'", double72 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-0.0d) + "'", double76 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 37.0d + "'", double78 == 37.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 127.0d + "'", double80 == 127.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4.0d + "'", double81 == 4.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 101.0d + "'", double82 == 101.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 3.0d + "'", double83 == 3.0d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.stat.StatUtils.max(doubleArray0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        double double34 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray31, (double) 100.0f);
        double double35 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double[] doubleArray39 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double40 = org.apache.commons.math.stat.StatUtils.mean(doubleArray39);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, 27.0d);
        double double44 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, (double) (byte) 10);
        double double45 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray31, doubleArray39);
        double double46 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray39);
        double double47 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray39);
        double double49 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, (double) (short) 100);
        double double50 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray39);
        double double52 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray39, (double) 1L);
        double double53 = org.apache.commons.math.stat.StatUtils.product(doubleArray39);
        double double54 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39);
        double double55 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray39);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 7.0d + "'", double35 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 7.0d + "'", double40 == 7.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 27.0d + "'", double42 == 27.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 27.0d + "'", double44 == 27.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 201.0d + "'", double47 == 201.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 27.0d + "'", double49 == 27.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.641588833612779d + "'", double50 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 27.0d + "'", double54 == 27.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.605170185988092d + "'", double55 == 4.605170185988092d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        double double54 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray10);
        double double55 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray10);
        double double56 = org.apache.commons.math.stat.StatUtils.product(doubleArray10);
        double[] doubleArray60 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double61 = org.apache.commons.math.stat.StatUtils.mean(doubleArray60);
        double double62 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray60);
        double double63 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray60);
        double double64 = org.apache.commons.math.stat.StatUtils.max(doubleArray60);
        double double67 = org.apache.commons.math.stat.StatUtils.sum(doubleArray60, (int) (short) 1, 0);
        double double70 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray60, (int) (short) 0, (int) (byte) 0);
        double double72 = org.apache.commons.math.stat.StatUtils.variance(doubleArray60, 1.7200000000000006d);
        double double73 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray10, doubleArray60);
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
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 201.0d + "'", double54 == 201.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 201.0d + "'", double55 == 201.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 7.0d + "'", double61 == 7.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 4.641588833612779d + "'", double62 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.605170185988092d + "'", double63 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 27.000000000000007d + "'", double72 == 27.000000000000007d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.641588833612779d + "'", double8 == 4.641588833612779d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (-1), (int) (short) 0);
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 37.0d + "'", double21 == 37.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 37.0d + "'", double23 == 37.0d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        // The following exception was thrown during execution in test generation
        try {
            double double84 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray69, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11, 1, (int) (byte) 1);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double19 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double23 = org.apache.commons.math.stat.StatUtils.min(doubleArray11, 0, (int) (short) 0);
        double double24 = org.apache.commons.math.stat.StatUtils.min(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.641588833612779d + "'", double18 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.641588833612779d + "'", double19 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray14 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray14);
        double double17 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray14, (double) 100.0f);
        double double19 = org.apache.commons.math.stat.StatUtils.variance(doubleArray14, 4.605170185988092d);
        double double20 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray14);
        double double21 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 37.0d + "'", double10 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 27.000000000000004d + "'", double19 == 27.000000000000004d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.605170185988092d + "'", double20 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-12.0d) + "'", double21 == (-12.0d));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double[] doubleArray12 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double13 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12);
        double double15 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray12, (double) 100.0f);
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12);
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray20, 27.0d);
        double double25 = org.apache.commons.math.stat.StatUtils.variance(doubleArray20, (double) (byte) 10);
        double double26 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray12, doubleArray20);
        double double27 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray20);
        double[] doubleArray31 = new double[] { (-1L), 0, 10L };
        double double34 = org.apache.commons.math.stat.StatUtils.max(doubleArray31, 0, 0);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, 21.0d);
        double double37 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray20, doubleArray31);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray20);
        double double40 = org.apache.commons.math.stat.StatUtils.variance(doubleArray20, 21.0d);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray20, 2.302585092994046d);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        double double49 = org.apache.commons.math.stat.StatUtils.max(doubleArray46, 0, 0);
        double double50 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray46);
        double double52 = org.apache.commons.math.stat.StatUtils.variance(doubleArray46, (double) 10);
        double[] doubleArray56 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double57 = org.apache.commons.math.stat.StatUtils.mean(doubleArray56);
        double double58 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray56);
        double double59 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray56);
        double double60 = org.apache.commons.math.stat.StatUtils.variance(doubleArray56);
        double double61 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray46, doubleArray56);
        double[] doubleArray65 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double66 = org.apache.commons.math.stat.StatUtils.mean(doubleArray65);
        double double67 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray46, doubleArray65);
        double double69 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray20, doubleArray65, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double73 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray65, (int) 'a', 0, 10.0d);
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
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.0d + "'", double13 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 27.0d + "'", double25 == 27.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.605170185988092d + "'", double27 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 37.0d + "'", double36 == 37.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 12.0d + "'", double37 == 12.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 27.0d + "'", double40 == 27.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 27.0d + "'", double42 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 101.0d + "'", double50 == 101.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 37.0d + "'", double52 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 7.0d + "'", double57 == 7.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4.641588833612779d + "'", double58 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.605170185988092d + "'", double59 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 27.0d + "'", double60 == 27.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-4.0d) + "'", double61 == (-4.0d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 7.0d + "'", double66 == 7.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-12.0d) + "'", double67 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        double double38 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 201.0d + "'", double38 == 201.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11, 1, (int) (byte) 1);
        double double17 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.product(doubleArray11, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, 27.267451525600872d, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.0d + "'", double17 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        double double25 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray18);
        double double26 = org.apache.commons.math.stat.StatUtils.max(doubleArray18);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 201.0d + "'", double25 == 201.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        double double59 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 7.0d + "'", double59 == 7.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        double double53 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double55 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray47, (double) (byte) 100);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
        double double57 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray47);
        double double58 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.641588833612779d + "'", double53 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.605170185988092d + "'", double57 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 27.0d + "'", double58 == 27.0d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double double7 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (short) 0, (int) (byte) 0);
        double double13 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 1.7200000000000006d);
        double double14 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 27.000000000000007d + "'", double13 == 27.000000000000007d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.605170185988092d + "'", double14 == 4.605170185988092d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        double double25 = org.apache.commons.math.stat.StatUtils.min(doubleArray18);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
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
        double double63 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray57);
        double double64 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray18, doubleArray57);
        double double66 = org.apache.commons.math.stat.StatUtils.variance(doubleArray57, 27.267451525600872d);
        double double67 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray57);
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 201.0d + "'", double63 == 201.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 27.0d + "'", double66 == 27.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4.641588833612779d + "'", double67 == 4.641588833612779d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 1.50738E7d);
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
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray32);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        double double43 = org.apache.commons.math.stat.StatUtils.max(doubleArray40, 0, 0);
        double double44 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray40);
        double[] doubleArray48 = new double[] { (-1L), 0, 10L };
        double double51 = org.apache.commons.math.stat.StatUtils.max(doubleArray48, 0, 0);
        double double52 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray48);
        double double54 = org.apache.commons.math.stat.StatUtils.variance(doubleArray48, (double) 10);
        double double55 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray40, doubleArray48);
        double double56 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray48);
        double double57 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray32, doubleArray48);
        double[] doubleArray61 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double62 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
        double double64 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray61, (double) 100.0f);
        double double65 = org.apache.commons.math.stat.StatUtils.variance(doubleArray61);
        double double66 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray32, doubleArray61);
        double double67 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
        double double68 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray61);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.641588833612779d + "'", double8 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7.0d + "'", double9 == 7.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.641588833612779d + "'", double11 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 27.0d + "'", double13 == 27.0d);
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 101.0d + "'", double44 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 101.0d + "'", double52 == 101.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 37.0d + "'", double54 == 37.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 101.0d + "'", double56 == 101.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.0d + "'", double57 == 4.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 7.0d + "'", double62 == 7.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 27.0d + "'", double65 == 27.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 7.0d + "'", double67 == 7.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        double double33 = org.apache.commons.math.stat.StatUtils.min(doubleArray11, 1, 0);
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
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        double double55 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray10);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10);
        double double58 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10, 21.0d);
        double double59 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 201.0d + "'", double55 == 201.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 27.0d + "'", double58 == 27.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.605170185988092d + "'", double59 == 4.605170185988092d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        double double34 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray31, (double) 100.0f);
        double double35 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double[] doubleArray39 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double40 = org.apache.commons.math.stat.StatUtils.mean(doubleArray39);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, 27.0d);
        double double44 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, (double) (byte) 10);
        double double45 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray31, doubleArray39);
        double double46 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray39);
        double double47 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (int) (byte) 100, (int) (byte) 100, 36.999999999999886d);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 7.0d + "'", double35 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 7.0d + "'", double40 == 7.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 27.0d + "'", double42 == 27.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 27.0d + "'", double44 == 27.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 27.0d + "'", double47 == 27.0d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        double double16 = org.apache.commons.math.stat.StatUtils.max(doubleArray13, 0, 0);
        double double17 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray13);
        double[] doubleArray21 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double22 = org.apache.commons.math.stat.StatUtils.mean(doubleArray21);
        double double23 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray21);
        double double24 = org.apache.commons.math.stat.StatUtils.sum(doubleArray21);
        double double25 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray13, doubleArray21);
        double double26 = org.apache.commons.math.stat.StatUtils.max(doubleArray21);
        double double27 = org.apache.commons.math.stat.StatUtils.sum(doubleArray21);
        double double28 = org.apache.commons.math.stat.StatUtils.product(doubleArray21);
        double double29 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7.0d + "'", double9 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 101.0d + "'", double17 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.0d + "'", double22 == 7.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.641588833612779d + "'", double23 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 21.0d + "'", double24 == 21.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-4.0d) + "'", double25 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 21.0d + "'", double27 == 21.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double5 = org.apache.commons.math.stat.StatUtils.mean(doubleArray4);
        double double7 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray4, (double) 100.0f);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray4, doubleArray11);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray4, doubleArray19);
        double double23 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double24 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double25 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double26 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray0, doubleArray19, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.605170185988092d + "'", double14 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.641588833612779d + "'", double23 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.641588833612779d + "'", double24 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.0d + "'", double25 == 7.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 27.0d + "'", double26 == 27.0d);
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
        double double18 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11, (int) (byte) 1, (int) (byte) 0);
        double double19 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double[] doubleArray24 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double25 = org.apache.commons.math.stat.StatUtils.mean(doubleArray24);
        double double27 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray24, (double) 100.0f);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray31);
        double double35 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray24, doubleArray31);
        double[] doubleArray39 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double40 = org.apache.commons.math.stat.StatUtils.mean(doubleArray39);
        double double41 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray39);
        double double42 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray24, doubleArray39);
        double double43 = org.apache.commons.math.stat.StatUtils.mean(doubleArray39);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        double double50 = org.apache.commons.math.stat.StatUtils.max(doubleArray47, 0, 0);
        double double51 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray47);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        double double58 = org.apache.commons.math.stat.StatUtils.max(doubleArray55, 0, 0);
        double double59 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray55);
        double double61 = org.apache.commons.math.stat.StatUtils.variance(doubleArray55, (double) 10);
        double double62 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray47, doubleArray55);
        double double63 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray55);
        double double64 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray39, doubleArray55);
        double[] doubleArray68 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double69 = org.apache.commons.math.stat.StatUtils.mean(doubleArray68);
        double double71 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray68, (double) 100.0f);
        double double72 = org.apache.commons.math.stat.StatUtils.variance(doubleArray68);
        double double73 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray39, doubleArray68);
        double double74 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray68);
        double double75 = org.apache.commons.math.stat.StatUtils.sum(doubleArray68);
        double double77 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray68, 3.5200000000000005d);
        double double78 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray68);
        double double79 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray11, doubleArray68);
        double double80 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.605170185988092d + "'", double20 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.0d + "'", double25 == 7.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.605170185988092d + "'", double34 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 7.0d + "'", double40 == 7.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.641588833612779d + "'", double41 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 7.0d + "'", double43 == 7.0d);
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 101.0d + "'", double63 == 101.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4.0d + "'", double64 == 4.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 7.0d + "'", double69 == 7.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 27.0d + "'", double72 == 27.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 4.641588833612779d + "'", double74 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 21.0d + "'", double75 == 21.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 201.0d + "'", double78 == 201.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 21.0d + "'", double80 == 21.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        double double53 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double55 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray47, (double) (byte) 100);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
        double[] doubleArray60 = new double[] { (-1L), 0, 10L };
        double double63 = org.apache.commons.math.stat.StatUtils.max(doubleArray60, 0, 0);
        double double64 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray60);
        double double65 = org.apache.commons.math.stat.StatUtils.min(doubleArray60);
        double double66 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray47, doubleArray60);
        double double69 = org.apache.commons.math.stat.StatUtils.mean(doubleArray47, 0, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.641588833612779d + "'", double53 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 101.0d + "'", double64 == 101.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 12.0d + "'", double66 == 12.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        double double38 = org.apache.commons.math.stat.StatUtils.max(doubleArray35, 0, 0);
        double double39 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray35);
        double double41 = org.apache.commons.math.stat.StatUtils.variance(doubleArray35, (double) 10);
        double double42 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray27, doubleArray35);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray35);
        double double46 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35, 1, (int) (short) 0);
        double double48 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray18, doubleArray35, 101.0d);
        double double49 = org.apache.commons.math.stat.StatUtils.max(doubleArray18);
        double double50 = org.apache.commons.math.stat.StatUtils.sum(doubleArray18);
        double double51 = org.apache.commons.math.stat.StatUtils.min(doubleArray18);
        double[] doubleArray55 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double56 = org.apache.commons.math.stat.StatUtils.mean(doubleArray55);
        double double57 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray55);
        double double58 = org.apache.commons.math.stat.StatUtils.sum(doubleArray55);
        double double59 = org.apache.commons.math.stat.StatUtils.max(doubleArray55);
        double[] doubleArray63 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double64 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double double66 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray63, (double) 100.0f);
        double double67 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double[] doubleArray71 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double72 = org.apache.commons.math.stat.StatUtils.mean(doubleArray71);
        double double74 = org.apache.commons.math.stat.StatUtils.variance(doubleArray71, 27.0d);
        double double76 = org.apache.commons.math.stat.StatUtils.variance(doubleArray71, (double) (byte) 10);
        double double77 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray63, doubleArray71);
        double double79 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray55, doubleArray63, (double) (short) 1);
        double double80 = org.apache.commons.math.stat.StatUtils.sum(doubleArray63);
        double double81 = org.apache.commons.math.stat.StatUtils.sum(doubleArray63);
        double[] doubleArray85 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double86 = org.apache.commons.math.stat.StatUtils.mean(doubleArray85);
        double double88 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray85, (double) 100.0f);
        double double89 = org.apache.commons.math.stat.StatUtils.variance(doubleArray85);
        double double91 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray85, (double) 1);
        double double92 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray63, doubleArray85);
        double double93 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray63);
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 101.0d + "'", double39 == 101.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 37.0d + "'", double41 == 37.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 127.0d + "'", double48 == 127.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 21.0d + "'", double50 == 21.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 7.0d + "'", double56 == 7.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.641588833612779d + "'", double57 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 21.0d + "'", double58 == 21.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 7.0d + "'", double64 == 7.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 7.0d + "'", double67 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 7.0d + "'", double72 == 7.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 27.0d + "'", double74 == 27.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 27.0d + "'", double76 == 27.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 21.0d + "'", double80 == 21.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 21.0d + "'", double81 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 7.0d + "'", double86 == 7.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 27.0d + "'", double89 == 27.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 3.0d);
        double double11 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, 37.000000000000114d);
        double double12 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 27.0d + "'", double9 == 27.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.320000000000042d + "'", double11 == 5.320000000000042d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        double double44 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double45 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.641588833612779d + "'", double44 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 201.0d + "'", double45 == 201.0d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        double double34 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray31, (double) 100.0f);
        double double35 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double[] doubleArray39 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double40 = org.apache.commons.math.stat.StatUtils.mean(doubleArray39);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, 27.0d);
        double double44 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, (double) (byte) 10);
        double double45 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray31, doubleArray39);
        double double46 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray39);
        double double47 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray39);
        double double49 = org.apache.commons.math.stat.StatUtils.variance(doubleArray39, (double) (short) 100);
        double double50 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray39);
        double[] doubleArray54 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double55 = org.apache.commons.math.stat.StatUtils.mean(doubleArray54);
        double double56 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray54);
        double double57 = org.apache.commons.math.stat.StatUtils.sum(doubleArray54);
        double[] doubleArray61 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double62 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
        double double63 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray61);
        double double64 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray61);
        double double65 = org.apache.commons.math.stat.StatUtils.max(doubleArray61);
        double double67 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray54, doubleArray61, (double) '#');
        double double68 = org.apache.commons.math.stat.StatUtils.min(doubleArray54);
        double double69 = org.apache.commons.math.stat.StatUtils.mean(doubleArray54);
        double double70 = org.apache.commons.math.stat.StatUtils.product(doubleArray54);
        double double72 = org.apache.commons.math.stat.StatUtils.variance(doubleArray54, (-5.6843418860808015E-14d));
        double double73 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray39, doubleArray54);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 7.0d + "'", double35 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 7.0d + "'", double40 == 7.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 27.0d + "'", double42 == 27.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 27.0d + "'", double44 == 27.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 201.0d + "'", double47 == 201.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 27.0d + "'", double49 == 27.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 201.0d + "'", double50 == 201.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 7.0d + "'", double55 == 7.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.641588833612779d + "'", double56 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 21.0d + "'", double57 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 7.0d + "'", double62 == 7.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.641588833612779d + "'", double63 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4.605170185988092d + "'", double64 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 7.0d + "'", double69 == 7.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 27.0d + "'", double72 == 27.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (short) 10, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double[] doubleArray5 = new double[] { '#', 10.0f, 'a', 12.0d, 37.0d };
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.math.stat.StatUtils.variance(doubleArray5, (double) 100.0f, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 10.0, 97.0, 12.0, 37.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 191.0d + "'", double6 == 191.0d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        double double69 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 9.0d + "'", double69 == 9.0d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        double double67 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52, 21.0d);
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 27.0d + "'", double67 == 27.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        double[] doubleArray61 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double62 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
        double double63 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray61);
        double double64 = org.apache.commons.math.stat.StatUtils.sum(doubleArray61);
        double double65 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray61);
        double double66 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray10, doubleArray61);
        double double67 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
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
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 7.0d + "'", double62 == 7.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.641588833612779d + "'", double63 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 21.0d + "'", double64 == 21.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4.641588833612779d + "'", double65 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-4.0d) + "'", double66 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double14 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double15 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray13);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double18 = org.apache.commons.math.stat.StatUtils.min(doubleArray13);
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double25 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray22, (double) 100.0f);
        double[] doubleArray29 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double30 = org.apache.commons.math.stat.StatUtils.mean(doubleArray29);
        double double31 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray29);
        double double32 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray29);
        double double33 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray22, doubleArray29);
        double double35 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray13, doubleArray22, (-0.9199999999999999d));
        double double36 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray22);
        double double37 = org.apache.commons.math.stat.StatUtils.product(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.641588833612779d + "'", double8 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.605170185988092d + "'", double9 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7.0d + "'", double30 == 7.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.641588833612779d + "'", double31 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.605170185988092d + "'", double32 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-2.220446049250313E-16d) + "'", double35 == (-2.220446049250313E-16d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        double double21 = org.apache.commons.math.stat.StatUtils.product(doubleArray11);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double25 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray11, 10.000000000000002d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        double double70 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray25, 27.000000000000227d);
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
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.7200000000000826d + "'", double70 == 1.7200000000000826d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (-1L), 0, 10L };
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray4, 0, 0);
        double double8 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray4);
        double double10 = org.apache.commons.math.stat.StatUtils.variance(doubleArray4, (double) 10);
        double[] doubleArray14 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray14);
        double double16 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray14);
        double double17 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray14);
        double double18 = org.apache.commons.math.stat.StatUtils.variance(doubleArray14);
        double double19 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray4, doubleArray14);
        double double20 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray4);
        double double21 = org.apache.commons.math.stat.StatUtils.variance(doubleArray4);
        double double22 = org.apache.commons.math.stat.StatUtils.min(doubleArray4);
        double[] doubleArray26 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double27 = org.apache.commons.math.stat.StatUtils.mean(doubleArray26);
        double double28 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray26);
        double double29 = org.apache.commons.math.stat.StatUtils.sum(doubleArray26);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        double double36 = org.apache.commons.math.stat.StatUtils.max(doubleArray33, 0, 0);
        double double38 = org.apache.commons.math.stat.StatUtils.variance(doubleArray33, 21.0d);
        double double40 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray26, doubleArray33, 4.605170185988092d);
        double double41 = org.apache.commons.math.stat.StatUtils.mean(doubleArray33);
        double double42 = org.apache.commons.math.stat.StatUtils.max(doubleArray33);
        double[] doubleArray46 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double47 = org.apache.commons.math.stat.StatUtils.mean(doubleArray46);
        double double49 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray46, (double) 100.0f);
        double double50 = org.apache.commons.math.stat.StatUtils.mean(doubleArray46);
        double[] doubleArray54 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double55 = org.apache.commons.math.stat.StatUtils.mean(doubleArray54);
        double double57 = org.apache.commons.math.stat.StatUtils.variance(doubleArray54, 27.0d);
        double double59 = org.apache.commons.math.stat.StatUtils.variance(doubleArray54, (double) (byte) 10);
        double double60 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray46, doubleArray54);
        double double63 = org.apache.commons.math.stat.StatUtils.variance(doubleArray46, (int) (short) 0, (int) (byte) 0);
        double double64 = org.apache.commons.math.stat.StatUtils.product(doubleArray46);
        double double66 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray33, doubleArray46, 127.0d);
        double double68 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray33, (double) ' ');
        double double70 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray4, doubleArray33, 0.0d);
        double double71 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray33);
        // The following exception was thrown during execution in test generation
        try {
            double double72 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray0, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.0d + "'", double8 == 101.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 37.0d + "'", double10 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.641588833612779d + "'", double16 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.605170185988092d + "'", double17 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 27.0d + "'", double18 == 27.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-4.0d) + "'", double19 == (-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 37.0d + "'", double21 == 37.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.0d + "'", double27 == 7.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.641588833612779d + "'", double28 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 21.0d + "'", double29 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 37.0d + "'", double38 == 37.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 127.00000000000001d + "'", double40 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 3.0d + "'", double41 == 3.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 7.0d + "'", double47 == 7.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 7.0d + "'", double50 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 7.0d + "'", double55 == 7.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 27.0d + "'", double57 == 27.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 27.0d + "'", double59 == 27.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 100.0d + "'", double64 == 100.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 127.0d + "'", double66 == 127.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-0.72d) + "'", double68 == (-0.72d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double[] doubleArray11 = new double[] { (-1L), 0, 10L };
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray11, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        double[] doubleArray19 = new double[] { (-1L), 0, 10L };
        double double22 = org.apache.commons.math.stat.StatUtils.max(doubleArray19, 0, 0);
        double double23 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray19);
        double double25 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19, (double) 10);
        double double26 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray11, doubleArray19);
        double double27 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11);
        double double29 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray11, 3.0d);
        double double30 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double31 = org.apache.commons.math.stat.StatUtils.product(doubleArray11);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double40 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double41 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray35);
        double double42 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray11, doubleArray35);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray35);
        double[] doubleArray47 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double48 = org.apache.commons.math.stat.StatUtils.mean(doubleArray47);
        double double49 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double50 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray47);
        double double51 = org.apache.commons.math.stat.StatUtils.max(doubleArray47);
        double double54 = org.apache.commons.math.stat.StatUtils.sum(doubleArray47, (int) (short) 1, 0);
        double double55 = org.apache.commons.math.stat.StatUtils.max(doubleArray47);
        double double56 = org.apache.commons.math.stat.StatUtils.min(doubleArray47);
        double double57 = org.apache.commons.math.stat.StatUtils.product(doubleArray47);
        double double58 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray47);
        double double59 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray47);
        double double60 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double62 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47, (double) (short) -1);
        double double64 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray35, doubleArray47, 26.999999999999996d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.641588833612779d + "'", double7 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 101.0d + "'", double15 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 37.0d + "'", double25 == 37.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 37.0d + "'", double27 == 37.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 127.0d + "'", double29 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 21.0d + "'", double38 == 21.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 21.0d + "'", double39 == 21.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 21.0d + "'", double40 == 21.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 201.0d + "'", double41 == 201.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-12.0d) + "'", double42 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.605170185988092d + "'", double43 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 7.0d + "'", double48 == 7.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.641588833612779d + "'", double49 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.605170185988092d + "'", double50 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 201.0d + "'", double58 == 201.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 201.0d + "'", double59 == 201.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4.641588833612779d + "'", double60 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 27.0d + "'", double62 == 27.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10);
        double double11 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) (byte) 100);
        double[] doubleArray15 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray15);
        double double18 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray15, (double) 100.0f);
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray15);
        double[] doubleArray23 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double double26 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23, 27.0d);
        double double28 = org.apache.commons.math.stat.StatUtils.variance(doubleArray23, (double) (byte) 10);
        double double29 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray15, doubleArray23);
        double double30 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray23);
        double double31 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 27.0d + "'", double26 == 27.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 27.0d + "'", double28 == 27.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-4.0d) + "'", double30 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 7.0d + "'", double31 == 7.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        double double53 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double55 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray47, (double) (byte) 100);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
        double double57 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray47);
        double double58 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray47);
        double double59 = org.apache.commons.math.stat.StatUtils.max(doubleArray47);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.641588833612779d + "'", double53 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.605170185988092d + "'", double57 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4.605170185988092d + "'", double58 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        double double77 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray10 = new double[] { (-1L), 0, 10L };
        double double13 = org.apache.commons.math.stat.StatUtils.max(doubleArray10, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10, 21.0d);
        double double17 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray10, 4.605170185988092d);
        double double19 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 1);
        double[] doubleArray23 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double double26 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray23, (double) 100.0f);
        double double27 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, 27.0d);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, (double) (byte) 10);
        double double37 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray23, doubleArray31);
        double double38 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray31);
        double double39 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray31);
        double double42 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31, (int) (byte) 1, (int) (short) 1);
        double double43 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            double double46 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.0d + "'", double27 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 27.0d + "'", double34 == 27.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 27.0d + "'", double36 == 27.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.605170185988092d + "'", double38 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.605170185988092d + "'", double39 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10L);
        double[] doubleArray15 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray15);
        double double18 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray15, (double) 100.0f);
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double24 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray22);
        double double25 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray22);
        double double26 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray15, doubleArray22);
        double[] doubleArray30 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double31 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double double32 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray30);
        double double33 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray15, doubleArray30);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray37, 0, 0);
        double double41 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray37);
        double[] doubleArray45 = new double[] { (-1L), 0, 10L };
        double double48 = org.apache.commons.math.stat.StatUtils.max(doubleArray45, 0, 0);
        double double49 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray45);
        double double51 = org.apache.commons.math.stat.StatUtils.variance(doubleArray45, (double) 10);
        double double52 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray37, doubleArray45);
        double double54 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray15, doubleArray37, 100.0d);
        double double55 = org.apache.commons.math.stat.StatUtils.variance(doubleArray15);
        double[] doubleArray59 = new double[] { (-1L), 0, 10L };
        double double62 = org.apache.commons.math.stat.StatUtils.max(doubleArray59, 0, 0);
        double double63 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray59);
        double[] doubleArray67 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double68 = org.apache.commons.math.stat.StatUtils.mean(doubleArray67);
        double double69 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray67);
        double double70 = org.apache.commons.math.stat.StatUtils.sum(doubleArray67);
        double double71 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray59, doubleArray67);
        double double72 = org.apache.commons.math.stat.StatUtils.sum(doubleArray59);
        double double75 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray59, (int) (short) 1, (int) (short) 0);
        double double76 = org.apache.commons.math.stat.StatUtils.product(doubleArray59);
        double double78 = org.apache.commons.math.stat.StatUtils.variance(doubleArray59, (double) (byte) 10);
        double double80 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray15, doubleArray59, 0.0d);
        double double81 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray59);
        double double82 = org.apache.commons.math.stat.StatUtils.product(doubleArray59);
        double double85 = org.apache.commons.math.stat.StatUtils.min(doubleArray59, (int) (short) 0, (int) (short) 1);
        double double87 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray59, 50.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.641588833612779d + "'", double9 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 27.0d + "'", double11 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.641588833612779d + "'", double24 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.605170185988092d + "'", double25 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 7.0d + "'", double31 == 7.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.641588833612779d + "'", double32 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 101.0d + "'", double41 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 101.0d + "'", double49 == 101.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 37.0d + "'", double51 == 37.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 127.0d + "'", double54 == 127.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 27.0d + "'", double55 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 101.0d + "'", double63 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 7.0d + "'", double68 == 7.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4.641588833612779d + "'", double69 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 21.0d + "'", double70 == 21.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-4.0d) + "'", double71 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 9.0d + "'", double72 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-0.0d) + "'", double76 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 37.0d + "'", double78 == 37.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 127.0d + "'", double80 == 127.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4.0d + "'", double81 == 4.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-0.0d) + "'", double82 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        double double53 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double55 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray47, (double) (byte) 100);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
        double double57 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray47);
        double double58 = org.apache.commons.math.stat.StatUtils.min(doubleArray47);
        double double59 = org.apache.commons.math.stat.StatUtils.mean(doubleArray47);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.641588833612779d + "'", double53 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.605170185988092d + "'", double57 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 7.0d + "'", double59 == 7.0d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        double double30 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray11, (double) 10.0f);
        double double31 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double double32 = org.apache.commons.math.stat.StatUtils.product(doubleArray11);
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.605170185988092d + "'", double31 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double[] doubleArray5 = new double[] { '#', 10.0f, 'a', 12.0d, 37.0d };
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = org.apache.commons.math.stat.StatUtils.product(doubleArray5, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 10.0, 97.0, 12.0, 37.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 191.0d + "'", double6 == 191.0d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray18);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 21.0d + "'", double25 == 21.0d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray10);
        double double16 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray10, (double) '#');
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double22 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray20);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        double double29 = org.apache.commons.math.stat.StatUtils.max(doubleArray26, 0, 0);
        double double30 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray26);
        double[] doubleArray34 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double35 = org.apache.commons.math.stat.StatUtils.mean(doubleArray34);
        double double36 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray34);
        double double37 = org.apache.commons.math.stat.StatUtils.sum(doubleArray34);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray26, doubleArray34);
        double double39 = org.apache.commons.math.stat.StatUtils.max(doubleArray34);
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray34);
        double[] doubleArray44 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double45 = org.apache.commons.math.stat.StatUtils.mean(doubleArray44);
        double double47 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray44, (double) 100.0f);
        double double48 = org.apache.commons.math.stat.StatUtils.mean(doubleArray44);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52, 27.0d);
        double double57 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52, (double) (byte) 10);
        double double58 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray44, doubleArray52);
        double double59 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray34, doubleArray52);
        double double60 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray34);
        double double61 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray20, doubleArray34);
        double double62 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray10, doubleArray34);
        double double63 = org.apache.commons.math.stat.StatUtils.min(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
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
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 201.0d + "'", double60 == 201.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        double double25 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray12, (-0.9199999999999999d));
        double double27 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray12, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-2.220446049250313E-16d) + "'", double25 == (-2.220446049250313E-16d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        java.lang.Class<?> wildcardClass68 = doubleArray26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double[] doubleArray5 = new double[] { '#', 10.0f, 'a', 12.0d, 37.0d };
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray5);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray5);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray5);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray5);
        double double13 = org.apache.commons.math.stat.StatUtils.variance(doubleArray5, (double) (byte) -1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 10.0, 97.0, 12.0, 37.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 191.0d + "'", double6 == 191.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 12247.0d + "'", double7 == 12247.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.267451525600872d + "'", double8 == 27.267451525600872d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1237.7d + "'", double9 == 1237.7d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.max(doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11, (int) (short) 1, 0);
        double double19 = org.apache.commons.math.stat.StatUtils.max(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.min(doubleArray11);
        double double21 = org.apache.commons.math.stat.StatUtils.max(doubleArray11);
        double double23 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray11, (double) ' ');
        double double24 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 21.0d + "'", double7 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.641588833612779d + "'", double13 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.605170185988092d + "'", double14 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 201.0d + "'", double24 == 201.0d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double14 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double15 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray13);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double17 = org.apache.commons.math.stat.StatUtils.max(doubleArray13);
        double double20 = org.apache.commons.math.stat.StatUtils.sum(doubleArray13, (int) (short) 1, 0);
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double22 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray13);
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double double32 = org.apache.commons.math.stat.StatUtils.min(doubleArray27);
        double double33 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray27);
        double double34 = org.apache.commons.math.stat.StatUtils.product(doubleArray27);
        double double35 = org.apache.commons.math.stat.StatUtils.min(doubleArray27);
        double double36 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray27);
        double double37 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray13, doubleArray27);
        double double38 = org.apache.commons.math.stat.StatUtils.variance(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.0d) + "'", double34 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 12.0d + "'", double37 == 12.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 37.0d + "'", double38 == 37.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double12 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double14 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double17 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double18 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.605170185988092d + "'", double14 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 27.0d + "'", double15 == 27.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.641588833612779d + "'", double17 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 21.0d + "'", double18 == 21.0d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray11, (double) 100.0f);
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19, 27.0d);
        double double24 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19, (double) (byte) 10);
        double double25 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray11, doubleArray19);
        double double27 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray11, (double) (short) 1);
        double double30 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11, 0, (int) (byte) 0);
        double double31 = org.apache.commons.math.stat.StatUtils.product(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double34 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 27.0d + "'", double22 == 27.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 27.0d + "'", double24 == 27.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        double double53 = org.apache.commons.math.stat.StatUtils.product(doubleArray47);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11, (int) (byte) 1, (int) (byte) 0);
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double24 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray22);
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray22);
        double double26 = org.apache.commons.math.stat.StatUtils.max(doubleArray22);
        double[] doubleArray30 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double31 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double double33 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray30, (double) 100.0f);
        double double34 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double[] doubleArray38 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double39 = org.apache.commons.math.stat.StatUtils.mean(doubleArray38);
        double double41 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, 27.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, (double) (byte) 10);
        double double44 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray30, doubleArray38);
        double double46 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray22, doubleArray30, (double) (short) 1);
        double double47 = org.apache.commons.math.stat.StatUtils.sum(doubleArray30);
        double double48 = org.apache.commons.math.stat.StatUtils.sum(doubleArray30);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray52, (double) 100.0f);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52);
        double double58 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray52, (double) 1);
        double double59 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray30, doubleArray52);
        double double60 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray11, doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = org.apache.commons.math.stat.StatUtils.max(doubleArray30, 1, (int) '4');
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.641588833612779d + "'", double24 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 21.0d + "'", double25 == 21.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 7.0d + "'", double31 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 7.0d + "'", double34 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 7.0d + "'", double39 == 7.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 27.0d + "'", double41 == 27.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 27.0d + "'", double43 == 27.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 21.0d + "'", double47 == 21.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 21.0d + "'", double48 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.0d + "'", double53 == 7.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double[] doubleArray28 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double29 = org.apache.commons.math.stat.StatUtils.mean(doubleArray28);
        double double30 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28);
        double double31 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray28);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28);
        double double34 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28);
        double double37 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28, (int) (short) 1, 0);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray28);
        double double39 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28);
        java.lang.Class<?> wildcardClass40 = doubleArray28.getClass();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7.0d + "'", double29 == 7.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.641588833612779d + "'", double30 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.605170185988092d + "'", double31 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 27.0d + "'", double32 == 27.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.605170185988092d + "'", double34 == 4.605170185988092d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.605170185988092d + "'", double39 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        double double21 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, 13.0799401015171d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid quantile value: 0.0");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray27, doubleArray35);
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray27);
        double double42 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray18, doubleArray27, 27.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray27);
        double double44 = org.apache.commons.math.stat.StatUtils.product(doubleArray27);
        double double46 = org.apache.commons.math.stat.StatUtils.variance(doubleArray27, 201.0d);
        double double47 = org.apache.commons.math.stat.StatUtils.min(doubleArray27);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray27, (int) (short) 100, 10, (double) 'a');
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 21.0d + "'", double38 == 21.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-4.0d) + "'", double39 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 127.0d + "'", double42 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.0d) + "'", double44 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 37.0d + "'", double46 == 37.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        double double53 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray47);
        double double54 = org.apache.commons.math.stat.StatUtils.sum(doubleArray47);
        double double55 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray47);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.641588833612779d + "'", double53 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 21.0d + "'", double54 == 21.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 201.0d + "'", double55 == 201.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        double double21 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double[] doubleArray25 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double26 = org.apache.commons.math.stat.StatUtils.mean(doubleArray25);
        double double27 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray25);
        double double28 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray25);
        double double29 = org.apache.commons.math.stat.StatUtils.max(doubleArray25);
        double double30 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray25);
        double double32 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray25, (-0.9199999999999999d));
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 7.0d + "'", double26 == 7.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.641588833612779d + "'", double27 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.605170185988092d + "'", double28 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.641588833612779d + "'", double30 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 127.0d + "'", double32 == 127.0d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        double double77 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double78 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid quantile value: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4.605170185988092d + "'", double78 == 4.605170185988092d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11, 1, (int) (byte) 1);
        double double17 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double20 = org.apache.commons.math.stat.StatUtils.product(doubleArray11, (int) (byte) 0, (int) (byte) 1);
        double double21 = org.apache.commons.math.stat.StatUtils.product(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.0d + "'", double17 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        double double77 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double78 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double79 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4.605170185988092d + "'", double78 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double[] doubleArray2 = new double[] { 10.0f, 0.0f };
        double double5 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray2, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        double double22 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3, (int) (byte) 0, (int) (byte) 0);
        double double23 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double24 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double25 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double26 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 101.0d + "'", double24 == 101.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        double double34 = org.apache.commons.math.stat.StatUtils.variance(doubleArray15, (-0.0d));
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 37.0d + "'", double34 == 37.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (byte) -1, (int) '#');
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
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray27, doubleArray35);
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray27);
        double double42 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray18, doubleArray27, 27.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray27);
        double double44 = org.apache.commons.math.stat.StatUtils.mean(doubleArray27);
        double[] doubleArray48 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double49 = org.apache.commons.math.stat.StatUtils.mean(doubleArray48);
        double double51 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray48, (double) 100.0f);
        double[] doubleArray55 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double56 = org.apache.commons.math.stat.StatUtils.mean(doubleArray55);
        double double57 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray55);
        double double58 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray55);
        double double59 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray48, doubleArray55);
        double[] doubleArray63 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double64 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double double65 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray63);
        double double66 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray48, doubleArray63);
        double[] doubleArray70 = new double[] { (-1L), 0, 10L };
        double double73 = org.apache.commons.math.stat.StatUtils.max(doubleArray70, 0, 0);
        double double74 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray70);
        double[] doubleArray78 = new double[] { (-1L), 0, 10L };
        double double81 = org.apache.commons.math.stat.StatUtils.max(doubleArray78, 0, 0);
        double double82 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray78);
        double double84 = org.apache.commons.math.stat.StatUtils.variance(doubleArray78, (double) 10);
        double double85 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray70, doubleArray78);
        double double87 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray48, doubleArray70, 100.0d);
        double double90 = org.apache.commons.math.stat.StatUtils.variance(doubleArray70, 1, 0);
        double double91 = org.apache.commons.math.stat.StatUtils.mean(doubleArray70);
        double double92 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray27, doubleArray70);
        double double93 = org.apache.commons.math.stat.StatUtils.max(doubleArray70);
        // The following exception was thrown during execution in test generation
        try {
            double double96 = org.apache.commons.math.stat.StatUtils.product(doubleArray70, (int) (byte) -1, 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 21.0d + "'", double38 == 21.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-4.0d) + "'", double39 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 127.0d + "'", double42 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 3.0d + "'", double44 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 7.0d + "'", double56 == 7.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.641588833612779d + "'", double57 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4.605170185988092d + "'", double58 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 7.0d + "'", double64 == 7.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4.641588833612779d + "'", double65 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 101.0d + "'", double74 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 101.0d + "'", double82 == 101.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 37.0d + "'", double84 == 37.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 127.0d + "'", double87 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 3.0d + "'", double91 == 3.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10);
        double double11 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) (short) 100);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 37.0d + "'", double9 == 37.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double[] doubleArray14 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray14);
        double double16 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray14);
        double double17 = org.apache.commons.math.stat.StatUtils.sum(doubleArray14);
        double double18 = org.apache.commons.math.stat.StatUtils.max(doubleArray14);
        double double19 = org.apache.commons.math.stat.StatUtils.variance(doubleArray14);
        double double20 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray14);
        double[] doubleArray24 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double25 = org.apache.commons.math.stat.StatUtils.mean(doubleArray24);
        double double27 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray24, (double) 100.0f);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray31);
        double double35 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray24, doubleArray31);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray31);
        double double39 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, (double) 10L);
        double double40 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray31);
        double[] doubleArray44 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double45 = org.apache.commons.math.stat.StatUtils.mean(doubleArray44);
        double double47 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray44, (double) 100.0f);
        double[] doubleArray51 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double52 = org.apache.commons.math.stat.StatUtils.mean(doubleArray51);
        double double53 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray51);
        double double54 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray51);
        double double55 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray44, doubleArray51);
        double[] doubleArray59 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double60 = org.apache.commons.math.stat.StatUtils.mean(doubleArray59);
        double double61 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray59);
        double double62 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray44, doubleArray59);
        double double63 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray59);
        double double64 = org.apache.commons.math.stat.StatUtils.variance(doubleArray59);
        double[] doubleArray68 = new double[] { (-1L), 0, 10L };
        double double71 = org.apache.commons.math.stat.StatUtils.max(doubleArray68, 0, 0);
        double double72 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray68);
        double[] doubleArray76 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double77 = org.apache.commons.math.stat.StatUtils.mean(doubleArray76);
        double double78 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray76);
        double double79 = org.apache.commons.math.stat.StatUtils.sum(doubleArray76);
        double double80 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray68, doubleArray76);
        double double81 = org.apache.commons.math.stat.StatUtils.max(doubleArray68);
        double double83 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray59, doubleArray68, 27.0d);
        double double84 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray68);
        double double85 = org.apache.commons.math.stat.StatUtils.mean(doubleArray68);
        double double86 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray68);
        double double87 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double88 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double92 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (int) (short) 0, (int) (short) 0, (double) 100);
        double double93 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.641588833612779d + "'", double16 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 21.0d + "'", double17 == 21.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 27.0d + "'", double19 == 27.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.0d + "'", double25 == 7.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.605170185988092d + "'", double34 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 27.0d + "'", double36 == 27.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 27.0d + "'", double39 == 27.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 7.0d + "'", double45 == 7.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 7.0d + "'", double52 == 7.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.641588833612779d + "'", double53 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4.605170185988092d + "'", double54 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 7.0d + "'", double60 == 7.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4.641588833612779d + "'", double61 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.641588833612779d + "'", double63 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 27.0d + "'", double64 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 101.0d + "'", double72 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 7.0d + "'", double77 == 7.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4.641588833612779d + "'", double78 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 21.0d + "'", double79 == 21.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-4.0d) + "'", double80 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 127.0d + "'", double83 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 3.0d + "'", double85 == 3.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 4.0d + "'", double86 == 4.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 4.641588833612779d + "'", double88 == 4.641588833612779d);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 7.0d + "'", double93 == 7.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        double double24 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray18);
        double double25 = org.apache.commons.math.stat.StatUtils.product(doubleArray18);
        double double26 = org.apache.commons.math.stat.StatUtils.sum(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18, 101.0d, (int) (short) 100, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 201.0d + "'", double24 == 201.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 21.0d + "'", double26 == 21.0d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        double double81 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, 27.00000000000003d);
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
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.7200000000000106d + "'", double81 == 1.7200000000000106d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray18);
        double[] doubleArray28 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double29 = org.apache.commons.math.stat.StatUtils.mean(doubleArray28);
        double double30 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28);
        double double31 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28);
        double double32 = org.apache.commons.math.stat.StatUtils.variance(doubleArray28);
        double double33 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28);
        double double34 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28);
        double double37 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28, (int) (short) 1, 0);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray28);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        double double45 = org.apache.commons.math.stat.StatUtils.max(doubleArray42, 0, 0);
        double double46 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray42);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        double double53 = org.apache.commons.math.stat.StatUtils.max(doubleArray50, 0, 0);
        double double54 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray50);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray50, (double) 10);
        double double57 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray42, doubleArray50);
        double double58 = org.apache.commons.math.stat.StatUtils.max(doubleArray50);
        double double59 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray50);
        double[] doubleArray63 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double64 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double double66 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray63, (double) 100.0f);
        double double67 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double double68 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double double70 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray50, doubleArray63, 101.0d);
        double[] doubleArray74 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double75 = org.apache.commons.math.stat.StatUtils.mean(doubleArray74);
        double double76 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray74);
        double double77 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray74);
        double double78 = org.apache.commons.math.stat.StatUtils.max(doubleArray74);
        double double81 = org.apache.commons.math.stat.StatUtils.sum(doubleArray74, (int) (short) 1, 0);
        double double84 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray74, (int) (short) 0, (int) (byte) 0);
        double double87 = org.apache.commons.math.stat.StatUtils.product(doubleArray74, 0, 0);
        double double89 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray63, doubleArray74, 27.00000000000003d);
        java.lang.Class<?> wildcardClass90 = doubleArray74.getClass();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7.0d + "'", double29 == 7.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.641588833612779d + "'", double30 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.605170185988092d + "'", double31 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 27.0d + "'", double32 == 27.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.641588833612779d + "'", double33 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.605170185988092d + "'", double34 == 4.605170185988092d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 101.0d + "'", double46 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 101.0d + "'", double54 == 101.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 37.0d + "'", double56 == 37.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4.0d + "'", double59 == 4.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 7.0d + "'", double64 == 7.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 7.0d + "'", double67 == 7.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 7.0d + "'", double68 == 7.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 127.0d + "'", double70 == 127.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 7.0d + "'", double75 == 7.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.641588833612779d + "'", double76 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.605170185988092d + "'", double77 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double[] doubleArray12 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double13 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12);
        double double15 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray12, (double) 100.0f);
        double double16 = org.apache.commons.math.stat.StatUtils.mean(doubleArray12);
        double[] doubleArray20 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double21 = org.apache.commons.math.stat.StatUtils.mean(doubleArray20);
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray20, 27.0d);
        double double25 = org.apache.commons.math.stat.StatUtils.variance(doubleArray20, (double) (byte) 10);
        double double26 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray12, doubleArray20);
        double double27 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray20);
        double[] doubleArray31 = new double[] { (-1L), 0, 10L };
        double double34 = org.apache.commons.math.stat.StatUtils.max(doubleArray31, 0, 0);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, 21.0d);
        double double37 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray20, doubleArray31);
        double double38 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray20);
        double double39 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double42 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
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
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.0d + "'", double13 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.0d + "'", double21 == 7.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 27.0d + "'", double25 == 27.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.605170185988092d + "'", double27 == 4.605170185988092d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 37.0d + "'", double36 == 37.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 12.0d + "'", double37 == 12.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.641588833612779d + "'", double39 == 4.641588833612779d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double24 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray22);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        double double31 = org.apache.commons.math.stat.StatUtils.max(doubleArray28, 0, 0);
        double double32 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray28);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        double double39 = org.apache.commons.math.stat.StatUtils.max(doubleArray36, 0, 0);
        double double40 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray36);
        double double42 = org.apache.commons.math.stat.StatUtils.variance(doubleArray36, (double) 10);
        double double43 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray28, doubleArray36);
        double double44 = org.apache.commons.math.stat.StatUtils.max(doubleArray36);
        double double45 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray36);
        double double46 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray36);
        double double47 = org.apache.commons.math.stat.StatUtils.product(doubleArray36);
        double double48 = org.apache.commons.math.stat.StatUtils.variance(doubleArray36);
        double double49 = org.apache.commons.math.stat.StatUtils.min(doubleArray36);
        double double50 = org.apache.commons.math.stat.StatUtils.variance(doubleArray36);
        // The following exception was thrown during execution in test generation
        try {
            double double53 = org.apache.commons.math.stat.StatUtils.product(doubleArray36, (int) (byte) 10, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-12.0d) + "'", double24 == (-12.0d));
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 101.0d + "'", double45 == 101.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.0d) + "'", double47 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 37.0d + "'", double48 == 37.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 37.0d + "'", double50 == 37.0d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11, (int) (byte) 1, (int) (byte) 0);
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double24 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray22);
        double double25 = org.apache.commons.math.stat.StatUtils.sum(doubleArray22);
        double double26 = org.apache.commons.math.stat.StatUtils.max(doubleArray22);
        double[] doubleArray30 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double31 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double double33 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray30, (double) 100.0f);
        double double34 = org.apache.commons.math.stat.StatUtils.mean(doubleArray30);
        double[] doubleArray38 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double39 = org.apache.commons.math.stat.StatUtils.mean(doubleArray38);
        double double41 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, 27.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.variance(doubleArray38, (double) (byte) 10);
        double double44 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray30, doubleArray38);
        double double46 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray22, doubleArray30, (double) (short) 1);
        double double47 = org.apache.commons.math.stat.StatUtils.sum(doubleArray30);
        double double48 = org.apache.commons.math.stat.StatUtils.sum(doubleArray30);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray52, (double) 100.0f);
        double double56 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52);
        double double58 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray52, (double) 1);
        double double59 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray30, doubleArray52);
        double double60 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray11, doubleArray30);
        double double61 = org.apache.commons.math.stat.StatUtils.max(doubleArray30);
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.641588833612779d + "'", double24 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 21.0d + "'", double25 == 21.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 7.0d + "'", double31 == 7.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 7.0d + "'", double34 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 7.0d + "'", double39 == 7.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 27.0d + "'", double41 == 27.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 27.0d + "'", double43 == 27.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 21.0d + "'", double47 == 21.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 21.0d + "'", double48 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.0d + "'", double53 == 7.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 27.0d + "'", double56 == 27.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3, (int) (byte) 0, 0);
        double double10 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.math.stat.StatUtils.min(doubleArray3, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double12 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double14 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.605170185988092d + "'", double14 == 4.605170185988092d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10);
        double double16 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double18 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10, (double) 10L);
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double25 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray22, (double) 100.0f);
        double[] doubleArray29 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double30 = org.apache.commons.math.stat.StatUtils.mean(doubleArray29);
        double double31 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray29);
        double double32 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray29);
        double double33 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray22, doubleArray29);
        double[] doubleArray37 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double38 = org.apache.commons.math.stat.StatUtils.mean(doubleArray37);
        double double39 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray37);
        double double40 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray22, doubleArray37);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray22, 0, 0);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        double double50 = org.apache.commons.math.stat.StatUtils.max(doubleArray47, 0, 0);
        double double51 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray47);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        double double58 = org.apache.commons.math.stat.StatUtils.max(doubleArray55, 0, 0);
        double double59 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray55);
        double double61 = org.apache.commons.math.stat.StatUtils.variance(doubleArray55, (double) 10);
        double double62 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray47, doubleArray55);
        double double63 = org.apache.commons.math.stat.StatUtils.variance(doubleArray47);
        double double64 = org.apache.commons.math.stat.StatUtils.mean(doubleArray47);
        double double67 = org.apache.commons.math.stat.StatUtils.max(doubleArray47, 0, 0);
        double double68 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray47);
        double double70 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray22, doubleArray47, (double) (short) 1);
        double double71 = org.apache.commons.math.stat.StatUtils.sum(doubleArray47);
        double double72 = org.apache.commons.math.stat.StatUtils.product(doubleArray47);
        double double74 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray10, doubleArray47, (double) (-1));
        java.lang.Class<?> wildcardClass75 = doubleArray47.getClass();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 27.0d + "'", double15 == 27.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.641588833612779d + "'", double16 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 27.0d + "'", double18 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7.0d + "'", double30 == 7.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.641588833612779d + "'", double31 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.605170185988092d + "'", double32 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 7.0d + "'", double38 == 7.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.641588833612779d + "'", double39 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 37.0d + "'", double63 == 37.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 3.0d + "'", double64 == 3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 101.0d + "'", double68 == 101.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 127.0d + "'", double70 == 127.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 9.0d + "'", double71 == 9.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-0.0d) + "'", double72 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 127.0d + "'", double74 == 127.0d);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        double double38 = org.apache.commons.math.stat.StatUtils.max(doubleArray35, 0, 0);
        double double39 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray35);
        double double41 = org.apache.commons.math.stat.StatUtils.variance(doubleArray35, (double) 10);
        double double42 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray27, doubleArray35);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray35);
        double double46 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35, 1, (int) (short) 0);
        double double48 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray18, doubleArray35, 101.0d);
        double[] doubleArray52 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double53 = org.apache.commons.math.stat.StatUtils.mean(doubleArray52);
        double double54 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray52);
        double double55 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray52);
        double double56 = org.apache.commons.math.stat.StatUtils.max(doubleArray52);
        double double57 = org.apache.commons.math.stat.StatUtils.sum(doubleArray52);
        double[] doubleArray61 = new double[] { (-1L), 0, 10L };
        double double64 = org.apache.commons.math.stat.StatUtils.max(doubleArray61, 0, 0);
        double double65 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray61);
        double[] doubleArray69 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double70 = org.apache.commons.math.stat.StatUtils.mean(doubleArray69);
        double double71 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray69);
        double double72 = org.apache.commons.math.stat.StatUtils.sum(doubleArray69);
        double double73 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray61, doubleArray69);
        double double74 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray52, doubleArray69);
        double double75 = org.apache.commons.math.stat.StatUtils.variance(doubleArray52);
        double double77 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray18, doubleArray52, 50.0d);
        double double79 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18, 27.267451525600872d);
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 101.0d + "'", double39 == 101.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 37.0d + "'", double41 == 37.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 127.0d + "'", double48 == 127.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.0d + "'", double53 == 7.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4.641588833612779d + "'", double54 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.605170185988092d + "'", double55 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 21.0d + "'", double57 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 101.0d + "'", double65 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 7.0d + "'", double70 == 7.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4.641588833612779d + "'", double71 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 21.0d + "'", double72 == 21.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-4.0d) + "'", double73 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 27.0d + "'", double75 == 27.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 27.0d + "'", double79 == 27.0d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray10);
        double double16 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray10, (double) '#');
        double[] doubleArray20 = new double[] { (-1L), 0, 10L };
        double double23 = org.apache.commons.math.stat.StatUtils.max(doubleArray20, 0, 0);
        double double24 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray20);
        double double26 = org.apache.commons.math.stat.StatUtils.variance(doubleArray20, (double) 10);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        double double33 = org.apache.commons.math.stat.StatUtils.max(doubleArray30, 0, 0);
        double double34 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray30);
        double double35 = org.apache.commons.math.stat.StatUtils.min(doubleArray30);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray30);
        double double37 = org.apache.commons.math.stat.StatUtils.variance(doubleArray30);
        double double39 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray30, (double) 100.0f);
        double double40 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray20, doubleArray30);
        double double41 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray30);
        double double42 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray10, doubleArray30);
        double double44 = org.apache.commons.math.stat.StatUtils.variance(doubleArray30, (double) 100);
        double double45 = org.apache.commons.math.stat.StatUtils.product(doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray30, 191.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid quantile value: 191.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.641588833612779d + "'", double12 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.605170185988092d + "'", double13 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 101.0d + "'", double24 == 101.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 37.0d + "'", double26 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 101.0d + "'", double34 == 101.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 37.0d + "'", double36 == 37.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 37.0d + "'", double37 == 37.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 101.0d + "'", double41 == 101.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.0d + "'", double42 == 4.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 37.0d + "'", double44 == 37.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-0.0d) + "'", double45 == (-0.0d));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.stat.StatUtils.variance(doubleArray0, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3, (int) (byte) 0, (int) (byte) 1);
        double double12 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.641588833612779d + "'", double8 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.000000000000002d + "'", double11 == 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        double double96 = org.apache.commons.math.stat.StatUtils.product(doubleArray80);
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
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 100.0d + "'", double96 == 100.0d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
        double double25 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18, 10.0d);
        double double26 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 27.0d + "'", double25 == 27.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 27.0d + "'", double26 == 27.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double double7 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double[] doubleArray11 = new double[] { (-1L), 0, 10L };
        double double14 = org.apache.commons.math.stat.StatUtils.max(doubleArray11, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.sum(doubleArray19);
        double double23 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray11, doubleArray19);
        double double24 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double27 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray11, (int) (short) 1, (int) (short) 0);
        double double28 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray11);
        double double29 = org.apache.commons.math.stat.StatUtils.variance(doubleArray11);
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray11);
        double[] doubleArray34 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double35 = org.apache.commons.math.stat.StatUtils.mean(doubleArray34);
        double double36 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray34);
        double double37 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray34);
        double double38 = org.apache.commons.math.stat.StatUtils.max(doubleArray34);
        double double41 = org.apache.commons.math.stat.StatUtils.sum(doubleArray34, (int) (short) 1, 0);
        double double42 = org.apache.commons.math.stat.StatUtils.mean(doubleArray34);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        double double49 = org.apache.commons.math.stat.StatUtils.max(doubleArray46, 0, 0);
        double double50 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray46);
        double[] doubleArray54 = new double[] { (-1L), 0, 10L };
        double double57 = org.apache.commons.math.stat.StatUtils.max(doubleArray54, 0, 0);
        double double58 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray54);
        double double60 = org.apache.commons.math.stat.StatUtils.variance(doubleArray54, (double) 10);
        double double61 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray46, doubleArray54);
        double double62 = org.apache.commons.math.stat.StatUtils.variance(doubleArray46);
        double double63 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray34, doubleArray46);
        double double64 = org.apache.commons.math.stat.StatUtils.product(doubleArray46);
        double[] doubleArray68 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double69 = org.apache.commons.math.stat.StatUtils.mean(doubleArray68);
        double double70 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray68);
        double double71 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray68);
        double double72 = org.apache.commons.math.stat.StatUtils.max(doubleArray68);
        double double75 = org.apache.commons.math.stat.StatUtils.sum(doubleArray68, (int) (short) 1, 0);
        double double76 = org.apache.commons.math.stat.StatUtils.max(doubleArray68);
        double double77 = org.apache.commons.math.stat.StatUtils.min(doubleArray68);
        double double79 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray46, doubleArray68, (double) (byte) 100);
        double double80 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray11, doubleArray46);
        double double81 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray46);
        // The following exception was thrown during execution in test generation
        try {
            double double84 = org.apache.commons.math.stat.StatUtils.min(doubleArray46, (int) (short) 100, (int) 'a');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 101.0d + "'", double15 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 21.0d + "'", double22 == 21.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-4.0d) + "'", double23 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 9.0d + "'", double24 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 12.0d + "'", double28 == 12.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 37.0d + "'", double29 == 37.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 7.0d + "'", double35 == 7.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.641588833612779d + "'", double36 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.605170185988092d + "'", double37 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 7.0d + "'", double42 == 7.0d);
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
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 37.0d + "'", double62 == 37.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.0d + "'", double63 == 4.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-0.0d) + "'", double64 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 7.0d + "'", double69 == 7.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 4.641588833612779d + "'", double70 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4.605170185988092d + "'", double71 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 127.0d + "'", double79 == 127.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        // The following exception was thrown during execution in test generation
        try {
            double double72 = org.apache.commons.math.stat.StatUtils.mean(doubleArray25, (int) 'a', (int) (byte) 100);
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (int) ' ', (int) '#', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 27.0d + "'", double8 == 27.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 201.0d + "'", double9 == 201.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.605170185988092d + "'", double10 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double[] doubleArray10 = new double[] { (-1L), 0, 10L };
        double double13 = org.apache.commons.math.stat.StatUtils.max(doubleArray10, 0, 0);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10, 21.0d);
        double double17 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray10, 4.605170185988092d);
        double double19 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 1);
        double[] doubleArray23 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double24 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double double26 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray23, (double) 100.0f);
        double double27 = org.apache.commons.math.stat.StatUtils.mean(doubleArray23);
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31);
        double double34 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, 27.0d);
        double double36 = org.apache.commons.math.stat.StatUtils.variance(doubleArray31, (double) (byte) 10);
        double double37 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray23, doubleArray31);
        double double38 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray31);
        double double39 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray31);
        double double42 = org.apache.commons.math.stat.StatUtils.mean(doubleArray31, (int) (byte) 1, (int) (short) 1);
        double double43 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (int) 'a', (int) (short) 100, (double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.0d + "'", double27 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.0d + "'", double32 == 7.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 27.0d + "'", double34 == 27.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 27.0d + "'", double36 == 27.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.605170185988092d + "'", double38 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.605170185988092d + "'", double39 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3, (int) (byte) 0, (int) (byte) 1);
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (short) 1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.000000000000002d + "'", double11 == 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) (byte) 100);
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double14 = org.apache.commons.math.stat.StatUtils.mean(doubleArray13);
        double double15 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray13);
        double double16 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double17 = org.apache.commons.math.stat.StatUtils.variance(doubleArray13);
        double double19 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray13, 37.0d);
        double double20 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray13);
        double double21 = org.apache.commons.math.stat.StatUtils.product(doubleArray13);
        double double22 = org.apache.commons.math.stat.StatUtils.max(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.605170185988092d + "'", double20 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, 27.0d);
        double double8 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (byte) 10);
        double double9 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) 10L);
        double double14 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, 0, (int) (byte) 0);
        double double15 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray19);
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19);
        double double24 = org.apache.commons.math.stat.StatUtils.min(doubleArray19);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        double double31 = org.apache.commons.math.stat.StatUtils.max(doubleArray28, 0, 0);
        double double32 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray28);
        double[] doubleArray36 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double37 = org.apache.commons.math.stat.StatUtils.mean(doubleArray36);
        double double38 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray36);
        double double39 = org.apache.commons.math.stat.StatUtils.sum(doubleArray36);
        double double40 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray28, doubleArray36);
        double double41 = org.apache.commons.math.stat.StatUtils.sum(doubleArray28);
        double double43 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray19, doubleArray28, 0.0d);
        double double44 = org.apache.commons.math.stat.StatUtils.product(doubleArray28);
        double double47 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray28, (int) (byte) 0, (int) (short) 0);
        double double48 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray28);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray28, 0, 10);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 27.0d + "'", double15 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.605170185988092d + "'", double22 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 101.0d + "'", double32 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 7.0d + "'", double37 == 7.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.641588833612779d + "'", double38 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 21.0d + "'", double39 == 21.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-4.0d) + "'", double40 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 9.0d + "'", double41 == 9.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 127.0d + "'", double43 == 127.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.0d) + "'", double44 == (-0.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 12.0d + "'", double48 == 12.0d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray27, doubleArray35);
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray27);
        double double42 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray18, doubleArray27, 27.0d);
        double[] doubleArray46 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double47 = org.apache.commons.math.stat.StatUtils.mean(doubleArray46);
        double double49 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray46, (double) 100.0f);
        double[] doubleArray53 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double54 = org.apache.commons.math.stat.StatUtils.mean(doubleArray53);
        double double55 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray53);
        double double56 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray53);
        double double57 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray46, doubleArray53);
        double[] doubleArray61 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double62 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
        double double63 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray61);
        double double64 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray46, doubleArray61);
        double double65 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
        double[] doubleArray69 = new double[] { (-1L), 0, 10L };
        double double72 = org.apache.commons.math.stat.StatUtils.max(doubleArray69, 0, 0);
        double double73 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray69);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        double double80 = org.apache.commons.math.stat.StatUtils.max(doubleArray77, 0, 0);
        double double81 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray77);
        double double83 = org.apache.commons.math.stat.StatUtils.variance(doubleArray77, (double) 10);
        double double84 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray69, doubleArray77);
        double double85 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray77);
        double double86 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray61, doubleArray77);
        double double87 = org.apache.commons.math.stat.StatUtils.max(doubleArray61);
        double double88 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray61);
        double double89 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray18, doubleArray61);
        double double90 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 21.0d + "'", double38 == 21.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-4.0d) + "'", double39 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 127.0d + "'", double42 == 127.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 7.0d + "'", double47 == 7.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 7.0d + "'", double54 == 7.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.641588833612779d + "'", double55 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.605170185988092d + "'", double56 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 7.0d + "'", double62 == 7.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.641588833612779d + "'", double63 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 7.0d + "'", double65 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 101.0d + "'", double73 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 101.0d + "'", double81 == 101.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 37.0d + "'", double83 == 37.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 101.0d + "'", double85 == 101.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 4.0d + "'", double86 == 4.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 201.0d + "'", double88 == 201.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 7.0d + "'", double90 == 7.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        double double46 = org.apache.commons.math.stat.StatUtils.sum(doubleArray18);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 21.0d + "'", double46 == 21.0d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double12 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double double14 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.math.stat.StatUtils.product(doubleArray3, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 21.0d + "'", double12 == 21.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 27.0d + "'", double14 == 27.0d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double double15 = org.apache.commons.math.stat.StatUtils.product(doubleArray10);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double21 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray19);
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19);
        double double24 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19);
        double double27 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray19, (int) (byte) 0, (int) (byte) 1);
        double double28 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double29 = org.apache.commons.math.stat.StatUtils.max(doubleArray19);
        double[] doubleArray33 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double34 = org.apache.commons.math.stat.StatUtils.mean(doubleArray33);
        double double36 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray33, (double) 100.0f);
        double[] doubleArray40 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double41 = org.apache.commons.math.stat.StatUtils.mean(doubleArray40);
        double double42 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray40);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray40);
        double double44 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray33, doubleArray40);
        double[] doubleArray48 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double49 = org.apache.commons.math.stat.StatUtils.mean(doubleArray48);
        double double50 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray48);
        double double51 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray33, doubleArray48);
        double double52 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray48);
        double[] doubleArray56 = new double[] { (-1L), 0, 10L };
        double double59 = org.apache.commons.math.stat.StatUtils.max(doubleArray56, 0, 0);
        double double60 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray56);
        double[] doubleArray64 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double65 = org.apache.commons.math.stat.StatUtils.mean(doubleArray64);
        double double66 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray64);
        double double67 = org.apache.commons.math.stat.StatUtils.sum(doubleArray64);
        double double68 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray56, doubleArray64);
        double double69 = org.apache.commons.math.stat.StatUtils.sum(doubleArray56);
        double double72 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray56, (int) (short) 1, (int) (short) 0);
        double double73 = org.apache.commons.math.stat.StatUtils.product(doubleArray56);
        double double74 = org.apache.commons.math.stat.StatUtils.max(doubleArray56);
        double double75 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray48, doubleArray56);
        double double76 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray19, doubleArray48);
        double double79 = org.apache.commons.math.stat.StatUtils.max(doubleArray48, 0, 0);
        double double80 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray48);
        double double81 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray48);
        double double83 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray10, doubleArray48, (-4.6566128730773926E-10d));
        double double84 = org.apache.commons.math.stat.StatUtils.product(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.641588833612779d + "'", double21 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.605170185988092d + "'", double22 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.641588833612779d + "'", double24 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.000000000000002d + "'", double27 == 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.0d + "'", double28 == 7.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 7.0d + "'", double34 == 7.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 7.0d + "'", double41 == 7.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.641588833612779d + "'", double42 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.605170185988092d + "'", double43 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.641588833612779d + "'", double50 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4.641588833612779d + "'", double52 == 4.641588833612779d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 101.0d + "'", double60 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 7.0d + "'", double65 == 7.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 4.641588833612779d + "'", double66 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 21.0d + "'", double67 == 21.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-4.0d) + "'", double68 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 9.0d + "'", double69 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-0.0d) + "'", double73 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 12.0d + "'", double75 == 12.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 4.641588833612779d + "'", double80 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 201.0d + "'", double81 == 201.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        double double39 = org.apache.commons.math.stat.StatUtils.max(doubleArray29);
        double double40 = org.apache.commons.math.stat.StatUtils.product(doubleArray29);
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double[] doubleArray3 = new double[] { (-1L), 0, 10L };
        double double6 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, 0, 0);
        double double7 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
        double double13 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray11);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double15 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray11);
        double double16 = org.apache.commons.math.stat.StatUtils.max(doubleArray11);
        double double17 = org.apache.commons.math.stat.StatUtils.sum(doubleArray11);
        double double18 = org.apache.commons.math.stat.StatUtils.product(doubleArray11);
        double double19 = org.apache.commons.math.stat.StatUtils.mean(doubleArray11);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 21.0d + "'", double17 == 21.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3, (int) (short) 0, (int) (byte) 0);
        double double14 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double16 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double17 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) '4', (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
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
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 21.0d + "'", double14 == 21.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        double double24 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray18);
        double double26 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray18, 4.605170185988092d);
        double double27 = org.apache.commons.math.stat.StatUtils.sum(doubleArray18);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 201.0d + "'", double24 == 201.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 21.0d + "'", double27 == 21.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        double double38 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double double7 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3, (int) (short) 0, (int) (byte) 0);
        double double12 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.0d + "'", double13 == 7.0d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        double[] doubleArray22 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray22);
        double double24 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3, (double) (short) 10, 10, (int) '#');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.641588833612779d + "'", double15 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.605170185988092d + "'", double16 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 27.0d + "'", double17 == 27.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-12.0d) + "'", double24 == (-12.0d));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        double double20 = org.apache.commons.math.stat.StatUtils.variance(doubleArray10);
        double double21 = org.apache.commons.math.stat.StatUtils.sum(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 37.0d + "'", double20 == 37.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.0d + "'", double21 == 9.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        double double84 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray75);
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
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 201.0d + "'", double84 == 201.0d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double[] doubleArray14 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double15 = org.apache.commons.math.stat.StatUtils.mean(doubleArray14);
        double double16 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray14);
        double double17 = org.apache.commons.math.stat.StatUtils.sum(doubleArray14);
        double double18 = org.apache.commons.math.stat.StatUtils.max(doubleArray14);
        double double19 = org.apache.commons.math.stat.StatUtils.variance(doubleArray14);
        double double20 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray14);
        double double21 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.641588833612779d + "'", double16 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 21.0d + "'", double17 == 21.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 27.0d + "'", double19 == 27.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 21.0d + "'", double21 == 21.0d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double10 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3, (int) (short) 1, 0);
        double double11 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double12 = org.apache.commons.math.stat.StatUtils.min(doubleArray3);
        double double13 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double[] doubleArray17 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double18 = org.apache.commons.math.stat.StatUtils.mean(doubleArray17);
        double double19 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray17);
        double double20 = org.apache.commons.math.stat.StatUtils.sum(doubleArray17);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        double double27 = org.apache.commons.math.stat.StatUtils.max(doubleArray24, 0, 0);
        double double29 = org.apache.commons.math.stat.StatUtils.variance(doubleArray24, 21.0d);
        double double31 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray17, doubleArray24, 4.605170185988092d);
        double double32 = org.apache.commons.math.stat.StatUtils.mean(doubleArray24);
        double double33 = org.apache.commons.math.stat.StatUtils.max(doubleArray24);
        double[] doubleArray37 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double38 = org.apache.commons.math.stat.StatUtils.mean(doubleArray37);
        double double39 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray37);
        double double40 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray37);
        double double41 = org.apache.commons.math.stat.StatUtils.variance(doubleArray37);
        double double42 = org.apache.commons.math.stat.StatUtils.min(doubleArray37);
        double[] doubleArray46 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double47 = org.apache.commons.math.stat.StatUtils.mean(doubleArray46);
        double double49 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray46, (double) 100.0f);
        double[] doubleArray53 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double54 = org.apache.commons.math.stat.StatUtils.mean(doubleArray53);
        double double55 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray53);
        double double56 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray53);
        double double57 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray46, doubleArray53);
        double[] doubleArray61 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double62 = org.apache.commons.math.stat.StatUtils.mean(doubleArray61);
        double double63 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray61);
        double double64 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray46, doubleArray61);
        double double65 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray61);
        double double66 = org.apache.commons.math.stat.StatUtils.variance(doubleArray61);
        double double67 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray37, doubleArray61);
        double double68 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray37);
        double double70 = org.apache.commons.math.stat.StatUtils.variance(doubleArray37, 0.0d);
        double double71 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray24, doubleArray37);
        double double73 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray24, (double) 100.0f);
        double double74 = org.apache.commons.math.stat.StatUtils.sum(doubleArray24);
        double double76 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray3, doubleArray24, 127.00000000000001d);
        double double77 = org.apache.commons.math.stat.StatUtils.variance(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.605170185988092d + "'", double6 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.0d + "'", double18 == 7.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.641588833612779d + "'", double19 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 21.0d + "'", double20 == 21.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 37.0d + "'", double29 == 37.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 127.00000000000001d + "'", double31 == 127.00000000000001d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.0d + "'", double32 == 3.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 7.0d + "'", double38 == 7.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.641588833612779d + "'", double39 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.605170185988092d + "'", double40 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 27.0d + "'", double41 == 27.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 7.0d + "'", double47 == 7.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 7.0d + "'", double54 == 7.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.641588833612779d + "'", double55 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.605170185988092d + "'", double56 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 7.0d + "'", double62 == 7.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4.641588833612779d + "'", double63 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4.641588833612779d + "'", double65 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 27.0d + "'", double66 == 27.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 201.0d + "'", double68 == 201.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 27.0d + "'", double70 == 27.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-12.0d) + "'", double71 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 9.0d + "'", double74 == 9.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 127.00000000000364d + "'", double76 == 127.00000000000364d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 27.0d + "'", double77 == 27.0d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double5 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double7 = org.apache.commons.math.stat.StatUtils.sum(doubleArray3);
        double double8 = org.apache.commons.math.stat.StatUtils.max(doubleArray3);
        double double9 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.641588833612779d + "'", double5 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 21.0d + "'", double7 == 21.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        double double69 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray25);
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
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4.641588833612779d + "'", double69 == 4.641588833612779d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray27, doubleArray35);
        double double40 = org.apache.commons.math.stat.StatUtils.max(doubleArray27);
        double double42 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray18, doubleArray27, 27.0d);
        double double43 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray27);
        double double44 = org.apache.commons.math.stat.StatUtils.mean(doubleArray27);
        double[] doubleArray48 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double49 = org.apache.commons.math.stat.StatUtils.mean(doubleArray48);
        double double51 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray48, (double) 100.0f);
        double[] doubleArray55 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double56 = org.apache.commons.math.stat.StatUtils.mean(doubleArray55);
        double double57 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray55);
        double double58 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray55);
        double double59 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray48, doubleArray55);
        double[] doubleArray63 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double64 = org.apache.commons.math.stat.StatUtils.mean(doubleArray63);
        double double65 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray63);
        double double66 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray48, doubleArray63);
        double[] doubleArray70 = new double[] { (-1L), 0, 10L };
        double double73 = org.apache.commons.math.stat.StatUtils.max(doubleArray70, 0, 0);
        double double74 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray70);
        double[] doubleArray78 = new double[] { (-1L), 0, 10L };
        double double81 = org.apache.commons.math.stat.StatUtils.max(doubleArray78, 0, 0);
        double double82 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray78);
        double double84 = org.apache.commons.math.stat.StatUtils.variance(doubleArray78, (double) 10);
        double double85 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray70, doubleArray78);
        double double87 = org.apache.commons.math.stat.StatUtils.varianceDifference(doubleArray48, doubleArray70, 100.0d);
        double double90 = org.apache.commons.math.stat.StatUtils.variance(doubleArray70, 1, 0);
        double double91 = org.apache.commons.math.stat.StatUtils.mean(doubleArray70);
        double double92 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray27, doubleArray70);
        double double93 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray27);
        double double94 = org.apache.commons.math.stat.StatUtils.sum(doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 21.0d + "'", double38 == 21.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-4.0d) + "'", double39 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 127.0d + "'", double42 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 3.0d + "'", double44 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 7.0d + "'", double56 == 7.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.641588833612779d + "'", double57 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4.605170185988092d + "'", double58 == 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 7.0d + "'", double64 == 7.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4.641588833612779d + "'", double65 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 101.0d + "'", double74 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 101.0d + "'", double82 == 101.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 37.0d + "'", double84 == 37.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 127.0d + "'", double87 == 127.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 3.0d + "'", double91 == 3.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 9.0d + "'", double94 == 9.0d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double4 = org.apache.commons.math.stat.StatUtils.mean(doubleArray3);
        double double6 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray3, (double) 100.0f);
        double[] doubleArray10 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double11 = org.apache.commons.math.stat.StatUtils.mean(doubleArray10);
        double double12 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray10);
        double double13 = org.apache.commons.math.stat.StatUtils.sumLog(doubleArray10);
        double double14 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray3, doubleArray10);
        double double15 = org.apache.commons.math.stat.StatUtils.product(doubleArray3);
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double20 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double double22 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray19, (double) 100.0f);
        double double23 = org.apache.commons.math.stat.StatUtils.mean(doubleArray19);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        double double30 = org.apache.commons.math.stat.StatUtils.max(doubleArray27, 0, 0);
        double double31 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27);
        double[] doubleArray35 = new double[] { (byte) 10, (byte) 10, (short) 1 };
        double double36 = org.apache.commons.math.stat.StatUtils.mean(doubleArray35);
        double double37 = org.apache.commons.math.stat.StatUtils.geometricMean(doubleArray35);
        double double38 = org.apache.commons.math.stat.StatUtils.sum(doubleArray35);
        double double39 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray27, doubleArray35);
        double double40 = org.apache.commons.math.stat.StatUtils.sum(doubleArray27);
        double double43 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray27, (int) (short) 1, (int) (short) 0);
        double double44 = org.apache.commons.math.stat.StatUtils.sumDifference(doubleArray19, doubleArray27);
        double double46 = org.apache.commons.math.stat.StatUtils.variance(doubleArray19, 201.0d);
        double double47 = org.apache.commons.math.stat.StatUtils.meanDifference(doubleArray3, doubleArray19);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = org.apache.commons.math.stat.StatUtils.percentile(doubleArray19, (int) (short) -1, (int) (byte) 100, (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 7.0d + "'", double23 == 7.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 101.0d + "'", double31 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.0d + "'", double36 == 7.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.641588833612779d + "'", double37 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 21.0d + "'", double38 == 21.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-4.0d) + "'", double39 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 9.0d + "'", double40 == 9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 12.0d + "'", double44 == 12.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 27.0d + "'", double46 == 27.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.stat.StatUtils.sumSq(doubleArray0, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        double double23 = org.apache.commons.math.stat.StatUtils.variance(doubleArray18);
        double double24 = org.apache.commons.math.stat.StatUtils.sum(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = org.apache.commons.math.stat.StatUtils.min(doubleArray18, (int) (byte) -1, 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.0d + "'", double19 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.641588833612779d + "'", double20 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.641588833612779d + "'", double22 == 4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 27.0d + "'", double23 == 27.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 21.0d + "'", double24 == 21.0d);
    }
}

