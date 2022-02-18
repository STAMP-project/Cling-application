import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double[] doubleArray4 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            double double8 = variance2.evaluate(doubleArray4, (double) 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 0, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double[] doubleArray7 = new double[] { 1L, '#', 10.0d, Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            double double11 = variance2.evaluate(doubleArray7, 0.0d, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 35.0, 10.0, NaN]");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.increment((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) -1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (short) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-1.0f), (double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.619275968248924E151d + "'", double1 == 9.619275968248924E151d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (byte) 1, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        boolean boolean3 = variance2.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray11 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double12 = sum4.evaluate(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = variance2.evaluate(doubleArray11, (double) (short) 100, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 310.0d + "'", double12 == 310.0d);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics1 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = geometricMean1.getSumLogImpl();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = geometricMean1.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        boolean boolean3 = variance2.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray11 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double12 = sum4.evaluate(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = variance2.evaluate(doubleArray11, (-1), 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 310.0d + "'", double12 == 310.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = mean1.evaluate(doubleArray10, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = geometricMean1.getSumLogImpl();
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.increment((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum0.clear();
        sum0.clear();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = sum0.evaluate(doubleArray10, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs5);
        org.apache.commons.math.stat.descriptive.rank.Max max7 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long8 = max7.getN();
        geometricMean6.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray17 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double18 = sum10.evaluate(doubleArray17);
        geometricMean6.incrementAll(doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = max2.evaluate(doubleArray17, 51, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 310.0d + "'", double18 == 310.0d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment5);
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray14 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double15 = sum7.evaluate(doubleArray14);
        double[] doubleArray22 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double25 = sum7.evaluate(doubleArray22, 0, 0);
        double double28 = mean6.evaluate(doubleArray22, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = max2.evaluate(doubleArray22, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 310.0d + "'", double15 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        org.apache.commons.math.stat.descriptive.rank.Max max1 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long2 = max1.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs3 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean4 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs3);
        org.apache.commons.math.stat.descriptive.rank.Max max5 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long6 = max5.getN();
        geometricMean4.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max5);
        org.apache.commons.math.stat.descriptive.summary.Sum sum8 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray15 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double16 = sum8.evaluate(doubleArray15);
        geometricMean4.incrementAll(doubleArray15);
        double double18 = max1.evaluate(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = sumOfSquares0.evaluate(doubleArray15, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 310.0d + "'", double16 == 310.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = variance2.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        double double2 = variance0.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs3 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean4 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs3);
        org.apache.commons.math.stat.descriptive.rank.Max max5 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long6 = max5.getN();
        geometricMean4.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max5);
        org.apache.commons.math.stat.descriptive.summary.Sum sum8 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray15 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double16 = sum8.evaluate(doubleArray15);
        geometricMean4.incrementAll(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            variance0.incrementAll(doubleArray15, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 310.0d + "'", double16 == 310.0d);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        java.lang.Class<?> wildcardClass2 = statisticalSummary1.getClass();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.482323362278656d + "'", double2 == 30.482323362278656d);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long1 = max0.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.rank.Max max4 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long5 = max4.getN();
        geometricMean3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray14 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double15 = sum7.evaluate(doubleArray14);
        geometricMean3.incrementAll(doubleArray14);
        double double17 = max0.evaluate(doubleArray14);
        max0.increment((double) 35);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean21 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment20);
        org.apache.commons.math.stat.descriptive.summary.Sum sum22 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray29 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double30 = sum22.evaluate(doubleArray29);
        double[] doubleArray37 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double40 = sum22.evaluate(doubleArray37, 0, 0);
        double double43 = mean21.evaluate(doubleArray37, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            max0.incrementAll(doubleArray37, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 310.0d + "'", double15 == 310.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 310.0d + "'", double30 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double double2 = org.apache.commons.math.util.MathUtils.round(Double.NaN, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            mean1.incrementAll(doubleArray10, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        float float2 = org.apache.commons.math.util.MathUtils.round(1.0f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        mean1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean5 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        double[] doubleArray21 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double24 = sum6.evaluate(doubleArray21, 0, 0);
        double double27 = mean5.evaluate(doubleArray21, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs28 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean29 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs28);
        org.apache.commons.math.stat.descriptive.rank.Max max30 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long31 = max30.getN();
        geometricMean29.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray40 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double41 = sum33.evaluate(doubleArray40);
        geometricMean29.incrementAll(doubleArray40);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean45 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment44);
        org.apache.commons.math.stat.descriptive.summary.Sum sum46 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray53 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double54 = sum46.evaluate(doubleArray53);
        double[] doubleArray61 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double64 = sum46.evaluate(doubleArray61, 0, 0);
        double double67 = mean45.evaluate(doubleArray61, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs68 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean69 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs68);
        org.apache.commons.math.stat.descriptive.rank.Max max70 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long71 = max70.getN();
        geometricMean69.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max70);
        org.apache.commons.math.stat.descriptive.summary.Sum sum73 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray80 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double81 = sum73.evaluate(doubleArray80);
        geometricMean69.incrementAll(doubleArray80);
        boolean boolean83 = org.apache.commons.math.util.MathUtils.equals(doubleArray61, doubleArray80);
        boolean boolean84 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            mean1.incrementAll(doubleArray21, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 310.0d + "'", double41 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 310.0d + "'", double54 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 310.0d + "'", double81 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 51, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.rank.Max max4 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long5 = max4.getN();
        geometricMean3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray14 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double15 = sum7.evaluate(doubleArray14);
        geometricMean3.incrementAll(doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = sumOfLogs0.evaluate(doubleArray14, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 310.0d + "'", double15 == 310.0d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1076101120 + "'", int1 == 1076101120);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray12 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double13 = sum5.evaluate(doubleArray12);
        geometricMean1.incrementAll(doubleArray12);
        double double15 = geometricMean1.getResult();
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray23 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double24 = sum16.evaluate(doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = geometricMean1.evaluate(doubleArray23, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 310.0d + "'", double13 == 310.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.730777995336729E7d + "'", double15 == 1.730777995336729E7d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 310.0d + "'", double24 == 310.0d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(100L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance7.clear();
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance7);
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            variance7.incrementAll(doubleArray10, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs1 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs1);
        org.apache.commons.math.stat.descriptive.rank.Max max3 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long4 = max3.getN();
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max3);
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        geometricMean2.incrementAll(doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = sumOfLogs0.evaluate(doubleArray13, (int) ' ', 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(10L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        double[] doubleArray18 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double21 = sum3.evaluate(doubleArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = sumOfLogs0.evaluate(doubleArray18, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray22 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double23 = sum15.evaluate(doubleArray22);
        double[] doubleArray30 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double33 = sum15.evaluate(doubleArray30, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            max12.incrementAll(doubleArray30, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 310.0d + "'", double23 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = variance2.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        boolean boolean3 = variance2.isBiasCorrected();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = variance2.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(51, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) 100, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double1 = sumOfSquares0.getResult();
        sumOfSquares0.clear();
        sumOfSquares0.increment((double) 10);
        double double5 = sumOfSquares0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) Float.NaN, 51, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 10, 1076101120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1076101120 + "'", int2 == 1076101120);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1076101120 + "'", int1 == 1076101120);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        summaryStatistics0.addValue((double) '#');
        double double8 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1.730777995336729E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double1 = sumOfSquares0.getResult();
        sumOfSquares0.clear();
        sumOfSquares0.increment((double) 10);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs5);
        org.apache.commons.math.stat.descriptive.rank.Max max7 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long8 = max7.getN();
        geometricMean6.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray17 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double18 = sum10.evaluate(doubleArray17);
        geometricMean6.incrementAll(doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = sumOfSquares0.evaluate(doubleArray17, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 310.0d + "'", double18 == 310.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long3 = variance2.getN();
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = variance2.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray8 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double9 = sum1.evaluate(doubleArray8);
        double[] doubleArray16 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double19 = sum1.evaluate(doubleArray16, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = mean0.evaluate(doubleArray16, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 310.0d + "'", double9 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean2 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment1);
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        double[] doubleArray18 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double21 = sum3.evaluate(doubleArray18, 0, 0);
        double double24 = mean2.evaluate(doubleArray18, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs25 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean26 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs25);
        org.apache.commons.math.stat.descriptive.rank.Max max27 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long28 = max27.getN();
        geometricMean26.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max27);
        org.apache.commons.math.stat.descriptive.summary.Sum sum30 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray37 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double38 = sum30.evaluate(doubleArray37);
        geometricMean26.incrementAll(doubleArray37);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray18, doubleArray37);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean42 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment41);
        org.apache.commons.math.stat.descriptive.summary.Sum sum43 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray50 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double51 = sum43.evaluate(doubleArray50);
        double[] doubleArray58 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double61 = sum43.evaluate(doubleArray58, 0, 0);
        double double64 = mean42.evaluate(doubleArray58, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs65 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean66 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs65);
        org.apache.commons.math.stat.descriptive.rank.Max max67 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long68 = max67.getN();
        geometricMean66.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max67);
        org.apache.commons.math.stat.descriptive.summary.Sum sum70 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray77 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double78 = sum70.evaluate(doubleArray77);
        geometricMean66.incrementAll(doubleArray77);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equals(doubleArray58, doubleArray77);
        boolean boolean81 = org.apache.commons.math.util.MathUtils.equals(doubleArray18, doubleArray58);
        // The following exception was thrown during execution in test generation
        try {
            double double84 = min0.evaluate(doubleArray58, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 310.0d + "'", double38 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 310.0d + "'", double51 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 310.0d + "'", double78 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-10L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        double double7 = summaryStatistics0.getStandardDeviation();
        long long8 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) Float.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1, 101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = sum1.getN();
        double double5 = sum1.getResult();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        double double6 = summaryStatistics0.getGeometricMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        double double3 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray12 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double13 = sum5.evaluate(doubleArray12);
        double[] doubleArray20 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double23 = sum5.evaluate(doubleArray20, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            storelessUnivariateStatistic4.incrementAll(doubleArray20, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 310.0d + "'", double13 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.summary.Sum sum2 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray9 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double10 = sum2.evaluate(doubleArray9);
        double[] doubleArray17 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double20 = sum2.evaluate(doubleArray17, 0, 0);
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = storelessUnivariateStatistic1.evaluate(doubleArray17, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 310.0d + "'", double10 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2050442118 + "'", int21 == 2050442118);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        boolean boolean3 = sumOfLogs0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean5 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        double[] doubleArray21 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double24 = sum6.evaluate(doubleArray21, 0, 0);
        double double27 = mean5.evaluate(doubleArray21, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance28.clear();
        double double30 = variance28.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max31 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long32 = max31.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs33 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean34 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs33);
        org.apache.commons.math.stat.descriptive.rank.Max max35 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long36 = max35.getN();
        geometricMean34.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max35);
        org.apache.commons.math.stat.descriptive.summary.Sum sum38 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray45 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double46 = sum38.evaluate(doubleArray45);
        geometricMean34.incrementAll(doubleArray45);
        double double48 = max31.evaluate(doubleArray45);
        double double49 = variance28.evaluate(doubleArray45);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean51 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment50);
        org.apache.commons.math.stat.descriptive.summary.Sum sum52 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray59 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double60 = sum52.evaluate(doubleArray59);
        double[] doubleArray67 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double70 = sum52.evaluate(doubleArray67, 0, 0);
        double double73 = mean51.evaluate(doubleArray67, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs74 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean75 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs74);
        org.apache.commons.math.stat.descriptive.rank.Max max76 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long77 = max76.getN();
        geometricMean75.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max76);
        org.apache.commons.math.stat.descriptive.summary.Sum sum79 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray86 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double87 = sum79.evaluate(doubleArray86);
        geometricMean75.incrementAll(doubleArray86);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray67, doubleArray86);
        double double90 = variance28.evaluate(doubleArray86);
        boolean boolean91 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray86);
        double double92 = sumOfLogs2.evaluate(doubleArray86);
        // The following exception was thrown during execution in test generation
        try {
            double double95 = geometricMean1.evaluate(doubleArray86, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 310.0d + "'", double46 == 310.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2817.0666666666666d + "'", double49 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 310.0d + "'", double60 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 310.0d + "'", double87 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 2817.0666666666666d + "'", double90 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        variance6.increment((double) 1);
        org.apache.commons.math.stat.descriptive.rank.Max max11 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long12 = max11.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs13 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean14 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs13);
        org.apache.commons.math.stat.descriptive.rank.Max max15 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long16 = max15.getN();
        geometricMean14.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max15);
        org.apache.commons.math.stat.descriptive.summary.Sum sum18 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray25 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double26 = sum18.evaluate(doubleArray25);
        geometricMean14.incrementAll(doubleArray25);
        double double28 = max11.evaluate(doubleArray25);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = variance6.evaluate(doubleArray25, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 310.0d + "'", double26 == 310.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3200 + "'", int2 == 3200);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment2);
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray11 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double12 = sum4.evaluate(doubleArray11);
        double[] doubleArray19 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double22 = sum4.evaluate(doubleArray19, 0, 0);
        double double25 = mean3.evaluate(doubleArray19, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance26.clear();
        double double28 = variance26.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max29 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long30 = max29.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs31 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean32 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs31);
        org.apache.commons.math.stat.descriptive.rank.Max max33 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long34 = max33.getN();
        geometricMean32.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max33);
        org.apache.commons.math.stat.descriptive.summary.Sum sum36 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray43 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double44 = sum36.evaluate(doubleArray43);
        geometricMean32.incrementAll(doubleArray43);
        double double46 = max29.evaluate(doubleArray43);
        double double47 = variance26.evaluate(doubleArray43);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean49 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment48);
        org.apache.commons.math.stat.descriptive.summary.Sum sum50 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray57 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double58 = sum50.evaluate(doubleArray57);
        double[] doubleArray65 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double68 = sum50.evaluate(doubleArray65, 0, 0);
        double double71 = mean49.evaluate(doubleArray65, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs72 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean73 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs72);
        org.apache.commons.math.stat.descriptive.rank.Max max74 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long75 = max74.getN();
        geometricMean73.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max74);
        org.apache.commons.math.stat.descriptive.summary.Sum sum77 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray84 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double85 = sum77.evaluate(doubleArray84);
        geometricMean73.incrementAll(doubleArray84);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray65, doubleArray84);
        double double88 = variance26.evaluate(doubleArray84);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray84);
        double double90 = sumOfLogs0.evaluate(doubleArray84);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares91 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares91.increment(9.619275968248924E151d);
        double double94 = sumOfSquares91.getResult();
        double[] doubleArray96 = new double[] { 1.0d };
        sumOfSquares91.incrementAll(doubleArray96);
        boolean boolean98 = org.apache.commons.math.util.MathUtils.equals(doubleArray84, doubleArray96);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 310.0d + "'", double12 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 310.0d + "'", double44 == 310.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2817.0666666666666d + "'", double47 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 310.0d + "'", double58 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 310.0d + "'", double85 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 2817.0666666666666d + "'", double88 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 9.253047015333127E303d + "'", double94 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 10.0f, 9.253047015333127E303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.253047015333128E303d + "'", double2 == 9.253047015333128E303d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1076101120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104152832 + "'", int1 == 1104152832);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-51), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.831853071795862d + "'", double2 == 11.831853071795862d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 3200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3200 + "'", int2 == 3200);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        mean1.clear();
        double double4 = mean1.getResult();
        mean1.increment(0.0d);
        double[] doubleArray13 = new double[] { 'a', 10L, 0.0d, 3200, (byte) -1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            double double16 = mean1.evaluate(doubleArray13, 51, 2050442118);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 10.0, 0.0, 3200.0, -1.0, 10.0]");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(0, 1076101120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(9.253047015333127E303d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2181642514249999E288d) + "'", double2 == (-1.2181642514249999E288d));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long1 = max0.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.rank.Max max4 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long5 = max4.getN();
        geometricMean3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray14 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double15 = sum7.evaluate(doubleArray14);
        geometricMean3.incrementAll(doubleArray14);
        double double17 = max0.evaluate(doubleArray14);
        max0.increment((double) 35);
        double double20 = max0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 310.0d + "'", double15 == 310.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        double double3 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMinImpl();
        double double5 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.730777995336729E7d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.892060179263353d + "'", double2 == 10.892060179263353d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(3200, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3190 + "'", int2 == 3190);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean5 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        double[] doubleArray21 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double24 = sum6.evaluate(doubleArray21, 0, 0);
        double double27 = mean5.evaluate(doubleArray21, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs28 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean29 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs28);
        org.apache.commons.math.stat.descriptive.rank.Max max30 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long31 = max30.getN();
        geometricMean29.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray40 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double41 = sum33.evaluate(doubleArray40);
        geometricMean29.incrementAll(doubleArray40);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean45 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment44);
        org.apache.commons.math.stat.descriptive.summary.Sum sum46 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray53 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double54 = sum46.evaluate(doubleArray53);
        double[] doubleArray61 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double64 = sum46.evaluate(doubleArray61, 0, 0);
        double double67 = mean45.evaluate(doubleArray61, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs68 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean69 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs68);
        org.apache.commons.math.stat.descriptive.rank.Max max70 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long71 = max70.getN();
        geometricMean69.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max70);
        org.apache.commons.math.stat.descriptive.summary.Sum sum73 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray80 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double81 = sum73.evaluate(doubleArray80);
        geometricMean69.incrementAll(doubleArray80);
        boolean boolean83 = org.apache.commons.math.util.MathUtils.equals(doubleArray61, doubleArray80);
        boolean boolean84 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = sumOfLogs0.evaluate(doubleArray61, 1076101120, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 310.0d + "'", double41 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 310.0d + "'", double54 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 310.0d + "'", double81 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1104152832, 62);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.104152832E9d + "'", double2 == 1.104152832E9d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        double[] doubleArray15 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double18 = sum0.evaluate(doubleArray15, 0, 0);
        sum0.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs20 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean21 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs20);
        org.apache.commons.math.stat.descriptive.rank.Max max22 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long23 = max22.getN();
        geometricMean21.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max22);
        org.apache.commons.math.stat.descriptive.summary.Sum sum25 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray32 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double33 = sum25.evaluate(doubleArray32);
        geometricMean21.incrementAll(doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = sum0.evaluate(doubleArray32, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 310.0d + "'", double33 == 310.0d);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        double double2 = variance0.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max3 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long4 = max3.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs5);
        org.apache.commons.math.stat.descriptive.rank.Max max7 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long8 = max7.getN();
        geometricMean6.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray17 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double18 = sum10.evaluate(doubleArray17);
        geometricMean6.incrementAll(doubleArray17);
        double double20 = max3.evaluate(doubleArray17);
        double double21 = variance0.evaluate(doubleArray17);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs22 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean23 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs22);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean24 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs22);
        org.apache.commons.math.stat.descriptive.summary.Sum sum25 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray32 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double33 = sum25.evaluate(doubleArray32);
        double double34 = sumOfLogs22.evaluate(doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            variance0.incrementAll(doubleArray32, (int) (byte) 0, 3190);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 310.0d + "'", double18 == 310.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2817.0666666666666d + "'", double21 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 310.0d + "'", double33 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1104152832, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1041528319999998E9d + "'", double2 == 1.1041528319999998E9d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int1 = org.apache.commons.math.util.MathUtils.sign(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        summaryStatistics0.clear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        geometricMean1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum9 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray16 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double17 = sum9.evaluate(doubleArray16);
        double[] doubleArray24 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double27 = sum9.evaluate(doubleArray24, 0, 0);
        double double30 = mean8.evaluate(doubleArray24, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs31 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean32 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs31);
        org.apache.commons.math.stat.descriptive.rank.Max max33 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long34 = max33.getN();
        geometricMean32.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max33);
        org.apache.commons.math.stat.descriptive.summary.Sum sum36 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray43 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double44 = sum36.evaluate(doubleArray43);
        geometricMean32.incrementAll(doubleArray43);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray43);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = geometricMean1.evaluate(doubleArray24, 1, 3200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 310.0d + "'", double17 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 310.0d + "'", double44 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(2817.0666666666666d, 1104152832, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int1 = org.apache.commons.math.util.MathUtils.hash(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1072693248 + "'", int1 == 1072693248);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1, 1072693248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max0.increment((double) 1L);
        max0.clear();
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        summaryStatistics0.clear();
        double double3 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long1 = max0.getN();
        double double2 = max0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) '#', 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs7);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance9.clear();
        double double11 = variance9.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max12 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long13 = max12.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs14 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean15 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs14);
        org.apache.commons.math.stat.descriptive.rank.Max max16 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long17 = max16.getN();
        geometricMean15.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max16);
        org.apache.commons.math.stat.descriptive.summary.Sum sum19 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray26 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double27 = sum19.evaluate(doubleArray26);
        geometricMean15.incrementAll(doubleArray26);
        double double29 = max12.evaluate(doubleArray26);
        double double30 = variance9.evaluate(doubleArray26);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean32 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment31);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray40 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double41 = sum33.evaluate(doubleArray40);
        double[] doubleArray48 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double51 = sum33.evaluate(doubleArray48, 0, 0);
        double double54 = mean32.evaluate(doubleArray48, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs55 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean56 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs55);
        org.apache.commons.math.stat.descriptive.rank.Max max57 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long58 = max57.getN();
        geometricMean56.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max57);
        org.apache.commons.math.stat.descriptive.summary.Sum sum60 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray67 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double68 = sum60.evaluate(doubleArray67);
        geometricMean56.incrementAll(doubleArray67);
        boolean boolean70 = org.apache.commons.math.util.MathUtils.equals(doubleArray48, doubleArray67);
        double double71 = variance9.evaluate(doubleArray67);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares72 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares72.increment(9.619275968248924E151d);
        double double75 = sumOfSquares72.getResult();
        double[] doubleArray77 = new double[] { 1.0d };
        sumOfSquares72.incrementAll(doubleArray77);
        double double79 = variance9.evaluate(doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            double double82 = sumOfLogs7.evaluate(doubleArray77, (int) (short) 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 310.0d + "'", double27 == 310.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2817.0666666666666d + "'", double30 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 310.0d + "'", double41 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 310.0d + "'", double68 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2817.0666666666666d + "'", double71 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 9.253047015333127E303d + "'", double75 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(51, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        double double2 = variance0.getResult();
        long long3 = variance0.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs4 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean5 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs4);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares6.increment(9.619275968248924E151d);
        double double9 = sumOfSquares6.getResult();
        double[] doubleArray11 = new double[] { 1.0d };
        sumOfSquares6.incrementAll(doubleArray11);
        sumOfLogs4.incrementAll(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = variance0.evaluate(doubleArray11, 1.0d, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.253047015333127E303d + "'", double9 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum3.clear();
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        double double9 = summaryStatistics7.getSum();
        double double10 = summaryStatistics7.getGeometricMean();
        double double11 = summaryStatistics7.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics7.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics7.getSumImpl();
        summaryStatistics2.setSumImpl(storelessUnivariateStatistic13);
        boolean boolean15 = variance1.equals((java.lang.Object) summaryStatistics2);
        double[] doubleArray19 = new double[] { (-1L), (byte) -1, 11.831853071795862d };
        // The following exception was thrown during execution in test generation
        try {
            double double22 = variance1.evaluate(doubleArray19, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 11.831853071795862]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        long long2 = variance0.getN();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        java.lang.Class<?> wildcardClass3 = geometricMean2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics3.getSumsqImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = variance2.equals((java.lang.Object) storelessUnivariateStatistic4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-10L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1071382528) + "'", int1 == (-1071382528));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1072693248);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 101L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        double[] doubleArray15 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double18 = sum0.evaluate(doubleArray15, 0, 0);
        sum0.clear();
        double double20 = sum0.getResult();
        org.apache.commons.math.stat.descriptive.summary.Sum sum21 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray28 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double29 = sum21.evaluate(doubleArray28);
        double[] doubleArray36 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double39 = sum21.evaluate(doubleArray36, 0, 0);
        int int40 = org.apache.commons.math.util.MathUtils.hash(doubleArray36);
        // The following exception was thrown during execution in test generation
        try {
            double double43 = sum0.evaluate(doubleArray36, (int) (short) 1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 310.0d + "'", double29 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2050442118 + "'", int40 == 2050442118);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        mean1.clear();
        double double4 = mean1.getResult();
        mean1.increment(0.0d);
        org.apache.commons.math.stat.descriptive.rank.Max max7 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long8 = max7.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs9 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean10 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs9);
        org.apache.commons.math.stat.descriptive.rank.Max max11 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long12 = max11.getN();
        geometricMean10.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max11);
        org.apache.commons.math.stat.descriptive.summary.Sum sum14 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray21 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double22 = sum14.evaluate(doubleArray21);
        geometricMean10.incrementAll(doubleArray21);
        double double24 = max7.evaluate(doubleArray21);
        // The following exception was thrown during execution in test generation
        try {
            mean1.incrementAll(doubleArray21, 1072693279, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 310.0d + "'", double22 == 310.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-51));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        long long5 = max2.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1071382528), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1071382528));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double1 = org.apache.commons.math.util.MathUtils.sign(1.104152832E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = geometricMean1.getSumLogImpl();
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.increment((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        long long3 = variance1.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum5.clear();
        summaryStatistics4.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        long long8 = summaryStatistics4.getN();
        java.lang.String str9 = summaryStatistics4.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long11 = variance10.getN();
        summaryStatistics4.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance10);
        double double13 = summaryStatistics4.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long15 = secondMoment14.getN();
        secondMoment14.increment((double) (-1));
        summaryStatistics4.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment14);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics4.getMeanImpl();
        boolean boolean20 = variance1.equals((java.lang.Object) storelessUnivariateStatistic19);
        long long21 = variance1.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str9, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(3190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(2050442118, 3200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2050438918 + "'", int2 == 2050438918);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        double[] doubleArray0 = null;
        int int1 = org.apache.commons.math.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) 1, 1072693248, (int) (short) 1);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-10L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        long long5 = geometricMean1.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = geometricMean1.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
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
        double double97 = sumOfLogs7.evaluate(doubleArray91);
        geometricMean1.incrementAll(doubleArray91);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
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
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1L), (long) 3190);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3191L) + "'", long2 == (-3191L));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        double double10 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) '#', 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int1 = org.apache.commons.math.util.MathUtils.hash(10.892060179263353d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1552271548 + "'", int1 == 1552271548);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 0, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment2);
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray11 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double12 = sum4.evaluate(doubleArray11);
        double[] doubleArray19 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double22 = sum4.evaluate(doubleArray19, 0, 0);
        double double25 = mean3.evaluate(doubleArray19, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs26 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean27 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs26);
        org.apache.commons.math.stat.descriptive.rank.Max max28 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long29 = max28.getN();
        geometricMean27.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max28);
        org.apache.commons.math.stat.descriptive.summary.Sum sum31 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray38 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double39 = sum31.evaluate(doubleArray38);
        geometricMean27.incrementAll(doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            double double45 = variance1.evaluate(doubleArray19, (double) 1, (int) (short) 100, (-51));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 310.0d + "'", double12 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 310.0d + "'", double39 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(110L, (long) 1072693248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 117996257280L + "'", long2 == 117996257280L);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        double double12 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics13.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary15 = summaryStatistics13.getSummary();
        double double16 = summaryStatistics13.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics13.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum19 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum19.clear();
        summaryStatistics18.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum19);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics18.getMeanImpl();
        summaryStatistics13.setGeoMeanImpl(storelessUnivariateStatistic22);
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic22);
        double double25 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
        org.junit.Assert.assertNotNull(statisticalSummary15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance1.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum7 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum7.clear();
        summaryStatistics6.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum7);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics6.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics11.getMeanImpl();
        double double13 = summaryStatistics11.getSum();
        double double14 = summaryStatistics11.getGeometricMean();
        double double15 = summaryStatistics11.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics11.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics11.getSumImpl();
        summaryStatistics6.setSumImpl(storelessUnivariateStatistic17);
        boolean boolean19 = variance5.equals((java.lang.Object) summaryStatistics6);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics20.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = summaryStatistics20.getSummary();
        long long23 = summaryStatistics20.getN();
        boolean boolean24 = variance5.equals((java.lang.Object) long23);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance25.clear();
        double double27 = variance25.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max28 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long29 = max28.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs30 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean31 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs30);
        org.apache.commons.math.stat.descriptive.rank.Max max32 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long33 = max32.getN();
        geometricMean31.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max32);
        org.apache.commons.math.stat.descriptive.summary.Sum sum35 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray42 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double43 = sum35.evaluate(doubleArray42);
        geometricMean31.incrementAll(doubleArray42);
        double double45 = max28.evaluate(doubleArray42);
        double double46 = variance25.evaluate(doubleArray42);
        variance5.incrementAll(doubleArray42);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = variance1.evaluate(doubleArray42, 9.253047015333128E303d, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic21);
        org.junit.Assert.assertNotNull(statisticalSummary22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 310.0d + "'", double43 == 310.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 2817.0666666666666d + "'", double46 == 2817.0666666666666d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1076101120, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1076101130 + "'", int2 == 1076101130);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 33L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        long long3 = summaryStatistics0.getN();
        double double4 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double double2 = org.apache.commons.math.util.MathUtils.log(1.1041528319999998E9d, (double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment42 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double43 = secondMoment42.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max44 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long45 = max44.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs46 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean47 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs46);
        org.apache.commons.math.stat.descriptive.rank.Max max48 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long49 = max48.getN();
        geometricMean47.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max48);
        org.apache.commons.math.stat.descriptive.summary.Sum sum51 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray58 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double59 = sum51.evaluate(doubleArray58);
        geometricMean47.incrementAll(doubleArray58);
        double double61 = max44.evaluate(doubleArray58);
        secondMoment42.incrementAll(doubleArray58);
        // The following exception was thrown during execution in test generation
        try {
            double double65 = sum0.evaluate(doubleArray58, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 310.0d + "'", double59 == 310.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 3200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        double double5 = summaryStatistics0.getMax();
        double double6 = summaryStatistics0.getVariance();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double1 = sumOfSquares0.getResult();
        org.apache.commons.math.stat.descriptive.summary.Sum sum2 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long3 = sum2.getN();
        sum2.clear();
        long long5 = sum2.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean7 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment6);
        org.apache.commons.math.stat.descriptive.summary.Sum sum8 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray15 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double16 = sum8.evaluate(doubleArray15);
        double[] doubleArray23 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double26 = sum8.evaluate(doubleArray23, 0, 0);
        double double29 = mean7.evaluate(doubleArray23, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance30.clear();
        double double32 = variance30.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max33 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long34 = max33.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs35 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean36 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs35);
        org.apache.commons.math.stat.descriptive.rank.Max max37 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long38 = max37.getN();
        geometricMean36.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max37);
        org.apache.commons.math.stat.descriptive.summary.Sum sum40 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray47 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double48 = sum40.evaluate(doubleArray47);
        geometricMean36.incrementAll(doubleArray47);
        double double50 = max33.evaluate(doubleArray47);
        double double51 = variance30.evaluate(doubleArray47);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean53 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment52);
        org.apache.commons.math.stat.descriptive.summary.Sum sum54 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray61 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double62 = sum54.evaluate(doubleArray61);
        double[] doubleArray69 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double72 = sum54.evaluate(doubleArray69, 0, 0);
        double double75 = mean53.evaluate(doubleArray69, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs76 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean77 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs76);
        org.apache.commons.math.stat.descriptive.rank.Max max78 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long79 = max78.getN();
        geometricMean77.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max78);
        org.apache.commons.math.stat.descriptive.summary.Sum sum81 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray88 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double89 = sum81.evaluate(doubleArray88);
        geometricMean77.incrementAll(doubleArray88);
        boolean boolean91 = org.apache.commons.math.util.MathUtils.equals(doubleArray69, doubleArray88);
        double double92 = variance30.evaluate(doubleArray88);
        boolean boolean93 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray88);
        double double96 = sum2.evaluate(doubleArray23, 2050438918, 1072693248);
        // The following exception was thrown during execution in test generation
        try {
            double double99 = sumOfSquares0.evaluate(doubleArray23, 3190, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 310.0d + "'", double16 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 310.0d + "'", double48 == 310.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 2817.0666666666666d + "'", double51 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 310.0d + "'", double62 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 310.0d + "'", double89 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 2817.0666666666666d + "'", double92 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        double double12 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        summaryStatistics0.addValue((double) '#');
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics0.getSummary();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(statisticalSummary9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        mean1.clear();
        double double4 = mean1.getResult();
        mean1.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance7.clear();
        double double9 = variance7.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max10 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long11 = max10.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs12 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean13 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs12);
        org.apache.commons.math.stat.descriptive.rank.Max max14 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long15 = max14.getN();
        geometricMean13.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max14);
        org.apache.commons.math.stat.descriptive.summary.Sum sum17 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray24 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double25 = sum17.evaluate(doubleArray24);
        geometricMean13.incrementAll(doubleArray24);
        double double27 = max10.evaluate(doubleArray24);
        double double28 = variance7.evaluate(doubleArray24);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean30 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment29);
        org.apache.commons.math.stat.descriptive.summary.Sum sum31 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray38 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double39 = sum31.evaluate(doubleArray38);
        double[] doubleArray46 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double49 = sum31.evaluate(doubleArray46, 0, 0);
        double double52 = mean30.evaluate(doubleArray46, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs53 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean54 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs53);
        org.apache.commons.math.stat.descriptive.rank.Max max55 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long56 = max55.getN();
        geometricMean54.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max55);
        org.apache.commons.math.stat.descriptive.summary.Sum sum58 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray65 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double66 = sum58.evaluate(doubleArray65);
        geometricMean54.incrementAll(doubleArray65);
        boolean boolean68 = org.apache.commons.math.util.MathUtils.equals(doubleArray46, doubleArray65);
        double double69 = variance7.evaluate(doubleArray65);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares70 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares70.increment(9.619275968248924E151d);
        double double73 = sumOfSquares70.getResult();
        double[] doubleArray75 = new double[] { 1.0d };
        sumOfSquares70.incrementAll(doubleArray75);
        double double77 = variance7.evaluate(doubleArray75);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = mean1.evaluate(doubleArray75, 3200, 1552271548);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 310.0d + "'", double25 == 310.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2817.0666666666666d + "'", double28 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 310.0d + "'", double39 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 310.0d + "'", double66 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2817.0666666666666d + "'", double69 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 9.253047015333127E303d + "'", double73 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1072693279);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long1 = max0.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares4 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares4.increment(9.619275968248924E151d);
        double double7 = sumOfSquares4.getResult();
        double[] doubleArray9 = new double[] { 1.0d };
        sumOfSquares4.incrementAll(doubleArray9);
        sumOfLogs2.incrementAll(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            max0.incrementAll(doubleArray9, 2050438918, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.253047015333127E303d + "'", double7 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double1 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs4 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean5 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs4);
        org.apache.commons.math.stat.descriptive.rank.Max max6 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long7 = max6.getN();
        geometricMean5.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max6);
        org.apache.commons.math.stat.descriptive.summary.Sum sum9 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray16 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double17 = sum9.evaluate(doubleArray16);
        geometricMean5.incrementAll(doubleArray16);
        double double19 = max2.evaluate(doubleArray16);
        secondMoment0.incrementAll(doubleArray16);
        double double21 = secondMoment0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 310.0d + "'", double17 == 310.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 14085.333333333332d + "'", double21 == 14085.333333333332d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        long long10 = storelessUnivariateStatistic9.getN();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double2 = org.apache.commons.math.util.MathUtils.log((-1.2181642514249999E288d), (double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 2050442118);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double4 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        double double19 = summaryStatistics0.getVariance();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        summaryStatistics0.addValue((double) '#');
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getSumLogImpl();
        double double9 = summaryStatistics0.getVariance();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getGeoMeanImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(9.619275968248924E151d);
        double double3 = sumOfSquares0.getResult();
        double[] doubleArray5 = new double[] { 1.0d };
        sumOfSquares0.incrementAll(doubleArray5);
        double double7 = sumOfSquares0.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs8);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares10 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares10.increment(9.619275968248924E151d);
        double double13 = sumOfSquares10.getResult();
        double[] doubleArray15 = new double[] { 1.0d };
        sumOfSquares10.incrementAll(doubleArray15);
        sumOfLogs8.incrementAll(doubleArray15);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            sumOfSquares0.incrementAll(doubleArray15, 3190, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.253047015333127E303d + "'", double3 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.253047015333127E303d + "'", double7 == 9.253047015333127E303d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9.253047015333127E303d + "'", double13 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1072693279 + "'", int18 == 1072693279);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        long long1 = org.apache.commons.math.util.MathUtils.sign(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 0, (-42));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        summaryStatistics0.addValue((double) '#');
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 100L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long3 = secondMoment1.getN();
        secondMoment1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics0.getMinImpl();
        double double13 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int1 = org.apache.commons.math.util.MathUtils.hash(35.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1078034432 + "'", int1 == 1078034432);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs4 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean5 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs4);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares6.increment(9.619275968248924E151d);
        double double9 = sumOfSquares6.getResult();
        double[] doubleArray11 = new double[] { 1.0d };
        sumOfSquares6.incrementAll(doubleArray11);
        sumOfLogs4.incrementAll(doubleArray11);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = mean3.evaluate(doubleArray11, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.253047015333127E303d + "'", double9 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1072693279 + "'", int14 == 1072693279);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        double double19 = max16.getResult();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-3191L), (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3190.9999999999995d) + "'", double2 == (-3190.9999999999995d));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        boolean boolean9 = variance6.isBiasCorrected();
        double double10 = variance6.getResult();
        org.apache.commons.math.stat.descriptive.summary.Sum sum11 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray18 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double19 = sum11.evaluate(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = variance6.evaluate(doubleArray18, (int) (byte) -1, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 310.0d + "'", double19 == 310.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.432414667665978E25d + "'", double2 == 4.432414667665978E25d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getSumImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        sum22.clear();
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long3 = secondMoment1.getN();
        secondMoment1.increment((double) (short) 100);
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getVariance();
        double double6 = summaryStatistics0.getMin();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        summaryStatistics0.addValue((double) (short) 10);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum18 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum18.clear();
        summaryStatistics17.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum18);
        long long21 = summaryStatistics17.getN();
        java.lang.String str22 = summaryStatistics17.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long24 = variance23.getN();
        summaryStatistics17.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance23);
        double double26 = summaryStatistics17.getMin();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long28 = secondMoment27.getN();
        secondMoment27.increment((double) (-1));
        summaryStatistics17.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment27);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic32 = summaryStatistics17.getSumsqImpl();
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementations must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str22, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic32);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 110L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) '#', (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6476398521807292d + "'", double2 == 0.6476398521807292d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(9.619275968248924E151d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment3);
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray12 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double13 = sum5.evaluate(doubleArray12);
        double[] doubleArray20 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double23 = sum5.evaluate(doubleArray20, 0, 0);
        double double26 = mean4.evaluate(doubleArray20, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs27 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean28 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs27);
        org.apache.commons.math.stat.descriptive.rank.Max max29 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long30 = max29.getN();
        geometricMean28.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max29);
        org.apache.commons.math.stat.descriptive.summary.Sum sum32 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray39 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double40 = sum32.evaluate(doubleArray39);
        geometricMean28.incrementAll(doubleArray39);
        boolean boolean42 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray39);
        // The following exception was thrown during execution in test generation
        try {
            double double45 = sumOfSquares0.evaluate(doubleArray39, (int) (byte) 1, 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 310.0d + "'", double13 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 310.0d + "'", double40 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(1.3440585709080678E43d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080676E43d + "'", double2 == 1.3440585709080676E43d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.lang.Class<?> wildcardClass15 = summaryStatistics0.getClass();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-51));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long3 = secondMoment1.getN();
        secondMoment1.increment((double) (short) 100);
        secondMoment1.increment(30.482323362278656d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max0.increment((double) 1L);
        double double3 = max0.getResult();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long6 = sum5.getN();
        sum5.increment(35.0d);
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics10.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long13 = secondMoment12.getN();
        secondMoment12.increment((double) (-1));
        summaryStatistics10.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment12);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean18 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment17);
        double double19 = mean18.getResult();
        mean18.clear();
        summaryStatistics10.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean18);
        double double22 = summaryStatistics10.getSumOfLogs();
        double double23 = summaryStatistics10.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum25 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum25.clear();
        summaryStatistics24.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum25);
        long long28 = summaryStatistics24.getN();
        java.lang.String str29 = summaryStatistics24.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long31 = variance30.getN();
        summaryStatistics24.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance30);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics24.getSumImpl();
        summaryStatistics10.setVarianceImpl(storelessUnivariateStatistic33);
        summaryStatistics0.setSumsqImpl(storelessUnivariateStatistic33);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str29, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic33);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 62);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment2);
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray11 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double12 = sum4.evaluate(doubleArray11);
        double[] doubleArray19 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double22 = sum4.evaluate(doubleArray19, 0, 0);
        double double25 = mean3.evaluate(doubleArray19, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance26.clear();
        double double28 = variance26.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max29 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long30 = max29.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs31 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean32 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs31);
        org.apache.commons.math.stat.descriptive.rank.Max max33 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long34 = max33.getN();
        geometricMean32.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max33);
        org.apache.commons.math.stat.descriptive.summary.Sum sum36 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray43 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double44 = sum36.evaluate(doubleArray43);
        geometricMean32.incrementAll(doubleArray43);
        double double46 = max29.evaluate(doubleArray43);
        double double47 = variance26.evaluate(doubleArray43);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean49 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment48);
        org.apache.commons.math.stat.descriptive.summary.Sum sum50 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray57 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double58 = sum50.evaluate(doubleArray57);
        double[] doubleArray65 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double68 = sum50.evaluate(doubleArray65, 0, 0);
        double double71 = mean49.evaluate(doubleArray65, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs72 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean73 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs72);
        org.apache.commons.math.stat.descriptive.rank.Max max74 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long75 = max74.getN();
        geometricMean73.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max74);
        org.apache.commons.math.stat.descriptive.summary.Sum sum77 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray84 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double85 = sum77.evaluate(doubleArray84);
        geometricMean73.incrementAll(doubleArray84);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray65, doubleArray84);
        double double88 = variance26.evaluate(doubleArray84);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = sum0.evaluate(doubleArray19, 132, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 310.0d + "'", double12 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 310.0d + "'", double44 == 310.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2817.0666666666666d + "'", double47 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 310.0d + "'", double58 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 310.0d + "'", double85 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 2817.0666666666666d + "'", double88 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1072693248);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        long long17 = geometricMean0.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs18 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean19 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs18);
        double double20 = sumOfLogs18.getResult();
        double double21 = sumOfLogs18.getResult();
        // The following exception was thrown during execution in test generation
        try {
            geometricMean0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementation must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str6, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(9.619275968248924E151d);
        double double3 = sumOfSquares0.getResult();
        double[] doubleArray5 = new double[] { 1.0d };
        sumOfSquares0.incrementAll(doubleArray5);
        sumOfSquares0.increment((double) 1104152832);
        sumOfSquares0.increment(14085.333333333332d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.253047015333127E303d + "'", double3 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1072693279);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.increment(0.0d);
        min0.increment(0.0d);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares5 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares5.increment(9.619275968248924E151d);
        double double8 = sumOfSquares5.getResult();
        double[] doubleArray10 = new double[] { 1.0d };
        sumOfSquares5.incrementAll(doubleArray10);
        boolean boolean12 = min0.equals((java.lang.Object) sumOfSquares5);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs13 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean14 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs13);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares15 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares15.increment(9.619275968248924E151d);
        double double18 = sumOfSquares15.getResult();
        double[] doubleArray20 = new double[] { 1.0d };
        sumOfSquares15.incrementAll(doubleArray20);
        sumOfLogs13.incrementAll(doubleArray20);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = min0.evaluate(doubleArray20, (-1071382528), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.253047015333127E303d + "'", double8 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.253047015333127E303d + "'", double18 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1072693279 + "'", int23 == 1072693279);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        sum0.increment((double) 1L);
        long long5 = sum0.getN();
        sum0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        long long10 = summaryStatistics0.getN();
        double double11 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        long long16 = summaryStatistics0.getN();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum3.clear();
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        double double9 = summaryStatistics7.getSum();
        double double10 = summaryStatistics7.getGeometricMean();
        double double11 = summaryStatistics7.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics7.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics7.getSumImpl();
        summaryStatistics2.setSumImpl(storelessUnivariateStatistic13);
        boolean boolean15 = variance1.equals((java.lang.Object) summaryStatistics2);
        double double16 = summaryStatistics2.getMin();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance3.clear();
        double double5 = variance3.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max6 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long7 = max6.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs8);
        org.apache.commons.math.stat.descriptive.rank.Max max10 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long11 = max10.getN();
        geometricMean9.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum13 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray20 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double21 = sum13.evaluate(doubleArray20);
        geometricMean9.incrementAll(doubleArray20);
        double double23 = max6.evaluate(doubleArray20);
        double double24 = variance3.evaluate(doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = geometricMean2.evaluate(doubleArray20, 1076101130, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 310.0d + "'", double21 == 310.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2817.0666666666666d + "'", double24 == 2817.0666666666666d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) 10, 2050438918, (int) (byte) 1);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics0.getVarianceImpl();
        double double14 = storelessUnivariateStatistic13.getResult();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-51));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1078034432);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long3 = secondMoment1.getN();
        secondMoment1.increment((double) (short) 100);
        long long6 = secondMoment1.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        boolean boolean9 = variance6.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum12 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray19 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double20 = sum12.evaluate(doubleArray19);
        double[] doubleArray27 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double30 = sum12.evaluate(doubleArray27, 0, 0);
        double double33 = mean11.evaluate(doubleArray27, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs34);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max36);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray46 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double47 = sum39.evaluate(doubleArray46);
        geometricMean35.incrementAll(doubleArray46);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray46);
        // The following exception was thrown during execution in test generation
        try {
            double double53 = variance6.evaluate(doubleArray27, (double) (-51), (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 310.0d + "'", double20 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 310.0d + "'", double47 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getGeoMeanImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance27.clear();
        double double29 = variance27.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max30 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long31 = max30.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs32 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean33 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs32);
        org.apache.commons.math.stat.descriptive.rank.Max max34 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long35 = max34.getN();
        geometricMean33.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max34);
        org.apache.commons.math.stat.descriptive.summary.Sum sum37 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray44 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double45 = sum37.evaluate(doubleArray44);
        geometricMean33.incrementAll(doubleArray44);
        double double47 = max30.evaluate(doubleArray44);
        double double48 = variance27.evaluate(doubleArray44);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean50 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment49);
        org.apache.commons.math.stat.descriptive.summary.Sum sum51 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray58 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double59 = sum51.evaluate(doubleArray58);
        double[] doubleArray66 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double69 = sum51.evaluate(doubleArray66, 0, 0);
        double double72 = mean50.evaluate(doubleArray66, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs73 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean74 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs73);
        org.apache.commons.math.stat.descriptive.rank.Max max75 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long76 = max75.getN();
        geometricMean74.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max75);
        org.apache.commons.math.stat.descriptive.summary.Sum sum78 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray85 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double86 = sum78.evaluate(doubleArray85);
        geometricMean74.incrementAll(doubleArray85);
        boolean boolean88 = org.apache.commons.math.util.MathUtils.equals(doubleArray66, doubleArray85);
        double double89 = variance27.evaluate(doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = mean1.evaluate(doubleArray85, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 310.0d + "'", double10 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 310.0d + "'", double45 == 310.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2817.0666666666666d + "'", double48 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 310.0d + "'", double59 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 310.0d + "'", double86 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 2817.0666666666666d + "'", double89 == 2817.0666666666666d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 10, 1076101130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 0, 1552271548);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(1.3440585709080676E43d, 32, (-1635884154));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 2L, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        double double3 = org.apache.commons.math.util.MathUtils.round(0.6476398521807292d, 32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6476398521807292d + "'", double3 == 0.6476398521807292d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072693279, (-1635884154));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 3190);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        double double17 = geometricMean0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str6, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        variance6.increment((double) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum14 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum14.clear();
        summaryStatistics13.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum14);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics13.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics18.getMeanImpl();
        double double20 = summaryStatistics18.getSum();
        double double21 = summaryStatistics18.getGeometricMean();
        double double22 = summaryStatistics18.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics18.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics18.getSumImpl();
        summaryStatistics13.setSumImpl(storelessUnivariateStatistic24);
        boolean boolean26 = variance12.equals((java.lang.Object) summaryStatistics13);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic28 = summaryStatistics27.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary29 = summaryStatistics27.getSummary();
        long long30 = summaryStatistics27.getN();
        boolean boolean31 = variance12.equals((java.lang.Object) long30);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance32.clear();
        double double34 = variance32.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max35 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long36 = max35.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs37 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean38 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs37);
        org.apache.commons.math.stat.descriptive.rank.Max max39 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long40 = max39.getN();
        geometricMean38.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max39);
        org.apache.commons.math.stat.descriptive.summary.Sum sum42 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray49 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double50 = sum42.evaluate(doubleArray49);
        geometricMean38.incrementAll(doubleArray49);
        double double52 = max35.evaluate(doubleArray49);
        double double53 = variance32.evaluate(doubleArray49);
        variance12.incrementAll(doubleArray49);
        // The following exception was thrown during execution in test generation
        try {
            variance6.incrementAll(doubleArray49, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic28);
        org.junit.Assert.assertNotNull(statisticalSummary29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 310.0d + "'", double50 == 310.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2817.0666666666666d + "'", double53 == 2817.0666666666666d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1076101130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1076101120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1552271548);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        boolean boolean9 = variance6.isBiasCorrected();
        double double10 = variance6.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares11 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares11.increment(9.619275968248924E151d);
        double double14 = sumOfSquares11.getResult();
        double[] doubleArray16 = new double[] { 1.0d };
        sumOfSquares11.incrementAll(doubleArray16);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = variance6.evaluate(doubleArray16, (double) 3200, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.253047015333127E303d + "'", double14 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getVariance();
        double double3 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1078558720 + "'", int1 == 1078558720);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance23.clear();
        double double25 = variance23.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max26 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long27 = max26.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs28 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean29 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs28);
        org.apache.commons.math.stat.descriptive.rank.Max max30 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long31 = max30.getN();
        geometricMean29.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray40 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double41 = sum33.evaluate(doubleArray40);
        geometricMean29.incrementAll(doubleArray40);
        double double43 = max26.evaluate(doubleArray40);
        double double44 = variance23.evaluate(doubleArray40);
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
        double double85 = variance23.evaluate(doubleArray81);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares86 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares86.increment(9.619275968248924E151d);
        double double89 = sumOfSquares86.getResult();
        double[] doubleArray91 = new double[] { 1.0d };
        sumOfSquares86.incrementAll(doubleArray91);
        double double93 = variance23.evaluate(doubleArray91);
        // The following exception was thrown during execution in test generation
        try {
            double double96 = variance15.evaluate(doubleArray91, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 310.0d + "'", double41 == 310.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2817.0666666666666d + "'", double44 == 2817.0666666666666d);
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2817.0666666666666d + "'", double85 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 9.253047015333127E303d + "'", double89 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[1.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum4.clear();
        summaryStatistics3.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum4);
        long long7 = summaryStatistics3.getN();
        java.lang.String str8 = summaryStatistics3.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long10 = variance9.getN();
        summaryStatistics3.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance9);
        java.lang.Class<?> wildcardClass12 = summaryStatistics3.getClass();
        boolean boolean13 = summaryStatistics0.equals((java.lang.Object) summaryStatistics3);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str8, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        double double1 = max0.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares4 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares4.increment(9.619275968248924E151d);
        double double7 = sumOfSquares4.getResult();
        double[] doubleArray9 = new double[] { 1.0d };
        sumOfSquares4.incrementAll(doubleArray9);
        sumOfLogs2.incrementAll(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            max0.incrementAll(doubleArray9, 1552271548, (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.253047015333127E303d + "'", double7 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) 'a', 1552271548);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        variance6.setBiasCorrected(false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 62, (long) (-51));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3162L) + "'", long2 == (-3162L));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1078034432);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104154720 + "'", int1 == 1104154720);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs16 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean17 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs16);
        org.apache.commons.math.stat.descriptive.rank.Max max18 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long19 = max18.getN();
        geometricMean17.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max18);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = geometricMean17.getSumLogImpl();
        geometricMean17.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs23 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean24 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs23);
        geometricMean17.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean24);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = geometricMean17.getSumLogImpl();
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.setSumLogImpl(storelessUnivariateStatistic26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementation must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 310.0d + "'", double13 == 310.0d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic21);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic26);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 10L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        long long11 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics12.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long15 = secondMoment14.getN();
        secondMoment14.increment((double) (-1));
        summaryStatistics12.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment14);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean20 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment19);
        double double21 = mean20.getResult();
        mean20.clear();
        summaryStatistics12.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean20);
        org.apache.commons.math.stat.descriptive.rank.Max max24 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long25 = max24.getN();
        summaryStatistics12.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max24);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics12.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic28 = summaryStatistics12.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares29 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double30 = sumOfSquares29.getResult();
        double double31 = sumOfSquares29.getResult();
        summaryStatistics12.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares29);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs34);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max36);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic39 = geometricMean35.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics40 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics40.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment42 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long43 = secondMoment42.getN();
        secondMoment42.increment((double) (-1));
        summaryStatistics40.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment42);
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment42);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment42);
        summaryStatistics12.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment42);
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment42);
        org.apache.commons.math.stat.descriptive.rank.Max max51 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long52 = max51.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs53 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean54 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs53);
        org.apache.commons.math.stat.descriptive.rank.Max max55 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long56 = max55.getN();
        geometricMean54.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max55);
        org.apache.commons.math.stat.descriptive.summary.Sum sum58 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray65 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double66 = sum58.evaluate(doubleArray65);
        geometricMean54.incrementAll(doubleArray65);
        double double68 = max51.evaluate(doubleArray65);
        // The following exception was thrown during execution in test generation
        try {
            secondMoment42.incrementAll(doubleArray65, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic28);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic39);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 310.0d + "'", double66 == 310.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        sum0.clear();
        long long3 = sum0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean5 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        double[] doubleArray21 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double24 = sum6.evaluate(doubleArray21, 0, 0);
        double double27 = mean5.evaluate(doubleArray21, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance28.clear();
        double double30 = variance28.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max31 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long32 = max31.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs33 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean34 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs33);
        org.apache.commons.math.stat.descriptive.rank.Max max35 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long36 = max35.getN();
        geometricMean34.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max35);
        org.apache.commons.math.stat.descriptive.summary.Sum sum38 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray45 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double46 = sum38.evaluate(doubleArray45);
        geometricMean34.incrementAll(doubleArray45);
        double double48 = max31.evaluate(doubleArray45);
        double double49 = variance28.evaluate(doubleArray45);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean51 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment50);
        org.apache.commons.math.stat.descriptive.summary.Sum sum52 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray59 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double60 = sum52.evaluate(doubleArray59);
        double[] doubleArray67 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double70 = sum52.evaluate(doubleArray67, 0, 0);
        double double73 = mean51.evaluate(doubleArray67, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs74 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean75 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs74);
        org.apache.commons.math.stat.descriptive.rank.Max max76 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long77 = max76.getN();
        geometricMean75.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max76);
        org.apache.commons.math.stat.descriptive.summary.Sum sum79 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray86 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double87 = sum79.evaluate(doubleArray86);
        geometricMean75.incrementAll(doubleArray86);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray67, doubleArray86);
        double double90 = variance28.evaluate(doubleArray86);
        boolean boolean91 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray86);
        double double94 = sum0.evaluate(doubleArray21, 2050438918, 1072693248);
        long long95 = sum0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 310.0d + "'", double46 == 310.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2817.0666666666666d + "'", double49 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 310.0d + "'", double60 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 310.0d + "'", double87 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 2817.0666666666666d + "'", double90 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        long long27 = mean1.getN();
        mean1.clear();
        mean1.increment((double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 310.0d + "'", double10 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics3.getMeanImpl();
        double double5 = summaryStatistics3.getSum();
        double double6 = summaryStatistics3.getGeometricMean();
        double double7 = summaryStatistics3.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics3.getMaxImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs9 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean10 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs9);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs9);
        org.apache.commons.math.stat.descriptive.summary.Sum sum12 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray19 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double20 = sum12.evaluate(doubleArray19);
        double double21 = sumOfLogs9.evaluate(doubleArray19);
        double double22 = storelessUnivariateStatistic8.evaluate(doubleArray19);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = sumOfLogs0.evaluate(doubleArray19, 1078034432, 3200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 310.0d + "'", double20 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum3.clear();
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        double double9 = summaryStatistics7.getSum();
        double double10 = summaryStatistics7.getGeometricMean();
        double double11 = summaryStatistics7.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics7.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics7.getSumImpl();
        summaryStatistics2.setSumImpl(storelessUnivariateStatistic13);
        boolean boolean15 = variance1.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics16.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary18 = summaryStatistics16.getSummary();
        long long19 = summaryStatistics16.getN();
        boolean boolean20 = variance1.equals((java.lang.Object) long19);
        double double21 = variance1.getResult();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertNotNull(statisticalSummary18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-3162L), (-51), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        org.apache.commons.math.stat.descriptive.summary.Sum sum12 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray19 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double20 = sum12.evaluate(doubleArray19);
        double[] doubleArray27 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double30 = sum12.evaluate(doubleArray27, 0, 0);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray27);
        double double34 = mean8.evaluate(doubleArray27, 0, (int) (short) 0);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs35 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double36 = sumOfLogs35.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance38.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean42 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment41);
        mean42.clear();
        double[] doubleArray49 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean42.incrementAll(doubleArray49, (int) (short) 1, (int) (byte) 0);
        double double53 = variance38.evaluate(doubleArray49);
        double double54 = sumOfLogs35.evaluate(doubleArray49);
        mean8.incrementAll(doubleArray49, 1076101120, 1076101120);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 310.0d + "'", double20 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2050442118 + "'", int31 == 2050442118);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2806.7d + "'", double53 == 2806.7d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) '#', 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        double[] doubleArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            sum0.incrementAll(doubleArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input values array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long6 = sum5.getN();
        sum5.increment(35.0d);
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum12 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray19 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double20 = sum12.evaluate(doubleArray19);
        double[] doubleArray27 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double30 = sum12.evaluate(doubleArray27, 0, 0);
        double double33 = mean11.evaluate(doubleArray27, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs34);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max36);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray46 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double47 = sum39.evaluate(doubleArray46);
        geometricMean35.incrementAll(doubleArray46);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean51 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment50);
        org.apache.commons.math.stat.descriptive.summary.Sum sum52 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray59 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double60 = sum52.evaluate(doubleArray59);
        double[] doubleArray67 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double70 = sum52.evaluate(doubleArray67, 0, 0);
        double double73 = mean51.evaluate(doubleArray67, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs74 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean75 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs74);
        org.apache.commons.math.stat.descriptive.rank.Max max76 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long77 = max76.getN();
        geometricMean75.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max76);
        org.apache.commons.math.stat.descriptive.summary.Sum sum79 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray86 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double87 = sum79.evaluate(doubleArray86);
        geometricMean75.incrementAll(doubleArray86);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray67, doubleArray86);
        boolean boolean90 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray67);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = sum5.evaluate(doubleArray67, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 310.0d + "'", double20 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 310.0d + "'", double47 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 310.0d + "'", double60 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 310.0d + "'", double87 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-42));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment3);
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment3);
        double double6 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getGeoMeanImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1072693279, (double) 62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(2050442118, 1078558720);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 971883398 + "'", int2 == 971883398);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.clear();
        mean1.increment(0.0d);
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
        int int93 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            double double96 = mean1.evaluate(doubleArray22, 3200, 1072693279);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2050442118 + "'", int93 == 2050442118);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) -1, 1072693248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        double double3 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics4.getMeanImpl();
        double double6 = summaryStatistics4.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics4.getMaxImpl();
        boolean boolean8 = sumOfLogs0.equals((java.lang.Object) storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        variance6.increment((double) 1);
        variance6.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long6 = sum5.getN();
        sum5.increment(35.0d);
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum5);
        double double10 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int1 = org.apache.commons.math.util.MathUtils.hash(4.432414667665978E25d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 577371932 + "'", int1 == 577371932);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares4 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares4);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        sum17.clear();
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
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs1 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs1);
        org.apache.commons.math.stat.descriptive.rank.Max max3 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long4 = max3.getN();
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = geometricMean2.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long10 = secondMoment9.getN();
        secondMoment9.increment((double) (-1));
        summaryStatistics7.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment9);
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.Mean mean16 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment9);
        secondMoment9.clear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1.0f), (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.69911184307752d + "'", double2 == 36.69911184307752d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1L), 577371932);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares2 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares2.increment(9.619275968248924E151d);
        double double5 = sumOfSquares2.getResult();
        double[] doubleArray7 = new double[] { 1.0d };
        sumOfSquares2.incrementAll(doubleArray7);
        sumOfLogs0.incrementAll(doubleArray7);
        double double10 = sumOfLogs0.getResult();
        sumOfLogs0.increment(310.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.253047015333127E303d + "'", double5 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares4 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares4);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMean();
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        double double21 = summaryStatistics0.getStandardDeviation();
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        float float2 = org.apache.commons.math.util.MathUtils.round(35.0f, 1072693279);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        double double2 = mean1.getResult();
        mean1.clear();
        double double4 = mean1.getResult();
        mean1.increment(0.0d);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares9 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares9.increment(9.619275968248924E151d);
        double double12 = sumOfSquares9.getResult();
        double[] doubleArray14 = new double[] { 1.0d };
        sumOfSquares9.incrementAll(doubleArray14);
        sumOfLogs7.incrementAll(doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = mean1.evaluate(doubleArray14, 971883398, (-1635884154));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.253047015333127E303d + "'", double12 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics11.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics11.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares14 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares14.increment(9.619275968248924E151d);
        summaryStatistics11.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares14);
        sumOfSquares14.increment((double) 1076101120);
        long long20 = sumOfSquares14.getN();
        summaryStatistics10.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares14);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(summaryStatistics10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(statisticalSummary13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.clear();
        min0.clear();
        min0.increment((double) 97L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-42));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance16.clear();
        double double18 = variance16.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max19 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long20 = max19.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs21 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean22 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs21);
        org.apache.commons.math.stat.descriptive.rank.Max max23 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long24 = max23.getN();
        geometricMean22.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max23);
        org.apache.commons.math.stat.descriptive.summary.Sum sum26 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray33 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double34 = sum26.evaluate(doubleArray33);
        geometricMean22.incrementAll(doubleArray33);
        double double36 = max19.evaluate(doubleArray33);
        double double37 = variance16.evaluate(doubleArray33);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean39 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment38);
        org.apache.commons.math.stat.descriptive.summary.Sum sum40 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray47 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double48 = sum40.evaluate(doubleArray47);
        double[] doubleArray55 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double58 = sum40.evaluate(doubleArray55, 0, 0);
        double double61 = mean39.evaluate(doubleArray55, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs62 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean63 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs62);
        org.apache.commons.math.stat.descriptive.rank.Max max64 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long65 = max64.getN();
        geometricMean63.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max64);
        org.apache.commons.math.stat.descriptive.summary.Sum sum67 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray74 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double75 = sum67.evaluate(doubleArray74);
        geometricMean63.incrementAll(doubleArray74);
        boolean boolean77 = org.apache.commons.math.util.MathUtils.equals(doubleArray55, doubleArray74);
        double double78 = variance16.evaluate(doubleArray74);
        // The following exception was thrown during execution in test generation
        try {
            double double81 = sum6.evaluate(doubleArray74, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 310.0d + "'", double34 == 310.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2817.0666666666666d + "'", double37 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 310.0d + "'", double48 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 310.0d + "'", double75 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 2817.0666666666666d + "'", double78 == 2817.0666666666666d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-3162L), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-316200L) + "'", long2 == (-316200L));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.increment(2817.0666666666666d);
        double double4 = mean1.getResult();
        mean1.clear();
        long long6 = mean1.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(577371932, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(4.432414667665978E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        geometricMean1.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean8);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = geometricMean1.getSumLogImpl();
        long long11 = geometricMean1.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(87);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 304.6868567656687d + "'", double1 == 304.6868567656687d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(5, 1104154720);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum3.clear();
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        double double9 = summaryStatistics7.getSum();
        double double10 = summaryStatistics7.getGeometricMean();
        double double11 = summaryStatistics7.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics7.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics7.getSumImpl();
        summaryStatistics2.setSumImpl(storelessUnivariateStatistic13);
        boolean boolean15 = variance1.equals((java.lang.Object) summaryStatistics2);
        variance1.clear();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-1), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        sum0.increment(7.930067261567154E14d);
        sum0.increment((double) (-1071382528));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        summaryStatistics0.addValue(1.730777995336729E7d);
        double double8 = summaryStatistics0.getMean();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.730777995336729E7d + "'", double8 == 1.730777995336729E7d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares3 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares3.increment(9.619275968248924E151d);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean0.increment((double) 1.0f);
        geometricMean0.increment((double) (byte) -1);
        geometricMean0.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = geometricMean0.getSumLogImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        long long1 = org.apache.commons.math.util.MathUtils.sign(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1078034432, 2050442118);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: add");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        sum0.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 0, 3200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(577371932);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1070527826035925E10d + "'", double1 == 1.1070527826035925E10d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.increment(2817.0666666666666d);
        double double4 = mean1.getResult();
        mean1.increment(1.730777995336729E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.clear();
        mean1.increment(30.482323362278656d);
        double double5 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance7.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        mean11.clear();
        double[] doubleArray18 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean11.incrementAll(doubleArray18, (int) (short) 1, (int) (byte) 0);
        double double22 = variance7.evaluate(doubleArray18);
        mean1.incrementAll(doubleArray18);
        org.apache.commons.math.stat.descriptive.rank.Max max24 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long25 = max24.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs26 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean27 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs26);
        org.apache.commons.math.stat.descriptive.rank.Max max28 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long29 = max28.getN();
        geometricMean27.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max28);
        org.apache.commons.math.stat.descriptive.summary.Sum sum31 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray38 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double39 = sum31.evaluate(doubleArray38);
        geometricMean27.incrementAll(doubleArray38);
        double double41 = max24.evaluate(doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = mean1.evaluate(doubleArray38, 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2806.7d + "'", double22 == 2806.7d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 310.0d + "'", double39 == 310.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(9.332621544395286E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        sumOfLogs0.clear();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean4 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max5 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max5.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean9 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment8);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray17 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double18 = sum10.evaluate(doubleArray17);
        double[] doubleArray25 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double28 = sum10.evaluate(doubleArray25, 0, 0);
        double double31 = mean9.evaluate(doubleArray25, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs32 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean33 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs32);
        org.apache.commons.math.stat.descriptive.rank.Max max34 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long35 = max34.getN();
        geometricMean33.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max34);
        org.apache.commons.math.stat.descriptive.summary.Sum sum37 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray44 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double45 = sum37.evaluate(doubleArray44);
        geometricMean33.incrementAll(doubleArray44);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray44);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean49 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment48);
        org.apache.commons.math.stat.descriptive.summary.Sum sum50 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray57 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double58 = sum50.evaluate(doubleArray57);
        double[] doubleArray65 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double68 = sum50.evaluate(doubleArray65, 0, 0);
        double double71 = mean49.evaluate(doubleArray65, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs72 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean73 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs72);
        org.apache.commons.math.stat.descriptive.rank.Max max74 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long75 = max74.getN();
        geometricMean73.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max74);
        org.apache.commons.math.stat.descriptive.summary.Sum sum77 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray84 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double85 = sum77.evaluate(doubleArray84);
        geometricMean73.incrementAll(doubleArray84);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray65, doubleArray84);
        boolean boolean88 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray65);
        double double89 = max5.evaluate(doubleArray65);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = geometricMean4.evaluate(doubleArray65, 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 310.0d + "'", double18 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 310.0d + "'", double45 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 310.0d + "'", double58 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 310.0d + "'", double85 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 310.0d + "'", double89 == 310.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int int1 = org.apache.commons.math.util.MathUtils.hash(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 371080922 + "'", int1 == 371080922);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        summaryStatistics0.addValue((double) '#');
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.summary.Sum sum9 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long10 = sum9.getN();
        long long11 = sum9.getN();
        sum9.increment((double) 1L);
        long long14 = sum9.getN();
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementations must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = geometricMean3.getSumLogImpl();
        long long5 = geometricMean3.getN();
        geometricMean3.increment((double) Float.NaN);
        geometricMean3.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = geometricMean3.getSumLogImpl();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        double double2 = sumOfLogs0.getResult();
        double double3 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean4 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        sumOfLogs0.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getMeanImpl();
        double double8 = summaryStatistics6.getSum();
        long long9 = summaryStatistics6.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics6.getSumLogImpl();
        boolean boolean11 = sumOfLogs0.equals((java.lang.Object) storelessUnivariateStatistic10);
        long long12 = sumOfLogs0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        long long3 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long3 = secondMoment1.getN();
        secondMoment1.increment((double) (short) 100);
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
            double double79 = secondMoment1.evaluate(doubleArray74, 3190, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        double double15 = summaryStatistics0.getVariance();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.increment((double) 1078558720);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics4.getMeanImpl();
        double double6 = summaryStatistics4.getSum();
        double double7 = summaryStatistics4.getGeometricMean();
        double double8 = summaryStatistics4.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics4.getMaxImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs10 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs10);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean12 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum13 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray20 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double21 = sum13.evaluate(doubleArray20);
        double double22 = sumOfLogs10.evaluate(doubleArray20);
        double double23 = storelessUnivariateStatistic9.evaluate(doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            variance1.incrementAll(doubleArray20, (int) (short) 0, 1076101130);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 310.0d + "'", double21 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        double double5 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.rank.Max max6 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long7 = max6.getN();
        long long8 = max6.getN();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max6);
        double double10 = summaryStatistics0.getMax();
        double double11 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        secondMoment0.increment((double) 1076101120);
        double double6 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.789968102326272E17d + "'", double6 == 5.789968102326272E17d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double1 = sumOfSquares0.getResult();
        sumOfSquares0.clear();
        sumOfSquares0.increment((double) 1L);
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
        // The following exception was thrown during execution in test generation
        try {
            double double88 = sumOfSquares0.evaluate(doubleArray62, 100, 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
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
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        sum0.increment(0.0d);
        long long5 = sum0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(971883398);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (short) 0, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics0.getMinImpl();
        double double13 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(9.619275968248924E151d);
        double double3 = sumOfSquares0.getResult();
        double[] doubleArray5 = new double[] { 1.0d };
        sumOfSquares0.incrementAll(doubleArray5);
        double double7 = sumOfSquares0.getResult();
        long long8 = sumOfSquares0.getN();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.253047015333127E303d + "'", double3 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.253047015333127E303d + "'", double7 == 9.253047015333127E303d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics0.getMeanImpl();
        double double28 = summaryStatistics0.getSumsq();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-42), (long) 3200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3242L) + "'", long2 == (-3242L));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1552271548, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1.0f, 10, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 87, (-42), 1104152832);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getStandardDeviation();
        double double3 = summaryStatistics0.getMax();
        java.lang.Class<?> wildcardClass4 = summaryStatistics0.getClass();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares3 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares3.increment(9.619275968248924E151d);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares3);
        sumOfSquares3.increment((double) 1076101120);
        long long9 = sumOfSquares3.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum12 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray19 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double20 = sum12.evaluate(doubleArray19);
        double[] doubleArray27 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double30 = sum12.evaluate(doubleArray27, 0, 0);
        double double33 = mean11.evaluate(doubleArray27, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs34);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max36);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray46 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double47 = sum39.evaluate(doubleArray46);
        geometricMean35.incrementAll(doubleArray46);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray46);
        // The following exception was thrown during execution in test generation
        try {
            double double52 = sumOfSquares3.evaluate(doubleArray46, 3200, (-51));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(statisticalSummary2);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 310.0d + "'", double20 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 310.0d + "'", double47 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1104152832, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1104152832 + "'", int2 == 1104152832);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(3190, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        double double1 = org.apache.commons.math.util.MathUtils.sign(10.892060179263353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics0.getSumsqImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (short) 0, 1076101120);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1076101130);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        double double2 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment3);
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment3);
        java.lang.Class<?> wildcardClass6 = summaryStatistics0.getClass();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(statisticalSummary1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        long long3 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        java.lang.String str5 = summaryStatistics0.toString();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = summaryStatistics0.getSummary();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(statisticalSummary14);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        double double1 = max0.getResult();
        max0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance3.clear();
        double double5 = variance3.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max6 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long7 = max6.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs8);
        org.apache.commons.math.stat.descriptive.rank.Max max10 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long11 = max10.getN();
        geometricMean9.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum13 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray20 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double21 = sum13.evaluate(doubleArray20);
        geometricMean9.incrementAll(doubleArray20);
        double double23 = max6.evaluate(doubleArray20);
        double double24 = variance3.evaluate(doubleArray20);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean26 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment25);
        org.apache.commons.math.stat.descriptive.summary.Sum sum27 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray34 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double35 = sum27.evaluate(doubleArray34);
        double[] doubleArray42 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double45 = sum27.evaluate(doubleArray42, 0, 0);
        double double48 = mean26.evaluate(doubleArray42, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs49 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean50 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs49);
        org.apache.commons.math.stat.descriptive.rank.Max max51 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long52 = max51.getN();
        geometricMean50.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max51);
        org.apache.commons.math.stat.descriptive.summary.Sum sum54 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray61 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double62 = sum54.evaluate(doubleArray61);
        geometricMean50.incrementAll(doubleArray61);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray42, doubleArray61);
        double double65 = variance3.evaluate(doubleArray61);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares66 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares66.increment(9.619275968248924E151d);
        double double69 = sumOfSquares66.getResult();
        double[] doubleArray71 = new double[] { 1.0d };
        sumOfSquares66.incrementAll(doubleArray71);
        double double73 = variance3.evaluate(doubleArray71);
        // The following exception was thrown during execution in test generation
        try {
            double double76 = max0.evaluate(doubleArray71, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 310.0d + "'", double21 == 310.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2817.0666666666666d + "'", double24 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 310.0d + "'", double35 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 310.0d + "'", double62 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2817.0666666666666d + "'", double65 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 9.253047015333127E303d + "'", double69 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        geometricMean1.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean8);
        geometricMean8.increment(310.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(577371932, (-51));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1552271548);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(110L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long7 = variance6.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance6);
        variance6.clear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1552271548, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 648.5658840408101d + "'", double2 == 648.5658840408101d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1), (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000000000000002d) + "'", double2 == (-1.0000000000000002d));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        double double13 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum15.clear();
        summaryStatistics14.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum15);
        long long18 = summaryStatistics14.getN();
        java.lang.String str19 = summaryStatistics14.toString();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long21 = variance20.getN();
        summaryStatistics14.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance20);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics14.getSumImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic23);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str19, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic25);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        summaryStatistics0.clear();
        double double3 = summaryStatistics0.getMean();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        secondMoment12.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str7, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long1 = max0.getN();
        max0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray12 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double13 = sum5.evaluate(doubleArray12);
        geometricMean1.incrementAll(doubleArray12);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean17 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment16);
        org.apache.commons.math.stat.descriptive.summary.Sum sum18 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray25 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double26 = sum18.evaluate(doubleArray25);
        double[] doubleArray33 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double36 = sum18.evaluate(doubleArray33, 0, 0);
        double double39 = mean17.evaluate(doubleArray33, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs40 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean41 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs40);
        org.apache.commons.math.stat.descriptive.rank.Max max42 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long43 = max42.getN();
        geometricMean41.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max42);
        org.apache.commons.math.stat.descriptive.summary.Sum sum45 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray52 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double53 = sum45.evaluate(doubleArray52);
        geometricMean41.incrementAll(doubleArray52);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray33, doubleArray52);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment56 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean57 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment56);
        org.apache.commons.math.stat.descriptive.summary.Sum sum58 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray65 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double66 = sum58.evaluate(doubleArray65);
        double[] doubleArray73 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double76 = sum58.evaluate(doubleArray73, 0, 0);
        double double79 = mean57.evaluate(doubleArray73, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs80 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean81 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs80);
        org.apache.commons.math.stat.descriptive.rank.Max max82 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long83 = max82.getN();
        geometricMean81.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max82);
        org.apache.commons.math.stat.descriptive.summary.Sum sum85 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray92 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double93 = sum85.evaluate(doubleArray92);
        geometricMean81.incrementAll(doubleArray92);
        boolean boolean95 = org.apache.commons.math.util.MathUtils.equals(doubleArray73, doubleArray92);
        boolean boolean96 = org.apache.commons.math.util.MathUtils.equals(doubleArray33, doubleArray73);
        boolean boolean97 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray33);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 310.0d + "'", double13 == 310.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1635884154) + "'", int15 == (-1635884154));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 310.0d + "'", double26 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 310.0d + "'", double53 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 310.0d + "'", double66 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 310.0d + "'", double93 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        geometricMean1.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean8);
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
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.incrementAll(doubleArray88, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
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
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.increment(0.0d);
        min0.increment(0.0d);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares5 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares5.increment(9.619275968248924E151d);
        double double8 = sumOfSquares5.getResult();
        double[] doubleArray10 = new double[] { 1.0d };
        sumOfSquares5.incrementAll(doubleArray10);
        boolean boolean12 = min0.equals((java.lang.Object) sumOfSquares5);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean14 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment13);
        org.apache.commons.math.stat.descriptive.summary.Sum sum15 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray22 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double23 = sum15.evaluate(doubleArray22);
        double[] doubleArray30 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double33 = sum15.evaluate(doubleArray30, 0, 0);
        double double36 = mean14.evaluate(doubleArray30, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs37 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean38 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs37);
        org.apache.commons.math.stat.descriptive.rank.Max max39 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long40 = max39.getN();
        geometricMean38.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max39);
        org.apache.commons.math.stat.descriptive.summary.Sum sum42 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray49 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double50 = sum42.evaluate(doubleArray49);
        geometricMean38.incrementAll(doubleArray49);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray30, doubleArray49);
        // The following exception was thrown during execution in test generation
        try {
            double double55 = min0.evaluate(doubleArray30, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.253047015333127E303d + "'", double8 == 9.253047015333127E303d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 310.0d + "'", double23 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 310.0d + "'", double50 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 7L, 1078034432, 1104154720);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        double double2 = org.apache.commons.math.util.MathUtils.log((-1.2181642514249999E288d), 7.930067261567154E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.rank.Max max4 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long5 = max4.getN();
        geometricMean3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max4);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = geometricMean3.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics8.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        geometricMean3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment10);
        variance17.clear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.rank.Max max1 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max1.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean5 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        double[] doubleArray21 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double24 = sum6.evaluate(doubleArray21, 0, 0);
        double double27 = mean5.evaluate(doubleArray21, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs28 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean29 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs28);
        org.apache.commons.math.stat.descriptive.rank.Max max30 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long31 = max30.getN();
        geometricMean29.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray40 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double41 = sum33.evaluate(doubleArray40);
        geometricMean29.incrementAll(doubleArray40);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean45 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment44);
        org.apache.commons.math.stat.descriptive.summary.Sum sum46 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray53 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double54 = sum46.evaluate(doubleArray53);
        double[] doubleArray61 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double64 = sum46.evaluate(doubleArray61, 0, 0);
        double double67 = mean45.evaluate(doubleArray61, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs68 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean69 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs68);
        org.apache.commons.math.stat.descriptive.rank.Max max70 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long71 = max70.getN();
        geometricMean69.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max70);
        org.apache.commons.math.stat.descriptive.summary.Sum sum73 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray80 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double81 = sum73.evaluate(doubleArray80);
        geometricMean69.incrementAll(doubleArray80);
        boolean boolean83 = org.apache.commons.math.util.MathUtils.equals(doubleArray61, doubleArray80);
        boolean boolean84 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray61);
        double double85 = max1.evaluate(doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double88 = sumOfLogs0.evaluate(doubleArray61, 51, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 310.0d + "'", double41 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 310.0d + "'", double54 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 310.0d + "'", double81 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 310.0d + "'", double85 == 310.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        double double13 = summaryStatistics0.getMin();
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum1 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum1.clear();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum1);
        long long4 = summaryStatistics0.getN();
        java.lang.String str5 = summaryStatistics0.toString();
        summaryStatistics0.addValue(1.730777995336729E7d);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getGeoMeanImpl();
        summaryStatistics0.addValue(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) '#', (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27L) + "'", long2 == (-27L));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        double double2 = variance0.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max3 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long4 = max3.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs5);
        org.apache.commons.math.stat.descriptive.rank.Max max7 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long8 = max7.getN();
        geometricMean6.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray17 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double18 = sum10.evaluate(doubleArray17);
        geometricMean6.incrementAll(doubleArray17);
        double double20 = max3.evaluate(doubleArray17);
        double double21 = variance0.evaluate(doubleArray17);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean23 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment22);
        org.apache.commons.math.stat.descriptive.summary.Sum sum24 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray31 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double32 = sum24.evaluate(doubleArray31);
        double[] doubleArray39 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double42 = sum24.evaluate(doubleArray39, 0, 0);
        double double45 = mean23.evaluate(doubleArray39, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs46 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean47 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs46);
        org.apache.commons.math.stat.descriptive.rank.Max max48 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long49 = max48.getN();
        geometricMean47.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max48);
        org.apache.commons.math.stat.descriptive.summary.Sum sum51 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray58 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double59 = sum51.evaluate(doubleArray58);
        geometricMean47.incrementAll(doubleArray58);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray39, doubleArray58);
        double double62 = variance0.evaluate(doubleArray58);
        org.apache.commons.math.stat.descriptive.summary.Sum sum63 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray70 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double71 = sum63.evaluate(doubleArray70);
        double[] doubleArray78 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double81 = sum63.evaluate(doubleArray78, 0, 0);
        double double83 = variance0.evaluate(doubleArray78, (double) 35);
        double double84 = variance0.getResult();
        variance0.setBiasCorrected(false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 310.0d + "'", double18 == 310.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2817.0666666666666d + "'", double21 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 310.0d + "'", double32 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 310.0d + "'", double59 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2817.0666666666666d + "'", double62 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 310.0d + "'", double71 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 14635.2d + "'", double83 == 14635.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        double double1 = min0.getResult();
        double double2 = min0.getResult();
        double double3 = min0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.283185307179586d + "'", double2 == 7.283185307179586d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        long long27 = mean1.getN();
        mean1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean30 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment29);
        mean30.clear();
        double[] doubleArray37 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean30.incrementAll(doubleArray37, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double43 = mean1.evaluate(doubleArray37, (int) ' ', (-1071382528));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 310.0d + "'", double10 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[2.0, -42.0, 1.0, 32.0, 101.0]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        double double1 = min0.getResult();
        double double2 = min0.getResult();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = min0.evaluate(doubleArray10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        double double2 = variance0.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max3 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long4 = max3.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs5);
        org.apache.commons.math.stat.descriptive.rank.Max max7 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long8 = max7.getN();
        geometricMean6.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray17 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double18 = sum10.evaluate(doubleArray17);
        geometricMean6.incrementAll(doubleArray17);
        double double20 = max3.evaluate(doubleArray17);
        double double21 = variance0.evaluate(doubleArray17);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics22.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long25 = secondMoment24.getN();
        secondMoment24.increment((double) (-1));
        summaryStatistics22.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment24);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean30 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment29);
        double double31 = mean30.getResult();
        mean30.clear();
        summaryStatistics22.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean30);
        org.apache.commons.math.stat.descriptive.rank.Max max34 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long35 = max34.getN();
        summaryStatistics22.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max34);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = summaryStatistics22.getSumLogImpl();
        boolean boolean38 = variance0.equals((java.lang.Object) storelessUnivariateStatistic37);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 310.0d + "'", double18 == 310.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2817.0666666666666d + "'", double21 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.clear();
        mean1.increment(30.482323362278656d);
        double double5 = mean1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance7.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        mean11.clear();
        double[] doubleArray18 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean11.incrementAll(doubleArray18, (int) (short) 1, (int) (byte) 0);
        double double22 = variance7.evaluate(doubleArray18);
        mean1.incrementAll(doubleArray18);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance24.clear();
        double double26 = variance24.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max27 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long28 = max27.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs29 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean30 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs29);
        org.apache.commons.math.stat.descriptive.rank.Max max31 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long32 = max31.getN();
        geometricMean30.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max31);
        org.apache.commons.math.stat.descriptive.summary.Sum sum34 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray41 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double42 = sum34.evaluate(doubleArray41);
        geometricMean30.incrementAll(doubleArray41);
        double double44 = max27.evaluate(doubleArray41);
        double double45 = variance24.evaluate(doubleArray41);
        long long46 = variance24.getN();
        variance24.increment((double) (-51));
        org.apache.commons.math.stat.descriptive.summary.Sum sum49 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray56 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double57 = sum49.evaluate(doubleArray56);
        double[] doubleArray64 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double67 = sum49.evaluate(doubleArray64, 0, 0);
        int int68 = org.apache.commons.math.util.MathUtils.hash(doubleArray64);
        double double72 = variance24.evaluate(doubleArray64, 35.0d, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            mean1.incrementAll(doubleArray64, (-42), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2806.7d + "'", double22 == 2806.7d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 310.0d + "'", double42 == 310.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 2817.0666666666666d + "'", double45 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 310.0d + "'", double57 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2050442118 + "'", int68 == 2050442118);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long3 = secondMoment2.getN();
        secondMoment2.increment((double) (-1));
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance7.clear();
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance7);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum12 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray19 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double20 = sum12.evaluate(doubleArray19);
        double[] doubleArray27 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double30 = sum12.evaluate(doubleArray27, 0, 0);
        double double33 = mean11.evaluate(doubleArray27, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean35 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs34);
        org.apache.commons.math.stat.descriptive.rank.Max max36 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long37 = max36.getN();
        geometricMean35.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max36);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray46 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double47 = sum39.evaluate(doubleArray46);
        geometricMean35.incrementAll(doubleArray46);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean51 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment50);
        org.apache.commons.math.stat.descriptive.summary.Sum sum52 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray59 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double60 = sum52.evaluate(doubleArray59);
        double[] doubleArray67 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double70 = sum52.evaluate(doubleArray67, 0, 0);
        double double73 = mean51.evaluate(doubleArray67, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs74 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean75 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs74);
        org.apache.commons.math.stat.descriptive.rank.Max max76 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long77 = max76.getN();
        geometricMean75.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max76);
        org.apache.commons.math.stat.descriptive.summary.Sum sum79 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray86 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double87 = sum79.evaluate(doubleArray86);
        geometricMean75.incrementAll(doubleArray86);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray67, doubleArray86);
        boolean boolean90 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray67);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = variance7.evaluate(doubleArray27, 1104152832, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 310.0d + "'", double20 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 310.0d + "'", double47 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 310.0d + "'", double60 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 310.0d + "'", double87 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getMaxImpl();
        java.lang.Class<?> wildcardClass18 = storelessUnivariateStatistic17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.descriptive.rank.Max cannot be cast to org.apache.commons.math.stat.descriptive.SummaryStatistics");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic16);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray10 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double11 = sum3.evaluate(doubleArray10);
        double double12 = sumOfLogs0.evaluate(doubleArray10);
        sumOfLogs0.increment((double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 310.0d + "'", double11 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        double double3 = summaryStatistics0.getMean();
        double double4 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Min min3 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min3.increment(0.0d);
        min3.increment(0.0d);
        geometricMean2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min3);
        min3.increment((double) 7L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum16.clear();
        summaryStatistics15.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum16);
        long long19 = summaryStatistics15.getN();
        java.lang.String str20 = summaryStatistics15.toString();
        summaryStatistics15.addValue(1.730777995336729E7d);
        boolean boolean23 = summaryStatistics0.equals((java.lang.Object) summaryStatistics15);
        double double24 = summaryStatistics15.getMax();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str20, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.730777995336729E7d + "'", double24 == 1.730777995336729E7d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(10.892060179263353d, (double) 1078558720);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0785587201926284E9d + "'", double2 == 1.0785587201926284E9d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.lang.Class<?> wildcardClass16 = geometricMean1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 310.0d + "'", double13 == 310.0d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        double double9 = sum0.getResult();
        long long10 = sum0.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs2 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs2);
        org.apache.commons.math.stat.descriptive.rank.Max max4 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long5 = max4.getN();
        geometricMean3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max4);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = geometricMean3.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics8.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long11 = secondMoment10.getN();
        secondMoment10.increment((double) (-1));
        summaryStatistics8.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        geometricMean3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.Mean mean17 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment10);
        variance18.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int1 = org.apache.commons.math.util.MathUtils.hash(30.482323362278656d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-888836577) + "'", int1 == (-888836577));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance3.increment((double) 101L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean7 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment6);
        mean7.clear();
        double[] doubleArray14 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean7.incrementAll(doubleArray14, (int) (short) 1, (int) (byte) 0);
        double double18 = variance3.evaluate(doubleArray14);
        double double19 = sumOfLogs0.evaluate(doubleArray14);
        org.apache.commons.math.stat.descriptive.summary.Sum sum20 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray27 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double28 = sum20.evaluate(doubleArray27);
        double[] doubleArray35 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double38 = sum20.evaluate(doubleArray35, 0, 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray46 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double47 = sum39.evaluate(doubleArray46);
        double[] doubleArray54 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double57 = sum39.evaluate(doubleArray54, 0, 0);
        int int58 = org.apache.commons.math.util.MathUtils.hash(doubleArray54);
        double double61 = sum20.evaluate(doubleArray54, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double64 = sumOfLogs0.evaluate(doubleArray54, 1104154720, 371080922);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2806.7d + "'", double18 == 2806.7d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 310.0d + "'", double28 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 310.0d + "'", double47 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2050442118 + "'", int58 == 2050442118);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray7 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double8 = sum0.evaluate(doubleArray7);
        double[] doubleArray15 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double18 = sum0.evaluate(doubleArray15, 0, 0);
        sum0.clear();
        long long20 = sum0.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 310.0d + "'", double8 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(14635.2d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14635.199999999999d + "'", double2 == 14635.199999999999d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance3.clear();
        double double5 = variance3.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max6 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long7 = max6.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs8);
        org.apache.commons.math.stat.descriptive.rank.Max max10 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long11 = max10.getN();
        geometricMean9.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max10);
        org.apache.commons.math.stat.descriptive.summary.Sum sum13 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray20 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double21 = sum13.evaluate(doubleArray20);
        geometricMean9.incrementAll(doubleArray20);
        double double23 = max6.evaluate(doubleArray20);
        double double24 = variance3.evaluate(doubleArray20);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean26 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment25);
        org.apache.commons.math.stat.descriptive.summary.Sum sum27 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray34 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double35 = sum27.evaluate(doubleArray34);
        double[] doubleArray42 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double45 = sum27.evaluate(doubleArray42, 0, 0);
        double double48 = mean26.evaluate(doubleArray42, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs49 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean50 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs49);
        org.apache.commons.math.stat.descriptive.rank.Max max51 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long52 = max51.getN();
        geometricMean50.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max51);
        org.apache.commons.math.stat.descriptive.summary.Sum sum54 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray61 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double62 = sum54.evaluate(doubleArray61);
        geometricMean50.incrementAll(doubleArray61);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray42, doubleArray61);
        double double65 = variance3.evaluate(doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = variance2.evaluate(doubleArray61, (-0.0d), 5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 310.0d + "'", double21 == 310.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2817.0666666666666d + "'", double24 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 310.0d + "'", double35 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 310.0d + "'", double62 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2817.0666666666666d + "'", double65 == 2817.0666666666666d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getMaxImpl();
        double double6 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance7.clear();
        double double9 = variance7.getResult();
        long long10 = variance7.getN();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance7);
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
            double double99 = variance7.evaluate(doubleArray72, 2050442118, (-231965925));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        mean1.clear();
        mean1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean5 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment4);
        org.apache.commons.math.stat.descriptive.summary.Sum sum6 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double14 = sum6.evaluate(doubleArray13);
        double[] doubleArray21 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double24 = sum6.evaluate(doubleArray21, 0, 0);
        double double27 = mean5.evaluate(doubleArray21, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance28.clear();
        double double30 = variance28.getResult();
        org.apache.commons.math.stat.descriptive.rank.Max max31 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long32 = max31.getN();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs33 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean34 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs33);
        org.apache.commons.math.stat.descriptive.rank.Max max35 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long36 = max35.getN();
        geometricMean34.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max35);
        org.apache.commons.math.stat.descriptive.summary.Sum sum38 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray45 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double46 = sum38.evaluate(doubleArray45);
        geometricMean34.incrementAll(doubleArray45);
        double double48 = max31.evaluate(doubleArray45);
        double double49 = variance28.evaluate(doubleArray45);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean51 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment50);
        org.apache.commons.math.stat.descriptive.summary.Sum sum52 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray59 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double60 = sum52.evaluate(doubleArray59);
        double[] doubleArray67 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double70 = sum52.evaluate(doubleArray67, 0, 0);
        double double73 = mean51.evaluate(doubleArray67, 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs74 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean75 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs74);
        org.apache.commons.math.stat.descriptive.rank.Max max76 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long77 = max76.getN();
        geometricMean75.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max76);
        org.apache.commons.math.stat.descriptive.summary.Sum sum79 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray86 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double87 = sum79.evaluate(doubleArray86);
        geometricMean75.incrementAll(doubleArray86);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray67, doubleArray86);
        double double90 = variance28.evaluate(doubleArray86);
        boolean boolean91 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray86);
        // The following exception was thrown during execution in test generation
        try {
            mean1.incrementAll(doubleArray86, 2050442118, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 310.0d + "'", double14 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 310.0d + "'", double46 == 310.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2817.0666666666666d + "'", double49 == 2817.0666666666666d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 310.0d + "'", double60 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 310.0d + "'", double87 == 310.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 2817.0666666666666d + "'", double90 == 2817.0666666666666d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        double double1 = sumOfSquares0.getResult();
        sumOfSquares0.clear();
        sumOfSquares0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        long long27 = mean1.getN();
        mean1.clear();
        mean1.increment((double) 51);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 310.0d + "'", double10 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-316200L), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-316199.99999999994d) + "'", double2 == (-316199.99999999994d));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1072693279, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693269 + "'", int2 == 1072693269);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        double double11 = summaryStatistics0.getMin();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum3.clear();
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        double double9 = summaryStatistics7.getSum();
        double double10 = summaryStatistics7.getGeometricMean();
        double double11 = summaryStatistics7.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics7.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics7.getSumImpl();
        summaryStatistics2.setSumImpl(storelessUnivariateStatistic13);
        boolean boolean15 = variance1.equals((java.lang.Object) summaryStatistics2);
        variance1.increment(Double.NaN);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        long long10 = summaryStatistics0.getN();
        double double11 = summaryStatistics0.getSum();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        secondMoment0.increment((double) 1076101120);
        secondMoment0.clear();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        double double2 = sumOfLogs0.getResult();
        double double3 = sumOfLogs0.getResult();
        long long4 = sumOfLogs0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment5);
        mean6.clear();
        double[] doubleArray13 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean6.incrementAll(doubleArray13, (int) (short) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Mean mean18 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment17);
        mean18.clear();
        double[] doubleArray25 = new double[] { 2L, (-42), (byte) 1, ' ', 101L };
        mean18.incrementAll(doubleArray25, (int) (short) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.summary.Sum sum29 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray36 = new double[] { (short) 100, 10, (short) 100, (byte) -1, 100.0f, (short) 1 };
        double double37 = sum29.evaluate(doubleArray36);
        double[] doubleArray44 = new double[] { (-1), (-1.0d), 310.0d, (short) 100, (short) -1, 97L };
        double double47 = sum29.evaluate(doubleArray44, 0, 0);
        boolean boolean48 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray44);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray44);
        // The following exception was thrown during execution in test generation
        try {
            double double52 = sumOfLogs0.evaluate(doubleArray13, 1104154720, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[2.0, -42.0, 1.0, 32.0, 101.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 10.0, 100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 310.0d + "'", double37 == 310.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, 310.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics0.getVarianceImpl();
        double double14 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(2L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        long long1 = org.apache.commons.math.util.MathUtils.sign(117996257280L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.increment(0.0d);
        min0.clear();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        sum3.clear();
        summaryStatistics2.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        double double9 = summaryStatistics7.getSum();
        double double10 = summaryStatistics7.getGeometricMean();
        double double11 = summaryStatistics7.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics7.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics7.getSumImpl();
        summaryStatistics2.setSumImpl(storelessUnivariateStatistic13);
        boolean boolean15 = variance1.equals((java.lang.Object) summaryStatistics2);
        double double16 = summaryStatistics2.getVariance();
        double double17 = summaryStatistics2.getGeometricMean();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        long long5 = geometricMean1.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = geometricMean1.getSumLogImpl();
        long long7 = geometricMean1.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        long long10 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics0.getMaxImpl();
        double double12 = summaryStatistics0.getVariance();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.rank.Max max2 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long3 = max2.getN();
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max2);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        geometricMean1.clear();
        geometricMean1.clear();
        geometricMean1.increment((double) 2L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        double double13 = summaryStatistics0.getSumOfLogs();
        double double14 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(100, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 60.224974280318214d + "'", double2 == 60.224974280318214d);
    }
}

