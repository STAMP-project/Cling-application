import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) 0L);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0, 89);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        hypergeometricDistributionImpl3.setSampleSize(105);
        hypergeometricDistributionImpl3.setSampleSize(97);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, 100, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(0, 100);
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double13 = hypergeometricDistributionImpl3.probability(1.0d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(6, 30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(93);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int20 = hypergeometricDistributionImpl3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(96, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        int int24 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double28 = hypergeometricDistributionImpl3.upperCumulativeProbability(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 105 + "'", int21 == 105);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) 95);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (short) 1, (int) 'a');
        double double5 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.probability((double) 105);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0);
        double double16 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) '#', (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.probability((double) (short) -1);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 0, 30, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(97);
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        double double24 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        int int25 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(9);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 95 + "'", int9 == 95);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.probability(10);
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.probability((double) '4');
        hypergeometricDistributionImpl3.setPopulationSize(10);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 128, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setSampleSize(25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(100, 98, (int) '#');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(93);
        hypergeometricDistributionImpl3.setSampleSize(97);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistributionImpl3.setPopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: population size must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, 1, (int) (byte) 10);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double14 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double16 = hypergeometricDistributionImpl3.probability(94);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize(35);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double20 = hypergeometricDistributionImpl3.probability((-1));
        double double22 = hypergeometricDistributionImpl3.probability(100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability(105);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) 1.0f);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.probability(97);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getSampleSize();
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1, 95);
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        double double22 = hypergeometricDistributionImpl3.probability((double) 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability(100);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(97, (int) (short) -1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        int int24 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setPopulationSize(94);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double31 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100, 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(93, 128, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(6);
        double double19 = hypergeometricDistributionImpl3.probability(0.10309278350515466d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability(99, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(99, 98, (int) (byte) 10);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double16 = hypergeometricDistributionImpl3.probability(97);
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double23 = hypergeometricDistributionImpl3.upperCumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(105);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 94);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.probability((double) 98);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(8);
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double9 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) 95);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) (byte) 1);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.02999999999999997d);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100, (int) (short) 100);
        double double17 = hypergeometricDistributionImpl3.probability(32);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double17 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(26, 105);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        double double17 = hypergeometricDistributionImpl3.probability((double) 26);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 100, (double) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize(98);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int17 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistributionImpl3.setSampleSize(95);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 95 + "'", int17 == 95);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double18 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((double) 9);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        hypergeometricDistributionImpl3.setPopulationSize(94);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double18 = hypergeometricDistributionImpl3.probability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double13 = hypergeometricDistributionImpl3.probability((double) (byte) 10);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        double double18 = hypergeometricDistributionImpl3.probability(128);
        int int19 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 6, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double17 = hypergeometricDistributionImpl3.probability((double) 0L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(1, (int) '#');
        hypergeometricDistributionImpl3.setSampleSize(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.probability(35);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '4');
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double22 = hypergeometricDistributionImpl3.probability(10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability(100);
        double double15 = hypergeometricDistributionImpl3.probability(0.0d);
        double double17 = hypergeometricDistributionImpl3.probability((int) '#');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 96);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        hypergeometricDistributionImpl3.setSampleSize(8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(128, (int) '#', 26);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setPopulationSize(10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(93);
        double double22 = hypergeometricDistributionImpl3.probability(35);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 10, 1);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.probability(0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1, (double) 10L);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, 0.02999999999999997d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8999999999999996d + "'", double6 == 0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8999999999999996d + "'", double12 == 0.8999999999999996d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) '4');
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L, (double) 96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double16 = hypergeometricDistributionImpl3.probability((double) 25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(10);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        double double21 = hypergeometricDistributionImpl3.probability((double) 0L);
        double double23 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0);
        int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.02999999999999997d);
        hypergeometricDistributionImpl3.setSampleSize(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(8, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) ' ');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1L);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(1, 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize(97);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setSampleSize(0);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(32);
        int int16 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) ' ');
        hypergeometricDistributionImpl3.setSampleSize(99);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double11 = hypergeometricDistributionImpl3.probability(0);
        double double13 = hypergeometricDistributionImpl3.probability((-1.0d));
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#', (int) (byte) 100);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, 0.9699999999999995d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(0, (int) 'a');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) 'a');
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((-1));
        hypergeometricDistributionImpl3.setPopulationSize((int) ' ');
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(1, 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability((double) 105);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(93, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be non-negative.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize(98);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setPopulationSize((int) '4');
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, (int) '#');
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability(35);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 94, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        double double17 = hypergeometricDistributionImpl3.probability((double) 9);
        double double19 = hypergeometricDistributionImpl3.probability((double) 26);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(89);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(105, 99, 93);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        int int10 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0);
        java.lang.Class<?> wildcardClass11 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.probability((int) 'a');
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int18 = hypergeometricDistributionImpl3.getSampleSize();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double24 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        double double28 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability(1.0d);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.probability((int) '4');
        java.lang.Class<?> wildcardClass18 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(100);
        hypergeometricDistributionImpl3.setPopulationSize(95);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(26);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f), (double) (byte) -1);
        int int23 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(6);
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) -1);
        double double16 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 100.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(95);
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        int int21 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        hypergeometricDistributionImpl3.setSampleSize(10);
        hypergeometricDistributionImpl3.setSampleSize(93);
        int int26 = hypergeometricDistributionImpl3.getPopulationSize();
        int int27 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 105 + "'", int21 == 105);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 1.0f);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int21 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((-1), (int) ' ', 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double13 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double15 = hypergeometricDistributionImpl3.probability(10);
        int int17 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (short) 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.probability((double) 98);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(52);
        int int22 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) 'a');
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        double double12 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability(0.02999999999999997d);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double18 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double20 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(100, 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(98);
        double double15 = hypergeometricDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) 'a');
        double double12 = hypergeometricDistributionImpl3.probability((double) ' ');
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getSampleSize();
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 96 + "'", int16 == 96);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100.0f);
        hypergeometricDistributionImpl3.setPopulationSize(52);
        double double21 = hypergeometricDistributionImpl3.upperCumulativeProbability(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        int int19 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 98);
        int int21 = hypergeometricDistributionImpl3.getPopulationSize();
        int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(100);
        java.lang.Class<?> wildcardClass23 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize(1);
        int int15 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, 100.0d);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(95, 105);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, (int) (short) 10, 95);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        hypergeometricDistributionImpl3.setSampleSize(105);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int17 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(128);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) -1);
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) 0L);
        double double22 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int23 = hypergeometricDistributionImpl3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(35, 98);
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1L));
        double double24 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(99, 6, 94);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 32, 8);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double7 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability(33);
        double double11 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 35, (int) (byte) 0);
        int int4 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double11 = hypergeometricDistributionImpl3.probability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.probability(0.8999999999999996d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(98, 0, (int) (short) 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100);
        double double14 = hypergeometricDistributionImpl3.probability(10);
        int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        double double18 = hypergeometricDistributionImpl3.probability(89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int8 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((int) ' ');
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 100);
        double double11 = hypergeometricDistributionImpl3.probability((double) 97);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 0);
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability(93);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability(1.0d);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 0, (double) '#');
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 100);
        int int9 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize(95);
        double double13 = hypergeometricDistributionImpl3.probability((double) 98);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4', (int) 'a');
        hypergeometricDistributionImpl3.setSampleSize((int) '4');
        double double21 = hypergeometricDistributionImpl3.probability((double) 35);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        double double15 = hypergeometricDistributionImpl3.probability((double) (-1));
        hypergeometricDistributionImpl3.setNumberOfSuccesses(1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(8);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(52);
        hypergeometricDistributionImpl3.setSampleSize(25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.probability(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        int int9 = hypergeometricDistributionImpl3.getSampleSize();
        double double11 = hypergeometricDistributionImpl3.probability((int) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(8);
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int12 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 0L);
        int int13 = hypergeometricDistributionImpl3.getPopulationSize();
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        hypergeometricDistributionImpl3.setSampleSize(100);
        double double19 = hypergeometricDistributionImpl3.probability((double) (byte) 1);
        int int20 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setPopulationSize(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double13 = hypergeometricDistributionImpl3.probability(1.0d);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (-1));
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(100.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double13 = hypergeometricDistributionImpl3.probability((int) (byte) 100);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistributionImpl3.cumulativeProbability(52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        hypergeometricDistributionImpl3.setSampleSize(35);
        hypergeometricDistributionImpl3.setSampleSize(128);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(95);
        int int16 = hypergeometricDistributionImpl3.getPopulationSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability(128);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int12 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10, (int) ' ');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        hypergeometricDistributionImpl3.setPopulationSize((int) (short) 10);
        int int13 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int14 = hypergeometricDistributionImpl3.getPopulationSize();
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int9 = hypergeometricDistributionImpl3.getPopulationSize();
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double13 = hypergeometricDistributionImpl3.probability(32);
        double double15 = hypergeometricDistributionImpl3.probability((-1.0d));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10L);
        double double19 = hypergeometricDistributionImpl3.probability(95);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0.0f, (double) (short) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 0);
        int int15 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((int) '#');
        double double10 = hypergeometricDistributionImpl3.probability((double) (byte) 100);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(10);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(95);
        double double19 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 100);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getSampleSize();
        double double13 = hypergeometricDistributionImpl3.probability(100);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) 98);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(35);
        hypergeometricDistributionImpl3.setSampleSize(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(0, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(6, 6, (int) (byte) 0);
        double double5 = hypergeometricDistributionImpl3.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.probability((double) 100);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int15 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double17 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        double double9 = hypergeometricDistributionImpl3.probability((int) 'a');
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        int int6 = hypergeometricDistributionImpl3.getSampleSize();
        int int7 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        int int8 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double10 = hypergeometricDistributionImpl3.upperCumulativeProbability(0);
        double double12 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) ' ');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(0.10309278350515466d, (double) (byte) 10);
        int int18 = hypergeometricDistributionImpl3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 10);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 10, (double) ' ');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        int int14 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(0.9699999999999995d);
        int int17 = hypergeometricDistributionImpl3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 100);
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((-1));
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 10L);
        hypergeometricDistributionImpl3.setPopulationSize(97);
        double double21 = hypergeometricDistributionImpl3.probability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number of successes must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double13 = hypergeometricDistributionImpl3.probability((double) 10);
        double double15 = hypergeometricDistributionImpl3.probability((int) (byte) 10);
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) 100L, (double) 100);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(105);
        hypergeometricDistributionImpl3.setPopulationSize(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double10 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0L, (double) 0L);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(0);
        double double14 = hypergeometricDistributionImpl3.probability((double) 0.0f);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl((int) '4', 25, (int) (byte) 1);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        int int13 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistributionImpl3.upperCumulativeProbability(10);
        double double17 = hypergeometricDistributionImpl3.probability((double) 'a');
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 0, 98);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) '#');
        double double24 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 1);
        double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0);
        int int27 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setNumberOfSuccesses(25);
        java.lang.Class<?> wildcardClass30 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 10);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistributionImpl3.setPopulationSize(30);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double13 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 1);
        int int15 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) (short) 1);
        double double17 = hypergeometricDistributionImpl3.probability((double) 9);
        double double19 = hypergeometricDistributionImpl3.probability((double) 26);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability(89);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int9 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1.0f);
        double double11 = hypergeometricDistributionImpl3.probability((int) '4');
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        double double17 = hypergeometricDistributionImpl3.probability(0.0d);
        double double19 = hypergeometricDistributionImpl3.probability(128);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability(10);
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 10);
        int int11 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.upperCumulativeProbability(98);
        double double11 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        double double13 = hypergeometricDistributionImpl3.probability((double) 100.0f);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability((int) '4');
        java.lang.Class<?> wildcardClass16 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        double double11 = hypergeometricDistributionImpl3.cumulativeProbability((double) (short) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(98);
        double double18 = hypergeometricDistributionImpl3.cumulativeProbability((-1), (int) ' ');
        int int19 = hypergeometricDistributionImpl3.getSampleSize();
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double22 = hypergeometricDistributionImpl3.cumulativeProbability(89);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setSampleSize((int) (byte) 1);
        double double21 = hypergeometricDistributionImpl3.probability((int) 'a');
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistributionImpl3.cumulativeProbability(0.09999999999999998d, 0.8999999999999996d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 100);
        double double8 = hypergeometricDistributionImpl3.probability((int) (byte) 0);
        double double10 = hypergeometricDistributionImpl3.probability((int) (short) 100);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 1);
        double double14 = hypergeometricDistributionImpl3.probability((int) 'a');
        double double16 = hypergeometricDistributionImpl3.probability((-1));
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 0, (double) 1.0f);
        int int20 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass21 = hypergeometricDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        int int8 = hypergeometricDistributionImpl3.getPopulationSize();
        double double10 = hypergeometricDistributionImpl3.probability(100.0d);
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability((int) 'a');
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0 and 1.0 (inclusive)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(0);
        int int7 = hypergeometricDistributionImpl3.getPopulationSize();
        int int8 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize((int) (short) 1);
        double double12 = hypergeometricDistributionImpl3.probability(0.8999999999999996d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.upperCumulativeProbability(1);
        double double9 = hypergeometricDistributionImpl3.probability((int) (short) 0);
        int int11 = hypergeometricDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int12 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double14 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistributionImpl3.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (short) 0);
        double double21 = hypergeometricDistributionImpl3.cumulativeProbability((double) (byte) 0);
        hypergeometricDistributionImpl3.setPopulationSize((int) '#');
        double double25 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) 1);
        hypergeometricDistributionImpl3.setPopulationSize((int) 'a');
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 10);
        hypergeometricDistributionImpl3.setNumberOfSuccesses(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        hypergeometricDistributionImpl3.setPopulationSize(100);
        double double7 = hypergeometricDistributionImpl3.probability((int) (short) 10);
        double double9 = hypergeometricDistributionImpl3.probability((double) 1L);
        int int10 = hypergeometricDistributionImpl3.getPopulationSize();
        hypergeometricDistributionImpl3.setSampleSize(98);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d, (double) 100.0f);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 0);
        int int18 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double20 = hypergeometricDistributionImpl3.cumulativeProbability(0.9699999999999995d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(95, 32, 26);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.probability((double) (byte) -1);
        hypergeometricDistributionImpl3.setNumberOfSuccesses((int) (byte) 1);
        int int12 = hypergeometricDistributionImpl3.getSampleSize();
        hypergeometricDistributionImpl3.setSampleSize(1);
        double double16 = hypergeometricDistributionImpl3.probability((double) (short) 100);
        double double18 = hypergeometricDistributionImpl3.probability((double) 100);
        int int20 = hypergeometricDistributionImpl3.inverseCumulativeProbability((double) 1);
        double double22 = hypergeometricDistributionImpl3.upperCumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(9, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sample size must be less than or equal to population size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        hypergeometricDistributionImpl3.setPopulationSize((int) (byte) 10);
        double double14 = hypergeometricDistributionImpl3.cumulativeProbability((-1.0d), (double) 98);
        double double16 = hypergeometricDistributionImpl3.cumulativeProbability(10.0d);
        double double19 = hypergeometricDistributionImpl3.cumulativeProbability((double) 97, 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        double double5 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double7 = hypergeometricDistributionImpl3.cumulativeProbability((double) (-1.0f));
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((double) 10);
        int int10 = hypergeometricDistributionImpl3.getSampleSize();
        int int11 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double13 = hypergeometricDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = hypergeometricDistributionImpl3.cumulativeProbability(0.8999999999999996d);
        int int16 = hypergeometricDistributionImpl3.getSampleSize();
        double double18 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.distribution.HypergeometricDistributionImpl hypergeometricDistributionImpl3 = new org.apache.commons.math.distribution.HypergeometricDistributionImpl(1, 0, 0);
        int int4 = hypergeometricDistributionImpl3.getPopulationSize();
        double double6 = hypergeometricDistributionImpl3.upperCumulativeProbability((int) 'a');
        double double9 = hypergeometricDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        int int10 = hypergeometricDistributionImpl3.getNumberOfSuccesses();
        double double12 = hypergeometricDistributionImpl3.cumulativeProbability(97);
        hypergeometricDistributionImpl3.setPopulationSize(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }
}

