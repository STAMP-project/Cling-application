import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 0L, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double double3 = org.apache.commons.math.util.MathUtils.round((-1.0d), (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5663706143591725d) + "'", double2 == (-2.5663706143591725d));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1L, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        float float1 = org.apache.commons.math.util.MathUtils.sign(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray5 = new double[] { 10.0d, (byte) 100, (-1.0d), '4' };
        // The following exception was thrown during execution in test generation
        try {
            mean0.incrementAll(doubleArray5, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, -1.0, 52.0]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((double) 1.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) ' ', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.867258771281655d + "'", double2 == 6.867258771281655d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-2.5663706143591725d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1860947059) + "'", int1 == (-1860947059));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        min0.clear();
        long long3 = min0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 97, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 98L + "'", long2 == 98L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-4244709), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4244709L) + "'", long2 == (-4244709L));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-4244709L), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-411736773L) + "'", long2 == (-411736773L));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        double[] doubleArray6 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = sum0.evaluate(doubleArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-4244709) + "'", int7 == (-4244709));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4244709) + "'", int8 == (-4244709));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.619275968248924E151d + "'", double1 == 9.619275968248924E151d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double[] doubleArray6 = new double[] { (byte) 0, 0, 1.0f, (byte) 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double double9 = sumOfLogs0.evaluate(doubleArray6, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 1.0, 10.0, 1.0]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) '4', (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        boolean boolean6 = geometricMean1.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) ' ', (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        double double1 = firstMoment0.getResult();
        double double2 = firstMoment0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        double double1 = org.apache.commons.math.util.MathUtils.sign(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) 1, (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(4, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = min0.evaluate(doubleArray7, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        double[] doubleArray7 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = sum0.evaluate(doubleArray7, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4244709) + "'", int8 == (-4244709));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        double[] doubleArray9 = new double[] { (-1L), (-2.5663706143591725d), (-4244709), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            geometricMean1.incrementAll(doubleArray9, 0, (-1860947059));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -2.5663706143591725, -4244709.0, 32.0]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        org.apache.commons.math.stat.descriptive.rank.Min min2 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long3 = min2.getN();
        double double4 = min2.getResult();
        double[] doubleArray7 = new double[] { (short) 100, (byte) 0 };
        min2.incrementAll(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = sum0.evaluate(doubleArray7, (-1860947059), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 0.0]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        long long1 = org.apache.commons.math.util.MathUtils.sign(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        boolean boolean9 = summaryStatistics0.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = summaryStatistics0.getVariance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) ' ', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        double double1 = firstMoment0.getResult();
        double[] doubleArray7 = new double[] { 100L, (-1L), (-1L), (short) 100, (-1.1752011936438014d) };
        // The following exception was thrown during execution in test generation
        try {
            double double10 = firstMoment0.evaluate(doubleArray7, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, -1.0, -1.0, 100.0, -1.1752011936438014]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        min0.clear();
        double double3 = min0.getResult();
        double[] doubleArray9 = new double[] { 100.0d, (short) 10, 10L, (byte) 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            double double12 = min0.evaluate(doubleArray9, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 10.0, 10.0, 10.0, 100.0]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(98L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198L + "'", long2 == 198L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        double double2 = mean0.getResult();
        mean0.increment(0.0d);
        org.apache.commons.math.stat.descriptive.rank.Min min5 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long6 = min5.getN();
        double double7 = min5.getResult();
        double[] doubleArray10 = new double[] { (short) 100, (byte) 0 };
        min5.incrementAll(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = mean0.evaluate(doubleArray10, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 0.0]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        boolean boolean3 = geometricMean1.equals((java.lang.Object) (-2.5663706143591725d));
        double[] doubleArray5 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double double8 = geometricMean1.evaluate(doubleArray5, (int) '4', (-1860947059));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        org.apache.commons.math.stat.descriptive.rank.Min min2 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long3 = min2.getN();
        double double4 = min2.getResult();
        double[] doubleArray7 = new double[] { (short) 100, (byte) 0 };
        min2.incrementAll(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = mean0.evaluate(doubleArray7, 40, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 0.0]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        long long2 = sumOfLogs0.getN();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            sumOfLogs0.incrementAll(doubleArray8, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.addValue((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-4244709), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4244699L) + "'", long2 == (-4244699L));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) 100, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 152L + "'", long2 == 152L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1L, (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-411736773L), (-2.5663706143591725d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean0.clear();
        double[] doubleArray6 = new double[] { (short) 0, '#', 10.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double double9 = geometricMean0.evaluate(doubleArray6, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 35.0, 10.0, 10.0]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        double double1 = org.apache.commons.math.util.MathUtils.sign((-2.5663706143591725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.028157807631068d + "'", double2 == 19.028157807631068d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.619275968248924E151d + "'", double1 == 9.619275968248924E151d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        long long5 = geometricMean1.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-4244709), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4244612) + "'", int2 == (-4244612));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-132) + "'", int2 == (-132));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        boolean boolean9 = summaryStatistics0.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.addValue((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        boolean boolean10 = variance1.isBiasCorrected();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = variance1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 0, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-1), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (byte) 100, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) 0, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1077936128 + "'", int1 == 1077936128);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(40, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60) + "'", int2 == (-60));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-60), 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7920) + "'", int2 == (-7920));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        boolean boolean3 = summaryStatistics0.equals((java.lang.Object) (-99L));
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1860947059), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment((double) '4');
        double[] doubleArray3 = null;
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray3, doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            sumOfSquares0.incrementAll(doubleArray3, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4244709) + "'", int11 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-60));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        long long1 = summaryStatistics0.getN();
        double double2 = summaryStatistics0.getMax();
        double double3 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long5 = sum4.getN();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum4);
        sum4.clear();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        double[] doubleArray11 = new double[] { 100.0d, (-132), 0, 100.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double double14 = geometricMean1.evaluate(doubleArray11, (int) 'a', (-60));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -132.0, 0.0, 100.0, 10.0]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        summaryStatistics0.addValue((double) 100.0f);
        org.apache.commons.math.stat.descriptive.moment.Mean mean9 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long10 = mean9.getN();
        mean9.clear();
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementations must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int1 = org.apache.commons.math.util.MathUtils.hash(6.867258771281655d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-285985870) + "'", int1 == (-285985870));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        boolean boolean9 = summaryStatistics0.equals((java.lang.Object) (byte) 0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        double double2 = mean0.getResult();
        double double3 = mean0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(Double.NaN);
        double double3 = sumOfSquares0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getVariance();
        double double8 = summaryStatistics0.getMin();
        double double9 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getSumsqImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-132), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-132) + "'", int2 == (-132));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) ' ', (-4244709));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 198L, (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 197.99999999999997d + "'", double2 == 197.99999999999997d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        double double5 = summaryStatistics0.getMean();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        org.apache.commons.math.stat.descriptive.rank.Min min1 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long2 = min1.getN();
        min1.clear();
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        double double11 = min1.evaluate(doubleArray9);
        sum0.incrementAll(doubleArray9);
        sum0.increment((-0.0d));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1L), (-285985870));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        variance1.increment((-2.5663706143591725d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = variance1.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        boolean boolean12 = summaryStatistics0.equals((java.lang.Object) doubleArray8);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean13 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean13.clear();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = geometricMean13.getSumLogImpl();
        summaryStatistics0.setMinImpl(storelessUnivariateStatistic15);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4244709) + "'", int11 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment13 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) firstMoment13);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary15 = summaryStatistics0.getSummary();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(statisticalSummary15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        long long2 = sumOfLogs0.getN();
        long long3 = sumOfLogs0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        double[] doubleArray15 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double17 = variance10.evaluate(doubleArray15, (double) (-1860947059));
        variance10.clear();
        boolean boolean19 = variance10.isBiasCorrected();
        double[] doubleArray25 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        int int28 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        double double29 = variance10.evaluate(doubleArray25);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = variance1.evaluate(doubleArray25, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.3132617538332817E303d + "'", double17 == 2.3132617538332817E303d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-4244709) + "'", int26 == (-4244709));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4244709) + "'", int27 == (-4244709));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4244709) + "'", int28 == (-4244709));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1842.2000000000003d + "'", double29 == 1842.2000000000003d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        // The following exception was thrown during execution in test generation
        try {
            long long2 = variance1.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        sumOfLogs0.increment((double) (short) 1);
        double double4 = sumOfLogs0.getResult();
        double double5 = sumOfLogs0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment13 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) firstMoment13);
        firstMoment13.clear();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1820 + "'", int2 == 1820);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-7920), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        firstMoment0.clear();
        firstMoment0.increment((double) '#');
        firstMoment0.increment((double) 98L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double7 = summaryStatistics0.getSumsq();
        double double8 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        geometricMean1.increment(9.332621544395286E157d);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        boolean boolean2 = variance1.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1, (double) (-60));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 100, (-4244612));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs7);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean10 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean10.clear();
        double double12 = geometricMean10.getResult();
        summaryStatistics9.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = geometricMean10.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = geometricMean10.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs16 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double17 = sumOfLogs16.getResult();
        org.apache.commons.math.stat.descriptive.rank.Min min18 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long19 = min18.getN();
        double double20 = min18.getResult();
        double[] doubleArray23 = new double[] { (short) 100, (byte) 0 };
        min18.incrementAll(doubleArray23);
        sumOfLogs16.incrementAll(doubleArray23);
        double double26 = geometricMean10.evaluate(doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = sumOfLogs7.evaluate(doubleArray23, 1, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertNotNull(summaryStatistics9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-132), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        min0.increment((double) (-4244709L));
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = min0.evaluate(doubleArray5, (-4244612), (-1860947059));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 10, (-4244709));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4244699) + "'", int2 == (-4244699));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        double double5 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = variance1.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 100, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        min0.increment((double) (-4244709L));
        min0.increment((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 10, 1820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1810) + "'", int2 == (-1810));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs14 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean15 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs14);
        double[] doubleArray21 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int22 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double double27 = geometricMean15.evaluate(doubleArray21, (int) (short) 0, (int) (short) 0);
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean15);
        double[] doubleArray34 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int35 = org.apache.commons.math.util.MathUtils.hash(doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            double double38 = geometricMean15.evaluate(doubleArray34, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-4244709) + "'", int22 == (-4244709));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4244709) + "'", int23 == (-4244709));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4244709) + "'", int24 == (-4244709));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-4244709) + "'", int35 == (-4244709));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(132);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 515.8908245878225d + "'", double1 == 515.8908245878225d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1077936128);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        sumOfLogs0.clear();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = sum0.evaluate(doubleArray8, 1077936128, (-4244699));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (short) 1, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.283185307179586d + "'", double2 == 7.283185307179586d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        sumOfLogs0.increment((double) (-1810));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic13);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-132), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        sum0.clear();
        sum0.clear();
        long long4 = sum0.getN();
        long long5 = sum0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(9.619275968248924E151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double1 = secondMoment0.getResult();
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean5 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean5.clear();
        double double7 = geometricMean5.getResult();
        summaryStatistics4.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean5);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = geometricMean5.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = geometricMean5.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double12 = sumOfLogs11.getResult();
        org.apache.commons.math.stat.descriptive.rank.Min min13 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long14 = min13.getN();
        double double15 = min13.getResult();
        double[] doubleArray18 = new double[] { (short) 100, (byte) 0 };
        min13.incrementAll(doubleArray18);
        sumOfLogs11.incrementAll(doubleArray18);
        double double21 = geometricMean5.evaluate(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = mean3.evaluate(doubleArray18, (-7920), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(summaryStatistics4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getSum();
        long long4 = summaryStatistics0.getN();
        boolean boolean6 = summaryStatistics0.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, (-4244612));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4244613 + "'", int2 == 4244613);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getVariance();
        double double8 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max0.increment((double) (-7920));
        long long3 = max0.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(100, (-1810));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        double double2 = sum0.getResult();
        sum0.increment((double) 100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        mean0.clear();
        long long3 = mean0.getN();
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = mean0.evaluate(doubleArray9, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        long long3 = sum0.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics4.getGeoMeanImpl();
        double double6 = summaryStatistics4.getMin();
        double[] doubleArray12 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        boolean boolean16 = summaryStatistics4.equals((java.lang.Object) doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = sum0.evaluate(doubleArray12, (-285985870), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(summaryStatistics4);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4244709) + "'", int13 == (-4244709));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4244709) + "'", int14 == (-4244709));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4244709) + "'", int15 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double8 = summaryStatistics0.getMin();
        double double9 = summaryStatistics0.getMean();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 'a', (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        double[] doubleArray7 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double double9 = variance0.evaluate(doubleArray7);
        boolean boolean10 = variance0.isBiasCorrected();
        variance0.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4244709) + "'", int8 == (-4244709));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1842.2000000000003d + "'", double9 == 1842.2000000000003d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        boolean boolean10 = variance1.isBiasCorrected();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = variance1.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        mean0.clear();
        mean0.clear();
        long long4 = mean0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        boolean boolean12 = summaryStatistics0.equals((java.lang.Object) doubleArray8);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4244709) + "'", int11 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4244709) + "'", int13 == (-4244709));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4244709) + "'", int14 == (-4244709));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 198L, 132);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.0d + "'", double2 == 198.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 156.3608363030788d + "'", double1 == 156.3608363030788d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        long long2 = sumOfLogs0.getN();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = sumOfLogs0.evaluate(doubleArray8, (-285985870), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-4244709), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4244709 + "'", int2 == 4244709);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max0.increment((double) (-7920));
        max0.clear();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getSumsq();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        long long3 = sum0.getN();
        sum0.clear();
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sum0.incrementAll(doubleArray5, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = geometricMean1.getSumLogImpl();
        double double3 = geometricMean1.getResult();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        summaryStatistics0.addValue((double) (byte) 10);
        java.lang.String str19 = summaryStatistics0.toString();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SummaryStatistics:\nn: 1\nmin: 10.0\nmax: 10.0\nmean: 10.0\ngeometric mean: 22026.465794806754\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: 10.000000000000002\n" + "'", str19, "SummaryStatistics:\nn: 1\nmin: 10.0\nmax: 10.0\nmean: 10.0\ngeometric mean: 22026.465794806754\nvariance: 0.0\nsum of squares: NaN\nstandard deviation: 0.0\nsum of logs: 10.000000000000002\n");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean0.clear();
        geometricMean0.increment((double) (-285985870));
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = geometricMean0.getSumLogImpl();
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 0, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        double[] doubleArray16 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double18 = variance11.evaluate(doubleArray16, (double) (-1860947059));
        variance11.clear();
        boolean boolean20 = variance11.isBiasCorrected();
        double[] doubleArray26 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        int int28 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        double double30 = variance11.evaluate(doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = variance1.evaluate(doubleArray26, 0, (-60));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.3132617538332817E303d + "'", double18 == 2.3132617538332817E303d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4244709) + "'", int27 == (-4244709));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4244709) + "'", int28 == (-4244709));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-4244709) + "'", int29 == (-4244709));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1842.2000000000003d + "'", double30 == 1842.2000000000003d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        double[] doubleArray8 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double10 = variance3.evaluate(doubleArray8, (double) (-1860947059));
        // The following exception was thrown during execution in test generation
        try {
            variance1.incrementAll(doubleArray8, 100, (-60));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.3132617538332817E303d + "'", double10 == 2.3132617538332817E303d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        boolean boolean12 = summaryStatistics0.equals((java.lang.Object) doubleArray8);
        double double13 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4244709) + "'", int11 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double1 = secondMoment0.getResult();
        secondMoment0.clear();
        double double3 = secondMoment0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        firstMoment0.clear();
        firstMoment0.increment((double) '#');
        firstMoment0.increment((-1.1752011936438014d));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics0.getSumImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic17);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.rank.Min min1 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long2 = min1.getN();
        min1.clear();
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        double double11 = min1.evaluate(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            variance0.incrementAll(doubleArray9, (-1860947059), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        min0.clear();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        double double10 = min0.evaluate(doubleArray8);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double12 = sumOfLogs11.getResult();
        org.apache.commons.math.stat.descriptive.rank.Min min13 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long14 = min13.getN();
        double double15 = min13.getResult();
        double[] doubleArray18 = new double[] { (short) 100, (byte) 0 };
        min13.incrementAll(doubleArray18);
        sumOfLogs11.incrementAll(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = min0.evaluate(doubleArray18, (-60), 4244709);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance2.clear();
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        double double11 = variance2.evaluate(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = variance1.evaluate(doubleArray9, (double) '#', (-132), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1842.2000000000003d + "'", double11 == 1842.2000000000003d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMeanImpl();
        double double7 = summaryStatistics0.getVariance();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        java.lang.String str5 = summaryStatistics0.toString();
        summaryStatistics0.clear();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str5, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        summaryStatistics0.addValue((double) (byte) 10);
        double double19 = summaryStatistics0.getMax();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = geometricMean1.getSumLogImpl();
        geometricMean1.increment((double) 98);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment((double) '4');
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics3.getGeoMeanImpl();
        double double5 = summaryStatistics3.getMin();
        double[] doubleArray11 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        boolean boolean15 = summaryStatistics3.equals((java.lang.Object) doubleArray11);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = sumOfSquares0.evaluate(doubleArray11, (-4244612), 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics3);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4244709) + "'", int12 == (-4244709));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4244709) + "'", int13 == (-4244709));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4244709) + "'", int14 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4244709) + "'", int16 == (-4244709));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementations must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min5 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long6 = min5.getN();
        double double7 = min5.getResult();
        double[] doubleArray10 = new double[] { (short) 100, (byte) 0 };
        min5.incrementAll(doubleArray10);
        variance4.incrementAll(doubleArray10);
        double double13 = secondMoment1.evaluate(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = max0.evaluate(doubleArray10, 40, (-7920));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5000.0d + "'", double13 == 5000.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        min0.clear();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        double double10 = min0.evaluate(doubleArray8);
        min0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min6 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long7 = min6.getN();
        double double8 = min6.getResult();
        double[] doubleArray11 = new double[] { (short) 100, (byte) 0 };
        min6.incrementAll(doubleArray11);
        variance5.incrementAll(doubleArray11);
        double double14 = secondMoment2.evaluate(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = sumOfLogs0.evaluate(doubleArray11, (-132), (-285985870));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5000.0d + "'", double14 == 5000.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        org.apache.commons.math.stat.descriptive.rank.Min min17 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long18 = min17.getN();
        double double19 = min17.getResult();
        double[] doubleArray22 = new double[] { (short) 100, (byte) 0 };
        min17.incrementAll(doubleArray22);
        double double25 = variance15.evaluate(doubleArray22, (double) 0.0f);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5000.0d + "'", double25 == 5000.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        double double8 = summaryStatistics0.getStandardDeviation();
        double double9 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1077936128, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1077936138 + "'", int2 == 1077936138);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double7 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(31L, (long) (-285985870));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 285985901L + "'", long2 == 285985901L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 10, (-1810));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1800) + "'", int2 == (-1800));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        long long6 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        boolean boolean14 = sumOfLogs8.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = sumOfLogs8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.descriptive.summary.SumOfLogs cannot be cast to org.apache.commons.math.stat.descriptive.SummaryStatistics");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        min0.increment(0.0d);
        min0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(Double.NaN);
        sumOfSquares0.increment((double) 0.0f);
        sumOfSquares0.increment((double) 4244613);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double8 = summaryStatistics0.getMin();
        double double9 = summaryStatistics0.getVariance();
        double double10 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.increment((double) (-1860947059));
        sumOfSquares0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        double double3 = sumOfSquares0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1800));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((double) ' ');
        mean0.clear();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        mean0.clear();
        double[] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = mean0.evaluate(doubleArray3, 97, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMinImpl();
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getMean();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        min0.increment((double) (byte) 100);
        min0.clear();
        double double10 = min0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        org.apache.commons.math.stat.descriptive.summary.Sum sum13 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum13);
        double double15 = sum13.getResult();
        double double16 = sum13.getResult();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        double double2 = org.apache.commons.math.util.MathUtils.log(0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long4 = sum3.getN();
        long long5 = sum3.getN();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        double double7 = sum3.getResult();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(98);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.426890448884134E153d + "'", double1 == 9.426890448884134E153d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        long long1 = summaryStatistics0.getN();
        double double2 = summaryStatistics0.getMax();
        double double3 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.Sum sum4 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long5 = sum4.getN();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum4);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        java.lang.Class<?> wildcardClass3 = sumOfSquares0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs7);
        sumOfLogs7.increment((-1.1752011936438014d));
        double double11 = sumOfLogs7.getResult();
        double[] doubleArray17 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        org.apache.commons.math.stat.descriptive.rank.Min min19 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long20 = min19.getN();
        double double21 = min19.getResult();
        double[] doubleArray24 = new double[] { (short) 100, (byte) 0 };
        min19.incrementAll(doubleArray24);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray17, doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = sumOfLogs7.evaluate(doubleArray17, (-1800), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4244709) + "'", int18 == (-4244709));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 100, (-1810));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.increment((double) (-1860947059));
        sumOfSquares0.increment(10.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getSum();
        double double4 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        double double1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        double[] doubleArray7 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double double9 = variance0.evaluate(doubleArray7);
        boolean boolean10 = variance0.isBiasCorrected();
        variance0.increment(9.619275968248924E151d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4244709) + "'", int8 == (-4244709));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1842.2000000000003d + "'", double9 == 1842.2000000000003d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        double double6 = summaryStatistics0.getSumsq();
        double double7 = summaryStatistics0.getVariance();
        double double8 = summaryStatistics0.getVariance();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        long long7 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        double double4 = summaryStatistics0.getVariance();
        double double5 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares7 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares7.increment((double) '4');
        long long10 = sumOfSquares7.getN();
        summaryStatistics0.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares7);
        summaryStatistics0.addValue((double) 0.0f);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic3 = summaryStatistics2.getGeoMeanImpl();
        double double4 = summaryStatistics2.getMin();
        double[] doubleArray10 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray10);
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray10);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray10);
        boolean boolean14 = summaryStatistics2.equals((java.lang.Object) doubleArray10);
        double double15 = variance1.evaluate(doubleArray10);
        org.junit.Assert.assertNotNull(summaryStatistics2);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4244709) + "'", int11 == (-4244709));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4244709) + "'", int12 == (-4244709));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4244709) + "'", int13 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1473.7600000000002d + "'", double15 == 1473.7600000000002d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray2 = null;
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equals(doubleArray2, doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = variance1.evaluate(doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input values array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-4244699L), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4244699.0f) + "'", float2 == (-4244699.0f));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        double double6 = summaryStatistics0.getSumsq();
        double double7 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.rank.Min min10 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long11 = min10.getN();
        min10.clear();
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min10);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        firstMoment0.increment((double) (-99L));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        double double5 = summaryStatistics0.getMax();
        double double6 = summaryStatistics0.getSumsq();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean0.clear();
        geometricMean0.increment((double) (-285985870));
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares4 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares4.increment(Double.NaN);
        sumOfSquares4.increment((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            geometricMean0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementation must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        long long2 = sumOfLogs0.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long4 = mean3.getN();
        mean3.clear();
        long long6 = mean3.getN();
        double double7 = mean3.getResult();
        boolean boolean8 = sumOfLogs0.equals((java.lang.Object) mean3);
        sumOfLogs0.increment((double) (short) -1);
        double double11 = sumOfLogs0.getResult();
        sumOfLogs0.increment(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        double double6 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min2 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long3 = min2.getN();
        double double4 = min2.getResult();
        double[] doubleArray7 = new double[] { (short) 100, (byte) 0 };
        min2.incrementAll(doubleArray7);
        variance1.incrementAll(doubleArray7);
        double[] doubleArray15 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        org.apache.commons.math.stat.descriptive.rank.Min min17 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long18 = min17.getN();
        double double19 = min17.getResult();
        double[] doubleArray22 = new double[] { (short) 100, (byte) 0 };
        min17.incrementAll(doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray15, doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = variance1.evaluate(doubleArray15, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4244709) + "'", int16 == (-4244709));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean(firstMoment0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        long long2 = sumOfLogs0.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long4 = mean3.getN();
        mean3.clear();
        long long6 = mean3.getN();
        double double7 = mean3.getResult();
        boolean boolean8 = sumOfLogs0.equals((java.lang.Object) mean3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min13 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long14 = min13.getN();
        double double15 = min13.getResult();
        double[] doubleArray18 = new double[] { (short) 100, (byte) 0 };
        min13.incrementAll(doubleArray18);
        variance12.incrementAll(doubleArray18);
        double double21 = secondMoment9.evaluate(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = mean3.evaluate(doubleArray18, 40, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5000.0d + "'", double21 == 5000.0d);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) '4', (-132), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double8 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getGeoMeanImpl();
        double double10 = summaryStatistics0.getMean();
        summaryStatistics0.addValue(9.619275968248924E151d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        double[] doubleArray19 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double21 = variance14.evaluate(doubleArray19, (double) (-1860947059));
        variance14.clear();
        variance14.increment((-2.5663706143591725d));
        // The following exception was thrown during execution in test generation
        try {
            summaryStatistics0.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Implementations must be configured before values are added.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.3132617538332817E303d + "'", double21 == 2.3132617538332817E303d);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double1 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.clear();
        secondMoment0.clear();
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        firstMoment0.clear();
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            firstMoment0.incrementAll(doubleArray2, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        firstMoment0.clear();
        firstMoment0.increment((double) '#');
        firstMoment0.clear();
        double double5 = firstMoment0.getResult();
        long long6 = firstMoment0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-4244709));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        boolean boolean9 = summaryStatistics0.equals((java.lang.Object) (byte) 0);
        org.apache.commons.math.stat.descriptive.rank.Min min10 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long11 = min10.getN();
        min10.clear();
        double double13 = min10.getResult();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min10);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics0.getGeoMeanImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        min0.clear();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        boolean boolean10 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        long long2 = sumOfLogs0.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean3 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long4 = mean3.getN();
        mean3.clear();
        long long6 = mean3.getN();
        double double7 = mean3.getResult();
        boolean boolean8 = sumOfLogs0.equals((java.lang.Object) mean3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min13 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long14 = min13.getN();
        double double15 = min13.getResult();
        double[] doubleArray18 = new double[] { (short) 100, (byte) 0 };
        min13.incrementAll(doubleArray18);
        variance12.incrementAll(doubleArray18);
        double double21 = secondMoment9.evaluate(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = sumOfLogs0.evaluate(doubleArray18, 100, (-4244612));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5000.0d + "'", double21 == 5000.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double8 = summaryStatistics0.getMin();
        long long9 = summaryStatistics0.getN();
        double double10 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        double double5 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics6.getGeoMeanImpl();
        double double8 = summaryStatistics6.getMin();
        double double9 = summaryStatistics6.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics6.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = summaryStatistics6.getSummary();
        summaryStatistics6.clear();
        boolean boolean13 = summaryStatistics0.equals((java.lang.Object) summaryStatistics6);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(summaryStatistics6);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
        org.junit.Assert.assertNotNull(statisticalSummary11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        double double2 = mean0.getResult();
        mean0.increment(0.0d);
        double double5 = mean0.getResult();
        double double6 = mean0.getResult();
        double double7 = mean0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares5 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares5.increment((double) '4');
        summaryStatistics0.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares5);
        double[] doubleArray14 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        org.apache.commons.math.stat.descriptive.rank.Min min16 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long17 = min16.getN();
        double double18 = min16.getResult();
        double[] doubleArray21 = new double[] { (short) 100, (byte) 0 };
        min16.incrementAll(doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = sumOfSquares5.evaluate(doubleArray21, 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4244709) + "'", int15 == (-4244709));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getSumsq();
        double double3 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        boolean boolean3 = geometricMean1.equals((java.lang.Object) (-2.5663706143591725d));
        geometricMean1.increment((double) 100);
        long long6 = geometricMean1.getN();
        geometricMean1.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max0.increment((double) (-7920));
        double[] doubleArray3 = null;
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray3, doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = max0.evaluate(doubleArray3, (int) (byte) 10, 4244613);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4244709) + "'", int11 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        summaryStatistics0.addValue((double) (byte) 10);
        double double19 = summaryStatistics0.getSum();
        long long20 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        double double8 = summaryStatistics0.getStandardDeviation();
        long long9 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        long long8 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getSumImpl();
        double double10 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics0.getMaxImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic11);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic12);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(Double.NaN);
        sumOfSquares0.increment((double) 0.0f);
        long long5 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        double double7 = sumOfSquares0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = geometricMean0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min4 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long5 = min4.getN();
        double double6 = min4.getResult();
        double[] doubleArray9 = new double[] { (short) 100, (byte) 0 };
        min4.incrementAll(doubleArray9);
        variance3.incrementAll(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = geometricMean0.evaluate(doubleArray9, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 0.0]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs3 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double4 = sumOfLogs3.getResult();
        long long5 = sumOfLogs3.getN();
        summaryStatistics0.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs3);
        double double7 = summaryStatistics0.getSumsq();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        sumOfLogs0.increment((double) (short) 1);
        double double4 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs5);
        double[] doubleArray12 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double double18 = geometricMean6.evaluate(doubleArray12, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = sumOfLogs0.evaluate(doubleArray12, (-7920), 132);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4244709) + "'", int13 == (-4244709));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4244709) + "'", int14 == (-4244709));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4244709) + "'", int15 == (-4244709));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        mean0.clear();
        long long3 = mean0.getN();
        mean0.increment((double) (byte) 0);
        long long6 = mean0.getN();
        org.apache.commons.math.stat.descriptive.rank.Min min7 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long8 = min7.getN();
        min7.clear();
        double[] doubleArray15 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        double double17 = min7.evaluate(doubleArray15);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = mean0.evaluate(doubleArray15, (-285985870), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4244709) + "'", int16 == (-4244709));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4244709) + "'", int18 == (-4244709));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMaxImpl();
        summaryStatistics0.addValue((double) 10.0f);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double1 = secondMoment0.getResult();
        long long2 = secondMoment0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.increment((double) (-1860947059));
        org.apache.commons.math.stat.descriptive.rank.Min min4 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long5 = min4.getN();
        min4.clear();
        double[] doubleArray12 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double double14 = min4.evaluate(doubleArray12);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = sumOfSquares0.evaluate(doubleArray12, (int) (byte) 0, (-4244699));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4244709) + "'", int13 == (-4244709));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4244709) + "'", int15 == (-4244709));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        double double4 = summaryStatistics0.getVariance();
        double double5 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares7 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares7.increment((double) '4');
        long long10 = sumOfSquares7.getN();
        summaryStatistics0.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares7);
        summaryStatistics0.addValue((double) (-4244612));
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        double double5 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long7 = mean6.getN();
        double double8 = mean6.getResult();
        mean6.increment(0.0d);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double12 = sumOfLogs11.getResult();
        org.apache.commons.math.stat.descriptive.rank.Min min13 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long14 = min13.getN();
        double double15 = min13.getResult();
        double[] doubleArray18 = new double[] { (short) 100, (byte) 0 };
        min13.incrementAll(doubleArray18);
        sumOfLogs11.incrementAll(doubleArray18);
        double double23 = mean6.evaluate(doubleArray18, (int) (byte) 1, (int) (byte) 1);
        boolean boolean24 = summaryStatistics0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        sumOfLogs0.increment((double) (short) 1);
        java.lang.Class<?> wildcardClass4 = sumOfLogs0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.descriptive.summary.SumOfLogs cannot be cast to org.apache.commons.math.stat.descriptive.SummaryStatistics");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        boolean boolean2 = variance0.isBiasCorrected();
        double double3 = variance0.getResult();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(Double.NaN);
        sumOfSquares0.increment((double) 0.0f);
        long long5 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        long long7 = sumOfSquares0.getN();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        double double2 = org.apache.commons.math.util.MathUtils.log(7.283185307179586d, (double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        long long1 = org.apache.commons.math.util.MathUtils.sign(31L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        min0.increment((double) (byte) 100);
        min0.clear();
        min0.clear();
        min0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        double double8 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment9);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-4244699.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 31L, (-1810), (-7920));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        double double2 = sum0.getResult();
        sum0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        min0.increment((double) (byte) 100);
        min0.clear();
        min0.increment((double) (-4244612));
        double double12 = min0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4244612.0d) + "'", double12 == (-4244612.0d));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        sumOfLogs0.increment((double) (-4244699.0f));
        double double4 = sumOfLogs0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        double double2 = org.apache.commons.math.util.MathUtils.round((-4244699.0d), 4244709);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4244699.0d) + "'", double2 == (-4244699.0d));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min2 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long3 = min2.getN();
        double double4 = min2.getResult();
        double[] doubleArray7 = new double[] { (short) 100, (byte) 0 };
        min2.incrementAll(doubleArray7);
        variance1.incrementAll(doubleArray7);
        double double10 = variance1.getResult();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2500.0d + "'", double10 == 2500.0d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        double double2 = mean0.getResult();
        mean0.increment(0.0d);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs5 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double6 = sumOfLogs5.getResult();
        org.apache.commons.math.stat.descriptive.rank.Min min7 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long8 = min7.getN();
        double double9 = min7.getResult();
        double[] doubleArray12 = new double[] { (short) 100, (byte) 0 };
        min7.incrementAll(doubleArray12);
        sumOfLogs5.incrementAll(doubleArray12);
        double double17 = mean0.evaluate(doubleArray12, (int) (byte) 1, (int) (byte) 1);
        double[] doubleArray22 = new double[] { 7.283185307179586d, (-7920), 1L, (-285985870) };
        // The following exception was thrown during execution in test generation
        try {
            double double25 = mean0.evaluate(doubleArray22, 1820, (-60));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[7.283185307179586, -7920.0, 1.0, -2.8598587E8]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        variance1.increment((-2.5663706143591725d));
        variance1.increment((-0.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1860947059));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(19.028157807631068d, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.028157807631064d + "'", double2 == 19.028157807631064d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs3 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double4 = sumOfLogs3.getResult();
        long long5 = sumOfLogs3.getN();
        sumOfLogs3.clear();
        double double7 = sumOfLogs3.getResult();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs3);
        double double9 = summaryStatistics0.getMean();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = geometricMean1.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        boolean boolean10 = geometricMean8.equals((java.lang.Object) (-2.5663706143591725d));
        geometricMean8.increment((double) 100);
        long long13 = geometricMean8.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic15 = summaryStatistics14.getGeoMeanImpl();
        double double16 = summaryStatistics14.getMin();
        double[] doubleArray22 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        int int25 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        boolean boolean26 = summaryStatistics14.equals((java.lang.Object) doubleArray22);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        geometricMean8.incrementAll(doubleArray22);
        geometricMean1.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean8);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(summaryStatistics14);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-4244709) + "'", int23 == (-4244709));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4244709) + "'", int24 == (-4244709));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-4244709) + "'", int25 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4244709) + "'", int27 == (-4244709));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        long long2 = sum0.getN();
        long long3 = sum0.getN();
        sum0.increment((double) 4244709);
        double double6 = sum0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4244709.0d + "'", double6 == 4244709.0d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double1 = secondMoment0.getResult();
        secondMoment0.clear();
        double double3 = secondMoment0.getResult();
        secondMoment0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 31L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        double double2 = org.apache.commons.math.util.MathUtils.log((-4244612.0d), (double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        mean0.clear();
        mean0.increment(515.8908245878225d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-60));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getMax();
        double double4 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getVariance();
        double double8 = summaryStatistics0.getMin();
        double double9 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean10 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean10.clear();
        double double12 = geometricMean10.getResult();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean10);
        long long14 = geometricMean10.getN();
        geometricMean10.increment((-1.1752011936438014d));
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMaxImpl();
        double double7 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getGeoMeanImpl();
        summaryStatistics0.clear();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean3 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean3.clear();
        double double5 = geometricMean3.getResult();
        summaryStatistics2.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean3);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics2.getSumImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double9 = secondMoment8.getResult();
        secondMoment8.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment8);
        summaryStatistics2.setSumImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment8);
        secondMoment8.increment(9.332621544395286E157d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        org.apache.commons.math.stat.descriptive.rank.Min min17 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long18 = min17.getN();
        min17.clear();
        double[] doubleArray25 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        double double27 = min17.evaluate(doubleArray25);
        sum16.incrementAll(doubleArray25);
        double double30 = variance15.evaluate(doubleArray25, 515.8908245878225d);
        boolean boolean31 = variance1.equals((java.lang.Object) double30);
        org.junit.Assert.assertNotNull(summaryStatistics2);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-4244709) + "'", int26 == (-4244709));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1842.2000000000116d + "'", double30 == 1842.2000000000116d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long4 = sum3.getN();
        long long5 = sum3.getN();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        sum3.clear();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs8);
        double[] doubleArray15 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        double double21 = geometricMean9.evaluate(doubleArray15, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = sum3.evaluate(doubleArray15, (-1810), 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4244709) + "'", int16 == (-4244709));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4244709) + "'", int17 == (-4244709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4244709) + "'", int18 == (-4244709));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs7);
        sumOfLogs7.increment((-1.1752011936438014d));
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean11 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs7);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double8 = summaryStatistics0.getMin();
        double double9 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics0.getSumLogImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        double double2 = org.apache.commons.math.util.MathUtils.log(1842.2000000000003d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        sum0.clear();
        sum0.clear();
        long long4 = sum0.getN();
        long long5 = sum0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(9.619275968248924E151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-7920), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7920.0d) + "'", double2 == (-7920.0d));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 101);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6535299896840334E43d + "'", double1 == 3.6535299896840334E43d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-7920), 11013.232920103324d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.summary.Sum sum3 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long4 = sum3.getN();
        long long5 = sum3.getN();
        summaryStatistics0.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum3);
        sum3.clear();
        sum3.clear();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max0.increment((double) (-4244709L));
        double double3 = max0.getResult();
        max0.clear();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4244709.0d) + "'", double3 == (-4244709.0d));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(Double.NaN);
        long long3 = sumOfSquares0.getN();
        sumOfSquares0.increment(0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min4 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long5 = min4.getN();
        double double6 = min4.getResult();
        double[] doubleArray9 = new double[] { (short) 100, (byte) 0 };
        min4.incrementAll(doubleArray9);
        variance3.incrementAll(doubleArray9);
        double double12 = secondMoment0.evaluate(doubleArray9);
        long long13 = secondMoment0.getN();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5000.0d + "'", double12 == 5000.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        min0.increment((double) (byte) 100);
        long long9 = min0.getN();
        double double10 = min0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1810), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1850) + "'", int2 == (-1850));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance1.clear();
        boolean boolean3 = variance1.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double1 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(515.8908245878225d);
        secondMoment0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        sumOfLogs0.increment((double) (-4244699.0f));
        long long4 = sumOfLogs0.getN();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray6 = new double[] { 9.619275968248924E151d, 1, 1L, (short) 10 };
        double double8 = variance1.evaluate(doubleArray6, (double) (-1860947059));
        variance1.clear();
        boolean boolean10 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        double[] doubleArray18 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        double double22 = variance1.evaluate(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[9.619275968248924E151, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3132617538332817E303d + "'", double8 == 2.3132617538332817E303d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4244709) + "'", int19 == (-4244709));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-4244709) + "'", int20 == (-4244709));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4244709) + "'", int21 == (-4244709));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1842.2000000000003d + "'", double22 == 1842.2000000000003d);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = null;
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMinImpl();
        double double9 = summaryStatistics0.getMax();
        double double10 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean12 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs11);
        boolean boolean14 = geometricMean12.equals((java.lang.Object) (-2.5663706143591725d));
        geometricMean12.increment((double) 100);
        geometricMean12.increment(6.867258771281655d);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = geometricMean12.getSumLogImpl();
        boolean boolean20 = summaryStatistics0.equals((java.lang.Object) geometricMean12);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs21 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double22 = sumOfLogs21.getResult();
        long long23 = sumOfLogs21.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean24 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long25 = mean24.getN();
        mean24.clear();
        long long27 = mean24.getN();
        double double28 = mean24.getResult();
        boolean boolean29 = sumOfLogs21.equals((java.lang.Object) mean24);
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean24);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        min0.clear();
        double double3 = min0.getResult();
        long long4 = min0.getN();
        double double5 = min0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        long long1 = max0.getN();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double2 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment1);
        double double5 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        long long8 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.rank.Min min9 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long10 = min9.getN();
        double double11 = min9.getResult();
        double[] doubleArray14 = new double[] { (short) 100, (byte) 0 };
        min9.incrementAll(doubleArray14);
        min9.increment((double) (byte) 100);
        min9.clear();
        min9.increment((double) (-4244612));
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min9);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0]");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.clear();
        boolean boolean2 = variance0.isBiasCorrected();
        variance0.clear();
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = variance0.evaluate(doubleArray9, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4244709) + "'", int10 == (-4244709));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4244709) + "'", int11 == (-4244709));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4244709) + "'", int12 == (-4244709));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = geometricMean1.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = geometricMean1.getSumLogImpl();
        long long7 = geometricMean1.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double2 = secondMoment1.getResult();
        secondMoment1.clear();
        secondMoment1.clear();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        double double7 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double9 = sumOfLogs8.getResult();
        sumOfLogs8.increment((double) (short) 1);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs8);
        double double13 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) variance15);
        summaryStatistics0.addValue((double) (byte) 10);
        double double19 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = summaryStatistics0.getSumsqImpl();
        double double21 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-1860947059));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        double double4 = summaryStatistics0.getVariance();
        double double5 = summaryStatistics0.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares7 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares7.increment((double) '4');
        long long10 = sumOfSquares7.getN();
        summaryStatistics0.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares7);
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs12 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double13 = sumOfLogs12.getResult();
        org.apache.commons.math.stat.descriptive.rank.Min min14 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long15 = min14.getN();
        double double16 = min14.getResult();
        double[] doubleArray19 = new double[] { (short) 100, (byte) 0 };
        min14.incrementAll(doubleArray19);
        sumOfLogs12.incrementAll(doubleArray19);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = sumOfSquares7.evaluate(doubleArray19, 1077936138, (-4244699));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean0.clear();
        double double2 = geometricMean0.getResult();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean4 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean4.clear();
        double double6 = geometricMean4.getResult();
        summaryStatistics3.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean4);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics3.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics3.getSummary();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs10 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        summaryStatistics3.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs10);
        sumOfLogs10.clear();
        sumOfLogs10.clear();
        geometricMean0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(summaryStatistics3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertNotNull(statisticalSummary9);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min6 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long7 = min6.getN();
        double double8 = min6.getResult();
        double[] doubleArray11 = new double[] { (short) 100, (byte) 0 };
        min6.incrementAll(doubleArray11);
        variance5.incrementAll(doubleArray11);
        double double14 = secondMoment2.evaluate(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = sumOfSquares0.evaluate(doubleArray11, 4244709, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5000.0d + "'", double14 == 5000.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        min0.increment((double) (byte) 100);
        long long9 = min0.getN();
        min0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-4244709), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4244719L) + "'", long2 == (-4244719L));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean0 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = geometricMean0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.rank.Min min4 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long5 = min4.getN();
        double double6 = min4.getResult();
        double[] doubleArray9 = new double[] { (short) 100, (byte) 0 };
        min4.incrementAll(doubleArray9);
        variance3.incrementAll(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            geometricMean0.incrementAll(doubleArray9, (-4244699), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 0.0]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        java.lang.String str1 = summaryStatistics0.toString();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getMax();
        summaryStatistics0.clear();
        double double5 = summaryStatistics0.getMin();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n" + "'", str1, "SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double8 = summaryStatistics0.getMin();
        long long9 = summaryStatistics0.getN();
        long long10 = summaryStatistics0.getN();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        double double5 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMinImpl();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        long long1 = summaryStatistics0.getN();
        double double2 = summaryStatistics0.getMax();
        double double3 = summaryStatistics0.getStandardDeviation();
        summaryStatistics0.clear();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.math.stat.descriptive.summary.Sum sum0 = new org.apache.commons.math.stat.descriptive.summary.Sum();
        long long1 = sum0.getN();
        sum0.clear();
        sum0.clear();
        long long4 = sum0.getN();
        sum0.increment((-0.0d));
        double double7 = sum0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double2 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getGeoMeanImpl();
        double double2 = summaryStatistics0.getMin();
        double double3 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        summaryStatistics0.addValue((double) 100.0f);
        double double9 = summaryStatistics0.getSum();
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic4);
        org.junit.Assert.assertNotNull(statisticalSummary5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        double double2 = mean0.getResult();
        long long3 = mean0.getN();
        double double4 = mean0.getResult();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long1 = variance0.getN();
        variance0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        boolean boolean3 = geometricMean1.equals((java.lang.Object) (-2.5663706143591725d));
        geometricMean1.increment((double) 100);
        long long6 = geometricMean1.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getGeoMeanImpl();
        double double9 = summaryStatistics7.getMin();
        double[] doubleArray15 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        boolean boolean19 = summaryStatistics7.equals((java.lang.Object) doubleArray15);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        geometricMean1.incrementAll(doubleArray15);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = geometricMean1.getSumLogImpl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(summaryStatistics7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4244709) + "'", int16 == (-4244709));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4244709) + "'", int17 == (-4244709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4244709) + "'", int18 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-4244709) + "'", int20 == (-4244709));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic22);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.math.stat.descriptive.rank.Max max0 = new org.apache.commons.math.stat.descriptive.rank.Max();
        max0.increment((double) (-4244709L));
        max0.increment((double) (-4244699));
        double double5 = max0.getResult();
        double[] doubleArray11 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        org.apache.commons.math.stat.descriptive.rank.Min min13 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long14 = min13.getN();
        double double15 = min13.getResult();
        double[] doubleArray18 = new double[] { (short) 100, (byte) 0 };
        min13.incrementAll(doubleArray18);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = max0.evaluate(doubleArray18, 4244709, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4244699.0d) + "'", double5 == (-4244699.0d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4244709) + "'", int12 == (-4244709));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long1 = mean0.getN();
        double double2 = mean0.getResult();
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        org.apache.commons.math.stat.descriptive.rank.Min min10 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long11 = min10.getN();
        double double12 = min10.getResult();
        double[] doubleArray15 = new double[] { (short) 100, (byte) 0 };
        min10.incrementAll(doubleArray15);
        boolean boolean17 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray15);
        double double18 = mean0.evaluate(doubleArray15);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        double double1 = sumOfLogs0.getResult();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean2 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = geometricMean2.evaluate(doubleArray8, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4244709) + "'", int9 == (-4244709));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = null;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        // The following exception was thrown during execution in test generation
        try {
            long long2 = geometricMean1.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        long long1 = sumOfSquares0.getN();
        sumOfSquares0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment(Double.NaN);
        sumOfSquares0.increment((double) 0.0f);
        double double5 = sumOfSquares0.getResult();
        sumOfSquares0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        sumOfLogs0.clear();
        sumOfLogs0.clear();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs0 = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumOfLogs0);
        boolean boolean3 = geometricMean1.equals((java.lang.Object) (-2.5663706143591725d));
        geometricMean1.increment((double) 100);
        long long6 = geometricMean1.getN();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getGeoMeanImpl();
        double double9 = summaryStatistics7.getMin();
        double[] doubleArray15 = new double[] { (-1.0f), (byte) 10, 10, (byte) 100, 0 };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        boolean boolean19 = summaryStatistics7.equals((java.lang.Object) doubleArray15);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        geometricMean1.incrementAll(doubleArray15);
        geometricMean1.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(summaryStatistics7);
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4244709) + "'", int16 == (-4244709));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4244709) + "'", int17 == (-4244709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4244709) + "'", int18 == (-4244709));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-4244709) + "'", int20 == (-4244709));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int int1 = org.apache.commons.math.util.MathUtils.sign(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.math.stat.descriptive.rank.Min min0 = new org.apache.commons.math.stat.descriptive.rank.Min();
        long long1 = min0.getN();
        double double2 = min0.getResult();
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0 };
        min0.incrementAll(doubleArray5);
        double[] doubleArray7 = null;
        boolean boolean8 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray7);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares0 = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
        sumOfSquares0.increment((double) '4');
        sumOfSquares0.clear();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean1 = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
        geometricMean1.clear();
        double double3 = geometricMean1.getResult();
        summaryStatistics0.setSumLogImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean1);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics0.getSumImpl();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics0.getSummary();
        summaryStatistics0.clear();
        double double8 = summaryStatistics0.getMin();
        long long9 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        double double11 = secondMoment10.getResult();
        secondMoment10.clear();
        org.apache.commons.math.stat.descriptive.moment.Mean mean13 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        double double14 = secondMoment10.getResult();
        org.apache.commons.math.stat.descriptive.moment.Mean mean15 = new org.apache.commons.math.stat.descriptive.moment.Mean((org.apache.commons.math.stat.descriptive.moment.FirstMoment) secondMoment10);
        summaryStatistics0.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) mean15);
        org.junit.Assert.assertNotNull(summaryStatistics0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(storelessUnivariateStatistic5);
        org.junit.Assert.assertNotNull(statisticalSummary6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        double double2 = org.apache.commons.math.util.MathUtils.round(1473.7600000000002d, (-285985870));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }
}

